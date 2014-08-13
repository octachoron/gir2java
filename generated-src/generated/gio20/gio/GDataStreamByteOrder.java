
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GDataStreamByteOrder
    implements IntValuedEnum<GDataStreamByteOrder>
{

    _DATA_STREAM_BYTE_ORDER_BIG_ENDIAN(0L),
    _DATA_STREAM_BYTE_ORDER_LITTLE_ENDIAN(1L),
    _DATA_STREAM_BYTE_ORDER_HOST_ENDIAN(2L);
    public final long value;

    GDataStreamByteOrder(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GDataStreamByteOrder> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GDataStreamByteOrder> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
