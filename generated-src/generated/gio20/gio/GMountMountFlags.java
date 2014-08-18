
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GMountMountFlags
    implements IntValuedEnum<GMountMountFlags>
{

    _MOUNT_MOUNT_FLAGS_NONE(0L);
    public final long value;

    GMountMountFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GMountMountFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GMountMountFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GMountMountFlags.values());
    }

}
