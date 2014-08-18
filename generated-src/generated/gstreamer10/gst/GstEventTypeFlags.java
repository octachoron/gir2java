
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstEventTypeFlags
    implements IntValuedEnum<GstEventTypeFlags>
{

    GST_EVENT_TYPE_FLAGS_UPSTREAM(1L),
    GST_EVENT_TYPE_FLAGS_DOWNSTREAM(2L),
    GST_EVENT_TYPE_FLAGS_SERIALIZED(4L),
    GST_EVENT_TYPE_FLAGS_STICKY(8L),
    GST_EVENT_TYPE_FLAGS_STICKY_MULTI(16L);
    public final long value;

    GstEventTypeFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstEventTypeFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstEventTypeFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GstEventTypeFlags.values());
    }

}
