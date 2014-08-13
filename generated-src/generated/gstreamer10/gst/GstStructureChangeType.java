
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstStructureChangeType
    implements IntValuedEnum<GstStructureChangeType>
{

    GST_STRUCTURE_CHANGE_TYPE_LINK(0L),
    GST_STRUCTURE_CHANGE_TYPE_UNLINK(1L);
    public final long value;

    GstStructureChangeType(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstStructureChangeType> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstStructureChangeType> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
