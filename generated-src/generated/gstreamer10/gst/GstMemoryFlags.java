
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstMemoryFlags
    implements IntValuedEnum<GstMemoryFlags>
{

    GST_MEMORY_FLAGS_READONLY(2L),
    GST_MEMORY_FLAGS_NO_SHARE(16L),
    GST_MEMORY_FLAGS_ZERO_PREFIXED(32L),
    GST_MEMORY_FLAGS_ZERO_PADDED(64L),
    GST_MEMORY_FLAGS_PHYSICALLY_CONTIGUOUS(128L),
    GST_MEMORY_FLAGS_NOT_MAPPABLE(256L),
    GST_MEMORY_FLAGS_LAST(1048576L);
    public final long value;

    GstMemoryFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstMemoryFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstMemoryFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GstMemoryFlags.values());
    }

}
