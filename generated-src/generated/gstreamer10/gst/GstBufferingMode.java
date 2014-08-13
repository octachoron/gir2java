
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstBufferingMode
    implements IntValuedEnum<GstBufferingMode>
{

    GST_BUFFERING_MODE_STREAM(0L),
    GST_BUFFERING_MODE_DOWNLOAD(1L),
    GST_BUFFERING_MODE_TIMESHIFT(2L),
    GST_BUFFERING_MODE_LIVE(3L);
    public final long value;

    GstBufferingMode(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstBufferingMode> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstBufferingMode> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
