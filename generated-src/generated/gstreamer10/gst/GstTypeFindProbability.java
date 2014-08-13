
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstTypeFindProbability
    implements IntValuedEnum<GstTypeFindProbability>
{

    GST_TYPE_FIND_PROBABILITY_NONE(0L),
    GST_TYPE_FIND_PROBABILITY_MINIMUM(1L),
    GST_TYPE_FIND_PROBABILITY_POSSIBLE(50L),
    GST_TYPE_FIND_PROBABILITY_LIKELY(80L),
    GST_TYPE_FIND_PROBABILITY_NEARLY_CERTAIN(99L),
    GST_TYPE_FIND_PROBABILITY_MAXIMUM(100L);
    public final long value;

    GstTypeFindProbability(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstTypeFindProbability> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstTypeFindProbability> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
