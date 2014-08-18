
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstStateChangeReturn
    implements IntValuedEnum<GstStateChangeReturn>
{

    GST_STATE_CHANGE_RETURN_FAILURE(0L),
    GST_STATE_CHANGE_RETURN_SUCCESS(1L),
    GST_STATE_CHANGE_RETURN_ASYNC(2L),
    GST_STATE_CHANGE_RETURN_NO_PREROLL(3L);
    public final long value;

    GstStateChangeReturn(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstStateChangeReturn> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstStateChangeReturn> fromValue(int value) {
        return FlagSet.fromValue(value, GstStateChangeReturn.values());
    }

}
