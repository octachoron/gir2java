
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GFileCopyFlags
    implements IntValuedEnum<GFileCopyFlags>
{

    _FILE_COPY_FLAGS_NONE(0L),
    _FILE_COPY_FLAGS_OVERWRITE(1L),
    _FILE_COPY_FLAGS_BACKUP(2L),
    _FILE_COPY_FLAGS_NOFOLLOW_SYMLINKS(4L),
    _FILE_COPY_FLAGS_ALL_METADATA(8L),
    _FILE_COPY_FLAGS_NO_FALLBACK_FOR_MOVE(16L),
    _FILE_COPY_FLAGS_TARGET_DEFAULT_PERMS(32L);
    public final long value;

    GFileCopyFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GFileCopyFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GFileCopyFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GFileCopyFlags.values());
    }

}
