
package generated.gstreamervideo10.gstvideo;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstVideoFrameFlags
    implements IntValuedEnum<GstVideoFrameFlags>
{

    GST_VIDEO_FRAME_FLAGS_NONE(0L),
    GST_VIDEO_FRAME_FLAGS_INTERLACED(1L),
    GST_VIDEO_FRAME_FLAGS_TFF(2L),
    GST_VIDEO_FRAME_FLAGS_RFF(4L),
    GST_VIDEO_FRAME_FLAGS_ONEFIELD(8L);
    public final long value;

    GstVideoFrameFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstVideoFrameFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstVideoFrameFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GstVideoFrameFlags.values());
    }

}
