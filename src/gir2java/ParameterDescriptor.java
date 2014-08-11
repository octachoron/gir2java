package gir2java;

import java.util.List;

public class ParameterDescriptor {
	private String name;
	private ConvertedType type;
	
	public ParameterDescriptor(String name, ConvertedType type, boolean isInstance) {
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public ConvertedType getType() {
		return type;
	}
	
	public boolean isVarargs() {
		return (type == null);
	}
	
	public static boolean containsPointer(List<ParameterDescriptor> list) {
		for (ParameterDescriptor desc : list) {
			if (desc.getType().isPointer()) {
				return true;
			}
		}
		return false;
	}
}
