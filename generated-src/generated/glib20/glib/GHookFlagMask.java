
package generated.glib20.glib;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GHookFlagMask
    implements IntValuedEnum<GHookFlagMask>
{

    _HOOK_FLAG_MASK_ACTIVE(1L),
    _HOOK_FLAG_MASK_IN_CALL(2L),
    _HOOK_FLAG_MASK_MASK(15L);
    public final long value;

    GHookFlagMask(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GHookFlagMask> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GHookFlagMask> fromValue(int value) {
        return FlagSet.fromValue(value, GHookFlagMask.values());
    }

}
