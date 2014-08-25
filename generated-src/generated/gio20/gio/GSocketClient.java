
package generated.gio20.gio;

import generated.gobject20.gobject.GObject;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GSocketClient
    extends GObject
{


    static {
        BridJ.register();
    }

    public GSocketClient() {
        super();
    }

    public GSocketClient(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_socket_client_new();

    public static Pointer gsocketclient__new() {
        return Pointer.pointerToAddress(GSocketClient.g_socket_client_new());
    }

    protected native void g_socket_client_add_application_proxy(
        @Ptr
        long client,
        @Ptr
        long protocol);

    public void add_application_proxy(Pointer protocol) {
        this.g_socket_client_add_application_proxy(Pointer.pointerTo(this, GSocketClient.class).getPeer(), Pointer.getPeer(protocol));
    }

    @Ptr
    protected native long g_socket_client_connect(
        @Ptr
        long client,
        @Ptr
        long connectable,
        @Ptr
        long cancellable);

    public Pointer gsocketclient_connect(Pointer connectable, Pointer<GCancellable> cancellable) {
        return Pointer.pointerToAddress(this.g_socket_client_connect(Pointer.pointerTo(this, GSocketClient.class).getPeer(), Pointer.getPeer(connectable), Pointer.getPeer(cancellable)));
    }

    protected native void g_socket_client_connect_async(
        @Ptr
        long client,
        @Ptr
        long connectable,
        @Ptr
        long cancellable,
        @Ptr
        long callback,
        @Ptr
        long user_data);

    public void connect_async(Pointer connectable, Pointer<GCancellable> cancellable, Pointer callback, Pointer user_data) {
        this.g_socket_client_connect_async(Pointer.pointerTo(this, GSocketClient.class).getPeer(), Pointer.getPeer(connectable), Pointer.getPeer(cancellable), Pointer.getPeer(callback), Pointer.getPeer(user_data));
    }

    @Ptr
    protected native long g_socket_client_connect_finish(
        @Ptr
        long client,
        @Ptr
        long result);

    public Pointer connect_finish(Pointer<Object> result) {
        return Pointer.pointerToAddress(this.g_socket_client_connect_finish(Pointer.pointerTo(this, GSocketClient.class).getPeer(), Pointer.getPeer(result)));
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
        return Pointer.pointerToAddress(this.g_socket_client_connect_to_host(Pointer.pointerTo(this, GSocketClient.class).getPeer(), Pointer.getPeer(host_and_port), default_port, Pointer.getPeer(cancellable)));
    }

    protected native void g_socket_client_connect_to_host_async(
        @Ptr
        long client,
        @Ptr
        long host_and_port, int default_port,
        @Ptr
        long cancellable,
        @Ptr
        long callback,
        @Ptr
        long user_data);

    public void connect_to_host_async(Pointer host_and_port, int default_port, Pointer<GCancellable> cancellable, Pointer callback, Pointer user_data) {
        this.g_socket_client_connect_to_host_async(Pointer.pointerTo(this, GSocketClient.class).getPeer(), Pointer.getPeer(host_and_port), default_port, Pointer.getPeer(cancellable), Pointer.getPeer(callback), Pointer.getPeer(user_data));
    }

    @Ptr
    protected native long g_socket_client_connect_to_host_finish(
        @Ptr
        long client,
        @Ptr
        long result);

    public Pointer connect_to_host_finish(Pointer<Object> result) {
        return Pointer.pointerToAddress(this.g_socket_client_connect_to_host_finish(Pointer.pointerTo(this, GSocketClient.class).getPeer(), Pointer.getPeer(result)));
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
        return Pointer.pointerToAddress(this.g_socket_client_connect_to_service(Pointer.pointerTo(this, GSocketClient.class).getPeer(), Pointer.getPeer(domain), Pointer.getPeer(service), Pointer.getPeer(cancellable)));
    }

    protected native void g_socket_client_connect_to_service_async(
        @Ptr
        long client,
        @Ptr
        long domain,
        @Ptr
        long service,
        @Ptr
        long cancellable,
        @Ptr
        long callback,
        @Ptr
        long user_data);

    public void connect_to_service_async(Pointer domain, Pointer service, Pointer<GCancellable> cancellable, Pointer callback, Pointer user_data) {
        this.g_socket_client_connect_to_service_async(Pointer.pointerTo(this, GSocketClient.class).getPeer(), Pointer.getPeer(domain), Pointer.getPeer(service), Pointer.getPeer(cancellable), Pointer.getPeer(callback), Pointer.getPeer(user_data));
    }

    @Ptr
    protected native long g_socket_client_connect_to_service_finish(
        @Ptr
        long client,
        @Ptr
        long result);

    public Pointer connect_to_service_finish(Pointer<Object> result) {
        return Pointer.pointerToAddress(this.g_socket_client_connect_to_service_finish(Pointer.pointerTo(this, GSocketClient.class).getPeer(), Pointer.getPeer(result)));
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
        return Pointer.pointerToAddress(this.g_socket_client_connect_to_uri(Pointer.pointerTo(this, GSocketClient.class).getPeer(), Pointer.getPeer(uri), default_port, Pointer.getPeer(cancellable)));
    }

    protected native void g_socket_client_connect_to_uri_async(
        @Ptr
        long client,
        @Ptr
        long uri, int default_port,
        @Ptr
        long cancellable,
        @Ptr
        long callback,
        @Ptr
        long user_data);

    public void connect_to_uri_async(Pointer uri, int default_port, Pointer<GCancellable> cancellable, Pointer callback, Pointer user_data) {
        this.g_socket_client_connect_to_uri_async(Pointer.pointerTo(this, GSocketClient.class).getPeer(), Pointer.getPeer(uri), default_port, Pointer.getPeer(cancellable), Pointer.getPeer(callback), Pointer.getPeer(user_data));
    }

    @Ptr
    protected native long g_socket_client_connect_to_uri_finish(
        @Ptr
        long client,
        @Ptr
        long result);

    public Pointer connect_to_uri_finish(Pointer<Object> result) {
        return Pointer.pointerToAddress(this.g_socket_client_connect_to_uri_finish(Pointer.pointerTo(this, GSocketClient.class).getPeer(), Pointer.getPeer(result)));
    }

    protected native boolean g_socket_client_get_enable_proxy(
        @Ptr
        long client);

    public boolean get_enable_proxy() {
        return this.g_socket_client_get_enable_proxy(Pointer.pointerTo(this, GSocketClient.class).getPeer());
    }

    @Ptr
    protected native long g_socket_client_get_local_address(
        @Ptr
        long client);

    public Pointer<GSocketAddress> get_local_address() {
        return Pointer.pointerToAddress(this.g_socket_client_get_local_address(Pointer.pointerTo(this, GSocketClient.class).getPeer()), GSocketAddress.class);
    }

    @Ptr
    protected native long g_socket_client_get_proxy_resolver(
        @Ptr
        long client);

    public Pointer<Object> get_proxy_resolver() {
        return Pointer.pointerToAddress(this.g_socket_client_get_proxy_resolver(Pointer.pointerTo(this, GSocketClient.class).getPeer()), Object.class);
    }

    protected native long g_socket_client_get_timeout(
        @Ptr
        long client);

    public long get_timeout() {
        return this.g_socket_client_get_timeout(Pointer.pointerTo(this, GSocketClient.class).getPeer());
    }

    protected native boolean g_socket_client_get_tls(
        @Ptr
        long client);

    public boolean get_tls() {
        return this.g_socket_client_get_tls(Pointer.pointerTo(this, GSocketClient.class).getPeer());
    }

    protected native void g_socket_client_set_enable_proxy(
        @Ptr
        long client, boolean enable);

    public void set_enable_proxy(boolean enable) {
        this.g_socket_client_set_enable_proxy(Pointer.pointerTo(this, GSocketClient.class).getPeer(), enable);
    }

    protected native void g_socket_client_set_local_address(
        @Ptr
        long client,
        @Ptr
        long address);

    public void set_local_address(Pointer<GSocketAddress> address) {
        this.g_socket_client_set_local_address(Pointer.pointerTo(this, GSocketClient.class).getPeer(), Pointer.getPeer(address));
    }

    protected native void g_socket_client_set_proxy_resolver(
        @Ptr
        long client,
        @Ptr
        long proxy_resolver);

    public void set_proxy_resolver(Pointer<Object> proxy_resolver) {
        this.g_socket_client_set_proxy_resolver(Pointer.pointerTo(this, GSocketClient.class).getPeer(), Pointer.getPeer(proxy_resolver));
    }

    protected native void g_socket_client_set_timeout(
        @Ptr
        long client, long timeout);

    public void set_timeout(long timeout) {
        this.g_socket_client_set_timeout(Pointer.pointerTo(this, GSocketClient.class).getPeer(), timeout);
    }

    protected native void g_socket_client_set_tls(
        @Ptr
        long client, boolean tls);

    public void set_tls(boolean tls) {
        this.g_socket_client_set_tls(Pointer.pointerTo(this, GSocketClient.class).getPeer(), tls);
    }

    @Field(0)
    public GObject gsocketclient_field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GSocketClient gsocketclient_field_parent_instance(GObject gsocketclient_field_parent_instance) {
        this.io.setNativeObjectField(this, 0, gsocketclient_field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer gsocketclient_field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GSocketClient gsocketclient_field_priv(Pointer gsocketclient_field_priv) {
        this.io.setPointerField(this, 1, gsocketclient_field_priv);
        return this;
    }

    protected native IntValuedEnum<GSocketFamily> g_socket_client_get_family(
        @Ptr
        long client);

    public IntValuedEnum<GSocketFamily> get_family() {
        return this.g_socket_client_get_family(Pointer.pointerTo(this, GSocketClient.class).getPeer());
    }

    protected native void g_socket_client_set_tls_validation_flags(
        @Ptr
        long client, IntValuedEnum<GTlsCertificateFlags> flags);

    public void set_tls_validation_flags(IntValuedEnum<GTlsCertificateFlags> flags) {
        this.g_socket_client_set_tls_validation_flags(Pointer.pointerTo(this, GSocketClient.class).getPeer(), flags);
    }

    protected native void g_socket_client_set_socket_type(
        @Ptr
        long client, IntValuedEnum<GSocketType> type);

    public void set_socket_type(IntValuedEnum<GSocketType> type) {
        this.g_socket_client_set_socket_type(Pointer.pointerTo(this, GSocketClient.class).getPeer(), type);
    }

    protected native void g_socket_client_set_protocol(
        @Ptr
        long client, IntValuedEnum<GSocketProtocol> protocol);

    public void set_protocol(IntValuedEnum<GSocketProtocol> protocol) {
        this.g_socket_client_set_protocol(Pointer.pointerTo(this, GSocketClient.class).getPeer(), protocol);
    }

    protected native IntValuedEnum<GSocketType> g_socket_client_get_socket_type(
        @Ptr
        long client);

    public IntValuedEnum<GSocketType> get_socket_type() {
        return this.g_socket_client_get_socket_type(Pointer.pointerTo(this, GSocketClient.class).getPeer());
    }

    protected native IntValuedEnum<GTlsCertificateFlags> g_socket_client_get_tls_validation_flags(
        @Ptr
        long client);

    public IntValuedEnum<GTlsCertificateFlags> get_tls_validation_flags() {
        return this.g_socket_client_get_tls_validation_flags(Pointer.pointerTo(this, GSocketClient.class).getPeer());
    }

    protected native void g_socket_client_set_family(
        @Ptr
        long client, IntValuedEnum<GSocketFamily> family);

    public void set_family(IntValuedEnum<GSocketFamily> family) {
        this.g_socket_client_set_family(Pointer.pointerTo(this, GSocketClient.class).getPeer(), family);
    }

    protected native IntValuedEnum<GSocketProtocol> g_socket_client_get_protocol(
        @Ptr
        long client);

    public IntValuedEnum<GSocketProtocol> get_protocol() {
        return this.g_socket_client_get_protocol(Pointer.pointerTo(this, GSocketClient.class).getPeer());
    }

}
