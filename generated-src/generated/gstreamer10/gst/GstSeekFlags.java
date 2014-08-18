
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstSeekFlags
    implements IntValuedEnum<GstSeekFlags>
{

    GST_SEEK_FLAGS_NONE(0L),
    GST_SEEK_FLAGS_FLUSH(1L),
    GST_SEEK_FLAGS_ACCURATE(2L),
    GST_SEEK_FLAGS_KEY_UNIT(4L),
    GST_SEEK_FLAGS_SEGMENT(8L),
    GST_SEEK_FLAGS_SKIP(16L),
    GST_SEEK_FLAGS_SNAP_BEFORE(32L),
    GST_SEEK_FLAGS_SNAP_AFTER(64L),
    GST_SEEK_FLAGS_SNAP_NEAREST(96L);
    public final long value;

    GstSeekFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstSeekFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstSeekFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GstSeekFlags.values());
    }

}
