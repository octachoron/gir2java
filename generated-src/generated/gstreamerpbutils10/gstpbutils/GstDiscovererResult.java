
package generated.gstreamerpbutils10.gstpbutils;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstDiscovererResult
    implements IntValuedEnum<GstDiscovererResult>
{

    GST_DISCOVERER_RESULT_OK(0L),
    GST_DISCOVERER_RESULT_URI_INVALID(1L),
    GST_DISCOVERER_RESULT_ERROR(2L),
    GST_DISCOVERER_RESULT_TIMEOUT(3L),
    GST_DISCOVERER_RESULT_BUSY(4L),
    GST_DISCOVERER_RESULT_MISSING_PLUGINS(5L);
    public final long value;

    GstDiscovererResult(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstDiscovererResult> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstDiscovererResult> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
