
package generated.glib20.glib;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GChecksumType
    implements IntValuedEnum<GChecksumType>
{

    _CHECKSUM_TYPE_MD5(0L),
    _CHECKSUM_TYPE_SHA1(1L),
    _CHECKSUM_TYPE_SHA256(2L),
    _CHECKSUM_TYPE_SHA512(3L);
    public final long value;

    GChecksumType(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GChecksumType> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GChecksumType> fromValue(int value) {
        return FlagSet.fromValue(value, GChecksumType.values());
    }

}
