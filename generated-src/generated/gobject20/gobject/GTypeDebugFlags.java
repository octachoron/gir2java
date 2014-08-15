
package generated.gobject20.gobject;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GTypeDebugFlags
    implements IntValuedEnum<GTypeDebugFlags>
{

    _TYPE_DEBUG_FLAGS_NONE(0L),
    _TYPE_DEBUG_FLAGS_OBJECTS(1L),
    _TYPE_DEBUG_FLAGS_SIGNALS(2L),
    _TYPE_DEBUG_FLAGS_MASK(3L);
    public final long value;

    GTypeDebugFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GTypeDebugFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GTypeDebugFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GTypeDebugFlags.values());
    }

}
