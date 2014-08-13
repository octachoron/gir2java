
package generated.gio20.gio;

import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GFileAttributeInfo
    extends StructObject
{


    public GFileAttributeInfo() {
        super();
    }

    public GFileAttributeInfo(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer field_name() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GFileAttributeInfo field_name(Pointer field_name) {
        this.io.setPointerField(this, 0, field_name);
        return this;
    }

    @Field(1)
    public Object field_flags() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GFileAttributeInfo field_flags(Object field_flags) {
        this.io.setNativeObjectField(this, 1, field_flags);
        return this;
    }

    @Field(2)
    public IntValuedEnum<GFileAttributeType> field_type() {
        return this.io.getEnumField(this, 2);
    }

    @Field(2)
    public GFileAttributeInfo field_type(IntValuedEnum<GFileAttributeType> field_type) {
        this.io.setEnumField(this, 2, field_type);
        return this;
    }

}
