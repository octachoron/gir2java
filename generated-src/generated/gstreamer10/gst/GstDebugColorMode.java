
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstDebugColorMode
    implements IntValuedEnum<GstDebugColorMode>
{

    GST_DEBUG_COLOR_MODE_OFF(0L),
    GST_DEBUG_COLOR_MODE_ON(1L),
    GST_DEBUG_COLOR_MODE_UNIX(2L);
    public final long value;

    GstDebugColorMode(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstDebugColorMode> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstDebugColorMode> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
