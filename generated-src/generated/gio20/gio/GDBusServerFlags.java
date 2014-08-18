
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GDBusServerFlags
    implements IntValuedEnum<GDBusServerFlags>
{

    D_BUS_SERVER_FLAGS_NONE(0L),
    D_BUS_SERVER_FLAGS_RUN_IN_THREAD(1L),
    D_BUS_SERVER_FLAGS_AUTHENTICATION_ALLOW_ANONYMOUS(2L);
    public final long value;

    GDBusServerFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GDBusServerFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GDBusServerFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GDBusServerFlags.values());
    }

}
