
package generated.gobject20.gobject;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GConnectFlags
    implements IntValuedEnum<GConnectFlags>
{

    _CONNECT_FLAGS_AFTER(1L),
    _CONNECT_FLAGS_SWAPPED(2L);
    public final long value;

    GConnectFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GConnectFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GConnectFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GConnectFlags.values());
    }

}
