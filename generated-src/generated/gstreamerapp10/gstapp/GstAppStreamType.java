
package generated.gstreamerapp10.gstapp;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstAppStreamType
    implements IntValuedEnum<GstAppStreamType>
{

    GST_APP_STREAM_TYPE_STREAM(0L),
    GST_APP_STREAM_TYPE_SEEKABLE(1L),
    GST_APP_STREAM_TYPE_RANDOM_ACCESS(2L);
    public final long value;

    GstAppStreamType(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstAppStreamType> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstAppStreamType> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
