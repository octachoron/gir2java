
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GResolverError
    implements IntValuedEnum<GResolverError>
{

    _RESOLVER_ERROR_NOT_FOUND(0L),
    _RESOLVER_ERROR_TEMPORARY_FAILURE(1L),
    _RESOLVER_ERROR_INTERNAL(2L);
    public final long value;

    GResolverError(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GResolverError> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GResolverError> fromValue(int value) {
        return FlagSet.fromValue(value, GResolverError.values());
    }

    public static native long g_resolver_error_quark();

}
