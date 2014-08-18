
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GAskPasswordFlags
    implements IntValuedEnum<GAskPasswordFlags>
{

    _ASK_PASSWORD_FLAGS_NEED_PASSWORD(1L),
    _ASK_PASSWORD_FLAGS_NEED_USERNAME(2L),
    _ASK_PASSWORD_FLAGS_NEED_DOMAIN(4L),
    _ASK_PASSWORD_FLAGS_SAVING_SUPPORTED(8L),
    _ASK_PASSWORD_FLAGS_ANONYMOUS_SUPPORTED(16L);
    public final long value;

    GAskPasswordFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GAskPasswordFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GAskPasswordFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GAskPasswordFlags.values());
    }

}
