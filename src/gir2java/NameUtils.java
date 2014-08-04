package gir2java;


public class NameUtils {
	
	
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
}
