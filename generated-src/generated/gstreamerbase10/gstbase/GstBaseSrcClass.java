
package generated.gstreamerbase10.gstbase;

import generated.gstreamer10.gst.GstElementClass;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-base-1.0")
public class GstBaseSrcClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstBaseSrcClass() {
        super();
    }

    public GstBaseSrcClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GstElementClass gstbasesrcclass_field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstBaseSrcClass gstbasesrcclass_field_parent_class(GstElementClass gstbasesrcclass_field_parent_class) {
        this.io.setNativeObjectField(this, 0, gstbasesrcclass_field_parent_class);
        return this;
    }

    @Field(1)
    private Pointer gstbasesrcclass_field__gst_reserved() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GstBaseSrcClass gstbasesrcclass_field__gst_reserved(Pointer gstbasesrcclass_field__gst_reserved) {
        this.io.setPointerField(this, 1, gstbasesrcclass_field__gst_reserved);
        return this;
    }

}
