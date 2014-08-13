
package generated.gstreamervideo10.gstvideo;

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


    public GstVideoColorimetry() {
        super();
    }

    public GstVideoColorimetry(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public IntValuedEnum<GstVideoColorRange> field_range() {
        return this.io.getEnumField(this, 0);
    }

    @Field(0)
    public GstVideoColorimetry field_range(IntValuedEnum<GstVideoColorRange> field_range) {
        this.io.setEnumField(this, 0, field_range);
        return this;
    }

    @Field(1)
    public IntValuedEnum<GstVideoColorMatrix> field_matrix() {
        return this.io.getEnumField(this, 1);
    }

    @Field(1)
    public GstVideoColorimetry field_matrix(IntValuedEnum<GstVideoColorMatrix> field_matrix) {
        this.io.setEnumField(this, 1, field_matrix);
        return this;
    }

    @Ptr
    protected native long gst_video_colorimetry_to_string(
        @Ptr
        long cinfo);

    public Pointer to_string() {
        return Pointer.pointerToAddress(this.gst_video_colorimetry_to_string(Pointer.pointerTo(this, GstVideoColorimetry.class)));
    }

    protected native boolean gst_video_colorimetry_matches(
        @Ptr
        long cinfo,
        @Ptr
        long color);

    public boolean matches(Pointer color) {
        return this.gst_video_colorimetry_matches(Pointer.pointerTo(this, GstVideoColorimetry.class), Pointer.getPeer(color));
    }

    @Field(2)
    public IntValuedEnum<GstVideoColorPrimaries> field_primaries() {
        return this.io.getEnumField(this, 2);
    }

    @Field(2)
    public GstVideoColorimetry field_primaries(IntValuedEnum<GstVideoColorPrimaries> field_primaries) {
        this.io.setEnumField(this, 2, field_primaries);
        return this;
    }

    protected native boolean gst_video_colorimetry_from_string(
        @Ptr
        long cinfo,
        @Ptr
        long color);

    public boolean from_string(Pointer color) {
        return this.gst_video_colorimetry_from_string(Pointer.pointerTo(this, GstVideoColorimetry.class), Pointer.getPeer(color));
    }

    @Field(3)
    public IntValuedEnum<GstVideoTransferFunction> field_transfer() {
        return this.io.getEnumField(this, 3);
    }

    @Field(3)
    public GstVideoColorimetry field_transfer(IntValuedEnum<GstVideoTransferFunction> field_transfer) {
        this.io.setEnumField(this, 3, field_transfer);
        return this;
    }

}
