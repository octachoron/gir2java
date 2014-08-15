
package generated.glib20.glib;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GLogLevelFlags
    implements IntValuedEnum<GLogLevelFlags>
{

    _LOG_LEVEL_FLAGS_FLAG_RECURSION(1L),
    _LOG_LEVEL_FLAGS_FLAG_FATAL(2L),
    _LOG_LEVEL_FLAGS_LEVEL_ERROR(4L),
    _LOG_LEVEL_FLAGS_LEVEL_CRITICAL(8L),
    _LOG_LEVEL_FLAGS_LEVEL_WARNING(16L),
    _LOG_LEVEL_FLAGS_LEVEL_MESSAGE(32L),
    _LOG_LEVEL_FLAGS_LEVEL_INFO(64L),
    _LOG_LEVEL_FLAGS_LEVEL_DEBUG(128L),
    _LOG_LEVEL_FLAGS_LEVEL_MASK(-4L);
    public final long value;

    GLogLevelFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GLogLevelFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GLogLevelFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GLogLevelFlags.values());
    }

}
