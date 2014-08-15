
package generated.glib20.glib;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GIOFlags
    implements IntValuedEnum<GIOFlags>
{

    IO_FLAGS_APPEND(1L),
    IO_FLAGS_NONBLOCK(2L),
    IO_FLAGS_IS_READABLE(4L),
    IO_FLAGS_IS_WRITABLE(8L),
    IO_FLAGS_IS_WRITEABLE(8L),
    IO_FLAGS_IS_SEEKABLE(16L),
    IO_FLAGS_MASK(31L),
    IO_FLAGS_GET_MASK(31L),
    IO_FLAGS_SET_MASK(3L);
    public final long value;

    GIOFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GIOFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GIOFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GIOFlags.values());
    }

}
