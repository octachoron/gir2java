
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GFileMeasureFlags
    implements IntValuedEnum<GFileMeasureFlags>
{

    _FILE_MEASURE_FLAGS_NONE(0L),
    _FILE_MEASURE_FLAGS_REPORT_ANY_ERROR(2L),
    _FILE_MEASURE_FLAGS_APPARENT_SIZE(4L),
    _FILE_MEASURE_FLAGS_NO_XDEV(8L);
    public final long value;

    GFileMeasureFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GFileMeasureFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GFileMeasureFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GFileMeasureFlags.values());
    }

}
