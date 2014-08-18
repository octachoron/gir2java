
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstMetaFlags
    implements IntValuedEnum<GstMetaFlags>
{

    GST_META_FLAGS_NONE(0L),
    GST_META_FLAGS_READONLY(1L),
    GST_META_FLAGS_POOLED(2L),
    GST_META_FLAGS_LOCKED(4L),
    GST_META_FLAGS_LAST(65536L);
    public final long value;

    GstMetaFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstMetaFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstMetaFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GstMetaFlags.values());
    }

}
