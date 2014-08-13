
package generated.gstreamerfft10.gstfft;

import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-fft-1.0")
public class GstFFTS16
    extends StructObject
{


    public GstFFTS16() {
        super();
    }

    public GstFFTS16(Pointer pointer) {
        super(pointer);
    }

    protected native void gst_fft_s16_fft(
        @Ptr
        long self,
        @Ptr
        long timedata,
        @Ptr
        long freqdata);

    public void fft(Pointer<Short> timedata, Pointer freqdata) {
        this.gst_fft_s16_fft(Pointer.pointerTo(this, GstFFTS16 .class), Pointer.getPeer(timedata), Pointer.getPeer(freqdata));
    }

    protected native void gst_fft_s16_free(
        @Ptr
        long self);

    public void free() {
        this.gst_fft_s16_free(Pointer.pointerTo(this, GstFFTS16 .class));
    }

    protected native void gst_fft_s16_inverse_fft(
        @Ptr
        long self,
        @Ptr
        long freqdata,
        @Ptr
        long timedata);

    public void inverse_fft(Pointer freqdata, Pointer<Short> timedata) {
        this.gst_fft_s16_inverse_fft(Pointer.pointerTo(this, GstFFTS16 .class), Pointer.getPeer(freqdata), Pointer.getPeer(timedata));
    }

    @Ptr
    protected native long gst_fft_s16_new(int len, boolean inverse);

    public Pointer _new(int len, boolean inverse) {
        return Pointer.pointerToAddress(this.gst_fft_s16_new(len, inverse));
    }

    protected native void gst_fft_s16_window(
        @Ptr
        long self,
        @Ptr
        long timedata, IntValuedEnum<GstFFTWindow> window);

    public void window(Pointer<Short> timedata, IntValuedEnum<GstFFTWindow> window) {
        this.gst_fft_s16_window(Pointer.pointerTo(this, GstFFTS16 .class), Pointer.getPeer(timedata), window);
    }

}
