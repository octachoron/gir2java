
package generated.glib20.glib;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GKeyFileFlags
    implements IntValuedEnum<GKeyFileFlags>
{

    _KEY_FILE_FLAGS_NONE(0L),
    _KEY_FILE_FLAGS_KEEP_COMMENTS(1L),
    _KEY_FILE_FLAGS_KEEP_TRANSLATIONS(2L);
    public final long value;

    GKeyFileFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GKeyFileFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GKeyFileFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GKeyFileFlags.values());
    }

}
