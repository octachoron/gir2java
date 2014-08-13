
package generated.gstreamervideo10.gstvideo;

import generated.gstreamerbase10.gstbase.GstBaseSink;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-video-1.0")
public class GstVideoSink
    extends GstBaseSink
{


    public GstVideoSink() {
        super();
    }

    public GstVideoSink(Pointer pointer) {
        super(pointer);
    }

    protected native void gst_video_sink_center_rect(GstVideoRectangle src, GstVideoRectangle dst,
        @Ptr
        long result, boolean scaling);

    public void center_rect(GstVideoRectangle src, GstVideoRectangle dst, Pointer<GstVideoRectangle> result, boolean scaling) {
        this.gst_video_sink_center_rect(src, dst, Pointer.getPeer(result), scaling);
    }

    @Field(0)
    public GstBaseSink field_element() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstVideoSink field_element(GstBaseSink field_element) {
        this.io.setNativeObjectField(this, 0, field_element);
        return this;
    }

    @Field(1)
    public int field_width() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GstVideoSink field_width(int field_width) {
        this.io.setNativeObjectField(this, 1, field_width);
        return this;
    }

    @Field(2)
    public int field_height() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GstVideoSink field_height(int field_height) {
        this.io.setNativeObjectField(this, 2, field_height);
        return this;
    }

    @Field(3)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public GstVideoSink field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 3, field_priv);
        return this;
    }

    @Field(4)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public GstVideoSink field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 4, field__gst_reserved);
        return this;
    }

}
