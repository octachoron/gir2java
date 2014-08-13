
package generated.gstreamervideo10.gstvideo;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstNavigationQueryType
    implements IntValuedEnum<GstNavigationQueryType>
{

    GST_NAVIGATION_QUERY_TYPE_INVALID(0L),
    GST_NAVIGATION_QUERY_TYPE_COMMANDS(1L),
    GST_NAVIGATION_QUERY_TYPE_ANGLES(2L);
    public final long value;

    GstNavigationQueryType(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstNavigationQueryType> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstNavigationQueryType> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
