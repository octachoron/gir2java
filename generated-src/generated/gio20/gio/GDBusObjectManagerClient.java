
package generated.gio20.gio;

import generated.gobject20.gobject.GObject;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GDBusObjectManagerClient
    extends GObject
{


    static {
        BridJ.register();
    }

    public GDBusObjectManagerClient() {
        super();
    }

    public GDBusObjectManagerClient(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_dbus_object_manager_client_new_finish(
        @Ptr
        long res);

    public static Pointer new_finish(Pointer<Object> res) {
        return Pointer.pointerToAddress(GDBusObjectManagerClient.g_dbus_object_manager_client_new_finish(Pointer.getPeer(res)));
    }

    @Ptr
    protected static native long g_dbus_object_manager_client_new_for_bus_finish(
        @Ptr
        long res);

    public static Pointer new_for_bus_finish(Pointer<Object> res) {
        return Pointer.pointerToAddress(GDBusObjectManagerClient.g_dbus_object_manager_client_new_for_bus_finish(Pointer.getPeer(res)));
    }

    @Ptr
    protected native long g_dbus_object_manager_client_get_connection(
        @Ptr
        long manager);

    public Pointer<GDBusConnection> get_connection() {
        return Pointer.pointerToAddress(this.g_dbus_object_manager_client_get_connection(Pointer.pointerTo(this, GDBusObjectManagerClient.class).getPeer()), GDBusConnection.class);
    }

    @Ptr
    protected native long g_dbus_object_manager_client_get_name(
        @Ptr
        long manager);

    public Pointer get_name() {
        return Pointer.pointerToAddress(this.g_dbus_object_manager_client_get_name(Pointer.pointerTo(this, GDBusObjectManagerClient.class).getPeer()));
    }

    @Ptr
    protected native long g_dbus_object_manager_client_get_name_owner(
        @Ptr
        long manager);

    public Pointer get_name_owner() {
        return Pointer.pointerToAddress(this.g_dbus_object_manager_client_get_name_owner(Pointer.pointerTo(this, GDBusObjectManagerClient.class).getPeer()));
    }

    @Field(0)
    private GObject gdbusobjectmanagerclient_field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    private GDBusObjectManagerClient gdbusobjectmanagerclient_field_parent_instance(GObject gdbusobjectmanagerclient_field_parent_instance) {
        this.io.setNativeObjectField(this, 0, gdbusobjectmanagerclient_field_parent_instance);
        return this;
    }

    @Field(1)
    private Pointer gdbusobjectmanagerclient_field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GDBusObjectManagerClient gdbusobjectmanagerclient_field_priv(Pointer gdbusobjectmanagerclient_field_priv) {
        this.io.setPointerField(this, 1, gdbusobjectmanagerclient_field_priv);
        return this;
    }

    @Ptr
    protected static native long g_dbus_object_manager_client_new_for_bus_sync(IntValuedEnum<GBusType> bus_type, IntValuedEnum<GDBusObjectManagerClientFlags> flags,
        @Ptr
        long name,
        @Ptr
        long object_path,
        @Ptr
        long get_proxy_type_func,
        @Ptr
        long get_proxy_type_user_data,
        @Ptr
        long get_proxy_type_destroy_notify,
        @Ptr
        long cancellable);

    public static Pointer<GDBusObjectManagerClient> new_for_bus_sync(IntValuedEnum<GBusType> bus_type, IntValuedEnum<GDBusObjectManagerClientFlags> flags, Pointer name, Pointer object_path, Pointer get_proxy_type_func, Pointer get_proxy_type_user_data, Pointer get_proxy_type_destroy_notify, Pointer<GCancellable> cancellable) {
        return Pointer.pointerToAddress(GDBusObjectManagerClient.g_dbus_object_manager_client_new_for_bus_sync(bus_type, flags, Pointer.getPeer(name), Pointer.getPeer(object_path), Pointer.getPeer(get_proxy_type_func), Pointer.getPeer(get_proxy_type_user_data), Pointer.getPeer(get_proxy_type_destroy_notify), Pointer.getPeer(cancellable)), GDBusObjectManagerClient.class);
    }

    @Ptr
    protected static native long g_dbus_object_manager_client_new_sync(
        @Ptr
        long connection, IntValuedEnum<GDBusObjectManagerClientFlags> flags,
        @Ptr
        long name,
        @Ptr
        long object_path,
        @Ptr
        long get_proxy_type_func,
        @Ptr
        long get_proxy_type_user_data,
        @Ptr
        long get_proxy_type_destroy_notify,
        @Ptr
        long cancellable);

    public static Pointer<GDBusObjectManagerClient> new_sync(Pointer<GDBusConnection> connection, IntValuedEnum<GDBusObjectManagerClientFlags> flags, Pointer name, Pointer object_path, Pointer get_proxy_type_func, Pointer get_proxy_type_user_data, Pointer get_proxy_type_destroy_notify, Pointer<GCancellable> cancellable) {
        return Pointer.pointerToAddress(GDBusObjectManagerClient.g_dbus_object_manager_client_new_sync(Pointer.getPeer(connection), flags, Pointer.getPeer(name), Pointer.getPeer(object_path), Pointer.getPeer(get_proxy_type_func), Pointer.getPeer(get_proxy_type_user_data), Pointer.getPeer(get_proxy_type_destroy_notify), Pointer.getPeer(cancellable)), GDBusObjectManagerClient.class);
    }

    protected static native void g_dbus_object_manager_client_new(
        @Ptr
        long connection, IntValuedEnum<GDBusObjectManagerClientFlags> flags,
        @Ptr
        long name,
        @Ptr
        long object_path,
        @Ptr
        long get_proxy_type_func,
        @Ptr
        long get_proxy_type_user_data,
        @Ptr
        long get_proxy_type_destroy_notify,
        @Ptr
        long cancellable,
        @Ptr
        long callback,
        @Ptr
        long user_data);

    public static void gdbusobjectmanagerclient__new(Pointer<GDBusConnection> connection, IntValuedEnum<GDBusObjectManagerClientFlags> flags, Pointer name, Pointer object_path, Pointer get_proxy_type_func, Pointer get_proxy_type_user_data, Pointer get_proxy_type_destroy_notify, Pointer<GCancellable> cancellable, Pointer callback, Pointer user_data) {
        GDBusObjectManagerClient.g_dbus_object_manager_client_new(Pointer.getPeer(connection), flags, Pointer.getPeer(name), Pointer.getPeer(object_path), Pointer.getPeer(get_proxy_type_func), Pointer.getPeer(get_proxy_type_user_data), Pointer.getPeer(get_proxy_type_destroy_notify), Pointer.getPeer(cancellable), Pointer.getPeer(callback), Pointer.getPeer(user_data));
    }

    protected static native void g_dbus_object_manager_client_new_for_bus(IntValuedEnum<GBusType> bus_type, IntValuedEnum<GDBusObjectManagerClientFlags> flags,
        @Ptr
        long name,
        @Ptr
        long object_path,
        @Ptr
        long get_proxy_type_func,
        @Ptr
        long get_proxy_type_user_data,
        @Ptr
        long get_proxy_type_destroy_notify,
        @Ptr
        long cancellable,
        @Ptr
        long callback,
        @Ptr
        long user_data);

    public static void new_for_bus(IntValuedEnum<GBusType> bus_type, IntValuedEnum<GDBusObjectManagerClientFlags> flags, Pointer name, Pointer object_path, Pointer get_proxy_type_func, Pointer get_proxy_type_user_data, Pointer get_proxy_type_destroy_notify, Pointer<GCancellable> cancellable, Pointer callback, Pointer user_data) {
        GDBusObjectManagerClient.g_dbus_object_manager_client_new_for_bus(bus_type, flags, Pointer.getPeer(name), Pointer.getPeer(object_path), Pointer.getPeer(get_proxy_type_func), Pointer.getPeer(get_proxy_type_user_data), Pointer.getPeer(get_proxy_type_destroy_notify), Pointer.getPeer(cancellable), Pointer.getPeer(callback), Pointer.getPeer(user_data));
    }

    protected native IntValuedEnum<GDBusObjectManagerClientFlags> g_dbus_object_manager_client_get_flags(
        @Ptr
        long manager);

    public IntValuedEnum<GDBusObjectManagerClientFlags> get_flags() {
        return this.g_dbus_object_manager_client_get_flags(Pointer.pointerTo(this, GDBusObjectManagerClient.class).getPeer());
    }

}
