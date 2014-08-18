
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GBusNameOwnerFlags
    implements IntValuedEnum<GBusNameOwnerFlags>
{

    _BUS_NAME_OWNER_FLAGS_NONE(0L),
    _BUS_NAME_OWNER_FLAGS_ALLOW_REPLACEMENT(1L),
    _BUS_NAME_OWNER_FLAGS_REPLACE(2L);
    public final long value;

    GBusNameOwnerFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GBusNameOwnerFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GBusNameOwnerFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GBusNameOwnerFlags.values());
    }

}
