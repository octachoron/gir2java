
package generated.gstreamervideo10.gstvideo;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstNavigationCommand
    implements IntValuedEnum<GstNavigationCommand>
{

    GST_NAVIGATION_COMMAND_INVALID(0L),
    GST_NAVIGATION_COMMAND_MENU1(1L),
    GST_NAVIGATION_COMMAND_MENU2(2L),
    GST_NAVIGATION_COMMAND_MENU3(3L),
    GST_NAVIGATION_COMMAND_MENU4(4L),
    GST_NAVIGATION_COMMAND_MENU5(5L),
    GST_NAVIGATION_COMMAND_MENU6(6L),
    GST_NAVIGATION_COMMAND_MENU7(7L),
    GST_NAVIGATION_COMMAND_LEFT(20L),
    GST_NAVIGATION_COMMAND_RIGHT(21L),
    GST_NAVIGATION_COMMAND_UP(22L),
    GST_NAVIGATION_COMMAND_DOWN(23L),
    GST_NAVIGATION_COMMAND_ACTIVATE(24L),
    GST_NAVIGATION_COMMAND_PREV_ANGLE(30L),
    GST_NAVIGATION_COMMAND_NEXT_ANGLE(31L);
    public final long value;

    GstNavigationCommand(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstNavigationCommand> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstNavigationCommand> fromValue(int value) {
        return FlagSet.fromValue(value, GstNavigationCommand.values());
    }

}
