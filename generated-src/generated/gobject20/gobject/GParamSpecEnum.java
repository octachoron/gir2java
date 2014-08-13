
package generated.gobject20.gobject;

import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gobject-2.0")
public class GParamSpecEnum
    extends GParamSpec
{


    public GParamSpecEnum() {
        super();
    }

    public GParamSpecEnum(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GParamSpec field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GParamSpecEnum field_parent_instance(GParamSpec field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer<GEnumClass> field_enum_class() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GParamSpecEnum field_enum_class(Pointer<GEnumClass> field_enum_class) {
        this.io.setPointerField(this, 1, field_enum_class);
        return this;
    }

    @Field(2)
    public int field_default_value() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GParamSpecEnum field_default_value(int field_default_value) {
        this.io.setNativeObjectField(this, 2, field_default_value);
        return this;
    }

}
