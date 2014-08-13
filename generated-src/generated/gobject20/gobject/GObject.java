
package generated.gobject20.gobject;

import generated.glib20.glib.GData;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gobject-2.0")
public class GObject
    extends StructObject
{


    public GObject() {
        super();
    }

    public GObject(Pointer pointer) {
        super(pointer);
    }

    public native long g_object_compat_control(long what, Pointer data);

    protected native Pointer g_object_connect(Pointer object,
        @Ptr
        long signal_spec, Object... varargs);

    public Pointer connect(Pointer object, Pointer signal_spec, Object... varargs) {
        return this.g_object_connect(object, Pointer.getPeer(signal_spec), varargs);
    }

    protected native void g_object_disconnect(Pointer object,
        @Ptr
        long signal_spec, Object... varargs);

    public void disconnect(Pointer object, Pointer signal_spec, Object... varargs) {
        this.g_object_disconnect(object, Pointer.getPeer(signal_spec), varargs);
    }

    protected native void g_object_get(Pointer object,
        @Ptr
        long first_property_name, Object... varargs);

    public void get(Pointer object, Pointer first_property_name, Object... varargs) {
        this.g_object_get(object, Pointer.getPeer(first_property_name), varargs);
    }

    @Ptr
    protected native long g_object_interface_find_property(Pointer g_iface,
        @Ptr
        long property_name);

    public Pointer interface_find_property(Pointer g_iface, Pointer property_name) {
        return Pointer.pointerToAddress(this.g_object_interface_find_property(g_iface, Pointer.getPeer(property_name)));
    }

    protected native void g_object_interface_install_property(Pointer g_iface,
        @Ptr
        long pspec);

    public void interface_install_property(Pointer g_iface, Pointer pspec) {
        this.g_object_interface_install_property(g_iface, Pointer.getPeer(pspec));
    }

    @Ptr
    protected native long g_object_interface_list_properties(Pointer g_iface,
        @Ptr
        long n_properties_p);

    public Pointer interface_list_properties(Pointer g_iface, Pointer<Long> n_properties_p) {
        return Pointer.pointerToAddress(this.g_object_interface_list_properties(g_iface, Pointer.getPeer(n_properties_p)));
    }

    protected native Pointer g_object_new(long object_type,
        @Ptr
        long first_property_name, Object... varargs);

    public Pointer _new(long object_type, Pointer first_property_name, Object... varargs) {
        return this.g_object_new(object_type, Pointer.getPeer(first_property_name), varargs);
    }

    protected native void g_object_set(Pointer object,
        @Ptr
        long first_property_name, Object... varargs);

    public void set(Pointer object, Pointer first_property_name, Object... varargs) {
        this.g_object_set(object, Pointer.getPeer(first_property_name), varargs);
    }

    protected native void g_object_add_weak_pointer(
        @Ptr
        long object, Pointer weak_pointer_location);

    public void add_weak_pointer(Pointer weak_pointer_location) {
        this.g_object_add_weak_pointer(Pointer.pointerTo(this, GObject.class), weak_pointer_location);
    }

    protected native Pointer g_object_dup_data(
        @Ptr
        long object,
        @Ptr
        long key, Object dup_func, Pointer user_data);

    public Pointer dup_data(Pointer key, Object dup_func, Pointer user_data) {
        return this.g_object_dup_data(Pointer.pointerTo(this, GObject.class), Pointer.getPeer(key), dup_func, user_data);
    }

    protected native Pointer g_object_dup_qdata(
        @Ptr
        long object, Object quark, Object dup_func, Pointer user_data);

    public Pointer dup_qdata(Object quark, Object dup_func, Pointer user_data) {
        return this.g_object_dup_qdata(Pointer.pointerTo(this, GObject.class), quark, dup_func, user_data);
    }

    protected native void g_object_force_floating(
        @Ptr
        long object);

    public void force_floating() {
        this.g_object_force_floating(Pointer.pointerTo(this, GObject.class));
    }

    protected native void g_object_freeze_notify(
        @Ptr
        long object);

    public void freeze_notify() {
        this.g_object_freeze_notify(Pointer.pointerTo(this, GObject.class));
    }

    protected native Pointer g_object_get_data(
        @Ptr
        long object,
        @Ptr
        long key);

    public Pointer get_data(Pointer key) {
        return this.g_object_get_data(Pointer.pointerTo(this, GObject.class), Pointer.getPeer(key));
    }

    protected native void g_object_get_property(
        @Ptr
        long object,
        @Ptr
        long property_name,
        @Ptr
        long value);

    public void get_property(Pointer property_name, Pointer value) {
        this.g_object_get_property(Pointer.pointerTo(this, GObject.class), Pointer.getPeer(property_name), Pointer.getPeer(value));
    }

    protected native Pointer g_object_get_qdata(
        @Ptr
        long object, Object quark);

    public Pointer get_qdata(Object quark) {
        return this.g_object_get_qdata(Pointer.pointerTo(this, GObject.class), quark);
    }

    protected native void g_object_notify(
        @Ptr
        long object,
        @Ptr
        long property_name);

    public void notify(Pointer property_name) {
        this.g_object_notify(Pointer.pointerTo(this, GObject.class), Pointer.getPeer(property_name));
    }

    protected native void g_object_notify_by_pspec(
        @Ptr
        long object,
        @Ptr
        long pspec);

    public void notify_by_pspec(Pointer pspec) {
        this.g_object_notify_by_pspec(Pointer.pointerTo(this, GObject.class), Pointer.getPeer(pspec));
    }

    protected native void g_object_remove_weak_pointer(
        @Ptr
        long object, Pointer weak_pointer_location);

    public void remove_weak_pointer(Pointer weak_pointer_location) {
        this.g_object_remove_weak_pointer(Pointer.pointerTo(this, GObject.class), weak_pointer_location);
    }

    protected native boolean g_object_replace_data(
        @Ptr
        long object,
        @Ptr
        long key, Pointer oldval, Pointer newval, Object destroy,
        @Ptr
        long old_destroy);

    public boolean replace_data(Pointer key, Pointer oldval, Pointer newval, Object destroy, Pointer<Object> old_destroy) {
        return this.g_object_replace_data(Pointer.pointerTo(this, GObject.class), Pointer.getPeer(key), oldval, newval, destroy, Pointer.getPeer(old_destroy));
    }

    protected native boolean g_object_replace_qdata(
        @Ptr
        long object, Object quark, Pointer oldval, Pointer newval, Object destroy,
        @Ptr
        long old_destroy);

    public boolean replace_qdata(Object quark, Pointer oldval, Pointer newval, Object destroy, Pointer<Object> old_destroy) {
        return this.g_object_replace_qdata(Pointer.pointerTo(this, GObject.class), quark, oldval, newval, destroy, Pointer.getPeer(old_destroy));
    }

    protected native void g_object_run_dispose(
        @Ptr
        long object);

    public void run_dispose() {
        this.g_object_run_dispose(Pointer.pointerTo(this, GObject.class));
    }

    protected native void g_object_set_data(
        @Ptr
        long object,
        @Ptr
        long key, Pointer data);

    public void set_data(Pointer key, Pointer data) {
        this.g_object_set_data(Pointer.pointerTo(this, GObject.class), Pointer.getPeer(key), data);
    }

    protected native void g_object_set_data_full(
        @Ptr
        long object,
        @Ptr
        long key, Pointer data, Object destroy);

    public void set_data_full(Pointer key, Pointer data, Object destroy) {
        this.g_object_set_data_full(Pointer.pointerTo(this, GObject.class), Pointer.getPeer(key), data, destroy);
    }

    protected native void g_object_set_property(
        @Ptr
        long object,
        @Ptr
        long property_name,
        @Ptr
        long value);

    public void set_property(Pointer property_name, Pointer value) {
        this.g_object_set_property(Pointer.pointerTo(this, GObject.class), Pointer.getPeer(property_name), Pointer.getPeer(value));
    }

    protected native void g_object_set_qdata(
        @Ptr
        long object, Object quark, Pointer data);

    public void set_qdata(Object quark, Pointer data) {
        this.g_object_set_qdata(Pointer.pointerTo(this, GObject.class), quark, data);
    }

    protected native void g_object_set_qdata_full(
        @Ptr
        long object, Object quark, Pointer data, Object destroy);

    public void set_qdata_full(Object quark, Pointer data, Object destroy) {
        this.g_object_set_qdata_full(Pointer.pointerTo(this, GObject.class), quark, data, destroy);
    }

    protected native Pointer g_object_steal_data(
        @Ptr
        long object,
        @Ptr
        long key);

    public Pointer steal_data(Pointer key) {
        return this.g_object_steal_data(Pointer.pointerTo(this, GObject.class), Pointer.getPeer(key));
    }

    protected native Pointer g_object_steal_qdata(
        @Ptr
        long object, Object quark);

    public Pointer steal_qdata(Object quark) {
        return this.g_object_steal_qdata(Pointer.pointerTo(this, GObject.class), quark);
    }

    protected native void g_object_thaw_notify(
        @Ptr
        long object);

    public void thaw_notify() {
        this.g_object_thaw_notify(Pointer.pointerTo(this, GObject.class));
    }

    protected native void g_object_watch_closure(
        @Ptr
        long object,
        @Ptr
        long closure);

    public void watch_closure(Pointer<GClosure> closure) {
        this.g_object_watch_closure(Pointer.pointerTo(this, GObject.class), Pointer.getPeer(closure));
    }

    @Field(0)
    public long field_ref_count() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GObject field_ref_count(long field_ref_count) {
        this.io.setNativeObjectField(this, 0, field_ref_count);
        return this;
    }

    public native GObject g_object_ref(GObject object);

    protected native void g_object_weak_unref(
        @Ptr
        long object, Object notify, Pointer data);

    public void weak_unref(Object notify, Pointer data) {
        this.g_object_weak_unref(Pointer.pointerTo(this, GObject.class), notify, data);
    }

    @Ptr
    protected native long g_object_bind_property_with_closures(GObject source,
        @Ptr
        long source_property, GObject target,
        @Ptr
        long target_property, Object flags,
        @Ptr
        long transform_to,
        @Ptr
        long transform_from);

    public Pointer<GBinding> bind_property_with_closures(Pointer source_property, GObject target, Pointer target_property, Object flags, Pointer<GClosure> transform_to, Pointer<GClosure> transform_from) {
        return Pointer.pointerToAddress(this.g_object_bind_property_with_closures(Pointer.pointerTo(this, GObject.class), Pointer.getPeer(source_property), target, Pointer.getPeer(target_property), flags, Pointer.getPeer(transform_to), Pointer.getPeer(transform_from)), Pointer.class);
    }

    protected native void g_object_weak_ref(
        @Ptr
        long object, Object notify, Pointer data);

    public void weak_ref(Object notify, Pointer data) {
        this.g_object_weak_ref(Pointer.pointerTo(this, GObject.class), notify, data);
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

    @Field(2)
    public GTypeInstance field_g_type_instance() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GObject field_g_type_instance(GTypeInstance field_g_type_instance) {
        this.io.setNativeObjectField(this, 2, field_g_type_instance);
        return this;
    }

    public native GObject g_object_ref_sink(GObject object);

    public native void g_object_unref(GObject object);

    @Ptr
    protected native long g_object_bind_property(GObject source,
        @Ptr
        long source_property, GObject target,
        @Ptr
        long target_property, Object flags);

    public Pointer<GBinding> bind_property(Pointer source_property, GObject target, Pointer target_property, Object flags) {
        return Pointer.pointerToAddress(this.g_object_bind_property(Pointer.pointerTo(this, GObject.class), Pointer.getPeer(source_property), target, Pointer.getPeer(target_property), flags), Pointer.class);
    }

    public native boolean g_object_is_floating(GObject object);

    @Ptr
    protected native long g_object_bind_property_full(GObject source,
        @Ptr
        long source_property, GObject target,
        @Ptr
        long target_property, Object flags, Object transform_to, Object transform_from, Pointer user_data, Object notify);

    public Pointer<GBinding> bind_property_full(Pointer source_property, GObject target, Pointer target_property, Object flags, Object transform_to, Object transform_from, Pointer user_data, Object notify) {
        return Pointer.pointerToAddress(this.g_object_bind_property_full(Pointer.pointerTo(this, GObject.class), Pointer.getPeer(source_property), target, Pointer.getPeer(target_property), flags, transform_to, transform_from, user_data, notify), Pointer.class);
    }

    protected native void g_object_remove_toggle_ref(
        @Ptr
        long object, Object notify, Pointer data);

    public void remove_toggle_ref(Object notify, Pointer data) {
        this.g_object_remove_toggle_ref(Pointer.pointerTo(this, GObject.class), notify, data);
    }

    protected native void g_object_add_toggle_ref(
        @Ptr
        long object, Object notify, Pointer data);

    public void add_toggle_ref(Object notify, Pointer data) {
        this.g_object_add_toggle_ref(Pointer.pointerTo(this, GObject.class), notify, data);
    }

}
