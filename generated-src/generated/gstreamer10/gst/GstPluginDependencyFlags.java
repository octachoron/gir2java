
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstPluginDependencyFlags
    implements IntValuedEnum<GstPluginDependencyFlags>
{

    GST_PLUGIN_DEPENDENCY_FLAGS_NONE(0L),
    GST_PLUGIN_DEPENDENCY_FLAGS_RECURSE(1L),
    GST_PLUGIN_DEPENDENCY_FLAGS_PATHS_ARE_DEFAULT_ONLY(2L),
    GST_PLUGIN_DEPENDENCY_FLAGS_FILE_NAME_IS_SUFFIX(4L);
    public final long value;

    GstPluginDependencyFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstPluginDependencyFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstPluginDependencyFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GstPluginDependencyFlags.values());
    }

}
