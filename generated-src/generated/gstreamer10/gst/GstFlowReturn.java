
package generated.gstreamer10.gst;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstFlowReturn
    implements IntValuedEnum<GstFlowReturn>
{

    GST_FLOW_RETURN_CUSTOM_SUCCESS_2(102L),
    GST_FLOW_RETURN_CUSTOM_SUCCESS_1(101L),
    GST_FLOW_RETURN_CUSTOM_SUCCESS(100L),
    GST_FLOW_RETURN_OK(0L),
    GST_FLOW_RETURN_NOT_LINKED(-1L),
    GST_FLOW_RETURN_FLUSHING(-2L),
    GST_FLOW_RETURN_EOS(-3L),
    GST_FLOW_RETURN_NOT_NEGOTIATED(-4L),
    GST_FLOW_RETURN_ERROR(-5L),
    GST_FLOW_RETURN_NOT_SUPPORTED(-6L),
    GST_FLOW_RETURN_CUSTOM_ERROR(-100L),
    GST_FLOW_RETURN_CUSTOM_ERROR_1(-101L),
    GST_FLOW_RETURN_CUSTOM_ERROR_2(-102L);
    public final long value;

    GstFlowReturn(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstFlowReturn> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstFlowReturn> fromValue(int value) {
        return FlagSet.fromValue(value, GstFlowReturn.values());
    }

}
