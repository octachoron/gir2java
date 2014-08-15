
package generated.gobject20.gobject;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GTypeFundamentalFlags
    implements IntValuedEnum<GTypeFundamentalFlags>
{

    _TYPE_FUNDAMENTAL_FLAGS_CLASSED(1L),
    _TYPE_FUNDAMENTAL_FLAGS_INSTANTIATABLE(2L),
    _TYPE_FUNDAMENTAL_FLAGS_DERIVABLE(4L),
    _TYPE_FUNDAMENTAL_FLAGS_DEEP_DERIVABLE(8L);
    public final long value;

    GTypeFundamentalFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GTypeFundamentalFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GTypeFundamentalFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GTypeFundamentalFlags.values());
    }

}
