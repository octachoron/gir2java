
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstSegmentFlags
    implements IntValuedEnum<GstSegmentFlags>
{

    GST_SEGMENT_FLAGS_NONE(0L),
    GST_SEGMENT_FLAGS_RESET(1L),
    GST_SEGMENT_FLAGS_SKIP(16L),
    GST_SEGMENT_FLAGS_SEGMENT(8L);
    public final long value;

    GstSegmentFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstSegmentFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstSegmentFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GstSegmentFlags.values());
    }

}
