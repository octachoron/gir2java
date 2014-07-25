package gir2java;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import nu.xom.Element;
import nu.xom.Elements;

import org.bridj.FlagSet;
import org.bridj.Pointer;
import org.bridj.StructObject;
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
import com.sun.codemodel.JVar;

public class GirParser {

	private JCodeModel cm;
	
	private static Map<String, Method> elementParsers = new HashMap<String, Method>();
	
	static {
		try {
			elementParsers.put("repository", GirParser.class.getDeclaredMethod("parseRepository", Element.class, ParsingContext.class));
			elementParsers.put("package", GirParser.class.getDeclaredMethod("parsePackage", Element.class, ParsingContext.class));
			elementParsers.put("namespace", GirParser.class.getDeclaredMethod("parseNamespace", Element.class, ParsingContext.class));
			elementParsers.put("enumeration", GirParser.class.getDeclaredMethod("parseEnumeration", Element.class, ParsingContext.class));
			elementParsers.put("member", GirParser.class.getDeclaredMethod("parseEnumMember", Element.class, ParsingContext.class));
			elementParsers.put("record", GirParser.class.getDeclaredMethod("parseRecord", Element.class, ParsingContext.class));
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
	}
	
	public void parseElement(Element root) {
		ParsingContext context = new ParsingContext("generated", cm, cm);
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
		JCodeModel cm = (JCodeModel)context.getCmNode();
		
		try {
			String enumFqcn = context.getCurrentPackage() + '.' + enumName;
			JDefinedClass enumClass = cm._class(enumFqcn, ClassType.ENUM);
			System.out.println("New enum: " + enumFqcn);
			
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
	private void parseRecord(Element root, ParsingContext context) {
		/*
		 * As far as I understand, a <record> represents a struct, and if it does not have any fields,
		 * an opaque struct. Classes have their own element.
		 *
		 * As a first thought, assume the above is correct.
		 */

		JCodeModel cm = (JCodeModel) context.getCmNode();
		String name = root.getAttributeValue("name");
		String className = context.getCurrentPackage() + '.' + name;

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
				structClass._extends(StructObject.class);

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
				//TODO

			} catch (JClassAlreadyExistsException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
