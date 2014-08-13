
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GEmblemOrigin
    implements IntValuedEnum<GEmblemOrigin>
{

    _EMBLEM_ORIGIN_UNKNOWN(0L),
    _EMBLEM_ORIGIN_DEVICE(1L),
    _EMBLEM_ORIGIN_LIVEMETADATA(2L),
    _EMBLEM_ORIGIN_TAG(3L);
    public final long value;

    GEmblemOrigin(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GEmblemOrigin> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GEmblemOrigin> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
