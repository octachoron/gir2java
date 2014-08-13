
package generated.gstreamer10.gst;

import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstGhostPad
    extends StructObject
{


    public GstGhostPad() {
        super();
    }

    public GstGhostPad(Pointer pointer) {
        super(pointer);
    }

    protected native boolean gst_ghost_pad_construct(
        @Ptr
        long gpad);

    public boolean construct() {
        return this.gst_ghost_pad_construct(Pointer.pointerTo(this, GstGhostPad.class));
    }

    @Ptr
    protected native long gst_ghost_pad_get_target(
        @Ptr
        long gpad);

    public Pointer get_target() {
        return Pointer.pointerToAddress(this.gst_ghost_pad_get_target(Pointer.pointerTo(this, GstGhostPad.class)));
    }

    protected native boolean gst_ghost_pad_set_target(
        @Ptr
        long gpad,
        @Ptr
        long newtarget);

    public boolean set_target(Pointer newtarget) {
        return this.gst_ghost_pad_set_target(Pointer.pointerTo(this, GstGhostPad.class), Pointer.getPeer(newtarget));
    }

    protected native boolean gst_ghost_pad_activate_mode_default(
        @Ptr
        long pad,
        @Ptr
        long parent, IntValuedEnum<GstPadMode> mode, boolean active);

    public boolean activate_mode_default(Pointer<GstPad> pad, Pointer<GstObject> parent, IntValuedEnum<GstPadMode> mode, boolean active) {
        return this.gst_ghost_pad_activate_mode_default(Pointer.getPeer(pad), Pointer.getPeer(parent), mode, active);
    }

    @Field(0)
    public Pointer<GstGhostPadPrivate> field_priv() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GstGhostPad field_priv(Pointer<GstGhostPadPrivate> field_priv) {
        this.io.setPointerField(this, 0, field_priv);
        return this;
    }

    @Field(1)
    public GstProxyPad field_pad() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GstGhostPad field_pad(GstProxyPad field_pad) {
        this.io.setNativeObjectField(this, 1, field_pad);
        return this;
    }

    protected native boolean gst_ghost_pad_internal_activate_mode_default(
        @Ptr
        long pad,
        @Ptr
        long parent, IntValuedEnum<GstPadMode> mode, boolean active);

    public boolean internal_activate_mode_default(Pointer<GstPad> pad, Pointer<GstObject> parent, IntValuedEnum<GstPadMode> mode, boolean active) {
        return this.gst_ghost_pad_internal_activate_mode_default(Pointer.getPeer(pad), Pointer.getPeer(parent), mode, active);
    }

}
