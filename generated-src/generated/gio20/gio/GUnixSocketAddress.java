
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GUnixSocketAddress
    extends GSocketAddress
{


    static {
        BridJ.register();
    }

    public GUnixSocketAddress() {
        super();
    }

    public GUnixSocketAddress(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_unix_socket_address_new(
        @Ptr
        long path);

    public static Pointer<GSocketAddress> gunixsocketaddress__new(Pointer path) {
        return Pointer.pointerToAddress(GUnixSocketAddress.g_unix_socket_address_new(Pointer.getPeer(path)), GSocketAddress.class);
    }

    @Ptr
    protected static native long g_unix_socket_address_new_abstract(
        @Ptr
        long path, int path_len);

    public static Pointer<GSocketAddress> new_abstract(Pointer<Character> path, int path_len) {
        return Pointer.pointerToAddress(GUnixSocketAddress.g_unix_socket_address_new_abstract(Pointer.getPeer(path), path_len), GSocketAddress.class);
    }

    public static native boolean g_unix_socket_address_abstract_names_supported();

    protected native boolean g_unix_socket_address_get_is_abstract(
        @Ptr
        long address);

    public boolean get_is_abstract() {
        return this.g_unix_socket_address_get_is_abstract(Pointer.pointerTo(this, GUnixSocketAddress.class).getPeer());
    }

    @Ptr
    protected native long g_unix_socket_address_get_path(
        @Ptr
        long address);

    public Pointer get_path() {
        return Pointer.pointerToAddress(this.g_unix_socket_address_get_path(Pointer.pointerTo(this, GUnixSocketAddress.class).getPeer()));
    }

    protected native long g_unix_socket_address_get_path_len(
        @Ptr
        long address);

    public long get_path_len() {
        return this.g_unix_socket_address_get_path_len(Pointer.pointerTo(this, GUnixSocketAddress.class).getPeer());
    }

    @Field(0)
    public GSocketAddress gunixsocketaddress_field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GUnixSocketAddress gunixsocketaddress_field_parent_instance(GSocketAddress gunixsocketaddress_field_parent_instance) {
        this.io.setNativeObjectField(this, 0, gunixsocketaddress_field_parent_instance);
        return this;
    }

    @Field(1)
    private Pointer field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GUnixSocketAddress field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

    @Ptr
    protected static native long g_unix_socket_address_new_with_type(
        @Ptr
        long path, int path_len, IntValuedEnum<GUnixSocketAddressType> type);

    public static Pointer<GSocketAddress> new_with_type(Pointer<Character> path, int path_len, IntValuedEnum<GUnixSocketAddressType> type) {
        return Pointer.pointerToAddress(GUnixSocketAddress.g_unix_socket_address_new_with_type(Pointer.getPeer(path), path_len, type), GSocketAddress.class);
    }

    protected native IntValuedEnum<GUnixSocketAddressType> g_unix_socket_address_get_address_type(
        @Ptr
        long address);

    public IntValuedEnum<GUnixSocketAddressType> get_address_type() {
        return this.g_unix_socket_address_get_address_type(Pointer.pointerTo(this, GUnixSocketAddress.class).getPeer());
    }

}
