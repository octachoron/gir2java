package gir2java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.bridj.Pointer;

import com.sun.codemodel.JClass;
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JType;

/**
 * Tell various information about types found in .girs that help generating appropriate
 * bindings for the elements that use it.
 * 
 * @author relek
 *
 */
public class ConvertedType {
	
	private static Set<String> knownBridjPrimitives = new HashSet<String>(Arrays.asList(
			"Boolean",
			"Byte",
			"Char",
			"CLong",
			"Double",
			"Enum",
			"Float",
			"Int",
			"Long",
			"NativeObject",
			"Pointer",
			"Short",
			"SizeT",
			"TypedPointer"
	));
	
	private String namespace;
	private String type;
	private String ctype;
	private boolean isEnum;
	private JCodeModel cm;
	private JType jType;
	
	public ConvertedType(JCodeModel cm, String namespace, String type, String ctype, boolean isEnum) {
		this.namespace = namespace;
		this.type = type;
		this.ctype = ctype;
		this.cm = cm;
		this.isEnum = isEnum;
	}
	
	public boolean isPointer() {
		return (ctype != null) && (ctype.contains("*"));
	}
	
	public boolean isEnum() {
		return isEnum;
	}
	
	public String getType() {
		return type;
	}

	public String getCtype() {
		return ctype;
	}
	
	public String getNamespace() {
		return namespace;
	}

	public JType getJType() {
		return jType;
	}
	
	public void setJType(JType jType) {
		this.jType = jType;
	}
	
	public String bridjMethodifyTypeName() {
		if (isEnum()) {
			return "Enum";
//		} else if (type.isAssignableFrom(TypedPointer.class)) {
//			return "TypedPointer";
		} else if (isPointer()) {
			return "Pointer";
		}
		
		String camelType = NameUtils.toCamel(getType());
		
		if (knownBridjPrimitives.contains(camelType)) {
			return camelType;
		} else {
			return "NativeObject";
		}
	}
}
