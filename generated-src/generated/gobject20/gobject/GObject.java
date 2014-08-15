
package generated.gobject20.gobject;

import generated.glib20.glib.GData;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
import org.bridj.util.DefaultParameterizedType;

@Library("gobject-2.0")
public class GObject
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GObject() {
        super();
    }

    public GObject(Pointer pointer) {
        super(pointer);
    }

    protected native void g_object_freeze_notify(
        @Ptr
        long object);

    public void freeze_notify() {
        this.g_object_freeze_notify(Pointer.pointerTo(this, GObject.class).getPeer());
    }

    @Field(0)
    public long field_ref_count() {
        return this.io.getLongField(this, 0);
    }

    @Field(0)
    public GObject field_ref_count(long field_ref_count) {
        this.io.setLongField(this, 0, field_ref_count);
        return this;
    }

    protected static native void g_object_get(
        @Ptr
        long object,
        @Ptr
        long first_property_name, Object... varargs);

    public static void get(Pointer object, Pointer first_property_name, Object... varargs) {
        GObject.g_object_get(Pointer.getPeer(object), Pointer.getPeer(first_property_name), varargs);
    }

    protected native boolean g_object_replace_data(
        @Ptr
        long object,
        @Ptr
        long key,
        @Ptr
        long oldval,
        @Ptr
        long newval,
        @Ptr
        long destroy,
        @Ptr
        long old_destroy);

    public boolean replace_data(Pointer key, Pointer oldval, Pointer newval, Pointer destroy, Pointer old_destroy) {
        return this.g_object_replace_data(Pointer.pointerTo(this, GObject.class).getPeer(), Pointer.getPeer(key), Pointer.getPeer(oldval), Pointer.getPeer(newval), Pointer.getPeer(destroy), Pointer.getPeer(old_destroy));
    }

    protected static native long g_object_compat_control(long what,
        @Ptr
        long data);

    public static long compat_control(long what, Pointer data) {
        return GObject.g_object_compat_control(what, Pointer.getPeer(data));
    }

    @Ptr
    protected native long g_object_dup_qdata(
        @Ptr
        long object, long quark,
        @Ptr
        long dup_func,
        @Ptr
        long user_data);

    public Pointer dup_qdata(long quark, Pointer dup_func, Pointer user_data) {
        return Pointer.pointerToAddress(this.g_object_dup_qdata(Pointer.pointerTo(this, GObject.class).getPeer(), quark, Pointer.getPeer(dup_func), Pointer.getPeer(user_data)));
    }

    protected native void g_object_set_data_full(
        @Ptr
        long object,
        @Ptr
        long key,
        @Ptr
        long data,
        @Ptr
        long destroy);

    public void set_data_full(Pointer key, Pointer data, Pointer destroy) {
        this.g_object_set_data_full(Pointer.pointerTo(this, GObject.class).getPeer(), Pointer.getPeer(key), Pointer.getPeer(data), Pointer.getPeer(destroy));
    }

    protected static native void g_object_disconnect(
        @Ptr
        long object,
        @Ptr
        long signal_spec, Object... varargs);

    public static void disconnect(Pointer object, Pointer signal_spec, Object... varargs) {
        GObject.g_object_disconnect(Pointer.getPeer(object), Pointer.getPeer(signal_spec), varargs);
    }

    @Ptr
    protected static native long g_object_new(long object_type,
        @Ptr
        long first_property_name, Object... varargs);

    public static Pointer _new(long object_type, Pointer first_property_name, Object... varargs) {
        return Pointer.pointerToAddress(GObject.g_object_new(object_type, Pointer.getPeer(first_property_name), varargs));
    }

    protected native void g_object_force_floating(
        @Ptr
        long object);

    public void force_floating() {
        this.g_object_force_floating(Pointer.pointerTo(this, GObject.class).getPeer());
    }

    @Ptr
    protected static native long g_object_connect(
        @Ptr
        long object,
        @Ptr
        long signal_spec, Object... varargs);

    public static Pointer connect(Pointer object, Pointer signal_spec, Object... varargs) {
        return Pointer.pointerToAddress(GObject.g_object_connect(Pointer.getPeer(object), Pointer.getPeer(signal_spec), varargs));
    }

    @Field(1)
    public Pointer<GData> field_qdata() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GObject field_qdata(Pointer<GData> field_qdata) {
        this.io.setPointerField(this, 1, field_qdata);
        return this;
    }

    protected native void g_object_weak_ref(
        @Ptr
        long object,
        @Ptr
        long notify,
        @Ptr
        long data);

    public void weak_ref(Pointer notify, Pointer data) {
        this.g_object_weak_ref(Pointer.pointerTo(this, GObject.class).getPeer(), Pointer.getPeer(notify), Pointer.getPeer(data));
    }

    protected native void g_object_notify_by_pspec(
        @Ptr
        long object,
        @Ptr
        long pspec);

    public void notify_by_pspec(Pointer<GParamSpec> pspec) {
        this.g_object_notify_by_pspec(Pointer.pointerTo(this, GObject.class).getPeer(), Pointer.getPeer(pspec));
    }

    @Ptr
    protected native long g_object_dup_data(
        @Ptr
        long object,
        @Ptr
        long key,
        @Ptr
        long dup_func,
        @Ptr
        long user_data);

    public Pointer dup_data(Pointer key, Pointer dup_func, Pointer user_data) {
        return Pointer.pointerToAddress(this.g_object_dup_data(Pointer.pointerTo(this, GObject.class).getPeer(), Pointer.getPeer(key), Pointer.getPeer(dup_func), Pointer.getPeer(user_data)));
    }

    protected static native void g_object_set(
        @Ptr
        long object,
        @Ptr
        long first_property_name, Object... varargs);

    public static void set(Pointer object, Pointer first_property_name, Object... varargs) {
        GObject.g_object_set(Pointer.getPeer(object), Pointer.getPeer(first_property_name), varargs);
    }

    protected static native void g_object_interface_install_property(
        @Ptr
        long g_iface,
        @Ptr
        long pspec);

    public static void interface_install_property(Pointer g_iface, Pointer<GParamSpec> pspec) {
        GObject.g_object_interface_install_property(Pointer.getPeer(g_iface), Pointer.getPeer(pspec));
    }

    protected native boolean g_object_replace_qdata(
        @Ptr
        long object, long quark,
        @Ptr
        long oldval,
        @Ptr
        long newval,
        @Ptr
        long destroy,
        @Ptr
        long old_destroy);

    public boolean replace_qdata(long quark, Pointer oldval, Pointer newval, Pointer destroy, Pointer old_destroy) {
        return this.g_object_replace_qdata(Pointer.pointerTo(this, GObject.class).getPeer(), quark, Pointer.getPeer(oldval), Pointer.getPeer(newval), Pointer.getPeer(destroy), Pointer.getPeer(old_destroy));
    }

    @Ptr
    protected static native long g_object_interface_list_properties(
        @Ptr
        long g_iface,
        @Ptr
        long n_properties_p);

    public static Pointer<Pointer<GParamSpec>> interface_list_properties(Pointer g_iface, Pointer<Long> n_properties_p) {
        return Pointer.pointerToAddress(GObject.g_object_interface_list_properties(Pointer.getPeer(g_iface), Pointer.getPeer(n_properties_p)), DefaultParameterizedType.paramType(Pointer.class, GParamSpec.class));
    }

    protected native void g_object_set_data(
        @Ptr
        long object,
        @Ptr
        long key,
        @Ptr
        long data);

    public void set_data(Pointer key, Pointer data) {
        this.g_object_set_data(Pointer.pointerTo(this, GObject.class).getPeer(), Pointer.getPeer(key), Pointer.getPeer(data));
    }

    protected native void g_object_add_weak_pointer(
        @Ptr
        long object,
        @Ptr
        long weak_pointer_location);

    public void add_weak_pointer(Pointer weak_pointer_location) {
        this.g_object_add_weak_pointer(Pointer.pointerTo(this, GObject.class).getPeer(), Pointer.getPeer(weak_pointer_location));
    }

    @Ptr
    protected native long g_object_steal_qdata(
        @Ptr
        long object, long quark);

    public Pointer steal_qdata(long quark) {
        return Pointer.pointerToAddress(this.g_object_steal_qdata(Pointer.pointerTo(this, GObject.class).getPeer(), quark));
    }

    protected native void g_object_remove_toggle_ref(
        @Ptr
        long object,
        @Ptr
        long notify,
        @Ptr
        long data);

    public void remove_toggle_ref(Pointer notify, Pointer data) {
        this.g_object_remove_toggle_ref(Pointer.pointerTo(this, GObject.class).getPeer(), Pointer.getPeer(notify), Pointer.getPeer(data));
    }

    protected native void g_object_remove_weak_pointer(
        @Ptr
        long object,
        @Ptr
        long weak_pointer_location);

    public void remove_weak_pointer(Pointer weak_pointer_location) {
        this.g_object_remove_weak_pointer(Pointer.pointerTo(this, GObject.class).getPeer(), Pointer.getPeer(weak_pointer_location));
    }

    @Ptr
    protected native long g_object_get_data(
        @Ptr
        long object,
        @Ptr
        long key);

    public Pointer get_data(Pointer key) {
        return Pointer.pointerToAddress(this.g_object_get_data(Pointer.pointerTo(this, GObject.class).getPeer(), Pointer.getPeer(key)));
    }

    protected native void g_object_set_qdata_full(
        @Ptr
        long object, long quark,
        @Ptr
        long data,
        @Ptr
        long destroy);

    public void set_qdata_full(long quark, Pointer data, Pointer destroy) {
        this.g_object_set_qdata_full(Pointer.pointerTo(this, GObject.class).getPeer(), quark, Pointer.getPeer(data), Pointer.getPeer(destroy));
    }

    protected native void g_object_set_qdata(
        @Ptr
        long object, long quark,
        @Ptr
        long data);

    public void set_qdata(long quark, Pointer data) {
        this.g_object_set_qdata(Pointer.pointerTo(this, GObject.class).getPeer(), quark, Pointer.getPeer(data));
    }

    protected native void g_object_watch_closure(
        @Ptr
        long object,
        @Ptr
        long closure);

    public void watch_closure(Pointer<GClosure> closure) {
        this.g_object_watch_closure(Pointer.pointerTo(this, GObject.class).getPeer(), Pointer.getPeer(closure));
    }

    @Ptr
    protected native long g_object_get_qdata(
        @Ptr
        long object, long quark);

    public Pointer get_qdata(long quark) {
        return Pointer.pointerToAddress(this.g_object_get_qdata(Pointer.pointerTo(this, GObject.class).getPeer(), quark));
    }

    protected native void g_object_weak_unref(
        @Ptr
        long object,
        @Ptr
        long notify,
        @Ptr
        long data);

    public void weak_unref(Pointer notify, Pointer data) {
        this.g_object_weak_unref(Pointer.pointerTo(this, GObject.class).getPeer(), Pointer.getPeer(notify), Pointer.getPeer(data));
    }

    protected native void g_object_get_property(
        @Ptr
        long object,
        @Ptr
        long property_name,
        @Ptr
        long value);

    public void get_property(Pointer property_name, Pointer<GValue> value) {
        this.g_object_get_property(Pointer.pointerTo(this, GObject.class).getPeer(), Pointer.getPeer(property_name), Pointer.getPeer(value));
    }

    protected native void g_object_set_property(
        @Ptr
        long object,
        @Ptr
        long property_name,
        @Ptr
        long value);

    public void set_property(Pointer property_name, Pointer<GValue> value) {
        this.g_object_set_property(Pointer.pointerTo(this, GObject.class).getPeer(), Pointer.getPeer(property_name), Pointer.getPeer(value));
    }

    protected native void g_object_add_toggle_ref(
        @Ptr
        long object,
        @Ptr
        long notify,
        @Ptr
        long data);

    public void add_toggle_ref(Pointer notify, Pointer data) {
        this.g_object_add_toggle_ref(Pointer.pointerTo(this, GObject.class).getPeer(), Pointer.getPeer(notify), Pointer.getPeer(data));
    }

    protected native void g_object_notify(
        @Ptr
        long object,
        @Ptr
        long property_name);

    public void notify(Pointer property_name) {
        this.g_object_notify(Pointer.pointerTo(this, GObject.class).getPeer(), Pointer.getPeer(property_name));
    }

    protected native void g_object_thaw_notify(
        @Ptr
        long object);

    public void thaw_notify() {
        this.g_object_thaw_notify(Pointer.pointerTo(this, GObject.class).getPeer());
    }

    @Ptr
    protected native long g_object_steal_data(
        @Ptr
        long object,
        @Ptr
        long key);

    public Pointer steal_data(Pointer key) {
        return Pointer.pointerToAddress(this.g_object_steal_data(Pointer.pointerTo(this, GObject.class).getPeer(), Pointer.getPeer(key)));
    }

    protected native void g_object_run_dispose(
        @Ptr
        long object);

    public void run_dispose() {
        this.g_object_run_dispose(Pointer.pointerTo(this, GObject.class).getPeer());
    }

    @Ptr
    protected static native long g_object_interface_find_property(
        @Ptr
        long g_iface,
        @Ptr
        long property_name);

    public static Pointer<GParamSpec> interface_find_property(Pointer g_iface, Pointer property_name) {
        return Pointer.pointerToAddress(GObject.g_object_interface_find_property(Pointer.getPeer(g_iface), Pointer.getPeer(property_name)), GParamSpec.class);
    }

    @Field(2)
    public GTypeInstance field_g_type_instance() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GObject field_g_type_instance(GTypeInstance field_g_type_instance) {
        this.io.setNativeObjectField(this, 2, field_g_type_instance);
        return this;
    }

}
