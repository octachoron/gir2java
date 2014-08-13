
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstURIType
    implements IntValuedEnum<GstURIType>
{

    GSTURI_TYPE_UNKNOWN(0L),
    GSTURI_TYPE_SINK(1L),
    GSTURI_TYPE_SRC(2L);
    public final long value;

    GstURIType(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstURIType> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstURIType> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
