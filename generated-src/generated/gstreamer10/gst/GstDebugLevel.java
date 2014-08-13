
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Ptr;

public enum GstDebugLevel
    implements IntValuedEnum<GstDebugLevel>
{

    GST_DEBUG_LEVEL_NONE(0L),
    GST_DEBUG_LEVEL_ERROR(1L),
    GST_DEBUG_LEVEL_WARNING(2L),
    GST_DEBUG_LEVEL_FIXME(3L),
    GST_DEBUG_LEVEL_INFO(4L),
    GST_DEBUG_LEVEL_DEBUG(5L),
    GST_DEBUG_LEVEL_LOG(6L),
    GST_DEBUG_LEVEL_TRACE(7L),
    GST_DEBUG_LEVEL_MEMDUMP(9L),
    GST_DEBUG_LEVEL_COUNT(10L);
    public final long value;

    GstDebugLevel(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstDebugLevel> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstDebugLevel> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

    @Ptr
    protected native long gst_debug_level_get_name(IntValuedEnum<GstDebugLevel> level);

    public Pointer get_name(IntValuedEnum<GstDebugLevel> level) {
        return Pointer.pointerToAddress(this.gst_debug_level_get_name(level));
    }

}
