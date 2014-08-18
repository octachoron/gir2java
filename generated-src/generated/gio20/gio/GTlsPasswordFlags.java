
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GTlsPasswordFlags
    implements IntValuedEnum<GTlsPasswordFlags>
{

    _TLS_PASSWORD_FLAGS_NONE(0L),
    _TLS_PASSWORD_FLAGS_RETRY(2L),
    _TLS_PASSWORD_FLAGS_MANY_TRIES(4L),
    _TLS_PASSWORD_FLAGS_FINAL_TRY(8L);
    public final long value;

    GTlsPasswordFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GTlsPasswordFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GTlsPasswordFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GTlsPasswordFlags.values());
    }

}
