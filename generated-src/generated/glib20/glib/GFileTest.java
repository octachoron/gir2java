
package generated.glib20.glib;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GFileTest
    implements IntValuedEnum<GFileTest>
{

    _FILE_TEST_IS_REGULAR(1L),
    _FILE_TEST_IS_SYMLINK(2L),
    _FILE_TEST_IS_DIR(4L),
    _FILE_TEST_IS_EXECUTABLE(8L),
    _FILE_TEST_EXISTS(16L);
    public final long value;

    GFileTest(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GFileTest> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GFileTest> fromValue(int value) {
        return FlagSet.fromValue(value, GFileTest.values());
    }

}
