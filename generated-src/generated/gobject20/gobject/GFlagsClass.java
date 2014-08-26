
package generated.gobject20.gobject;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gobject-2.0")
public class GFlagsClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GFlagsClass() {
        super();
    }

    public GFlagsClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public long gflagsclass_field_mask() {
        return this.io.getLongField(this, 0);
    }

    @Field(0)
    public GFlagsClass gflagsclass_field_mask(long gflagsclass_field_mask) {
        this.io.setLongField(this, 0, gflagsclass_field_mask);
        return this;
    }

    @Field(1)
    public GTypeClass gflagsclass_field_g_type_class() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GFlagsClass gflagsclass_field_g_type_class(GTypeClass gflagsclass_field_g_type_class) {
        this.io.setNativeObjectField(this, 1, gflagsclass_field_g_type_class);
        return this;
    }

    @Field(2)
    public Pointer<GFlagsValue> gflagsclass_field_values() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GFlagsClass gflagsclass_field_values(Pointer<GFlagsValue> gflagsclass_field_values) {
        this.io.setPointerField(this, 2, gflagsclass_field_values);
        return this;
    }

    @Field(3)
    public long gflagsclass_field_n_values() {
        return this.io.getLongField(this, 3);
    }

    @Field(3)
    public GFlagsClass gflagsclass_field_n_values(long gflagsclass_field_n_values) {
        this.io.setLongField(this, 3, gflagsclass_field_n_values);
        return this;
    }

}
