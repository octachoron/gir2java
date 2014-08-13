
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstPadLinkReturn
    implements IntValuedEnum<GstPadLinkReturn>
{

    GST_PAD_LINK_RETURN_OK(0L),
    GST_PAD_LINK_RETURN_WRONG_HIERARCHY(-1L),
    GST_PAD_LINK_RETURN_WAS_LINKED(-2L),
    GST_PAD_LINK_RETURN_WRONG_DIRECTION(-3L),
    GST_PAD_LINK_RETURN_NOFORMAT(-4L),
    GST_PAD_LINK_RETURN_NOSCHED(-5L),
    GST_PAD_LINK_RETURN_REFUSED(-6L);
    public final long value;

    GstPadLinkReturn(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstPadLinkReturn> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstPadLinkReturn> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
