
package generated.gstreamercontroller10.gstcontroller;

import generated.gobject20.gobject.GValue;
import generated.gstreamer10.gst.GstControlBinding;
import generated.gstreamer10.gst.GstControlSource;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-controller-1.0")
public class GstDirectControlBinding
    extends GstControlBinding
{


    public GstDirectControlBinding() {
        super();
    }

    public GstDirectControlBinding(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GstControlBinding field_parent() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstDirectControlBinding field_parent(GstControlBinding field_parent) {
        this.io.setNativeObjectField(this, 0, field_parent);
        return this;
    }

    @Field(1)
    public Pointer<GstControlSource> field_cs() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstDirectControlBinding field_cs(Pointer<GstControlSource> field_cs) {
        this.io.setPointerField(this, 1, field_cs);
        return this;
    }

    @Field(2)
    public GValue field_cur_value() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GstDirectControlBinding field_cur_value(GValue field_cur_value) {
        this.io.setNativeObjectField(this, 2, field_cur_value);
        return this;
    }

    @Field(3)
    public double field_last_value() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GstDirectControlBinding field_last_value(double field_last_value) {
        this.io.setNativeObjectField(this, 3, field_last_value);
        return this;
    }

    @Field(4)
    public int field_byte_size() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    public GstDirectControlBinding field_byte_size(int field_byte_size) {
        this.io.setNativeObjectField(this, 4, field_byte_size);
        return this;
    }

    @Field(5)
    public Object field_convert_value() {
        return this.io.getNativeObjectField(this, 5);
    }

    @Field(5)
    public GstDirectControlBinding field_convert_value(Object field_convert_value) {
        this.io.setNativeObjectField(this, 5, field_convert_value);
        return this;
    }

    @Field(6)
    public Object field_convert_g_value() {
        return this.io.getNativeObjectField(this, 6);
    }

    @Field(6)
    public GstDirectControlBinding field_convert_g_value(Object field_convert_g_value) {
        this.io.setNativeObjectField(this, 6, field_convert_g_value);
        return this;
    }

    @Field(7)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 7);
    }

    @Field(7)
    public GstDirectControlBinding field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 7, field__gst_reserved);
        return this;
    }

}
