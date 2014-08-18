
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstBusFlags
    implements IntValuedEnum<GstBusFlags>
{

    GST_BUS_FLAGS_FLUSHING(16L),
    GST_BUS_FLAGS_FLAG_LAST(32L);
    public final long value;

    GstBusFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstBusFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstBusFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GstBusFlags.values());
    }

}
