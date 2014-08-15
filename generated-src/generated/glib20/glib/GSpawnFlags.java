
package generated.glib20.glib;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GSpawnFlags
    implements IntValuedEnum<GSpawnFlags>
{

    _SPAWN_FLAGS_DEFAULT(0L),
    _SPAWN_FLAGS_LEAVE_DESCRIPTORS_OPEN(1L),
    _SPAWN_FLAGS_DO_NOT_REAP_CHILD(2L),
    _SPAWN_FLAGS_SEARCH_PATH(4L),
    _SPAWN_FLAGS_STDOUT_TO_DEV_NULL(8L),
    _SPAWN_FLAGS_STDERR_TO_DEV_NULL(16L),
    _SPAWN_FLAGS_CHILD_INHERITS_STDIN(32L),
    _SPAWN_FLAGS_FILE_AND_ARGV_ZERO(64L),
    _SPAWN_FLAGS_SEARCH_PATH_FROM_ENVP(128L),
    _SPAWN_FLAGS_CLOEXEC_PIPES(256L);
    public final long value;

    GSpawnFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GSpawnFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GSpawnFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GSpawnFlags.values());
    }

}
