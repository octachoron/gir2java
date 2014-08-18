
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GDBusProxyFlags
    implements IntValuedEnum<GDBusProxyFlags>
{

    D_BUS_PROXY_FLAGS_NONE(0L),
    D_BUS_PROXY_FLAGS_DO_NOT_LOAD_PROPERTIES(1L),
    D_BUS_PROXY_FLAGS_DO_NOT_CONNECT_SIGNALS(2L),
    D_BUS_PROXY_FLAGS_DO_NOT_AUTO_START(4L),
    D_BUS_PROXY_FLAGS_GET_INVALIDATED_PROPERTIES(8L),
    D_BUS_PROXY_FLAGS_DO_NOT_AUTO_START_AT_CONSTRUCTION(16L);
    public final long value;

    GDBusProxyFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GDBusProxyFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GDBusProxyFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GDBusProxyFlags.values());
    }

}
