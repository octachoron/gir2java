
package generated.gstreamervideo10.gstvideo;

import generated.gstreamer10.gst.GstBufferPoolClass;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-video-1.0")
public class GstVideoBufferPoolClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstVideoBufferPoolClass() {
        super();
    }

    public GstVideoBufferPoolClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GstBufferPoolClass field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstVideoBufferPoolClass field_parent_class(GstBufferPoolClass field_parent_class) {
        this.io.setNativeObjectField(this, 0, field_parent_class);
        return this;
    }

}
