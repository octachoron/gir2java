
package generated.gstreamervideo10.gstvideo;

import generated.gstreamerbase10.gstbase.GstBaseTransform;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-video-1.0")
public class GstVideoFilter
    extends GstBaseTransform
{


    static {
        BridJ.register();
    }

    public GstVideoFilter() {
        super();
    }

    public GstVideoFilter(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GstBaseTransform gstvideofilter_field_element() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstVideoFilter gstvideofilter_field_element(GstBaseTransform gstvideofilter_field_element) {
        this.io.setNativeObjectField(this, 0, gstvideofilter_field_element);
        return this;
    }

    @Field(1)
    public boolean gstvideofilter_field_negotiated() {
        return this.io.getBooleanField(this, 1);
    }

    @Field(1)
    public GstVideoFilter gstvideofilter_field_negotiated(boolean gstvideofilter_field_negotiated) {
        this.io.setBooleanField(this, 1, gstvideofilter_field_negotiated);
        return this;
    }

    @Field(2)
    public GstVideoInfo gstvideofilter_field_out_info() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GstVideoFilter gstvideofilter_field_out_info(GstVideoInfo gstvideofilter_field_out_info) {
        this.io.setNativeObjectField(this, 2, gstvideofilter_field_out_info);
        return this;
    }

    @Field(3)
    private Pointer gstvideofilter_field__gst_reserved() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    private GstVideoFilter gstvideofilter_field__gst_reserved(Pointer gstvideofilter_field__gst_reserved) {
        this.io.setPointerField(this, 3, gstvideofilter_field__gst_reserved);
        return this;
    }

    @Field(4)
    public GstVideoInfo gstvideofilter_field_in_info() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    public GstVideoFilter gstvideofilter_field_in_info(GstVideoInfo gstvideofilter_field_in_info) {
        this.io.setNativeObjectField(this, 4, gstvideofilter_field_in_info);
        return this;
    }

}
