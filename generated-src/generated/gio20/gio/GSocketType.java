
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GSocketType
    implements IntValuedEnum<GSocketType>
{

    _SOCKET_TYPE_INVALID(0L),
    _SOCKET_TYPE_STREAM(1L),
    _SOCKET_TYPE_DATAGRAM(2L),
    _SOCKET_TYPE_SEQPACKET(3L);
    public final long value;

    GSocketType(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GSocketType> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GSocketType> fromValue(int value) {
        return FlagSet.fromValue(value, GSocketType.values());
    }

}
