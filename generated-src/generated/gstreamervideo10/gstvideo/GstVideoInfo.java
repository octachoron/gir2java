
package generated.gstreamervideo10.gstvideo;

import generated.gstreamer10.gst.GstCaps;
import generated.gstreamer10.gst.GstFormat;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-video-1.0")
public class GstVideoInfo
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstVideoInfo() {
        super();
    }

    public GstVideoInfo(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer<GstVideoFormatInfo> gstvideoinfo_field_finfo() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GstVideoInfo gstvideoinfo_field_finfo(Pointer<GstVideoFormatInfo> gstvideoinfo_field_finfo) {
        this.io.setPointerField(this, 0, gstvideoinfo_field_finfo);
        return this;
    }

    @Ptr
    protected native long gst_video_info_to_caps(
        @Ptr
        long info);

    public Pointer<GstCaps> to_caps() {
        return Pointer.pointerToAddress(this.gst_video_info_to_caps(Pointer.pointerTo(this, GstVideoInfo.class).getPeer()), GstCaps.class);
    }

    @Field(1)
    public IntValuedEnum<GstVideoInterlaceMode> gstvideoinfo_field_interlace_mode() {
        return this.io.getEnumField(this, 1);
    }

    @Field(1)
    public GstVideoInfo gstvideoinfo_field_interlace_mode(IntValuedEnum<GstVideoInterlaceMode> gstvideoinfo_field_interlace_mode) {
        this.io.setEnumField(this, 1, gstvideoinfo_field_interlace_mode);
        return this;
    }

    @Field(2)
    public int gstvideoinfo_field_width() {
        return this.io.getIntField(this, 2);
    }

    @Field(2)
    public GstVideoInfo gstvideoinfo_field_width(int gstvideoinfo_field_width) {
        this.io.setIntField(this, 2, gstvideoinfo_field_width);
        return this;
    }

    @Field(3)
    public int gstvideoinfo_field_height() {
        return this.io.getIntField(this, 3);
    }

    @Field(3)
    public GstVideoInfo gstvideoinfo_field_height(int gstvideoinfo_field_height) {
        this.io.setIntField(this, 3, gstvideoinfo_field_height);
        return this;
    }

    @Field(4)
    public int gstvideoinfo_field_par_n() {
        return this.io.getIntField(this, 4);
    }

    @Field(4)
    public GstVideoInfo gstvideoinfo_field_par_n(int gstvideoinfo_field_par_n) {
        this.io.setIntField(this, 4, gstvideoinfo_field_par_n);
        return this;
    }

    protected native void gst_video_info_init(
        @Ptr
        long info);

    public void init() {
        this.gst_video_info_init(Pointer.pointerTo(this, GstVideoInfo.class).getPeer());
    }

    @Field(5)
    private Pointer gstvideoinfo_field__gst_reserved() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    private GstVideoInfo gstvideoinfo_field__gst_reserved(Pointer gstvideoinfo_field__gst_reserved) {
        this.io.setPointerField(this, 5, gstvideoinfo_field__gst_reserved);
        return this;
    }

    @Field(6)
    public int gstvideoinfo_field_stride() {
        return this.io.getIntField(this, 6);
    }

    @Field(6)
    public GstVideoInfo gstvideoinfo_field_stride(int gstvideoinfo_field_stride) {
        this.io.setIntField(this, 6, gstvideoinfo_field_stride);
        return this;
    }

    protected native boolean gst_video_info_is_equal(
        @Ptr
        long info,
        @Ptr
        long other);

    public boolean is_equal(Pointer<GstVideoInfo> other) {
        return this.gst_video_info_is_equal(Pointer.pointerTo(this, GstVideoInfo.class).getPeer(), Pointer.getPeer(other));
    }

    @Field(7)
    public long gstvideoinfo_field_size() {
        return this.io.getLongField(this, 7);
    }

    @Field(7)
    public GstVideoInfo gstvideoinfo_field_size(long gstvideoinfo_field_size) {
        this.io.setLongField(this, 7, gstvideoinfo_field_size);
        return this;
    }

    @Field(8)
    public long gstvideoinfo_field_offset() {
        return this.io.getLongField(this, 8);
    }

    @Field(8)
    public GstVideoInfo gstvideoinfo_field_offset(long gstvideoinfo_field_offset) {
        this.io.setLongField(this, 8, gstvideoinfo_field_offset);
        return this;
    }

    @Field(9)
    public IntValuedEnum<GstVideoFlags> gstvideoinfo_field_flags() {
        return this.io.getEnumField(this, 9);
    }

    @Field(9)
    public GstVideoInfo gstvideoinfo_field_flags(IntValuedEnum<GstVideoFlags> gstvideoinfo_field_flags) {
        this.io.setEnumField(this, 9, gstvideoinfo_field_flags);
        return this;
    }

    @Field(10)
    public GstVideoColorimetry gstvideoinfo_field_colorimetry() {
        return this.io.getNativeObjectField(this, 10);
    }

    @Field(10)
    public GstVideoInfo gstvideoinfo_field_colorimetry(GstVideoColorimetry gstvideoinfo_field_colorimetry) {
        this.io.setNativeObjectField(this, 10, gstvideoinfo_field_colorimetry);
        return this;
    }

    protected native boolean gst_video_info_convert(
        @Ptr
        long info, IntValuedEnum<GstFormat> src_format, long src_value, IntValuedEnum<GstFormat> dest_format,
        @Ptr
        long dest_value);

    public boolean convert(IntValuedEnum<GstFormat> src_format, long src_value, IntValuedEnum<GstFormat> dest_format, Pointer<Long> dest_value) {
        return this.gst_video_info_convert(Pointer.pointerTo(this, GstVideoInfo.class).getPeer(), src_format, src_value, dest_format, Pointer.getPeer(dest_value));
    }

    @Field(11)
    public int gstvideoinfo_field_fps_n() {
        return this.io.getIntField(this, 11);
    }

    @Field(11)
    public GstVideoInfo gstvideoinfo_field_fps_n(int gstvideoinfo_field_fps_n) {
        this.io.setIntField(this, 11, gstvideoinfo_field_fps_n);
        return this;
    }

    @Field(12)
    public int gstvideoinfo_field_fps_d() {
        return this.io.getIntField(this, 12);
    }

    @Field(12)
    public GstVideoInfo gstvideoinfo_field_fps_d(int gstvideoinfo_field_fps_d) {
        this.io.setIntField(this, 12, gstvideoinfo_field_fps_d);
        return this;
    }

    @Field(13)
    public int gstvideoinfo_field_par_d() {
        return this.io.getIntField(this, 13);
    }

    @Field(13)
    public GstVideoInfo gstvideoinfo_field_par_d(int gstvideoinfo_field_par_d) {
        this.io.setIntField(this, 13, gstvideoinfo_field_par_d);
        return this;
    }

    protected native void gst_video_info_align(
        @Ptr
        long info,
        @Ptr
        long align);

    public void align(Pointer<GstVideoAlignment> align) {
        this.gst_video_info_align(Pointer.pointerTo(this, GstVideoInfo.class).getPeer(), Pointer.getPeer(align));
    }

    protected native boolean gst_video_info_from_caps(
        @Ptr
        long info,
        @Ptr
        long caps);

    public boolean from_caps(Pointer<GstCaps> caps) {
        return this.gst_video_info_from_caps(Pointer.pointerTo(this, GstVideoInfo.class).getPeer(), Pointer.getPeer(caps));
    }

    @Field(14)
    public int gstvideoinfo_field_views() {
        return this.io.getIntField(this, 14);
    }

    @Field(14)
    public GstVideoInfo gstvideoinfo_field_views(int gstvideoinfo_field_views) {
        this.io.setIntField(this, 14, gstvideoinfo_field_views);
        return this;
    }

    @Field(15)
    public IntValuedEnum<GstVideoChromaSite> gstvideoinfo_field_chroma_site() {
        return this.io.getEnumField(this, 15);
    }

    @Field(15)
    public GstVideoInfo gstvideoinfo_field_chroma_site(IntValuedEnum<GstVideoChromaSite> gstvideoinfo_field_chroma_site) {
        this.io.setEnumField(this, 15, gstvideoinfo_field_chroma_site);
        return this;
    }

    protected native void gst_video_info_set_format(
        @Ptr
        long info, IntValuedEnum<GstVideoFormat> format, long width, long height);

    public void set_format(IntValuedEnum<GstVideoFormat> format, long width, long height) {
        this.gst_video_info_set_format(Pointer.pointerTo(this, GstVideoInfo.class).getPeer(), format, width, height);
    }

}
