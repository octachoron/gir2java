
package generated.gio20.gio;

import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GUnixConnection
    extends GSocketConnection
{


    public GUnixConnection() {
        super();
    }

    public GUnixConnection(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long g_unix_connection_receive_credentials(
        @Ptr
        long connection,
        @Ptr
        long cancellable);

    public Pointer<GCredentials> receive_credentials(Pointer<GCancellable> cancellable) {
        return Pointer.pointerToAddress(this.g_unix_connection_receive_credentials(Pointer.pointerTo(this, GUnixConnection.class), Pointer.getPeer(cancellable)), Pointer.class);
    }

    protected native void g_unix_connection_receive_credentials_async(
        @Ptr
        long connection,
        @Ptr
        long cancellable, Object callback, Pointer user_data);

    public void receive_credentials_async(Pointer<GCancellable> cancellable, Object callback, Pointer user_data) {
        this.g_unix_connection_receive_credentials_async(Pointer.pointerTo(this, GUnixConnection.class), Pointer.getPeer(cancellable), callback, user_data);
    }

    @Ptr
    protected native long g_unix_connection_receive_credentials_finish(
        @Ptr
        long connection,
        @Ptr
        long result);

    public Pointer<GCredentials> receive_credentials_finish(Pointer<Object> result) {
        return Pointer.pointerToAddress(this.g_unix_connection_receive_credentials_finish(Pointer.pointerTo(this, GUnixConnection.class), Pointer.getPeer(result)), Pointer.class);
    }

    protected native int g_unix_connection_receive_fd(
        @Ptr
        long connection,
        @Ptr
        long cancellable);

    public int receive_fd(Pointer<GCancellable> cancellable) {
        return this.g_unix_connection_receive_fd(Pointer.pointerTo(this, GUnixConnection.class), Pointer.getPeer(cancellable));
    }

    protected native boolean g_unix_connection_send_credentials(
        @Ptr
        long connection,
        @Ptr
        long cancellable);

    public boolean send_credentials(Pointer<GCancellable> cancellable) {
        return this.g_unix_connection_send_credentials(Pointer.pointerTo(this, GUnixConnection.class), Pointer.getPeer(cancellable));
    }

    protected native void g_unix_connection_send_credentials_async(
        @Ptr
        long connection,
        @Ptr
        long cancellable, Object callback, Pointer user_data);

    public void send_credentials_async(Pointer<GCancellable> cancellable, Object callback, Pointer user_data) {
        this.g_unix_connection_send_credentials_async(Pointer.pointerTo(this, GUnixConnection.class), Pointer.getPeer(cancellable), callback, user_data);
    }

    protected native boolean g_unix_connection_send_credentials_finish(
        @Ptr
        long connection,
        @Ptr
        long result);

    public boolean send_credentials_finish(Pointer<Object> result) {
        return this.g_unix_connection_send_credentials_finish(Pointer.pointerTo(this, GUnixConnection.class), Pointer.getPeer(result));
    }

    protected native boolean g_unix_connection_send_fd(
        @Ptr
        long connection, int fd,
        @Ptr
        long cancellable);

    public boolean send_fd(int fd, Pointer<GCancellable> cancellable) {
        return this.g_unix_connection_send_fd(Pointer.pointerTo(this, GUnixConnection.class), fd, Pointer.getPeer(cancellable));
    }

    @Field(0)
    public GSocketConnection field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GUnixConnection field_parent_instance(GSocketConnection field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GUnixConnection field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

}
