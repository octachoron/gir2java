
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstAllocatorFlags
    implements IntValuedEnum<GstAllocatorFlags>
{

    GST_ALLOCATOR_FLAGS_CUSTOM_ALLOC(16L),
    GST_ALLOCATOR_FLAGS_LAST(1048576L);
    public final long value;

    GstAllocatorFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstAllocatorFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstAllocatorFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GstAllocatorFlags.values());
    }

}
