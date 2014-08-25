
package generated.gobject20.gobject;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gobject-2.0")
public class GEnumClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GEnumClass() {
        super();
    }

    public GEnumClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public long genumclass_field_n_values() {
        return this.io.getLongField(this, 0);
    }

    @Field(0)
    public GEnumClass genumclass_field_n_values(long genumclass_field_n_values) {
        this.io.setLongField(this, 0, genumclass_field_n_values);
        return this;
    }

    @Field(1)
    public int genumclass_field_maximum() {
        return this.io.getIntField(this, 1);
    }

    @Field(1)
    public GEnumClass genumclass_field_maximum(int genumclass_field_maximum) {
        this.io.setIntField(this, 1, genumclass_field_maximum);
        return this;
    }

    @Field(2)
    public Pointer<GEnumValue> genumclass_field_values() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GEnumClass genumclass_field_values(Pointer<GEnumValue> genumclass_field_values) {
        this.io.setPointerField(this, 2, genumclass_field_values);
        return this;
    }

    @Field(3)
    public int genumclass_field_minimum() {
        return this.io.getIntField(this, 3);
    }

    @Field(3)
    public GEnumClass genumclass_field_minimum(int genumclass_field_minimum) {
        this.io.setIntField(this, 3, genumclass_field_minimum);
        return this;
    }

    @Field(4)
    public GTypeClass genumclass_field_g_type_class() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    public GEnumClass genumclass_field_g_type_class(GTypeClass genumclass_field_g_type_class) {
        this.io.setNativeObjectField(this, 4, genumclass_field_g_type_class);
        return this;
    }

}
