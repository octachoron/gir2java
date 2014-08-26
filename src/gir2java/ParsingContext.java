package gir2java;

import java.util.HashMap;
import java.util.Map;

import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JDefinedClass;

/**
 * Provides information about context influenced by previously parsed bits. Passed between parsing
 * methods. The primary use of a ParsingContext is to maintain the name of the current package, and
 * the JCodeModel node to add children to.
 * @author relek
 *
 */
public class ParsingContext {
	private String currentPackage;
	private Object cmNode;
	private JCodeModel cm;
	private String libraryName;
	private TypeRegistry types;
	private Map<String, Object> extras = new HashMap<String, Object>();
	
	public ParsingContext(String currentPackage, JCodeModel cm, Object cmNode, TypeRegistry types) {
		this.currentPackage = currentPackage;
		this.cm = cm;
		this.cmNode = cmNode;
		this.types = types;
	}

	public String getCurrentPackage() {
		return currentPackage;
	}

	public Object getCmNode() {
		return cmNode;
	}
	
	public JCodeModel getCm() {
		return cm;
	}
	
	public String getLibraryName() {
		return libraryName;
	}

	public void setLibraryName(String name) {
		this.libraryName = name;
	}

	public void appendPackage(String name) {
		currentPackage = currentPackage + '.' + name;
	}
	
	public void registerType(ConvertedType type) {
		types.registerType(type);
	}
	
	public void registerTypeAs(ConvertedType type, String namespace, String name) {
		types.registerTypeAs(type, namespace, name);
	}
	
	public ConvertedType lookupType(String namespace, String name) {
		return types.lookupType(namespace, name);
	}
	
	public ConvertedType lookupType(String qualifiedType) {
		return types.lookupQualifiedType(qualifiedType, this);
	}
	
	public JDefinedClass getCurrentNamespaceClass() {
		return types.getNamespaceClass((String)getExtra(Constants.CONTEXT_EXTRA_NAMESPACE), this);
	}
	
	public String applyTypedefs(String ctype) {
		return types.applyTypedefs(ctype);
	}
	
	public Object getExtra(String key) {
		return extras.get(key);
	}

	public void putExtra(String key, Object value) {
		extras.put(key, value);
	}
	
	public ParsingContext copy() {
		ParsingContext newContext = new ParsingContext(currentPackage, cm, cmNode, types);
		newContext.setLibraryName(getLibraryName());
		newContext.extras.putAll(this.extras);
		return newContext;
	}
	
	public ParsingContext withCmNode(Object newCmNode) {
		ParsingContext newContext = new ParsingContext(currentPackage, cm, newCmNode, types);
		newContext.setLibraryName(getLibraryName());
		newContext.extras.putAll(this.extras);
		return newContext;
	}
}
