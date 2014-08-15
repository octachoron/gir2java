
package generated.gobject20.gobject;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GTypeFlags
    implements IntValuedEnum<GTypeFlags>
{

    _TYPE_FLAGS_ABSTRACT(16L),
    _TYPE_FLAGS_VALUE_ABSTRACT(32L);
    public final long value;

    GTypeFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GTypeFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GTypeFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GTypeFlags.values());
    }

}
