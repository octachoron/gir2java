
package generated.gstreamervideo10.gstvideo;

import generated.gstreamer10.gst.GstCaps;
import generated.gstreamer10.gst.GstFormat;
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


    public GstVideoInfo() {
        super();
    }

    public GstVideoInfo(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer<GstVideoFormatInfo> field_finfo() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GstVideoInfo field_finfo(Pointer<GstVideoFormatInfo> field_finfo) {
        this.io.setPointerField(this, 0, field_finfo);
        return this;
    }

    @Field(1)
    public int field_fps_d() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GstVideoInfo field_fps_d(int field_fps_d) {
        this.io.setNativeObjectField(this, 1, field_fps_d);
        return this;
    }

    @Field(2)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GstVideoInfo field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 2, field__gst_reserved);
        return this;
    }

    protected native void gst_video_info_align(
        @Ptr
        long info,
        @Ptr
        long align);

    public void align(Pointer<GstVideoAlignment> align) {
        this.gst_video_info_align(Pointer.pointerTo(this, GstVideoInfo.class), Pointer.getPeer(align));
    }

    protected native boolean gst_video_info_from_caps(
        @Ptr
        long info,
        @Ptr
        long caps);

    public boolean from_caps(Pointer<GstCaps> caps) {
        return this.gst_video_info_from_caps(Pointer.pointerTo(this, GstVideoInfo.class), Pointer.getPeer(caps));
    }

    protected native boolean gst_video_info_convert(
        @Ptr
        long info, IntValuedEnum<GstFormat> src_format, long src_value, IntValuedEnum<GstFormat> dest_format,
        @Ptr
        long dest_value);

    public boolean convert(IntValuedEnum<GstFormat> src_format, long src_value, IntValuedEnum<GstFormat> dest_format, Pointer<Long> dest_value) {
        return this.gst_video_info_convert(Pointer.pointerTo(this, GstVideoInfo.class), src_format, src_value, dest_format, Pointer.getPeer(dest_value));
    }

    protected native void gst_video_info_set_format(
        @Ptr
        long info, IntValuedEnum<GstVideoFormat> format, long width, long height);

    public void set_format(IntValuedEnum<GstVideoFormat> format, long width, long height) {
        this.gst_video_info_set_format(Pointer.pointerTo(this, GstVideoInfo.class), format, width, height);
    }

    @Field(3)
    public int field_par_n() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GstVideoInfo field_par_n(int field_par_n) {
        this.io.setNativeObjectField(this, 3, field_par_n);
        return this;
    }

    @Field(4)
    public Object field_flags() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    public GstVideoInfo field_flags(Object field_flags) {
        this.io.setNativeObjectField(this, 4, field_flags);
        return this;
    }

    @Field(5)
    public long field_size() {
        return this.io.getNativeObjectField(this, 5);
    }

    @Field(5)
    public GstVideoInfo field_size(long field_size) {
        this.io.setNativeObjectField(this, 5, field_size);
        return this;
    }

    protected native boolean gst_video_info_is_equal(
        @Ptr
        long info,
        @Ptr
        long other);

    public boolean is_equal(Pointer<GstVideoInfo> other) {
        return this.gst_video_info_is_equal(Pointer.pointerTo(this, GstVideoInfo.class), Pointer.getPeer(other));
    }

    @Field(6)
    public int field_height() {
        return this.io.getNativeObjectField(this, 6);
    }

    @Field(6)
    public GstVideoInfo field_height(int field_height) {
        this.io.setNativeObjectField(this, 6, field_height);
        return this;
    }

    protected native void gst_video_info_init(
        @Ptr
        long info);

    public void init() {
        this.gst_video_info_init(Pointer.pointerTo(this, GstVideoInfo.class));
    }

    @Ptr
    protected native long gst_video_info_to_caps(
        @Ptr
        long info);

    public Pointer<GstCaps> to_caps() {
        return Pointer.pointerToAddress(this.gst_video_info_to_caps(Pointer.pointerTo(this, GstVideoInfo.class)), Pointer.class);
    }

    @Field(7)
    public int field_fps_n() {
        return this.io.getNativeObjectField(this, 7);
    }

    @Field(7)
    public GstVideoInfo field_fps_n(int field_fps_n) {
        this.io.setNativeObjectField(this, 7, field_fps_n);
        return this;
    }

    @Field(8)
    public int field_width() {
        return this.io.getNativeObjectField(this, 8);
    }

    @Field(8)
    public GstVideoInfo field_width(int field_width) {
        this.io.setNativeObjectField(this, 8, field_width);
        return this;
    }

    @Field(9)
    public GstVideoColorimetry field_colorimetry() {
        return this.io.getNativeObjectField(this, 9);
    }

    @Field(9)
    public GstVideoInfo field_colorimetry(GstVideoColorimetry field_colorimetry) {
        this.io.setNativeObjectField(this, 9, field_colorimetry);
        return this;
    }

    @Field(10)
    public int field_views() {
        return this.io.getNativeObjectField(this, 10);
    }

    @Field(10)
    public GstVideoInfo field_views(int field_views) {
        this.io.setNativeObjectField(this, 10, field_views);
        return this;
    }

    @Field(11)
    public Object field_chroma_site() {
        return this.io.getNativeObjectField(this, 11);
    }

    @Field(11)
    public GstVideoInfo field_chroma_site(Object field_chroma_site) {
        this.io.setNativeObjectField(this, 11, field_chroma_site);
        return this;
    }

    @Field(12)
    public int field_par_d() {
        return this.io.getNativeObjectField(this, 12);
    }

    @Field(12)
    public GstVideoInfo field_par_d(int field_par_d) {
        this.io.setNativeObjectField(this, 12, field_par_d);
        return this;
    }

    @Field(13)
    public int field_stride() {
        return this.io.getPointerField(this, 13);
    }

    @Field(13)
    public GstVideoInfo field_stride(int field_stride) {
        this.io.setPointerField(this, 13, field_stride);
        return this;
    }

    @Field(14)
    public IntValuedEnum<GstVideoInterlaceMode> field_interlace_mode() {
        return this.io.getEnumField(this, 14);
    }

    @Field(14)
    public GstVideoInfo field_interlace_mode(IntValuedEnum<GstVideoInterlaceMode> field_interlace_mode) {
        this.io.setEnumField(this, 14, field_interlace_mode);
        return this;
    }

    @Field(15)
    public long field_offset() {
        return this.io.getPointerField(this, 15);
    }

    @Field(15)
    public GstVideoInfo field_offset(long field_offset) {
        this.io.setPointerField(this, 15, field_offset);
        return this;
    }

}
