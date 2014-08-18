
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstPadTemplateFlags
    implements IntValuedEnum<GstPadTemplateFlags>
{

    GST_PAD_TEMPLATE_FLAGS_LAST(256L);
    public final long value;

    GstPadTemplateFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstPadTemplateFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstPadTemplateFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GstPadTemplateFlags.values());
    }

}
