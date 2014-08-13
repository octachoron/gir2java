
package generated.gstreamervideo10.gstvideo;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstVideoTransferFunction
    implements IntValuedEnum<GstVideoTransferFunction>
{

    GST_VIDEO_TRANSFER_FUNCTION_UNKNOWN(0L),
    GST_VIDEO_TRANSFER_FUNCTION_GAMMA10(1L),
    GST_VIDEO_TRANSFER_FUNCTION_GAMMA18(2L),
    GST_VIDEO_TRANSFER_FUNCTION_GAMMA20(3L),
    GST_VIDEO_TRANSFER_FUNCTION_GAMMA22(4L),
    GST_VIDEO_TRANSFER_FUNCTION_BT709(5L),
    GST_VIDEO_TRANSFER_FUNCTION_SMPTE240M(6L),
    GST_VIDEO_TRANSFER_FUNCTION_SRGB(7L),
    GST_VIDEO_TRANSFER_FUNCTION_GAMMA28(8L),
    GST_VIDEO_TRANSFER_FUNCTION_LOG100(9L),
    GST_VIDEO_TRANSFER_FUNCTION_LOG316(10L);
    public final long value;

    GstVideoTransferFunction(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstVideoTransferFunction> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstVideoTransferFunction> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
