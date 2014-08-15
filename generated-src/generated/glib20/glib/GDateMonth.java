
package generated.glib20.glib;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GDateMonth
    implements IntValuedEnum<GDateMonth>
{

    _DATE_MONTH_BAD_MONTH(0L),
    _DATE_MONTH_JANUARY(1L),
    _DATE_MONTH_FEBRUARY(2L),
    _DATE_MONTH_MARCH(3L),
    _DATE_MONTH_APRIL(4L),
    _DATE_MONTH_MAY(5L),
    _DATE_MONTH_JUNE(6L),
    _DATE_MONTH_JULY(7L),
    _DATE_MONTH_AUGUST(8L),
    _DATE_MONTH_SEPTEMBER(9L),
    _DATE_MONTH_OCTOBER(10L),
    _DATE_MONTH_NOVEMBER(11L),
    _DATE_MONTH_DECEMBER(12L);
    public final long value;

    GDateMonth(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GDateMonth> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GDateMonth> fromValue(int value) {
        return FlagSet.fromValue(value, GDateMonth.values());
    }

}
