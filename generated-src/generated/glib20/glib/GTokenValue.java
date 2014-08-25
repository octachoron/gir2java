
package generated.glib20.glib;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Union;

@Union
@Library("glib-2.0")
public class GTokenValue
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GTokenValue() {
        super();
    }

    public GTokenValue(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer gtokenvalue_field_v_symbol() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GTokenValue gtokenvalue_field_v_symbol(Pointer gtokenvalue_field_v_symbol) {
        this.io.setPointerField(this, 0, gtokenvalue_field_v_symbol);
        return this;
    }

    @Field(1)
    public Pointer gtokenvalue_field_v_identifier() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GTokenValue gtokenvalue_field_v_identifier(Pointer gtokenvalue_field_v_identifier) {
        this.io.setPointerField(this, 1, gtokenvalue_field_v_identifier);
        return this;
    }

    @Field(2)
    public long gtokenvalue_field_v_binary() {
        return this.io.getLongField(this, 2);
    }

    @Field(2)
    public GTokenValue gtokenvalue_field_v_binary(long gtokenvalue_field_v_binary) {
        this.io.setLongField(this, 2, gtokenvalue_field_v_binary);
        return this;
    }

    @Field(3)
    public long gtokenvalue_field_v_octal() {
        return this.io.getLongField(this, 3);
    }

    @Field(3)
    public GTokenValue gtokenvalue_field_v_octal(long gtokenvalue_field_v_octal) {
        this.io.setLongField(this, 3, gtokenvalue_field_v_octal);
        return this;
    }

    @Field(4)
    public long gtokenvalue_field_v_int() {
        return this.io.getLongField(this, 4);
    }

    @Field(4)
    public GTokenValue gtokenvalue_field_v_int(long gtokenvalue_field_v_int) {
        this.io.setLongField(this, 4, gtokenvalue_field_v_int);
        return this;
    }

    @Field(5)
    public long gtokenvalue_field_v_int64() {
        return this.io.getLongField(this, 5);
    }

    @Field(5)
    public GTokenValue gtokenvalue_field_v_int64(long gtokenvalue_field_v_int64) {
        this.io.setLongField(this, 5, gtokenvalue_field_v_int64);
        return this;
    }

    @Field(6)
    public double gtokenvalue_field_v_float() {
        return this.io.getDoubleField(this, 6);
    }

    @Field(6)
    public GTokenValue gtokenvalue_field_v_float(double gtokenvalue_field_v_float) {
        this.io.setDoubleField(this, 6, gtokenvalue_field_v_float);
        return this;
    }

    @Field(7)
    public long gtokenvalue_field_v_hex() {
        return this.io.getLongField(this, 7);
    }

    @Field(7)
    public GTokenValue gtokenvalue_field_v_hex(long gtokenvalue_field_v_hex) {
        this.io.setLongField(this, 7, gtokenvalue_field_v_hex);
        return this;
    }

    @Field(8)
    public Pointer gtokenvalue_field_v_string() {
        return this.io.getPointerField(this, 8);
    }

    @Field(8)
    public GTokenValue gtokenvalue_field_v_string(Pointer gtokenvalue_field_v_string) {
        this.io.setPointerField(this, 8, gtokenvalue_field_v_string);
        return this;
    }

    @Field(9)
    public Pointer gtokenvalue_field_v_comment() {
        return this.io.getPointerField(this, 9);
    }

    @Field(9)
    public GTokenValue gtokenvalue_field_v_comment(Pointer gtokenvalue_field_v_comment) {
        this.io.setPointerField(this, 9, gtokenvalue_field_v_comment);
        return this;
    }

    @Field(10)
    public short gtokenvalue_field_v_char() {
        return this.io.getShortField(this, 10);
    }

    @Field(10)
    public GTokenValue gtokenvalue_field_v_char(short gtokenvalue_field_v_char) {
        this.io.setShortField(this, 10, gtokenvalue_field_v_char);
        return this;
    }

    @Field(11)
    public long gtokenvalue_field_v_error() {
        return this.io.getLongField(this, 11);
    }

    @Field(11)
    public GTokenValue gtokenvalue_field_v_error(long gtokenvalue_field_v_error) {
        this.io.setLongField(this, 11, gtokenvalue_field_v_error);
        return this;
    }

}
