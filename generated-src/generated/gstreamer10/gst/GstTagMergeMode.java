
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstTagMergeMode
    implements IntValuedEnum<GstTagMergeMode>
{

    GST_TAG_MERGE_MODE_UNDEFINED(0L),
    GST_TAG_MERGE_MODE_REPLACE_ALL(1L),
    GST_TAG_MERGE_MODE_REPLACE(2L),
    GST_TAG_MERGE_MODE_APPEND(3L),
    GST_TAG_MERGE_MODE_PREPEND(4L),
    GST_TAG_MERGE_MODE_KEEP(5L),
    GST_TAG_MERGE_MODE_KEEP_ALL(6L),
    GST_TAG_MERGE_MODE_COUNT(7L);
    public final long value;

    GstTagMergeMode(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstTagMergeMode> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstTagMergeMode> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
