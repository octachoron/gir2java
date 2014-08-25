
package generated.gstreamer10.gst;

import generated.gobject20.gobject.GTypeInterface;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-1.0")
public class GstPresetInterface
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstPresetInterface() {
        super();
    }

    public GstPresetInterface(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GTypeInterface gstpresetinterface_field_parent() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstPresetInterface gstpresetinterface_field_parent(GTypeInterface gstpresetinterface_field_parent) {
        this.io.setNativeObjectField(this, 0, gstpresetinterface_field_parent);
        return this;
    }

    @Field(1)
    private Pointer gstpresetinterface_field__gst_reserved() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GstPresetInterface gstpresetinterface_field__gst_reserved(Pointer gstpresetinterface_field__gst_reserved) {
        this.io.setPointerField(this, 1, gstpresetinterface_field__gst_reserved);
        return this;
    }

}
