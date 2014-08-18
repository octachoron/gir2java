
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstElementFlags
    implements IntValuedEnum<GstElementFlags>
{

    GST_ELEMENT_FLAGS_LOCKED_STATE(16L),
    GST_ELEMENT_FLAGS_SINK(32L),
    GST_ELEMENT_FLAGS_SOURCE(64L),
    GST_ELEMENT_FLAGS_PROVIDE_CLOCK(128L),
    GST_ELEMENT_FLAGS_REQUIRE_CLOCK(256L),
    GST_ELEMENT_FLAGS_INDEXABLE(512L),
    GST_ELEMENT_FLAGS_LAST(16384L);
    public final long value;

    GstElementFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstElementFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstElementFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GstElementFlags.values());
    }

}
