
package generated.gstreamervideo10.gstvideo;

import generated.gobject20.gobject.GTypeInterface;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-video-1.0")
public class GstColorBalanceInterface
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstColorBalanceInterface() {
        super();
    }

    public GstColorBalanceInterface(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GTypeInterface gstcolorbalanceinterface_field_iface() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstColorBalanceInterface gstcolorbalanceinterface_field_iface(GTypeInterface gstcolorbalanceinterface_field_iface) {
        this.io.setNativeObjectField(this, 0, gstcolorbalanceinterface_field_iface);
        return this;
    }

    @Field(1)
    private Pointer gstcolorbalanceinterface_field__gst_reserved() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GstColorBalanceInterface gstcolorbalanceinterface_field__gst_reserved(Pointer gstcolorbalanceinterface_field__gst_reserved) {
        this.io.setPointerField(this, 1, gstcolorbalanceinterface_field__gst_reserved);
        return this;
    }

}
