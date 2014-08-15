
package generated.glib20.glib;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GAsciiType
    implements IntValuedEnum<GAsciiType>
{

    _ASCII_TYPE_ALNUM(1L),
    _ASCII_TYPE_ALPHA(2L),
    _ASCII_TYPE_CNTRL(4L),
    _ASCII_TYPE_DIGIT(8L),
    _ASCII_TYPE_GRAPH(16L),
    _ASCII_TYPE_LOWER(32L),
    _ASCII_TYPE_PRINT(64L),
    _ASCII_TYPE_PUNCT(128L),
    _ASCII_TYPE_SPACE(256L),
    _ASCII_TYPE_UPPER(512L),
    _ASCII_TYPE_XDIGIT(1024L);
    public final long value;

    GAsciiType(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GAsciiType> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GAsciiType> fromValue(int value) {
        return FlagSet.fromValue(value, GAsciiType.values());
    }

}
