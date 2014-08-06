package gir2java;

public class NamespaceDescriptor extends Pair<String, String> {

	public NamespaceDescriptor(String name, String version) {
		super(name, version);
	}

	public String getName() {
		return getA();
	}
	
	public String getVersion() {
		return getB();
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getName());
		sb.append('-');
		sb.append(getVersion());
		return sb.toString();
	}
}
