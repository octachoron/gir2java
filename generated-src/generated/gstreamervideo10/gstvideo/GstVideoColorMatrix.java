
package generated.gstreamervideo10.gstvideo;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstVideoColorMatrix
    implements IntValuedEnum<GstVideoColorMatrix>
{

    GST_VIDEO_COLOR_MATRIX_UNKNOWN(0L),
    GST_VIDEO_COLOR_MATRIX_RGB(1L),
    GST_VIDEO_COLOR_MATRIX_FCC(2L),
    GST_VIDEO_COLOR_MATRIX_BT709(3L),
    GST_VIDEO_COLOR_MATRIX_BT601(4L),
    GST_VIDEO_COLOR_MATRIX_SMPTE240M(5L);
    public final long value;

    GstVideoColorMatrix(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstVideoColorMatrix> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstVideoColorMatrix> fromValue(int value) {
        return FlagSet.fromValue(value, GstVideoColorMatrix.values());
    }

}
