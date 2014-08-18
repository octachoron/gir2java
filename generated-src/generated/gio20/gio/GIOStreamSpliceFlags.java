
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GIOStreamSpliceFlags
    implements IntValuedEnum<GIOStreamSpliceFlags>
{

    IO_STREAM_SPLICE_FLAGS_NONE(0L),
    IO_STREAM_SPLICE_FLAGS_CLOSE_STREAM1(1L),
    IO_STREAM_SPLICE_FLAGS_CLOSE_STREAM2(2L),
    IO_STREAM_SPLICE_FLAGS_WAIT_FOR_BOTH(4L);
    public final long value;

    GIOStreamSpliceFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GIOStreamSpliceFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GIOStreamSpliceFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GIOStreamSpliceFlags.values());
    }

}
