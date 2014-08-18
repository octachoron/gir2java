
package generated.gstreamer10.gst;

import generated.glib20.glib.GError;
import generated.glib20.glib.GList;
import generated.glib20.glib.GMutex;
import generated.gobject20.gobject.GInitiallyUnowned;
import generated.gobject20.gobject.GObject;
import generated.gobject20.gobject.GParamSpec;
import generated.gobject20.gobject.GValue;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstObject
    extends GInitiallyUnowned
{


    static {
        BridJ.register();
    }

    public GstObject() {
        super();
    }

    public GstObject(Pointer pointer) {
        super(pointer);
    }

    protected static native boolean gst_object_check_uniqueness(
        @Ptr
        long list,
        @Ptr
        long name);

    public static boolean check_uniqueness(Pointer<GList> list, Pointer name) {
        return GstObject.gst_object_check_uniqueness(Pointer.getPeer(list), Pointer.getPeer(name));
    }

    protected static native void gst_object_default_deep_notify(
        @Ptr
        long object,
        @Ptr
        long orig,
        @Ptr
        long pspec,
        @Ptr
        long excluded_props);

    public static void default_deep_notify(Pointer<GObject> object, Pointer orig, Pointer<GParamSpec> pspec, Pointer excluded_props) {
        GstObject.gst_object_default_deep_notify(Pointer.getPeer(object), Pointer.getPeer(orig), Pointer.getPeer(pspec), Pointer.getPeer(excluded_props));
    }

    @Ptr
    protected static native long gst_object_ref_sink(
        @Ptr
        long object);

    public static Pointer ref_sink(Pointer object) {
        return Pointer.pointerToAddress(GstObject.gst_object_ref_sink(Pointer.getPeer(object)));
    }

    protected static native boolean gst_object_replace(
        @Ptr
        long oldobj,
        @Ptr
        long newobj);

    public static boolean replace(Pointer oldobj, Pointer newobj) {
        return GstObject.gst_object_replace(Pointer.getPeer(oldobj), Pointer.getPeer(newobj));
    }

    protected native boolean gst_object_add_control_binding(
        @Ptr
        long object,
        @Ptr
        long binding);

    public boolean add_control_binding(Pointer binding) {
        return this.gst_object_add_control_binding(Pointer.pointerTo(this, GstObject.class).getPeer(), Pointer.getPeer(binding));
    }

    protected native void gst_object_default_error(
        @Ptr
        long source,
        @Ptr
        long error,
        @Ptr
        long debug);

    public void default_error(Pointer<GError> error, Pointer debug) {
        this.gst_object_default_error(Pointer.pointerTo(this, GstObject.class).getPeer(), Pointer.getPeer(error), Pointer.getPeer(debug));
    }

    @Ptr
    protected native long gst_object_get_control_binding(
        @Ptr
        long object,
        @Ptr
        long property_name);

    public Pointer get_control_binding(Pointer property_name) {
        return Pointer.pointerToAddress(this.gst_object_get_control_binding(Pointer.pointerTo(this, GstObject.class).getPeer(), Pointer.getPeer(property_name)));
    }

    protected native long gst_object_get_control_rate(
        @Ptr
        long object);

    public long get_control_rate() {
        return this.gst_object_get_control_rate(Pointer.pointerTo(this, GstObject.class).getPeer());
    }

    protected native boolean gst_object_get_g_value_array(
        @Ptr
        long object,
        @Ptr
        long property_name, long timestamp, long interval, long n_values,
        @Ptr
        long values);

    public boolean get_g_value_array(Pointer property_name, long timestamp, long interval, long n_values, Pointer<GValue> values) {
        return this.gst_object_get_g_value_array(Pointer.pointerTo(this, GstObject.class).getPeer(), Pointer.getPeer(property_name), timestamp, interval, n_values, Pointer.getPeer(values));
    }

    @Ptr
    protected native long gst_object_get_name(
        @Ptr
        long object);

    public Pointer get_name() {
        return Pointer.pointerToAddress(this.gst_object_get_name(Pointer.pointerTo(this, GstObject.class).getPeer()));
    }

    @Ptr
    protected native long gst_object_get_parent(
        @Ptr
        long object);

    public Pointer get_parent() {
        return Pointer.pointerToAddress(this.gst_object_get_parent(Pointer.pointerTo(this, GstObject.class).getPeer()));
    }

    @Ptr
    protected native long gst_object_get_path_string(
        @Ptr
        long object);

    public Pointer get_path_string() {
        return Pointer.pointerToAddress(this.gst_object_get_path_string(Pointer.pointerTo(this, GstObject.class).getPeer()));
    }

    @Ptr
    protected native long gst_object_get_value(
        @Ptr
        long object,
        @Ptr
        long property_name, long timestamp);

    public Pointer<GValue> get_value(Pointer property_name, long timestamp) {
        return Pointer.pointerToAddress(this.gst_object_get_value(Pointer.pointerTo(this, GstObject.class).getPeer(), Pointer.getPeer(property_name), timestamp), GValue.class);
    }

    protected native boolean gst_object_get_value_array(
        @Ptr
        long object,
        @Ptr
        long property_name, long timestamp, long interval, long n_values,
        @Ptr
        long values);

    public boolean get_value_array(Pointer property_name, long timestamp, long interval, long n_values, Pointer values) {
        return this.gst_object_get_value_array(Pointer.pointerTo(this, GstObject.class).getPeer(), Pointer.getPeer(property_name), timestamp, interval, n_values, Pointer.getPeer(values));
    }

    protected native boolean gst_object_has_active_control_bindings(
        @Ptr
        long object);

    public boolean has_active_control_bindings() {
        return this.gst_object_has_active_control_bindings(Pointer.pointerTo(this, GstObject.class).getPeer());
    }

    protected native boolean gst_object_has_ancestor(
        @Ptr
        long object,
        @Ptr
        long ancestor);

    public boolean has_ancestor(Pointer ancestor) {
        return this.gst_object_has_ancestor(Pointer.pointerTo(this, GstObject.class).getPeer(), Pointer.getPeer(ancestor));
    }

    protected native boolean gst_object_remove_control_binding(
        @Ptr
        long object,
        @Ptr
        long binding);

    public boolean remove_control_binding(Pointer binding) {
        return this.gst_object_remove_control_binding(Pointer.pointerTo(this, GstObject.class).getPeer(), Pointer.getPeer(binding));
    }

    protected native void gst_object_set_control_binding_disabled(
        @Ptr
        long object,
        @Ptr
        long property_name, boolean disabled);

    public void set_control_binding_disabled(Pointer property_name, boolean disabled) {
        this.gst_object_set_control_binding_disabled(Pointer.pointerTo(this, GstObject.class).getPeer(), Pointer.getPeer(property_name), disabled);
    }

    protected native void gst_object_set_control_bindings_disabled(
        @Ptr
        long object, boolean disabled);

    public void set_control_bindings_disabled(boolean disabled) {
        this.gst_object_set_control_bindings_disabled(Pointer.pointerTo(this, GstObject.class).getPeer(), disabled);
    }

    protected native void gst_object_set_control_rate(
        @Ptr
        long object, long control_rate);

    public void set_control_rate(long control_rate) {
        this.gst_object_set_control_rate(Pointer.pointerTo(this, GstObject.class).getPeer(), control_rate);
    }

    protected native boolean gst_object_set_name(
        @Ptr
        long object,
        @Ptr
        long name);

    public boolean set_name(Pointer name) {
        return this.gst_object_set_name(Pointer.pointerTo(this, GstObject.class).getPeer(), Pointer.getPeer(name));
    }

    protected native boolean gst_object_set_parent(
        @Ptr
        long object,
        @Ptr
        long parent);

    public boolean set_parent(Pointer parent) {
        return this.gst_object_set_parent(Pointer.pointerTo(this, GstObject.class).getPeer(), Pointer.getPeer(parent));
    }

    protected native long gst_object_suggest_next_sync(
        @Ptr
        long object);

    public long suggest_next_sync() {
        return this.gst_object_suggest_next_sync(Pointer.pointerTo(this, GstObject.class).getPeer());
    }

    protected native boolean gst_object_sync_values(
        @Ptr
        long object, long timestamp);

    public boolean sync_values(long timestamp) {
        return this.gst_object_sync_values(Pointer.pointerTo(this, GstObject.class).getPeer(), timestamp);
    }

    protected native void gst_object_unparent(
        @Ptr
        long object);

    public void unparent() {
        this.gst_object_unparent(Pointer.pointerTo(this, GstObject.class).getPeer());
    }

    @Field(0)
    public GInitiallyUnowned field_object() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstObject field_object(GInitiallyUnowned field_object) {
        this.io.setNativeObjectField(this, 0, field_object);
        return this;
    }

    @Field(1)
    public GMutex field_lock() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GstObject field_lock(GMutex field_lock) {
        this.io.setNativeObjectField(this, 1, field_lock);
        return this;
    }

    @Field(2)
    public Pointer field_name() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GstObject field_name(Pointer field_name) {
        this.io.setPointerField(this, 2, field_name);
        return this;
    }

    @Field(3)
    public Pointer field_parent() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public GstObject field_parent(Pointer field_parent) {
        this.io.setPointerField(this, 3, field_parent);
        return this;
    }

    @Field(4)
    public long field_flags() {
        return this.io.getLongField(this, 4);
    }

    @Field(4)
    public GstObject field_flags(long field_flags) {
        this.io.setLongField(this, 4, field_flags);
        return this;
    }

    @Field(5)
    private Pointer<GList> field_control_bindings() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    private GstObject field_control_bindings(Pointer<GList> field_control_bindings) {
        this.io.setPointerField(this, 5, field_control_bindings);
        return this;
    }

    @Field(6)
    private long field_control_rate() {
        return this.io.getLongField(this, 6);
    }

    @Field(6)
    private GstObject field_control_rate(long field_control_rate) {
        this.io.setLongField(this, 6, field_control_rate);
        return this;
    }

    @Field(7)
    private long field_last_sync() {
        return this.io.getLongField(this, 7);
    }

    @Field(7)
    private GstObject field_last_sync(long field_last_sync) {
        this.io.setLongField(this, 7, field_last_sync);
        return this;
    }

    @Field(8)
    private Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 8);
    }

    @Field(8)
    private GstObject field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 8, field__gst_reserved);
        return this;
    }

}
