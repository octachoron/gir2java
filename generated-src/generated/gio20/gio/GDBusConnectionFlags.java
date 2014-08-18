
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GDBusConnectionFlags
    implements IntValuedEnum<GDBusConnectionFlags>
{

    D_BUS_CONNECTION_FLAGS_NONE(0L),
    D_BUS_CONNECTION_FLAGS_AUTHENTICATION_CLIENT(1L),
    D_BUS_CONNECTION_FLAGS_AUTHENTICATION_SERVER(2L),
    D_BUS_CONNECTION_FLAGS_AUTHENTICATION_ALLOW_ANONYMOUS(4L),
    D_BUS_CONNECTION_FLAGS_MESSAGE_BUS_CONNECTION(8L),
    D_BUS_CONNECTION_FLAGS_DELAY_MESSAGE_PROCESSING(16L);
    public final long value;

    GDBusConnectionFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GDBusConnectionFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GDBusConnectionFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GDBusConnectionFlags.values());
    }

}
