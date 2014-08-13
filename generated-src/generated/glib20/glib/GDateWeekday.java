
package generated.glib20.glib;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GDateWeekday
    implements IntValuedEnum<GDateWeekday>
{

    _DATE_WEEKDAY_BAD_WEEKDAY(0L),
    _DATE_WEEKDAY_MONDAY(1L),
    _DATE_WEEKDAY_TUESDAY(2L),
    _DATE_WEEKDAY_WEDNESDAY(3L),
    _DATE_WEEKDAY_THURSDAY(4L),
    _DATE_WEEKDAY_FRIDAY(5L),
    _DATE_WEEKDAY_SATURDAY(6L),
    _DATE_WEEKDAY_SUNDAY(7L);
    public final long value;

    GDateWeekday(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GDateWeekday> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GDateWeekday> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
