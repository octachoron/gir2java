
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstTocScope
    implements IntValuedEnum<GstTocScope>
{

    GST_TOC_SCOPE_GLOBAL(1L),
    GST_TOC_SCOPE_CURRENT(2L);
    public final long value;

    GstTocScope(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstTocScope> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstTocScope> fromValue(int value) {
        return FlagSet.fromValue(value, GstTocScope.values());
    }

}
