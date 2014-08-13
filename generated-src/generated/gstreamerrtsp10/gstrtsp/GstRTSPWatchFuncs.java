
package generated.gstreamerrtsp10.gstrtsp;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-rtsp-1.0")
public class GstRTSPWatchFuncs
    extends StructObject
{


    public GstRTSPWatchFuncs() {
        super();
    }

    public GstRTSPWatchFuncs(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GstRTSPWatchFuncs field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 0, field__gst_reserved);
        return this;
    }

}
