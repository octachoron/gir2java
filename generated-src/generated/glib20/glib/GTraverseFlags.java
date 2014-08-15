
package generated.glib20.glib;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GTraverseFlags
    implements IntValuedEnum<GTraverseFlags>
{

    _TRAVERSE_FLAGS_LEAVES(1L),
    _TRAVERSE_FLAGS_NON_LEAVES(2L),
    _TRAVERSE_FLAGS_ALL(3L),
    _TRAVERSE_FLAGS_MASK(3L),
    _TRAVERSE_FLAGS_LEAFS(1L),
    _TRAVERSE_FLAGS_NON_LEAFS(2L);
    public final long value;

    GTraverseFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GTraverseFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GTraverseFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GTraverseFlags.values());
    }

}
