
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GAppInfoCreateFlags
    implements IntValuedEnum<GAppInfoCreateFlags>
{

    _APP_INFO_CREATE_FLAGS_NONE(0L),
    _APP_INFO_CREATE_FLAGS_NEEDS_TERMINAL(1L),
    _APP_INFO_CREATE_FLAGS_SUPPORTS_URIS(2L),
    _APP_INFO_CREATE_FLAGS_SUPPORTS_STARTUP_NOTIFICATION(4L);
    public final long value;

    GAppInfoCreateFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GAppInfoCreateFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GAppInfoCreateFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GAppInfoCreateFlags.values());
    }

}
