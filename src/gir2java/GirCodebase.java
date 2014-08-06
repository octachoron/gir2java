package gir2java;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
	private List<Document> girs;
	
	public GirCodebase() {
		cm = new JCodeModel();
		parser = new GirParser(cm);
		girs = new ArrayList<Document>();
	}
	
	public void addGir(Document gir) {
		girs.add(gir);
	}
	
	public void saveJava(File javadir) throws IOException {
		for (Document gir : girs) {
			parser.parseElement(gir.getRootElement());
		}
		cm.build(javadir);
	}
	
	public void saveTypes(File found, File referenced) {
		parser.outputTypes(found, referenced);
	}

}
