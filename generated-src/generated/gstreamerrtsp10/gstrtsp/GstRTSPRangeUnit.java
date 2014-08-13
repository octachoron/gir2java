
package generated.gstreamerrtsp10.gstrtsp;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstRTSPRangeUnit
    implements IntValuedEnum<GstRTSPRangeUnit>
{

    GSTRTSP_RANGE_UNIT_SMPTE(0L),
    GSTRTSP_RANGE_UNIT_SMPTE_30_DROP(1L),
    GSTRTSP_RANGE_UNIT_SMPTE_25(2L),
    GSTRTSP_RANGE_UNIT_NPT(3L),
    GSTRTSP_RANGE_UNIT_CLOCK(4L);
    public final long value;

    GstRTSPRangeUnit(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstRTSPRangeUnit> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstRTSPRangeUnit> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
