
package generated.glib20.glib;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GSpawnError
    implements IntValuedEnum<GSpawnError>
{

    _SPAWN_ERROR_FORK(0L),
    _SPAWN_ERROR_READ(1L),
    _SPAWN_ERROR_CHDIR(2L),
    _SPAWN_ERROR_ACCES(3L),
    _SPAWN_ERROR_PERM(4L),
    _SPAWN_ERROR_TOO_BIG(5L),
    _SPAWN_ERROR_2BIG(5L),
    _SPAWN_ERROR_NOEXEC(6L),
    _SPAWN_ERROR_NAMETOOLONG(7L),
    _SPAWN_ERROR_NOENT(8L),
    _SPAWN_ERROR_NOMEM(9L),
    _SPAWN_ERROR_NOTDIR(10L),
    _SPAWN_ERROR_LOOP(11L),
    _SPAWN_ERROR_TXTBUSY(12L),
    _SPAWN_ERROR_IO(13L),
    _SPAWN_ERROR_NFILE(14L),
    _SPAWN_ERROR_MFILE(15L),
    _SPAWN_ERROR_INVAL(16L),
    _SPAWN_ERROR_ISDIR(17L),
    _SPAWN_ERROR_LIBBAD(18L),
    _SPAWN_ERROR_FAILED(19L);
    public final long value;

    GSpawnError(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GSpawnError> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GSpawnError> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
