
package generated.gstreamer10.gst;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-1.0")
public class GstBufferPoolClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstBufferPoolClass() {
        super();
    }

    public GstBufferPoolClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GstObjectClass gstbufferpoolclass_field_object_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstBufferPoolClass gstbufferpoolclass_field_object_class(GstObjectClass gstbufferpoolclass_field_object_class) {
        this.io.setNativeObjectField(this, 0, gstbufferpoolclass_field_object_class);
        return this;
    }

    @Field(1)
    private Pointer gstbufferpoolclass_field__gst_reserved() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GstBufferPoolClass gstbufferpoolclass_field__gst_reserved(Pointer gstbufferpoolclass_field__gst_reserved) {
        this.io.setPointerField(this, 1, gstbufferpoolclass_field__gst_reserved);
        return this;
    }

}
