
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GSocketClientEvent
    implements IntValuedEnum<GSocketClientEvent>
{

    _SOCKET_CLIENT_EVENT_RESOLVING(0L),
    _SOCKET_CLIENT_EVENT_RESOLVED(1L),
    _SOCKET_CLIENT_EVENT_CONNECTING(2L),
    _SOCKET_CLIENT_EVENT_CONNECTED(3L),
    _SOCKET_CLIENT_EVENT_PROXY_NEGOTIATING(4L),
    _SOCKET_CLIENT_EVENT_PROXY_NEGOTIATED(5L),
    _SOCKET_CLIENT_EVENT_TLS_HANDSHAKING(6L),
    _SOCKET_CLIENT_EVENT_TLS_HANDSHAKED(7L),
    _SOCKET_CLIENT_EVENT_COMPLETE(8L);
    public final long value;

    GSocketClientEvent(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GSocketClientEvent> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GSocketClientEvent> fromValue(int value) {
        return FlagSet.fromValue(value, GSocketClientEvent.values());
    }

}
