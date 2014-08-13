
package generated.gstreamervideo10.gstvideo;

import generated.gstreamer10.gst.GstBufferPool;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-video-1.0")
public class GstVideoBufferPool
    extends GstBufferPool
{


    public GstVideoBufferPool() {
        super();
    }

    public GstVideoBufferPool(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GstBufferPool field_bufferpool() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstVideoBufferPool field_bufferpool(GstBufferPool field_bufferpool) {
        this.io.setNativeObjectField(this, 0, field_bufferpool);
        return this;
    }

    @Field(1)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstVideoBufferPool field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

}
