
package generated.glib20.glib;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GSeekType
    implements IntValuedEnum<GSeekType>
{

    _SEEK_TYPE_CUR(0L),
    _SEEK_TYPE_SET(1L),
    _SEEK_TYPE_END(2L);
    public final long value;

    GSeekType(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GSeekType> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GSeekType> fromValue(int value) {
        return FlagSet.fromValue(value, GSeekType.values());
    }

}
