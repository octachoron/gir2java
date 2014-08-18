
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GDataStreamNewlineType
    implements IntValuedEnum<GDataStreamNewlineType>
{

    _DATA_STREAM_NEWLINE_TYPE_LF(0L),
    _DATA_STREAM_NEWLINE_TYPE_CR(1L),
    _DATA_STREAM_NEWLINE_TYPE_CR_LF(2L),
    _DATA_STREAM_NEWLINE_TYPE_ANY(3L);
    public final long value;

    GDataStreamNewlineType(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GDataStreamNewlineType> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GDataStreamNewlineType> fromValue(int value) {
        return FlagSet.fromValue(value, GDataStreamNewlineType.values());
    }

}
