
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GCredentialsType
    implements IntValuedEnum<GCredentialsType>
{

    _CREDENTIALS_TYPE_INVALID(0L),
    _CREDENTIALS_TYPE_LINUX_UCRED(1L),
    _CREDENTIALS_TYPE_FREEBSD_CMSGCRED(2L),
    _CREDENTIALS_TYPE_OPENBSD_SOCKPEERCRED(3L),
    _CREDENTIALS_TYPE_SOLARIS_UCRED(4L);
    public final long value;

    GCredentialsType(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GCredentialsType> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GCredentialsType> fromValue(int value) {
        return FlagSet.fromValue(value, GCredentialsType.values());
    }

}
