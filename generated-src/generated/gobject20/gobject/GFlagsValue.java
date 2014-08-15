
package generated.gobject20.gobject;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gobject-2.0")
public class GFlagsValue
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GFlagsValue() {
        super();
    }

    public GFlagsValue(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer field_value_nick() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GFlagsValue field_value_nick(Pointer field_value_nick) {
        this.io.setPointerField(this, 0, field_value_nick);
        return this;
    }

    @Field(1)
    public Pointer field_value_name() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GFlagsValue field_value_name(Pointer field_value_name) {
        this.io.setPointerField(this, 1, field_value_name);
        return this;
    }

    @Field(2)
    public long field_value() {
        return this.io.getLongField(this, 2);
    }

    @Field(2)
    public GFlagsValue field_value(long field_value) {
        this.io.setLongField(this, 2, field_value);
        return this;
    }

}
