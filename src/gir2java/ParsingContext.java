package gir2java;

import com.sun.codemodel.JCodeModel;

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
	
	public ParsingContext(String currentPackage, JCodeModel cm, Object cmNode) {
		this.currentPackage = currentPackage;
		this.cm = cm;
		this.cmNode = cmNode;
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
	
	public ParsingContext copy() {
		ParsingContext newContext = new ParsingContext(currentPackage, cm, cmNode);
		newContext.setLibraryName(getLibraryName());
		return newContext;
	}
	
	public ParsingContext withCmNode(Object newCmNode) {
		ParsingContext newContext = new ParsingContext(currentPackage, cm, newCmNode);
		newContext.setLibraryName(getLibraryName());
		return newContext;
	}
}
