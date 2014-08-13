
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GFileAttributeType
    implements IntValuedEnum<GFileAttributeType>
{

    _FILE_ATTRIBUTE_TYPE_INVALID(0L),
    _FILE_ATTRIBUTE_TYPE_STRING(1L),
    _FILE_ATTRIBUTE_TYPE_BYTE_STRING(2L),
    _FILE_ATTRIBUTE_TYPE_BOOLEAN(3L),
    _FILE_ATTRIBUTE_TYPE_UINT32(4L),
    _FILE_ATTRIBUTE_TYPE_INT32(5L),
    _FILE_ATTRIBUTE_TYPE_UINT64(6L),
    _FILE_ATTRIBUTE_TYPE_INT64(7L),
    _FILE_ATTRIBUTE_TYPE_OBJECT(8L),
    _FILE_ATTRIBUTE_TYPE_STRINGV(9L);
    public final long value;

    GFileAttributeType(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GFileAttributeType> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GFileAttributeType> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
