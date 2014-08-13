
package generated.gstreamervideo10.gstvideo;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-video-1.0")
public class GstVideoOverlayComposition
    extends StructObject
{


    public GstVideoOverlayComposition() {
        super();
    }

    public GstVideoOverlayComposition(Pointer pointer) {
        super(pointer);
    }

    protected native void gst_video_overlay_composition_add_rectangle(
        @Ptr
        long comp,
        @Ptr
        long rectangle);

    public void add_rectangle(Pointer rectangle) {
        this.gst_video_overlay_composition_add_rectangle(Pointer.pointerTo(this, GstVideoOverlayComposition.class), Pointer.getPeer(rectangle));
    }

    protected native boolean gst_video_overlay_composition_blend(
        @Ptr
        long comp,
        @Ptr
        long video_buf);

    public boolean blend(Pointer<GstVideoFrame> video_buf) {
        return this.gst_video_overlay_composition_blend(Pointer.pointerTo(this, GstVideoOverlayComposition.class), Pointer.getPeer(video_buf));
    }

    @Ptr
    protected native long gst_video_overlay_composition_copy(
        @Ptr
        long comp);

    public Pointer copy() {
        return Pointer.pointerToAddress(this.gst_video_overlay_composition_copy(Pointer.pointerTo(this, GstVideoOverlayComposition.class)));
    }

    @Ptr
    protected native long gst_video_overlay_composition_get_rectangle(
        @Ptr
        long comp, long n);

    public Pointer get_rectangle(long n) {
        return Pointer.pointerToAddress(this.gst_video_overlay_composition_get_rectangle(Pointer.pointerTo(this, GstVideoOverlayComposition.class), n));
    }

    protected native long gst_video_overlay_composition_get_seqnum(
        @Ptr
        long comp);

    public long get_seqnum() {
        return this.gst_video_overlay_composition_get_seqnum(Pointer.pointerTo(this, GstVideoOverlayComposition.class));
    }

    @Ptr
    protected native long gst_video_overlay_composition_make_writable(
        @Ptr
        long comp);

    public Pointer make_writable() {
        return Pointer.pointerToAddress(this.gst_video_overlay_composition_make_writable(Pointer.pointerTo(this, GstVideoOverlayComposition.class)));
    }

    protected native long gst_video_overlay_composition_n_rectangles(
        @Ptr
        long comp);

    public long n_rectangles() {
        return this.gst_video_overlay_composition_n_rectangles(Pointer.pointerTo(this, GstVideoOverlayComposition.class));
    }

}
