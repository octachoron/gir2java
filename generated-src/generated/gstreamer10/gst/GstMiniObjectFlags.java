
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstMiniObjectFlags
    implements IntValuedEnum<GstMiniObjectFlags>
{

    GST_MINI_OBJECT_FLAGS_LOCKABLE(1L),
    GST_MINI_OBJECT_FLAGS_LOCK_READONLY(2L),
    GST_MINI_OBJECT_FLAGS_LAST(16L);
    public final long value;

    GstMiniObjectFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstMiniObjectFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstMiniObjectFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GstMiniObjectFlags.values());
    }

}
