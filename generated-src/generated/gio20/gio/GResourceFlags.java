
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GResourceFlags
    implements IntValuedEnum<GResourceFlags>
{

    _RESOURCE_FLAGS_NONE(0L),
    _RESOURCE_FLAGS_COMPRESSED(1L);
    public final long value;

    GResourceFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GResourceFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GResourceFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GResourceFlags.values());
    }

}
