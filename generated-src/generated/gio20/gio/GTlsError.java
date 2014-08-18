
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GTlsError
    implements IntValuedEnum<GTlsError>
{

    _TLS_ERROR_UNAVAILABLE(0L),
    _TLS_ERROR_MISC(1L),
    _TLS_ERROR_BAD_CERTIFICATE(2L),
    _TLS_ERROR_NOT_TLS(3L),
    _TLS_ERROR_HANDSHAKE(4L),
    _TLS_ERROR_CERTIFICATE_REQUIRED(5L),
    _TLS_ERROR_EOF(6L);
    public final long value;

    GTlsError(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GTlsError> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GTlsError> fromValue(int value) {
        return FlagSet.fromValue(value, GTlsError.values());
    }

    public static native long g_tls_error_quark();

}
