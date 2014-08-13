
package generated.glib20.glib;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GShellError
    implements IntValuedEnum<GShellError>
{

    _SHELL_ERROR_BAD_QUOTING(0L),
    _SHELL_ERROR_EMPTY_STRING(1L),
    _SHELL_ERROR_FAILED(2L);
    public final long value;

    GShellError(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GShellError> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GShellError> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
