
package generated.gio20.gio;

import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GTcpConnection
    extends GSocketConnection
{


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
        return this.g_tcp_connection_get_graceful_disconnect(Pointer.pointerTo(this, GTcpConnection.class));
    }

    protected native void g_tcp_connection_set_graceful_disconnect(
        @Ptr
        long connection, boolean graceful_disconnect);

    public void set_graceful_disconnect(boolean graceful_disconnect) {
        this.g_tcp_connection_set_graceful_disconnect(Pointer.pointerTo(this, GTcpConnection.class), graceful_disconnect);
    }

    @Field(0)
    public GSocketConnection field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GTcpConnection field_parent_instance(GSocketConnection field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GTcpConnection field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

}
