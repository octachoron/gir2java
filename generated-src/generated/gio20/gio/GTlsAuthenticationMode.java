
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GTlsAuthenticationMode
    implements IntValuedEnum<GTlsAuthenticationMode>
{

    _TLS_AUTHENTICATION_MODE_NONE(0L),
    _TLS_AUTHENTICATION_MODE_REQUESTED(1L),
    _TLS_AUTHENTICATION_MODE_REQUIRED(2L);
    public final long value;

    GTlsAuthenticationMode(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GTlsAuthenticationMode> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GTlsAuthenticationMode> fromValue(int value) {
        return FlagSet.fromValue(value, GTlsAuthenticationMode.values());
    }

}
