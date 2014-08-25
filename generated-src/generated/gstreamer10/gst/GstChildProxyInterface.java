
package generated.gstreamer10.gst;

import generated.gobject20.gobject.GTypeInterface;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-1.0")
public class GstChildProxyInterface
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstChildProxyInterface() {
        super();
    }

    public GstChildProxyInterface(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GTypeInterface gstchildproxyinterface_field_parent() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstChildProxyInterface gstchildproxyinterface_field_parent(GTypeInterface gstchildproxyinterface_field_parent) {
        this.io.setNativeObjectField(this, 0, gstchildproxyinterface_field_parent);
        return this;
    }

    @Field(1)
    private Pointer gstchildproxyinterface_field__gst_reserved() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GstChildProxyInterface gstchildproxyinterface_field__gst_reserved(Pointer gstchildproxyinterface_field__gst_reserved) {
        this.io.setPointerField(this, 1, gstchildproxyinterface_field__gst_reserved);
        return this;
    }

}
