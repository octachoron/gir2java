
package generated.gstreamerapp10.gstapp;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-app-1.0")
public class GstAppSinkCallbacks
    extends StructObject
{


    public GstAppSinkCallbacks() {
        super();
    }

    public GstAppSinkCallbacks(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GstAppSinkCallbacks field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 0, field__gst_reserved);
        return this;
    }

}
