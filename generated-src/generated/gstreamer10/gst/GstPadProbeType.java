
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstPadProbeType
    implements IntValuedEnum<GstPadProbeType>
{

    GST_PAD_PROBE_TYPE_INVALID(0L),
    GST_PAD_PROBE_TYPE_IDLE(1L),
    GST_PAD_PROBE_TYPE_BLOCK(2L),
    GST_PAD_PROBE_TYPE_BUFFER(16L),
    GST_PAD_PROBE_TYPE_BUFFER_LIST(32L),
    GST_PAD_PROBE_TYPE_EVENT_DOWNSTREAM(64L),
    GST_PAD_PROBE_TYPE_EVENT_UPSTREAM(128L),
    GST_PAD_PROBE_TYPE_EVENT_FLUSH(256L),
    GST_PAD_PROBE_TYPE_QUERY_DOWNSTREAM(512L),
    GST_PAD_PROBE_TYPE_QUERY_UPSTREAM(1024L),
    GST_PAD_PROBE_TYPE_PUSH(4096L),
    GST_PAD_PROBE_TYPE_PULL(8192L),
    GST_PAD_PROBE_TYPE_BLOCKING(3L),
    GST_PAD_PROBE_TYPE_DATA_DOWNSTREAM(112L),
    GST_PAD_PROBE_TYPE_DATA_UPSTREAM(128L),
    GST_PAD_PROBE_TYPE_DATA_BOTH(240L),
    GST_PAD_PROBE_TYPE_BLOCK_DOWNSTREAM(114L),
    GST_PAD_PROBE_TYPE_BLOCK_UPSTREAM(130L),
    GST_PAD_PROBE_TYPE_EVENT_BOTH(192L),
    GST_PAD_PROBE_TYPE_QUERY_BOTH(1536L),
    GST_PAD_PROBE_TYPE_ALL_BOTH(1776L),
    GST_PAD_PROBE_TYPE_SCHEDULING(12288L);
    public final long value;

    GstPadProbeType(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstPadProbeType> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstPadProbeType> fromValue(int value) {
        return FlagSet.fromValue(value, GstPadProbeType.values());
    }

}
