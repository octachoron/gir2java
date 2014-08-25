
package generated.gstreamer10.gst;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-1.0")
public class GstGhostPadClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstGhostPadClass() {
        super();
    }

    public GstGhostPadClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    private Pointer gstghostpadclass_field__gst_reserved() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    private GstGhostPadClass gstghostpadclass_field__gst_reserved(Pointer gstghostpadclass_field__gst_reserved) {
        this.io.setPointerField(this, 0, gstghostpadclass_field__gst_reserved);
        return this;
    }

    @Field(1)
    public GstProxyPadClass gstghostpadclass_field_parent_class() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GstGhostPadClass gstghostpadclass_field_parent_class(GstProxyPadClass gstghostpadclass_field_parent_class) {
        this.io.setNativeObjectField(this, 1, gstghostpadclass_field_parent_class);
        return this;
    }

}
