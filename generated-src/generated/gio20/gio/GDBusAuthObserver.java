
package generated.gio20.gio;

import generated.gobject20.gobject.GObject;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GDBusAuthObserver
    extends GObject
{


    static {
        BridJ.register();
    }

    public GDBusAuthObserver() {
        super();
    }

    public GDBusAuthObserver(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_dbus_auth_observer_new();

    public static Pointer gdbusauthobserver__new() {
        return Pointer.pointerToAddress(GDBusAuthObserver.g_dbus_auth_observer_new());
    }

    protected native boolean g_dbus_auth_observer_allow_mechanism(
        @Ptr
        long observer,
        @Ptr
        long mechanism);

    public boolean allow_mechanism(Pointer mechanism) {
        return this.g_dbus_auth_observer_allow_mechanism(Pointer.pointerTo(this, GDBusAuthObserver.class).getPeer(), Pointer.getPeer(mechanism));
    }

    protected native boolean g_dbus_auth_observer_authorize_authenticated_peer(
        @Ptr
        long observer,
        @Ptr
        long stream,
        @Ptr
        long credentials);

    public boolean authorize_authenticated_peer(Pointer stream, Pointer<GCredentials> credentials) {
        return this.g_dbus_auth_observer_authorize_authenticated_peer(Pointer.pointerTo(this, GDBusAuthObserver.class).getPeer(), Pointer.getPeer(stream), Pointer.getPeer(credentials));
    }

}
