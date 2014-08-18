
package generated.gstreamer10.gst;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstControlSource
    extends GstObject
{


    static {
        BridJ.register();
    }

    public GstControlSource() {
        super();
    }

    public GstControlSource(Pointer pointer) {
        super(pointer);
    }

    protected native boolean gst_control_source_get_value(
        @Ptr
        long self, long timestamp,
        @Ptr
        long value);

    public boolean gstcontrolsource_get_value(long timestamp, Pointer<Double> value) {
        return this.gst_control_source_get_value(Pointer.pointerTo(this, GstControlSource.class).getPeer(), timestamp, Pointer.getPeer(value));
    }

    protected native boolean gst_control_source_get_value_array(
        @Ptr
        long self, long timestamp, long interval, long n_values,
        @Ptr
        long values);

    public boolean gstcontrolsource_get_value_array(long timestamp, long interval, long n_values, Pointer<Double> values) {
        return this.gst_control_source_get_value_array(Pointer.pointerTo(this, GstControlSource.class).getPeer(), timestamp, interval, n_values, Pointer.getPeer(values));
    }

    @Field(0)
    public GstObject gstcontrolsource_field_parent() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstControlSource gstcontrolsource_field_parent(GstObject gstcontrolsource_field_parent) {
        this.io.setNativeObjectField(this, 0, gstcontrolsource_field_parent);
        return this;
    }

    @Field(1)
    public Pointer field_get_value() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstControlSource field_get_value(Pointer field_get_value) {
        this.io.setPointerField(this, 1, field_get_value);
        return this;
    }

    @Field(2)
    public Pointer field_get_value_array() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GstControlSource field_get_value_array(Pointer field_get_value_array) {
        this.io.setPointerField(this, 2, field_get_value_array);
        return this;
    }

    @Field(3)
    private Pointer gstcontrolsource_field__gst_reserved() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    private GstControlSource gstcontrolsource_field__gst_reserved(Pointer gstcontrolsource_field__gst_reserved) {
        this.io.setPointerField(this, 3, gstcontrolsource_field__gst_reserved);
        return this;
    }

}
