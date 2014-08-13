
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstSearchMode
    implements IntValuedEnum<GstSearchMode>
{

    GST_SEARCH_MODE_EXACT(0L),
    GST_SEARCH_MODE_BEFORE(1L),
    GST_SEARCH_MODE_AFTER(2L);
    public final long value;

    GstSearchMode(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstSearchMode> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstSearchMode> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
