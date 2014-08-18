
package generated.gstreamervideo10.gstvideo;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstNavigationMessageType
    implements IntValuedEnum<GstNavigationMessageType>
{

    GST_NAVIGATION_MESSAGE_TYPE_INVALID(0L),
    GST_NAVIGATION_MESSAGE_TYPE_MOUSE_OVER(1L),
    GST_NAVIGATION_MESSAGE_TYPE_COMMANDS_CHANGED(2L),
    GST_NAVIGATION_MESSAGE_TYPE_ANGLES_CHANGED(3L);
    public final long value;

    GstNavigationMessageType(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstNavigationMessageType> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstNavigationMessageType> fromValue(int value) {
        return FlagSet.fromValue(value, GstNavigationMessageType.values());
    }

}
