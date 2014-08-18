
package generated.gobject20.gobject;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Union;

@Union
@Library("gobject-2.0")
public class G_Value__data__union
    extends StructObject
{


    static {
        BridJ.register();
    }

    public G_Value__data__union() {
        super();
    }

    public G_Value__data__union(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public int field_v_int() {
        return this.io.getIntField(this, 0);
    }

    @Field(0)
    public G_Value__data__union field_v_int(int field_v_int) {
        this.io.setIntField(this, 0, field_v_int);
        return this;
    }

    @Field(1)
    public long field_v_ulong() {
        return this.io.getLongField(this, 1);
    }

    @Field(1)
    public G_Value__data__union field_v_ulong(long field_v_ulong) {
        this.io.setLongField(this, 1, field_v_ulong);
        return this;
    }

    @Field(2)
    public long field_v_uint64() {
        return this.io.getLongField(this, 2);
    }

    @Field(2)
    public G_Value__data__union field_v_uint64(long field_v_uint64) {
        this.io.setLongField(this, 2, field_v_uint64);
        return this;
    }

    @Field(3)
    public long field_v_int64() {
        return this.io.getLongField(this, 3);
    }

    @Field(3)
    public G_Value__data__union field_v_int64(long field_v_int64) {
        this.io.setLongField(this, 3, field_v_int64);
        return this;
    }

    @Field(4)
    public long field_v_long() {
        return this.io.getLongField(this, 4);
    }

    @Field(4)
    public G_Value__data__union field_v_long(long field_v_long) {
        this.io.setLongField(this, 4, field_v_long);
        return this;
    }

    @Field(5)
    public float field_v_float() {
        return this.io.getFloatField(this, 5);
    }

    @Field(5)
    public G_Value__data__union field_v_float(float field_v_float) {
        this.io.setFloatField(this, 5, field_v_float);
        return this;
    }

    @Field(6)
    public double field_v_double() {
        return this.io.getDoubleField(this, 6);
    }

    @Field(6)
    public G_Value__data__union field_v_double(double field_v_double) {
        this.io.setDoubleField(this, 6, field_v_double);
        return this;
    }

    @Field(7)
    public long field_v_uint() {
        return this.io.getLongField(this, 7);
    }

    @Field(7)
    public G_Value__data__union field_v_uint(long field_v_uint) {
        this.io.setLongField(this, 7, field_v_uint);
        return this;
    }

    @Field(8)
    public Pointer field_v_pointer() {
        return this.io.getPointerField(this, 8);
    }

    @Field(8)
    public G_Value__data__union field_v_pointer(Pointer field_v_pointer) {
        this.io.setPointerField(this, 8, field_v_pointer);
        return this;
    }

}
