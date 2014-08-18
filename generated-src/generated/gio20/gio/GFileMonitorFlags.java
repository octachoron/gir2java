
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GFileMonitorFlags
    implements IntValuedEnum<GFileMonitorFlags>
{

    _FILE_MONITOR_FLAGS_NONE(0L),
    _FILE_MONITOR_FLAGS_WATCH_MOUNTS(1L),
    _FILE_MONITOR_FLAGS_SEND_MOVED(2L),
    _FILE_MONITOR_FLAGS_WATCH_HARD_LINKS(4L);
    public final long value;

    GFileMonitorFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GFileMonitorFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GFileMonitorFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GFileMonitorFlags.values());
    }

}
