
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstCapsFlags
    implements IntValuedEnum<GstCapsFlags>
{

    GST_CAPS_FLAGS_ANY(16L);
    public final long value;

    GstCapsFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstCapsFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstCapsFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GstCapsFlags.values());
    }

}
