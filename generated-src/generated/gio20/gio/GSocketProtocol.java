
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GSocketProtocol
    implements IntValuedEnum<GSocketProtocol>
{

    _SOCKET_PROTOCOL_UNKNOWN(-1L),
    _SOCKET_PROTOCOL_DEFAULT(0L),
    _SOCKET_PROTOCOL_TCP(6L),
    _SOCKET_PROTOCOL_UDP(17L),
    _SOCKET_PROTOCOL_SCTP(132L);
    public final long value;

    GSocketProtocol(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GSocketProtocol> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GSocketProtocol> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
