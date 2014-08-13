
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstTagFlag
    implements IntValuedEnum<GstTagFlag>
{

    GST_TAG_FLAG_UNDEFINED(0L),
    GST_TAG_FLAG_META(1L),
    GST_TAG_FLAG_ENCODED(2L),
    GST_TAG_FLAG_DECODED(3L),
    GST_TAG_FLAG_COUNT(4L);
    public final long value;

    GstTagFlag(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstTagFlag> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstTagFlag> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
