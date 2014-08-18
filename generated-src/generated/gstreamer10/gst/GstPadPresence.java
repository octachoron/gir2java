
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstPadPresence
    implements IntValuedEnum<GstPadPresence>
{

    GST_PAD_PRESENCE_ALWAYS(0L),
    GST_PAD_PRESENCE_SOMETIMES(1L),
    GST_PAD_PRESENCE_REQUEST(2L);
    public final long value;

    GstPadPresence(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstPadPresence> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstPadPresence> fromValue(int value) {
        return FlagSet.fromValue(value, GstPadPresence.values());
    }

}
