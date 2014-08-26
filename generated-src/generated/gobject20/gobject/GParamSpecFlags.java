
package generated.gobject20.gobject;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gobject-2.0")
public class GParamSpecFlags
    extends GParamSpec
{


    static {
        BridJ.register();
    }

    public GParamSpecFlags() {
        super();
    }

    public GParamSpecFlags(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public long gparamspecflags_field_default_value() {
        return this.io.getLongField(this, 0);
    }

    @Field(0)
    public GParamSpecFlags gparamspecflags_field_default_value(long gparamspecflags_field_default_value) {
        this.io.setLongField(this, 0, gparamspecflags_field_default_value);
        return this;
    }

    @Field(1)
    public GParamSpec gparamspecflags_field_parent_instance() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GParamSpecFlags gparamspecflags_field_parent_instance(GParamSpec gparamspecflags_field_parent_instance) {
        this.io.setNativeObjectField(this, 1, gparamspecflags_field_parent_instance);
        return this;
    }

    @Field(2)
    public Pointer<GFlagsClass> gparamspecflags_field_flags_class() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GParamSpecFlags gparamspecflags_field_flags_class(Pointer<GFlagsClass> gparamspecflags_field_flags_class) {
        this.io.setPointerField(this, 2, gparamspecflags_field_flags_class);
        return this;
    }

}
