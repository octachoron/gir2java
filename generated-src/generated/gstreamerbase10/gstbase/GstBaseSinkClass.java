
package generated.gstreamerbase10.gstbase;

import generated.gstreamer10.gst.GstElementClass;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-base-1.0")
public class GstBaseSinkClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstBaseSinkClass() {
        super();
    }

    public GstBaseSinkClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GstElementClass gstbasesinkclass_field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstBaseSinkClass gstbasesinkclass_field_parent_class(GstElementClass gstbasesinkclass_field_parent_class) {
        this.io.setNativeObjectField(this, 0, gstbasesinkclass_field_parent_class);
        return this;
    }

    @Field(1)
    private Pointer gstbasesinkclass_field__gst_reserved() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GstBaseSinkClass gstbasesinkclass_field__gst_reserved(Pointer gstbasesinkclass_field__gst_reserved) {
        this.io.setPointerField(this, 1, gstbasesinkclass_field__gst_reserved);
        return this;
    }

}
