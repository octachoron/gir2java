
package generated.gstreamerrtp10.gstrtp;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstRTCPFBType
    implements IntValuedEnum<GstRTCPFBType>
{

    GSTRTCPFB_TYPE_FB_TYPE_INVALID(0L),
    GSTRTCPFB_TYPE_RTPFB_TYPE_NACK(1L),
    GSTRTCPFB_TYPE_RTPFB_TYPE_TMMBR(3L),
    GSTRTCPFB_TYPE_RTPFB_TYPE_TMMBN(4L),
    GSTRTCPFB_TYPE_RTPFB_TYPE_RCTP_SR_REQ(5L),
    GSTRTCPFB_TYPE_PSFB_TYPE_PLI(1L),
    GSTRTCPFB_TYPE_PSFB_TYPE_SLI(2L),
    GSTRTCPFB_TYPE_PSFB_TYPE_RPSI(3L),
    GSTRTCPFB_TYPE_PSFB_TYPE_AFB(15L),
    GSTRTCPFB_TYPE_PSFB_TYPE_FIR(4L),
    GSTRTCPFB_TYPE_PSFB_TYPE_TSTR(5L),
    GSTRTCPFB_TYPE_PSFB_TYPE_TSTN(6L),
    GSTRTCPFB_TYPE_PSFB_TYPE_VBCN(7L);
    public final long value;

    GstRTCPFBType(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstRTCPFBType> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstRTCPFBType> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
