
package generated.gstreamerbase10.gstbase;

import generated.gstreamer10.gst.GstObjectClass;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-base-1.0")
public class GstCollectPadsClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstCollectPadsClass() {
        super();
    }

    public GstCollectPadsClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GstObjectClass gstcollectpadsclass_field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstCollectPadsClass gstcollectpadsclass_field_parent_class(GstObjectClass gstcollectpadsclass_field_parent_class) {
        this.io.setNativeObjectField(this, 0, gstcollectpadsclass_field_parent_class);
        return this;
    }

    @Field(1)
    private Pointer gstcollectpadsclass_field__gst_reserved() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GstCollectPadsClass gstcollectpadsclass_field__gst_reserved(Pointer gstcollectpadsclass_field__gst_reserved) {
        this.io.setPointerField(this, 1, gstcollectpadsclass_field__gst_reserved);
        return this;
    }

}
