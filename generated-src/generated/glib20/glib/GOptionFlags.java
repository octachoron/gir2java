
package generated.glib20.glib;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GOptionFlags
    implements IntValuedEnum<GOptionFlags>
{

    _OPTION_FLAGS_HIDDEN(1L),
    _OPTION_FLAGS_IN_MAIN(2L),
    _OPTION_FLAGS_REVERSE(4L),
    _OPTION_FLAGS_NO_ARG(8L),
    _OPTION_FLAGS_FILENAME(16L),
    _OPTION_FLAGS_OPTIONAL_ARG(32L),
    _OPTION_FLAGS_NOALIAS(64L);
    public final long value;

    GOptionFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GOptionFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GOptionFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GOptionFlags.values());
    }

}
