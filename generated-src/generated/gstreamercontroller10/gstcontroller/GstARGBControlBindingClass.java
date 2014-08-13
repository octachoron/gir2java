
package generated.gstreamercontroller10.gstcontroller;

import generated.gstreamer10.gst.GstControlBindingClass;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-controller-1.0")
public class GstARGBControlBindingClass
    extends StructObject
{


    public GstARGBControlBindingClass() {
        super();
    }

    public GstARGBControlBindingClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GstControlBindingClass field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstARGBControlBindingClass field_parent_class(GstControlBindingClass field_parent_class) {
        this.io.setNativeObjectField(this, 0, field_parent_class);
        return this;
    }

    @Field(1)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstARGBControlBindingClass field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 1, field__gst_reserved);
        return this;
    }

}
