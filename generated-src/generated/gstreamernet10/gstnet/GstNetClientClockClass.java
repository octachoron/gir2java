
package generated.gstreamernet10.gstnet;

import generated.gstreamer10.gst.GstSystemClockClass;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-net-1.0")
public class GstNetClientClockClass
    extends StructObject
{


    public GstNetClientClockClass() {
        super();
    }

    public GstNetClientClockClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GstSystemClockClass field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstNetClientClockClass field_parent_class(GstSystemClockClass field_parent_class) {
        this.io.setNativeObjectField(this, 0, field_parent_class);
        return this;
    }

    @Field(1)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstNetClientClockClass field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 1, field__gst_reserved);
        return this;
    }

}
