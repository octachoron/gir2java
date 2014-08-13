
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstLibraryError
    implements IntValuedEnum<GstLibraryError>
{

    GST_LIBRARY_ERROR_FAILED(1L),
    GST_LIBRARY_ERROR_TOO_LAZY(2L),
    GST_LIBRARY_ERROR_INIT(3L),
    GST_LIBRARY_ERROR_SHUTDOWN(4L),
    GST_LIBRARY_ERROR_SETTINGS(5L),
    GST_LIBRARY_ERROR_ENCODE(6L),
    GST_LIBRARY_ERROR_NUM_ERRORS(7L);
    public final long value;

    GstLibraryError(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstLibraryError> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstLibraryError> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

    public native Object gst_library_error_quark();

}
