
package generated.gstreamervideo10.gstvideo;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Ptr;

public enum GstVideoFormat implements IntValuedEnum<GstVideoFormat>
{

    GST_VIDEO_FORMAT_UNKNOWN(0L),
    GST_VIDEO_FORMAT_ENCODED(1L),
    GST_VIDEO_FORMAT_I420(2L),
    GST_VIDEO_FORMAT_YV12(3L),
    GST_VIDEO_FORMAT_YUY2(4L),
    GST_VIDEO_FORMAT_UYVY(5L),
    GST_VIDEO_FORMAT_AYUV(6L),
    GST_VIDEO_FORMAT_RGBX(7L),
    GST_VIDEO_FORMAT_BGRX(8L),
    GST_VIDEO_FORMAT_XRGB(9L),
    GST_VIDEO_FORMAT_XBGR(10L),
    GST_VIDEO_FORMAT_RGBA(11L),
    GST_VIDEO_FORMAT_BGRA(12L),
    GST_VIDEO_FORMAT_ARGB(13L),
    GST_VIDEO_FORMAT_ABGR(14L),
    GST_VIDEO_FORMAT_RGB(15L),
    GST_VIDEO_FORMAT_BGR(16L),
    GST_VIDEO_FORMAT_Y41B(17L),
    GST_VIDEO_FORMAT_Y42B(18L),
    GST_VIDEO_FORMAT_YVYU(19L),
    GST_VIDEO_FORMAT_Y444(20L),
    GST_VIDEO_FORMAT_V210(21L),
    GST_VIDEO_FORMAT_V216(22L),
    GST_VIDEO_FORMAT_NV12(23L),
    GST_VIDEO_FORMAT_NV21(24L),
    GST_VIDEO_FORMAT_GRAY8(25L),
    GST_VIDEO_FORMAT_GRAY16_BE(26L),
    GST_VIDEO_FORMAT_GRAY16_LE(27L),
    GST_VIDEO_FORMAT_V308(28L),
    GST_VIDEO_FORMAT_RGB16(29L),
    GST_VIDEO_FORMAT_BGR16(30L),
    GST_VIDEO_FORMAT_RGB15(31L),
    GST_VIDEO_FORMAT_BGR15(32L),
    GST_VIDEO_FORMAT_UYVP(33L),
    GST_VIDEO_FORMAT_A420(34L),
    GST_VIDEO_FORMAT_RGB8P(35L),
    GST_VIDEO_FORMAT_YUV9(36L),
    GST_VIDEO_FORMAT_YVU9(37L),
    GST_VIDEO_FORMAT_IYU1(38L),
    GST_VIDEO_FORMAT_ARGB64(39L),
    GST_VIDEO_FORMAT_AYUV64(40L),
    GST_VIDEO_FORMAT_R210(41L),
    GST_VIDEO_FORMAT_I420_10BE(42L),
    GST_VIDEO_FORMAT_I420_10LE(43L),
    GST_VIDEO_FORMAT_I422_10BE(44L),
    GST_VIDEO_FORMAT_I422_10LE(45L),
    GST_VIDEO_FORMAT_Y444_10BE(46L),
    GST_VIDEO_FORMAT_Y444_10LE(47L),
    GST_VIDEO_FORMAT_GBR(48L),
    GST_VIDEO_FORMAT_GBR_10BE(49L),
    GST_VIDEO_FORMAT_GBR_10LE(50L),
    GST_VIDEO_FORMAT_NV16(51L),
    GST_VIDEO_FORMAT_NV24(52L);
    public final long value;

    GstVideoFormat(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstVideoFormat> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstVideoFormat> fromValue(int value) {
        return FlagSet.fromValue(value, GstVideoFormat.values());
    }

    @Ptr
    protected static native long gst_video_format_get_info(IntValuedEnum<GstVideoFormat> format);

    public static Pointer<GstVideoFormatInfo> get_info(IntValuedEnum<GstVideoFormat> format) {
        return Pointer.pointerToAddress(GstVideoFormat.gst_video_format_get_info(format), GstVideoFormatInfo.class);
    }

    protected static native IntValuedEnum<GstVideoFormat> gst_video_format_from_string(
        @Ptr
        long format);

    public static IntValuedEnum<GstVideoFormat> from_string(Pointer format) {
        return GstVideoFormat.gst_video_format_from_string(Pointer.getPeer(format));
    }

    public static native IntValuedEnum<GstVideoFormat> gst_video_format_from_masks(int depth, int bpp, int endianness, long red_mask, long green_mask, long blue_mask, long alpha_mask);

    public static native long gst_video_format_to_fourcc(IntValuedEnum<GstVideoFormat> format);

    public static native IntValuedEnum<GstVideoFormat> gst_video_format_from_fourcc(long fourcc);

    @Ptr
    protected static native long gst_video_format_get_palette(IntValuedEnum<GstVideoFormat> format,
        @Ptr
        long size);

    public static Pointer get_palette(IntValuedEnum<GstVideoFormat> format, Pointer<Long> size) {
        return Pointer.pointerToAddress(GstVideoFormat.gst_video_format_get_palette(format, Pointer.getPeer(size)));
    }

    @Ptr
    protected static native long gst_video_format_to_string(IntValuedEnum<GstVideoFormat> format);

    public static Pointer to_string(IntValuedEnum<GstVideoFormat> format) {
        return Pointer.pointerToAddress(GstVideoFormat.gst_video_format_to_string(format));
    }

}
