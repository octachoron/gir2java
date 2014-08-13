
package generated.gobject20.gobject;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gobject-2.0")
public class GEnumValue
    extends StructObject
{


    public GEnumValue() {
        super();
    }

    public GEnumValue(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public int field_value() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GEnumValue field_value(int field_value) {
        this.io.setNativeObjectField(this, 0, field_value);
        return this;
    }

    @Field(1)
    public Pointer field_value_name() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GEnumValue field_value_name(Pointer field_value_name) {
        this.io.setPointerField(this, 1, field_value_name);
        return this;
    }

    @Field(2)
    public Pointer field_value_nick() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GEnumValue field_value_nick(Pointer field_value_nick) {
        this.io.setPointerField(this, 2, field_value_nick);
        return this;
    }

}
