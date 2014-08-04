package gir2java;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import nu.xom.Document;

import com.sun.codemodel.JCodeModel;


/**
 * The core class of gir2java. Responsible for traversing the XOM tree of GIR XML documents, and building a
 * CodeModel AST from them. There is one GirCodebase for all GIR XMLs you want to generate a common Java
 * codebase for. The general correct usage is something like
 * 
 * <pre><code>
 * Document doc = getGirFromSomewhere();
 * GirCodebase cb = new GirCodebase();
 * cb.addGir(doc);
 * cb.addGir(someOtherDoc);
 * cb.saveJava(javadir);
 * </code></pre>
 * 
 * @author relek
 *
 */
public class GirCodebase {
	
	private JCodeModel cm;
	private GirParser parser;
	
	public GirCodebase() {
		cm = new JCodeModel();
		parser = new GirParser(cm);
	}
	
	public void addGir(Document gir) {
		parser.parseElement(gir.getRootElement());
	}
	
	public void saveJava(File javadir) throws IOException {
		cm.build(javadir);
	}
	
	public void saveTypes(File found, File referenced) {
		parser.outputTypes(found, referenced);
	}

}
