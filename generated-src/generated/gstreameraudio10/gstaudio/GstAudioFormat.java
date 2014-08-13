
package generated.gstreameraudio10.gstaudio;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Ptr;

public enum GstAudioFormat
    implements IntValuedEnum<GstAudioFormat>
{

    GST_AUDIO_FORMAT_UNKNOWN(0L),
    GST_AUDIO_FORMAT_ENCODED(1L),
    GST_AUDIO_FORMAT_S8(2L),
    GST_AUDIO_FORMAT_U8(3L),
    GST_AUDIO_FORMAT_S16LE(4L),
    GST_AUDIO_FORMAT_S16BE(5L),
    GST_AUDIO_FORMAT_U16LE(6L),
    GST_AUDIO_FORMAT_U16BE(7L),
    GST_AUDIO_FORMAT_S24_32LE(8L),
    GST_AUDIO_FORMAT_S24_32BE(9L),
    GST_AUDIO_FORMAT_U24_32LE(10L),
    GST_AUDIO_FORMAT_U24_32BE(11L),
    GST_AUDIO_FORMAT_S32LE(12L),
    GST_AUDIO_FORMAT_S32BE(13L),
    GST_AUDIO_FORMAT_U32LE(14L),
    GST_AUDIO_FORMAT_U32BE(15L),
    GST_AUDIO_FORMAT_S24LE(16L),
    GST_AUDIO_FORMAT_S24BE(17L),
    GST_AUDIO_FORMAT_U24LE(18L),
    GST_AUDIO_FORMAT_U24BE(19L),
    GST_AUDIO_FORMAT_S20LE(20L),
    GST_AUDIO_FORMAT_S20BE(21L),
    GST_AUDIO_FORMAT_U20LE(22L),
    GST_AUDIO_FORMAT_U20BE(23L),
    GST_AUDIO_FORMAT_S18LE(24L),
    GST_AUDIO_FORMAT_S18BE(25L),
    GST_AUDIO_FORMAT_U18LE(26L),
    GST_AUDIO_FORMAT_U18BE(27L),
    GST_AUDIO_FORMAT_F32LE(28L),
    GST_AUDIO_FORMAT_F32BE(29L),
    GST_AUDIO_FORMAT_F64LE(30L),
    GST_AUDIO_FORMAT_F64BE(31L),
    GST_AUDIO_FORMAT_S16(4L),
    GST_AUDIO_FORMAT_U16(6L),
    GST_AUDIO_FORMAT_S24_32(8L),
    GST_AUDIO_FORMAT_U24_32(10L),
    GST_AUDIO_FORMAT_S32(12L),
    GST_AUDIO_FORMAT_U32(14L),
    GST_AUDIO_FORMAT_S24(16L),
    GST_AUDIO_FORMAT_U24(18L),
    GST_AUDIO_FORMAT_S20(20L),
    GST_AUDIO_FORMAT_U20(22L),
    GST_AUDIO_FORMAT_S18(24L),
    GST_AUDIO_FORMAT_U18(26L),
    GST_AUDIO_FORMAT_F32(28L),
    GST_AUDIO_FORMAT_F64(30L);
    public final long value;

    GstAudioFormat(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstAudioFormat> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstAudioFormat> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

    protected native void gst_audio_format_fill_silence(
        @Ptr
        long info,
        @Ptr
        long dest, long length);

    public void fill_silence(Pointer info, short dest, long length) {
        this.gst_audio_format_fill_silence(Pointer.getPeer(info), Pointer.getPeer(dest), length);
    }

    @Ptr
    protected native long gst_audio_format_to_string(IntValuedEnum<GstAudioFormat> format);

    public Pointer to_string(IntValuedEnum<GstAudioFormat> format) {
        return Pointer.pointerToAddress(this.gst_audio_format_to_string(format));
    }

    @Ptr
    protected native long gst_audio_format_get_info(IntValuedEnum<GstAudioFormat> format);

    public Pointer<GstAudioFormatInfo> get_info(IntValuedEnum<GstAudioFormat> format) {
        return Pointer.pointerToAddress(this.gst_audio_format_get_info(format), Pointer.class);
    }

    public native IntValuedEnum<GstAudioFormat> gst_audio_format_build_integer(boolean sign, int endianness, int width, int depth);

    protected native IntValuedEnum<GstAudioFormat> gst_audio_format_from_string(
        @Ptr
        long format);

    public IntValuedEnum<GstAudioFormat> from_string(Pointer format) {
        return this.gst_audio_format_from_string(Pointer.getPeer(format));
    }

}
