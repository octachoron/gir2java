
package generated.glib20.glib;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GMarkupCollectType
    implements IntValuedEnum<GMarkupCollectType>
{

    _MARKUP_COLLECT_TYPE_INVALID(0L),
    _MARKUP_COLLECT_TYPE_STRING(1L),
    _MARKUP_COLLECT_TYPE_STRDUP(2L),
    _MARKUP_COLLECT_TYPE_BOOLEAN(3L),
    _MARKUP_COLLECT_TYPE_TRISTATE(4L),
    _MARKUP_COLLECT_TYPE_OPTIONAL(65536L);
    public final long value;

    GMarkupCollectType(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GMarkupCollectType> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GMarkupCollectType> fromValue(int value) {
        return FlagSet.fromValue(value, GMarkupCollectType.values());
    }

}
