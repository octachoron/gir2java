
package generated.glib20.glib;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GTestSubprocessFlags
    implements IntValuedEnum<GTestSubprocessFlags>
{

    _TEST_SUBPROCESS_FLAGS_STDIN(1L),
    _TEST_SUBPROCESS_FLAGS_STDOUT(2L),
    _TEST_SUBPROCESS_FLAGS_STDERR(4L);
    public final long value;

    GTestSubprocessFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GTestSubprocessFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GTestSubprocessFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GTestSubprocessFlags.values());
    }

}
