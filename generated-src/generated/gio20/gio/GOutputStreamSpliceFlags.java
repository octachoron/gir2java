
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GOutputStreamSpliceFlags
    implements IntValuedEnum<GOutputStreamSpliceFlags>
{

    _OUTPUT_STREAM_SPLICE_FLAGS_NONE(0L),
    _OUTPUT_STREAM_SPLICE_FLAGS_CLOSE_SOURCE(1L),
    _OUTPUT_STREAM_SPLICE_FLAGS_CLOSE_TARGET(2L);
    public final long value;

    GOutputStreamSpliceFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GOutputStreamSpliceFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GOutputStreamSpliceFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GOutputStreamSpliceFlags.values());
    }

}
