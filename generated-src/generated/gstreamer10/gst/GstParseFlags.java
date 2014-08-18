
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstParseFlags
    implements IntValuedEnum<GstParseFlags>
{

    GST_PARSE_FLAGS_NONE(0L),
    GST_PARSE_FLAGS_FATAL_ERRORS(1L),
    GST_PARSE_FLAGS_NO_SINGLE_ELEMENT_BINS(2L);
    public final long value;

    GstParseFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstParseFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstParseFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GstParseFlags.values());
    }

}
