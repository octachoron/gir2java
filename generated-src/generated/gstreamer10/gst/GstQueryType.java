
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Ptr;

public enum GstQueryType
    implements IntValuedEnum<GstQueryType>
{

    GST_QUERY_TYPE_UNKNOWN(0L),
    GST_QUERY_TYPE_POSITION(2563L),
    GST_QUERY_TYPE_DURATION(5123L),
    GST_QUERY_TYPE_LATENCY(7683L),
    GST_QUERY_TYPE_JITTER(10243L),
    GST_QUERY_TYPE_RATE(12803L),
    GST_QUERY_TYPE_SEEKING(15363L),
    GST_QUERY_TYPE_SEGMENT(17923L),
    GST_QUERY_TYPE_CONVERT(20483L),
    GST_QUERY_TYPE_FORMATS(23043L),
    GST_QUERY_TYPE_BUFFERING(28163L),
    GST_QUERY_TYPE_CUSTOM(30723L),
    GST_QUERY_TYPE_URI(33283L),
    GST_QUERY_TYPE_ALLOCATION(35846L),
    GST_QUERY_TYPE_SCHEDULING(38401L),
    GST_QUERY_TYPE_ACCEPT_CAPS(40963L),
    GST_QUERY_TYPE_CAPS(43523L),
    GST_QUERY_TYPE_DRAIN(46086L),
    GST_QUERY_TYPE_CONTEXT(48643L);
    public final long value;

    GstQueryType(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstQueryType> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstQueryType> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

    public native Object gst_query_type_get_flags(IntValuedEnum<GstQueryType> type);

    public native Object gst_query_type_to_quark(IntValuedEnum<GstQueryType> type);

    @Ptr
    protected native long gst_query_type_get_name(IntValuedEnum<GstQueryType> type);

    public Pointer get_name(IntValuedEnum<GstQueryType> type) {
        return Pointer.pointerToAddress(this.gst_query_type_get_name(type));
    }

}
