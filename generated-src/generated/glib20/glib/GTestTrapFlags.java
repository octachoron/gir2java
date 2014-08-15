
package generated.glib20.glib;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GTestTrapFlags
    implements IntValuedEnum<GTestTrapFlags>
{

    _TEST_TRAP_FLAGS_SILENCE_STDOUT(128L),
    _TEST_TRAP_FLAGS_SILENCE_STDERR(256L),
    _TEST_TRAP_FLAGS_INHERIT_STDIN(512L);
    public final long value;

    GTestTrapFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GTestTrapFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GTestTrapFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GTestTrapFlags.values());
    }

}
