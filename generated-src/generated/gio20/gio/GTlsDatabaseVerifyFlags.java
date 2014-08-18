
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GTlsDatabaseVerifyFlags
    implements IntValuedEnum<GTlsDatabaseVerifyFlags>
{

    _TLS_DATABASE_VERIFY_FLAGS_NONE(0L);
    public final long value;

    GTlsDatabaseVerifyFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GTlsDatabaseVerifyFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GTlsDatabaseVerifyFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GTlsDatabaseVerifyFlags.values());
    }

}
