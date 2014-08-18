
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GDBusObjectManagerClientFlags
    implements IntValuedEnum<GDBusObjectManagerClientFlags>
{

    D_BUS_OBJECT_MANAGER_CLIENT_FLAGS_NONE(0L),
    D_BUS_OBJECT_MANAGER_CLIENT_FLAGS_DO_NOT_AUTO_START(1L);
    public final long value;

    GDBusObjectManagerClientFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GDBusObjectManagerClientFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GDBusObjectManagerClientFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GDBusObjectManagerClientFlags.values());
    }

}
