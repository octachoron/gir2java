
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstQOSType
    implements IntValuedEnum<GstQOSType>
{

    GSTQOS_TYPE_OVERFLOW(0L),
    GSTQOS_TYPE_UNDERFLOW(1L),
    GSTQOS_TYPE_THROTTLE(2L);
    public final long value;

    GstQOSType(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstQOSType> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstQOSType> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
