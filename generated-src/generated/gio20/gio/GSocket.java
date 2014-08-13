
package generated.gio20.gio;

import generated.glib20.glib.GSource;
import generated.gobject20.gobject.GObject;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GSocket
    extends GObject
{


    public GSocket() {
        super();
    }

    public GSocket(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long g_socket_accept(
        @Ptr
        long socket,
        @Ptr
        long cancellable);

    public Pointer accept(Pointer<GCancellable> cancellable) {
        return Pointer.pointerToAddress(this.g_socket_accept(Pointer.pointerTo(this, GSocket.class), Pointer.getPeer(cancellable)));
    }

    protected native boolean g_socket_bind(
        @Ptr
        long socket,
        @Ptr
        long address, boolean allow_reuse);

    public boolean bind(Pointer address, boolean allow_reuse) {
        return this.g_socket_bind(Pointer.pointerTo(this, GSocket.class), Pointer.getPeer(address), allow_reuse);
    }

    protected native boolean g_socket_check_connect_result(
        @Ptr
        long socket);

    public boolean check_connect_result() {
        return this.g_socket_check_connect_result(Pointer.pointerTo(this, GSocket.class));
    }

    protected native boolean g_socket_close(
        @Ptr
        long socket);

    public boolean close() {
        return this.g_socket_close(Pointer.pointerTo(this, GSocket.class));
    }

    protected native Object g_socket_condition_check(
        @Ptr
        long socket, Object condition);

    public Object condition_check(Object condition) {
        return this.g_socket_condition_check(Pointer.pointerTo(this, GSocket.class), condition);
    }

    protected native boolean g_socket_condition_timed_wait(
        @Ptr
        long socket, Object condition, long timeout,
        @Ptr
        long cancellable);

    public boolean condition_timed_wait(Object condition, long timeout, Pointer<GCancellable> cancellable) {
        return this.g_socket_condition_timed_wait(Pointer.pointerTo(this, GSocket.class), condition, timeout, Pointer.getPeer(cancellable));
    }

    protected native boolean g_socket_condition_wait(
        @Ptr
        long socket, Object condition,
        @Ptr
        long cancellable);

    public boolean condition_wait(Object condition, Pointer<GCancellable> cancellable) {
        return this.g_socket_condition_wait(Pointer.pointerTo(this, GSocket.class), condition, Pointer.getPeer(cancellable));
    }

    protected native boolean g_socket_connect(
        @Ptr
        long socket,
        @Ptr
        long address,
        @Ptr
        long cancellable);

    public boolean connect(Pointer address, Pointer<GCancellable> cancellable) {
        return this.g_socket_connect(Pointer.pointerTo(this, GSocket.class), Pointer.getPeer(address), Pointer.getPeer(cancellable));
    }

    @Ptr
    protected native long g_socket_connection_factory_create_connection(
        @Ptr
        long socket);

    public Pointer connection_factory_create_connection() {
        return Pointer.pointerToAddress(this.g_socket_connection_factory_create_connection(Pointer.pointerTo(this, GSocket.class)));
    }

    @Ptr
    protected native long g_socket_create_source(
        @Ptr
        long socket, Object condition,
        @Ptr
        long cancellable);

    public Pointer<GSource> create_source(Object condition, Pointer<GCancellable> cancellable) {
        return Pointer.pointerToAddress(this.g_socket_create_source(Pointer.pointerTo(this, GSocket.class), condition, Pointer.getPeer(cancellable)), Pointer.class);
    }

    protected native long g_socket_get_available_bytes(
        @Ptr
        long socket);

    public long get_available_bytes() {
        return this.g_socket_get_available_bytes(Pointer.pointerTo(this, GSocket.class));
    }

    protected native boolean g_socket_get_blocking(
        @Ptr
        long socket);

    public boolean get_blocking() {
        return this.g_socket_get_blocking(Pointer.pointerTo(this, GSocket.class));
    }

    protected native boolean g_socket_get_broadcast(
        @Ptr
        long socket);

    public boolean get_broadcast() {
        return this.g_socket_get_broadcast(Pointer.pointerTo(this, GSocket.class));
    }

    @Ptr
    protected native long g_socket_get_credentials(
        @Ptr
        long socket);

    public Pointer<GCredentials> get_credentials() {
        return Pointer.pointerToAddress(this.g_socket_get_credentials(Pointer.pointerTo(this, GSocket.class)), Pointer.class);
    }

    protected native int g_socket_get_fd(
        @Ptr
        long socket);

    public int get_fd() {
        return this.g_socket_get_fd(Pointer.pointerTo(this, GSocket.class));
    }

    protected native boolean g_socket_get_keepalive(
        @Ptr
        long socket);

    public boolean get_keepalive() {
        return this.g_socket_get_keepalive(Pointer.pointerTo(this, GSocket.class));
    }

    protected native int g_socket_get_listen_backlog(
        @Ptr
        long socket);

    public int get_listen_backlog() {
        return this.g_socket_get_listen_backlog(Pointer.pointerTo(this, GSocket.class));
    }

    @Ptr
    protected native long g_socket_get_local_address(
        @Ptr
        long socket);

    public Pointer get_local_address() {
        return Pointer.pointerToAddress(this.g_socket_get_local_address(Pointer.pointerTo(this, GSocket.class)));
    }

    protected native boolean g_socket_get_multicast_loopback(
        @Ptr
        long socket);

    public boolean get_multicast_loopback() {
        return this.g_socket_get_multicast_loopback(Pointer.pointerTo(this, GSocket.class));
    }

    protected native long g_socket_get_multicast_ttl(
        @Ptr
        long socket);

    public long get_multicast_ttl() {
        return this.g_socket_get_multicast_ttl(Pointer.pointerTo(this, GSocket.class));
    }

    protected native boolean g_socket_get_option(
        @Ptr
        long socket, int level, int optname,
        @Ptr
        long value);

    public boolean get_option(int level, int optname, Pointer<Integer> value) {
        return this.g_socket_get_option(Pointer.pointerTo(this, GSocket.class), level, optname, Pointer.getPeer(value));
    }

    @Ptr
    protected native long g_socket_get_remote_address(
        @Ptr
        long socket);

    public Pointer get_remote_address() {
        return Pointer.pointerToAddress(this.g_socket_get_remote_address(Pointer.pointerTo(this, GSocket.class)));
    }

    protected native long g_socket_get_timeout(
        @Ptr
        long socket);

    public long get_timeout() {
        return this.g_socket_get_timeout(Pointer.pointerTo(this, GSocket.class));
    }

    protected native long g_socket_get_ttl(
        @Ptr
        long socket);

    public long get_ttl() {
        return this.g_socket_get_ttl(Pointer.pointerTo(this, GSocket.class));
    }

    protected native boolean g_socket_is_closed(
        @Ptr
        long socket);

    public boolean is_closed() {
        return this.g_socket_is_closed(Pointer.pointerTo(this, GSocket.class));
    }

    protected native boolean g_socket_is_connected(
        @Ptr
        long socket);

    public boolean is_connected() {
        return this.g_socket_is_connected(Pointer.pointerTo(this, GSocket.class));
    }

    protected native boolean g_socket_join_multicast_group(
        @Ptr
        long socket,
        @Ptr
        long group, boolean source_specific,
        @Ptr
        long iface);

    public boolean join_multicast_group(Pointer<GInetAddress> group, boolean source_specific, Pointer iface) {
        return this.g_socket_join_multicast_group(Pointer.pointerTo(this, GSocket.class), Pointer.getPeer(group), source_specific, Pointer.getPeer(iface));
    }

    protected native boolean g_socket_leave_multicast_group(
        @Ptr
        long socket,
        @Ptr
        long group, boolean source_specific,
        @Ptr
        long iface);

    public boolean leave_multicast_group(Pointer<GInetAddress> group, boolean source_specific, Pointer iface) {
        return this.g_socket_leave_multicast_group(Pointer.pointerTo(this, GSocket.class), Pointer.getPeer(group), source_specific, Pointer.getPeer(iface));
    }

    protected native boolean g_socket_listen(
        @Ptr
        long socket);

    public boolean listen() {
        return this.g_socket_listen(Pointer.pointerTo(this, GSocket.class));
    }

    protected native long g_socket_receive(
        @Ptr
        long socket,
        @Ptr
        long buffer, long size,
        @Ptr
        long cancellable);

    public long receive(short buffer, long size, Pointer<GCancellable> cancellable) {
        return this.g_socket_receive(Pointer.pointerTo(this, GSocket.class), Pointer.getPeer(buffer), size, Pointer.getPeer(cancellable));
    }

    protected native long g_socket_receive_from(
        @Ptr
        long socket,
        @Ptr
        long address,
        @Ptr
        long buffer, long size,
        @Ptr
        long cancellable);

    public long receive_from(Pointer address, short buffer, long size, Pointer<GCancellable> cancellable) {
        return this.g_socket_receive_from(Pointer.pointerTo(this, GSocket.class), Pointer.getPeer(address), Pointer.getPeer(buffer), size, Pointer.getPeer(cancellable));
    }

    protected native long g_socket_receive_message(
        @Ptr
        long socket,
        @Ptr
        long address,
        @Ptr
        long vectors, int num_vectors,
        @Ptr
        long messages,
        @Ptr
        long num_messages,
        @Ptr
        long flags,
        @Ptr
        long cancellable);

    public long receive_message(Pointer address, GInputVector vectors, int num_vectors, Pointer messages, Pointer<Integer> num_messages, Pointer<Integer> flags, Pointer<GCancellable> cancellable) {
        return this.g_socket_receive_message(Pointer.pointerTo(this, GSocket.class), Pointer.getPeer(address), Pointer.getPeer(vectors), num_vectors, Pointer.getPeer(messages), Pointer.getPeer(num_messages), Pointer.getPeer(flags), Pointer.getPeer(cancellable));
    }

    protected native long g_socket_receive_with_blocking(
        @Ptr
        long socket,
        @Ptr
        long buffer, long size, boolean blocking,
        @Ptr
        long cancellable);

    public long receive_with_blocking(short buffer, long size, boolean blocking, Pointer<GCancellable> cancellable) {
        return this.g_socket_receive_with_blocking(Pointer.pointerTo(this, GSocket.class), Pointer.getPeer(buffer), size, blocking, Pointer.getPeer(cancellable));
    }

    protected native long g_socket_send(
        @Ptr
        long socket,
        @Ptr
        long buffer, long size,
        @Ptr
        long cancellable);

    public long send(short buffer, long size, Pointer<GCancellable> cancellable) {
        return this.g_socket_send(Pointer.pointerTo(this, GSocket.class), Pointer.getPeer(buffer), size, Pointer.getPeer(cancellable));
    }

    protected native long g_socket_send_message(
        @Ptr
        long socket,
        @Ptr
        long address,
        @Ptr
        long vectors, int num_vectors,
        @Ptr
        long messages, int num_messages, int flags,
        @Ptr
        long cancellable);

    public long send_message(Pointer address, GOutputVector vectors, int num_vectors, Pointer messages, int num_messages, int flags, Pointer<GCancellable> cancellable) {
        return this.g_socket_send_message(Pointer.pointerTo(this, GSocket.class), Pointer.getPeer(address), Pointer.getPeer(vectors), num_vectors, Pointer.getPeer(messages), num_messages, flags, Pointer.getPeer(cancellable));
    }

    protected native long g_socket_send_to(
        @Ptr
        long socket,
        @Ptr
        long address,
        @Ptr
        long buffer, long size,
        @Ptr
        long cancellable);

    public long send_to(Pointer address, short buffer, long size, Pointer<GCancellable> cancellable) {
        return this.g_socket_send_to(Pointer.pointerTo(this, GSocket.class), Pointer.getPeer(address), Pointer.getPeer(buffer), size, Pointer.getPeer(cancellable));
    }

    protected native long g_socket_send_with_blocking(
        @Ptr
        long socket,
        @Ptr
        long buffer, long size, boolean blocking,
        @Ptr
        long cancellable);

    public long send_with_blocking(short buffer, long size, boolean blocking, Pointer<GCancellable> cancellable) {
        return this.g_socket_send_with_blocking(Pointer.pointerTo(this, GSocket.class), Pointer.getPeer(buffer), size, blocking, Pointer.getPeer(cancellable));
    }

    protected native void g_socket_set_blocking(
        @Ptr
        long socket, boolean blocking);

    public void set_blocking(boolean blocking) {
        this.g_socket_set_blocking(Pointer.pointerTo(this, GSocket.class), blocking);
    }

    protected native void g_socket_set_broadcast(
        @Ptr
        long socket, boolean broadcast);

    public void set_broadcast(boolean broadcast) {
        this.g_socket_set_broadcast(Pointer.pointerTo(this, GSocket.class), broadcast);
    }

    protected native void g_socket_set_keepalive(
        @Ptr
        long socket, boolean keepalive);

    public void set_keepalive(boolean keepalive) {
        this.g_socket_set_keepalive(Pointer.pointerTo(this, GSocket.class), keepalive);
    }

    protected native void g_socket_set_listen_backlog(
        @Ptr
        long socket, int backlog);

    public void set_listen_backlog(int backlog) {
        this.g_socket_set_listen_backlog(Pointer.pointerTo(this, GSocket.class), backlog);
    }

    protected native void g_socket_set_multicast_loopback(
        @Ptr
        long socket, boolean loopback);

    public void set_multicast_loopback(boolean loopback) {
        this.g_socket_set_multicast_loopback(Pointer.pointerTo(this, GSocket.class), loopback);
    }

    protected native void g_socket_set_multicast_ttl(
        @Ptr
        long socket, long ttl);

    public void set_multicast_ttl(long ttl) {
        this.g_socket_set_multicast_ttl(Pointer.pointerTo(this, GSocket.class), ttl);
    }

    protected native boolean g_socket_set_option(
        @Ptr
        long socket, int level, int optname, int value);

    public boolean set_option(int level, int optname, int value) {
        return this.g_socket_set_option(Pointer.pointerTo(this, GSocket.class), level, optname, value);
    }

    protected native void g_socket_set_timeout(
        @Ptr
        long socket, long timeout);

    public void set_timeout(long timeout) {
        this.g_socket_set_timeout(Pointer.pointerTo(this, GSocket.class), timeout);
    }

    protected native void g_socket_set_ttl(
        @Ptr
        long socket, long ttl);

    public void set_ttl(long ttl) {
        this.g_socket_set_ttl(Pointer.pointerTo(this, GSocket.class), ttl);
    }

    protected native boolean g_socket_shutdown(
        @Ptr
        long socket, boolean shutdown_read, boolean shutdown_write);

    public boolean shutdown(boolean shutdown_read, boolean shutdown_write) {
        return this.g_socket_shutdown(Pointer.pointerTo(this, GSocket.class), shutdown_read, shutdown_write);
    }

    protected native boolean g_socket_speaks_ipv4(
        @Ptr
        long socket);

    public boolean speaks_ipv4() {
        return this.g_socket_speaks_ipv4(Pointer.pointerTo(this, GSocket.class));
    }

    @Field(0)
    public GObject field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GSocket field_parent_instance(GObject field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GSocket field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

    protected native IntValuedEnum<GSocketProtocol> g_socket_get_protocol(
        @Ptr
        long socket);

    public IntValuedEnum<GSocketProtocol> get_protocol() {
        return this.g_socket_get_protocol(Pointer.pointerTo(this, GSocket.class));
    }

    protected native IntValuedEnum<GSocketType> g_socket_get_socket_type(
        @Ptr
        long socket);

    public IntValuedEnum<GSocketType> get_socket_type() {
        return this.g_socket_get_socket_type(Pointer.pointerTo(this, GSocket.class));
    }

    protected native IntValuedEnum<GSocketFamily> g_socket_get_family(
        @Ptr
        long socket);

    public IntValuedEnum<GSocketFamily> get_family() {
        return this.g_socket_get_family(Pointer.pointerTo(this, GSocket.class));
    }

}
