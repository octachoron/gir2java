
package generated.gstreamervideo10.gstvideo;

import generated.gstreamer10.gst.GstElementClass;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-video-1.0")
public class GstVideoDecoderClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstVideoDecoderClass() {
        super();
    }

    public GstVideoDecoderClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    private GstElementClass field_element_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    private GstVideoDecoderClass field_element_class(GstElementClass field_element_class) {
        this.io.setNativeObjectField(this, 0, field_element_class);
        return this;
    }

    @Field(1)
    private Pointer field_padding() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GstVideoDecoderClass field_padding(Pointer field_padding) {
        this.io.setPointerField(this, 1, field_padding);
        return this;
    }

}
