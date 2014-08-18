
package generated.gstreamervideo10.gstvideo;

import generated.gstreamer10.gst.GstElementClass;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-video-1.0")
public class GstVideoEncoderClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstVideoEncoderClass() {
        super();
    }

    public GstVideoEncoderClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    private GstElementClass field_element_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    private GstVideoEncoderClass field_element_class(GstElementClass field_element_class) {
        this.io.setNativeObjectField(this, 0, field_element_class);
        return this;
    }

    @Field(1)
    private Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GstVideoEncoderClass field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 1, field__gst_reserved);
        return this;
    }

}
