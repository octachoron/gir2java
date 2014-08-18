
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstPluginFlags
    implements IntValuedEnum<GstPluginFlags>
{

    GST_PLUGIN_FLAGS_CACHED(16L),
    GST_PLUGIN_FLAGS_BLACKLISTED(32L);
    public final long value;

    GstPluginFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstPluginFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstPluginFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GstPluginFlags.values());
    }

}
