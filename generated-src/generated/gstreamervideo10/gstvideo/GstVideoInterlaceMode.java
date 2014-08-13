
package generated.gstreamervideo10.gstvideo;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstVideoInterlaceMode
    implements IntValuedEnum<GstVideoInterlaceMode>
{

    GST_VIDEO_INTERLACE_MODE_PROGRESSIVE(0L),
    GST_VIDEO_INTERLACE_MODE_INTERLEAVED(1L),
    GST_VIDEO_INTERLACE_MODE_MIXED(2L),
    GST_VIDEO_INTERLACE_MODE_FIELDS(3L);
    public final long value;

    GstVideoInterlaceMode(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstVideoInterlaceMode> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstVideoInterlaceMode> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
