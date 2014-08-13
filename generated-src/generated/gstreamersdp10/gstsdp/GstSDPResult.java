
package generated.gstreamersdp10.gstsdp;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstSDPResult
    implements IntValuedEnum<GstSDPResult>
{

    GSTSDP_RESULT_OK(0L),
    GSTSDP_RESULT_EINVAL(-1L);
    public final long value;

    GstSDPResult(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstSDPResult> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstSDPResult> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
