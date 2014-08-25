
package generated.gstreamervideo10.gstvideo;

import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-video-1.0")
public class GstVideoFormatInfo
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstVideoFormatInfo() {
        super();
    }

    public GstVideoFormatInfo(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public IntValuedEnum<GstVideoFormat> gstvideoformatinfo_field_format() {
        return this.io.getEnumField(this, 0);
    }

    @Field(0)
    public GstVideoFormatInfo gstvideoformatinfo_field_format(IntValuedEnum<GstVideoFormat> gstvideoformatinfo_field_format) {
        this.io.setEnumField(this, 0, gstvideoformatinfo_field_format);
        return this;
    }

    @Field(1)
    public Pointer gstvideoformatinfo_field_name() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstVideoFormatInfo gstvideoformatinfo_field_name(Pointer gstvideoformatinfo_field_name) {
        this.io.setPointerField(this, 1, gstvideoformatinfo_field_name);
        return this;
    }

    @Field(2)
    public Pointer gstvideoformatinfo_field_description() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GstVideoFormatInfo gstvideoformatinfo_field_description(Pointer gstvideoformatinfo_field_description) {
        this.io.setPointerField(this, 2, gstvideoformatinfo_field_description);
        return this;
    }

    @Field(3)
    public IntValuedEnum<GstVideoFormatFlags> gstvideoformatinfo_field_flags() {
        return this.io.getEnumField(this, 3);
    }

    @Field(3)
    public GstVideoFormatInfo gstvideoformatinfo_field_flags(IntValuedEnum<GstVideoFormatFlags> gstvideoformatinfo_field_flags) {
        this.io.setEnumField(this, 3, gstvideoformatinfo_field_flags);
        return this;
    }

    @Field(4)
    public long gstvideoformatinfo_field_bits() {
        return this.io.getLongField(this, 4);
    }

    @Field(4)
    public GstVideoFormatInfo gstvideoformatinfo_field_bits(long gstvideoformatinfo_field_bits) {
        this.io.setLongField(this, 4, gstvideoformatinfo_field_bits);
        return this;
    }

    @Field(5)
    public long gstvideoformatinfo_field_n_components() {
        return this.io.getLongField(this, 5);
    }

    @Field(5)
    public GstVideoFormatInfo gstvideoformatinfo_field_n_components(long gstvideoformatinfo_field_n_components) {
        this.io.setLongField(this, 5, gstvideoformatinfo_field_n_components);
        return this;
    }

    @Field(6)
    public long gstvideoformatinfo_field_shift() {
        return this.io.getLongField(this, 6);
    }

    @Field(6)
    public GstVideoFormatInfo gstvideoformatinfo_field_shift(long gstvideoformatinfo_field_shift) {
        this.io.setLongField(this, 6, gstvideoformatinfo_field_shift);
        return this;
    }

    @Field(7)
    public long gstvideoformatinfo_field_depth() {
        return this.io.getLongField(this, 7);
    }

    @Field(7)
    public GstVideoFormatInfo gstvideoformatinfo_field_depth(long gstvideoformatinfo_field_depth) {
        this.io.setLongField(this, 7, gstvideoformatinfo_field_depth);
        return this;
    }

    @Field(8)
    public int gstvideoformatinfo_field_pixel_stride() {
        return this.io.getIntField(this, 8);
    }

    @Field(8)
    public GstVideoFormatInfo gstvideoformatinfo_field_pixel_stride(int gstvideoformatinfo_field_pixel_stride) {
        this.io.setIntField(this, 8, gstvideoformatinfo_field_pixel_stride);
        return this;
    }

    @Field(9)
    public long gstvideoformatinfo_field_n_planes() {
        return this.io.getLongField(this, 9);
    }

    @Field(9)
    public GstVideoFormatInfo gstvideoformatinfo_field_n_planes(long gstvideoformatinfo_field_n_planes) {
        this.io.setLongField(this, 9, gstvideoformatinfo_field_n_planes);
        return this;
    }

    @Field(10)
    public long gstvideoformatinfo_field_plane() {
        return this.io.getLongField(this, 10);
    }

    @Field(10)
    public GstVideoFormatInfo gstvideoformatinfo_field_plane(long gstvideoformatinfo_field_plane) {
        this.io.setLongField(this, 10, gstvideoformatinfo_field_plane);
        return this;
    }

    @Field(11)
    public long gstvideoformatinfo_field_poffset() {
        return this.io.getLongField(this, 11);
    }

    @Field(11)
    public GstVideoFormatInfo gstvideoformatinfo_field_poffset(long gstvideoformatinfo_field_poffset) {
        this.io.setLongField(this, 11, gstvideoformatinfo_field_poffset);
        return this;
    }

    @Field(12)
    public long gstvideoformatinfo_field_w_sub() {
        return this.io.getLongField(this, 12);
    }

    @Field(12)
    public GstVideoFormatInfo gstvideoformatinfo_field_w_sub(long gstvideoformatinfo_field_w_sub) {
        this.io.setLongField(this, 12, gstvideoformatinfo_field_w_sub);
        return this;
    }

    @Field(13)
    public long gstvideoformatinfo_field_h_sub() {
        return this.io.getLongField(this, 13);
    }

    @Field(13)
    public GstVideoFormatInfo gstvideoformatinfo_field_h_sub(long gstvideoformatinfo_field_h_sub) {
        this.io.setLongField(this, 13, gstvideoformatinfo_field_h_sub);
        return this;
    }

    @Field(14)
    public IntValuedEnum<GstVideoFormat> gstvideoformatinfo_field_unpack_format() {
        return this.io.getEnumField(this, 14);
    }

    @Field(14)
    public GstVideoFormatInfo gstvideoformatinfo_field_unpack_format(IntValuedEnum<GstVideoFormat> gstvideoformatinfo_field_unpack_format) {
        this.io.setEnumField(this, 14, gstvideoformatinfo_field_unpack_format);
        return this;
    }

    @Field(15)
    public Pointer gstvideoformatinfo_field__gst_reserved() {
        return this.io.getPointerField(this, 15);
    }

    @Field(15)
    public GstVideoFormatInfo gstvideoformatinfo_field__gst_reserved(Pointer gstvideoformatinfo_field__gst_reserved) {
        this.io.setPointerField(this, 15, gstvideoformatinfo_field__gst_reserved);
        return this;
    }

    @Field(16)
    public int gstvideoformatinfo_field_pack_lines() {
        return this.io.getIntField(this, 16);
    }

    @Field(16)
    public GstVideoFormatInfo gstvideoformatinfo_field_pack_lines(int gstvideoformatinfo_field_pack_lines) {
        this.io.setIntField(this, 16, gstvideoformatinfo_field_pack_lines);
        return this;
    }

    @Field(17)
    public Pointer gstvideoformatinfo_field_pack_func() {
        return this.io.getPointerField(this, 17);
    }

    @Field(17)
    public GstVideoFormatInfo gstvideoformatinfo_field_pack_func(Pointer gstvideoformatinfo_field_pack_func) {
        this.io.setPointerField(this, 17, gstvideoformatinfo_field_pack_func);
        return this;
    }

    @Field(18)
    public Pointer gstvideoformatinfo_field_unpack_func() {
        return this.io.getPointerField(this, 18);
    }

    @Field(18)
    public GstVideoFormatInfo gstvideoformatinfo_field_unpack_func(Pointer gstvideoformatinfo_field_unpack_func) {
        this.io.setPointerField(this, 18, gstvideoformatinfo_field_unpack_func);
        return this;
    }

}
