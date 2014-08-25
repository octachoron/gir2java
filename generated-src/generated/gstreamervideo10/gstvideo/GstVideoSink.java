
package generated.gstreamervideo10.gstvideo;

import generated.gstreamerbase10.gstbase.GstBaseSink;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-video-1.0")
public class GstVideoSink
    extends GstBaseSink
{


    static {
        BridJ.register();
    }

    public GstVideoSink() {
        super();
    }

    public GstVideoSink(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GstBaseSink gstvideosink_field_element() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstVideoSink gstvideosink_field_element(GstBaseSink gstvideosink_field_element) {
        this.io.setNativeObjectField(this, 0, gstvideosink_field_element);
        return this;
    }

    @Field(1)
    public int gstvideosink_field_width() {
        return this.io.getIntField(this, 1);
    }

    @Field(1)
    public GstVideoSink gstvideosink_field_width(int gstvideosink_field_width) {
        this.io.setIntField(this, 1, gstvideosink_field_width);
        return this;
    }

    @Field(2)
    public int gstvideosink_field_height() {
        return this.io.getIntField(this, 2);
    }

    @Field(2)
    public GstVideoSink gstvideosink_field_height(int gstvideosink_field_height) {
        this.io.setIntField(this, 2, gstvideosink_field_height);
        return this;
    }

    @Field(3)
    private Pointer gstvideosink_field_priv() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    private GstVideoSink gstvideosink_field_priv(Pointer gstvideosink_field_priv) {
        this.io.setPointerField(this, 3, gstvideosink_field_priv);
        return this;
    }

    @Field(4)
    private Pointer gstvideosink_field__gst_reserved() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    private GstVideoSink gstvideosink_field__gst_reserved(Pointer gstvideosink_field__gst_reserved) {
        this.io.setPointerField(this, 4, gstvideosink_field__gst_reserved);
        return this;
    }

}
