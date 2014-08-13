
package generated.gstreamervideo10.gstvideo;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstColorBalanceType
    implements IntValuedEnum<GstColorBalanceType>
{

    GST_COLOR_BALANCE_TYPE_HARDWARE(0L),
    GST_COLOR_BALANCE_TYPE_SOFTWARE(1L);
    public final long value;

    GstColorBalanceType(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstColorBalanceType> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstColorBalanceType> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
