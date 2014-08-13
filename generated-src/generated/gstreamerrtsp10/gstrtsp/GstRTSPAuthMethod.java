
package generated.gstreamerrtsp10.gstrtsp;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstRTSPAuthMethod
    implements IntValuedEnum<GstRTSPAuthMethod>
{

    GSTRTSP_AUTH_METHOD_NONE(0L),
    GSTRTSP_AUTH_METHOD_BASIC(1L),
    GSTRTSP_AUTH_METHOD_DIGEST(2L);
    public final long value;

    GstRTSPAuthMethod(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstRTSPAuthMethod> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstRTSPAuthMethod> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
