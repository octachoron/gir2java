
package generated.gstreamer10.gst;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstContext
    extends StructObject
{


    public GstContext() {
        super();
    }

    public GstContext(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long gst_context_get_context_type(
        @Ptr
        long context);

    public Pointer get_context_type() {
        return Pointer.pointerToAddress(this.gst_context_get_context_type(Pointer.pointerTo(this, GstContext.class)));
    }

    @Ptr
    protected native long gst_context_get_structure(
        @Ptr
        long context);

    public Pointer get_structure() {
        return Pointer.pointerToAddress(this.gst_context_get_structure(Pointer.pointerTo(this, GstContext.class)));
    }

    protected native boolean gst_context_has_context_type(
        @Ptr
        long context,
        @Ptr
        long context_type);

    public boolean has_context_type(Pointer context_type) {
        return this.gst_context_has_context_type(Pointer.pointerTo(this, GstContext.class), Pointer.getPeer(context_type));
    }

    protected native boolean gst_context_is_persistent(
        @Ptr
        long context);

    public boolean is_persistent() {
        return this.gst_context_is_persistent(Pointer.pointerTo(this, GstContext.class));
    }

    @Ptr
    protected native long gst_context_writable_structure(
        @Ptr
        long context);

    public Pointer writable_structure() {
        return Pointer.pointerToAddress(this.gst_context_writable_structure(Pointer.pointerTo(this, GstContext.class)));
    }

}
