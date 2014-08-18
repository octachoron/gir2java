
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstState
    implements IntValuedEnum<GstState>
{

    GST_STATE_VOID_PENDING(0L),
    GST_STATE_NULL(1L),
    GST_STATE_READY(2L),
    GST_STATE_PAUSED(3L),
    GST_STATE_PLAYING(4L);
    public final long value;

    GstState(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstState> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstState> fromValue(int value) {
        return FlagSet.fromValue(value, GstState.values());
    }

}
