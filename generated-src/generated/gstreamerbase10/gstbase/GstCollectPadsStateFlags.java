
package generated.gstreamerbase10.gstbase;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstCollectPadsStateFlags
    implements IntValuedEnum<GstCollectPadsStateFlags>
{

    GST_COLLECT_PADS_STATE_FLAGS_EOS(1L),
    GST_COLLECT_PADS_STATE_FLAGS_FLUSHING(2L),
    GST_COLLECT_PADS_STATE_FLAGS_NEW_SEGMENT(4L),
    GST_COLLECT_PADS_STATE_FLAGS_WAITING(8L),
    GST_COLLECT_PADS_STATE_FLAGS_LOCKED(16L);
    public final long value;

    GstCollectPadsStateFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstCollectPadsStateFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstCollectPadsStateFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GstCollectPadsStateFlags.values());
    }

}
