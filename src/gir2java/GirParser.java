package gir2java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

import nu.xom.Element;
import nu.xom.Elements;

import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;
import org.bridj.NativeObject;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

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
		//fillStaticTypeMappings();
		
		foundTypes = new HashSet<String>();
		referencedTypes = new HashSet<String>();
	}
	
	public void outputTypes(File found, File referenced) {
		try {
			PrintWriter pw = new PrintWriter(found);
			for (String type : foundTypes) {
				pw.println(type);
			}
			pw.close();
			
			pw = new PrintWriter(referenced);
			for (String type : referencedTypes) {
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
				
				line = staticMappings.readLine();
			}
		} catch (IOException e) {
			System.err.println("Error while reading static mappings file, not using all static mappings");
			e.printStackTrace();
		}
		
	}
	
	public void parseElement(Element root) {
		ParsingContext context = new ParsingContext("generated", cm, cm, typeRegistry);
		context.putExtra("found-types", foundTypes);
		context.putExtra("referenced-types", referencedTypes);
		
		parseElement(root, context);
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
		String javaPackageName = NameUtils.javaifyPackageName(nsName);
		ParsingContext newContext = context.copy();
		
		newContext.appendPackage(javaPackageName);
		newContext.putExtra("namespace", nsName);
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
		String enumCType = root.getAttributeValue("type", "http://www.gtk.org/introspection/c/1.0");
		JCodeModel cm = (JCodeModel)context.getCmNode();
		
		try {
			String enumFqcn = context.getCurrentPackage() + '.' + enumName;
			JDefinedClass enumClass = cm._class(enumFqcn, ClassType.ENUM);
			System.out.println("New enum: " + enumFqcn);

			Set<String> foundTypes = (Set<String>)context.getExtra("found-types");
			foundTypes.add("" + context.getExtra("namespace") + '.' + enumName);
			
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
			/* 
			 * XXX: This parameter is an int in the BridJ type mapping doc. This seems to be incorrect,
			 * as this method accepts one or more ORed values, and these values are longs. 
			 */
			JVar fromValueParam = fromValue.param(long.class, "value");
			JClass flagSetClass = cm.ref(FlagSet.class);
			JInvocation fromValueCall = flagSetClass.staticInvoke("fromValue")
					.arg(fromValueParam)
					.arg(JExpr._this().invoke("values"));
			fromValue.body()._return(fromValueCall);
			
			//enum instances
			parseElements(root.getChildElements(), context.withCmNode(enumClass));
			
			//register the type
			ConvertedType regType = new ConvertedType(cm, (String)context.getExtra("namespace"), enumName, enumCType, true);
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
		
		JEnumConstant enumConstant = enumClass.enumConstant(root.getAttributeValue("name").toUpperCase());
		long value = Long.parseLong(root.getAttributeValue("value"));
		enumConstant.arg(JExpr.lit(value));
		System.out.println("--> " + enumConstant.getName() + " (" + value + ")");
	}

	@SuppressWarnings("unused")
	private void parseRecordOrClass(Element root, ParsingContext context) {
		/*
		 * As far as I understand, a <record> represents a struct, and if it does not have any fields,
		 * an opaque struct. Classes have their own element.
		 *
		 * As a first thought, assume the above is correct.
		 */

		JCodeModel cm = (JCodeModel) context.getCmNode();
		String name = root.getAttributeValue("name");
		String className = context.getCurrentPackage() + '.' + name;
		
		Set<String> foundTypes = (Set<String>)context.getExtra("found-types");
		foundTypes.add("" + context.getExtra("namespace") + '.' + name);
		

		Elements children = root.getChildElements();
		//root.getChildCount() won't work because text is a child (but not an element)
		if (children.size() == 0) {
			//Opaque struct, let's do like JNAerator, and make an empty interface
			try {
				System.out.println("Opaque struct " + name + " becomes empty interface " + className);
				JDefinedClass iface = cm._class(className, ClassType.INTERFACE);
				iface.javadoc().add("Opaque type");
			} catch (JClassAlreadyExistsException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			//Normal struct, children are members
			try {
				System.out.println("Normal struct " + name + " becomes class " + className);
				JDefinedClass structClass = cm._class(className);
				
				String superclassName = root.getAttributeValue("parent");
				ConvertedType superclassConvType = context.lookupType(superclassName);
				if (superclassConvType == null) {
					structClass._extends(StructObject.class);
				} else {
					structClass._extends((JClass)superclassConvType.getJType());
					System.out.println("className extends " + superclassConvType.getType() + " " + superclassConvType.getCtype() + " " + superclassConvType.getJType());
				}
				

				//Library annotation, which the BridJ example does not use, but JNAerator does
				System.out.println("Annotating with lib name: " + context.getLibraryName());
				structClass.annotate(Library.class).param("value", context.getLibraryName());

				//Boilerplate constructors
				JMethod noArgCtor = structClass.constructor(JMod.PUBLIC);
				noArgCtor.body().directStatement("super();"); //Can super() be called without a direct statement?
				JMethod pointerArgCtor = structClass.constructor(JMod.PUBLIC);
				pointerArgCtor.param(Pointer.class, "pointer");
				pointerArgCtor.body().directStatement("super(pointer);");

				//Field getters and setters generated from children
				ParsingContext nextContext = context.withCmNode(structClass);
				nextContext.putExtra("nextFieldIdx", 0);
				parseElements(root.getChildElements(), nextContext);

			} catch (JClassAlreadyExistsException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private Element findType(Elements children) {
		for (int i = 0; i < children.size(); i++) {
			Element child = children.get(i);
			if (child.getQualifiedName().equals("type")) {
				return child;
			}
		}
		
		return null;
	}
	
	@SuppressWarnings("unused")
	private void parseRecordField(Element root, ParsingContext context) {
		JDefinedClass record = (JDefinedClass) context.getCmNode();
		String name = root.getAttributeValue("name");
		
		int fieldIdx = (int)context.getExtra("nextFieldIdx"); //TODO: constant

		Element typeElement = findType(root.getChildElements());
		if (typeElement == null) {
			System.out.println("Record field has no type, skipping: " + root.toXML());
			//arrays, callbacks, maybe others look like this
			return;
		}
		
		String typeName = typeElement.getAttributeValue("name");
		
		//diagnostic logging
		Set<String> referencedTypes = (Set<String>)context.getExtra("referenced-types");
		if (typeName.contains(".") || ( (!typeName.matches("^[A-Z].*$")) && (!typeName.contains(".")) ) ) {
			referencedTypes.add(typeName);
		} else {
			referencedTypes.add("" + context.getExtra("namespace") + '.' + typeName);
		}
		
		ConvertedType convType = context.lookupType(typeName);
		
		if (convType == null) {
			//Type not yet registered, try registering it as an untyped pointer, if it is a pointer
			convType = new ConvertedType(
					context.getCm(),
					(String)context.getExtra("namespace"),
					typeElement.getAttributeValue("name"),
					typeElement.getAttributeValue("type", "http://www.gtk.org/introspection/c/1.0"),
					false);
			if (convType.isPointer()) {
				System.out.println("Undefined type " + convType.getType() +
						"(c:type = " + convType.getCtype() + "), treating as untyped pointer");
				convType.setJType(context.getCm().ref(Pointer.class));
				context.registerType(convType);
			} else {
				//Not a pointer, try to still make some sense of it
				System.out.println("Undefined type " + convType.getType() +
						"(c:type = " + convType.getCtype() + "), treating as NativeObject");
				convType.setJType(context.getCm().ref(NativeObject.class));
				context.registerType(convType);
			}
		} else {
			System.out.println("Using mapping " + convType.getType() + " (" + convType.getCtype() + ") -> " + convType.getJType());
		}
		
		String bridjType = convType.bridjMethodifyTypeName();
		JType fieldType = convType.getJType();
		
		JMethod getter = record.method(JMod.PUBLIC, fieldType, name);
		getter.annotate(Field.class).param("value", fieldIdx);
		getter.body().directStatement("return this.io.get" + bridjType + "Field(this, " + fieldIdx + ");");

		JMethod setter = record.method(JMod.PUBLIC, record, name);
		setter.annotate(Field.class).param("value", fieldIdx);
		setter.param(fieldType, name);
		setter.body().directStatement("this.io.set" + bridjType + "Field(this, " + fieldIdx + ", " + name + ");");
		setter.body()._return(JExpr._this());
		
		context.putExtra("nextFieldIdx", fieldIdx + 1); //same context object used for all fields
	}
}
