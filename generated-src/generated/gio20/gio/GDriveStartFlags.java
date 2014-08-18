
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GDriveStartFlags
    implements IntValuedEnum<GDriveStartFlags>
{

    _DRIVE_START_FLAGS_NONE(0L);
    public final long value;

    GDriveStartFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GDriveStartFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GDriveStartFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GDriveStartFlags.values());
    }

}
