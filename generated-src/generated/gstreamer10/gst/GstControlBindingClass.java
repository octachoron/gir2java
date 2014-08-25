
package generated.gstreamer10.gst;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-1.0")
public class GstControlBindingClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstControlBindingClass() {
        super();
    }

    public GstControlBindingClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GstObjectClass gstcontrolbindingclass_field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstControlBindingClass gstcontrolbindingclass_field_parent_class(GstObjectClass gstcontrolbindingclass_field_parent_class) {
        this.io.setNativeObjectField(this, 0, gstcontrolbindingclass_field_parent_class);
        return this;
    }

    @Field(1)
    private Pointer gstcontrolbindingclass_field__gst_reserved() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GstControlBindingClass gstcontrolbindingclass_field__gst_reserved(Pointer gstcontrolbindingclass_field__gst_reserved) {
        this.io.setPointerField(this, 1, gstcontrolbindingclass_field__gst_reserved);
        return this;
    }

}
