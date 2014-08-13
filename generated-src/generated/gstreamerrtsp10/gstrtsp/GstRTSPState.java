
package generated.gstreamerrtsp10.gstrtsp;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstRTSPState
    implements IntValuedEnum<GstRTSPState>
{

    GSTRTSP_STATE_INVALID(0L),
    GSTRTSP_STATE_INIT(1L),
    GSTRTSP_STATE_READY(2L),
    GSTRTSP_STATE_SEEKING(3L),
    GSTRTSP_STATE_PLAYING(4L),
    GSTRTSP_STATE_RECORDING(5L);
    public final long value;

    GstRTSPState(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstRTSPState> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstRTSPState> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
