
package generated.gstreamertag10.gsttag;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstTagDemuxResult
    implements IntValuedEnum<GstTagDemuxResult>
{

    GST_TAG_DEMUX_RESULT_BROKEN_TAG(0L),
    GST_TAG_DEMUX_RESULT_AGAIN(1L),
    GST_TAG_DEMUX_RESULT_OK(2L);
    public final long value;

    GstTagDemuxResult(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstTagDemuxResult> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstTagDemuxResult> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
