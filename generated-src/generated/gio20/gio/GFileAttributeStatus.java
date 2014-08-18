
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GFileAttributeStatus
    implements IntValuedEnum<GFileAttributeStatus>
{

    _FILE_ATTRIBUTE_STATUS_UNSET(0L),
    _FILE_ATTRIBUTE_STATUS_SET(1L),
    _FILE_ATTRIBUTE_STATUS_ERROR_SETTING(2L);
    public final long value;

    GFileAttributeStatus(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GFileAttributeStatus> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GFileAttributeStatus> fromValue(int value) {
        return FlagSet.fromValue(value, GFileAttributeStatus.values());
    }

}
