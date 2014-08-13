
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GIOModuleScopeFlags
    implements IntValuedEnum<GIOModuleScopeFlags>
{

    IO_MODULE_SCOPE_FLAGS_NONE(0L),
    IO_MODULE_SCOPE_FLAGS_BLOCK_DUPLICATES(1L);
    public final long value;

    GIOModuleScopeFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GIOModuleScopeFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GIOModuleScopeFlags> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
