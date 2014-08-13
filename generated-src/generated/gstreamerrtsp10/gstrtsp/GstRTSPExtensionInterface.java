
package generated.gstreamerrtsp10.gstrtsp;

import generated.gobject20.gobject.GTypeInterface;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-rtsp-1.0")
public class GstRTSPExtensionInterface
    extends StructObject
{


    public GstRTSPExtensionInterface() {
        super();
    }

    public GstRTSPExtensionInterface(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GTypeInterface field_parent() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstRTSPExtensionInterface field_parent(GTypeInterface field_parent) {
        this.io.setNativeObjectField(this, 0, field_parent);
        return this;
    }

    @Field(1)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstRTSPExtensionInterface field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 1, field__gst_reserved);
        return this;
    }

}
