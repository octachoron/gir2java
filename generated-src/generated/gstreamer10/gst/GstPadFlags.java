
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstPadFlags
    implements IntValuedEnum<GstPadFlags>
{

    GST_PAD_FLAGS_BLOCKED(16L),
    GST_PAD_FLAGS_FLUSHING(32L),
    GST_PAD_FLAGS_EOS(64L),
    GST_PAD_FLAGS_BLOCKING(128L),
    GST_PAD_FLAGS_NEED_PARENT(256L),
    GST_PAD_FLAGS_NEED_RECONFIGURE(512L),
    GST_PAD_FLAGS_PENDING_EVENTS(1024L),
    GST_PAD_FLAGS_FIXED_CAPS(2048L),
    GST_PAD_FLAGS_PROXY_CAPS(4096L),
    GST_PAD_FLAGS_PROXY_ALLOCATION(8192L),
    GST_PAD_FLAGS_PROXY_SCHEDULING(16384L),
    GST_PAD_FLAGS_LAST(1048576L);
    public final long value;

    GstPadFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstPadFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstPadFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GstPadFlags.values());
    }

}
