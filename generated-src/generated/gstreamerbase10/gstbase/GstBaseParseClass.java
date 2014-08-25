
package generated.gstreamerbase10.gstbase;

import generated.gstreamer10.gst.GstElementClass;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-base-1.0")
public class GstBaseParseClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstBaseParseClass() {
        super();
    }

    public GstBaseParseClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GstElementClass gstbaseparseclass_field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstBaseParseClass gstbaseparseclass_field_parent_class(GstElementClass gstbaseparseclass_field_parent_class) {
        this.io.setNativeObjectField(this, 0, gstbaseparseclass_field_parent_class);
        return this;
    }

    @Field(1)
    private Pointer gstbaseparseclass_field__gst_reserved() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GstBaseParseClass gstbaseparseclass_field__gst_reserved(Pointer gstbaseparseclass_field__gst_reserved) {
        this.io.setPointerField(this, 1, gstbaseparseclass_field__gst_reserved);
        return this;
    }

}
