
package generated.gstreamervideo10.gstvideo;

import generated.gstreamerbase10.gstbase.GstBaseTransformClass;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-video-1.0")
public class GstVideoFilterClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstVideoFilterClass() {
        super();
    }

    public GstVideoFilterClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GstBaseTransformClass gstvideofilterclass_field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstVideoFilterClass gstvideofilterclass_field_parent_class(GstBaseTransformClass gstvideofilterclass_field_parent_class) {
        this.io.setNativeObjectField(this, 0, gstvideofilterclass_field_parent_class);
        return this;
    }

    @Field(1)
    private Pointer gstvideofilterclass_field__gst_reserved() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GstVideoFilterClass gstvideofilterclass_field__gst_reserved(Pointer gstvideofilterclass_field__gst_reserved) {
        this.io.setPointerField(this, 1, gstvideofilterclass_field__gst_reserved);
        return this;
    }

}
