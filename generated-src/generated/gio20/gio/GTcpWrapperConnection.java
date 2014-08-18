
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GTcpWrapperConnection
    extends GTcpConnection
{


    static {
        BridJ.register();
    }

    public GTcpWrapperConnection() {
        super();
    }

    public GTcpWrapperConnection(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_tcp_wrapper_connection_new(
        @Ptr
        long base_io_stream,
        @Ptr
        long socket);

    public static Pointer<GSocketConnection> gtcpwrapperconnection__new(Pointer<GIOStream> base_io_stream, Pointer<GSocket> socket) {
        return Pointer.pointerToAddress(GTcpWrapperConnection.g_tcp_wrapper_connection_new(Pointer.getPeer(base_io_stream), Pointer.getPeer(socket)), GSocketConnection.class);
    }

    @Ptr
    protected native long g_tcp_wrapper_connection_get_base_io_stream(
        @Ptr
        long conn);

    public Pointer<GIOStream> get_base_io_stream() {
        return Pointer.pointerToAddress(this.g_tcp_wrapper_connection_get_base_io_stream(Pointer.pointerTo(this, GTcpWrapperConnection.class).getPeer()), GIOStream.class);
    }

    @Field(0)
    public GTcpConnection gtcpwrapperconnection_field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GTcpWrapperConnection gtcpwrapperconnection_field_parent_instance(GTcpConnection gtcpwrapperconnection_field_parent_instance) {
        this.io.setNativeObjectField(this, 0, gtcpwrapperconnection_field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer gtcpwrapperconnection_field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GTcpWrapperConnection gtcpwrapperconnection_field_priv(Pointer gtcpwrapperconnection_field_priv) {
        this.io.setPointerField(this, 1, gtcpwrapperconnection_field_priv);
        return this;
    }

}
