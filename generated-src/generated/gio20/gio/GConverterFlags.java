
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GConverterFlags
    implements IntValuedEnum<GConverterFlags>
{

    _CONVERTER_FLAGS_NONE(0L),
    _CONVERTER_FLAGS_INPUT_AT_END(1L),
    _CONVERTER_FLAGS_FLUSH(2L);
    public final long value;

    GConverterFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GConverterFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GConverterFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GConverterFlags.values());
    }

}
