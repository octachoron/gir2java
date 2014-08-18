
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GSettingsBindFlags
    implements IntValuedEnum<GSettingsBindFlags>
{

    _SETTINGS_BIND_FLAGS_DEFAULT(0L),
    _SETTINGS_BIND_FLAGS_GET(1L),
    _SETTINGS_BIND_FLAGS_SET(2L),
    _SETTINGS_BIND_FLAGS_NO_SENSITIVITY(4L),
    _SETTINGS_BIND_FLAGS_GET_NO_CHANGES(8L),
    _SETTINGS_BIND_FLAGS_INVERT_BOOLEAN(16L);
    public final long value;

    GSettingsBindFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GSettingsBindFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GSettingsBindFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GSettingsBindFlags.values());
    }

}
