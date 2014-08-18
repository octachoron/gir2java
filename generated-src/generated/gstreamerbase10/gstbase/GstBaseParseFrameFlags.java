
package generated.gstreamerbase10.gstbase;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstBaseParseFrameFlags
    implements IntValuedEnum<GstBaseParseFrameFlags>
{

    GST_BASE_PARSE_FRAME_FLAGS_NONE(0L),
    GST_BASE_PARSE_FRAME_FLAGS_NEW_FRAME(1L),
    GST_BASE_PARSE_FRAME_FLAGS_NO_FRAME(2L),
    GST_BASE_PARSE_FRAME_FLAGS_CLIP(4L),
    GST_BASE_PARSE_FRAME_FLAGS_DROP(8L),
    GST_BASE_PARSE_FRAME_FLAGS_QUEUE(16L);
    public final long value;

    GstBaseParseFrameFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstBaseParseFrameFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstBaseParseFrameFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GstBaseParseFrameFlags.values());
    }

}
