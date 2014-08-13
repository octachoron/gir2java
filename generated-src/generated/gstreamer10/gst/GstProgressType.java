
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstProgressType
    implements IntValuedEnum<GstProgressType>
{

    GST_PROGRESS_TYPE_START(0L),
    GST_PROGRESS_TYPE_CONTINUE(1L),
    GST_PROGRESS_TYPE_COMPLETE(2L),
    GST_PROGRESS_TYPE_CANCELED(3L),
    GST_PROGRESS_TYPE_ERROR(4L);
    public final long value;

    GstProgressType(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstProgressType> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstProgressType> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
