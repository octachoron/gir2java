
package generated.gstreamerfft10.gstfft;

import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-fft-1.0")
public class GstFFTF32
    extends StructObject
{


    public GstFFTF32() {
        super();
    }

    public GstFFTF32(Pointer pointer) {
        super(pointer);
    }

    protected native void gst_fft_f32_fft(
        @Ptr
        long self,
        @Ptr
        long timedata,
        @Ptr
        long freqdata);

    public void fft(Pointer<Float> timedata, Pointer freqdata) {
        this.gst_fft_f32_fft(Pointer.pointerTo(this, GstFFTF32 .class), Pointer.getPeer(timedata), Pointer.getPeer(freqdata));
    }

    protected native void gst_fft_f32_free(
        @Ptr
        long self);

    public void free() {
        this.gst_fft_f32_free(Pointer.pointerTo(this, GstFFTF32 .class));
    }

    protected native void gst_fft_f32_inverse_fft(
        @Ptr
        long self,
        @Ptr
        long freqdata,
        @Ptr
        long timedata);

    public void inverse_fft(Pointer freqdata, Pointer<Float> timedata) {
        this.gst_fft_f32_inverse_fft(Pointer.pointerTo(this, GstFFTF32 .class), Pointer.getPeer(freqdata), Pointer.getPeer(timedata));
    }

    @Ptr
    protected native long gst_fft_f32_new(int len, boolean inverse);

    public Pointer _new(int len, boolean inverse) {
        return Pointer.pointerToAddress(this.gst_fft_f32_new(len, inverse));
    }

    protected native void gst_fft_f32_window(
        @Ptr
        long self,
        @Ptr
        long timedata, IntValuedEnum<GstFFTWindow> window);

    public void window(Pointer<Float> timedata, IntValuedEnum<GstFFTWindow> window) {
        this.gst_fft_f32_window(Pointer.pointerTo(this, GstFFTF32 .class), Pointer.getPeer(timedata), window);
    }

}
