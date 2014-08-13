
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstSeekType
    implements IntValuedEnum<GstSeekType>
{

    GST_SEEK_TYPE_NONE(0L),
    GST_SEEK_TYPE_SET(1L),
    GST_SEEK_TYPE_END(2L);
    public final long value;

    GstSeekType(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstSeekType> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstSeekType> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
