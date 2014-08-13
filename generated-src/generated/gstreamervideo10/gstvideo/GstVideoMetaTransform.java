
package generated.gstreamervideo10.gstvideo;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-video-1.0")
public class GstVideoMetaTransform
    extends StructObject
{


    public GstVideoMetaTransform() {
        super();
    }

    public GstVideoMetaTransform(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer<GstVideoInfo> field_in_info() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GstVideoMetaTransform field_in_info(Pointer<GstVideoInfo> field_in_info) {
        this.io.setPointerField(this, 0, field_in_info);
        return this;
    }

    @Field(1)
    public Pointer<GstVideoInfo> field_out_info() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstVideoMetaTransform field_out_info(Pointer<GstVideoInfo> field_out_info) {
        this.io.setPointerField(this, 1, field_out_info);
        return this;
    }

    public native Object gst_video_meta_transform_scale_get_quark();

}
