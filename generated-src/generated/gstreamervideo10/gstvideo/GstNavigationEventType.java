
package generated.gstreamervideo10.gstvideo;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstNavigationEventType
    implements IntValuedEnum<GstNavigationEventType>
{

    GST_NAVIGATION_EVENT_TYPE_INVALID(0L),
    GST_NAVIGATION_EVENT_TYPE_KEY_PRESS(1L),
    GST_NAVIGATION_EVENT_TYPE_KEY_RELEASE(2L),
    GST_NAVIGATION_EVENT_TYPE_MOUSE_BUTTON_PRESS(3L),
    GST_NAVIGATION_EVENT_TYPE_MOUSE_BUTTON_RELEASE(4L),
    GST_NAVIGATION_EVENT_TYPE_MOUSE_MOVE(5L),
    GST_NAVIGATION_EVENT_TYPE_COMMAND(6L);
    public final long value;

    GstNavigationEventType(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstNavigationEventType> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstNavigationEventType> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
