
package generated.gstreamer10.gst;

import generated.gobject20.gobject.GTypeInterface;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-1.0")
public class GstTagSetterInterface
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstTagSetterInterface() {
        super();
    }

    public GstTagSetterInterface(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GTypeInterface gsttagsetterinterface_field_g_iface() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstTagSetterInterface gsttagsetterinterface_field_g_iface(GTypeInterface gsttagsetterinterface_field_g_iface) {
        this.io.setNativeObjectField(this, 0, gsttagsetterinterface_field_g_iface);
        return this;
    }

}
