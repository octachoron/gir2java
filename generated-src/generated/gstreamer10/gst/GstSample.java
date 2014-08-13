
package generated.gstreamer10.gst;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstSample
    extends StructObject
{


    public GstSample() {
        super();
    }

    public GstSample(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long gst_sample_get_buffer(
        @Ptr
        long sample);

    public Pointer<GstBuffer> get_buffer() {
        return Pointer.pointerToAddress(this.gst_sample_get_buffer(Pointer.pointerTo(this, GstSample.class)), Pointer.class);
    }

    @Ptr
    protected native long gst_sample_get_caps(
        @Ptr
        long sample);

    public Pointer<GstCaps> get_caps() {
        return Pointer.pointerToAddress(this.gst_sample_get_caps(Pointer.pointerTo(this, GstSample.class)), Pointer.class);
    }

    @Ptr
    protected native long gst_sample_get_info(
        @Ptr
        long sample);

    public Pointer get_info() {
        return Pointer.pointerToAddress(this.gst_sample_get_info(Pointer.pointerTo(this, GstSample.class)));
    }

    @Ptr
    protected native long gst_sample_get_segment(
        @Ptr
        long sample);

    public Pointer get_segment() {
        return Pointer.pointerToAddress(this.gst_sample_get_segment(Pointer.pointerTo(this, GstSample.class)));
    }

}
