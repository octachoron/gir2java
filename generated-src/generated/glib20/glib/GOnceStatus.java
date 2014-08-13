
package generated.glib20.glib;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GOnceStatus
    implements IntValuedEnum<GOnceStatus>
{

    _ONCE_STATUS_NOTCALLED(0L),
    _ONCE_STATUS_PROGRESS(1L),
    _ONCE_STATUS_READY(2L);
    public final long value;

    GOnceStatus(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GOnceStatus> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GOnceStatus> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
