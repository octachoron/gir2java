package gir2java;

import java.util.List;

public class ParameterDescriptor {
	private String name;
	private ConvertedType type;
	private boolean isInstance;
	
	public ParameterDescriptor(String name, ConvertedType type, boolean isInstance) {
		this.name = name;
		this.type = type;
		this.isInstance = isInstance;
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
	
	public boolean isInstance() {
		return isInstance;
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
