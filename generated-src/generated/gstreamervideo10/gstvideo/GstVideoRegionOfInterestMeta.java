
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
public class GstVideoRegionOfInterestMeta
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstVideoRegionOfInterestMeta() {
        super();
    }

    public GstVideoRegionOfInterestMeta(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GstMeta gstvideoregionofinterestmeta_field_meta() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstVideoRegionOfInterestMeta gstvideoregionofinterestmeta_field_meta(GstMeta gstvideoregionofinterestmeta_field_meta) {
        this.io.setNativeObjectField(this, 0, gstvideoregionofinterestmeta_field_meta);
        return this;
    }

    @Field(1)
    public long gstvideoregionofinterestmeta_field_roi_type() {
        return this.io.getLongField(this, 1);
    }

    @Field(1)
    public GstVideoRegionOfInterestMeta gstvideoregionofinterestmeta_field_roi_type(long gstvideoregionofinterestmeta_field_roi_type) {
        this.io.setLongField(this, 1, gstvideoregionofinterestmeta_field_roi_type);
        return this;
    }

    @Field(2)
    public int gstvideoregionofinterestmeta_field_id() {
        return this.io.getIntField(this, 2);
    }

    @Field(2)
    public GstVideoRegionOfInterestMeta gstvideoregionofinterestmeta_field_id(int gstvideoregionofinterestmeta_field_id) {
        this.io.setIntField(this, 2, gstvideoregionofinterestmeta_field_id);
        return this;
    }

    @Field(3)
    public int gstvideoregionofinterestmeta_field_parent_id() {
        return this.io.getIntField(this, 3);
    }

    @Field(3)
    public GstVideoRegionOfInterestMeta gstvideoregionofinterestmeta_field_parent_id(int gstvideoregionofinterestmeta_field_parent_id) {
        this.io.setIntField(this, 3, gstvideoregionofinterestmeta_field_parent_id);
        return this;
    }

    @Field(4)
    public long gstvideoregionofinterestmeta_field_x() {
        return this.io.getLongField(this, 4);
    }

    @Field(4)
    public GstVideoRegionOfInterestMeta gstvideoregionofinterestmeta_field_x(long gstvideoregionofinterestmeta_field_x) {
        this.io.setLongField(this, 4, gstvideoregionofinterestmeta_field_x);
        return this;
    }

    @Field(5)
    public long gstvideoregionofinterestmeta_field_y() {
        return this.io.getLongField(this, 5);
    }

    @Field(5)
    public GstVideoRegionOfInterestMeta gstvideoregionofinterestmeta_field_y(long gstvideoregionofinterestmeta_field_y) {
        this.io.setLongField(this, 5, gstvideoregionofinterestmeta_field_y);
        return this;
    }

    @Field(6)
    public long gstvideoregionofinterestmeta_field_w() {
        return this.io.getLongField(this, 6);
    }

    @Field(6)
    public GstVideoRegionOfInterestMeta gstvideoregionofinterestmeta_field_w(long gstvideoregionofinterestmeta_field_w) {
        this.io.setLongField(this, 6, gstvideoregionofinterestmeta_field_w);
        return this;
    }

    @Field(7)
    public long gstvideoregionofinterestmeta_field_h() {
        return this.io.getLongField(this, 7);
    }

    @Field(7)
    public GstVideoRegionOfInterestMeta gstvideoregionofinterestmeta_field_h(long gstvideoregionofinterestmeta_field_h) {
        this.io.setLongField(this, 7, gstvideoregionofinterestmeta_field_h);
        return this;
    }

    @Ptr
    protected static native long gst_video_region_of_interest_meta_get_info();

    public static Pointer<GstMetaInfo> get_info() {
        return Pointer.pointerToAddress(GstVideoRegionOfInterestMeta.gst_video_region_of_interest_meta_get_info(), GstMetaInfo.class);
    }

}
