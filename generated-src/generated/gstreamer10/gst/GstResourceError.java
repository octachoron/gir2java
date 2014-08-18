
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstResourceError
    implements IntValuedEnum<GstResourceError>
{

    GST_RESOURCE_ERROR_FAILED(1L),
    GST_RESOURCE_ERROR_TOO_LAZY(2L),
    GST_RESOURCE_ERROR_NOT_FOUND(3L),
    GST_RESOURCE_ERROR_BUSY(4L),
    GST_RESOURCE_ERROR_OPEN_READ(5L),
    GST_RESOURCE_ERROR_OPEN_WRITE(6L),
    GST_RESOURCE_ERROR_OPEN_READ_WRITE(7L),
    GST_RESOURCE_ERROR_CLOSE(8L),
    GST_RESOURCE_ERROR_READ(9L),
    GST_RESOURCE_ERROR_WRITE(10L),
    GST_RESOURCE_ERROR_SEEK(11L),
    GST_RESOURCE_ERROR_SYNC(12L),
    GST_RESOURCE_ERROR_SETTINGS(13L),
    GST_RESOURCE_ERROR_NO_SPACE_LEFT(14L),
    GST_RESOURCE_ERROR_NOT_AUTHORIZED(15L),
    GST_RESOURCE_ERROR_NUM_ERRORS(16L);
    public final long value;

    GstResourceError(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstResourceError> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstResourceError> fromValue(int value) {
        return FlagSet.fromValue(value, GstResourceError.values());
    }

    public static native long gst_resource_error_quark();

}
