
package generated.gobject20.gobject;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Union;

@Union
@Library("gobject-2.0")
public class GTypeCValue
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GTypeCValue() {
        super();
    }

    public GTypeCValue(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public int field_v_int() {
        return this.io.getIntField(this, 0);
    }

    @Field(0)
    public GTypeCValue field_v_int(int field_v_int) {
        this.io.setIntField(this, 0, field_v_int);
        return this;
    }

    @Field(1)
    public double field_v_double() {
        return this.io.getDoubleField(this, 1);
    }

    @Field(1)
    public GTypeCValue field_v_double(double field_v_double) {
        this.io.setDoubleField(this, 1, field_v_double);
        return this;
    }

    @Field(2)
    public long field_v_long() {
        return this.io.getLongField(this, 2);
    }

    @Field(2)
    public GTypeCValue field_v_long(long field_v_long) {
        this.io.setLongField(this, 2, field_v_long);
        return this;
    }

    @Field(3)
    public long field_v_int64() {
        return this.io.getLongField(this, 3);
    }

    @Field(3)
    public GTypeCValue field_v_int64(long field_v_int64) {
        this.io.setLongField(this, 3, field_v_int64);
        return this;
    }

    @Field(4)
    public Pointer field_v_pointer() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public GTypeCValue field_v_pointer(Pointer field_v_pointer) {
        this.io.setPointerField(this, 4, field_v_pointer);
        return this;
    }

}
