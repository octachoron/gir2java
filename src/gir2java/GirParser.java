package gir2java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Elements;

import org.bridj.BridJ;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;
import org.bridj.NativeObject;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
import org.bridj.util.DefaultParameterizedType;

import com.sun.codemodel.ClassType;
import com.sun.codemodel.JBlock;
import com.sun.codemodel.JClass;
import com.sun.codemodel.JClassAlreadyExistsException;
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JEnumConstant;
import com.sun.codemodel.JExpr;
import com.sun.codemodel.JFieldVar;
import com.sun.codemodel.JInvocation;
import com.sun.codemodel.JMethod;
import com.sun.codemodel.JMod;
import com.sun.codemodel.JType;
import com.sun.codemodel.JVar;

public class GirParser {

	private JCodeModel cm;
	
	private static Map<String, Method> elementParsers = new HashMap<String, Method>();
	private TypeRegistry typeRegistry = new TypeRegistry();
	private Set<String> foundTypes;
	private Set<String> referencedTypes;
	
	static {
		try {
			elementParsers.put("repository", GirParser.class.getDeclaredMethod("parseRepository", Element.class, ParsingContext.class));
			elementParsers.put("package", GirParser.class.getDeclaredMethod("parsePackage", Element.class, ParsingContext.class));
			elementParsers.put("namespace", GirParser.class.getDeclaredMethod("parseNamespace", Element.class, ParsingContext.class));
			elementParsers.put("enumeration", GirParser.class.getDeclaredMethod("parseEnumeration", Element.class, ParsingContext.class));
			elementParsers.put("member", GirParser.class.getDeclaredMethod("parseEnumMember", Element.class, ParsingContext.class));
			elementParsers.put("record", GirParser.class.getDeclaredMethod("parseRecordOrClass", Element.class, ParsingContext.class));
			elementParsers.put("class", GirParser.class.getDeclaredMethod("parseRecordOrClass", Element.class, ParsingContext.class));
			elementParsers.put("field", GirParser.class.getDeclaredMethod("parseRecordField", Element.class, ParsingContext.class));
			elementParsers.put("interface", GirParser.class.getDeclaredMethod("parseInterface", Element.class, ParsingContext.class));
			elementParsers.put("union", GirParser.class.getDeclaredMethod("parseUnion", Element.class, ParsingContext.class));
			elementParsers.put("bitfield", GirParser.class.getDeclaredMethod("parseEnumeration", Element.class, ParsingContext.class));
			elementParsers.put("alias", GirParser.class.getDeclaredMethod("parseAlias", Element.class, ParsingContext.class));
			elementParsers.put("callback", GirParser.class.getDeclaredMethod("parseCallback", Element.class, ParsingContext.class));
			elementParsers.put("function", GirParser.class.getDeclaredMethod("parseMethodOrFunction", Element.class, ParsingContext.class));
			elementParsers.put("method", GirParser.class.getDeclaredMethod("parseMethodOrFunction", Element.class, ParsingContext.class));
			elementParsers.put("return-value", GirParser.class.getDeclaredMethod("parseReturnValue", Element.class, ParsingContext.class));
			elementParsers.put("parameters", GirParser.class.getDeclaredMethod("parseParameters", Element.class, ParsingContext.class));
			elementParsers.put("parameter", GirParser.class.getDeclaredMethod("parseParameter", Element.class, ParsingContext.class));
			elementParsers.put("instance-parameter", GirParser.class.getDeclaredMethod("parseParameter", Element.class, ParsingContext.class));
			elementParsers.put("constructor", GirParser.class.getDeclaredMethod("parseMethodOrFunction", Element.class, ParsingContext.class));
			
			//Add other parser methods here
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public GirParser(JCodeModel cm) {
		this.cm = cm;
		foundTypes = new HashSet<String>();
		referencedTypes = new HashSet<String>();
		
		fillStaticTypeMappings();
	}
	
	public void outputTypes(File found, File referenced, File undefined) {
		try {
			PrintWriter pw = new PrintWriter(found);
			List<String> foundTypesList = new ArrayList<String>(foundTypes);
			Collections.sort(foundTypesList, TypeNameComparator.getInstance());
			for (String type : foundTypesList) {
				pw.println(type);
			}
			pw.close();
			
			pw = new PrintWriter(referenced);
			List<String> referencedTypesList = new ArrayList<String>(referencedTypes);
			Collections.sort(referencedTypesList, TypeNameComparator.getInstance());
			for (String type : referencedTypesList) {
				pw.println(type);
			}
			pw.close();
			
			List<String> undefinedTypesList = new ArrayList<String>(referencedTypes);
			undefinedTypesList.removeAll(foundTypes);
			Collections.sort(undefinedTypesList, TypeNameComparator.getInstance());
			pw = new PrintWriter(undefined);
			for (String type : undefinedTypesList) {
				pw.println(type);
			}
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void fillStaticTypeMappings() {
		BufferedReader staticMappings;
		try {
			staticMappings = new BufferedReader(new InputStreamReader(new FileInputStream("static-mappings")));
		} catch (FileNotFoundException e) {
			System.err.println("No static mappings file found, not using any static mappings");
			return;
		}
		
		String line;
		try {
			line = staticMappings.readLine();
			while (line != null) {
				//Skip lines containing only whitespace and/or a comment
				String preprocessedLine = line.trim().replaceFirst("#.*$", "");
				if (preprocessedLine.length() == 0) {
					line = staticMappings.readLine();
					continue;
				}
				
				StringTokenizer st = new StringTokenizer(preprocessedLine, ",");
				String typeName = st.nextToken();
				String cType = st.nextToken();
				String className = st.nextToken();
				boolean isEnum = Boolean.parseBoolean(st.nextToken());
				boolean needsUnboxing = Boolean.parseBoolean(st.nextToken());
				Class<?> javaClass;
				
				try {
					javaClass = Class.forName(className);
				} catch (ClassNotFoundException e) {
					System.err.println("Class " + className + " not found, skipping static mapping for " + typeName);
					e.printStackTrace();
					line = staticMappings.readLine();
					continue;
				}
				
				//FIXME: not necessarily everything we want to statically map goes into the global namespace
				ConvertedType ct = new ConvertedType(cm, null, typeName, cType, isEnum);
				JType jType = cm._ref(javaClass);
				if (needsUnboxing) {
					jType = jType.unboxify();
				}
				ct.setJType(jType);
				typeRegistry.registerType(ct);
				foundTypes.add(typeName);
				
				line = staticMappings.readLine();
			}
		} catch (IOException e) {
			System.err.println("Error while reading static mappings file, not using all static mappings");
			e.printStackTrace();
		}
		
		ConvertedType nullMapping = new ConvertedType(cm, null, "none", "void", false);
		nullMapping.setJType(cm._ref(void.class));
		typeRegistry.registerType(nullMapping);
		foundTypes.add("none");
	}
	
	/**
	 * Get a descriptor of the namespace defined in the given .gir Document. This assumes
	 * there is at most one such namespace.
	 * @param gir
	 * @return the namespace descriptor, or null if no namespace is defined in the document
	 */
	public NamespaceDescriptor getDefinedNamespace(Document gir) {
		Elements firstLevel = gir.getRootElement().getChildElements();
		
		for (int i = 0; i < firstLevel.size(); i++) {
			Element child = firstLevel.get(i);
			if (child.getQualifiedName().equals("namespace")) {
				String name = child.getAttributeValue("name");
				String version = child.getAttributeValue("version");
				NamespaceDescriptor ret = new NamespaceDescriptor(name, version);
				return ret;
			}
		}
		
		return null;
	}
	
	/**
	 * Get the list of namespaces included by the given .gir Document as NamespaceDescriptors.
	 * @param gir
	 * @return the list of descriptors, or an empty list if the document does not include any other namespace
	 */
	public List<NamespaceDescriptor> getIncludedNamespaces(Document gir) {
		Elements firstLevel = gir.getRootElement().getChildElements();
		List<NamespaceDescriptor> ret = new ArrayList<NamespaceDescriptor>();
		
		for (int i = 0; i < firstLevel.size(); i++) {
			Element child = firstLevel.get(i);
			if (child.getQualifiedName().equals("include")) {
				String name = child.getAttributeValue("name");
				String version = child.getAttributeValue("version");
				NamespaceDescriptor includedNs = new NamespaceDescriptor(name, version);
				ret.add(includedNs);
			}
		}
		
		return ret;
	}
	
	/**
	 * Blindly go through the XML tree depth first, and collect all name properties from type tags.
	 */
	public void findAllTypeReferences(Element root) {
		ParsingContext context = new ParsingContext(null, null, null, null);
		context.putExtra(Constants.CONTEXT_EXTRA_REFERENCED_TYPES, referencedTypes);
		context.putExtra(Constants.CONTEXT_EXTRA_TYPE_REGISTRY, typeRegistry);
		findAllTypeReferences(root, context);
	}
	
	public void findAllTypeReferences(Element root, ParsingContext context) {

		ParsingContext nextContext = context;
		
		if ("type".equals(root.getQualifiedName())) {
			//what if no name, only c:type?
			String typeName = root.getAttributeValue("name");
			if (typeName == null) {
				typeName = "(no type name)";
			}
			logReferencedType(typeName, context);
		} else if ("namespace".equals(root.getQualifiedName())){
			nextContext = context.copy();
			nextContext.putExtra(Constants.CONTEXT_EXTRA_NAMESPACE, root.getAttributeValue("name"));
		}
		
		Elements children = root.getChildElements();
		for (int i = 0; i < children.size(); i++) {
			findAllTypeReferences(children.get(i), nextContext);
		}
		
	}
	
	public void parseElement(Element root) {
		ParsingContext context = new ParsingContext("generated", cm, cm, typeRegistry);
		Set<ParsingSnapshot> toRevisit = new HashSet<ParsingSnapshot>();
		context.putExtra(Constants.CONTEXT_EXTRA_DEFINED_TYPES, foundTypes);
		context.putExtra(Constants.CONTEXT_EXTRA_SNAPSHOTS, toRevisit);
		
		parseElement(root, context);
		
		Set<ParsingSnapshot> toRevisitCopy = new HashSet<ParsingSnapshot>(toRevisit);
		for (ParsingSnapshot snapshot : toRevisitCopy) {
			System.out.println("Revisiting a snapshot");
			toRevisit.remove(snapshot);
			snapshot.getContext().putExtra(Constants.CONTEXT_EXTRA_UNDEFINED, false);
			parseElement(snapshot.getElement(), snapshot.getContext());
		}
		
		System.out.println("" + toRevisit.size() + " of " + toRevisitCopy.size() + " snapshots remain unresolved");
	}
	
	private void parseElement(Element element, ParsingContext context) {
		String elementName = (element).getQualifiedName();
		Method parser = elementParsers.get(elementName);
		if (parser == null) {
			System.out.println("No parser method for element name " + elementName + ", skipping");
		} else {
			try {
				parser.invoke(this, element, context);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	private void parseElements(Elements elements, ParsingContext context) {
		int count = elements.size();
		for (int i = 0; i < count; i++) {
			Element element = elements.get(i);
			parseElement(element, context);
		}
	}
	
	@SuppressWarnings("unused")
	private void parseRepository(Element root, ParsingContext context) {
		System.out.println("Found repository element");
		
		//Possibly parse attributes here
		
		parseElements(root.getChildElements(), context);
		
		System.out.println("Processed repository element");
	}
	
	@SuppressWarnings("unused")
	private void parsePackage(Element root, ParsingContext context) {
		
		String libName = root.getAttributeValue("name");
		String javaPackageName = NameUtils.javaifyPackageName(libName);

		/* If we have multiple package declarations, use only the first one.
		 * This is probably wrong, but one notch better than using the last one...
		 */
		if (context.getLibraryName() == null) {
			context.setLibraryName(libName);
			/*
			 * XXX: This might create confusion later on, as it modifies the current context instead of creating a new one.
			 * Even the GIR itself is confusing to me about the <package> element. This may even be completely unnecessary.
			 */
			context.appendPackage(javaPackageName);
			System.out.println("Root package becomes " + context.getCurrentPackage());
		}
	}
	
	@SuppressWarnings("unused")
	private void parseNamespace(Element root, ParsingContext context) {
		String nsName = root.getAttributeValue("name");
		String prefix = root.getAttributeValue("identifier-prefixes", Constants.GIR_XMLNS_C);
		if (prefix == null) {
			prefix = nsName;
		}
		String javaPackageName = NameUtils.javaifyPackageName(nsName);
		ParsingContext newContext = context.copy();
		
		newContext.appendPackage(javaPackageName);
		newContext.putExtra(Constants.CONTEXT_EXTRA_NAMESPACE, nsName);
		newContext.putExtra(Constants.CONTEXT_EXTRA_PREFIX, prefix);
		
		System.out.println("Namespace " + nsName + " becomes Java package " + newContext.getCurrentPackage());
		
		//If there is a shared library defined, it takes precedence over any guesswork
		String sharedLibName = root.getAttributeValue("shared-library");
		if (sharedLibName != null) {
			String strippedLibName = sharedLibName.replaceAll("lib(.*)\\.so\\..*", "$1");
			System.out.println("Turned " + sharedLibName + " to " + strippedLibName);
			context.setLibraryName(strippedLibName);
		}

		parseElements(root.getChildElements(), newContext);
	}
	
	@SuppressWarnings("unused")
	private void parseEnumeration(Element root, ParsingContext context) {
		String enumName = root.getAttributeValue("name");
		String enumCType = root.getAttributeValue("type", Constants.GIR_XMLNS_C);
		JCodeModel cm = (JCodeModel)context.getCmNode();
		
		try {
			String enumFqcn = context.getCurrentPackage() + '.' + context.getExtra(Constants.CONTEXT_EXTRA_PREFIX) + NameUtils.neutralizeKeyword(enumName);
			JDefinedClass enumClass = cm._class(enumFqcn, ClassType.ENUM);
			System.out.println("New enum: " + enumFqcn);

			Set<String> foundTypes = (Set<String>)context.getExtra(Constants.CONTEXT_EXTRA_DEFINED_TYPES);
			foundTypes.add("" + context.getExtra(Constants.CONTEXT_EXTRA_NAMESPACE) + '.' + enumName);
			
			//implements IntValuedEnum<ThisEnum>
			JClass intValuedEnumClass = context.getCm().ref(org.bridj.IntValuedEnum.class);
			JClass concreteIntValuedEnumClass = intValuedEnumClass.narrow(enumClass);
			enumClass._implements(concreteIntValuedEnumClass);
			
			//value field, public final long
			JFieldVar valueField = enumClass.field(JMod.PUBLIC | JMod.FINAL, long.class, "value");
			
			//arbitrary value constructor
			JMethod ctor = enumClass.constructor(JMod.NONE);
			JVar ctorParam = ctor.param(long.class, "value");
			JBlock ctorBody = ctor.body();
			ctorBody.assign(JExpr._this().ref(valueField), ctorParam);
			
			//value getter
			JMethod valueGetter = enumClass.method(JMod.PUBLIC, long.class, "value");
			valueGetter.body()._return(JExpr._this().ref(valueField));
			
			//iterator method
			JClass iteratorClass = cm.ref(Iterator.class).narrow(enumClass);
			JMethod iteratorMethod = enumClass.method(JMod.PUBLIC, iteratorClass, "iterator");
			JClass collectionsClass = cm.ref(Collections.class);
			JInvocation iteratorCall = collectionsClass.staticInvoke("singleton").arg(JExpr._this()).invoke("iterator");
			iteratorMethod.body()._return(iteratorCall);
			
			//fromValue method
			JMethod fromValue = enumClass.method(JMod.PUBLIC | JMod.STATIC, concreteIntValuedEnumClass, "fromValue");
			
			JVar fromValueParam = fromValue.param(int.class, "value");
			JClass flagSetClass = cm.ref(FlagSet.class);
			JInvocation fromValueCall = flagSetClass.staticInvoke("fromValue")
					.arg(fromValueParam)
					.arg(enumClass.staticInvoke("values"));
			fromValue.body()._return(fromValueCall);
			
			//enum instances
			parseElements(root.getChildElements(), context.withCmNode(enumClass));
			
			//register the type
			ConvertedType regType = new ConvertedType(
					cm,
					(String)context.getExtra(Constants.CONTEXT_EXTRA_NAMESPACE),
					enumName,
					enumCType,
					true
			);
			regType.setJType(cm.ref(IntValuedEnum.class).narrow(enumClass));
			context.registerType(regType);
			
		} catch (JClassAlreadyExistsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unused")
	private void parseEnumMember(Element root, ParsingContext context) {
		JDefinedClass enumClass = (JDefinedClass) context.getCmNode();
		
		JEnumConstant enumConstant = enumClass.enumConstant(
				NameUtils.camelToUpper(enumClass.name()) + '_' + root.getAttributeValue("name").toUpperCase()
		);
		long value = Long.parseLong(root.getAttributeValue("value"));
		enumConstant.arg(JExpr.lit(value));
		System.out.println("--> " + enumConstant.getName() + " (" + value + ")");
	}

	@SuppressWarnings("unused")
	private void parseRecordOrClass(Element root, ParsingContext context) {
		/*
		 * As far as I understand, a <record> represents a struct, and if it does not have any fields,
		 * an opaque struct. Classes have their own element, which is very similar, and also parsed here.
		 */

		JCodeModel cm = (JCodeModel) context.getCmNode();
		String name = root.getAttributeValue("name");
		String className = context.getCurrentPackage() + '.' + context.getExtra(Constants.CONTEXT_EXTRA_PREFIX) + NameUtils.neutralizeKeyword(name);
		
		Set<String> foundTypes = (Set<String>)context.getExtra(Constants.CONTEXT_EXTRA_DEFINED_TYPES);
		foundTypes.add("" + context.getExtra(Constants.CONTEXT_EXTRA_NAMESPACE) + '.' + name);
		
		JDefinedClass parsedClass;
		
		Elements children = root.getChildElements();
		//root.getChildCount() won't work because text is a child (but not an element)
		if (children.size() == 0) {
			//Opaque struct, let's do like JNAerator, and make an empty interface
			try {
				System.out.println("Opaque struct " + name + " becomes empty interface " + className);
				parsedClass = cm._class(className, ClassType.INTERFACE);
				parsedClass.javadoc().add("Opaque type");
			} catch (JClassAlreadyExistsException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return;
			}
		} else {
			//Normal struct, children are members
			try {
				System.out.println("Normal struct " + name + " becomes class " + className);
				String superclassName = root.getAttributeValue("parent");
				ConvertedType superclassConvType = null;
				if (superclassName != null) {
					superclassConvType = context.lookupType(superclassName);
					if (superclassConvType == null) {
						Set<ParsingSnapshot> snapshots =
								(Set<ParsingSnapshot>) context.getExtra(Constants.CONTEXT_EXTRA_SNAPSHOTS);
						
						snapshots.add(new ParsingSnapshot(context, root));
						return;
					}
				}
				
				parsedClass = cm._class(className);
				
				parsedClass.init().add(cm.ref(BridJ.class).staticInvoke("register"));
				
				if (superclassConvType == null) {
					parsedClass._extends(StructObject.class);
				} else {
					parsedClass._extends((JClass)superclassConvType.getJType());
					System.out.println(className + " extends " + superclassConvType);
				}
				

				//Library annotation, which the BridJ example does not use, but JNAerator does
				System.out.println("Annotating with lib name: " + context.getLibraryName());
				parsedClass.annotate(Library.class).param("value", context.getLibraryName());

				//Boilerplate constructors
				JMethod noArgCtor = parsedClass.constructor(JMod.PUBLIC);
				noArgCtor.body().directStatement("super();"); //Can super() be called without a direct statement?
				JMethod pointerArgCtor = parsedClass.constructor(JMod.PUBLIC);
				pointerArgCtor.param(Pointer.class, "pointer");
				pointerArgCtor.body().directStatement("super(pointer);");

				//Field getters and setters generated from children
				ParsingContext nextContext = context.withCmNode(parsedClass);
				nextContext.putExtra(Constants.CONTEXT_EXTRA_NEXT_FIELD_INDEX, 0);
				parseElements(root.getChildElements(), nextContext);

			} catch (JClassAlreadyExistsException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return;
			}
		}
		
		//Register the newly parsed class
		ConvertedType parsedConvType = new ConvertedType(
				context.getCm(),
				(String)context.getExtra(Constants.CONTEXT_EXTRA_NAMESPACE),
				name,
				root.getAttributeValue("type", Constants.GIR_XMLNS_C),
				parsedClass.getClassType().equals(ClassType.ENUM));
		parsedConvType.setJType(parsedClass);
		context.registerType(parsedConvType);
	}

	private void logReferencedType(String typeName, ParsingContext context) {
		//diagnostic logging
		Set<String> referencedTypes = (Set<String>)context.getExtra(Constants.CONTEXT_EXTRA_REFERENCED_TYPES);
		TypeRegistry types = (TypeRegistry)context.getExtra(Constants.CONTEXT_EXTRA_TYPE_REGISTRY);
		
		if (typeName.contains(".")) {
			//has namespace
			referencedTypes.add(typeName);
		} else {
			//no namespace, decide if it's global or not
			ConvertedType locallyDefined = types.lookupType(
					(String)context.getExtra(Constants.CONTEXT_EXTRA_NAMESPACE),
					typeName
			);
			
			if (locallyDefined == null) {
				//not defined in this namespace, this means it is global
				/* Note: this is true only if there is no gir file that uses a global type, then defines one with
				 * the same name, and expects subsequent references to be to this defined type.
				 */
				referencedTypes.add(typeName);
			} else {
				referencedTypes.add(locallyDefined.getQualifiedType());
			}
		}
	}
	
	private Element findTypeElement(Element root, ParsingContext context) {
		Elements children = root.getChildElements();
		
		for (int i = 0; i < children.size(); i++) {
			Element child = children.get(i);
			String childQualName = child.getQualifiedName();
			if (childQualName.equals("type")) {
				return child;
			}
		}
		return null;
	}
		
	private ConvertedType findSimpleType(Element root, ParsingContext context) {
		Element typeElement = findTypeElement(root, context);
		
		if (typeElement == null) {
			return null;
		}
		
		String typeName = typeElement.getAttributeValue("name");
		String typeCType = typeElement.getAttributeValue("type", Constants.GIR_XMLNS_C);
		if (typeName == null) {
			System.err.println("A type doesn't have a name in this XML snippet: " + root.toXML());
			return null;
		}
		
		ConvertedType convType = context.lookupType(typeName);
		if (convType == null) {
			//Type not yet registered, try treating it as an untyped pointer, if it is a pointer
			convType = new ConvertedType(
					context.getCm(),
					(String)context.getExtra(Constants.CONTEXT_EXTRA_NAMESPACE),
					typeElement.getAttributeValue("name"),
					typeElement.getAttributeValue("type", Constants.GIR_XMLNS_C),
					false);
			if (convType.isPointer()) {
				System.out.println("Undefined type " + convType.getType() +
						"(c:type = " + convType.getCtype() + "), treating as untyped pointer");
				convType.setJType(context.getCm().ref(Pointer.class));
			} else {
				//Not a pointer, try to still make some sense of it
				System.out.println("Undefined type " + convType.getType() +
						"(c:type = " + convType.getCtype() + "), revisiting later");
				context.putExtra(Constants.CONTEXT_EXTRA_UNDEFINED, true);
				return null;
			}
		}
		
		if (typeCType != null) {
			convType = convType.forCType(context, typeCType);
		}
		
		return convType;
	}
	
	private ConvertedType findType(Element root, ParsingContext context) {
		Elements children = root.getChildElements();
		ConvertedType convType = findSimpleType(root, context);
		
		if (convType == null) {
			int i;
			for (i = 0; i < children.size(); i++) {
				Element child = children.get(i);
				String childQualName = child.getQualifiedName();
				if (childQualName.equals("array")) {
					//found an <array>, try taking its c:type, and the name of the core type, and using that
					//to make a ConvertedType
					convType = findSimpleType(child, context);
					String arrayCType = child.getAttributeValue("type", Constants.GIR_XMLNS_C);
					if (convType != null) {
						convType = convType.forCType(context, arrayCType);
					}
					System.out.println("found an array, treating it as " + convType);
					break;
				}
			}
			
			if (i == children.size()) {
				System.out.println("Can't find type in this XML snippet: " + root.toXML());
				//callbacks, maybe others look like this
				return null;
			}
		}
		
		 else {
			System.out.println("Using mapping " + convType.getType() + " (" + convType.getCtype() + ") -> " + convType.getJType());
		}
		
		return convType;
	}
	
	@SuppressWarnings("unused")
	private void parseRecordField(Element root, ParsingContext context) {
		
		JDefinedClass record = (JDefinedClass) context.getCmNode();
		String name = "field_" + root.getAttributeValue("name");
		name = disambiguateMethodName(name, record);
		
		int fieldIdx = (int)context.getExtra(Constants.CONTEXT_EXTRA_NEXT_FIELD_INDEX);

		ConvertedType convType = findType(root, context);
		
		if (checkUndefined(root, context)) {
			return;
		}
		
		if (convType == null) {
			return;
		}
		
		String bridjType = convType.bridjMethodifyTypeName();
		JType fieldType = convType.getJType();
		
		String privateAttribute = root.getAttributeValue("private");
		int modifier = JMod.PUBLIC;
		if ("1".equals(privateAttribute)) {
			modifier = JMod.PRIVATE;
		}
		
		JMethod getter = record.method(modifier, fieldType, name);
		getter.annotate(Field.class).param("value", fieldIdx);
		getter.body().directStatement("return this.io.get" + bridjType + "Field(this, " + fieldIdx + ");");

		JMethod setter = record.method(modifier, record, name);
		setter.annotate(Field.class).param("value", fieldIdx);
		setter.param(fieldType, name);
		setter.body().directStatement("this.io.set" + bridjType + "Field(this, " + fieldIdx + ", " + name + ");");
		setter.body()._return(JExpr._this());
		
		context.putExtra(Constants.CONTEXT_EXTRA_NEXT_FIELD_INDEX, fieldIdx + 1); //same context object used for all fields
	}
	
	@SuppressWarnings("unused")
	private void parseReturnValue(Element root, ParsingContext context) {
		/* Put the result into the context, using it therefore to pass something *up* the tree. This might create
		 * confusion, but we definitely need the return type before declaring a method...
		 */
		ConvertedType convType = findType(root, context);
		context.putExtra(Constants.CONTEXT_EXTRA_RETURN_TYPE, convType);
	}
	
	@SuppressWarnings("unused")
	private void parseParameters(Element root, ParsingContext context) {
		//This list is also passed *up* the tree through the context besides passing down...
		List<ParameterDescriptor> parametersList = new ArrayList<ParameterDescriptor>();
		context.putExtra(Constants.CONTEXT_EXTRA_PARAM_TYPES, parametersList);
		
		parseElements(root.getChildElements(), context);
	}
	
	@SuppressWarnings("unused")
	private void parseParameter(Element root, ParsingContext context) {
		boolean isInstance = root.getQualifiedName().equals("instance-parameter");
		List<ParameterDescriptor> parametersList = (List<ParameterDescriptor>) context.getExtra(Constants.CONTEXT_EXTRA_PARAM_TYPES);
		String paramName = NameUtils.neutralizeKeyword(root.getAttributeValue("name"));
		ConvertedType convType = findType(root, context);
		parametersList.add(new ParameterDescriptor(paramName, convType, isInstance));
	}
	
	private boolean checkUndefined(Element root, ParsingContext context) {
		Boolean undefined = (Boolean)context.getExtra(Constants.CONTEXT_EXTRA_UNDEFINED);
		if ( (undefined != null) && undefined ) {
			Set<ParsingSnapshot> snapshots = (Set<ParsingSnapshot>) context.getExtra(Constants.CONTEXT_EXTRA_SNAPSHOTS);
			snapshots.add(new ParsingSnapshot(context, root));
			return true;
		}
		
		return false;
	}
	
	private boolean checkStructByValue(ConvertedType returnType, List<ParameterDescriptor> parametersList) {
		if (returnType.isStructByValue()) {
			System.out.println("Struct by value found as return type: " + returnType.toString());
			return true;
		}
		
		int i = 0;
		if (parametersList != null) {
			for (ParameterDescriptor param : parametersList) {
				if ((param.getType()) != null && param.getType().isStructByValue()) {
					System.out.println("Struct by value found as parameter no. " + i + ":" + param.getType());
					return true;
				}
				i++;
			}
		}
		
		return false;
	}
	
	private String disambiguateMethodName(String name, JClass enclosing) {
		JClass jClass = enclosing;

		//First look up to the uppermost generated class
		while (jClass instanceof JDefinedClass) {
			JDefinedClass definedClass = (JDefinedClass) jClass;
			
			Collection<JMethod> methods = definedClass.methods();
			for (JMethod method : methods) {
				if (method.name().equals(name)) {
					return enclosing.name().toLowerCase() + "_" + name;
				}
			}
			
			jClass = jClass._extends();
		}
		
		//Next, check previously defined classes (StructObject, Object, ...)
		try {
			Class<?> klass = Class.forName(jClass.fullName());
			while (klass != null) {
				for (Method method : klass.getDeclaredMethods()) {
					if ( ( !Modifier.isPrivate(method.getModifiers()) ) && method.getName().equals(name)) {
						return enclosing.name().toLowerCase() + "_" + name;
					}
				}
				klass = klass.getSuperclass();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return name;
		}
		
		return name;
	}
	
	@SuppressWarnings("unused")
	private void parseMethodOrFunction(Element root, ParsingContext context) {
		ParsingContext nextContext = context.copy();
		
		String name = root.getAttributeValue("name");
		String nativeName = root.getAttributeValue("identifier", Constants.GIR_XMLNS_C);
		Object cmNode = nextContext.getCmNode();
		
		JDefinedClass enclosing;
		if (cmNode instanceof JDefinedClass) {
			enclosing = (JDefinedClass) cmNode;
		} else {
			enclosing = context.getCurrentNamespaceClass();
		}
		
		parseElements(root.getChildElements(), nextContext);
		/* The context should now have the return type, and parameter list.
		 * If one of these is a Pointer<Anything>, wrap, if not, then native method only
		 */
		
		ConvertedType returnType = (ConvertedType) nextContext.getExtra(Constants.CONTEXT_EXTRA_RETURN_TYPE);
		List<ParameterDescriptor> parametersList = (List<ParameterDescriptor>) nextContext.getExtra(Constants.CONTEXT_EXTRA_PARAM_TYPES);
		
		if (checkUndefined(root, nextContext)) {
			return;
		}
		
		if (checkStructByValue(returnType, parametersList)) {
			System.out.println("Skipped " + nativeName + "() because it takes or returns struct by value");
			return;
		}
		
		boolean returnsPointer = returnType.isPointer();
		boolean takesPointer = false;
		
		if (parametersList != null) {
			for (ParameterDescriptor paramDesc : parametersList) {
				if ((paramDesc.getType()) != null && paramDesc.getType().isPointer()) {
					takesPointer = true;
					break;
				}
			}
		}		
		
		int nativeVisibility = (returnsPointer || takesPointer) ? JMod.PROTECTED : JMod.PUBLIC;
		int staticModifier = ParameterDescriptor.containsInstanceParameter(parametersList) ? 0 : JMod.STATIC;
		int nativeModifiers = nativeVisibility | staticModifier | JMod.NATIVE;
		
		JMethod nativeMethod;
		if (returnsPointer) {
			nativeMethod = enclosing.method(nativeModifiers | JMod.NATIVE, long.class, nativeName);
			nativeMethod.annotate(Ptr.class);
		} else {
			nativeMethod = enclosing.method(nativeModifiers | JMod.NATIVE, returnType.getJType(), nativeName);
		}
		
		if (parametersList != null) { //null if the function has no arguments
			for (ParameterDescriptor paramDesc : parametersList) {
				if (paramDesc.isVarargs()) {
					nativeMethod.varParam(Object.class, "varargs");
				} else if (paramDesc.getType().isPointer()) {
					JType paramJType = nextContext.getCm()._ref(long.class);
					JVar param = nativeMethod.param(paramJType, paramDesc.getName());
					param.annotate(Ptr.class);
				} else {
					//primitives only?
					nativeMethod.param(paramDesc.getType().getJType(), paramDesc.getName());
				}
			}
		}
		
		//nativeMethod.javadoc().add(root.toXML());
		
		//if there was any Pointer<Anything> replaced above, here comes a pretty wrapper that wraps/unwraps between @Ptr long and Pointer<Anything>
		if (takesPointer || returnsPointer) {
			if ("".equals(name)) {
				name = nativeName;
			}
			name = NameUtils.neutralizeKeyword(name);
			name = disambiguateMethodName(name, enclosing);
			
			JMethod wrapper = enclosing.method(JMod.PUBLIC | staticModifier, returnType.getJType(), name);
			
			JInvocation nativeCall;
			if (staticModifier == 0) {
				nativeCall = JExpr._this().invoke(nativeMethod);
			} else {
				nativeCall = enclosing.staticInvoke(nativeMethod);
			}
			if (parametersList != null) {
				for (ParameterDescriptor paramDesc : parametersList) {
					if (paramDesc.isInstance()) {
						//pass a pointer to this
						nativeCall.arg(
								nextContext
									.getCm()
									.ref(Pointer.class)
									.staticInvoke("pointerTo")
									.arg(JExpr._this())
									.arg(enclosing.dotclass())
									.invoke("getPeer")
						);
					} else if (paramDesc.isVarargs()) {
						JVar param = wrapper.varParam(Object.class, "varargs");
						nativeCall.arg(param);
					} else if (paramDesc.getType().isPointer()) {
						JVar param = wrapper.param(paramDesc.getType().getJType(), paramDesc.getName());
						nativeCall.arg(context.getCm().ref(Pointer.class).staticInvoke("getPeer").arg(param));
					} else {
						JVar param = wrapper.param(paramDesc.getType().getJType(), paramDesc.getName());
						nativeCall.arg(param);
					}
				}
			}
			
			if (returnsPointer) {
				// Pointer.pointerToAddress(native(...), ReturnType.class)
				ConvertedType returnConvType = returnType.forCType(nextContext, returnType.getCtype());
				JClass returnClass = (JClass)returnConvType.getJType();
				
				JInvocation pointerToAddressCall =
					context
						.getCm()
						.ref(Pointer.class)
						.staticInvoke("pointerToAddress")
						.arg(nativeCall);
				
				if (returnClass.isParameterized()) {
					JClass parameter = returnClass.getTypeParameters().get(0);
					if (parameter.isParameterized()) {
						JInvocation paramTypeCall = context
							.getCm()
							.ref(DefaultParameterizedType.class)
							.staticInvoke("paramType")
							.arg(parameter.dotclass())
							.arg( parameter.getTypeParameters().get(0).dotclass() );
						
						pointerToAddressCall.arg(paramTypeCall);
					} else {
						pointerToAddressCall.arg(parameter.dotclass());
					}
				}
				
				wrapper.body()._return(pointerToAddressCall);
			} else if ( "void".equals(returnType.getCtype()) ) {
				wrapper.body().add(nativeCall);
			} else {
				wrapper.body()._return(nativeCall);
			}
		}
		
	}
	
	@SuppressWarnings("unused")
	private void parseInterface(Element root, ParsingContext context) {
		// only log the fact that we have found this type for now
		String name = root.getAttributeValue("name");
		Set<String> foundTypes = (Set<String>)context.getExtra(Constants.CONTEXT_EXTRA_DEFINED_TYPES);
		foundTypes.add("" + context.getExtra(Constants.CONTEXT_EXTRA_NAMESPACE) + '.' + name);
		ConvertedType convType = new ConvertedType(
				context.getCm(),
				(String)context.getExtra(Constants.CONTEXT_EXTRA_NAMESPACE),
				name,
				root.getAttributeValue("type",Constants.GIR_XMLNS_C),
				false
		);
		convType.setJType(context.getCm().ref(Object.class));
		context.registerType(convType);
	}
	
	@SuppressWarnings("unused")
	private void parseUnion(Element root, ParsingContext context) {
		// only log the fact that we have found this type for now
		String name = root.getAttributeValue("name");
		Set<String> foundTypes = (Set<String>)context.getExtra(Constants.CONTEXT_EXTRA_DEFINED_TYPES);
		foundTypes.add("" + context.getExtra(Constants.CONTEXT_EXTRA_NAMESPACE) + '.' + name);
		ConvertedType convType = new ConvertedType(
				context.getCm(),
				(String)context.getExtra(Constants.CONTEXT_EXTRA_NAMESPACE),
				name,
				root.getAttributeValue("type",Constants.GIR_XMLNS_C),
				false
		);
		convType.setJType(context.getCm().ref(NativeObject.class));
		context.registerType(convType);
	}
	
	@SuppressWarnings("unused")
	private void parseAlias(Element root, ParsingContext context) {
		//Note: this seems to be the equivalent of a C typedef
		String name = root.getAttributeValue("name");
		Set<String> foundTypes = (Set<String>)context.getExtra(Constants.CONTEXT_EXTRA_DEFINED_TYPES);
		foundTypes.add("" + context.getExtra(Constants.CONTEXT_EXTRA_NAMESPACE) + '.' + name);
		
		ConvertedType referred = findType(root, context);
		context.registerTypeAs(referred, (String)context.getExtra(Constants.CONTEXT_EXTRA_NAMESPACE), name);
	}
	
	@SuppressWarnings("unused")
	private void parseCallback(Element root, ParsingContext context) {
		// only log the fact that we have found this type for now
		//Note: I expect never getting here from an anonymous callback type for now
		String name = root.getAttributeValue("name");
		Set<String> foundTypes = (Set<String>)context.getExtra(Constants.CONTEXT_EXTRA_DEFINED_TYPES);
		foundTypes.add("" + context.getExtra(Constants.CONTEXT_EXTRA_NAMESPACE) + '.' + name);
		ConvertedType convType = new ConvertedType(
				context.getCm(),
				(String)context.getExtra(Constants.CONTEXT_EXTRA_NAMESPACE),
				name,
				root.getAttributeValue("type",Constants.GIR_XMLNS_C),
				false
		);
		convType.setJType(context.getCm().ref(Pointer.class));
		context.registerType(convType);
	}
}
