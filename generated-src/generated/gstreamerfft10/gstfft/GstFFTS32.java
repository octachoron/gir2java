
package generated.gstreamerfft10.gstfft;

import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-fft-1.0")
public class GstFFTS32
    extends StructObject
{


    public GstFFTS32() {
        super();
    }

    public GstFFTS32(Pointer pointer) {
        super(pointer);
    }

    protected native void gst_fft_s32_fft(
        @Ptr
        long self,
        @Ptr
        long timedata,
        @Ptr
        long freqdata);

    public void fft(Pointer<Integer> timedata, Pointer freqdata) {
        this.gst_fft_s32_fft(Pointer.pointerTo(this, GstFFTS32 .class), Pointer.getPeer(timedata), Pointer.getPeer(freqdata));
    }

    protected native void gst_fft_s32_free(
        @Ptr
        long self);

    public void free() {
        this.gst_fft_s32_free(Pointer.pointerTo(this, GstFFTS32 .class));
    }

    protected native void gst_fft_s32_inverse_fft(
        @Ptr
        long self,
        @Ptr
        long freqdata,
        @Ptr
        long timedata);

    public void inverse_fft(Pointer freqdata, Pointer<Integer> timedata) {
        this.gst_fft_s32_inverse_fft(Pointer.pointerTo(this, GstFFTS32 .class), Pointer.getPeer(freqdata), Pointer.getPeer(timedata));
    }

    @Ptr
    protected native long gst_fft_s32_new(int len, boolean inverse);

    public Pointer _new(int len, boolean inverse) {
        return Pointer.pointerToAddress(this.gst_fft_s32_new(len, inverse));
    }

    protected native void gst_fft_s32_window(
        @Ptr
        long self,
        @Ptr
        long timedata, IntValuedEnum<GstFFTWindow> window);

    public void window(Pointer<Integer> timedata, IntValuedEnum<GstFFTWindow> window) {
        this.gst_fft_s32_window(Pointer.pointerTo(this, GstFFTS32 .class), Pointer.getPeer(timedata), window);
    }

}
