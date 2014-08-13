
package generated;

import generated.gstreamercontroller10.gstcontroller.GstTimedValueControlSource;
import org.bridj.Pointer;
import org.bridj.ann.Ptr;

public class GstController {


    protected native void gst_timed_value_control_invalidate_cache(
        @Ptr
        long self);

    public void timed_value_control_invalidate_cache(Pointer<GstTimedValueControlSource> self) {
        this.gst_timed_value_control_invalidate_cache(Pointer.getPeer(self));
    }

}
