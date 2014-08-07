package gir2java;

import java.util.Comparator;

public class TypeNameComparator implements Comparator<String> {

	private static TypeNameComparator instance = new TypeNameComparator();
	
	private TypeNameComparator() {
		// empty on purpose
	}
	
	public static TypeNameComparator getInstance() {
		return instance;
	}
	
	@Override
	public int compare(String o1, String o2) {
		if (o1.contains(".") && !o2.contains(".")) {
			return 1;
		} else if (!o1.contains(".") && o2.contains(".")) {
			return -1;
		} else {
			return o1.compareTo(o2);
		}
	}
	
}
