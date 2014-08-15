
package generated.gobject20.gobject;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GSignalMatchType
    implements IntValuedEnum<GSignalMatchType>
{

    _SIGNAL_MATCH_TYPE_ID(1L),
    _SIGNAL_MATCH_TYPE_DETAIL(2L),
    _SIGNAL_MATCH_TYPE_CLOSURE(4L),
    _SIGNAL_MATCH_TYPE_FUNC(8L),
    _SIGNAL_MATCH_TYPE_DATA(16L),
    _SIGNAL_MATCH_TYPE_UNBLOCKED(32L);
    public final long value;

    GSignalMatchType(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GSignalMatchType> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GSignalMatchType> fromValue(int value) {
        return FlagSet.fromValue(value, GSignalMatchType.values());
    }

}
