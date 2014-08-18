
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstBufferCopyFlags
    implements IntValuedEnum<GstBufferCopyFlags>
{

    GST_BUFFER_COPY_FLAGS_NONE(0L),
    GST_BUFFER_COPY_FLAGS_FLAGS(1L),
    GST_BUFFER_COPY_FLAGS_TIMESTAMPS(2L),
    GST_BUFFER_COPY_FLAGS_META(4L),
    GST_BUFFER_COPY_FLAGS_MEMORY(8L),
    GST_BUFFER_COPY_FLAGS_MERGE(16L),
    GST_BUFFER_COPY_FLAGS_DEEP(32L);
    public final long value;

    GstBufferCopyFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstBufferCopyFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstBufferCopyFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GstBufferCopyFlags.values());
    }

}
