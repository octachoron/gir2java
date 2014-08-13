
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GBusType
    implements IntValuedEnum<GBusType>
{

    _BUS_TYPE_STARTER(-1L),
    _BUS_TYPE_NONE(0L),
    _BUS_TYPE_SYSTEM(1L),
    _BUS_TYPE_SESSION(2L);
    public final long value;

    GBusType(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GBusType> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GBusType> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
