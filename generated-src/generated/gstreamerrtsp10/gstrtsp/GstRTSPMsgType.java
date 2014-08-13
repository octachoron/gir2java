
package generated.gstreamerrtsp10.gstrtsp;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstRTSPMsgType
    implements IntValuedEnum<GstRTSPMsgType>
{

    GSTRTSP_MSG_TYPE_INVALID(0L),
    GSTRTSP_MSG_TYPE_REQUEST(1L),
    GSTRTSP_MSG_TYPE_RESPONSE(2L),
    GSTRTSP_MSG_TYPE_HTTP_REQUEST(3L),
    GSTRTSP_MSG_TYPE_HTTP_RESPONSE(4L),
    GSTRTSP_MSG_TYPE_DATA(5L);
    public final long value;

    GstRTSPMsgType(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstRTSPMsgType> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstRTSPMsgType> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
