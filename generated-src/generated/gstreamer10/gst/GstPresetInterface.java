
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
    public GTypeInterface field_parent() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstPresetInterface field_parent(GTypeInterface field_parent) {
        this.io.setNativeObjectField(this, 0, field_parent);
        return this;
    }

    @Field(1)
    private Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GstPresetInterface field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 1, field__gst_reserved);
        return this;
    }

}
