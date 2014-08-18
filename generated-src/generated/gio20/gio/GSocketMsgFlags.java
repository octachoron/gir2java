
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GSocketMsgFlags
    implements IntValuedEnum<GSocketMsgFlags>
{

    _SOCKET_MSG_FLAGS_NONE(0L),
    _SOCKET_MSG_FLAGS_OOB(1L),
    _SOCKET_MSG_FLAGS_PEEK(2L),
    _SOCKET_MSG_FLAGS_DONTROUTE(4L);
    public final long value;

    GSocketMsgFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GSocketMsgFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GSocketMsgFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GSocketMsgFlags.values());
    }

}
