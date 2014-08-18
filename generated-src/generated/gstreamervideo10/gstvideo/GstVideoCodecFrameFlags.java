
package generated.gstreamervideo10.gstvideo;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstVideoCodecFrameFlags
    implements IntValuedEnum<GstVideoCodecFrameFlags>
{

    GST_VIDEO_CODEC_FRAME_FLAGS_DECODE_ONLY(1L),
    GST_VIDEO_CODEC_FRAME_FLAGS_SYNC_POINT(2L),
    GST_VIDEO_CODEC_FRAME_FLAGS_FORCE_KEYFRAME(4L),
    GST_VIDEO_CODEC_FRAME_FLAGS_FORCE_KEYFRAME_HEADERS(8L);
    public final long value;

    GstVideoCodecFrameFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstVideoCodecFrameFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstVideoCodecFrameFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GstVideoCodecFrameFlags.values());
    }

}
