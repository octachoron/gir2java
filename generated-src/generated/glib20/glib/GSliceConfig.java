
package generated.glib20.glib;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GSliceConfig
    implements IntValuedEnum<GSliceConfig>
{

    _SLICE_CONFIG_ALWAYS_MALLOC(1L),
    _SLICE_CONFIG_BYPASS_MAGAZINES(2L),
    _SLICE_CONFIG_WORKING_SET_MSECS(3L),
    _SLICE_CONFIG_COLOR_INCREMENT(4L),
    _SLICE_CONFIG_CHUNK_SIZES(5L),
    _SLICE_CONFIG_CONTENTION_COUNTER(6L);
    public final long value;

    GSliceConfig(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GSliceConfig> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GSliceConfig> fromValue(int value) {
        return FlagSet.fromValue(value, GSliceConfig.values());
    }

}
