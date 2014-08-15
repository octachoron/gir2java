
package generated.gobject20.gobject;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GBindingFlags
    implements IntValuedEnum<GBindingFlags>
{

    _BINDING_FLAGS_DEFAULT(0L),
    _BINDING_FLAGS_BIDIRECTIONAL(1L),
    _BINDING_FLAGS_SYNC_CREATE(2L),
    _BINDING_FLAGS_INVERT_BOOLEAN(4L);
    public final long value;

    GBindingFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GBindingFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GBindingFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GBindingFlags.values());
    }

}
