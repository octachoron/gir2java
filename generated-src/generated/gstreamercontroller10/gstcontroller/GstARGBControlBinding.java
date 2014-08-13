
package generated.gstreamercontroller10.gstcontroller;

import generated.gobject20.gobject.GValue;
import generated.gstreamer10.gst.GstControlBinding;
import generated.gstreamer10.gst.GstControlSource;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-controller-1.0")
public class GstARGBControlBinding
    extends GstControlBinding
{


    public GstARGBControlBinding() {
        super();
    }

    public GstARGBControlBinding(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GstControlBinding field_parent() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstARGBControlBinding field_parent(GstControlBinding field_parent) {
        this.io.setNativeObjectField(this, 0, field_parent);
        return this;
    }

    @Field(1)
    public Pointer<GstControlSource> field_cs_a() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstARGBControlBinding field_cs_a(Pointer<GstControlSource> field_cs_a) {
        this.io.setPointerField(this, 1, field_cs_a);
        return this;
    }

    @Field(2)
    public Pointer<GstControlSource> field_cs_r() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GstARGBControlBinding field_cs_r(Pointer<GstControlSource> field_cs_r) {
        this.io.setPointerField(this, 2, field_cs_r);
        return this;
    }

    @Field(3)
    public Pointer<GstControlSource> field_cs_g() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public GstARGBControlBinding field_cs_g(Pointer<GstControlSource> field_cs_g) {
        this.io.setPointerField(this, 3, field_cs_g);
        return this;
    }

    @Field(4)
    public Pointer<GstControlSource> field_cs_b() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public GstARGBControlBinding field_cs_b(Pointer<GstControlSource> field_cs_b) {
        this.io.setPointerField(this, 4, field_cs_b);
        return this;
    }

    @Field(5)
    public GValue field_cur_value() {
        return this.io.getNativeObjectField(this, 5);
    }

    @Field(5)
    public GstARGBControlBinding field_cur_value(GValue field_cur_value) {
        this.io.setNativeObjectField(this, 5, field_cur_value);
        return this;
    }

    @Field(6)
    public long field_last_value() {
        return this.io.getNativeObjectField(this, 6);
    }

    @Field(6)
    public GstARGBControlBinding field_last_value(long field_last_value) {
        this.io.setNativeObjectField(this, 6, field_last_value);
        return this;
    }

    @Field(7)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 7);
    }

    @Field(7)
    public GstARGBControlBinding field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 7, field__gst_reserved);
        return this;
    }

}
