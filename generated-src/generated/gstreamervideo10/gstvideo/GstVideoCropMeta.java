
package generated.gstreamervideo10.gstvideo;

import generated.gstreamer10.gst.GstMeta;
import generated.gstreamer10.gst.GstMetaInfo;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-video-1.0")
public class GstVideoCropMeta
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstVideoCropMeta() {
        super();
    }

    public GstVideoCropMeta(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GstMeta gstvideocropmeta_field_meta() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstVideoCropMeta gstvideocropmeta_field_meta(GstMeta gstvideocropmeta_field_meta) {
        this.io.setNativeObjectField(this, 0, gstvideocropmeta_field_meta);
        return this;
    }

    @Field(1)
    public long gstvideocropmeta_field_x() {
        return this.io.getLongField(this, 1);
    }

    @Field(1)
    public GstVideoCropMeta gstvideocropmeta_field_x(long gstvideocropmeta_field_x) {
        this.io.setLongField(this, 1, gstvideocropmeta_field_x);
        return this;
    }

    @Field(2)
    public long gstvideocropmeta_field_y() {
        return this.io.getLongField(this, 2);
    }

    @Field(2)
    public GstVideoCropMeta gstvideocropmeta_field_y(long gstvideocropmeta_field_y) {
        this.io.setLongField(this, 2, gstvideocropmeta_field_y);
        return this;
    }

    @Field(3)
    public long gstvideocropmeta_field_width() {
        return this.io.getLongField(this, 3);
    }

    @Field(3)
    public GstVideoCropMeta gstvideocropmeta_field_width(long gstvideocropmeta_field_width) {
        this.io.setLongField(this, 3, gstvideocropmeta_field_width);
        return this;
    }

    @Field(4)
    public long gstvideocropmeta_field_height() {
        return this.io.getLongField(this, 4);
    }

    @Field(4)
    public GstVideoCropMeta gstvideocropmeta_field_height(long gstvideocropmeta_field_height) {
        this.io.setLongField(this, 4, gstvideocropmeta_field_height);
        return this;
    }

    @Ptr
    protected static native long gst_video_crop_meta_get_info();

    public static Pointer<GstMetaInfo> get_info() {
        return Pointer.pointerToAddress(GstVideoCropMeta.gst_video_crop_meta_get_info(), GstMetaInfo.class);
    }

}
