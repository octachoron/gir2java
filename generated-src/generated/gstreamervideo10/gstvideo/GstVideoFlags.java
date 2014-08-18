
package generated.gstreamervideo10.gstvideo;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstVideoFlags
    implements IntValuedEnum<GstVideoFlags>
{

    GST_VIDEO_FLAGS_NONE(0L),
    GST_VIDEO_FLAGS_VARIABLE_FPS(1L),
    GST_VIDEO_FLAGS_PREMULTIPLIED_ALPHA(2L);
    public final long value;

    GstVideoFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstVideoFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstVideoFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GstVideoFlags.values());
    }

}
