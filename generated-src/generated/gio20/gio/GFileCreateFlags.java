
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GFileCreateFlags
    implements IntValuedEnum<GFileCreateFlags>
{

    _FILE_CREATE_FLAGS_NONE(0L),
    _FILE_CREATE_FLAGS_PRIVATE(1L),
    _FILE_CREATE_FLAGS_REPLACE_DESTINATION(2L);
    public final long value;

    GFileCreateFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GFileCreateFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GFileCreateFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GFileCreateFlags.values());
    }

}
