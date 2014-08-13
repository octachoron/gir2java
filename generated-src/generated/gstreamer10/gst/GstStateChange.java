
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstStateChange
    implements IntValuedEnum<GstStateChange>
{

    GST_STATE_CHANGE_NULL_TO_READY(10L),
    GST_STATE_CHANGE_READY_TO_PAUSED(19L),
    GST_STATE_CHANGE_PAUSED_TO_PLAYING(28L),
    GST_STATE_CHANGE_PLAYING_TO_PAUSED(35L),
    GST_STATE_CHANGE_PAUSED_TO_READY(26L),
    GST_STATE_CHANGE_READY_TO_NULL(17L);
    public final long value;

    GstStateChange(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstStateChange> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstStateChange> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
