
package generated.gio20.gio;

import generated.gobject20.gobject.GObject;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GDBusObjectManagerClient
    extends GObject
{


    public GDBusObjectManagerClient() {
        super();
    }

    public GDBusObjectManagerClient(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long g_dbus_object_manager_client_get_connection(
        @Ptr
        long manager);

    public Pointer<GDBusConnection> get_connection() {
        return Pointer.pointerToAddress(this.g_dbus_object_manager_client_get_connection(Pointer.pointerTo(this, GDBusObjectManagerClient.class)), Pointer.class);
    }

    @Ptr
    protected native long g_dbus_object_manager_client_get_name(
        @Ptr
        long manager);

    public Pointer get_name() {
        return Pointer.pointerToAddress(this.g_dbus_object_manager_client_get_name(Pointer.pointerTo(this, GDBusObjectManagerClient.class)));
    }

    @Ptr
    protected native long g_dbus_object_manager_client_get_name_owner(
        @Ptr
        long manager);

    public Pointer get_name_owner() {
        return Pointer.pointerToAddress(this.g_dbus_object_manager_client_get_name_owner(Pointer.pointerTo(this, GDBusObjectManagerClient.class)));
    }

    @Field(0)
    public GObject field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GDBusObjectManagerClient field_parent_instance(GObject field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GDBusObjectManagerClient field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

    protected native void g_dbus_object_manager_client_new_for_bus(IntValuedEnum<GBusType> bus_type, Object flags,
        @Ptr
        long name,
        @Ptr
        long object_path, Object get_proxy_type_func, Pointer get_proxy_type_user_data, Object get_proxy_type_destroy_notify,
        @Ptr
        long cancellable, Object callback, Pointer user_data);

    public void new_for_bus(IntValuedEnum<GBusType> bus_type, Object flags, Pointer name, Pointer object_path, Object get_proxy_type_func, Pointer get_proxy_type_user_data, Object get_proxy_type_destroy_notify, Pointer<GCancellable> cancellable, Object callback, Pointer user_data) {
        this.g_dbus_object_manager_client_new_for_bus(bus_type, flags, Pointer.getPeer(name), Pointer.getPeer(object_path), get_proxy_type_func, get_proxy_type_user_data, get_proxy_type_destroy_notify, Pointer.getPeer(cancellable), callback, user_data);
    }

    protected native Object g_dbus_object_manager_client_get_flags(
        @Ptr
        long manager);

    public Object get_flags() {
        return this.g_dbus_object_manager_client_get_flags(Pointer.pointerTo(this, GDBusObjectManagerClient.class));
    }

    protected native void g_dbus_object_manager_client_new(
        @Ptr
        long connection, Object flags,
        @Ptr
        long name,
        @Ptr
        long object_path, Object get_proxy_type_func, Pointer get_proxy_type_user_data, Object get_proxy_type_destroy_notify,
        @Ptr
        long cancellable, Object callback, Pointer user_data);

    public void _new(Pointer<GDBusConnection> connection, Object flags, Pointer name, Pointer object_path, Object get_proxy_type_func, Pointer get_proxy_type_user_data, Object get_proxy_type_destroy_notify, Pointer<GCancellable> cancellable, Object callback, Pointer user_data) {
        this.g_dbus_object_manager_client_new(Pointer.getPeer(connection), flags, Pointer.getPeer(name), Pointer.getPeer(object_path), get_proxy_type_func, get_proxy_type_user_data, get_proxy_type_destroy_notify, Pointer.getPeer(cancellable), callback, user_data);
    }

}
