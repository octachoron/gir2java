
package generated.gstreamervideo10.gstvideo;

import generated.gstreamerbase10.gstbase.GstBaseTransform;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-video-1.0")
public class GstVideoFilter
    extends GstBaseTransform
{


    public GstVideoFilter() {
        super();
    }

    public GstVideoFilter(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GstBaseTransform field_element() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstVideoFilter field_element(GstBaseTransform field_element) {
        this.io.setNativeObjectField(this, 0, field_element);
        return this;
    }

    @Field(1)
    public boolean field_negotiated() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GstVideoFilter field_negotiated(boolean field_negotiated) {
        this.io.setNativeObjectField(this, 1, field_negotiated);
        return this;
    }

    @Field(2)
    public GstVideoInfo field_out_info() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GstVideoFilter field_out_info(GstVideoInfo field_out_info) {
        this.io.setNativeObjectField(this, 2, field_out_info);
        return this;
    }

    @Field(3)
    public GstVideoInfo field_in_info() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GstVideoFilter field_in_info(GstVideoInfo field_in_info) {
        this.io.setNativeObjectField(this, 3, field_in_info);
        return this;
    }

    @Field(4)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public GstVideoFilter field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 4, field__gst_reserved);
        return this;
    }

}
