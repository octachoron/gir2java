
package generated.glib20.glib;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GTraverseType
    implements IntValuedEnum<GTraverseType>
{

    _TRAVERSE_TYPE_IN_ORDER(0L),
    _TRAVERSE_TYPE_PRE_ORDER(1L),
    _TRAVERSE_TYPE_POST_ORDER(2L),
    _TRAVERSE_TYPE_LEVEL_ORDER(3L);
    public final long value;

    GTraverseType(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GTraverseType> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GTraverseType> fromValue(int value) {
        return FlagSet.fromValue(value, GTraverseType.values());
    }

}
