
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GDBusSendMessageFlags
    implements IntValuedEnum<GDBusSendMessageFlags>
{

    D_BUS_SEND_MESSAGE_FLAGS_NONE(0L),
    D_BUS_SEND_MESSAGE_FLAGS_PRESERVE_SERIAL(1L);
    public final long value;

    GDBusSendMessageFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GDBusSendMessageFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GDBusSendMessageFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GDBusSendMessageFlags.values());
    }

}
