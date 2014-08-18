
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstPadLinkCheck
    implements IntValuedEnum<GstPadLinkCheck>
{

    GST_PAD_LINK_CHECK_NOTHING(0L),
    GST_PAD_LINK_CHECK_HIERARCHY(1L),
    GST_PAD_LINK_CHECK_TEMPLATE_CAPS(2L),
    GST_PAD_LINK_CHECK_CAPS(4L),
    GST_PAD_LINK_CHECK_DEFAULT(5L);
    public final long value;

    GstPadLinkCheck(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstPadLinkCheck> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstPadLinkCheck> fromValue(int value) {
        return FlagSet.fromValue(value, GstPadLinkCheck.values());
    }

}
