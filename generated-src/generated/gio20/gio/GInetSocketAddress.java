
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GInetSocketAddress
    extends GSocketAddress
{


    static {
        BridJ.register();
    }

    public GInetSocketAddress() {
        super();
    }

    public GInetSocketAddress(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_inet_socket_address_new(
        @Ptr
        long address, int port);

    public static Pointer _new(Pointer<GInetAddress> address, int port) {
        return Pointer.pointerToAddress(GInetSocketAddress.g_inet_socket_address_new(Pointer.getPeer(address), port));
    }

    @Ptr
    protected static native long g_inet_socket_address_new_from_string(
        @Ptr
        long address, long port);

    public static Pointer new_from_string(Pointer address, long port) {
        return Pointer.pointerToAddress(GInetSocketAddress.g_inet_socket_address_new_from_string(Pointer.getPeer(address), port));
    }

    @Ptr
    protected native long g_inet_socket_address_get_address(
        @Ptr
        long address);

    public Pointer<GInetAddress> get_address() {
        return Pointer.pointerToAddress(this.g_inet_socket_address_get_address(Pointer.pointerTo(this, GInetSocketAddress.class).getPeer()), GInetAddress.class);
    }

    protected native long g_inet_socket_address_get_flowinfo(
        @Ptr
        long address);

    public long get_flowinfo() {
        return this.g_inet_socket_address_get_flowinfo(Pointer.pointerTo(this, GInetSocketAddress.class).getPeer());
    }

    protected native int g_inet_socket_address_get_port(
        @Ptr
        long address);

    public int get_port() {
        return this.g_inet_socket_address_get_port(Pointer.pointerTo(this, GInetSocketAddress.class).getPeer());
    }

    protected native long g_inet_socket_address_get_scope_id(
        @Ptr
        long address);

    public long get_scope_id() {
        return this.g_inet_socket_address_get_scope_id(Pointer.pointerTo(this, GInetSocketAddress.class).getPeer());
    }

    @Field(0)
    private Pointer<GInetSocketAddressPrivate> ginetsocketaddress_field_priv() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    private GInetSocketAddress ginetsocketaddress_field_priv(Pointer<GInetSocketAddressPrivate> ginetsocketaddress_field_priv) {
        this.io.setPointerField(this, 0, ginetsocketaddress_field_priv);
        return this;
    }

    @Field(1)
    public GSocketAddress ginetsocketaddress_field_parent_instance() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GInetSocketAddress ginetsocketaddress_field_parent_instance(GSocketAddress ginetsocketaddress_field_parent_instance) {
        this.io.setNativeObjectField(this, 1, ginetsocketaddress_field_parent_instance);
        return this;
    }

}
