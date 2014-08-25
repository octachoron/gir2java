
package generated.gio20.gio;

import generated.gobject20.gobject.GObject;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GSocketListener
    extends GObject
{


    static {
        BridJ.register();
    }

    public GSocketListener() {
        super();
    }

    public GSocketListener(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_socket_listener_new();

    public static Pointer gsocketlistener__new() {
        return Pointer.pointerToAddress(GSocketListener.g_socket_listener_new());
    }

    @Ptr
    protected native long g_socket_listener_accept(
        @Ptr
        long listener,
        @Ptr
        long source_object,
        @Ptr
        long cancellable);

    public Pointer<GSocketConnection> accept(Pointer<Pointer<GObject>> source_object, Pointer<GCancellable> cancellable) {
        return Pointer.pointerToAddress(this.g_socket_listener_accept(Pointer.pointerTo(this, GSocketListener.class).getPeer(), Pointer.getPeer(source_object), Pointer.getPeer(cancellable)), GSocketConnection.class);
    }

    protected native void g_socket_listener_accept_async(
        @Ptr
        long listener,
        @Ptr
        long cancellable,
        @Ptr
        long callback,
        @Ptr
        long user_data);

    public void accept_async(Pointer<GCancellable> cancellable, Pointer callback, Pointer user_data) {
        this.g_socket_listener_accept_async(Pointer.pointerTo(this, GSocketListener.class).getPeer(), Pointer.getPeer(cancellable), Pointer.getPeer(callback), Pointer.getPeer(user_data));
    }

    @Ptr
    protected native long g_socket_listener_accept_finish(
        @Ptr
        long listener,
        @Ptr
        long result,
        @Ptr
        long source_object);

    public Pointer<GSocketConnection> accept_finish(Pointer<Object> result, Pointer<Pointer<GObject>> source_object) {
        return Pointer.pointerToAddress(this.g_socket_listener_accept_finish(Pointer.pointerTo(this, GSocketListener.class).getPeer(), Pointer.getPeer(result), Pointer.getPeer(source_object)), GSocketConnection.class);
    }

    @Ptr
    protected native long g_socket_listener_accept_socket(
        @Ptr
        long listener,
        @Ptr
        long source_object,
        @Ptr
        long cancellable);

    public Pointer<GSocket> accept_socket(Pointer<Pointer<GObject>> source_object, Pointer<GCancellable> cancellable) {
        return Pointer.pointerToAddress(this.g_socket_listener_accept_socket(Pointer.pointerTo(this, GSocketListener.class).getPeer(), Pointer.getPeer(source_object), Pointer.getPeer(cancellable)), GSocket.class);
    }

    protected native void g_socket_listener_accept_socket_async(
        @Ptr
        long listener,
        @Ptr
        long cancellable,
        @Ptr
        long callback,
        @Ptr
        long user_data);

    public void accept_socket_async(Pointer<GCancellable> cancellable, Pointer callback, Pointer user_data) {
        this.g_socket_listener_accept_socket_async(Pointer.pointerTo(this, GSocketListener.class).getPeer(), Pointer.getPeer(cancellable), Pointer.getPeer(callback), Pointer.getPeer(user_data));
    }

    @Ptr
    protected native long g_socket_listener_accept_socket_finish(
        @Ptr
        long listener,
        @Ptr
        long result,
        @Ptr
        long source_object);

    public Pointer<GSocket> accept_socket_finish(Pointer<Object> result, Pointer<Pointer<GObject>> source_object) {
        return Pointer.pointerToAddress(this.g_socket_listener_accept_socket_finish(Pointer.pointerTo(this, GSocketListener.class).getPeer(), Pointer.getPeer(result), Pointer.getPeer(source_object)), GSocket.class);
    }

    protected native int g_socket_listener_add_any_inet_port(
        @Ptr
        long listener,
        @Ptr
        long source_object);

    public int add_any_inet_port(Pointer<GObject> source_object) {
        return this.g_socket_listener_add_any_inet_port(Pointer.pointerTo(this, GSocketListener.class).getPeer(), Pointer.getPeer(source_object));
    }

    protected native boolean g_socket_listener_add_inet_port(
        @Ptr
        long listener, int port,
        @Ptr
        long source_object);

    public boolean add_inet_port(int port, Pointer<GObject> source_object) {
        return this.g_socket_listener_add_inet_port(Pointer.pointerTo(this, GSocketListener.class).getPeer(), port, Pointer.getPeer(source_object));
    }

    protected native boolean g_socket_listener_add_socket(
        @Ptr
        long listener,
        @Ptr
        long socket,
        @Ptr
        long source_object);

    public boolean add_socket(Pointer<GSocket> socket, Pointer<GObject> source_object) {
        return this.g_socket_listener_add_socket(Pointer.pointerTo(this, GSocketListener.class).getPeer(), Pointer.getPeer(socket), Pointer.getPeer(source_object));
    }

    protected native void g_socket_listener_close(
        @Ptr
        long listener);

    public void close() {
        this.g_socket_listener_close(Pointer.pointerTo(this, GSocketListener.class).getPeer());
    }

    protected native void g_socket_listener_set_backlog(
        @Ptr
        long listener, int listen_backlog);

    public void set_backlog(int listen_backlog) {
        this.g_socket_listener_set_backlog(Pointer.pointerTo(this, GSocketListener.class).getPeer(), listen_backlog);
    }

    @Field(0)
    public GObject gsocketlistener_field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GSocketListener gsocketlistener_field_parent_instance(GObject gsocketlistener_field_parent_instance) {
        this.io.setNativeObjectField(this, 0, gsocketlistener_field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer gsocketlistener_field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GSocketListener gsocketlistener_field_priv(Pointer gsocketlistener_field_priv) {
        this.io.setPointerField(this, 1, gsocketlistener_field_priv);
        return this;
    }

    protected native boolean g_socket_listener_add_address(
        @Ptr
        long listener,
        @Ptr
        long address, IntValuedEnum<GSocketType> type, IntValuedEnum<GSocketProtocol> protocol,
        @Ptr
        long source_object,
        @Ptr
        long effective_address);

    public boolean add_address(Pointer<GSocketAddress> address, IntValuedEnum<GSocketType> type, IntValuedEnum<GSocketProtocol> protocol, Pointer<GObject> source_object, Pointer<Pointer<GSocketAddress>> effective_address) {
        return this.g_socket_listener_add_address(Pointer.pointerTo(this, GSocketListener.class).getPeer(), Pointer.getPeer(address), type, protocol, Pointer.getPeer(source_object), Pointer.getPeer(effective_address));
    }

}
