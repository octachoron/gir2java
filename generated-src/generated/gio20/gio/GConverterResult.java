
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GConverterResult
    implements IntValuedEnum<GConverterResult>
{

    _CONVERTER_RESULT_ERROR(0L),
    _CONVERTER_RESULT_CONVERTED(1L),
    _CONVERTER_RESULT_FINISHED(2L),
    _CONVERTER_RESULT_FLUSHED(3L);
    public final long value;

    GConverterResult(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GConverterResult> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GConverterResult> fromValue(int value) {
        return FlagSet.fromValue(value, GConverterResult.values());
    }

}
