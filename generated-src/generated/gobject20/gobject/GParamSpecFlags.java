
package generated.gobject20.gobject;

import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gobject-2.0")
public class GParamSpecFlags
    extends GParamSpec
{


    public GParamSpecFlags() {
        super();
    }

    public GParamSpecFlags(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GParamSpec field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GParamSpecFlags field_parent_instance(GParamSpec field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer<GFlagsClass> field_flags_class() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GParamSpecFlags field_flags_class(Pointer<GFlagsClass> field_flags_class) {
        this.io.setPointerField(this, 1, field_flags_class);
        return this;
    }

    @Field(2)
    public long field_default_value() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GParamSpecFlags field_default_value(long field_default_value) {
        this.io.setNativeObjectField(this, 2, field_default_value);
        return this;
    }

}
