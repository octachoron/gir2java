
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
    public GstBaseTransformClass field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstVideoFilterClass field_parent_class(GstBaseTransformClass field_parent_class) {
        this.io.setNativeObjectField(this, 0, field_parent_class);
        return this;
    }

    @Field(1)
    private Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GstVideoFilterClass field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 1, field__gst_reserved);
        return this;
    }

}
