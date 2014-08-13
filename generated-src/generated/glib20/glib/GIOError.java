
package generated.glib20.glib;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GIOError
    implements IntValuedEnum<GIOError>
{

    IO_ERROR_NONE(0L),
    IO_ERROR_AGAIN(1L),
    IO_ERROR_INVAL(2L),
    IO_ERROR_UNKNOWN(3L);
    public final long value;

    GIOError(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GIOError> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GIOError> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
