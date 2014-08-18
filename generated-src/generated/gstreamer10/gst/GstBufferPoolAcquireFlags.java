
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstBufferPoolAcquireFlags
    implements IntValuedEnum<GstBufferPoolAcquireFlags>
{

    GST_BUFFER_POOL_ACQUIRE_FLAGS_NONE(0L),
    GST_BUFFER_POOL_ACQUIRE_FLAGS_KEY_UNIT(1L),
    GST_BUFFER_POOL_ACQUIRE_FLAGS_DONTWAIT(2L),
    GST_BUFFER_POOL_ACQUIRE_FLAGS_DISCONT(4L),
    GST_BUFFER_POOL_ACQUIRE_FLAGS_LAST(65536L);
    public final long value;

    GstBufferPoolAcquireFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstBufferPoolAcquireFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstBufferPoolAcquireFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GstBufferPoolAcquireFlags.values());
    }

}
