
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GFileAttributeInfoFlags
    implements IntValuedEnum<GFileAttributeInfoFlags>
{

    _FILE_ATTRIBUTE_INFO_FLAGS_NONE(0L),
    _FILE_ATTRIBUTE_INFO_FLAGS_COPY_WITH_FILE(1L),
    _FILE_ATTRIBUTE_INFO_FLAGS_COPY_WHEN_MOVED(2L);
    public final long value;

    GFileAttributeInfoFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GFileAttributeInfoFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GFileAttributeInfoFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GFileAttributeInfoFlags.values());
    }

}
