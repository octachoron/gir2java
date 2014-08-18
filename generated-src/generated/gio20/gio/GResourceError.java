
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GResourceError
    implements IntValuedEnum<GResourceError>
{

    _RESOURCE_ERROR_NOT_FOUND(0L),
    _RESOURCE_ERROR_INTERNAL(1L);
    public final long value;

    GResourceError(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GResourceError> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GResourceError> fromValue(int value) {
        return FlagSet.fromValue(value, GResourceError.values());
    }

    public static native long g_resource_error_quark();

}
