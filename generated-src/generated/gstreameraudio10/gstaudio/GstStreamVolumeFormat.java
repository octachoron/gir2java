
package generated.gstreameraudio10.gstaudio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstStreamVolumeFormat
    implements IntValuedEnum<GstStreamVolumeFormat>
{

    GST_STREAM_VOLUME_FORMAT_LINEAR(0L),
    GST_STREAM_VOLUME_FORMAT_CUBIC(1L),
    GST_STREAM_VOLUME_FORMAT_DB(2L);
    public final long value;

    GstStreamVolumeFormat(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstStreamVolumeFormat> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstStreamVolumeFormat> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
