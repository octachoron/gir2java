
package generated.gstreamervideo10.gstvideo;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstVideoPackFlags
    implements IntValuedEnum<GstVideoPackFlags>
{

    GST_VIDEO_PACK_FLAGS_NONE(0L),
    GST_VIDEO_PACK_FLAGS_TRUNCATE_RANGE(1L),
    GST_VIDEO_PACK_FLAGS_INTERLACED(2L);
    public final long value;

    GstVideoPackFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstVideoPackFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstVideoPackFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GstVideoPackFlags.values());
    }

}
