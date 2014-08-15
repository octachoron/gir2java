
package generated.gobject20.gobject;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GParamFlags
    implements IntValuedEnum<GParamFlags>
{

    _PARAM_FLAGS_READABLE(1L),
    _PARAM_FLAGS_WRITABLE(2L),
    _PARAM_FLAGS_CONSTRUCT(4L),
    _PARAM_FLAGS_CONSTRUCT_ONLY(8L),
    _PARAM_FLAGS_LAX_VALIDATION(16L),
    _PARAM_FLAGS_STATIC_NAME(32L),
    _PARAM_FLAGS_PRIVATE(32L),
    _PARAM_FLAGS_STATIC_NICK(64L),
    _PARAM_FLAGS_STATIC_BLURB(128L),
    _PARAM_FLAGS_DEPRECATED(2147483648L);
    public final long value;

    GParamFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GParamFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GParamFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GParamFlags.values());
    }

}
