
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GDBusMessageByteOrder
    implements IntValuedEnum<GDBusMessageByteOrder>
{

    D_BUS_MESSAGE_BYTE_ORDER_BIG_ENDIAN(66L),
    D_BUS_MESSAGE_BYTE_ORDER_LITTLE_ENDIAN(108L);
    public final long value;

    GDBusMessageByteOrder(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GDBusMessageByteOrder> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GDBusMessageByteOrder> fromValue(int value) {
        return FlagSet.fromValue(value, GDBusMessageByteOrder.values());
    }

}
