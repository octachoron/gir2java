
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GDBusMessageType
    implements IntValuedEnum<GDBusMessageType>
{

    D_BUS_MESSAGE_TYPE_INVALID(0L),
    D_BUS_MESSAGE_TYPE_METHOD_CALL(1L),
    D_BUS_MESSAGE_TYPE_METHOD_RETURN(2L),
    D_BUS_MESSAGE_TYPE_ERROR(3L),
    D_BUS_MESSAGE_TYPE_SIGNAL(4L);
    public final long value;

    GDBusMessageType(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GDBusMessageType> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GDBusMessageType> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
