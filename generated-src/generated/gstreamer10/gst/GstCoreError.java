
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstCoreError
    implements IntValuedEnum<GstCoreError>
{

    GST_CORE_ERROR_FAILED(1L),
    GST_CORE_ERROR_TOO_LAZY(2L),
    GST_CORE_ERROR_NOT_IMPLEMENTED(3L),
    GST_CORE_ERROR_STATE_CHANGE(4L),
    GST_CORE_ERROR_PAD(5L),
    GST_CORE_ERROR_THREAD(6L),
    GST_CORE_ERROR_NEGOTIATION(7L),
    GST_CORE_ERROR_EVENT(8L),
    GST_CORE_ERROR_SEEK(9L),
    GST_CORE_ERROR_CAPS(10L),
    GST_CORE_ERROR_TAG(11L),
    GST_CORE_ERROR_MISSING_PLUGIN(12L),
    GST_CORE_ERROR_CLOCK(13L),
    GST_CORE_ERROR_DISABLED(14L),
    GST_CORE_ERROR_NUM_ERRORS(15L);
    public final long value;

    GstCoreError(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstCoreError> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstCoreError> fromValue(int value) {
        return FlagSet.fromValue(value, GstCoreError.values());
    }

    public static native long gst_core_error_quark();

}
