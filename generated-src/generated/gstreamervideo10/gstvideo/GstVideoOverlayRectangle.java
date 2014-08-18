
package generated.gstreamervideo10.gstvideo;

import generated.gstreamer10.gst.GstBuffer;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-video-1.0")
public class GstVideoOverlayRectangle
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstVideoOverlayRectangle() {
        super();
    }

    public GstVideoOverlayRectangle(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long gst_video_overlay_rectangle_new_raw(
        @Ptr
        long pixels, int render_x, int render_y, long render_width, long render_height, IntValuedEnum<GstVideoOverlayFormatFlags> flags);

    public static Pointer new_raw(Pointer<GstBuffer> pixels, int render_x, int render_y, long render_width, long render_height, IntValuedEnum<GstVideoOverlayFormatFlags> flags) {
        return Pointer.pointerToAddress(GstVideoOverlayRectangle.gst_video_overlay_rectangle_new_raw(Pointer.getPeer(pixels), render_x, render_y, render_width, render_height, flags));
    }

    @Ptr
    protected native long gst_video_overlay_rectangle_copy(
        @Ptr
        long rectangle);

    public Pointer copy() {
        return Pointer.pointerToAddress(this.gst_video_overlay_rectangle_copy(Pointer.pointerTo(this, GstVideoOverlayRectangle.class).getPeer()));
    }

    protected native IntValuedEnum<GstVideoOverlayFormatFlags> gst_video_overlay_rectangle_get_flags(
        @Ptr
        long rectangle);

    public IntValuedEnum<GstVideoOverlayFormatFlags> get_flags() {
        return this.gst_video_overlay_rectangle_get_flags(Pointer.pointerTo(this, GstVideoOverlayRectangle.class).getPeer());
    }

    protected native float gst_video_overlay_rectangle_get_global_alpha(
        @Ptr
        long rectangle);

    public float get_global_alpha() {
        return this.gst_video_overlay_rectangle_get_global_alpha(Pointer.pointerTo(this, GstVideoOverlayRectangle.class).getPeer());
    }

    @Ptr
    protected native long gst_video_overlay_rectangle_get_pixels_argb(
        @Ptr
        long rectangle, IntValuedEnum<GstVideoOverlayFormatFlags> flags);

    public Pointer<GstBuffer> get_pixels_argb(IntValuedEnum<GstVideoOverlayFormatFlags> flags) {
        return Pointer.pointerToAddress(this.gst_video_overlay_rectangle_get_pixels_argb(Pointer.pointerTo(this, GstVideoOverlayRectangle.class).getPeer(), flags), GstBuffer.class);
    }

    @Ptr
    protected native long gst_video_overlay_rectangle_get_pixels_ayuv(
        @Ptr
        long rectangle, IntValuedEnum<GstVideoOverlayFormatFlags> flags);

    public Pointer<GstBuffer> get_pixels_ayuv(IntValuedEnum<GstVideoOverlayFormatFlags> flags) {
        return Pointer.pointerToAddress(this.gst_video_overlay_rectangle_get_pixels_ayuv(Pointer.pointerTo(this, GstVideoOverlayRectangle.class).getPeer(), flags), GstBuffer.class);
    }

    @Ptr
    protected native long gst_video_overlay_rectangle_get_pixels_raw(
        @Ptr
        long rectangle, IntValuedEnum<GstVideoOverlayFormatFlags> flags);

    public Pointer<GstBuffer> get_pixels_raw(IntValuedEnum<GstVideoOverlayFormatFlags> flags) {
        return Pointer.pointerToAddress(this.gst_video_overlay_rectangle_get_pixels_raw(Pointer.pointerTo(this, GstVideoOverlayRectangle.class).getPeer(), flags), GstBuffer.class);
    }

    @Ptr
    protected native long gst_video_overlay_rectangle_get_pixels_unscaled_argb(
        @Ptr
        long rectangle, IntValuedEnum<GstVideoOverlayFormatFlags> flags);

    public Pointer<GstBuffer> get_pixels_unscaled_argb(IntValuedEnum<GstVideoOverlayFormatFlags> flags) {
        return Pointer.pointerToAddress(this.gst_video_overlay_rectangle_get_pixels_unscaled_argb(Pointer.pointerTo(this, GstVideoOverlayRectangle.class).getPeer(), flags), GstBuffer.class);
    }

    @Ptr
    protected native long gst_video_overlay_rectangle_get_pixels_unscaled_ayuv(
        @Ptr
        long rectangle, IntValuedEnum<GstVideoOverlayFormatFlags> flags);

    public Pointer<GstBuffer> get_pixels_unscaled_ayuv(IntValuedEnum<GstVideoOverlayFormatFlags> flags) {
        return Pointer.pointerToAddress(this.gst_video_overlay_rectangle_get_pixels_unscaled_ayuv(Pointer.pointerTo(this, GstVideoOverlayRectangle.class).getPeer(), flags), GstBuffer.class);
    }

    @Ptr
    protected native long gst_video_overlay_rectangle_get_pixels_unscaled_raw(
        @Ptr
        long rectangle, IntValuedEnum<GstVideoOverlayFormatFlags> flags);

    public Pointer<GstBuffer> get_pixels_unscaled_raw(IntValuedEnum<GstVideoOverlayFormatFlags> flags) {
        return Pointer.pointerToAddress(this.gst_video_overlay_rectangle_get_pixels_unscaled_raw(Pointer.pointerTo(this, GstVideoOverlayRectangle.class).getPeer(), flags), GstBuffer.class);
    }

    protected native boolean gst_video_overlay_rectangle_get_render_rectangle(
        @Ptr
        long rectangle,
        @Ptr
        long render_x,
        @Ptr
        long render_y,
        @Ptr
        long render_width,
        @Ptr
        long render_height);

    public boolean get_render_rectangle(Pointer<Integer> render_x, Pointer<Integer> render_y, Pointer<Long> render_width, Pointer<Long> render_height) {
        return this.gst_video_overlay_rectangle_get_render_rectangle(Pointer.pointerTo(this, GstVideoOverlayRectangle.class).getPeer(), Pointer.getPeer(render_x), Pointer.getPeer(render_y), Pointer.getPeer(render_width), Pointer.getPeer(render_height));
    }

    protected native long gst_video_overlay_rectangle_get_seqnum(
        @Ptr
        long rectangle);

    public long get_seqnum() {
        return this.gst_video_overlay_rectangle_get_seqnum(Pointer.pointerTo(this, GstVideoOverlayRectangle.class).getPeer());
    }

    protected native void gst_video_overlay_rectangle_set_global_alpha(
        @Ptr
        long rectangle, float global_alpha);

    public void set_global_alpha(float global_alpha) {
        this.gst_video_overlay_rectangle_set_global_alpha(Pointer.pointerTo(this, GstVideoOverlayRectangle.class).getPeer(), global_alpha);
    }

    protected native void gst_video_overlay_rectangle_set_render_rectangle(
        @Ptr
        long rectangle, int render_x, int render_y, long render_width, long render_height);

    public void set_render_rectangle(int render_x, int render_y, long render_width, long render_height) {
        this.gst_video_overlay_rectangle_set_render_rectangle(Pointer.pointerTo(this, GstVideoOverlayRectangle.class).getPeer(), render_x, render_y, render_width, render_height);
    }

}
