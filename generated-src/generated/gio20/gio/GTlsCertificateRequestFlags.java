
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GTlsCertificateRequestFlags
    implements IntValuedEnum<GTlsCertificateRequestFlags>
{

    _TLS_CERTIFICATE_REQUEST_FLAGS_NONE(0L);
    public final long value;

    GTlsCertificateRequestFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GTlsCertificateRequestFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GTlsCertificateRequestFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GTlsCertificateRequestFlags.values());
    }

}
