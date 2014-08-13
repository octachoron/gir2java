
package generated.gio20.gio;

import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GUnixSocketAddress
    extends GSocketAddress
{


    public GUnixSocketAddress() {
        super();
    }

    public GUnixSocketAddress(Pointer pointer) {
        super(pointer);
    }

    public native boolean g_unix_socket_address_abstract_names_supported();

    protected native boolean g_unix_socket_address_get_is_abstract(
        @Ptr
        long address);

    public boolean get_is_abstract() {
        return this.g_unix_socket_address_get_is_abstract(Pointer.pointerTo(this, GUnixSocketAddress.class));
    }

    @Ptr
    protected native long g_unix_socket_address_get_path(
        @Ptr
        long address);

    public Pointer get_path() {
        return Pointer.pointerToAddress(this.g_unix_socket_address_get_path(Pointer.pointerTo(this, GUnixSocketAddress.class)));
    }

    protected native long g_unix_socket_address_get_path_len(
        @Ptr
        long address);

    public long get_path_len() {
        return this.g_unix_socket_address_get_path_len(Pointer.pointerTo(this, GUnixSocketAddress.class));
    }

    @Field(0)
    public GSocketAddress field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GUnixSocketAddress field_parent_instance(GSocketAddress field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GUnixSocketAddress field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

    protected native IntValuedEnum<GUnixSocketAddressType> g_unix_socket_address_get_address_type(
        @Ptr
        long address);

    public IntValuedEnum<GUnixSocketAddressType> get_address_type() {
        return this.g_unix_socket_address_get_address_type(Pointer.pointerTo(this, GUnixSocketAddress.class));
    }

}
