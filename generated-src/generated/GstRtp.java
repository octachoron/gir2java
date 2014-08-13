
package generated;

import generated.gstreamer10.gst.GstBuffer;
import generated.gstreamerrtp10.gstrtp.GstRTCPBuffer;
import generated.gstreamerrtp10.gstrtp.GstRTCPSDESType;
import generated.gstreamerrtp10.gstrtp.GstRTPBuffer;
import generated.gstreamerrtp10.gstrtp.GstRTPPayloadInfo;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Ptr;

public class GstRtp {


    protected native boolean gst_rtcp_buffer_map(
        @Ptr
        long buffer, Object flags,
        @Ptr
        long rtcp);

    public boolean rtcp_buffer_map(Pointer<GstBuffer> buffer, Object flags, Pointer<GstRTCPBuffer> rtcp) {
        return this.gst_rtcp_buffer_map(Pointer.getPeer(buffer), flags, Pointer.getPeer(rtcp));
    }

    @Ptr
    protected native long gst_rtcp_buffer_new(long mtu);

    public Pointer<GstBuffer> rtcp_buffer_new(long mtu) {
        return Pointer.pointerToAddress(this.gst_rtcp_buffer_new(mtu), Pointer.class);
    }

    @Ptr
    protected native long gst_rtcp_buffer_new_copy_data(
        @Ptr
        long data, long len);

    public Pointer<GstBuffer> rtcp_buffer_new_copy_data(short data, long len) {
        return Pointer.pointerToAddress(this.gst_rtcp_buffer_new_copy_data(Pointer.getPeer(data), len), Pointer.class);
    }

    @Ptr
    protected native long gst_rtcp_buffer_new_take_data(
        @Ptr
        long data, long len);

    public Pointer<GstBuffer> rtcp_buffer_new_take_data(short data, long len) {
        return Pointer.pointerToAddress(this.gst_rtcp_buffer_new_take_data(Pointer.getPeer(data), len), Pointer.class);
    }

    protected native boolean gst_rtcp_buffer_validate(
        @Ptr
        long buffer);

    public boolean rtcp_buffer_validate(Pointer<GstBuffer> buffer) {
        return this.gst_rtcp_buffer_validate(Pointer.getPeer(buffer));
    }

    protected native boolean gst_rtcp_buffer_validate_data(
        @Ptr
        long data, long len);

    public boolean rtcp_buffer_validate_data(short data, long len) {
        return this.gst_rtcp_buffer_validate_data(Pointer.getPeer(data), len);
    }

    public native long gst_rtcp_ntp_to_unix(long ntptime);

    protected native IntValuedEnum<GstRTCPSDESType> gst_rtcp_sdes_name_to_type(
        @Ptr
        long name);

    public IntValuedEnum<GstRTCPSDESType> rtcp_sdes_name_to_type(Pointer name) {
        return this.gst_rtcp_sdes_name_to_type(Pointer.getPeer(name));
    }

    @Ptr
    protected native long gst_rtcp_sdes_type_to_name(IntValuedEnum<GstRTCPSDESType> type);

    public Pointer rtcp_sdes_type_to_name(IntValuedEnum<GstRTCPSDESType> type) {
        return Pointer.pointerToAddress(this.gst_rtcp_sdes_type_to_name(type));
    }

    public native long gst_rtcp_unix_to_ntp(long unixtime);

    protected native void gst_rtp_buffer_allocate_data(
        @Ptr
        long buffer, long payload_len, short pad_len, short csrc_count);

    public void rtp_buffer_allocate_data(Pointer<GstBuffer> buffer, long payload_len, short pad_len, short csrc_count) {
        this.gst_rtp_buffer_allocate_data(Pointer.getPeer(buffer), payload_len, pad_len, csrc_count);
    }

    public native long gst_rtp_buffer_calc_header_len(short csrc_count);

    public native long gst_rtp_buffer_calc_packet_len(long payload_len, short pad_len, short csrc_count);

    public native long gst_rtp_buffer_calc_payload_len(long packet_len, short pad_len, short csrc_count);

    public native int gst_rtp_buffer_compare_seqnum(int seqnum1, int seqnum2);

    public native long gst_rtp_buffer_default_clock_rate(short payload_type);

    protected native long gst_rtp_buffer_ext_timestamp(
        @Ptr
        long exttimestamp, long timestamp);

    public long rtp_buffer_ext_timestamp(Pointer<Long> exttimestamp, long timestamp) {
        return this.gst_rtp_buffer_ext_timestamp(Pointer.getPeer(exttimestamp), timestamp);
    }

    protected native boolean gst_rtp_buffer_map(
        @Ptr
        long buffer, Object flags,
        @Ptr
        long rtp);

    public boolean rtp_buffer_map(Pointer<GstBuffer> buffer, Object flags, Pointer<GstRTPBuffer> rtp) {
        return this.gst_rtp_buffer_map(Pointer.getPeer(buffer), flags, Pointer.getPeer(rtp));
    }

    @Ptr
    protected native long gst_rtp_buffer_new_allocate(long payload_len, short pad_len, short csrc_count);

    public Pointer<GstBuffer> rtp_buffer_new_allocate(long payload_len, short pad_len, short csrc_count) {
        return Pointer.pointerToAddress(this.gst_rtp_buffer_new_allocate(payload_len, pad_len, csrc_count), Pointer.class);
    }

    @Ptr
    protected native long gst_rtp_buffer_new_allocate_len(long packet_len, short pad_len, short csrc_count);

    public Pointer<GstBuffer> rtp_buffer_new_allocate_len(long packet_len, short pad_len, short csrc_count) {
        return Pointer.pointerToAddress(this.gst_rtp_buffer_new_allocate_len(packet_len, pad_len, csrc_count), Pointer.class);
    }

    @Ptr
    protected native long gst_rtp_buffer_new_copy_data(
        @Ptr
        long data, long len);

    public Pointer<GstBuffer> rtp_buffer_new_copy_data(short data, long len) {
        return Pointer.pointerToAddress(this.gst_rtp_buffer_new_copy_data(Pointer.getPeer(data), len), Pointer.class);
    }

    @Ptr
    protected native long gst_rtp_buffer_new_take_data(
        @Ptr
        long data, long len);

    public Pointer<GstBuffer> rtp_buffer_new_take_data(short data, long len) {
        return Pointer.pointerToAddress(this.gst_rtp_buffer_new_take_data(Pointer.getPeer(data), len), Pointer.class);
    }

    protected native boolean gst_rtp_hdrext_get_ntp_56(Pointer data, long size,
        @Ptr
        long ntptime);

    public boolean rtp_hdrext_get_ntp_56(Pointer data, long size, Pointer<Long> ntptime) {
        return this.gst_rtp_hdrext_get_ntp_56(data, size, Pointer.getPeer(ntptime));
    }

    protected native boolean gst_rtp_hdrext_get_ntp_64(Pointer data, long size,
        @Ptr
        long ntptime);

    public boolean rtp_hdrext_get_ntp_64(Pointer data, long size, Pointer<Long> ntptime) {
        return this.gst_rtp_hdrext_get_ntp_64(data, size, Pointer.getPeer(ntptime));
    }

    public native boolean gst_rtp_hdrext_set_ntp_56(Pointer data, long size, long ntptime);

    public native boolean gst_rtp_hdrext_set_ntp_64(Pointer data, long size, long ntptime);

    @Ptr
    protected native long gst_rtp_payload_info_for_name(
        @Ptr
        long media,
        @Ptr
        long encoding_name);

    public Pointer<GstRTPPayloadInfo> rtp_payload_info_for_name(Pointer media, Pointer encoding_name) {
        return Pointer.pointerToAddress(this.gst_rtp_payload_info_for_name(Pointer.getPeer(media), Pointer.getPeer(encoding_name)), Pointer.class);
    }

    @Ptr
    protected native long gst_rtp_payload_info_for_pt(short payload_type);

    public Pointer<GstRTPPayloadInfo> rtp_payload_info_for_pt(short payload_type) {
        return Pointer.pointerToAddress(this.gst_rtp_payload_info_for_pt(payload_type), Pointer.class);
    }

}
