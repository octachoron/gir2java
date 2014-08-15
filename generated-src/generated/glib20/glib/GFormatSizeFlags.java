
package generated.glib20.glib;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GFormatSizeFlags
    implements IntValuedEnum<GFormatSizeFlags>
{

    _FORMAT_SIZE_FLAGS_DEFAULT(0L),
    _FORMAT_SIZE_FLAGS_LONG_FORMAT(1L),
    _FORMAT_SIZE_FLAGS_IEC_UNITS(2L);
    public final long value;

    GFormatSizeFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GFormatSizeFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GFormatSizeFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GFormatSizeFlags.values());
    }

}
