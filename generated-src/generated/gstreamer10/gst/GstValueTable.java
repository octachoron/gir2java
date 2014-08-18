
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
    public long field_type() {
        return this.io.getLongField(this, 0);
    }

    @Field(0)
    public GstValueTable field_type(long field_type) {
        this.io.setLongField(this, 0, field_type);
        return this;
    }

    @Field(1)
    public Pointer field_compare() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstValueTable field_compare(Pointer field_compare) {
        this.io.setPointerField(this, 1, field_compare);
        return this;
    }

    @Field(2)
    public Pointer field_serialize() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GstValueTable field_serialize(Pointer field_serialize) {
        this.io.setPointerField(this, 2, field_serialize);
        return this;
    }

    @Field(3)
    public Pointer field_deserialize() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public GstValueTable field_deserialize(Pointer field_deserialize) {
        this.io.setPointerField(this, 3, field_deserialize);
        return this;
    }

    @Field(4)
    private Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    private GstValueTable field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 4, field__gst_reserved);
        return this;
    }

}
