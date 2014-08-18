
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Ptr;

public enum GstMessageType implements IntValuedEnum<GstMessageType>
{

    GST_MESSAGE_TYPE_UNKNOWN(0L),
    GST_MESSAGE_TYPE_EOS(1L),
    GST_MESSAGE_TYPE_ERROR(2L),
    GST_MESSAGE_TYPE_WARNING(4L),
    GST_MESSAGE_TYPE_INFO(8L),
    GST_MESSAGE_TYPE_TAG(16L),
    GST_MESSAGE_TYPE_BUFFERING(32L),
    GST_MESSAGE_TYPE_STATE_CHANGED(64L),
    GST_MESSAGE_TYPE_STATE_DIRTY(128L),
    GST_MESSAGE_TYPE_STEP_DONE(256L),
    GST_MESSAGE_TYPE_CLOCK_PROVIDE(512L),
    GST_MESSAGE_TYPE_CLOCK_LOST(1024L),
    GST_MESSAGE_TYPE_NEW_CLOCK(2048L),
    GST_MESSAGE_TYPE_STRUCTURE_CHANGE(4096L),
    GST_MESSAGE_TYPE_STREAM_STATUS(8192L),
    GST_MESSAGE_TYPE_APPLICATION(16384L),
    GST_MESSAGE_TYPE_ELEMENT(32768L),
    GST_MESSAGE_TYPE_SEGMENT_START(65536L),
    GST_MESSAGE_TYPE_SEGMENT_DONE(131072L),
    GST_MESSAGE_TYPE_DURATION_CHANGED(262144L),
    GST_MESSAGE_TYPE_LATENCY(524288L),
    GST_MESSAGE_TYPE_ASYNC_START(1048576L),
    GST_MESSAGE_TYPE_ASYNC_DONE(2097152L),
    GST_MESSAGE_TYPE_REQUEST_STATE(4194304L),
    GST_MESSAGE_TYPE_STEP_START(8388608L),
    GST_MESSAGE_TYPE_QOS(16777216L),
    GST_MESSAGE_TYPE_PROGRESS(33554432L),
    GST_MESSAGE_TYPE_TOC(67108864L),
    GST_MESSAGE_TYPE_RESET_TIME(134217728L),
    GST_MESSAGE_TYPE_STREAM_START(268435456L),
    GST_MESSAGE_TYPE_NEED_CONTEXT(536870912L),
    GST_MESSAGE_TYPE_HAVE_CONTEXT(1073741824L),
    GST_MESSAGE_TYPE_ANY(-1L);
    public final long value;

    GstMessageType(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstMessageType> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstMessageType> fromValue(int value) {
        return FlagSet.fromValue(value, GstMessageType.values());
    }

    public static native long gst_message_type_to_quark(IntValuedEnum<GstMessageType> type);

    @Ptr
    protected static native long gst_message_type_get_name(IntValuedEnum<GstMessageType> type);

    public static Pointer get_name(IntValuedEnum<GstMessageType> type) {
        return Pointer.pointerToAddress(GstMessageType.gst_message_type_get_name(type));
    }

}
