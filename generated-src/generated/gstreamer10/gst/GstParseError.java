
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstParseError
    implements IntValuedEnum<GstParseError>
{

    GST_PARSE_ERROR_SYNTAX(0L),
    GST_PARSE_ERROR_NO_SUCH_ELEMENT(1L),
    GST_PARSE_ERROR_NO_SUCH_PROPERTY(2L),
    GST_PARSE_ERROR_LINK(3L),
    GST_PARSE_ERROR_COULD_NOT_SET_PROPERTY(4L),
    GST_PARSE_ERROR_EMPTY_BIN(5L),
    GST_PARSE_ERROR_EMPTY(6L);
    public final long value;

    GstParseError(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstParseError> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstParseError> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

    public native Object gst_parse_error_quark();

}
