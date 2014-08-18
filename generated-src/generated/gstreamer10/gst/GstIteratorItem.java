
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstIteratorItem
    implements IntValuedEnum<GstIteratorItem>
{

    GST_ITERATOR_ITEM_SKIP(0L),
    GST_ITERATOR_ITEM_PASS(1L),
    GST_ITERATOR_ITEM_END(2L);
    public final long value;

    GstIteratorItem(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstIteratorItem> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstIteratorItem> fromValue(int value) {
        return FlagSet.fromValue(value, GstIteratorItem.values());
    }

}
