
package generated.glib20.glib;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GOptionArg
    implements IntValuedEnum<GOptionArg>
{

    _OPTION_ARG_NONE(0L),
    _OPTION_ARG_STRING(1L),
    _OPTION_ARG_INT(2L),
    _OPTION_ARG_CALLBACK(3L),
    _OPTION_ARG_FILENAME(4L),
    _OPTION_ARG_STRING_ARRAY(5L),
    _OPTION_ARG_FILENAME_ARRAY(6L),
    _OPTION_ARG_DOUBLE(7L),
    _OPTION_ARG_INT64(8L);
    public final long value;

    GOptionArg(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GOptionArg> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GOptionArg> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
