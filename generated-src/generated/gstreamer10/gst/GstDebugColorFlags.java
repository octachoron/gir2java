
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstDebugColorFlags
    implements IntValuedEnum<GstDebugColorFlags>
{

    GST_DEBUG_COLOR_FLAGS_FG_BLACK(0L),
    GST_DEBUG_COLOR_FLAGS_FG_RED(1L),
    GST_DEBUG_COLOR_FLAGS_FG_GREEN(2L),
    GST_DEBUG_COLOR_FLAGS_FG_YELLOW(3L),
    GST_DEBUG_COLOR_FLAGS_FG_BLUE(4L),
    GST_DEBUG_COLOR_FLAGS_FG_MAGENTA(5L),
    GST_DEBUG_COLOR_FLAGS_FG_CYAN(6L),
    GST_DEBUG_COLOR_FLAGS_FG_WHITE(7L),
    GST_DEBUG_COLOR_FLAGS_BG_BLACK(0L),
    GST_DEBUG_COLOR_FLAGS_BG_RED(16L),
    GST_DEBUG_COLOR_FLAGS_BG_GREEN(32L),
    GST_DEBUG_COLOR_FLAGS_BG_YELLOW(48L),
    GST_DEBUG_COLOR_FLAGS_BG_BLUE(64L),
    GST_DEBUG_COLOR_FLAGS_BG_MAGENTA(80L),
    GST_DEBUG_COLOR_FLAGS_BG_CYAN(96L),
    GST_DEBUG_COLOR_FLAGS_BG_WHITE(112L),
    GST_DEBUG_COLOR_FLAGS_BOLD(256L),
    GST_DEBUG_COLOR_FLAGS_UNDERLINE(512L);
    public final long value;

    GstDebugColorFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstDebugColorFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstDebugColorFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GstDebugColorFlags.values());
    }

}
