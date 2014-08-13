
package generated.glib20.glib;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GIOChannelError
    implements IntValuedEnum<GIOChannelError>
{

    IO_CHANNEL_ERROR_FBIG(0L),
    IO_CHANNEL_ERROR_INVAL(1L),
    IO_CHANNEL_ERROR_IO(2L),
    IO_CHANNEL_ERROR_ISDIR(3L),
    IO_CHANNEL_ERROR_NOSPC(4L),
    IO_CHANNEL_ERROR_NXIO(5L),
    IO_CHANNEL_ERROR_OVERFLOW(6L),
    IO_CHANNEL_ERROR_PIPE(7L),
    IO_CHANNEL_ERROR_FAILED(8L);
    public final long value;

    GIOChannelError(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GIOChannelError> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GIOChannelError> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
