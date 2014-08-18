
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstMapFlags
    implements IntValuedEnum<GstMapFlags>
{

    GST_MAP_FLAGS_READ(1L),
    GST_MAP_FLAGS_WRITE(2L),
    GST_MAP_FLAGS_FLAG_LAST(65536L);
    public final long value;

    GstMapFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstMapFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstMapFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GstMapFlags.values());
    }

}
