
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GDBusSignalFlags
    implements IntValuedEnum<GDBusSignalFlags>
{

    D_BUS_SIGNAL_FLAGS_NONE(0L),
    D_BUS_SIGNAL_FLAGS_NO_MATCH_RULE(1L),
    D_BUS_SIGNAL_FLAGS_MATCH_ARG0_NAMESPACE(2L),
    D_BUS_SIGNAL_FLAGS_MATCH_ARG0_PATH(4L);
    public final long value;

    GDBusSignalFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GDBusSignalFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GDBusSignalFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GDBusSignalFlags.values());
    }

}
