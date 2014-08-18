
package generated.gstreamervideo10.gstvideo;

import generated.gobject20.gobject.GTypeInterface;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-video-1.0")
public class GstVideoOrientationInterface
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstVideoOrientationInterface() {
        super();
    }

    public GstVideoOrientationInterface(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GTypeInterface field_iface() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstVideoOrientationInterface field_iface(GTypeInterface field_iface) {
        this.io.setNativeObjectField(this, 0, field_iface);
        return this;
    }

}
