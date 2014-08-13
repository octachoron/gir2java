
package generated.gobject20.gobject;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gobject-2.0")
public class GEnumClass
    extends StructObject
{


    public GEnumClass() {
        super();
    }

    public GEnumClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public int field_minimum() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GEnumClass field_minimum(int field_minimum) {
        this.io.setNativeObjectField(this, 0, field_minimum);
        return this;
    }

    @Field(1)
    public int field_maximum() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GEnumClass field_maximum(int field_maximum) {
        this.io.setNativeObjectField(this, 1, field_maximum);
        return this;
    }

    @Field(2)
    public GTypeClass field_g_type_class() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GEnumClass field_g_type_class(GTypeClass field_g_type_class) {
        this.io.setNativeObjectField(this, 2, field_g_type_class);
        return this;
    }

    @Field(3)
    public Pointer<GEnumValue> field_values() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public GEnumClass field_values(Pointer<GEnumValue> field_values) {
        this.io.setPointerField(this, 3, field_values);
        return this;
    }

    @Field(4)
    public long field_n_values() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    public GEnumClass field_n_values(long field_n_values) {
        this.io.setNativeObjectField(this, 4, field_n_values);
        return this;
    }

}
