
package generated.gio20.gio;

import generated.gobject20.gobject.GObject;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GInetAddressMask
    extends GObject
{


    public GInetAddressMask() {
        super();
    }

    public GInetAddressMask(Pointer pointer) {
        super(pointer);
    }

    protected native boolean g_inet_address_mask_equal(
        @Ptr
        long mask,
        @Ptr
        long mask2);

    public boolean equal(Pointer mask2) {
        return this.g_inet_address_mask_equal(Pointer.pointerTo(this, GInetAddressMask.class), Pointer.getPeer(mask2));
    }

    @Ptr
    protected native long g_inet_address_mask_get_address(
        @Ptr
        long mask);

    public Pointer<GInetAddress> get_address() {
        return Pointer.pointerToAddress(this.g_inet_address_mask_get_address(Pointer.pointerTo(this, GInetAddressMask.class)), Pointer.class);
    }

    protected native long g_inet_address_mask_get_length(
        @Ptr
        long mask);

    public long get_length() {
        return this.g_inet_address_mask_get_length(Pointer.pointerTo(this, GInetAddressMask.class));
    }

    protected native boolean g_inet_address_mask_matches(
        @Ptr
        long mask,
        @Ptr
        long address);

    public boolean matches(Pointer<GInetAddress> address) {
        return this.g_inet_address_mask_matches(Pointer.pointerTo(this, GInetAddressMask.class), Pointer.getPeer(address));
    }

    @Ptr
    protected native long g_inet_address_mask_to_string(
        @Ptr
        long mask);

    public Pointer to_string() {
        return Pointer.pointerToAddress(this.g_inet_address_mask_to_string(Pointer.pointerTo(this, GInetAddressMask.class)));
    }

    @Field(0)
    public GObject field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GInetAddressMask field_parent_instance(GObject field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GInetAddressMask field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

    protected native IntValuedEnum<GSocketFamily> g_inet_address_mask_get_family(
        @Ptr
        long mask);

    public IntValuedEnum<GSocketFamily> get_family() {
        return this.g_inet_address_mask_get_family(Pointer.pointerTo(this, GInetAddressMask.class));
    }

}
