
package generated.gstreamervideo10.gstvideo;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstVideoOverlayFormatFlags
    implements IntValuedEnum<GstVideoOverlayFormatFlags>
{

    GST_VIDEO_OVERLAY_FORMAT_FLAGS_NONE(0L),
    GST_VIDEO_OVERLAY_FORMAT_FLAGS_PREMULTIPLIED_ALPHA(1L),
    GST_VIDEO_OVERLAY_FORMAT_FLAGS_GLOBAL_ALPHA(2L);
    public final long value;

    GstVideoOverlayFormatFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstVideoOverlayFormatFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstVideoOverlayFormatFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GstVideoOverlayFormatFlags.values());
    }

}
