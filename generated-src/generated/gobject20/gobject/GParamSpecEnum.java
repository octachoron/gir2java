
package generated.gobject20.gobject;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gobject-2.0")
public class GParamSpecEnum
    extends GParamSpec
{


    static {
        BridJ.register();
    }

    public GParamSpecEnum() {
        super();
    }

    public GParamSpecEnum(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GParamSpec gparamspecenum_field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GParamSpecEnum gparamspecenum_field_parent_instance(GParamSpec gparamspecenum_field_parent_instance) {
        this.io.setNativeObjectField(this, 0, gparamspecenum_field_parent_instance);
        return this;
    }

    @Field(1)
    public int gparamspecenum_field_default_value() {
        return this.io.getIntField(this, 1);
    }

    @Field(1)
    public GParamSpecEnum gparamspecenum_field_default_value(int gparamspecenum_field_default_value) {
        this.io.setIntField(this, 1, gparamspecenum_field_default_value);
        return this;
    }

    @Field(2)
    public Pointer<GEnumClass> gparamspecenum_field_enum_class() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GParamSpecEnum gparamspecenum_field_enum_class(Pointer<GEnumClass> gparamspecenum_field_enum_class) {
        this.io.setPointerField(this, 2, gparamspecenum_field_enum_class);
        return this;
    }

}
