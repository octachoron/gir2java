
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GDriveStartStopType
    implements IntValuedEnum<GDriveStartStopType>
{

    _DRIVE_START_STOP_TYPE_UNKNOWN(0L),
    _DRIVE_START_STOP_TYPE_SHUTDOWN(1L),
    _DRIVE_START_STOP_TYPE_NETWORK(2L),
    _DRIVE_START_STOP_TYPE_MULTIDISK(3L),
    _DRIVE_START_STOP_TYPE_PASSWORD(4L);
    public final long value;

    GDriveStartStopType(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GDriveStartStopType> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GDriveStartStopType> fromValue(int value) {
        return FlagSet.fromValue(value, GDriveStartStopType.values());
    }

}
