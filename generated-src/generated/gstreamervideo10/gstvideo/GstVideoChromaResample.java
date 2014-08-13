
package generated.gstreamervideo10.gstvideo;

import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-video-1.0")
public class GstVideoChromaResample
    extends StructObject
{


    public GstVideoChromaResample() {
        super();
    }

    public GstVideoChromaResample(Pointer pointer) {
        super(pointer);
    }

    protected native void gst_video_chroma_resample(
        @Ptr
        long resample, Pointer lines, int width);

    public void gst_video_chroma_resample(Pointer lines, int width) {
        this.gst_video_chroma_resample(Pointer.pointerTo(this, GstVideoChromaResample.class), lines, width);
    }

    protected native void gst_video_chroma_resample_free(
        @Ptr
        long resample);

    public void free() {
        this.gst_video_chroma_resample_free(Pointer.pointerTo(this, GstVideoChromaResample.class));
    }

    protected native void gst_video_chroma_resample_get_info(
        @Ptr
        long resample,
        @Ptr
        long n_lines,
        @Ptr
        long offset);

    public void get_info(Pointer<Long> n_lines, Pointer<Integer> offset) {
        this.gst_video_chroma_resample_get_info(Pointer.pointerTo(this, GstVideoChromaResample.class), Pointer.getPeer(n_lines), Pointer.getPeer(offset));
    }

    @Ptr
    protected native long gst_video_chroma_resample_new(IntValuedEnum<GstVideoChromaMethod> method, Object site, Object flags, IntValuedEnum<GstVideoFormat> format, int h_factor, int v_factor);

    public Pointer<GstVideoChromaResample> _new(IntValuedEnum<GstVideoChromaMethod> method, Object site, Object flags, IntValuedEnum<GstVideoFormat> format, int h_factor, int v_factor) {
        return Pointer.pointerToAddress(this.gst_video_chroma_resample_new(method, site, flags, format, h_factor, v_factor), Pointer.class);
    }

}
