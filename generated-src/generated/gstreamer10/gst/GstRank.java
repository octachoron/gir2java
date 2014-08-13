
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstRank
    implements IntValuedEnum<GstRank>
{

    GST_RANK_NONE(0L),
    GST_RANK_MARGINAL(64L),
    GST_RANK_SECONDARY(128L),
    GST_RANK_PRIMARY(256L);
    public final long value;

    GstRank(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstRank> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstRank> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
