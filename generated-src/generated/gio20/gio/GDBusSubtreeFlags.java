
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GDBusSubtreeFlags
    implements IntValuedEnum<GDBusSubtreeFlags>
{

    D_BUS_SUBTREE_FLAGS_NONE(0L),
    D_BUS_SUBTREE_FLAGS_DISPATCH_TO_UNENUMERATED_NODES(1L);
    public final long value;

    GDBusSubtreeFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GDBusSubtreeFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GDBusSubtreeFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GDBusSubtreeFlags.values());
    }

}
