
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GSubprocessFlags
    implements IntValuedEnum<GSubprocessFlags>
{

    _SUBPROCESS_FLAGS_NONE(0L),
    _SUBPROCESS_FLAGS_STDIN_PIPE(1L),
    _SUBPROCESS_FLAGS_STDIN_INHERIT(2L),
    _SUBPROCESS_FLAGS_STDOUT_PIPE(4L),
    _SUBPROCESS_FLAGS_STDOUT_SILENCE(8L),
    _SUBPROCESS_FLAGS_STDERR_PIPE(16L),
    _SUBPROCESS_FLAGS_STDERR_SILENCE(32L),
    _SUBPROCESS_FLAGS_STDERR_MERGE(64L),
    _SUBPROCESS_FLAGS_INHERIT_FDS(128L);
    public final long value;

    GSubprocessFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GSubprocessFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GSubprocessFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GSubprocessFlags.values());
    }

}
