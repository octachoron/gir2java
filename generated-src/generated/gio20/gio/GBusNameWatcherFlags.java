
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GBusNameWatcherFlags
    implements IntValuedEnum<GBusNameWatcherFlags>
{

    _BUS_NAME_WATCHER_FLAGS_NONE(0L),
    _BUS_NAME_WATCHER_FLAGS_AUTO_START(1L);
    public final long value;

    GBusNameWatcherFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GBusNameWatcherFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GBusNameWatcherFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GBusNameWatcherFlags.values());
    }

}
