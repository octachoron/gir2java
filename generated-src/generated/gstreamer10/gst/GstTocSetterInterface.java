
package generated.gstreamer10.gst;

import generated.gobject20.gobject.GTypeInterface;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-1.0")
public class GstTocSetterInterface
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstTocSetterInterface() {
        super();
    }

    public GstTocSetterInterface(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GTypeInterface field_g_iface() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstTocSetterInterface field_g_iface(GTypeInterface field_g_iface) {
        this.io.setNativeObjectField(this, 0, field_g_iface);
        return this;
    }

}
