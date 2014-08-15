
package generated.glib20.glib;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GErrorType
    implements IntValuedEnum<GErrorType>
{

    _ERROR_TYPE_UNKNOWN(0L),
    _ERROR_TYPE_UNEXP_EOF(1L),
    _ERROR_TYPE_UNEXP_EOF_IN_STRING(2L),
    _ERROR_TYPE_UNEXP_EOF_IN_COMMENT(3L),
    _ERROR_TYPE_NON_DIGIT_IN_CONST(4L),
    _ERROR_TYPE_DIGIT_RADIX(5L),
    _ERROR_TYPE_FLOAT_RADIX(6L),
    _ERROR_TYPE_FLOAT_MALFORMED(7L);
    public final long value;

    GErrorType(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GErrorType> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GErrorType> fromValue(int value) {
        return FlagSet.fromValue(value, GErrorType.values());
    }

}
