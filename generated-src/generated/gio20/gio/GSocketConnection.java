
package generated.gio20.gio;

import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GSocketConnection
    extends GIOStream
{


    public GSocketConnection() {
        super();
    }

    public GSocketConnection(Pointer pointer) {
        super(pointer);
    }

    protected native boolean g_socket_connection_connect(
        @Ptr
        long connection,
        @Ptr
        long address,
        @Ptr
        long cancellable);

    public boolean connect(Pointer<GSocketAddress> address, Pointer<GCancellable> cancellable) {
        return this.g_socket_connection_connect(Pointer.pointerTo(this, GSocketConnection.class), Pointer.getPeer(address), Pointer.getPeer(cancellable));
    }

    protected native void g_socket_connection_connect_async(
        @Ptr
        long connection,
        @Ptr
        long address,
        @Ptr
        long cancellable, Object callback, Pointer user_data);

    public void connect_async(Pointer<GSocketAddress> address, Pointer<GCancellable> cancellable, Object callback, Pointer user_data) {
        this.g_socket_connection_connect_async(Pointer.pointerTo(this, GSocketConnection.class), Pointer.getPeer(address), Pointer.getPeer(cancellable), callback, user_data);
    }

    protected native boolean g_socket_connection_connect_finish(
        @Ptr
        long connection,
        @Ptr
        long result);

    public boolean connect_finish(Pointer<Object> result) {
        return this.g_socket_connection_connect_finish(Pointer.pointerTo(this, GSocketConnection.class), Pointer.getPeer(result));
    }

    @Ptr
    protected native long g_socket_connection_get_local_address(
        @Ptr
        long connection);

    public Pointer<GSocketAddress> get_local_address() {
        return Pointer.pointerToAddress(this.g_socket_connection_get_local_address(Pointer.pointerTo(this, GSocketConnection.class)), Pointer.class);
    }

    @Ptr
    protected native long g_socket_connection_get_remote_address(
        @Ptr
        long connection);

    public Pointer<GSocketAddress> get_remote_address() {
        return Pointer.pointerToAddress(this.g_socket_connection_get_remote_address(Pointer.pointerTo(this, GSocketConnection.class)), Pointer.class);
    }

    @Ptr
    protected native long g_socket_connection_get_socket(
        @Ptr
        long connection);

    public Pointer<GSocket> get_socket() {
        return Pointer.pointerToAddress(this.g_socket_connection_get_socket(Pointer.pointerTo(this, GSocketConnection.class)), Pointer.class);
    }

    protected native boolean g_socket_connection_is_connected(
        @Ptr
        long connection);

    public boolean is_connected() {
        return this.g_socket_connection_is_connected(Pointer.pointerTo(this, GSocketConnection.class));
    }

    @Field(0)
    public GIOStream field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GSocketConnection field_parent_instance(GIOStream field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GSocketConnection field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

    public native long g_socket_connection_factory_lookup_type(IntValuedEnum<GSocketFamily> family, IntValuedEnum<GSocketType> type, int protocol_id);

    public native void g_socket_connection_factory_register_type(long g_type, IntValuedEnum<GSocketFamily> family, IntValuedEnum<GSocketType> type, int protocol);

}
