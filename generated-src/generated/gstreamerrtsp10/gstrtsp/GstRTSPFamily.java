
package generated.gstreamerrtsp10.gstrtsp;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstRTSPFamily
    implements IntValuedEnum<GstRTSPFamily>
{

    GSTRTSP_FAMILY_NONE(0L),
    GSTRTSP_FAMILY_INET(1L),
    GSTRTSP_FAMILY_INET6(2L);
    public final long value;

    GstRTSPFamily(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstRTSPFamily> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstRTSPFamily> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
