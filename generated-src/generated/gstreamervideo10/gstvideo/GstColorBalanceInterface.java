
package generated.gstreamervideo10.gstvideo;

import generated.gobject20.gobject.GTypeInterface;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-video-1.0")
public class GstColorBalanceInterface
    extends StructObject
{


    public GstColorBalanceInterface() {
        super();
    }

    public GstColorBalanceInterface(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GTypeInterface field_iface() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstColorBalanceInterface field_iface(GTypeInterface field_iface) {
        this.io.setNativeObjectField(this, 0, field_iface);
        return this;
    }

    @Field(1)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstColorBalanceInterface field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 1, field__gst_reserved);
        return this;
    }

}
