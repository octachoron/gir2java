
package generated.gio20.gio;

import generated.glib20.glib.GVariant;
import generated.gobject20.gobject.GObject;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GDBusProxy
    extends GObject
{


    static {
        BridJ.register();
    }

    public GDBusProxy() {
        super();
    }

    public GDBusProxy(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_dbus_proxy_new_finish(
        @Ptr
        long res);

    public static Pointer new_finish(Pointer<Object> res) {
        return Pointer.pointerToAddress(GDBusProxy.g_dbus_proxy_new_finish(Pointer.getPeer(res)));
    }

    @Ptr
    protected static native long g_dbus_proxy_new_for_bus_finish(
        @Ptr
        long res);

    public static Pointer new_for_bus_finish(Pointer<Object> res) {
        return Pointer.pointerToAddress(GDBusProxy.g_dbus_proxy_new_for_bus_finish(Pointer.getPeer(res)));
    }

    protected native void g_dbus_proxy_call(
        @Ptr
        long proxy,
        @Ptr
        long method_name,
        @Ptr
        long parameters, IntValuedEnum<GDBusCallFlags> flags, int timeout_msec,
        @Ptr
        long cancellable,
        @Ptr
        long callback,
        @Ptr
        long user_data);

    public void call(Pointer method_name, Pointer<GVariant> parameters, IntValuedEnum<GDBusCallFlags> flags, int timeout_msec, Pointer<GCancellable> cancellable, Pointer callback, Pointer user_data) {
        this.g_dbus_proxy_call(Pointer.pointerTo(this, GDBusProxy.class).getPeer(), Pointer.getPeer(method_name), Pointer.getPeer(parameters), flags, timeout_msec, Pointer.getPeer(cancellable), Pointer.getPeer(callback), Pointer.getPeer(user_data));
    }

    @Ptr
    protected native long g_dbus_proxy_call_finish(
        @Ptr
        long proxy,
        @Ptr
        long res);

    public Pointer<GVariant> call_finish(Pointer<Object> res) {
        return Pointer.pointerToAddress(this.g_dbus_proxy_call_finish(Pointer.pointerTo(this, GDBusProxy.class).getPeer(), Pointer.getPeer(res)), GVariant.class);
    }

    @Ptr
    protected native long g_dbus_proxy_call_sync(
        @Ptr
        long proxy,
        @Ptr
        long method_name,
        @Ptr
        long parameters, IntValuedEnum<GDBusCallFlags> flags, int timeout_msec,
        @Ptr
        long cancellable);

    public Pointer<GVariant> call_sync(Pointer method_name, Pointer<GVariant> parameters, IntValuedEnum<GDBusCallFlags> flags, int timeout_msec, Pointer<GCancellable> cancellable) {
        return Pointer.pointerToAddress(this.g_dbus_proxy_call_sync(Pointer.pointerTo(this, GDBusProxy.class).getPeer(), Pointer.getPeer(method_name), Pointer.getPeer(parameters), flags, timeout_msec, Pointer.getPeer(cancellable)), GVariant.class);
    }

    protected native void g_dbus_proxy_call_with_unix_fd_list(
        @Ptr
        long proxy,
        @Ptr
        long method_name,
        @Ptr
        long parameters, IntValuedEnum<GDBusCallFlags> flags, int timeout_msec,
        @Ptr
        long fd_list,
        @Ptr
        long cancellable,
        @Ptr
        long callback,
        @Ptr
        long user_data);

    public void call_with_unix_fd_list(Pointer method_name, Pointer<GVariant> parameters, IntValuedEnum<GDBusCallFlags> flags, int timeout_msec, Pointer fd_list, Pointer<GCancellable> cancellable, Pointer callback, Pointer user_data) {
        this.g_dbus_proxy_call_with_unix_fd_list(Pointer.pointerTo(this, GDBusProxy.class).getPeer(), Pointer.getPeer(method_name), Pointer.getPeer(parameters), flags, timeout_msec, Pointer.getPeer(fd_list), Pointer.getPeer(cancellable), Pointer.getPeer(callback), Pointer.getPeer(user_data));
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
        return Pointer.pointerToAddress(this.g_dbus_proxy_call_with_unix_fd_list_finish(Pointer.pointerTo(this, GDBusProxy.class).getPeer(), Pointer.getPeer(out_fd_list), Pointer.getPeer(res)), GVariant.class);
    }

    @Ptr
    protected native long g_dbus_proxy_call_with_unix_fd_list_sync(
        @Ptr
        long proxy,
        @Ptr
        long method_name,
        @Ptr
        long parameters, IntValuedEnum<GDBusCallFlags> flags, int timeout_msec,
        @Ptr
        long fd_list,
        @Ptr
        long out_fd_list,
        @Ptr
        long cancellable);

    public Pointer<GVariant> call_with_unix_fd_list_sync(Pointer method_name, Pointer<GVariant> parameters, IntValuedEnum<GDBusCallFlags> flags, int timeout_msec, Pointer fd_list, Pointer out_fd_list, Pointer<GCancellable> cancellable) {
        return Pointer.pointerToAddress(this.g_dbus_proxy_call_with_unix_fd_list_sync(Pointer.pointerTo(this, GDBusProxy.class).getPeer(), Pointer.getPeer(method_name), Pointer.getPeer(parameters), flags, timeout_msec, Pointer.getPeer(fd_list), Pointer.getPeer(out_fd_list), Pointer.getPeer(cancellable)), GVariant.class);
    }

    @Ptr
    protected native long g_dbus_proxy_get_cached_property(
        @Ptr
        long proxy,
        @Ptr
        long property_name);

    public Pointer<GVariant> get_cached_property(Pointer property_name) {
        return Pointer.pointerToAddress(this.g_dbus_proxy_get_cached_property(Pointer.pointerTo(this, GDBusProxy.class).getPeer(), Pointer.getPeer(property_name)), GVariant.class);
    }

    @Ptr
    protected native long g_dbus_proxy_get_cached_property_names(
        @Ptr
        long proxy);

    public Pointer get_cached_property_names() {
        return Pointer.pointerToAddress(this.g_dbus_proxy_get_cached_property_names(Pointer.pointerTo(this, GDBusProxy.class).getPeer()));
    }

    @Ptr
    protected native long g_dbus_proxy_get_connection(
        @Ptr
        long proxy);

    public Pointer<GDBusConnection> get_connection() {
        return Pointer.pointerToAddress(this.g_dbus_proxy_get_connection(Pointer.pointerTo(this, GDBusProxy.class).getPeer()), GDBusConnection.class);
    }

    protected native int g_dbus_proxy_get_default_timeout(
        @Ptr
        long proxy);

    public int get_default_timeout() {
        return this.g_dbus_proxy_get_default_timeout(Pointer.pointerTo(this, GDBusProxy.class).getPeer());
    }

    @Ptr
    protected native long g_dbus_proxy_get_interface_info(
        @Ptr
        long proxy);

    public Pointer<GDBusInterfaceInfo> get_interface_info() {
        return Pointer.pointerToAddress(this.g_dbus_proxy_get_interface_info(Pointer.pointerTo(this, GDBusProxy.class).getPeer()), GDBusInterfaceInfo.class);
    }

    @Ptr
    protected native long g_dbus_proxy_get_interface_name(
        @Ptr
        long proxy);

    public Pointer get_interface_name() {
        return Pointer.pointerToAddress(this.g_dbus_proxy_get_interface_name(Pointer.pointerTo(this, GDBusProxy.class).getPeer()));
    }

    @Ptr
    protected native long g_dbus_proxy_get_name(
        @Ptr
        long proxy);

    public Pointer get_name() {
        return Pointer.pointerToAddress(this.g_dbus_proxy_get_name(Pointer.pointerTo(this, GDBusProxy.class).getPeer()));
    }

    @Ptr
    protected native long g_dbus_proxy_get_name_owner(
        @Ptr
        long proxy);

    public Pointer get_name_owner() {
        return Pointer.pointerToAddress(this.g_dbus_proxy_get_name_owner(Pointer.pointerTo(this, GDBusProxy.class).getPeer()));
    }

    @Ptr
    protected native long g_dbus_proxy_get_object_path(
        @Ptr
        long proxy);

    public Pointer get_object_path() {
        return Pointer.pointerToAddress(this.g_dbus_proxy_get_object_path(Pointer.pointerTo(this, GDBusProxy.class).getPeer()));
    }

    protected native void g_dbus_proxy_set_cached_property(
        @Ptr
        long proxy,
        @Ptr
        long property_name,
        @Ptr
        long value);

    public void set_cached_property(Pointer property_name, Pointer<GVariant> value) {
        this.g_dbus_proxy_set_cached_property(Pointer.pointerTo(this, GDBusProxy.class).getPeer(), Pointer.getPeer(property_name), Pointer.getPeer(value));
    }

    protected native void g_dbus_proxy_set_default_timeout(
        @Ptr
        long proxy, int timeout_msec);

    public void set_default_timeout(int timeout_msec) {
        this.g_dbus_proxy_set_default_timeout(Pointer.pointerTo(this, GDBusProxy.class).getPeer(), timeout_msec);
    }

    protected native void g_dbus_proxy_set_interface_info(
        @Ptr
        long proxy,
        @Ptr
        long info);

    public void set_interface_info(Pointer<GDBusInterfaceInfo> info) {
        this.g_dbus_proxy_set_interface_info(Pointer.pointerTo(this, GDBusProxy.class).getPeer(), Pointer.getPeer(info));
    }

    @Field(0)
    private GObject gdbusproxy_field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    private GDBusProxy gdbusproxy_field_parent_instance(GObject gdbusproxy_field_parent_instance) {
        this.io.setNativeObjectField(this, 0, gdbusproxy_field_parent_instance);
        return this;
    }

    @Field(1)
    private Pointer gdbusproxy_field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GDBusProxy gdbusproxy_field_priv(Pointer gdbusproxy_field_priv) {
        this.io.setPointerField(this, 1, gdbusproxy_field_priv);
        return this;
    }

    protected static native void g_dbus_proxy_new(
        @Ptr
        long connection, IntValuedEnum<GDBusProxyFlags> flags,
        @Ptr
        long info,
        @Ptr
        long name,
        @Ptr
        long object_path,
        @Ptr
        long interface_name,
        @Ptr
        long cancellable,
        @Ptr
        long callback,
        @Ptr
        long user_data);

    public static void gdbusproxy__new(Pointer<GDBusConnection> connection, IntValuedEnum<GDBusProxyFlags> flags, Pointer<GDBusInterfaceInfo> info, Pointer name, Pointer object_path, Pointer interface_name, Pointer<GCancellable> cancellable, Pointer callback, Pointer user_data) {
        GDBusProxy.g_dbus_proxy_new(Pointer.getPeer(connection), flags, Pointer.getPeer(info), Pointer.getPeer(name), Pointer.getPeer(object_path), Pointer.getPeer(interface_name), Pointer.getPeer(cancellable), Pointer.getPeer(callback), Pointer.getPeer(user_data));
    }

    protected static native void g_dbus_proxy_new_for_bus(IntValuedEnum<GBusType> bus_type, IntValuedEnum<GDBusProxyFlags> flags,
        @Ptr
        long info,
        @Ptr
        long name,
        @Ptr
        long object_path,
        @Ptr
        long interface_name,
        @Ptr
        long cancellable,
        @Ptr
        long callback,
        @Ptr
        long user_data);

    public static void new_for_bus(IntValuedEnum<GBusType> bus_type, IntValuedEnum<GDBusProxyFlags> flags, Pointer<GDBusInterfaceInfo> info, Pointer name, Pointer object_path, Pointer interface_name, Pointer<GCancellable> cancellable, Pointer callback, Pointer user_data) {
        GDBusProxy.g_dbus_proxy_new_for_bus(bus_type, flags, Pointer.getPeer(info), Pointer.getPeer(name), Pointer.getPeer(object_path), Pointer.getPeer(interface_name), Pointer.getPeer(cancellable), Pointer.getPeer(callback), Pointer.getPeer(user_data));
    }

    @Ptr
    protected static native long g_dbus_proxy_new_sync(
        @Ptr
        long connection, IntValuedEnum<GDBusProxyFlags> flags,
        @Ptr
        long info,
        @Ptr
        long name,
        @Ptr
        long object_path,
        @Ptr
        long interface_name,
        @Ptr
        long cancellable);

    public static Pointer<GDBusProxy> new_sync(Pointer<GDBusConnection> connection, IntValuedEnum<GDBusProxyFlags> flags, Pointer<GDBusInterfaceInfo> info, Pointer name, Pointer object_path, Pointer interface_name, Pointer<GCancellable> cancellable) {
        return Pointer.pointerToAddress(GDBusProxy.g_dbus_proxy_new_sync(Pointer.getPeer(connection), flags, Pointer.getPeer(info), Pointer.getPeer(name), Pointer.getPeer(object_path), Pointer.getPeer(interface_name), Pointer.getPeer(cancellable)), GDBusProxy.class);
    }

    protected native IntValuedEnum<GDBusProxyFlags> g_dbus_proxy_get_flags(
        @Ptr
        long proxy);

    public IntValuedEnum<GDBusProxyFlags> get_flags() {
        return this.g_dbus_proxy_get_flags(Pointer.pointerTo(this, GDBusProxy.class).getPeer());
    }

    @Ptr
    protected static native long g_dbus_proxy_new_for_bus_sync(IntValuedEnum<GBusType> bus_type, IntValuedEnum<GDBusProxyFlags> flags,
        @Ptr
        long info,
        @Ptr
        long name,
        @Ptr
        long object_path,
        @Ptr
        long interface_name,
        @Ptr
        long cancellable);

    public static Pointer<GDBusProxy> new_for_bus_sync(IntValuedEnum<GBusType> bus_type, IntValuedEnum<GDBusProxyFlags> flags, Pointer<GDBusInterfaceInfo> info, Pointer name, Pointer object_path, Pointer interface_name, Pointer<GCancellable> cancellable) {
        return Pointer.pointerToAddress(GDBusProxy.g_dbus_proxy_new_for_bus_sync(bus_type, flags, Pointer.getPeer(info), Pointer.getPeer(name), Pointer.getPeer(object_path), Pointer.getPeer(interface_name), Pointer.getPeer(cancellable)), GDBusProxy.class);
    }

}
