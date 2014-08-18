
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GDBusCapabilityFlags
    implements IntValuedEnum<GDBusCapabilityFlags>
{

    D_BUS_CAPABILITY_FLAGS_NONE(0L),
    D_BUS_CAPABILITY_FLAGS_UNIX_FD_PASSING(1L);
    public final long value;

    GDBusCapabilityFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GDBusCapabilityFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GDBusCapabilityFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GDBusCapabilityFlags.values());
    }

}
