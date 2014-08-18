
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Ptr;

public enum GstEventType implements IntValuedEnum<GstEventType>
{

    GST_EVENT_TYPE_UNKNOWN(0L),
    GST_EVENT_TYPE_FLUSH_START(2563L),
    GST_EVENT_TYPE_FLUSH_STOP(5127L),
    GST_EVENT_TYPE_STREAM_START(10254L),
    GST_EVENT_TYPE_CAPS(12814L),
    GST_EVENT_TYPE_SEGMENT(17934L),
    GST_EVENT_TYPE_TAG(20510L),
    GST_EVENT_TYPE_BUFFERSIZE(23054L),
    GST_EVENT_TYPE_SINK_MESSAGE(25630L),
    GST_EVENT_TYPE_EOS(28174L),
    GST_EVENT_TYPE_TOC(30750L),
    GST_EVENT_TYPE_SEGMENT_DONE(38406L),
    GST_EVENT_TYPE_GAP(40966L),
    GST_EVENT_TYPE_QOS(48641L),
    GST_EVENT_TYPE_SEEK(51201L),
    GST_EVENT_TYPE_NAVIGATION(53761L),
    GST_EVENT_TYPE_LATENCY(56321L),
    GST_EVENT_TYPE_STEP(58881L),
    GST_EVENT_TYPE_RECONFIGURE(61441L),
    GST_EVENT_TYPE_TOC_SELECT(64001L),
    GST_EVENT_TYPE_CUSTOM_UPSTREAM(69121L),
    GST_EVENT_TYPE_CUSTOM_DOWNSTREAM(71686L),
    GST_EVENT_TYPE_CUSTOM_DOWNSTREAM_OOB(74242L),
    GST_EVENT_TYPE_CUSTOM_DOWNSTREAM_STICKY(76830L),
    GST_EVENT_TYPE_CUSTOM_BOTH(79367L),
    GST_EVENT_TYPE_CUSTOM_BOTH_OOB(81923L);
    public final long value;

    GstEventType(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstEventType> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstEventType> fromValue(int value) {
        return FlagSet.fromValue(value, GstEventType.values());
    }

    public static native long gst_event_type_to_quark(IntValuedEnum<GstEventType> type);

    public static native IntValuedEnum<GstEventTypeFlags> gst_event_type_get_flags(IntValuedEnum<GstEventType> type);

    @Ptr
    protected static native long gst_event_type_get_name(IntValuedEnum<GstEventType> type);

    public static Pointer get_name(IntValuedEnum<GstEventType> type) {
        return Pointer.pointerToAddress(GstEventType.gst_event_type_get_name(type));
    }

}
