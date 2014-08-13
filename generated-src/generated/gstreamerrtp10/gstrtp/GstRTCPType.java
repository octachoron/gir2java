
package generated.gstreamerrtp10.gstrtp;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstRTCPType
    implements IntValuedEnum<GstRTCPType>
{

    GSTRTCP_TYPE_INVALID(0L),
    GSTRTCP_TYPE_SR(200L),
    GSTRTCP_TYPE_RR(201L),
    GSTRTCP_TYPE_SDES(202L),
    GSTRTCP_TYPE_BYE(203L),
    GSTRTCP_TYPE_APP(204L),
    GSTRTCP_TYPE_RTPFB(205L),
    GSTRTCP_TYPE_PSFB(206L);
    public final long value;

    GstRTCPType(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstRTCPType> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstRTCPType> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
