
package generated.gio20.gio;

import generated.gobject20.gobject.GObject;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GInetAddress
    extends GObject
{


    static {
        BridJ.register();
    }

    public GInetAddress() {
        super();
    }

    public GInetAddress(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_inet_address_new_from_string(
        @Ptr
        long string);

    public static Pointer new_from_string(Pointer string) {
        return Pointer.pointerToAddress(GInetAddress.g_inet_address_new_from_string(Pointer.getPeer(string)));
    }

    protected native boolean g_inet_address_equal(
        @Ptr
        long address,
        @Ptr
        long other_address);

    public boolean equal(Pointer other_address) {
        return this.g_inet_address_equal(Pointer.pointerTo(this, GInetAddress.class).getPeer(), Pointer.getPeer(other_address));
    }

    protected native boolean g_inet_address_get_is_any(
        @Ptr
        long address);

    public boolean get_is_any() {
        return this.g_inet_address_get_is_any(Pointer.pointerTo(this, GInetAddress.class).getPeer());
    }

    protected native boolean g_inet_address_get_is_link_local(
        @Ptr
        long address);

    public boolean get_is_link_local() {
        return this.g_inet_address_get_is_link_local(Pointer.pointerTo(this, GInetAddress.class).getPeer());
    }

    protected native boolean g_inet_address_get_is_loopback(
        @Ptr
        long address);

    public boolean get_is_loopback() {
        return this.g_inet_address_get_is_loopback(Pointer.pointerTo(this, GInetAddress.class).getPeer());
    }

    protected native boolean g_inet_address_get_is_mc_global(
        @Ptr
        long address);

    public boolean get_is_mc_global() {
        return this.g_inet_address_get_is_mc_global(Pointer.pointerTo(this, GInetAddress.class).getPeer());
    }

    protected native boolean g_inet_address_get_is_mc_link_local(
        @Ptr
        long address);

    public boolean get_is_mc_link_local() {
        return this.g_inet_address_get_is_mc_link_local(Pointer.pointerTo(this, GInetAddress.class).getPeer());
    }

    protected native boolean g_inet_address_get_is_mc_node_local(
        @Ptr
        long address);

    public boolean get_is_mc_node_local() {
        return this.g_inet_address_get_is_mc_node_local(Pointer.pointerTo(this, GInetAddress.class).getPeer());
    }

    protected native boolean g_inet_address_get_is_mc_org_local(
        @Ptr
        long address);

    public boolean get_is_mc_org_local() {
        return this.g_inet_address_get_is_mc_org_local(Pointer.pointerTo(this, GInetAddress.class).getPeer());
    }

    protected native boolean g_inet_address_get_is_mc_site_local(
        @Ptr
        long address);

    public boolean get_is_mc_site_local() {
        return this.g_inet_address_get_is_mc_site_local(Pointer.pointerTo(this, GInetAddress.class).getPeer());
    }

    protected native boolean g_inet_address_get_is_multicast(
        @Ptr
        long address);

    public boolean get_is_multicast() {
        return this.g_inet_address_get_is_multicast(Pointer.pointerTo(this, GInetAddress.class).getPeer());
    }

    protected native boolean g_inet_address_get_is_site_local(
        @Ptr
        long address);

    public boolean get_is_site_local() {
        return this.g_inet_address_get_is_site_local(Pointer.pointerTo(this, GInetAddress.class).getPeer());
    }

    protected native long g_inet_address_get_native_size(
        @Ptr
        long address);

    public long get_native_size() {
        return this.g_inet_address_get_native_size(Pointer.pointerTo(this, GInetAddress.class).getPeer());
    }

    @Ptr
    protected native long g_inet_address_to_bytes(
        @Ptr
        long address);

    public Pointer<Short> to_bytes() {
        return Pointer.pointerToAddress(this.g_inet_address_to_bytes(Pointer.pointerTo(this, GInetAddress.class).getPeer()), Short.class);
    }

    @Ptr
    protected native long g_inet_address_to_string(
        @Ptr
        long address);

    public Pointer to_string() {
        return Pointer.pointerToAddress(this.g_inet_address_to_string(Pointer.pointerTo(this, GInetAddress.class).getPeer()));
    }

    @Field(0)
    public GObject field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GInetAddress field_parent_instance(GObject field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    private Pointer field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GInetAddress field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

    @Ptr
    protected static native long g_inet_address_new_from_bytes(
        @Ptr
        long bytes, IntValuedEnum<GSocketFamily> family);

    public static Pointer<GInetAddress> new_from_bytes(Pointer<Short> bytes, IntValuedEnum<GSocketFamily> family) {
        return Pointer.pointerToAddress(GInetAddress.g_inet_address_new_from_bytes(Pointer.getPeer(bytes), family), GInetAddress.class);
    }

    @Ptr
    protected static native long g_inet_address_new_any(IntValuedEnum<GSocketFamily> family);

    public static Pointer<GInetAddress> new_any(IntValuedEnum<GSocketFamily> family) {
        return Pointer.pointerToAddress(GInetAddress.g_inet_address_new_any(family), GInetAddress.class);
    }

    protected native IntValuedEnum<GSocketFamily> g_inet_address_get_family(
        @Ptr
        long address);

    public IntValuedEnum<GSocketFamily> get_family() {
        return this.g_inet_address_get_family(Pointer.pointerTo(this, GInetAddress.class).getPeer());
    }

    @Ptr
    protected static native long g_inet_address_new_loopback(IntValuedEnum<GSocketFamily> family);

    public static Pointer<GInetAddress> new_loopback(IntValuedEnum<GSocketFamily> family) {
        return Pointer.pointerToAddress(GInetAddress.g_inet_address_new_loopback(family), GInetAddress.class);
    }

}
