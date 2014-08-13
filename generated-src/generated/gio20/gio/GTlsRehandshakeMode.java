
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GTlsRehandshakeMode
    implements IntValuedEnum<GTlsRehandshakeMode>
{

    _TLS_REHANDSHAKE_MODE_NEVER(0L),
    _TLS_REHANDSHAKE_MODE_SAFELY(1L),
    _TLS_REHANDSHAKE_MODE_UNSAFELY(2L);
    public final long value;

    GTlsRehandshakeMode(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GTlsRehandshakeMode> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GTlsRehandshakeMode> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
