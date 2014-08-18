
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
    public GstMeta field_meta() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstVideoRegionOfInterestMeta field_meta(GstMeta field_meta) {
        this.io.setNativeObjectField(this, 0, field_meta);
        return this;
    }

    @Field(1)
    public long field_roi_type() {
        return this.io.getLongField(this, 1);
    }

    @Field(1)
    public GstVideoRegionOfInterestMeta field_roi_type(long field_roi_type) {
        this.io.setLongField(this, 1, field_roi_type);
        return this;
    }

    @Field(2)
    public int field_id() {
        return this.io.getIntField(this, 2);
    }

    @Field(2)
    public GstVideoRegionOfInterestMeta field_id(int field_id) {
        this.io.setIntField(this, 2, field_id);
        return this;
    }

    @Field(3)
    public int field_parent_id() {
        return this.io.getIntField(this, 3);
    }

    @Field(3)
    public GstVideoRegionOfInterestMeta field_parent_id(int field_parent_id) {
        this.io.setIntField(this, 3, field_parent_id);
        return this;
    }

    @Field(4)
    public long field_x() {
        return this.io.getLongField(this, 4);
    }

    @Field(4)
    public GstVideoRegionOfInterestMeta field_x(long field_x) {
        this.io.setLongField(this, 4, field_x);
        return this;
    }

    @Field(5)
    public long field_y() {
        return this.io.getLongField(this, 5);
    }

    @Field(5)
    public GstVideoRegionOfInterestMeta field_y(long field_y) {
        this.io.setLongField(this, 5, field_y);
        return this;
    }

    @Field(6)
    public long field_w() {
        return this.io.getLongField(this, 6);
    }

    @Field(6)
    public GstVideoRegionOfInterestMeta field_w(long field_w) {
        this.io.setLongField(this, 6, field_w);
        return this;
    }

    @Field(7)
    public long field_h() {
        return this.io.getLongField(this, 7);
    }

    @Field(7)
    public GstVideoRegionOfInterestMeta field_h(long field_h) {
        this.io.setLongField(this, 7, field_h);
        return this;
    }

    @Ptr
    protected static native long gst_video_region_of_interest_meta_get_info();

    public static Pointer<GstMetaInfo> get_info() {
        return Pointer.pointerToAddress(GstVideoRegionOfInterestMeta.gst_video_region_of_interest_meta_get_info(), GstMetaInfo.class);
    }

}
