
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstClockFlags
    implements IntValuedEnum<GstClockFlags>
{

    GST_CLOCK_FLAGS_CAN_DO_SINGLE_SYNC(16L),
    GST_CLOCK_FLAGS_CAN_DO_SINGLE_ASYNC(32L),
    GST_CLOCK_FLAGS_CAN_DO_PERIODIC_SYNC(64L),
    GST_CLOCK_FLAGS_CAN_DO_PERIODIC_ASYNC(128L),
    GST_CLOCK_FLAGS_CAN_SET_RESOLUTION(256L),
    GST_CLOCK_FLAGS_CAN_SET_MASTER(512L),
    GST_CLOCK_FLAGS_LAST(4096L);
    public final long value;

    GstClockFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstClockFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstClockFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GstClockFlags.values());
    }

}
