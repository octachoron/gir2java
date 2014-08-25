
package generated.gstreamer10.gst;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-1.0")
public class GstSystemClockClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstSystemClockClass() {
        super();
    }

    public GstSystemClockClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GstClockClass gstsystemclockclass_field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstSystemClockClass gstsystemclockclass_field_parent_class(GstClockClass gstsystemclockclass_field_parent_class) {
        this.io.setNativeObjectField(this, 0, gstsystemclockclass_field_parent_class);
        return this;
    }

    @Field(1)
    private Pointer gstsystemclockclass_field__gst_reserved() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GstSystemClockClass gstsystemclockclass_field__gst_reserved(Pointer gstsystemclockclass_field__gst_reserved) {
        this.io.setPointerField(this, 1, gstsystemclockclass_field__gst_reserved);
        return this;
    }

}
