
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstStreamFlags
    implements IntValuedEnum<GstStreamFlags>
{

    GST_STREAM_FLAGS_NONE(0L),
    GST_STREAM_FLAGS_SPARSE(1L),
    GST_STREAM_FLAGS_SELECT(2L),
    GST_STREAM_FLAGS_UNSELECT(4L);
    public final long value;

    GstStreamFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstStreamFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstStreamFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GstStreamFlags.values());
    }

}
