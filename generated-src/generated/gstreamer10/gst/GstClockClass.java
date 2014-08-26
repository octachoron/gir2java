
package generated.gstreamer10.gst;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-1.0")
public class GstClockClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstClockClass() {
        super();
    }

    public GstClockClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    private Pointer gstclockclass_field__gst_reserved() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    private GstClockClass gstclockclass_field__gst_reserved(Pointer gstclockclass_field__gst_reserved) {
        this.io.setPointerField(this, 0, gstclockclass_field__gst_reserved);
        return this;
    }

    @Field(1)
    public GstObjectClass gstclockclass_field_parent_class() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GstClockClass gstclockclass_field_parent_class(GstObjectClass gstclockclass_field_parent_class) {
        this.io.setNativeObjectField(this, 1, gstclockclass_field_parent_class);
        return this;
    }

}
