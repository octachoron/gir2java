
package generated.gstreamervideo10.gstvideo;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstVideoFormatFlags
    implements IntValuedEnum<GstVideoFormatFlags>
{

    GST_VIDEO_FORMAT_FLAGS_YUV(1L),
    GST_VIDEO_FORMAT_FLAGS_RGB(2L),
    GST_VIDEO_FORMAT_FLAGS_GRAY(4L),
    GST_VIDEO_FORMAT_FLAGS_ALPHA(8L),
    GST_VIDEO_FORMAT_FLAGS_LE(16L),
    GST_VIDEO_FORMAT_FLAGS_PALETTE(32L),
    GST_VIDEO_FORMAT_FLAGS_COMPLEX(64L),
    GST_VIDEO_FORMAT_FLAGS_UNPACK(128L);
    public final long value;

    GstVideoFormatFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstVideoFormatFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstVideoFormatFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GstVideoFormatFlags.values());
    }

}
