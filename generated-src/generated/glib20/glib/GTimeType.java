
package generated.glib20.glib;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GTimeType
    implements IntValuedEnum<GTimeType>
{

    _TIME_TYPE_STANDARD(0L),
    _TIME_TYPE_DAYLIGHT(1L),
    _TIME_TYPE_UNIVERSAL(2L);
    public final long value;

    GTimeType(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GTimeType> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GTimeType> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
