
package generated.gstreamer10.gst;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstParseContext
    extends StructObject
{


    public GstParseContext() {
        super();
    }

    public GstParseContext(Pointer pointer) {
        super(pointer);
    }

    protected native void gst_parse_context_free(
        @Ptr
        long context);

    public void free() {
        this.gst_parse_context_free(Pointer.pointerTo(this, GstParseContext.class));
    }

    @Ptr
    protected native long gst_parse_context_get_missing_elements(
        @Ptr
        long context);

    public Pointer get_missing_elements() {
        return Pointer.pointerToAddress(this.gst_parse_context_get_missing_elements(Pointer.pointerTo(this, GstParseContext.class)));
    }

}
