
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstBinFlags
    implements IntValuedEnum<GstBinFlags>
{

    GST_BIN_FLAGS_NO_RESYNC(16384L),
    GST_BIN_FLAGS_LAST(524288L);
    public final long value;

    GstBinFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstBinFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstBinFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GstBinFlags.values());
    }

}
