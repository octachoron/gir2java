package gir2java;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.ParsingException;
import nu.xom.ValidityException;

public class Gir2Java {
	
	private class GirSuffixFilter implements FilenameFilter {
		@Override
		public boolean accept(File dir, String name) {
			if (name.endsWith(".gir")) {
				return true;
			} else {
				return false;
			}
		}
	}

	private GirCodebase codebase = new GirCodebase();
	
	private void usage() {
		System.err.println("Usage: " + Gir2Java.class.getSimpleName() + "girdir javadir");
		System.err.println("If girdir is a directory, all GIRs (*.gir) will be processed in it. If it is not,");
		System.err.println("only the specified GIR will be processed. Directory mode is not recursive.");
	}
	
	private void processSingleGir(File girfile) {
		System.out.println("Processing " + girfile.getAbsolutePath());
		
		Builder builder = new Builder();
		
		try {
			Document girdoc;
			girdoc = builder.build(girfile);
			codebase.addGir(girdoc);
		} catch (ValidityException e) {
			System.err.println(girfile.getAbsolutePath() + " is not valid XML");
			e.printStackTrace();
		} catch (ParsingException e) {
			System.err.println(girfile.getAbsolutePath() + " could not be parsed, for unknown reasons");
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println(girfile.getAbsolutePath() + " could not be read");
			e.printStackTrace();
		}
		
	}
	
	private void run(String[] args) {
		if (args.length != 2) {
			usage();
			System.exit(1);
		}
		
		File girdir = new File(args[0]);
		File javadir = new File(args[1]);
		
		if (girdir.isDirectory()) {
			FilenameFilter filter = new GirSuffixFilter();
			for (File file : girdir.listFiles(filter)) {
				if (!file.isDirectory()) {
					processSingleGir(file);
				}
			}
		} else {
			processSingleGir(girdir);
		}

		try {
			codebase.saveJava(javadir);
		} catch (IOException e) {
			System.err.println("Could not save Java from codebase, reason:");
			e.printStackTrace();
		}
		
		codebase.saveTypes(
				new File("found-types.txt"),
				new File("referenced-types.txt"),
				new File("undefined-types.txt")
		);
	}
	
	public static void main(String[] args) {
		new Gir2Java().run(args);
	}
	
	
}
