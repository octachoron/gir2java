
package generated.glib20.glib;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GKeyFileError
    implements IntValuedEnum<GKeyFileError>
{

    _KEY_FILE_ERROR_UNKNOWN_ENCODING(0L),
    _KEY_FILE_ERROR_PARSE(1L),
    _KEY_FILE_ERROR_NOT_FOUND(2L),
    _KEY_FILE_ERROR_KEY_NOT_FOUND(3L),
    _KEY_FILE_ERROR_GROUP_NOT_FOUND(4L),
    _KEY_FILE_ERROR_INVALID_VALUE(5L);
    public final long value;

    GKeyFileError(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GKeyFileError> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GKeyFileError> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
