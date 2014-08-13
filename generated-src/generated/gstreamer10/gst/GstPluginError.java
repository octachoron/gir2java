
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstPluginError
    implements IntValuedEnum<GstPluginError>
{

    GST_PLUGIN_ERROR_MODULE(0L),
    GST_PLUGIN_ERROR_DEPENDENCIES(1L),
    GST_PLUGIN_ERROR_NAME_MISMATCH(2L);
    public final long value;

    GstPluginError(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstPluginError> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstPluginError> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

    public native Object gst_plugin_error_quark();

}
