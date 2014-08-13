
package generated.gio20.gio;

import generated.gobject20.gobject.GObject;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GSocketClient
    extends GObject
{


    public GSocketClient() {
        super();
    }

    public GSocketClient(Pointer pointer) {
        super(pointer);
    }

    protected native void g_socket_client_add_application_proxy(
        @Ptr
        long client,
        @Ptr
        long protocol);

    public void add_application_proxy(Pointer protocol) {
        this.g_socket_client_add_application_proxy(Pointer.pointerTo(this, GSocketClient.class), Pointer.getPeer(protocol));
    }

    @Ptr
    protected native long g_socket_client_connect(
        @Ptr
        long client,
        @Ptr
        long connectable,
        @Ptr
        long cancellable);

    public Pointer connect(Pointer connectable, Pointer<GCancellable> cancellable) {
        return Pointer.pointerToAddress(this.g_socket_client_connect(Pointer.pointerTo(this, GSocketClient.class), Pointer.getPeer(connectable), Pointer.getPeer(cancellable)));
    }

    protected native void g_socket_client_connect_async(
        @Ptr
        long client,
        @Ptr
        long connectable,
        @Ptr
        long cancellable, Object callback, Pointer user_data);

    public void connect_async(Pointer connectable, Pointer<GCancellable> cancellable, Object callback, Pointer user_data) {
        this.g_socket_client_connect_async(Pointer.pointerTo(this, GSocketClient.class), Pointer.getPeer(connectable), Pointer.getPeer(cancellable), callback, user_data);
    }

    @Ptr
    protected native long g_socket_client_connect_finish(
        @Ptr
        long client,
        @Ptr
        long result);

    public Pointer connect_finish(Pointer<Object> result) {
        return Pointer.pointerToAddress(this.g_socket_client_connect_finish(Pointer.pointerTo(this, GSocketClient.class), Pointer.getPeer(result)));
    }

    @Ptr
    protected native long g_socket_client_connect_to_host(
        @Ptr
        long client,
        @Ptr
        long host_and_port, int default_port,
        @Ptr
        long cancellable);

    public Pointer connect_to_host(Pointer host_and_port, int default_port, Pointer<GCancellable> cancellable) {
        return Pointer.pointerToAddress(this.g_socket_client_connect_to_host(Pointer.pointerTo(this, GSocketClient.class), Pointer.getPeer(host_and_port), default_port, Pointer.getPeer(cancellable)));
    }

    protected native void g_socket_client_connect_to_host_async(
        @Ptr
        long client,
        @Ptr
        long host_and_port, int default_port,
        @Ptr
        long cancellable, Object callback, Pointer user_data);

    public void connect_to_host_async(Pointer host_and_port, int default_port, Pointer<GCancellable> cancellable, Object callback, Pointer user_data) {
        this.g_socket_client_connect_to_host_async(Pointer.pointerTo(this, GSocketClient.class), Pointer.getPeer(host_and_port), default_port, Pointer.getPeer(cancellable), callback, user_data);
    }

    @Ptr
    protected native long g_socket_client_connect_to_host_finish(
        @Ptr
        long client,
        @Ptr
        long result);

    public Pointer connect_to_host_finish(Pointer<Object> result) {
        return Pointer.pointerToAddress(this.g_socket_client_connect_to_host_finish(Pointer.pointerTo(this, GSocketClient.class), Pointer.getPeer(result)));
    }

    @Ptr
    protected native long g_socket_client_connect_to_service(
        @Ptr
        long client,
        @Ptr
        long domain,
        @Ptr
        long service,
        @Ptr
        long cancellable);

    public Pointer connect_to_service(Pointer domain, Pointer service, Pointer<GCancellable> cancellable) {
        return Pointer.pointerToAddress(this.g_socket_client_connect_to_service(Pointer.pointerTo(this, GSocketClient.class), Pointer.getPeer(domain), Pointer.getPeer(service), Pointer.getPeer(cancellable)));
    }

    protected native void g_socket_client_connect_to_service_async(
        @Ptr
        long client,
        @Ptr
        long domain,
        @Ptr
        long service,
        @Ptr
        long cancellable, Object callback, Pointer user_data);

    public void connect_to_service_async(Pointer domain, Pointer service, Pointer<GCancellable> cancellable, Object callback, Pointer user_data) {
        this.g_socket_client_connect_to_service_async(Pointer.pointerTo(this, GSocketClient.class), Pointer.getPeer(domain), Pointer.getPeer(service), Pointer.getPeer(cancellable), callback, user_data);
    }

    @Ptr
    protected native long g_socket_client_connect_to_service_finish(
        @Ptr
        long client,
        @Ptr
        long result);

    public Pointer connect_to_service_finish(Pointer<Object> result) {
        return Pointer.pointerToAddress(this.g_socket_client_connect_to_service_finish(Pointer.pointerTo(this, GSocketClient.class), Pointer.getPeer(result)));
    }

    @Ptr
    protected native long g_socket_client_connect_to_uri(
        @Ptr
        long client,
        @Ptr
        long uri, int default_port,
        @Ptr
        long cancellable);

    public Pointer connect_to_uri(Pointer uri, int default_port, Pointer<GCancellable> cancellable) {
        return Pointer.pointerToAddress(this.g_socket_client_connect_to_uri(Pointer.pointerTo(this, GSocketClient.class), Pointer.getPeer(uri), default_port, Pointer.getPeer(cancellable)));
    }

    protected native void g_socket_client_connect_to_uri_async(
        @Ptr
        long client,
        @Ptr
        long uri, int default_port,
        @Ptr
        long cancellable, Object callback, Pointer user_data);

    public void connect_to_uri_async(Pointer uri, int default_port, Pointer<GCancellable> cancellable, Object callback, Pointer user_data) {
        this.g_socket_client_connect_to_uri_async(Pointer.pointerTo(this, GSocketClient.class), Pointer.getPeer(uri), default_port, Pointer.getPeer(cancellable), callback, user_data);
    }

    @Ptr
    protected native long g_socket_client_connect_to_uri_finish(
        @Ptr
        long client,
        @Ptr
        long result);

    public Pointer connect_to_uri_finish(Pointer<Object> result) {
        return Pointer.pointerToAddress(this.g_socket_client_connect_to_uri_finish(Pointer.pointerTo(this, GSocketClient.class), Pointer.getPeer(result)));
    }

    protected native boolean g_socket_client_get_enable_proxy(
        @Ptr
        long client);

    public boolean get_enable_proxy() {
        return this.g_socket_client_get_enable_proxy(Pointer.pointerTo(this, GSocketClient.class));
    }

    @Ptr
    protected native long g_socket_client_get_local_address(
        @Ptr
        long client);

    public Pointer<GSocketAddress> get_local_address() {
        return Pointer.pointerToAddress(this.g_socket_client_get_local_address(Pointer.pointerTo(this, GSocketClient.class)), Pointer.class);
    }

    @Ptr
    protected native long g_socket_client_get_proxy_resolver(
        @Ptr
        long client);

    public Pointer<Object> get_proxy_resolver() {
        return Pointer.pointerToAddress(this.g_socket_client_get_proxy_resolver(Pointer.pointerTo(this, GSocketClient.class)), Pointer.class);
    }

    protected native long g_socket_client_get_timeout(
        @Ptr
        long client);

    public long get_timeout() {
        return this.g_socket_client_get_timeout(Pointer.pointerTo(this, GSocketClient.class));
    }

    protected native boolean g_socket_client_get_tls(
        @Ptr
        long client);

    public boolean get_tls() {
        return this.g_socket_client_get_tls(Pointer.pointerTo(this, GSocketClient.class));
    }

    protected native void g_socket_client_set_enable_proxy(
        @Ptr
        long client, boolean enable);

    public void set_enable_proxy(boolean enable) {
        this.g_socket_client_set_enable_proxy(Pointer.pointerTo(this, GSocketClient.class), enable);
    }

    protected native void g_socket_client_set_local_address(
        @Ptr
        long client,
        @Ptr
        long address);

    public void set_local_address(Pointer<GSocketAddress> address) {
        this.g_socket_client_set_local_address(Pointer.pointerTo(this, GSocketClient.class), Pointer.getPeer(address));
    }

    protected native void g_socket_client_set_proxy_resolver(
        @Ptr
        long client,
        @Ptr
        long proxy_resolver);

    public void set_proxy_resolver(Pointer<Object> proxy_resolver) {
        this.g_socket_client_set_proxy_resolver(Pointer.pointerTo(this, GSocketClient.class), Pointer.getPeer(proxy_resolver));
    }

    protected native void g_socket_client_set_timeout(
        @Ptr
        long client, long timeout);

    public void set_timeout(long timeout) {
        this.g_socket_client_set_timeout(Pointer.pointerTo(this, GSocketClient.class), timeout);
    }

    protected native void g_socket_client_set_tls(
        @Ptr
        long client, boolean tls);

    public void set_tls(boolean tls) {
        this.g_socket_client_set_tls(Pointer.pointerTo(this, GSocketClient.class), tls);
    }

    @Field(0)
    public GObject field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GSocketClient field_parent_instance(GObject field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GSocketClient field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

    protected native IntValuedEnum<GSocketType> g_socket_client_get_socket_type(
        @Ptr
        long client);

    public IntValuedEnum<GSocketType> get_socket_type() {
        return this.g_socket_client_get_socket_type(Pointer.pointerTo(this, GSocketClient.class));
    }

    protected native IntValuedEnum<GSocketFamily> g_socket_client_get_family(
        @Ptr
        long client);

    public IntValuedEnum<GSocketFamily> get_family() {
        return this.g_socket_client_get_family(Pointer.pointerTo(this, GSocketClient.class));
    }

    protected native void g_socket_client_set_family(
        @Ptr
        long client, IntValuedEnum<GSocketFamily> family);

    public void set_family(IntValuedEnum<GSocketFamily> family) {
        this.g_socket_client_set_family(Pointer.pointerTo(this, GSocketClient.class), family);
    }

    protected native void g_socket_client_set_socket_type(
        @Ptr
        long client, IntValuedEnum<GSocketType> type);

    public void set_socket_type(IntValuedEnum<GSocketType> type) {
        this.g_socket_client_set_socket_type(Pointer.pointerTo(this, GSocketClient.class), type);
    }

    protected native IntValuedEnum<GSocketProtocol> g_socket_client_get_protocol(
        @Ptr
        long client);

    public IntValuedEnum<GSocketProtocol> get_protocol() {
        return this.g_socket_client_get_protocol(Pointer.pointerTo(this, GSocketClient.class));
    }

    protected native void g_socket_client_set_protocol(
        @Ptr
        long client, IntValuedEnum<GSocketProtocol> protocol);

    public void set_protocol(IntValuedEnum<GSocketProtocol> protocol) {
        this.g_socket_client_set_protocol(Pointer.pointerTo(this, GSocketClient.class), protocol);
    }

    protected native Object g_socket_client_get_tls_validation_flags(
        @Ptr
        long client);

    public Object get_tls_validation_flags() {
        return this.g_socket_client_get_tls_validation_flags(Pointer.pointerTo(this, GSocketClient.class));
    }

    protected native void g_socket_client_set_tls_validation_flags(
        @Ptr
        long client, Object flags);

    public void set_tls_validation_flags(Object flags) {
        this.g_socket_client_set_tls_validation_flags(Pointer.pointerTo(this, GSocketClient.class), flags);
    }

}
