
package generated.glib20.glib;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GDateDMY
    implements IntValuedEnum<GDateDMY>
{

    _DATEDMY_DAY(0L),
    _DATEDMY_MONTH(1L),
    _DATEDMY_YEAR(2L);
    public final long value;

    GDateDMY(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GDateDMY> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GDateDMY> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
