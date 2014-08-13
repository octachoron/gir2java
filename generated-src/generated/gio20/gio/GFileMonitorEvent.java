
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GFileMonitorEvent
    implements IntValuedEnum<GFileMonitorEvent>
{

    _FILE_MONITOR_EVENT_CHANGED(0L),
    _FILE_MONITOR_EVENT_CHANGES_DONE_HINT(1L),
    _FILE_MONITOR_EVENT_DELETED(2L),
    _FILE_MONITOR_EVENT_CREATED(3L),
    _FILE_MONITOR_EVENT_ATTRIBUTE_CHANGED(4L),
    _FILE_MONITOR_EVENT_PRE_UNMOUNT(5L),
    _FILE_MONITOR_EVENT_UNMOUNTED(6L),
    _FILE_MONITOR_EVENT_MOVED(7L);
    public final long value;

    GFileMonitorEvent(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GFileMonitorEvent> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GFileMonitorEvent> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
