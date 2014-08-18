
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GResourceLookupFlags
    implements IntValuedEnum<GResourceLookupFlags>
{

    _RESOURCE_LOOKUP_FLAGS_NONE(0L);
    public final long value;

    GResourceLookupFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GResourceLookupFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GResourceLookupFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GResourceLookupFlags.values());
    }

}
