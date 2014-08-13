
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstIteratorResult
    implements IntValuedEnum<GstIteratorResult>
{

    GST_ITERATOR_RESULT_DONE(0L),
    GST_ITERATOR_RESULT_OK(1L),
    GST_ITERATOR_RESULT_RESYNC(2L),
    GST_ITERATOR_RESULT_ERROR(3L);
    public final long value;

    GstIteratorResult(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstIteratorResult> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstIteratorResult> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
