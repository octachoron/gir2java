
package generated.gstreamer10.gst;

import generated.gobject20.gobject.GTypeInterface;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-1.0")
public class GstURIHandlerInterface
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstURIHandlerInterface() {
        super();
    }

    public GstURIHandlerInterface(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GTypeInterface gsturihandlerinterface_field_parent() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstURIHandlerInterface gsturihandlerinterface_field_parent(GTypeInterface gsturihandlerinterface_field_parent) {
        this.io.setNativeObjectField(this, 0, gsturihandlerinterface_field_parent);
        return this;
    }

}
