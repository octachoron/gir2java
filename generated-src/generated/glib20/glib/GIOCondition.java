
package generated.glib20.glib;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GIOCondition
    implements IntValuedEnum<GIOCondition>
{

    IO_CONDITION_IN(1L),
    IO_CONDITION_OUT(4L),
    IO_CONDITION_PRI(2L),
    IO_CONDITION_ERR(8L),
    IO_CONDITION_HUP(16L),
    IO_CONDITION_NVAL(32L);
    public final long value;

    GIOCondition(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GIOCondition> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GIOCondition> fromValue(int value) {
        return FlagSet.fromValue(value, GIOCondition.values());
    }

}
