
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstBufferFlags
    implements IntValuedEnum<GstBufferFlags>
{

    GST_BUFFER_FLAGS_LIVE(16L),
    GST_BUFFER_FLAGS_DECODE_ONLY(32L),
    GST_BUFFER_FLAGS_DISCONT(64L),
    GST_BUFFER_FLAGS_RESYNC(128L),
    GST_BUFFER_FLAGS_CORRUPTED(256L),
    GST_BUFFER_FLAGS_MARKER(512L),
    GST_BUFFER_FLAGS_HEADER(1024L),
    GST_BUFFER_FLAGS_GAP(2048L),
    GST_BUFFER_FLAGS_DROPPABLE(4096L),
    GST_BUFFER_FLAGS_DELTA_UNIT(8192L),
    GST_BUFFER_FLAGS_LAST(1048576L);
    public final long value;

    GstBufferFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstBufferFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstBufferFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GstBufferFlags.values());
    }

}
