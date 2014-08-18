
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GTcpConnection
    extends GSocketConnection
{


    static {
        BridJ.register();
    }

    public GTcpConnection() {
        super();
    }

    public GTcpConnection(Pointer pointer) {
        super(pointer);
    }

    protected native boolean g_tcp_connection_get_graceful_disconnect(
        @Ptr
        long connection);

    public boolean get_graceful_disconnect() {
        return this.g_tcp_connection_get_graceful_disconnect(Pointer.pointerTo(this, GTcpConnection.class).getPeer());
    }

    protected native void g_tcp_connection_set_graceful_disconnect(
        @Ptr
        long connection, boolean graceful_disconnect);

    public void set_graceful_disconnect(boolean graceful_disconnect) {
        this.g_tcp_connection_set_graceful_disconnect(Pointer.pointerTo(this, GTcpConnection.class).getPeer(), graceful_disconnect);
    }

    @Field(0)
    public GSocketConnection gtcpconnection_field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GTcpConnection gtcpconnection_field_parent_instance(GSocketConnection gtcpconnection_field_parent_instance) {
        this.io.setNativeObjectField(this, 0, gtcpconnection_field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer gtcpconnection_field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GTcpConnection gtcpconnection_field_priv(Pointer gtcpconnection_field_priv) {
        this.io.setPointerField(this, 1, gtcpconnection_field_priv);
        return this;
    }

}
