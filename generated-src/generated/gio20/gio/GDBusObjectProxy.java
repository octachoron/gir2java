
package generated.gio20.gio;

import generated.gobject20.gobject.GObject;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GDBusObjectProxy
    extends GObject
{


    static {
        BridJ.register();
    }

    public GDBusObjectProxy() {
        super();
    }

    public GDBusObjectProxy(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_dbus_object_proxy_new(
        @Ptr
        long connection,
        @Ptr
        long object_path);

    public static Pointer gdbusobjectproxy__new(Pointer<GDBusConnection> connection, Pointer object_path) {
        return Pointer.pointerToAddress(GDBusObjectProxy.g_dbus_object_proxy_new(Pointer.getPeer(connection), Pointer.getPeer(object_path)));
    }

    @Ptr
    protected native long g_dbus_object_proxy_get_connection(
        @Ptr
        long proxy);

    public Pointer<GDBusConnection> get_connection() {
        return Pointer.pointerToAddress(this.g_dbus_object_proxy_get_connection(Pointer.pointerTo(this, GDBusObjectProxy.class).getPeer()), GDBusConnection.class);
    }

    @Field(0)
    private GObject gdbusobjectproxy_field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    private GDBusObjectProxy gdbusobjectproxy_field_parent_instance(GObject gdbusobjectproxy_field_parent_instance) {
        this.io.setNativeObjectField(this, 0, gdbusobjectproxy_field_parent_instance);
        return this;
    }

    @Field(1)
    private Pointer gdbusobjectproxy_field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GDBusObjectProxy gdbusobjectproxy_field_priv(Pointer gdbusobjectproxy_field_priv) {
        this.io.setPointerField(this, 1, gdbusobjectproxy_field_priv);
        return this;
    }

}
