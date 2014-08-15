
package generated.gobject20.gobject;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GSignalFlags
    implements IntValuedEnum<GSignalFlags>
{

    _SIGNAL_FLAGS_RUN_FIRST(1L),
    _SIGNAL_FLAGS_RUN_LAST(2L),
    _SIGNAL_FLAGS_RUN_CLEANUP(4L),
    _SIGNAL_FLAGS_NO_RECURSE(8L),
    _SIGNAL_FLAGS_DETAILED(16L),
    _SIGNAL_FLAGS_ACTION(32L),
    _SIGNAL_FLAGS_NO_HOOKS(64L),
    _SIGNAL_FLAGS_MUST_COLLECT(128L),
    _SIGNAL_FLAGS_DEPRECATED(256L);
    public final long value;

    GSignalFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GSignalFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GSignalFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GSignalFlags.values());
    }

}
