
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstStreamError
    implements IntValuedEnum<GstStreamError>
{

    GST_STREAM_ERROR_FAILED(1L),
    GST_STREAM_ERROR_TOO_LAZY(2L),
    GST_STREAM_ERROR_NOT_IMPLEMENTED(3L),
    GST_STREAM_ERROR_TYPE_NOT_FOUND(4L),
    GST_STREAM_ERROR_WRONG_TYPE(5L),
    GST_STREAM_ERROR_CODEC_NOT_FOUND(6L),
    GST_STREAM_ERROR_DECODE(7L),
    GST_STREAM_ERROR_ENCODE(8L),
    GST_STREAM_ERROR_DEMUX(9L),
    GST_STREAM_ERROR_MUX(10L),
    GST_STREAM_ERROR_FORMAT(11L),
    GST_STREAM_ERROR_DECRYPT(12L),
    GST_STREAM_ERROR_DECRYPT_NOKEY(13L),
    GST_STREAM_ERROR_NUM_ERRORS(14L);
    public final long value;

    GstStreamError(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstStreamError> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstStreamError> fromValue(int value) {
        return FlagSet.fromValue(value, GstStreamError.values());
    }

    public static native long gst_stream_error_quark();

}
