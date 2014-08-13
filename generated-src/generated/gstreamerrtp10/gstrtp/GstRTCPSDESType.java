
package generated.gstreamerrtp10.gstrtp;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstRTCPSDESType
    implements IntValuedEnum<GstRTCPSDESType>
{

    GSTRTCPSDES_TYPE_INVALID(-1L),
    GSTRTCPSDES_TYPE_END(0L),
    GSTRTCPSDES_TYPE_CNAME(1L),
    GSTRTCPSDES_TYPE_NAME(2L),
    GSTRTCPSDES_TYPE_EMAIL(3L),
    GSTRTCPSDES_TYPE_PHONE(4L),
    GSTRTCPSDES_TYPE_LOC(5L),
    GSTRTCPSDES_TYPE_TOOL(6L),
    GSTRTCPSDES_TYPE_NOTE(7L),
    GSTRTCPSDES_TYPE_PRIV(8L);
    public final long value;

    GstRTCPSDESType(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstRTCPSDESType> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstRTCPSDESType> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
