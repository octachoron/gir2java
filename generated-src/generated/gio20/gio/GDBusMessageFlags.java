
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GDBusMessageFlags
    implements IntValuedEnum<GDBusMessageFlags>
{

    D_BUS_MESSAGE_FLAGS_NONE(0L),
    D_BUS_MESSAGE_FLAGS_NO_REPLY_EXPECTED(1L),
    D_BUS_MESSAGE_FLAGS_NO_AUTO_START(2L);
    public final long value;

    GDBusMessageFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GDBusMessageFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GDBusMessageFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GDBusMessageFlags.values());
    }

}
