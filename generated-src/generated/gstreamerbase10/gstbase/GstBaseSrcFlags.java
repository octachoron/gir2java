
package generated.gstreamerbase10.gstbase;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstBaseSrcFlags
    implements IntValuedEnum<GstBaseSrcFlags>
{

    GST_BASE_SRC_FLAGS_STARTING(16384L),
    GST_BASE_SRC_FLAGS_STARTED(32768L),
    GST_BASE_SRC_FLAGS_LAST(1048576L);
    public final long value;

    GstBaseSrcFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstBaseSrcFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstBaseSrcFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GstBaseSrcFlags.values());
    }

}
