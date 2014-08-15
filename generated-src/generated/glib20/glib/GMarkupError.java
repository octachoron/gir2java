
package generated.glib20.glib;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GMarkupError
    implements IntValuedEnum<GMarkupError>
{

    _MARKUP_ERROR_BAD_UTF8(0L),
    _MARKUP_ERROR_EMPTY(1L),
    _MARKUP_ERROR_PARSE(2L),
    _MARKUP_ERROR_UNKNOWN_ELEMENT(3L),
    _MARKUP_ERROR_UNKNOWN_ATTRIBUTE(4L),
    _MARKUP_ERROR_INVALID_CONTENT(5L),
    _MARKUP_ERROR_MISSING_ATTRIBUTE(6L);
    public final long value;

    GMarkupError(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GMarkupError> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GMarkupError> fromValue(int value) {
        return FlagSet.fromValue(value, GMarkupError.values());
    }

}
