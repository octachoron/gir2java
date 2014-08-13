
package generated.gstreamervideo10.gstvideo;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstVideoColorPrimaries
    implements IntValuedEnum<GstVideoColorPrimaries>
{

    GST_VIDEO_COLOR_PRIMARIES_UNKNOWN(0L),
    GST_VIDEO_COLOR_PRIMARIES_BT709(1L),
    GST_VIDEO_COLOR_PRIMARIES_BT470M(2L),
    GST_VIDEO_COLOR_PRIMARIES_BT470BG(3L),
    GST_VIDEO_COLOR_PRIMARIES_SMPTE170M(4L),
    GST_VIDEO_COLOR_PRIMARIES_SMPTE240M(5L),
    GST_VIDEO_COLOR_PRIMARIES_FILM(6L);
    public final long value;

    GstVideoColorPrimaries(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstVideoColorPrimaries> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstVideoColorPrimaries> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
