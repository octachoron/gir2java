
package generated.glib20.glib;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GMarkupParseFlags
    implements IntValuedEnum<GMarkupParseFlags>
{

    _MARKUP_PARSE_FLAGS_DO_NOT_USE_THIS_UNSUPPORTED_FLAG(1L),
    _MARKUP_PARSE_FLAGS_TREAT_CDATA_AS_TEXT(2L),
    _MARKUP_PARSE_FLAGS_PREFIX_ERROR_POSITION(4L),
    _MARKUP_PARSE_FLAGS_IGNORE_QUALIFIED(8L);
    public final long value;

    GMarkupParseFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GMarkupParseFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GMarkupParseFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GMarkupParseFlags.values());
    }

}
