
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstBusSyncReply
    implements IntValuedEnum<GstBusSyncReply>
{

    GST_BUS_SYNC_REPLY_DROP(0L),
    GST_BUS_SYNC_REPLY_PASS(1L),
    GST_BUS_SYNC_REPLY_ASYNC(2L);
    public final long value;

    GstBusSyncReply(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstBusSyncReply> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstBusSyncReply> fromValue(int value) {
        return FlagSet.fromValue(value, GstBusSyncReply.values());
    }

}
