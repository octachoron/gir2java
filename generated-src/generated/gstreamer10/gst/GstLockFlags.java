
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstLockFlags
    implements IntValuedEnum<GstLockFlags>
{

    GST_LOCK_FLAGS_READ(1L),
    GST_LOCK_FLAGS_WRITE(2L),
    GST_LOCK_FLAGS_EXCLUSIVE(4L),
    GST_LOCK_FLAGS_LAST(256L);
    public final long value;

    GstLockFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstLockFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstLockFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GstLockFlags.values());
    }

}
