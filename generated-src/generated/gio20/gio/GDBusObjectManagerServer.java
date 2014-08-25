
package generated.gio20.gio;

import generated.gobject20.gobject.GObject;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GDBusObjectManagerServer
    extends GObject
{


    static {
        BridJ.register();
    }

    public GDBusObjectManagerServer() {
        super();
    }

    public GDBusObjectManagerServer(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_dbus_object_manager_server_new(
        @Ptr
        long object_path);

    public static Pointer gdbusobjectmanagerserver__new(Pointer object_path) {
        return Pointer.pointerToAddress(GDBusObjectManagerServer.g_dbus_object_manager_server_new(Pointer.getPeer(object_path)));
    }

    protected native void g_dbus_object_manager_server_export(
        @Ptr
        long manager,
        @Ptr
        long object);

    public void export(Pointer object) {
        this.g_dbus_object_manager_server_export(Pointer.pointerTo(this, GDBusObjectManagerServer.class).getPeer(), Pointer.getPeer(object));
    }

    protected native void g_dbus_object_manager_server_export_uniquely(
        @Ptr
        long manager,
        @Ptr
        long object);

    public void export_uniquely(Pointer object) {
        this.g_dbus_object_manager_server_export_uniquely(Pointer.pointerTo(this, GDBusObjectManagerServer.class).getPeer(), Pointer.getPeer(object));
    }

    @Ptr
    protected native long g_dbus_object_manager_server_get_connection(
        @Ptr
        long manager);

    public Pointer<GDBusConnection> get_connection() {
        return Pointer.pointerToAddress(this.g_dbus_object_manager_server_get_connection(Pointer.pointerTo(this, GDBusObjectManagerServer.class).getPeer()), GDBusConnection.class);
    }

    protected native boolean g_dbus_object_manager_server_is_exported(
        @Ptr
        long manager,
        @Ptr
        long object);

    public boolean is_exported(Pointer object) {
        return this.g_dbus_object_manager_server_is_exported(Pointer.pointerTo(this, GDBusObjectManagerServer.class).getPeer(), Pointer.getPeer(object));
    }

    protected native void g_dbus_object_manager_server_set_connection(
        @Ptr
        long manager,
        @Ptr
        long connection);

    public void set_connection(Pointer<GDBusConnection> connection) {
        this.g_dbus_object_manager_server_set_connection(Pointer.pointerTo(this, GDBusObjectManagerServer.class).getPeer(), Pointer.getPeer(connection));
    }

    protected native boolean g_dbus_object_manager_server_unexport(
        @Ptr
        long manager,
        @Ptr
        long object_path);

    public boolean unexport(Pointer object_path) {
        return this.g_dbus_object_manager_server_unexport(Pointer.pointerTo(this, GDBusObjectManagerServer.class).getPeer(), Pointer.getPeer(object_path));
    }

    @Field(0)
    private GObject gdbusobjectmanagerserver_field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    private GDBusObjectManagerServer gdbusobjectmanagerserver_field_parent_instance(GObject gdbusobjectmanagerserver_field_parent_instance) {
        this.io.setNativeObjectField(this, 0, gdbusobjectmanagerserver_field_parent_instance);
        return this;
    }

    @Field(1)
    private Pointer gdbusobjectmanagerserver_field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GDBusObjectManagerServer gdbusobjectmanagerserver_field_priv(Pointer gdbusobjectmanagerserver_field_priv) {
        this.io.setPointerField(this, 1, gdbusobjectmanagerserver_field_priv);
        return this;
    }

}
