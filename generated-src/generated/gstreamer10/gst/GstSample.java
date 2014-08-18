
package generated.gstreamer10.gst;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstSample
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstSample() {
        super();
    }

    public GstSample(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long gst_sample_new(
        @Ptr
        long buffer,
        @Ptr
        long caps,
        @Ptr
        long segment,
        @Ptr
        long info);

    public static Pointer _new(Pointer<GstBuffer> buffer, Pointer<GstCaps> caps, Pointer segment, Pointer info) {
        return Pointer.pointerToAddress(GstSample.gst_sample_new(Pointer.getPeer(buffer), Pointer.getPeer(caps), Pointer.getPeer(segment), Pointer.getPeer(info)));
    }

    @Ptr
    protected native long gst_sample_get_buffer(
        @Ptr
        long sample);

    public Pointer<GstBuffer> get_buffer() {
        return Pointer.pointerToAddress(this.gst_sample_get_buffer(Pointer.pointerTo(this, GstSample.class).getPeer()), GstBuffer.class);
    }

    @Ptr
    protected native long gst_sample_get_caps(
        @Ptr
        long sample);

    public Pointer<GstCaps> get_caps() {
        return Pointer.pointerToAddress(this.gst_sample_get_caps(Pointer.pointerTo(this, GstSample.class).getPeer()), GstCaps.class);
    }

    @Ptr
    protected native long gst_sample_get_info(
        @Ptr
        long sample);

    public Pointer get_info() {
        return Pointer.pointerToAddress(this.gst_sample_get_info(Pointer.pointerTo(this, GstSample.class).getPeer()));
    }

    @Ptr
    protected native long gst_sample_get_segment(
        @Ptr
        long sample);

    public Pointer get_segment() {
        return Pointer.pointerToAddress(this.gst_sample_get_segment(Pointer.pointerTo(this, GstSample.class).getPeer()));
    }

}
