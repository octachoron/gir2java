
package generated.gstreamer10.gst;

import generated.gobject20.gobject.GParamSpec;
import generated.gobject20.gobject.GValue;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstControlBinding
    extends StructObject
{


    public GstControlBinding() {
        super();
    }

    public GstControlBinding(Pointer pointer) {
        super(pointer);
    }

    protected native boolean gst_control_binding_get_g_value_array(
        @Ptr
        long binding, Object timestamp, Object interval, long n_values,
        @Ptr
        long values);

    public boolean get_g_value_array(Object timestamp, Object interval, long n_values, Pointer<GValue> values) {
        return this.gst_control_binding_get_g_value_array(Pointer.pointerTo(this, GstControlBinding.class), timestamp, interval, n_values, Pointer.getPeer(values));
    }

    @Ptr
    protected native long gst_control_binding_get_value(
        @Ptr
        long binding, Object timestamp);

    public Pointer<GValue> get_value(Object timestamp) {
        return Pointer.pointerToAddress(this.gst_control_binding_get_value(Pointer.pointerTo(this, GstControlBinding.class), timestamp), Pointer.class);
    }

    protected native boolean gst_control_binding_get_value_array(
        @Ptr
        long binding, Object timestamp, Object interval, long n_values, Pointer values);

    public boolean get_value_array(Object timestamp, Object interval, long n_values, Pointer values) {
        return this.gst_control_binding_get_value_array(Pointer.pointerTo(this, GstControlBinding.class), timestamp, interval, n_values, values);
    }

    protected native boolean gst_control_binding_is_disabled(
        @Ptr
        long binding);

    public boolean is_disabled() {
        return this.gst_control_binding_is_disabled(Pointer.pointerTo(this, GstControlBinding.class));
    }

    protected native void gst_control_binding_set_disabled(
        @Ptr
        long binding, boolean disabled);

    public void set_disabled(boolean disabled) {
        this.gst_control_binding_set_disabled(Pointer.pointerTo(this, GstControlBinding.class), disabled);
    }

    protected native boolean gst_control_binding_sync_values(
        @Ptr
        long binding,
        @Ptr
        long object, Object timestamp, Object last_sync);

    public boolean sync_values(Pointer object, Object timestamp, Object last_sync) {
        return this.gst_control_binding_sync_values(Pointer.pointerTo(this, GstControlBinding.class), Pointer.getPeer(object), timestamp, last_sync);
    }

    @Field(0)
    public Pointer<GParamSpec> field_pspec() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GstControlBinding field_pspec(Pointer<GParamSpec> field_pspec) {
        this.io.setPointerField(this, 0, field_pspec);
        return this;
    }

    @Field(1)
    public boolean field_disabled() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GstControlBinding field_disabled(boolean field_disabled) {
        this.io.setNativeObjectField(this, 1, field_disabled);
        return this;
    }

    @Field(2)
    public Pointer<GstObject> field_object() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GstControlBinding field_object(Pointer<GstObject> field_object) {
        this.io.setPointerField(this, 2, field_object);
        return this;
    }

    @Field(3)
    public Pointer field_name() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public GstControlBinding field_name(Pointer field_name) {
        this.io.setPointerField(this, 3, field_name);
        return this;
    }

    @Field(4)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public GstControlBinding field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 4, field__gst_reserved);
        return this;
    }

    @Field(5)
    public GstObject field_parent() {
        return this.io.getNativeObjectField(this, 5);
    }

    @Field(5)
    public GstControlBinding field_parent(GstObject field_parent) {
        this.io.setNativeObjectField(this, 5, field_parent);
        return this;
    }

}
