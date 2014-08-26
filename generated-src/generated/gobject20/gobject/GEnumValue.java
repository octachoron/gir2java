
package generated.gobject20.gobject;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gobject-2.0")
public class GEnumValue
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GEnumValue() {
        super();
    }

    public GEnumValue(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer genumvalue_field_value_nick() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GEnumValue genumvalue_field_value_nick(Pointer genumvalue_field_value_nick) {
        this.io.setPointerField(this, 0, genumvalue_field_value_nick);
        return this;
    }

    @Field(1)
    public int genumvalue_field_value() {
        return this.io.getIntField(this, 1);
    }

    @Field(1)
    public GEnumValue genumvalue_field_value(int genumvalue_field_value) {
        this.io.setIntField(this, 1, genumvalue_field_value);
        return this;
    }

    @Field(2)
    public Pointer genumvalue_field_value_name() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GEnumValue genumvalue_field_value_name(Pointer genumvalue_field_value_name) {
        this.io.setPointerField(this, 2, genumvalue_field_value_name);
        return this;
    }

}
