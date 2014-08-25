
package generated.gio20.gio;

import generated.gobject20.gobject.GObject;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GInetAddressMask
    extends GObject
{


    static {
        BridJ.register();
    }

    public GInetAddressMask() {
        super();
    }

    public GInetAddressMask(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_inet_address_mask_new(
        @Ptr
        long addr, long length);

    public static Pointer ginetaddressmask__new(Pointer<GInetAddress> addr, long length) {
        return Pointer.pointerToAddress(GInetAddressMask.g_inet_address_mask_new(Pointer.getPeer(addr), length));
    }

    @Ptr
    protected static native long g_inet_address_mask_new_from_string(
        @Ptr
        long mask_string);

    public static Pointer new_from_string(Pointer mask_string) {
        return Pointer.pointerToAddress(GInetAddressMask.g_inet_address_mask_new_from_string(Pointer.getPeer(mask_string)));
    }

    protected native boolean g_inet_address_mask_equal(
        @Ptr
        long mask,
        @Ptr
        long mask2);

    public boolean equal(Pointer mask2) {
        return this.g_inet_address_mask_equal(Pointer.pointerTo(this, GInetAddressMask.class).getPeer(), Pointer.getPeer(mask2));
    }

    @Ptr
    protected native long g_inet_address_mask_get_address(
        @Ptr
        long mask);

    public Pointer<GInetAddress> get_address() {
        return Pointer.pointerToAddress(this.g_inet_address_mask_get_address(Pointer.pointerTo(this, GInetAddressMask.class).getPeer()), GInetAddress.class);
    }

    protected native long g_inet_address_mask_get_length(
        @Ptr
        long mask);

    public long get_length() {
        return this.g_inet_address_mask_get_length(Pointer.pointerTo(this, GInetAddressMask.class).getPeer());
    }

    protected native boolean g_inet_address_mask_matches(
        @Ptr
        long mask,
        @Ptr
        long address);

    public boolean matches(Pointer<GInetAddress> address) {
        return this.g_inet_address_mask_matches(Pointer.pointerTo(this, GInetAddressMask.class).getPeer(), Pointer.getPeer(address));
    }

    @Ptr
    protected native long g_inet_address_mask_to_string(
        @Ptr
        long mask);

    public Pointer to_string() {
        return Pointer.pointerToAddress(this.g_inet_address_mask_to_string(Pointer.pointerTo(this, GInetAddressMask.class).getPeer()));
    }

    @Field(0)
    public GObject ginetaddressmask_field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GInetAddressMask ginetaddressmask_field_parent_instance(GObject ginetaddressmask_field_parent_instance) {
        this.io.setNativeObjectField(this, 0, ginetaddressmask_field_parent_instance);
        return this;
    }

    @Field(1)
    private Pointer ginetaddressmask_field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GInetAddressMask ginetaddressmask_field_priv(Pointer ginetaddressmask_field_priv) {
        this.io.setPointerField(this, 1, ginetaddressmask_field_priv);
        return this;
    }

    protected native IntValuedEnum<GSocketFamily> g_inet_address_mask_get_family(
        @Ptr
        long mask);

    public IntValuedEnum<GSocketFamily> get_family() {
        return this.g_inet_address_mask_get_family(Pointer.pointerTo(this, GInetAddressMask.class).getPeer());
    }

}
