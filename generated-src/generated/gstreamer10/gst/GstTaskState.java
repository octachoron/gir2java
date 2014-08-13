
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstTaskState
    implements IntValuedEnum<GstTaskState>
{

    GST_TASK_STATE_STARTED(0L),
    GST_TASK_STATE_STOPPED(1L),
    GST_TASK_STATE_PAUSED(2L);
    public final long value;

    GstTaskState(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstTaskState> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstTaskState> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
