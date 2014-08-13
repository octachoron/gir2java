
package generated.glib20.glib;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GNormalizeMode
    implements IntValuedEnum<GNormalizeMode>
{

    _NORMALIZE_MODE_DEFAULT(0L),
    _NORMALIZE_MODE_NFD(0L),
    _NORMALIZE_MODE_DEFAULT_COMPOSE(1L),
    _NORMALIZE_MODE_NFC(1L),
    _NORMALIZE_MODE_ALL(2L),
    _NORMALIZE_MODE_NFKD(2L),
    _NORMALIZE_MODE_ALL_COMPOSE(3L),
    _NORMALIZE_MODE_NFKC(3L);
    public final long value;

    GNormalizeMode(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GNormalizeMode> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GNormalizeMode> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
