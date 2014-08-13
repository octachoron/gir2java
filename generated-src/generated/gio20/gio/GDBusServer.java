
package generated.gio20.gio;

import generated.gobject20.gobject.GObject;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GDBusServer
    extends GObject
{


    public GDBusServer() {
        super();
    }

    public GDBusServer(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long g_dbus_server_get_client_address(
        @Ptr
        long server);

    public Pointer get_client_address() {
        return Pointer.pointerToAddress(this.g_dbus_server_get_client_address(Pointer.pointerTo(this, GDBusServer.class)));
    }

    @Ptr
    protected native long g_dbus_server_get_guid(
        @Ptr
        long server);

    public Pointer get_guid() {
        return Pointer.pointerToAddress(this.g_dbus_server_get_guid(Pointer.pointerTo(this, GDBusServer.class)));
    }

    protected native boolean g_dbus_server_is_active(
        @Ptr
        long server);

    public boolean is_active() {
        return this.g_dbus_server_is_active(Pointer.pointerTo(this, GDBusServer.class));
    }

    protected native void g_dbus_server_start(
        @Ptr
        long server);

    public void start() {
        this.g_dbus_server_start(Pointer.pointerTo(this, GDBusServer.class));
    }

    protected native void g_dbus_server_stop(
        @Ptr
        long server);

    public void stop() {
        this.g_dbus_server_stop(Pointer.pointerTo(this, GDBusServer.class));
    }

    protected native Object g_dbus_server_get_flags(
        @Ptr
        long server);

    public Object get_flags() {
        return this.g_dbus_server_get_flags(Pointer.pointerTo(this, GDBusServer.class));
    }

}
