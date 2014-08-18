
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstCapsIntersectMode
    implements IntValuedEnum<GstCapsIntersectMode>
{

    GST_CAPS_INTERSECT_MODE_ZIG_ZAG(0L),
    GST_CAPS_INTERSECT_MODE_FIRST(1L);
    public final long value;

    GstCapsIntersectMode(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstCapsIntersectMode> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstCapsIntersectMode> fromValue(int value) {
        return FlagSet.fromValue(value, GstCapsIntersectMode.values());
    }

}
