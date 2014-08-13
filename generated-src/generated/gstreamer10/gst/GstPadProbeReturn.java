
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstPadProbeReturn
    implements IntValuedEnum<GstPadProbeReturn>
{

    GST_PAD_PROBE_RETURN_DROP(0L),
    GST_PAD_PROBE_RETURN_OK(1L),
    GST_PAD_PROBE_RETURN_REMOVE(2L),
    GST_PAD_PROBE_RETURN_PASS(3L);
    public final long value;

    GstPadProbeReturn(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstPadProbeReturn> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstPadProbeReturn> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
