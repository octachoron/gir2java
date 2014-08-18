
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GPasswordSave
    implements IntValuedEnum<GPasswordSave>
{

    _PASSWORD_SAVE_NEVER(0L),
    _PASSWORD_SAVE_FOR_SESSION(1L),
    _PASSWORD_SAVE_PERMANENTLY(2L);
    public final long value;

    GPasswordSave(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GPasswordSave> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GPasswordSave> fromValue(int value) {
        return FlagSet.fromValue(value, GPasswordSave.values());
    }

}
