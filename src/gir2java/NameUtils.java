package gir2java;

public class NameUtils {
	
	public static String javaifyPackageName(String packageName) {
		return packageName.replaceAll("[^a-zA-Z0-9_]", "").toLowerCase();
	}
}
