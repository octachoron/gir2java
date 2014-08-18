
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GUnixSocketAddressType
    implements IntValuedEnum<GUnixSocketAddressType>
{

    _UNIX_SOCKET_ADDRESS_TYPE_INVALID(0L),
    _UNIX_SOCKET_ADDRESS_TYPE_ANONYMOUS(1L),
    _UNIX_SOCKET_ADDRESS_TYPE_PATH(2L),
    _UNIX_SOCKET_ADDRESS_TYPE_ABSTRACT(3L),
    _UNIX_SOCKET_ADDRESS_TYPE_ABSTRACT_PADDED(4L);
    public final long value;

    GUnixSocketAddressType(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GUnixSocketAddressType> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GUnixSocketAddressType> fromValue(int value) {
        return FlagSet.fromValue(value, GUnixSocketAddressType.values());
    }

}
