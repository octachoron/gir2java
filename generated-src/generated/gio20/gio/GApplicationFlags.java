
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GApplicationFlags
    implements IntValuedEnum<GApplicationFlags>
{

    _APPLICATION_FLAGS_FLAGS_NONE(0L),
    _APPLICATION_FLAGS_IS_SERVICE(1L),
    _APPLICATION_FLAGS_IS_LAUNCHER(2L),
    _APPLICATION_FLAGS_HANDLES_OPEN(4L),
    _APPLICATION_FLAGS_HANDLES_COMMAND_LINE(8L),
    _APPLICATION_FLAGS_SEND_ENVIRONMENT(16L),
    _APPLICATION_FLAGS_NON_UNIQUE(32L);
    public final long value;

    GApplicationFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GApplicationFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GApplicationFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GApplicationFlags.values());
    }

}
