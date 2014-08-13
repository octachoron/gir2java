
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstClockReturn
    implements IntValuedEnum<GstClockReturn>
{

    GST_CLOCK_RETURN_OK(0L),
    GST_CLOCK_RETURN_EARLY(1L),
    GST_CLOCK_RETURN_UNSCHEDULED(2L),
    GST_CLOCK_RETURN_BUSY(3L),
    GST_CLOCK_RETURN_BADTIME(4L),
    GST_CLOCK_RETURN_ERROR(5L),
    GST_CLOCK_RETURN_UNSUPPORTED(6L),
    GST_CLOCK_RETURN_DONE(7L);
    public final long value;

    GstClockReturn(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstClockReturn> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstClockReturn> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
