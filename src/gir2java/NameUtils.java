package gir2java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class NameUtils {
	
	public static final Set<String> keywords = new HashSet<String>(Arrays.asList(
			"abstract", "continue", "for", "new", "switch",
			"assert", "default", "goto", "package", "synchronized",
			"boolean", "do", "if", "private", "this",
			"break", "double", "implements", "protected", "throw",
			"byte", "else", "import", "public", "throws",
			"case", "enum", "instanceof", "return", "transient",
			"catch", "extends", "int", "short", "try",
			"char", "final", "interface", "static", "void",
			"class", "finally", "long", "strictfp", "volatile",
			"const", "float", "native", "super", "while"
	));
	
	public static String javaifyPackageName(String packageName) {
		return packageName.replaceAll("[^a-zA-Z0-9_]", "").toLowerCase();
	}

	public static String toCamel(String name) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == '_') {
				if (i < name.length() - 1) {
					sb.append(Character.toUpperCase(name.charAt(i+1)));
				}
				i++;
			} else if(i == 0) {
				sb.append(Character.toUpperCase(name.charAt(i)));
			} else {
				sb.append(name.charAt(i));
			}
		}
		
		return sb.toString();
	}
	
	public static String typeToNamespace(String typeName) {
		int dotIdx = typeName.indexOf('.');
		
		if (dotIdx == -1) {
			return null;
		}
		
		return typeName.substring(0, dotIdx);
	}
	
	public static String typeToSimpleName(String typeName) {
		int dotIdx = typeName.indexOf('.');
		
		if (dotIdx == -1) {
			return typeName;
		}
		
		return typeName.substring(dotIdx + 1);
	}
	
	public static int getIndirectionLevel(String cType) {
		int firstStar = cType.indexOf('*');
		if (firstStar == -1) {
			return 0;
		}
		int lastStar = cType.lastIndexOf('*');
		
		String stars = cType.substring(firstStar, lastStar + 1).trim();
		return stars.length();
	}
	
	/**
	 * If the input is a Java keyword, change it in a way that makes it legal as an identifier. If the input is not a
	 * keyword, it is returned as-is.
	 * @param input
	 * @return
	 */
	public static String neutralizeKeyword(String input) {
		if (keywords.contains(input)) {
			return "_" + input;
		} else {
			return input;
		}
	}
}
