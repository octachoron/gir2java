
package generated.gstreamerrtsp10.gstrtsp;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstRTSPTimeType
    implements IntValuedEnum<GstRTSPTimeType>
{

    GSTRTSP_TIME_TYPE_SECONDS(0L),
    GSTRTSP_TIME_TYPE_NOW(1L),
    GSTRTSP_TIME_TYPE_END(2L),
    GSTRTSP_TIME_TYPE_FRAMES(3L),
    GSTRTSP_TIME_TYPE_UTC(4L);
    public final long value;

    GstRTSPTimeType(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstRTSPTimeType> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstRTSPTimeType> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
