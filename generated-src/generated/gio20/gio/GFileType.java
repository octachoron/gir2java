
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GFileType
    implements IntValuedEnum<GFileType>
{

    _FILE_TYPE_UNKNOWN(0L),
    _FILE_TYPE_REGULAR(1L),
    _FILE_TYPE_DIRECTORY(2L),
    _FILE_TYPE_SYMBOLIC_LINK(3L),
    _FILE_TYPE_SPECIAL(4L),
    _FILE_TYPE_SHORTCUT(5L),
    _FILE_TYPE_MOUNTABLE(6L);
    public final long value;

    GFileType(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GFileType> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GFileType> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
