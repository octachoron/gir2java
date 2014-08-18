
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GDBusInterfaceSkeletonFlags
    implements IntValuedEnum<GDBusInterfaceSkeletonFlags>
{

    D_BUS_INTERFACE_SKELETON_FLAGS_NONE(0L),
    D_BUS_INTERFACE_SKELETON_FLAGS_HANDLE_METHOD_INVOCATIONS_IN_THREAD(1L);
    public final long value;

    GDBusInterfaceSkeletonFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GDBusInterfaceSkeletonFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GDBusInterfaceSkeletonFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GDBusInterfaceSkeletonFlags.values());
    }

}
