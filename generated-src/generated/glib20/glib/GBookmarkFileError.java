
package generated.glib20.glib;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GBookmarkFileError
    implements IntValuedEnum<GBookmarkFileError>
{

    _BOOKMARK_FILE_ERROR_INVALID_URI(0L),
    _BOOKMARK_FILE_ERROR_INVALID_VALUE(1L),
    _BOOKMARK_FILE_ERROR_APP_NOT_REGISTERED(2L),
    _BOOKMARK_FILE_ERROR_URI_NOT_FOUND(3L),
    _BOOKMARK_FILE_ERROR_READ(4L),
    _BOOKMARK_FILE_ERROR_UNKNOWN_ENCODING(5L),
    _BOOKMARK_FILE_ERROR_WRITE(6L),
    _BOOKMARK_FILE_ERROR_FILE_NOT_FOUND(7L);
    public final long value;

    GBookmarkFileError(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GBookmarkFileError> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GBookmarkFileError> fromValue(int value) {
        return FlagSet.fromValue(value, GBookmarkFileError.values());
    }

}
