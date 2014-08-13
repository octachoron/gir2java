
package generated.gio20.gio;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GInetSocketAddress
    extends StructObject
{


    public GInetSocketAddress() {
        super();
    }

    public GInetSocketAddress(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long g_inet_socket_address_get_address(
        @Ptr
        long address);

    public Pointer<GInetAddress> get_address() {
        return Pointer.pointerToAddress(this.g_inet_socket_address_get_address(Pointer.pointerTo(this, GInetSocketAddress.class)), Pointer.class);
    }

    protected native long g_inet_socket_address_get_flowinfo(
        @Ptr
        long address);

    public long get_flowinfo() {
        return this.g_inet_socket_address_get_flowinfo(Pointer.pointerTo(this, GInetSocketAddress.class));
    }

    protected native int g_inet_socket_address_get_port(
        @Ptr
        long address);

    public int get_port() {
        return this.g_inet_socket_address_get_port(Pointer.pointerTo(this, GInetSocketAddress.class));
    }

    protected native long g_inet_socket_address_get_scope_id(
        @Ptr
        long address);

    public long get_scope_id() {
        return this.g_inet_socket_address_get_scope_id(Pointer.pointerTo(this, GInetSocketAddress.class));
    }

    @Field(0)
    public Pointer<GInetSocketAddressPrivate> field_priv() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GInetSocketAddress field_priv(Pointer<GInetSocketAddressPrivate> field_priv) {
        this.io.setPointerField(this, 0, field_priv);
        return this;
    }

    @Field(1)
    public GSocketAddress field_parent_instance() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GInetSocketAddress field_parent_instance(GSocketAddress field_parent_instance) {
        this.io.setNativeObjectField(this, 1, field_parent_instance);
        return this;
    }

}
