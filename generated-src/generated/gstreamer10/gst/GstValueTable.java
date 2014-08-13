
package generated.gstreamer10.gst;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-1.0")
public class GstValueTable
    extends StructObject
{


    public GstValueTable() {
        super();
    }

    public GstValueTable(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public long field_type() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstValueTable field_type(long field_type) {
        this.io.setNativeObjectField(this, 0, field_type);
        return this;
    }

    @Field(1)
    public Object field_compare() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GstValueTable field_compare(Object field_compare) {
        this.io.setNativeObjectField(this, 1, field_compare);
        return this;
    }

    @Field(2)
    public Object field_serialize() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GstValueTable field_serialize(Object field_serialize) {
        this.io.setNativeObjectField(this, 2, field_serialize);
        return this;
    }

    @Field(3)
    public Object field_deserialize() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GstValueTable field_deserialize(Object field_deserialize) {
        this.io.setNativeObjectField(this, 3, field_deserialize);
        return this;
    }

    @Field(4)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public GstValueTable field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 4, field__gst_reserved);
        return this;
    }

}
