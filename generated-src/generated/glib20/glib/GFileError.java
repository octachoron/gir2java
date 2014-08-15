
package generated.glib20.glib;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GFileError
    implements IntValuedEnum<GFileError>
{

    _FILE_ERROR_EXIST(0L),
    _FILE_ERROR_ISDIR(1L),
    _FILE_ERROR_ACCES(2L),
    _FILE_ERROR_NAMETOOLONG(3L),
    _FILE_ERROR_NOENT(4L),
    _FILE_ERROR_NOTDIR(5L),
    _FILE_ERROR_NXIO(6L),
    _FILE_ERROR_NODEV(7L),
    _FILE_ERROR_ROFS(8L),
    _FILE_ERROR_TXTBSY(9L),
    _FILE_ERROR_FAULT(10L),
    _FILE_ERROR_LOOP(11L),
    _FILE_ERROR_NOSPC(12L),
    _FILE_ERROR_NOMEM(13L),
    _FILE_ERROR_MFILE(14L),
    _FILE_ERROR_NFILE(15L),
    _FILE_ERROR_BADF(16L),
    _FILE_ERROR_INVAL(17L),
    _FILE_ERROR_PIPE(18L),
    _FILE_ERROR_AGAIN(19L),
    _FILE_ERROR_INTR(20L),
    _FILE_ERROR_IO(21L),
    _FILE_ERROR_PERM(22L),
    _FILE_ERROR_NOSYS(23L),
    _FILE_ERROR_FAILED(24L);
    public final long value;

    GFileError(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GFileError> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GFileError> fromValue(int value) {
        return FlagSet.fromValue(value, GFileError.values());
    }

}
