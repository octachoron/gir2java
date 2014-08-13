
package generated.gstreamercontroller10.gstcontroller;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstLFOWaveform
    implements IntValuedEnum<GstLFOWaveform>
{

    GSTLFO_WAVEFORM_SINE(0L),
    GSTLFO_WAVEFORM_SQUARE(1L),
    GSTLFO_WAVEFORM_SAW(2L),
    GSTLFO_WAVEFORM_REVERSE_SAW(3L),
    GSTLFO_WAVEFORM_TRIANGLE(4L);
    public final long value;

    GstLFOWaveform(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstLFOWaveform> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstLFOWaveform> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
