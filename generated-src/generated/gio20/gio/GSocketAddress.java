
package generated.gio20.gio;

import generated.gobject20.gobject.GObject;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GSocketAddress
    extends GObject
{


    static {
        BridJ.register();
    }

    public GSocketAddress() {
        super();
    }

    public GSocketAddress(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_socket_address_new_from_native(
        @Ptr
        long _native, long len);

    public static Pointer new_from_native(Pointer _native, long len) {
        return Pointer.pointerToAddress(GSocketAddress.g_socket_address_new_from_native(Pointer.getPeer(_native), len));
    }

    protected native long g_socket_address_get_native_size(
        @Ptr
        long address);

    public long get_native_size() {
        return this.g_socket_address_get_native_size(Pointer.pointerTo(this, GSocketAddress.class).getPeer());
    }

    protected native boolean g_socket_address_to_native(
        @Ptr
        long address,
        @Ptr
        long dest, long destlen);

    public boolean to_native(Pointer dest, long destlen) {
        return this.g_socket_address_to_native(Pointer.pointerTo(this, GSocketAddress.class).getPeer(), Pointer.getPeer(dest), destlen);
    }

    @Field(0)
    public GObject gsocketaddress_field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GSocketAddress gsocketaddress_field_parent_instance(GObject gsocketaddress_field_parent_instance) {
        this.io.setNativeObjectField(this, 0, gsocketaddress_field_parent_instance);
        return this;
    }

    protected native IntValuedEnum<GSocketFamily> g_socket_address_get_family(
        @Ptr
        long address);

    public IntValuedEnum<GSocketFamily> get_family() {
        return this.g_socket_address_get_family(Pointer.pointerTo(this, GSocketAddress.class).getPeer());
    }

}
