
package generated.gstreamervideo10.gstvideo;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstVideoBufferFlags
    implements IntValuedEnum<GstVideoBufferFlags>
{

    GST_VIDEO_BUFFER_FLAGS_INTERLACED(1048576L),
    GST_VIDEO_BUFFER_FLAGS_TFF(2097152L),
    GST_VIDEO_BUFFER_FLAGS_RFF(4194304L),
    GST_VIDEO_BUFFER_FLAGS_ONEFIELD(8388608L),
    GST_VIDEO_BUFFER_FLAGS_LAST(268435456L);
    public final long value;

    GstVideoBufferFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstVideoBufferFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstVideoBufferFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GstVideoBufferFlags.values());
    }

}
