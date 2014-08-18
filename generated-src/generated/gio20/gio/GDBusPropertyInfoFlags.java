
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GDBusPropertyInfoFlags
    implements IntValuedEnum<GDBusPropertyInfoFlags>
{

    D_BUS_PROPERTY_INFO_FLAGS_NONE(0L),
    D_BUS_PROPERTY_INFO_FLAGS_READABLE(1L),
    D_BUS_PROPERTY_INFO_FLAGS_WRITABLE(2L);
    public final long value;

    GDBusPropertyInfoFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GDBusPropertyInfoFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GDBusPropertyInfoFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GDBusPropertyInfoFlags.values());
    }

}
