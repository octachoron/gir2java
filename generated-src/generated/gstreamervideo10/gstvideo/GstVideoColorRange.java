
package generated.gstreamervideo10.gstvideo;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Ptr;

public enum GstVideoColorRange
    implements IntValuedEnum<GstVideoColorRange>
{

    GST_VIDEO_COLOR_RANGE_UNKNOWN(0L),
    GST_VIDEO_COLOR_RANGE_0_255(1L),
    GST_VIDEO_COLOR_RANGE_16_235(2L);
    public final long value;

    GstVideoColorRange(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstVideoColorRange> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstVideoColorRange> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

    protected native void gst_video_color_range_offsets(IntValuedEnum<GstVideoColorRange> range,
        @Ptr
        long info, int offset, int scale);

    public void offsets(IntValuedEnum<GstVideoColorRange> range, Pointer<GstVideoFormatInfo> info, int offset, int scale) {
        this.gst_video_color_range_offsets(range, Pointer.getPeer(info), offset, scale);
    }

}
