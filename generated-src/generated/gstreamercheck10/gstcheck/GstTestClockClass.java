
package generated.gstreamercheck10.gstcheck;

import generated.gstreamer10.gst.GstClockClass;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-check-1.0")
public class GstTestClockClass
    extends StructObject
{


    public GstTestClockClass() {
        super();
    }

    public GstTestClockClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GstClockClass field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstTestClockClass field_parent_class(GstClockClass field_parent_class) {
        this.io.setNativeObjectField(this, 0, field_parent_class);
        return this;
    }

}
