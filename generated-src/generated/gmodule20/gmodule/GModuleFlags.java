
package generated.gmodule20.gmodule;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GModuleFlags
    implements IntValuedEnum<GModuleFlags>
{

    _MODULE_FLAGS_LAZY(1L),
    _MODULE_FLAGS_LOCAL(2L),
    _MODULE_FLAGS_MASK(3L);
    public final long value;

    GModuleFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GModuleFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GModuleFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GModuleFlags.values());
    }

}
