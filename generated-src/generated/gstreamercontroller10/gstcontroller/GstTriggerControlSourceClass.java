
package generated.gstreamercontroller10.gstcontroller;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-controller-1.0")
public class GstTriggerControlSourceClass
    extends StructObject
{


    public GstTriggerControlSourceClass() {
        super();
    }

    public GstTriggerControlSourceClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GstTimedValueControlSourceClass field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstTriggerControlSourceClass field_parent_class(GstTimedValueControlSourceClass field_parent_class) {
        this.io.setNativeObjectField(this, 0, field_parent_class);
        return this;
    }

    @Field(1)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstTriggerControlSourceClass field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 1, field__gst_reserved);
        return this;
    }

}
