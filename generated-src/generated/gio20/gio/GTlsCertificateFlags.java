
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GTlsCertificateFlags
    implements IntValuedEnum<GTlsCertificateFlags>
{

    _TLS_CERTIFICATE_FLAGS_UNKNOWN_CA(1L),
    _TLS_CERTIFICATE_FLAGS_BAD_IDENTITY(2L),
    _TLS_CERTIFICATE_FLAGS_NOT_ACTIVATED(4L),
    _TLS_CERTIFICATE_FLAGS_EXPIRED(8L),
    _TLS_CERTIFICATE_FLAGS_REVOKED(16L),
    _TLS_CERTIFICATE_FLAGS_INSECURE(32L),
    _TLS_CERTIFICATE_FLAGS_GENERIC_ERROR(64L),
    _TLS_CERTIFICATE_FLAGS_VALIDATE_ALL(127L);
    public final long value;

    GTlsCertificateFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GTlsCertificateFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GTlsCertificateFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GTlsCertificateFlags.values());
    }

}
