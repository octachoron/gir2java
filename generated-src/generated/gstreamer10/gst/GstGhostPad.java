
package generated.gstreamer10.gst;

import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstGhostPad
    extends GstProxyPad
{


    static {
        BridJ.register();
    }

    public GstGhostPad() {
        super();
    }

    public GstGhostPad(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long gst_ghost_pad_new(
        @Ptr
        long name,
        @Ptr
        long target);

    public static Pointer<GstPad> gstghostpad__new(Pointer name, Pointer<GstPad> target) {
        return Pointer.pointerToAddress(GstGhostPad.gst_ghost_pad_new(Pointer.getPeer(name), Pointer.getPeer(target)), GstPad.class);
    }

    @Ptr
    protected static native long gst_ghost_pad_new_from_template(
        @Ptr
        long name,
        @Ptr
        long target,
        @Ptr
        long templ);

    public static Pointer<GstPad> gstghostpad_new_from_template(Pointer name, Pointer<GstPad> target, Pointer<GstPadTemplate> templ) {
        return Pointer.pointerToAddress(GstGhostPad.gst_ghost_pad_new_from_template(Pointer.getPeer(name), Pointer.getPeer(target), Pointer.getPeer(templ)), GstPad.class);
    }

    @Ptr
    protected static native long gst_ghost_pad_new_no_target(
        @Ptr
        long name, IntValuedEnum<GstPadDirection> dir);

    public static Pointer<GstPad> new_no_target(Pointer name, IntValuedEnum<GstPadDirection> dir) {
        return Pointer.pointerToAddress(GstGhostPad.gst_ghost_pad_new_no_target(Pointer.getPeer(name), dir), GstPad.class);
    }

    @Ptr
    protected static native long gst_ghost_pad_new_no_target_from_template(
        @Ptr
        long name,
        @Ptr
        long templ);

    public static Pointer<GstPad> new_no_target_from_template(Pointer name, Pointer<GstPadTemplate> templ) {
        return Pointer.pointerToAddress(GstGhostPad.gst_ghost_pad_new_no_target_from_template(Pointer.getPeer(name), Pointer.getPeer(templ)), GstPad.class);
    }

    protected static native boolean gst_ghost_pad_activate_mode_default(
        @Ptr
        long pad,
        @Ptr
        long parent, IntValuedEnum<GstPadMode> mode, boolean active);

    public static boolean activate_mode_default(Pointer<GstPad> pad, Pointer<GstObject> parent, IntValuedEnum<GstPadMode> mode, boolean active) {
        return GstGhostPad.gst_ghost_pad_activate_mode_default(Pointer.getPeer(pad), Pointer.getPeer(parent), mode, active);
    }

    protected static native boolean gst_ghost_pad_internal_activate_mode_default(
        @Ptr
        long pad,
        @Ptr
        long parent, IntValuedEnum<GstPadMode> mode, boolean active);

    public static boolean internal_activate_mode_default(Pointer<GstPad> pad, Pointer<GstObject> parent, IntValuedEnum<GstPadMode> mode, boolean active) {
        return GstGhostPad.gst_ghost_pad_internal_activate_mode_default(Pointer.getPeer(pad), Pointer.getPeer(parent), mode, active);
    }

    protected native boolean gst_ghost_pad_construct(
        @Ptr
        long gpad);

    public boolean construct() {
        return this.gst_ghost_pad_construct(Pointer.pointerTo(this, GstGhostPad.class).getPeer());
    }

    @Ptr
    protected native long gst_ghost_pad_get_target(
        @Ptr
        long gpad);

    public Pointer<GstPad> get_target() {
        return Pointer.pointerToAddress(this.gst_ghost_pad_get_target(Pointer.pointerTo(this, GstGhostPad.class).getPeer()), GstPad.class);
    }

    protected native boolean gst_ghost_pad_set_target(
        @Ptr
        long gpad,
        @Ptr
        long newtarget);

    public boolean set_target(Pointer<GstPad> newtarget) {
        return this.gst_ghost_pad_set_target(Pointer.pointerTo(this, GstGhostPad.class).getPeer(), Pointer.getPeer(newtarget));
    }

    @Field(0)
    public GstProxyPad gstghostpad_field_pad() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstGhostPad gstghostpad_field_pad(GstProxyPad gstghostpad_field_pad) {
        this.io.setNativeObjectField(this, 0, gstghostpad_field_pad);
        return this;
    }

    @Field(1)
    private Pointer<GstGhostPadPrivate> gstghostpad_field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GstGhostPad gstghostpad_field_priv(Pointer<GstGhostPadPrivate> gstghostpad_field_priv) {
        this.io.setPointerField(this, 1, gstghostpad_field_priv);
        return this;
    }

}
