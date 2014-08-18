
package generated.gstreamervideo10.gstvideo;

import generated.gstreamer10.gst.GstBufferPool;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-video-1.0")
public class GstVideoBufferPool
    extends GstBufferPool
{


    static {
        BridJ.register();
    }

    public GstVideoBufferPool() {
        super();
    }

    public GstVideoBufferPool(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long gst_video_buffer_pool_new();

    public static Pointer<GstBufferPool> gstvideobufferpool__new() {
        return Pointer.pointerToAddress(GstVideoBufferPool.gst_video_buffer_pool_new(), GstBufferPool.class);
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
    public Pointer gstvideobufferpool_field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstVideoBufferPool gstvideobufferpool_field_priv(Pointer gstvideobufferpool_field_priv) {
        this.io.setPointerField(this, 1, gstvideobufferpool_field_priv);
        return this;
    }

}
