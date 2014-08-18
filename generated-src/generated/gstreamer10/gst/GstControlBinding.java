
package generated.gstreamer10.gst;

import generated.gobject20.gobject.GParamSpec;
import generated.gobject20.gobject.GValue;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstControlBinding
    extends GstObject
{


    static {
        BridJ.register();
    }

    public GstControlBinding() {
        super();
    }

    public GstControlBinding(Pointer pointer) {
        super(pointer);
    }

    protected native boolean gst_control_binding_get_g_value_array(
        @Ptr
        long binding, long timestamp, long interval, long n_values,
        @Ptr
        long values);

    public boolean gstcontrolbinding_get_g_value_array(long timestamp, long interval, long n_values, Pointer<GValue> values) {
        return this.gst_control_binding_get_g_value_array(Pointer.pointerTo(this, GstControlBinding.class).getPeer(), timestamp, interval, n_values, Pointer.getPeer(values));
    }

    @Ptr
    protected native long gst_control_binding_get_value(
        @Ptr
        long binding, long timestamp);

    public Pointer<GValue> gstcontrolbinding_get_value(long timestamp) {
        return Pointer.pointerToAddress(this.gst_control_binding_get_value(Pointer.pointerTo(this, GstControlBinding.class).getPeer(), timestamp), GValue.class);
    }

    protected native boolean gst_control_binding_get_value_array(
        @Ptr
        long binding, long timestamp, long interval, long n_values,
        @Ptr
        long values);

    public boolean gstcontrolbinding_get_value_array(long timestamp, long interval, long n_values, Pointer values) {
        return this.gst_control_binding_get_value_array(Pointer.pointerTo(this, GstControlBinding.class).getPeer(), timestamp, interval, n_values, Pointer.getPeer(values));
    }

    protected native boolean gst_control_binding_is_disabled(
        @Ptr
        long binding);

    public boolean is_disabled() {
        return this.gst_control_binding_is_disabled(Pointer.pointerTo(this, GstControlBinding.class).getPeer());
    }

    protected native void gst_control_binding_set_disabled(
        @Ptr
        long binding, boolean disabled);

    public void set_disabled(boolean disabled) {
        this.gst_control_binding_set_disabled(Pointer.pointerTo(this, GstControlBinding.class).getPeer(), disabled);
    }

    protected native boolean gst_control_binding_sync_values(
        @Ptr
        long binding,
        @Ptr
        long object, long timestamp, long last_sync);

    public boolean gstcontrolbinding_sync_values(Pointer<GstObject> object, long timestamp, long last_sync) {
        return this.gst_control_binding_sync_values(Pointer.pointerTo(this, GstControlBinding.class).getPeer(), Pointer.getPeer(object), timestamp, last_sync);
    }

    @Field(0)
    public GstObject gstcontrolbinding_field_parent() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstControlBinding gstcontrolbinding_field_parent(GstObject gstcontrolbinding_field_parent) {
        this.io.setNativeObjectField(this, 0, gstcontrolbinding_field_parent);
        return this;
    }

    @Field(1)
    public Pointer gstcontrolbinding_field_name() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstControlBinding gstcontrolbinding_field_name(Pointer gstcontrolbinding_field_name) {
        this.io.setPointerField(this, 1, gstcontrolbinding_field_name);
        return this;
    }

    @Field(2)
    public Pointer<GParamSpec> field_pspec() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GstControlBinding field_pspec(Pointer<GParamSpec> field_pspec) {
        this.io.setPointerField(this, 2, field_pspec);
        return this;
    }

    @Field(3)
    private Pointer<GstObject> gstcontrolbinding_field_object() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    private GstControlBinding gstcontrolbinding_field_object(Pointer<GstObject> gstcontrolbinding_field_object) {
        this.io.setPointerField(this, 3, gstcontrolbinding_field_object);
        return this;
    }

    @Field(4)
    private boolean field_disabled() {
        return this.io.getBooleanField(this, 4);
    }

    @Field(4)
    private GstControlBinding field_disabled(boolean field_disabled) {
        this.io.setBooleanField(this, 4, field_disabled);
        return this;
    }

    @Field(5)
    private Pointer gstcontrolbinding_field__gst_reserved() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    private GstControlBinding gstcontrolbinding_field__gst_reserved(Pointer gstcontrolbinding_field__gst_reserved) {
        this.io.setPointerField(this, 5, gstcontrolbinding_field__gst_reserved);
        return this;
    }

}
