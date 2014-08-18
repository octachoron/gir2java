
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GSocketFamily
    implements IntValuedEnum<GSocketFamily>
{

    _SOCKET_FAMILY_INVALID(0L),
    _SOCKET_FAMILY_UNIX(1L),
    _SOCKET_FAMILY_IPV4(2L),
    _SOCKET_FAMILY_IPV6(10L);
    public final long value;

    GSocketFamily(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GSocketFamily> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GSocketFamily> fromValue(int value) {
        return FlagSet.fromValue(value, GSocketFamily.values());
    }

}
