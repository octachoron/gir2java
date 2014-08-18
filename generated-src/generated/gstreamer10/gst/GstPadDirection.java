
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstPadDirection
    implements IntValuedEnum<GstPadDirection>
{

    GST_PAD_DIRECTION_UNKNOWN(0L),
    GST_PAD_DIRECTION_SRC(1L),
    GST_PAD_DIRECTION_SINK(2L);
    public final long value;

    GstPadDirection(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstPadDirection> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstPadDirection> fromValue(int value) {
        return FlagSet.fromValue(value, GstPadDirection.values());
    }

}
