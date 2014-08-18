
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstQueryTypeFlags
    implements IntValuedEnum<GstQueryTypeFlags>
{

    GST_QUERY_TYPE_FLAGS_UPSTREAM(1L),
    GST_QUERY_TYPE_FLAGS_DOWNSTREAM(2L),
    GST_QUERY_TYPE_FLAGS_SERIALIZED(4L);
    public final long value;

    GstQueryTypeFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstQueryTypeFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstQueryTypeFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GstQueryTypeFlags.values());
    }

}
