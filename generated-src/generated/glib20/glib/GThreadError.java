
package generated.glib20.glib;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GThreadError
    implements IntValuedEnum<GThreadError>
{

    _THREAD_ERROR_THREAD_ERROR_AGAIN(0L);
    public final long value;

    GThreadError(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GThreadError> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GThreadError> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
