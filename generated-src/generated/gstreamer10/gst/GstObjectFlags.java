
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstObjectFlags
    implements IntValuedEnum<GstObjectFlags>
{

    GST_OBJECT_FLAGS_LAST(16L);
    public final long value;

    GstObjectFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstObjectFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstObjectFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GstObjectFlags.values());
    }

}
