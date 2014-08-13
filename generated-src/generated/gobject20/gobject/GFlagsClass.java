
package generated.gobject20.gobject;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gobject-2.0")
public class GFlagsClass
    extends StructObject
{


    public GFlagsClass() {
        super();
    }

    public GFlagsClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public long field_mask() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GFlagsClass field_mask(long field_mask) {
        this.io.setNativeObjectField(this, 0, field_mask);
        return this;
    }

    @Field(1)
    public long field_n_values() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GFlagsClass field_n_values(long field_n_values) {
        this.io.setNativeObjectField(this, 1, field_n_values);
        return this;
    }

    @Field(2)
    public Pointer<GFlagsValue> field_values() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GFlagsClass field_values(Pointer<GFlagsValue> field_values) {
        this.io.setPointerField(this, 2, field_values);
        return this;
    }

    @Field(3)
    public GTypeClass field_g_type_class() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GFlagsClass field_g_type_class(GTypeClass field_g_type_class) {
        this.io.setNativeObjectField(this, 3, field_g_type_class);
        return this;
    }

}
