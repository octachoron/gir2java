
package generated.gstreamerrtp10.gstrtp;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstRTPPayload
    implements IntValuedEnum<GstRTPPayload>
{

    GSTRTP_PAYLOAD_PCMU(0L),
    GSTRTP_PAYLOAD_1016(1L),
    GSTRTP_PAYLOAD_G721(2L),
    GSTRTP_PAYLOAD_GSM(3L),
    GSTRTP_PAYLOAD_G723(4L),
    GSTRTP_PAYLOAD_DVI4_8000(5L),
    GSTRTP_PAYLOAD_DVI4_16000(6L),
    GSTRTP_PAYLOAD_LPC(7L),
    GSTRTP_PAYLOAD_PCMA(8L),
    GSTRTP_PAYLOAD_G722(9L),
    GSTRTP_PAYLOAD_L16_STEREO(10L),
    GSTRTP_PAYLOAD_L16_MONO(11L),
    GSTRTP_PAYLOAD_QCELP(12L),
    GSTRTP_PAYLOAD_CN(13L),
    GSTRTP_PAYLOAD_MPA(14L),
    GSTRTP_PAYLOAD_G728(15L),
    GSTRTP_PAYLOAD_DVI4_11025(16L),
    GSTRTP_PAYLOAD_DVI4_22050(17L),
    GSTRTP_PAYLOAD_G729(18L),
    GSTRTP_PAYLOAD_CELLB(25L),
    GSTRTP_PAYLOAD_JPEG(26L),
    GSTRTP_PAYLOAD_NV(28L),
    GSTRTP_PAYLOAD_H261(31L),
    GSTRTP_PAYLOAD_MPV(32L),
    GSTRTP_PAYLOAD_MP2T(33L),
    GSTRTP_PAYLOAD_H263(34L);
    public final long value;

    GstRTPPayload(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstRTPPayload> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstRTPPayload> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
