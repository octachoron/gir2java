
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GDBusCallFlags
    implements IntValuedEnum<GDBusCallFlags>
{

    D_BUS_CALL_FLAGS_NONE(0L),
    D_BUS_CALL_FLAGS_NO_AUTO_START(1L);
    public final long value;

    GDBusCallFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GDBusCallFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GDBusCallFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GDBusCallFlags.values());
    }

}
