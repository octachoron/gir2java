
package generated.glib20.glib;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GOptionError
    implements IntValuedEnum<GOptionError>
{

    _OPTION_ERROR_UNKNOWN_OPTION(0L),
    _OPTION_ERROR_BAD_VALUE(1L),
    _OPTION_ERROR_FAILED(2L);
    public final long value;

    GOptionError(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GOptionError> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GOptionError> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
