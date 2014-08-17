package gir2java;

import java.util.HashMap;
import java.util.Map;

import org.bridj.BridJ;
import org.bridj.ann.Library;

import com.sun.codemodel.JClassAlreadyExistsException;
import com.sun.codemodel.JDefinedClass;

/**
 * Manages a store of converted types in a two level way to make looking up types in multiple namespaces easier.
 * @author relek
 *
 */
public class TypeRegistry {
	
	Map<String, Map<String, ConvertedType>> store = new HashMap<String, Map<String, ConvertedType>>();
	Map<String, JDefinedClass> namespaceClasses = new HashMap<String, JDefinedClass>();
	
	public void registerType(ConvertedType type) {
		registerTypeAs(type, type.getNamespace(), type.getType());
	}
	
	public void registerTypeAs(ConvertedType type, String namespace, String name) {
		Map<String, ConvertedType> nsStore = store.get(namespace);
		
		if (nsStore == null) {
			nsStore = new HashMap<String, ConvertedType>();
			store.put(namespace, nsStore);
		}
		
		nsStore.put(name, type);
	}
	
	/**
	 * Look up the type with the given name from the given namespace.
	 * @param namespace The namespace to use, or null for the global namespace
	 * @param name The type name to use
	 * @return The registered type, or null, if no such type has been registered
	 */
	public ConvertedType lookupType(String namespace, String name) {
		Map<String, ConvertedType> nsStore = store.get(namespace);
		
		if (nsStore == null) {
			return null;
		}
		
		return nsStore.get(name);
	}
	
	public ConvertedType lookupQualifiedType(String qualifiedName, ParsingContext context) {
		
		if (qualifiedName == null) {
			return null;
		}
		
		String typeNamespace = NameUtils.typeToNamespace(qualifiedName);
		String typeSimpleName = NameUtils.typeToSimpleName(qualifiedName);
		
		ConvertedType convType = null;
		if (typeNamespace == null) {
			//if no namespace given, look first in this namespace
			convType = context.lookupType((String)context.getExtra(Constants.CONTEXT_EXTRA_NAMESPACE), typeSimpleName);
		}
		
		if (convType == null) {
			/* A namespace was given, or the type was not found in this namespace.
			 * This will look in the given namespace, or the global one, respectively.
			 */
			
			convType = context.lookupType(typeNamespace, typeSimpleName);
		}
		
		return convType; //will be null if type not registered
	}
	
	public JDefinedClass getNamespaceClass(String namespace, ParsingContext context) {
		if (namespace == null) {
			return null;
		}
		
		JDefinedClass ret = namespaceClasses.get(namespace);
		if (ret == null) {
			try {
				ret = context.getCm()._class("generated." + namespace);
				ret.init().add(context.getCm().ref(BridJ.class).staticInvoke("register"));
				Map<String, String> nsToLib =
						(Map<String, String>) context.getExtra(Constants.CONTEXT_EXTRA_NAMESPACE_TO_LIB);
				String libName = nsToLib.get(namespace);
				if (libName != null) {
					ret.annotate(Library.class).param("value", libName);
				}
				namespaceClasses.put(namespace, ret);
			} catch (JClassAlreadyExistsException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return ret;
	}
}
