
package generated.glib20.glib;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GTestFileType
    implements IntValuedEnum<GTestFileType>
{

    _TEST_FILE_TYPE_DIST(0L),
    _TEST_FILE_TYPE_BUILT(1L);
    public final long value;

    GTestFileType(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GTestFileType> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GTestFileType> fromValue(int value) {
        return FlagSet.fromValue(value, GTestFileType.values());
    }

}
