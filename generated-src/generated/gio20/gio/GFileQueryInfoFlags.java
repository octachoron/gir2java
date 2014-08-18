
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GFileQueryInfoFlags
    implements IntValuedEnum<GFileQueryInfoFlags>
{

    _FILE_QUERY_INFO_FLAGS_NONE(0L),
    _FILE_QUERY_INFO_FLAGS_NOFOLLOW_SYMLINKS(1L);
    public final long value;

    GFileQueryInfoFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GFileQueryInfoFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GFileQueryInfoFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GFileQueryInfoFlags.values());
    }

}
