
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstURIError
    implements IntValuedEnum<GstURIError>
{

    GSTURI_ERROR_UNSUPPORTED_PROTOCOL(0L),
    GSTURI_ERROR_BAD_URI(1L),
    GSTURI_ERROR_BAD_STATE(2L),
    GSTURI_ERROR_BAD_REFERENCE(3L);
    public final long value;

    GstURIError(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstURIError> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstURIError> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

    public native Object gst_uri_error_quark();

}
