
package generated.gstreamervideo10.gstvideo;

import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-video-1.0")
public class GstVideoColorimetry
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstVideoColorimetry() {
        super();
    }

    public GstVideoColorimetry(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public IntValuedEnum<GstVideoColorRange> gstvideocolorimetry_field_range() {
        return this.io.getEnumField(this, 0);
    }

    @Field(0)
    public GstVideoColorimetry gstvideocolorimetry_field_range(IntValuedEnum<GstVideoColorRange> gstvideocolorimetry_field_range) {
        this.io.setEnumField(this, 0, gstvideocolorimetry_field_range);
        return this;
    }

    @Field(1)
    public IntValuedEnum<GstVideoColorMatrix> gstvideocolorimetry_field_matrix() {
        return this.io.getEnumField(this, 1);
    }

    @Field(1)
    public GstVideoColorimetry gstvideocolorimetry_field_matrix(IntValuedEnum<GstVideoColorMatrix> gstvideocolorimetry_field_matrix) {
        this.io.setEnumField(this, 1, gstvideocolorimetry_field_matrix);
        return this;
    }

    @Ptr
    protected native long gst_video_colorimetry_to_string(
        @Ptr
        long cinfo);

    public Pointer to_string() {
        return Pointer.pointerToAddress(this.gst_video_colorimetry_to_string(Pointer.pointerTo(this, GstVideoColorimetry.class).getPeer()));
    }

    @Field(2)
    public IntValuedEnum<GstVideoColorPrimaries> gstvideocolorimetry_field_primaries() {
        return this.io.getEnumField(this, 2);
    }

    @Field(2)
    public GstVideoColorimetry gstvideocolorimetry_field_primaries(IntValuedEnum<GstVideoColorPrimaries> gstvideocolorimetry_field_primaries) {
        this.io.setEnumField(this, 2, gstvideocolorimetry_field_primaries);
        return this;
    }

    protected native boolean gst_video_colorimetry_from_string(
        @Ptr
        long cinfo,
        @Ptr
        long color);

    public boolean from_string(Pointer color) {
        return this.gst_video_colorimetry_from_string(Pointer.pointerTo(this, GstVideoColorimetry.class).getPeer(), Pointer.getPeer(color));
    }

    protected native boolean gst_video_colorimetry_matches(
        @Ptr
        long cinfo,
        @Ptr
        long color);

    public boolean matches(Pointer color) {
        return this.gst_video_colorimetry_matches(Pointer.pointerTo(this, GstVideoColorimetry.class).getPeer(), Pointer.getPeer(color));
    }

    @Field(3)
    public IntValuedEnum<GstVideoTransferFunction> gstvideocolorimetry_field_transfer() {
        return this.io.getEnumField(this, 3);
    }

    @Field(3)
    public GstVideoColorimetry gstvideocolorimetry_field_transfer(IntValuedEnum<GstVideoTransferFunction> gstvideocolorimetry_field_transfer) {
        this.io.setEnumField(this, 3, gstvideocolorimetry_field_transfer);
        return this;
    }

}
