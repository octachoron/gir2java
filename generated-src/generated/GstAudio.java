
package generated;

import generated.gstreamer10.gst.GstBuffer;
import generated.gstreamer10.gst.GstMetaInfo;
import generated.gstreamer10.gst.GstSegment;
import generated.gstreameraudio10.gstaudio.GstAudioChannelPosition;
import generated.gstreameraudio10.gstaudio.GstAudioDownmixMeta;
import generated.gstreameraudio10.gstaudio.GstAudioFormat;
import generated.gstreameraudio10.gstaudio.GstAudioFormatInfo;
import generated.gstreameraudio10.gstaudio.GstAudioRingBufferSpec;
import generated.gstreameraudio10.gstaudio.GstStreamVolumeFormat;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Ptr;

public class GstAudio {


    @Ptr
    protected native long gst_audio_buffer_clip(
        @Ptr
        long buffer,
        @Ptr
        long segment, int rate, int bpf);

    public Pointer<GstBuffer> audio_buffer_clip(Pointer<GstBuffer> buffer, Pointer<GstSegment> segment, int rate, int bpf) {
        return Pointer.pointerToAddress(this.gst_audio_buffer_clip(Pointer.getPeer(buffer), Pointer.getPeer(segment), rate, bpf), Pointer.class);
    }

    protected native boolean gst_audio_buffer_reorder_channels(
        @Ptr
        long buffer, IntValuedEnum<GstAudioFormat> format, int channels,
        @Ptr
        long from,
        @Ptr
        long to);

    public boolean audio_buffer_reorder_channels(Pointer<GstBuffer> buffer, IntValuedEnum<GstAudioFormat> format, int channels, IntValuedEnum<GstAudioChannelPosition> from, IntValuedEnum<GstAudioChannelPosition> to) {
        return this.gst_audio_buffer_reorder_channels(Pointer.getPeer(buffer), format, channels, Pointer.getPeer(from), Pointer.getPeer(to));
    }

    protected native boolean gst_audio_channel_positions_from_mask(int channels, long channel_mask,
        @Ptr
        long position);

    public boolean audio_channel_positions_from_mask(int channels, long channel_mask, IntValuedEnum<GstAudioChannelPosition> position) {
        return this.gst_audio_channel_positions_from_mask(channels, channel_mask, Pointer.getPeer(position));
    }

    protected native boolean gst_audio_channel_positions_to_mask(
        @Ptr
        long position, int channels, boolean force_order,
        @Ptr
        long channel_mask);

    public boolean audio_channel_positions_to_mask(IntValuedEnum<GstAudioChannelPosition> position, int channels, boolean force_order, long channel_mask) {
        return this.gst_audio_channel_positions_to_mask(Pointer.getPeer(position), channels, force_order, Pointer.getPeer(channel_mask));
    }

    protected native boolean gst_audio_channel_positions_to_valid_order(
        @Ptr
        long position, int channels);

    public boolean audio_channel_positions_to_valid_order(IntValuedEnum<GstAudioChannelPosition> position, int channels) {
        return this.gst_audio_channel_positions_to_valid_order(Pointer.getPeer(position), channels);
    }

    protected native boolean gst_audio_check_valid_channel_positions(
        @Ptr
        long position, int channels, boolean force_order);

    public boolean audio_check_valid_channel_positions(IntValuedEnum<GstAudioChannelPosition> position, int channels, boolean force_order) {
        return this.gst_audio_check_valid_channel_positions(Pointer.getPeer(position), channels, force_order);
    }

    public native long gst_audio_downmix_meta_api_get_type();

    @Ptr
    protected native long gst_audio_downmix_meta_get_info();

    public Pointer<GstMetaInfo> audio_downmix_meta_get_info() {
        return Pointer.pointerToAddress(this.gst_audio_downmix_meta_get_info(), Pointer.class);
    }

    public native IntValuedEnum<GstAudioFormat> gst_audio_format_build_integer(boolean sign, int endianness, int width, int depth);

    protected native void gst_audio_format_fill_silence(
        @Ptr
        long info,
        @Ptr
        long dest, long length);

    public void audio_format_fill_silence(Pointer<GstAudioFormatInfo> info, short dest, long length) {
        this.gst_audio_format_fill_silence(Pointer.getPeer(info), Pointer.getPeer(dest), length);
    }

    protected native IntValuedEnum<GstAudioFormat> gst_audio_format_from_string(
        @Ptr
        long format);

    public IntValuedEnum<GstAudioFormat> audio_format_from_string(Pointer format) {
        return this.gst_audio_format_from_string(Pointer.getPeer(format));
    }

    @Ptr
    protected native long gst_audio_format_get_info(IntValuedEnum<GstAudioFormat> format);

    public Pointer<GstAudioFormatInfo> audio_format_get_info(IntValuedEnum<GstAudioFormat> format) {
        return Pointer.pointerToAddress(this.gst_audio_format_get_info(format), Pointer.class);
    }

    public native long gst_audio_format_info_get_type();

    @Ptr
    protected native long gst_audio_format_to_string(IntValuedEnum<GstAudioFormat> format);

    public Pointer audio_format_to_string(IntValuedEnum<GstAudioFormat> format) {
        return Pointer.pointerToAddress(this.gst_audio_format_to_string(format));
    }

    protected native boolean gst_audio_get_channel_reorder_map(int channels,
        @Ptr
        long from,
        @Ptr
        long to,
        @Ptr
        long reorder_map);

    public boolean audio_get_channel_reorder_map(int channels, IntValuedEnum<GstAudioChannelPosition> from, IntValuedEnum<GstAudioChannelPosition> to, int reorder_map) {
        return this.gst_audio_get_channel_reorder_map(channels, Pointer.getPeer(from), Pointer.getPeer(to), Pointer.getPeer(reorder_map));
    }

    protected native long gst_audio_iec61937_frame_size(
        @Ptr
        long spec);

    public long audio_iec61937_frame_size(Pointer<GstAudioRingBufferSpec> spec) {
        return this.gst_audio_iec61937_frame_size(Pointer.getPeer(spec));
    }

    protected native boolean gst_audio_iec61937_payload(
        @Ptr
        long src, long src_n,
        @Ptr
        long dst, long dst_n,
        @Ptr
        long spec, int endianness);

    public boolean audio_iec61937_payload(short src, long src_n, short dst, long dst_n, Pointer<GstAudioRingBufferSpec> spec, int endianness) {
        return this.gst_audio_iec61937_payload(Pointer.getPeer(src), src_n, Pointer.getPeer(dst), dst_n, Pointer.getPeer(spec), endianness);
    }

    protected native boolean gst_audio_reorder_channels(
        @Ptr
        long data, long size, IntValuedEnum<GstAudioFormat> format, int channels,
        @Ptr
        long from,
        @Ptr
        long to);

    public boolean audio_reorder_channels(short data, long size, IntValuedEnum<GstAudioFormat> format, int channels, IntValuedEnum<GstAudioChannelPosition> from, IntValuedEnum<GstAudioChannelPosition> to) {
        return this.gst_audio_reorder_channels(Pointer.getPeer(data), size, format, channels, Pointer.getPeer(from), Pointer.getPeer(to));
    }

    @Ptr
    protected native long gst_buffer_add_audio_downmix_meta(
        @Ptr
        long buffer,
        @Ptr
        long from_position, int from_channels,
        @Ptr
        long to_position, int to_channels,
        @Ptr
        long matrix);

    public Pointer<GstAudioDownmixMeta> buffer_add_audio_downmix_meta(Pointer<GstBuffer> buffer, IntValuedEnum<GstAudioChannelPosition> from_position, int from_channels, IntValuedEnum<GstAudioChannelPosition> to_position, int to_channels, Pointer<Pointer<Float>> matrix) {
        return Pointer.pointerToAddress(this.gst_buffer_add_audio_downmix_meta(Pointer.getPeer(buffer), Pointer.getPeer(from_position), from_channels, Pointer.getPeer(to_position), to_channels, Pointer.getPeer(matrix)), Pointer.class);
    }

    @Ptr
    protected native long gst_buffer_get_audio_downmix_meta_for_channels(
        @Ptr
        long buffer,
        @Ptr
        long to_position, int to_channels);

    public Pointer<GstAudioDownmixMeta> buffer_get_audio_downmix_meta_for_channels(Pointer<GstBuffer> buffer, IntValuedEnum<GstAudioChannelPosition> to_position, int to_channels) {
        return Pointer.pointerToAddress(this.gst_buffer_get_audio_downmix_meta_for_channels(Pointer.getPeer(buffer), Pointer.getPeer(to_position), to_channels), Pointer.class);
    }

    public native double gst_stream_volume_convert_volume(IntValuedEnum<GstStreamVolumeFormat> from, IntValuedEnum<GstStreamVolumeFormat> to, double val);

}
