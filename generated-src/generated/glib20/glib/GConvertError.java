
package generated.glib20.glib;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GConvertError
    implements IntValuedEnum<GConvertError>
{

    _CONVERT_ERROR_NO_CONVERSION(0L),
    _CONVERT_ERROR_ILLEGAL_SEQUENCE(1L),
    _CONVERT_ERROR_FAILED(2L),
    _CONVERT_ERROR_PARTIAL_INPUT(3L),
    _CONVERT_ERROR_BAD_URI(4L),
    _CONVERT_ERROR_NOT_ABSOLUTE_PATH(5L),
    _CONVERT_ERROR_NO_MEMORY(6L);
    public final long value;

    GConvertError(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GConvertError> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GConvertError> fromValue(int value) {
        return FlagSet.fromValue(value, GConvertError.values());
    }

}
