
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstStreamStatusType
    implements IntValuedEnum<GstStreamStatusType>
{

    GST_STREAM_STATUS_TYPE_CREATE(0L),
    GST_STREAM_STATUS_TYPE_ENTER(1L),
    GST_STREAM_STATUS_TYPE_LEAVE(2L),
    GST_STREAM_STATUS_TYPE_DESTROY(3L),
    GST_STREAM_STATUS_TYPE_START(8L),
    GST_STREAM_STATUS_TYPE_PAUSE(9L),
    GST_STREAM_STATUS_TYPE_STOP(10L);
    public final long value;

    GstStreamStatusType(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstStreamStatusType> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstStreamStatusType> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
