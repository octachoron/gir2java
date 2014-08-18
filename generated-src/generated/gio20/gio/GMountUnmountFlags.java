
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GMountUnmountFlags
    implements IntValuedEnum<GMountUnmountFlags>
{

    _MOUNT_UNMOUNT_FLAGS_NONE(0L),
    _MOUNT_UNMOUNT_FLAGS_FORCE(1L);
    public final long value;

    GMountUnmountFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GMountUnmountFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GMountUnmountFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GMountUnmountFlags.values());
    }

}
