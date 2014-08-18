
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstPipelineFlags
    implements IntValuedEnum<GstPipelineFlags>
{

    GST_PIPELINE_FLAGS_FIXED_CLOCK(524288L),
    GST_PIPELINE_FLAGS_LAST(8388608L);
    public final long value;

    GstPipelineFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstPipelineFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstPipelineFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GstPipelineFlags.values());
    }

}
