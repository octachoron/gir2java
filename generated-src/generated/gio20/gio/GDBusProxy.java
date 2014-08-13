
package generated.gio20.gio;

import generated.glib20.glib.GVariant;
import generated.gobject20.gobject.GObject;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GDBusProxy
    extends GObject
{


    public GDBusProxy() {
        super();
    }

    public GDBusProxy(Pointer pointer) {
        super(pointer);
    }

    protected native void g_dbus_proxy_call(
        @Ptr
        long proxy,
        @Ptr
        long method_name,
        @Ptr
        long parameters, Object flags, int timeout_msec,
        @Ptr
        long cancellable, Object callback, Pointer user_data);

    public void call(Pointer method_name, Pointer<GVariant> parameters, Object flags, int timeout_msec, Pointer<GCancellable> cancellable, Object callback, Pointer user_data) {
        this.g_dbus_proxy_call(Pointer.pointerTo(this, GDBusProxy.class), Pointer.getPeer(method_name), Pointer.getPeer(parameters), flags, timeout_msec, Pointer.getPeer(cancellable), callback, user_data);
    }

    @Ptr
    protected native long g_dbus_proxy_call_finish(
        @Ptr
        long proxy,
        @Ptr
        long res);

    public Pointer<GVariant> call_finish(Pointer<Object> res) {
        return Pointer.pointerToAddress(this.g_dbus_proxy_call_finish(Pointer.pointerTo(this, GDBusProxy.class), Pointer.getPeer(res)), Pointer.class);
    }

    @Ptr
    protected native long g_dbus_proxy_call_sync(
        @Ptr
        long proxy,
        @Ptr
        long method_name,
        @Ptr
        long parameters, Object flags, int timeout_msec,
        @Ptr
        long cancellable);

    public Pointer<GVariant> call_sync(Pointer method_name, Pointer<GVariant> parameters, Object flags, int timeout_msec, Pointer<GCancellable> cancellable) {
        return Pointer.pointerToAddress(this.g_dbus_proxy_call_sync(Pointer.pointerTo(this, GDBusProxy.class), Pointer.getPeer(method_name), Pointer.getPeer(parameters), flags, timeout_msec, Pointer.getPeer(cancellable)), Pointer.class);
    }

    protected native void g_dbus_proxy_call_with_unix_fd_list(
        @Ptr
        long proxy,
        @Ptr
        long method_name,
        @Ptr
        long parameters, Object flags, int timeout_msec,
        @Ptr
        long fd_list,
        @Ptr
        long cancellable, Object callback, Pointer user_data);

    public void call_with_unix_fd_list(Pointer method_name, Pointer<GVariant> parameters, Object flags, int timeout_msec, Pointer fd_list, Pointer<GCancellable> cancellable, Object callback, Pointer user_data) {
        this.g_dbus_proxy_call_with_unix_fd_list(Pointer.pointerTo(this, GDBusProxy.class), Pointer.getPeer(method_name), Pointer.getPeer(parameters), flags, timeout_msec, Pointer.getPeer(fd_list), Pointer.getPeer(cancellable), callback, user_data);
    }

    @Ptr
    protected native long g_dbus_proxy_call_with_unix_fd_list_finish(
        @Ptr
        long proxy,
        @Ptr
        long out_fd_list,
        @Ptr
        long res);

    public Pointer<GVariant> call_with_unix_fd_list_finish(Pointer out_fd_list, Pointer<Object> res) {
        return Pointer.pointerToAddress(this.g_dbus_proxy_call_with_unix_fd_list_finish(Pointer.pointerTo(this, GDBusProxy.class), Pointer.getPeer(out_fd_list), Pointer.getPeer(res)), Pointer.class);
    }

    @Ptr
    protected native long g_dbus_proxy_call_with_unix_fd_list_sync(
        @Ptr
        long proxy,
        @Ptr
        long method_name,
        @Ptr
        long parameters, Object flags, int timeout_msec,
        @Ptr
        long fd_list,
        @Ptr
        long out_fd_list,
        @Ptr
        long cancellable);

    public Pointer<GVariant> call_with_unix_fd_list_sync(Pointer method_name, Pointer<GVariant> parameters, Object flags, int timeout_msec, Pointer fd_list, Pointer out_fd_list, Pointer<GCancellable> cancellable) {
        return Pointer.pointerToAddress(this.g_dbus_proxy_call_with_unix_fd_list_sync(Pointer.pointerTo(this, GDBusProxy.class), Pointer.getPeer(method_name), Pointer.getPeer(parameters), flags, timeout_msec, Pointer.getPeer(fd_list), Pointer.getPeer(out_fd_list), Pointer.getPeer(cancellable)), Pointer.class);
    }

    @Ptr
    protected native long g_dbus_proxy_get_cached_property(
        @Ptr
        long proxy,
        @Ptr
        long property_name);

    public Pointer<GVariant> get_cached_property(Pointer property_name) {
        return Pointer.pointerToAddress(this.g_dbus_proxy_get_cached_property(Pointer.pointerTo(this, GDBusProxy.class), Pointer.getPeer(property_name)), Pointer.class);
    }

    @Ptr
    protected native long g_dbus_proxy_get_cached_property_names(
        @Ptr
        long proxy);

    public Pointer get_cached_property_names() {
        return Pointer.pointerToAddress(this.g_dbus_proxy_get_cached_property_names(Pointer.pointerTo(this, GDBusProxy.class)));
    }

    @Ptr
    protected native long g_dbus_proxy_get_connection(
        @Ptr
        long proxy);

    public Pointer<GDBusConnection> get_connection() {
        return Pointer.pointerToAddress(this.g_dbus_proxy_get_connection(Pointer.pointerTo(this, GDBusProxy.class)), Pointer.class);
    }

    protected native int g_dbus_proxy_get_default_timeout(
        @Ptr
        long proxy);

    public int get_default_timeout() {
        return this.g_dbus_proxy_get_default_timeout(Pointer.pointerTo(this, GDBusProxy.class));
    }

    @Ptr
    protected native long g_dbus_proxy_get_interface_info(
        @Ptr
        long proxy);

    public Pointer<GDBusInterfaceInfo> get_interface_info() {
        return Pointer.pointerToAddress(this.g_dbus_proxy_get_interface_info(Pointer.pointerTo(this, GDBusProxy.class)), Pointer.class);
    }

    @Ptr
    protected native long g_dbus_proxy_get_interface_name(
        @Ptr
        long proxy);

    public Pointer get_interface_name() {
        return Pointer.pointerToAddress(this.g_dbus_proxy_get_interface_name(Pointer.pointerTo(this, GDBusProxy.class)));
    }

    @Ptr
    protected native long g_dbus_proxy_get_name(
        @Ptr
        long proxy);

    public Pointer get_name() {
        return Pointer.pointerToAddress(this.g_dbus_proxy_get_name(Pointer.pointerTo(this, GDBusProxy.class)));
    }

    @Ptr
    protected native long g_dbus_proxy_get_name_owner(
        @Ptr
        long proxy);

    public Pointer get_name_owner() {
        return Pointer.pointerToAddress(this.g_dbus_proxy_get_name_owner(Pointer.pointerTo(this, GDBusProxy.class)));
    }

    @Ptr
    protected native long g_dbus_proxy_get_object_path(
        @Ptr
        long proxy);

    public Pointer get_object_path() {
        return Pointer.pointerToAddress(this.g_dbus_proxy_get_object_path(Pointer.pointerTo(this, GDBusProxy.class)));
    }

    protected native void g_dbus_proxy_set_cached_property(
        @Ptr
        long proxy,
        @Ptr
        long property_name,
        @Ptr
        long value);

    public void set_cached_property(Pointer property_name, Pointer<GVariant> value) {
        this.g_dbus_proxy_set_cached_property(Pointer.pointerTo(this, GDBusProxy.class), Pointer.getPeer(property_name), Pointer.getPeer(value));
    }

    protected native void g_dbus_proxy_set_default_timeout(
        @Ptr
        long proxy, int timeout_msec);

    public void set_default_timeout(int timeout_msec) {
        this.g_dbus_proxy_set_default_timeout(Pointer.pointerTo(this, GDBusProxy.class), timeout_msec);
    }

    protected native void g_dbus_proxy_set_interface_info(
        @Ptr
        long proxy,
        @Ptr
        long info);

    public void set_interface_info(Pointer<GDBusInterfaceInfo> info) {
        this.g_dbus_proxy_set_interface_info(Pointer.pointerTo(this, GDBusProxy.class), Pointer.getPeer(info));
    }

    @Field(0)
    public GObject field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GDBusProxy field_parent_instance(GObject field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GDBusProxy field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

    protected native Object g_dbus_proxy_get_flags(
        @Ptr
        long proxy);

    public Object get_flags() {
        return this.g_dbus_proxy_get_flags(Pointer.pointerTo(this, GDBusProxy.class));
    }

    protected native void g_dbus_proxy_new(
        @Ptr
        long connection, Object flags,
        @Ptr
        long info,
        @Ptr
        long name,
        @Ptr
        long object_path,
        @Ptr
        long interface_name,
        @Ptr
        long cancellable, Object callback, Pointer user_data);

    public void _new(Pointer<GDBusConnection> connection, Object flags, Pointer<GDBusInterfaceInfo> info, Pointer name, Pointer object_path, Pointer interface_name, Pointer<GCancellable> cancellable, Object callback, Pointer user_data) {
        this.g_dbus_proxy_new(Pointer.getPeer(connection), flags, Pointer.getPeer(info), Pointer.getPeer(name), Pointer.getPeer(object_path), Pointer.getPeer(interface_name), Pointer.getPeer(cancellable), callback, user_data);
    }

    protected native void g_dbus_proxy_new_for_bus(IntValuedEnum<GBusType> bus_type, Object flags,
        @Ptr
        long info,
        @Ptr
        long name,
        @Ptr
        long object_path,
        @Ptr
        long interface_name,
        @Ptr
        long cancellable, Object callback, Pointer user_data);

    public void new_for_bus(IntValuedEnum<GBusType> bus_type, Object flags, Pointer<GDBusInterfaceInfo> info, Pointer name, Pointer object_path, Pointer interface_name, Pointer<GCancellable> cancellable, Object callback, Pointer user_data) {
        this.g_dbus_proxy_new_for_bus(bus_type, flags, Pointer.getPeer(info), Pointer.getPeer(name), Pointer.getPeer(object_path), Pointer.getPeer(interface_name), Pointer.getPeer(cancellable), callback, user_data);
    }

}
