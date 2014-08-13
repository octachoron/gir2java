
package generated.gstreamercontroller10.gstcontroller;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstInterpolationMode
    implements IntValuedEnum<GstInterpolationMode>
{

    GST_INTERPOLATION_MODE_NONE(0L),
    GST_INTERPOLATION_MODE_LINEAR(1L),
    GST_INTERPOLATION_MODE_CUBIC(2L);
    public final long value;

    GstInterpolationMode(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstInterpolationMode> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstInterpolationMode> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
