
package generated.gstreamer10.gst;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-1.0")
public class GstControlSourceClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstControlSourceClass() {
        super();
    }

    public GstControlSourceClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GstObjectClass gstcontrolsourceclass_field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstControlSourceClass gstcontrolsourceclass_field_parent_class(GstObjectClass gstcontrolsourceclass_field_parent_class) {
        this.io.setNativeObjectField(this, 0, gstcontrolsourceclass_field_parent_class);
        return this;
    }

    @Field(1)
    private Pointer gstcontrolsourceclass_field__gst_reserved() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GstControlSourceClass gstcontrolsourceclass_field__gst_reserved(Pointer gstcontrolsourceclass_field__gst_reserved) {
        this.io.setPointerField(this, 1, gstcontrolsourceclass_field__gst_reserved);
        return this;
    }

}
