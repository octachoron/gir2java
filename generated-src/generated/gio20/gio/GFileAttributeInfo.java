
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GFileAttributeInfo
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GFileAttributeInfo() {
        super();
    }

    public GFileAttributeInfo(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer gfileattributeinfo_field_name() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GFileAttributeInfo gfileattributeinfo_field_name(Pointer gfileattributeinfo_field_name) {
        this.io.setPointerField(this, 0, gfileattributeinfo_field_name);
        return this;
    }

    @Field(1)
    public IntValuedEnum<GFileAttributeInfoFlags> gfileattributeinfo_field_flags() {
        return this.io.getEnumField(this, 1);
    }

    @Field(1)
    public GFileAttributeInfo gfileattributeinfo_field_flags(IntValuedEnum<GFileAttributeInfoFlags> gfileattributeinfo_field_flags) {
        this.io.setEnumField(this, 1, gfileattributeinfo_field_flags);
        return this;
    }

    @Field(2)
    public IntValuedEnum<GFileAttributeType> gfileattributeinfo_field_type() {
        return this.io.getEnumField(this, 2);
    }

    @Field(2)
    public GFileAttributeInfo gfileattributeinfo_field_type(IntValuedEnum<GFileAttributeType> gfileattributeinfo_field_type) {
        this.io.setEnumField(this, 2, gfileattributeinfo_field_type);
        return this;
    }

}
