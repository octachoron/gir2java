
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GProxyAddress
    extends GInetSocketAddress
{


    static {
        BridJ.register();
    }

    public GProxyAddress() {
        super();
    }

    public GProxyAddress(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_proxy_address_new(
        @Ptr
        long inetaddr, int port,
        @Ptr
        long protocol,
        @Ptr
        long dest_hostname, int dest_port,
        @Ptr
        long username,
        @Ptr
        long password);

    public static Pointer gproxyaddress__new(Pointer<GInetAddress> inetaddr, int port, Pointer protocol, Pointer dest_hostname, int dest_port, Pointer username, Pointer password) {
        return Pointer.pointerToAddress(GProxyAddress.g_proxy_address_new(Pointer.getPeer(inetaddr), port, Pointer.getPeer(protocol), Pointer.getPeer(dest_hostname), dest_port, Pointer.getPeer(username), Pointer.getPeer(password)));
    }

    @Ptr
    protected native long g_proxy_address_get_destination_hostname(
        @Ptr
        long proxy);

    public Pointer get_destination_hostname() {
        return Pointer.pointerToAddress(this.g_proxy_address_get_destination_hostname(Pointer.pointerTo(this, GProxyAddress.class).getPeer()));
    }

    protected native int g_proxy_address_get_destination_port(
        @Ptr
        long proxy);

    public int get_destination_port() {
        return this.g_proxy_address_get_destination_port(Pointer.pointerTo(this, GProxyAddress.class).getPeer());
    }

    @Ptr
    protected native long g_proxy_address_get_destination_protocol(
        @Ptr
        long proxy);

    public Pointer get_destination_protocol() {
        return Pointer.pointerToAddress(this.g_proxy_address_get_destination_protocol(Pointer.pointerTo(this, GProxyAddress.class).getPeer()));
    }

    @Ptr
    protected native long g_proxy_address_get_password(
        @Ptr
        long proxy);

    public Pointer get_password() {
        return Pointer.pointerToAddress(this.g_proxy_address_get_password(Pointer.pointerTo(this, GProxyAddress.class).getPeer()));
    }

    @Ptr
    protected native long g_proxy_address_get_protocol(
        @Ptr
        long proxy);

    public Pointer get_protocol() {
        return Pointer.pointerToAddress(this.g_proxy_address_get_protocol(Pointer.pointerTo(this, GProxyAddress.class).getPeer()));
    }

    @Ptr
    protected native long g_proxy_address_get_uri(
        @Ptr
        long proxy);

    public Pointer get_uri() {
        return Pointer.pointerToAddress(this.g_proxy_address_get_uri(Pointer.pointerTo(this, GProxyAddress.class).getPeer()));
    }

    @Ptr
    protected native long g_proxy_address_get_username(
        @Ptr
        long proxy);

    public Pointer get_username() {
        return Pointer.pointerToAddress(this.g_proxy_address_get_username(Pointer.pointerTo(this, GProxyAddress.class).getPeer()));
    }

    @Field(0)
    public GInetSocketAddress gproxyaddress_field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GProxyAddress gproxyaddress_field_parent_instance(GInetSocketAddress gproxyaddress_field_parent_instance) {
        this.io.setNativeObjectField(this, 0, gproxyaddress_field_parent_instance);
        return this;
    }

    @Field(1)
    private Pointer gproxyaddress_field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GProxyAddress gproxyaddress_field_priv(Pointer gproxyaddress_field_priv) {
        this.io.setPointerField(this, 1, gproxyaddress_field_priv);
        return this;
    }

}
