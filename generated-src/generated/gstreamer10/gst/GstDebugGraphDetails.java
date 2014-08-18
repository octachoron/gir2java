
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstDebugGraphDetails
    implements IntValuedEnum<GstDebugGraphDetails>
{

    GST_DEBUG_GRAPH_DETAILS_MEDIA_TYPE(1L),
    GST_DEBUG_GRAPH_DETAILS_CAPS_DETAILS(2L),
    GST_DEBUG_GRAPH_DETAILS_NON_DEFAULT_PARAMS(4L),
    GST_DEBUG_GRAPH_DETAILS_STATES(8L),
    GST_DEBUG_GRAPH_DETAILS_ALL(15L);
    public final long value;

    GstDebugGraphDetails(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstDebugGraphDetails> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstDebugGraphDetails> fromValue(int value) {
        return FlagSet.fromValue(value, GstDebugGraphDetails.values());
    }

}
