
package generated.glib20.glib;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GTestLogType
    implements IntValuedEnum<GTestLogType>
{

    _TEST_LOG_TYPE_NONE(0L),
    _TEST_LOG_TYPE_ERROR(1L),
    _TEST_LOG_TYPE_START_BINARY(2L),
    _TEST_LOG_TYPE_LIST_CASE(3L),
    _TEST_LOG_TYPE_SKIP_CASE(4L),
    _TEST_LOG_TYPE_START_CASE(5L),
    _TEST_LOG_TYPE_STOP_CASE(6L),
    _TEST_LOG_TYPE_MIN_RESULT(7L),
    _TEST_LOG_TYPE_MAX_RESULT(8L),
    _TEST_LOG_TYPE_MESSAGE(9L),
    _TEST_LOG_TYPE_START_SUITE(10L),
    _TEST_LOG_TYPE_STOP_SUITE(11L);
    public final long value;

    GTestLogType(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GTestLogType> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GTestLogType> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
