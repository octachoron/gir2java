
package generated.gstreamercontroller10.gstcontroller;

import generated.gstreamer10.gst.GstControlSourceClass;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-controller-1.0")
public class GstTimedValueControlSourceClass
    extends StructObject
{


    public GstTimedValueControlSourceClass() {
        super();
    }

    public GstTimedValueControlSourceClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GstControlSourceClass field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstTimedValueControlSourceClass field_parent_class(GstControlSourceClass field_parent_class) {
        this.io.setNativeObjectField(this, 0, field_parent_class);
        return this;
    }

    @Field(1)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstTimedValueControlSourceClass field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 1, field__gst_reserved);
        return this;
    }

}
