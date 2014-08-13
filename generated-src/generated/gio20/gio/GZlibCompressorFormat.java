
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GZlibCompressorFormat
    implements IntValuedEnum<GZlibCompressorFormat>
{

    _ZLIB_COMPRESSOR_FORMAT_ZLIB(0L),
    _ZLIB_COMPRESSOR_FORMAT_GZIP(1L),
    _ZLIB_COMPRESSOR_FORMAT_RAW(2L);
    public final long value;

    GZlibCompressorFormat(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GZlibCompressorFormat> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GZlibCompressorFormat> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
