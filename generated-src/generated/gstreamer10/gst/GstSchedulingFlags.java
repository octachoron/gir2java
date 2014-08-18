
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstSchedulingFlags
    implements IntValuedEnum<GstSchedulingFlags>
{

    GST_SCHEDULING_FLAGS_SEEKABLE(1L),
    GST_SCHEDULING_FLAGS_SEQUENTIAL(2L),
    GST_SCHEDULING_FLAGS_BANDWIDTH_LIMITED(4L);
    public final long value;

    GstSchedulingFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstSchedulingFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstSchedulingFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GstSchedulingFlags.values());
    }

}
