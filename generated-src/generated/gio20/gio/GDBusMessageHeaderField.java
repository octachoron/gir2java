
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GDBusMessageHeaderField
    implements IntValuedEnum<GDBusMessageHeaderField>
{

    D_BUS_MESSAGE_HEADER_FIELD_INVALID(0L),
    D_BUS_MESSAGE_HEADER_FIELD_PATH(1L),
    D_BUS_MESSAGE_HEADER_FIELD_INTERFACE(2L),
    D_BUS_MESSAGE_HEADER_FIELD_MEMBER(3L),
    D_BUS_MESSAGE_HEADER_FIELD_ERROR_NAME(4L),
    D_BUS_MESSAGE_HEADER_FIELD_REPLY_SERIAL(5L),
    D_BUS_MESSAGE_HEADER_FIELD_DESTINATION(6L),
    D_BUS_MESSAGE_HEADER_FIELD_SENDER(7L),
    D_BUS_MESSAGE_HEADER_FIELD_SIGNATURE(8L),
    D_BUS_MESSAGE_HEADER_FIELD_NUM_UNIX_FDS(9L);
    public final long value;

    GDBusMessageHeaderField(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GDBusMessageHeaderField> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GDBusMessageHeaderField> fromValue(int value) {
        return FlagSet.fromValue(value, GDBusMessageHeaderField.values());
    }

}
