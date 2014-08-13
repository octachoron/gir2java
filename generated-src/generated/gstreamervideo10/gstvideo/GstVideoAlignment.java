
package generated.gstreamervideo10.gstvideo;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-video-1.0")
public class GstVideoAlignment
    extends StructObject
{


    public GstVideoAlignment() {
        super();
    }

    public GstVideoAlignment(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public long field_padding_top() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstVideoAlignment field_padding_top(long field_padding_top) {
        this.io.setNativeObjectField(this, 0, field_padding_top);
        return this;
    }

    @Field(1)
    public long field_padding_bottom() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GstVideoAlignment field_padding_bottom(long field_padding_bottom) {
        this.io.setNativeObjectField(this, 1, field_padding_bottom);
        return this;
    }

    @Field(2)
    public long field_padding_left() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GstVideoAlignment field_padding_left(long field_padding_left) {
        this.io.setNativeObjectField(this, 2, field_padding_left);
        return this;
    }

    @Field(3)
    public long field_padding_right() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GstVideoAlignment field_padding_right(long field_padding_right) {
        this.io.setNativeObjectField(this, 3, field_padding_right);
        return this;
    }

    @Field(4)
    public long field_stride_align() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public GstVideoAlignment field_stride_align(long field_stride_align) {
        this.io.setPointerField(this, 4, field_stride_align);
        return this;
    }

    protected native void gst_video_alignment_reset(
        @Ptr
        long align);

    public void reset() {
        this.gst_video_alignment_reset(Pointer.pointerTo(this, GstVideoAlignment.class));
    }

}
