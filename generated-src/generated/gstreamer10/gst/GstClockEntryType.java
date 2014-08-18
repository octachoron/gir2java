
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstClockEntryType
    implements IntValuedEnum<GstClockEntryType>
{

    GST_CLOCK_ENTRY_TYPE_SINGLE(0L),
    GST_CLOCK_ENTRY_TYPE_PERIODIC(1L);
    public final long value;

    GstClockEntryType(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstClockEntryType> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstClockEntryType> fromValue(int value) {
        return FlagSet.fromValue(value, GstClockEntryType.values());
    }

}
