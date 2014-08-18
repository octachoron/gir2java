
package generated.gstreamervideo10.gstvideo;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstVideoChromaFlags
    implements IntValuedEnum<GstVideoChromaFlags>
{

    GST_VIDEO_CHROMA_FLAGS_NONE(0L),
    GST_VIDEO_CHROMA_FLAGS_INTERLACED(1L);
    public final long value;

    GstVideoChromaFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstVideoChromaFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstVideoChromaFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GstVideoChromaFlags.values());
    }

}
