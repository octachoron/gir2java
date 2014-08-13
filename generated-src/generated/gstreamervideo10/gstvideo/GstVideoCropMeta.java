
package generated.gstreamervideo10.gstvideo;

import generated.gstreamer10.gst.GstMeta;
import generated.gstreamer10.gst.GstMetaInfo;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-video-1.0")
public class GstVideoCropMeta
    extends StructObject
{


    public GstVideoCropMeta() {
        super();
    }

    public GstVideoCropMeta(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GstMeta field_meta() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstVideoCropMeta field_meta(GstMeta field_meta) {
        this.io.setNativeObjectField(this, 0, field_meta);
        return this;
    }

    @Field(1)
    public long field_x() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GstVideoCropMeta field_x(long field_x) {
        this.io.setNativeObjectField(this, 1, field_x);
        return this;
    }

    @Field(2)
    public long field_y() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GstVideoCropMeta field_y(long field_y) {
        this.io.setNativeObjectField(this, 2, field_y);
        return this;
    }

    @Field(3)
    public long field_width() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GstVideoCropMeta field_width(long field_width) {
        this.io.setNativeObjectField(this, 3, field_width);
        return this;
    }

    @Field(4)
    public long field_height() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    public GstVideoCropMeta field_height(long field_height) {
        this.io.setNativeObjectField(this, 4, field_height);
        return this;
    }

    @Ptr
    protected native long gst_video_crop_meta_get_info();

    public Pointer<GstMetaInfo> get_info() {
        return Pointer.pointerToAddress(this.gst_video_crop_meta_get_info(), Pointer.class);
    }

}
