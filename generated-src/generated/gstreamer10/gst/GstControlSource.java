
package generated.gstreamer10.gst;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstControlSource
    extends StructObject
{


    public GstControlSource() {
        super();
    }

    public GstControlSource(Pointer pointer) {
        super(pointer);
    }

    protected native boolean gst_control_source_get_value(
        @Ptr
        long self, Object timestamp,
        @Ptr
        long value);

    public boolean get_value(Object timestamp, Pointer<Double> value) {
        return this.gst_control_source_get_value(Pointer.pointerTo(this, GstControlSource.class), timestamp, Pointer.getPeer(value));
    }

    protected native boolean gst_control_source_get_value_array(
        @Ptr
        long self, Object timestamp, Object interval, long n_values,
        @Ptr
        long values);

    public boolean get_value_array(Object timestamp, Object interval, long n_values, Pointer<Double> values) {
        return this.gst_control_source_get_value_array(Pointer.pointerTo(this, GstControlSource.class), timestamp, interval, n_values, Pointer.getPeer(values));
    }

    @Field(0)
    public GstObject field_parent() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstControlSource field_parent(GstObject field_parent) {
        this.io.setNativeObjectField(this, 0, field_parent);
        return this;
    }

    @Field(1)
    public Object field_get_value_array() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GstControlSource field_get_value_array(Object field_get_value_array) {
        this.io.setNativeObjectField(this, 1, field_get_value_array);
        return this;
    }

    @Field(2)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GstControlSource field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 2, field__gst_reserved);
        return this;
    }

    @Field(3)
    public Object field_get_value() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GstControlSource field_get_value(Object field_get_value) {
        this.io.setNativeObjectField(this, 3, field_get_value);
        return this;
    }

}
