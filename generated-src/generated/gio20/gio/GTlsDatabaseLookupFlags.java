
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GTlsDatabaseLookupFlags
    implements IntValuedEnum<GTlsDatabaseLookupFlags>
{

    _TLS_DATABASE_LOOKUP_FLAGS_NONE(0L),
    _TLS_DATABASE_LOOKUP_FLAGS_KEYPAIR(1L);
    public final long value;

    GTlsDatabaseLookupFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GTlsDatabaseLookupFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GTlsDatabaseLookupFlags> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
