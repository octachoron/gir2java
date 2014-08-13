
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstTagScope
    implements IntValuedEnum<GstTagScope>
{

    GST_TAG_SCOPE_STREAM(0L),
    GST_TAG_SCOPE_GLOBAL(1L);
    public final long value;

    GstTagScope(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstTagScope> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstTagScope> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
