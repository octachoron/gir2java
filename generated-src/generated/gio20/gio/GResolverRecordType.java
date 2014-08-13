
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GResolverRecordType
    implements IntValuedEnum<GResolverRecordType>
{

    _RESOLVER_RECORD_TYPE_SRV(1L),
    _RESOLVER_RECORD_TYPE_MX(2L),
    _RESOLVER_RECORD_TYPE_TXT(3L),
    _RESOLVER_RECORD_TYPE_SOA(4L),
    _RESOLVER_RECORD_TYPE_NS(5L);
    public final long value;

    GResolverRecordType(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GResolverRecordType> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GResolverRecordType> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
