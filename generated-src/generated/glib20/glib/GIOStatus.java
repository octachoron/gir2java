
package generated.glib20.glib;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GIOStatus
    implements IntValuedEnum<GIOStatus>
{

    IO_STATUS_ERROR(0L),
    IO_STATUS_NORMAL(1L),
    IO_STATUS_EOF(2L),
    IO_STATUS_AGAIN(3L);
    public final long value;

    GIOStatus(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GIOStatus> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GIOStatus> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
