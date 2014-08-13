
package generated.gstreamer10.gst;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstDebugMessage
    extends StructObject
{


    public GstDebugMessage() {
        super();
    }

    public GstDebugMessage(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long gst_debug_message_get(
        @Ptr
        long message);

    public Pointer get() {
        return Pointer.pointerToAddress(this.gst_debug_message_get(Pointer.pointerTo(this, GstDebugMessage.class)));
    }

}
