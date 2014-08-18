
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstClockType
    implements IntValuedEnum<GstClockType>
{

    GST_CLOCK_TYPE_REALTIME(0L),
    GST_CLOCK_TYPE_MONOTONIC(1L),
    GST_CLOCK_TYPE_OTHER(2L);
    public final long value;

    GstClockType(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstClockType> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstClockType> fromValue(int value) {
        return FlagSet.fromValue(value, GstClockType.values());
    }

}
