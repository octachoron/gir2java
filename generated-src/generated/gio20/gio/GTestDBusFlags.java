
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GTestDBusFlags
    implements IntValuedEnum<GTestDBusFlags>
{

    _TESTD_BUS_FLAGS_NONE(0L);
    public final long value;

    GTestDBusFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GTestDBusFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GTestDBusFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GTestDBusFlags.values());
    }

}
