
package generated.gstreamervideo10.gstvideo;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-video-1.0")
public class GstVideoAlignment
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstVideoAlignment() {
        super();
    }

    public GstVideoAlignment(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public long gstvideoalignment_field_padding_top() {
        return this.io.getLongField(this, 0);
    }

    @Field(0)
    public GstVideoAlignment gstvideoalignment_field_padding_top(long gstvideoalignment_field_padding_top) {
        this.io.setLongField(this, 0, gstvideoalignment_field_padding_top);
        return this;
    }

    @Field(1)
    public long gstvideoalignment_field_padding_bottom() {
        return this.io.getLongField(this, 1);
    }

    @Field(1)
    public GstVideoAlignment gstvideoalignment_field_padding_bottom(long gstvideoalignment_field_padding_bottom) {
        this.io.setLongField(this, 1, gstvideoalignment_field_padding_bottom);
        return this;
    }

    @Field(2)
    public long gstvideoalignment_field_padding_left() {
        return this.io.getLongField(this, 2);
    }

    @Field(2)
    public GstVideoAlignment gstvideoalignment_field_padding_left(long gstvideoalignment_field_padding_left) {
        this.io.setLongField(this, 2, gstvideoalignment_field_padding_left);
        return this;
    }

    @Field(3)
    public long gstvideoalignment_field_padding_right() {
        return this.io.getLongField(this, 3);
    }

    @Field(3)
    public GstVideoAlignment gstvideoalignment_field_padding_right(long gstvideoalignment_field_padding_right) {
        this.io.setLongField(this, 3, gstvideoalignment_field_padding_right);
        return this;
    }

    @Field(4)
    public long gstvideoalignment_field_stride_align() {
        return this.io.getLongField(this, 4);
    }

    @Field(4)
    public GstVideoAlignment gstvideoalignment_field_stride_align(long gstvideoalignment_field_stride_align) {
        this.io.setLongField(this, 4, gstvideoalignment_field_stride_align);
        return this;
    }

    protected native void gst_video_alignment_reset(
        @Ptr
        long align);

    public void reset() {
        this.gst_video_alignment_reset(Pointer.pointerTo(this, GstVideoAlignment.class).getPeer());
    }

}
