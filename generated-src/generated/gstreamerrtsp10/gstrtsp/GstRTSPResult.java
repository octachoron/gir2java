
package generated.gstreamerrtsp10.gstrtsp;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstRTSPResult
    implements IntValuedEnum<GstRTSPResult>
{

    GSTRTSP_RESULT_OK(0L),
    GSTRTSP_RESULT_ERROR(-1L),
    GSTRTSP_RESULT_EINVAL(-2L),
    GSTRTSP_RESULT_EINTR(-3L),
    GSTRTSP_RESULT_ENOMEM(-4L),
    GSTRTSP_RESULT_ERESOLV(-5L),
    GSTRTSP_RESULT_ENOTIMPL(-6L),
    GSTRTSP_RESULT_ESYS(-7L),
    GSTRTSP_RESULT_EPARSE(-8L),
    GSTRTSP_RESULT_EWSASTART(-9L),
    GSTRTSP_RESULT_EWSAVERSION(-10L),
    GSTRTSP_RESULT_EEOF(-11L),
    GSTRTSP_RESULT_ENET(-12L),
    GSTRTSP_RESULT_ENOTIP(-13L),
    GSTRTSP_RESULT_ETIMEOUT(-14L),
    GSTRTSP_RESULT_ETGET(-15L),
    GSTRTSP_RESULT_ETPOST(-16L),
    GSTRTSP_RESULT_ELAST(-17L);
    public final long value;

    GstRTSPResult(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstRTSPResult> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstRTSPResult> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
