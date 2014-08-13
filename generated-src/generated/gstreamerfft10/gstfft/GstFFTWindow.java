
package generated.gstreamerfft10.gstfft;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstFFTWindow
    implements IntValuedEnum<GstFFTWindow>
{

    GSTFFT_WINDOW_RECTANGULAR(0L),
    GSTFFT_WINDOW_HAMMING(1L),
    GSTFFT_WINDOW_HANN(2L),
    GSTFFT_WINDOW_BARTLETT(3L),
    GSTFFT_WINDOW_BLACKMAN(4L);
    public final long value;

    GstFFTWindow(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstFFTWindow> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstFFTWindow> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
