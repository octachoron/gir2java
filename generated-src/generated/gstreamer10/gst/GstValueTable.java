
package generated.gstreamer10.gst;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-1.0")
public class GstValueTable
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstValueTable() {
        super();
    }

    public GstValueTable(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public long gstvaluetable_field_type() {
        return this.io.getLongField(this, 0);
    }

    @Field(0)
    public GstValueTable gstvaluetable_field_type(long gstvaluetable_field_type) {
        this.io.setLongField(this, 0, gstvaluetable_field_type);
        return this;
    }

    @Field(1)
    public Pointer gstvaluetable_field_compare() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstValueTable gstvaluetable_field_compare(Pointer gstvaluetable_field_compare) {
        this.io.setPointerField(this, 1, gstvaluetable_field_compare);
        return this;
    }

    @Field(2)
    public Pointer gstvaluetable_field_serialize() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GstValueTable gstvaluetable_field_serialize(Pointer gstvaluetable_field_serialize) {
        this.io.setPointerField(this, 2, gstvaluetable_field_serialize);
        return this;
    }

    @Field(3)
    public Pointer gstvaluetable_field_deserialize() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public GstValueTable gstvaluetable_field_deserialize(Pointer gstvaluetable_field_deserialize) {
        this.io.setPointerField(this, 3, gstvaluetable_field_deserialize);
        return this;
    }

    @Field(4)
    private Pointer gstvaluetable_field__gst_reserved() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    private GstValueTable gstvaluetable_field__gst_reserved(Pointer gstvaluetable_field__gst_reserved) {
        this.io.setPointerField(this, 4, gstvaluetable_field__gst_reserved);
        return this;
    }

}
