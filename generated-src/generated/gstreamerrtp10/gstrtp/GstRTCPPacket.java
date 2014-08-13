
package generated.gstreamerrtp10.gstrtp;

import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-rtp-1.0")
public class GstRTCPPacket
    extends StructObject
{


    public GstRTCPPacket() {
        super();
    }

    public GstRTCPPacket(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer<GstRTCPBuffer> field_rtcp() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GstRTCPPacket field_rtcp(Pointer<GstRTCPBuffer> field_rtcp) {
        this.io.setPointerField(this, 0, field_rtcp);
        return this;
    }

    @Field(1)
    public long field_offset() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GstRTCPPacket field_offset(long field_offset) {
        this.io.setNativeObjectField(this, 1, field_offset);
        return this;
    }

    @Field(2)
    public boolean field_padding() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GstRTCPPacket field_padding(boolean field_padding) {
        this.io.setNativeObjectField(this, 2, field_padding);
        return this;
    }

    @Field(3)
    public short field_count() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GstRTCPPacket field_count(short field_count) {
        this.io.setNativeObjectField(this, 3, field_count);
        return this;
    }

    protected native IntValuedEnum<GstRTCPType> gst_rtcp_packet_get_type(
        @Ptr
        long packet);

    public IntValuedEnum<GstRTCPType> get_type() {
        return this.gst_rtcp_packet_get_type(Pointer.pointerTo(this, GstRTCPPacket.class));
    }

    protected native int gst_rtcp_packet_fb_get_fci_length(
        @Ptr
        long packet);

    public int fb_get_fci_length() {
        return this.gst_rtcp_packet_fb_get_fci_length(Pointer.pointerTo(this, GstRTCPPacket.class));
    }

    protected native long gst_rtcp_packet_get_rb_count(
        @Ptr
        long packet);

    public long get_rb_count() {
        return this.gst_rtcp_packet_get_rb_count(Pointer.pointerTo(this, GstRTCPPacket.class));
    }

    protected native void gst_rtcp_packet_sr_get_sender_info(
        @Ptr
        long packet,
        @Ptr
        long ssrc,
        @Ptr
        long ntptime,
        @Ptr
        long rtptime,
        @Ptr
        long packet_count,
        @Ptr
        long octet_count);

    public void sr_get_sender_info(Pointer<Long> ssrc, Pointer<Long> ntptime, Pointer<Long> rtptime, Pointer<Long> packet_count, Pointer<Long> octet_count) {
        this.gst_rtcp_packet_sr_get_sender_info(Pointer.pointerTo(this, GstRTCPPacket.class), Pointer.getPeer(ssrc), Pointer.getPeer(ntptime), Pointer.getPeer(rtptime), Pointer.getPeer(packet_count), Pointer.getPeer(octet_count));
    }

    @Field(4)
    public long field_entry_offset() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    public GstRTCPPacket field_entry_offset(long field_entry_offset) {
        this.io.setNativeObjectField(this, 4, field_entry_offset);
        return this;
    }

    protected native void gst_rtcp_packet_set_rb(
        @Ptr
        long packet, long nth, long ssrc, short fractionlost, int packetslost, long exthighestseq, long jitter, long lsr, long dlsr);

    public void set_rb(long nth, long ssrc, short fractionlost, int packetslost, long exthighestseq, long jitter, long lsr, long dlsr) {
        this.gst_rtcp_packet_set_rb(Pointer.pointerTo(this, GstRTCPPacket.class), nth, ssrc, fractionlost, packetslost, exthighestseq, jitter, lsr, dlsr);
    }

    protected native boolean gst_rtcp_packet_fb_set_fci_length(
        @Ptr
        long packet, int wordlen);

    public boolean fb_set_fci_length(int wordlen) {
        return this.gst_rtcp_packet_fb_set_fci_length(Pointer.pointerTo(this, GstRTCPPacket.class), wordlen);
    }

    @Ptr
    protected native long gst_rtcp_packet_fb_get_fci(
        @Ptr
        long packet);

    public Pointer<Short> fb_get_fci() {
        return Pointer.pointerToAddress(this.gst_rtcp_packet_fb_get_fci(Pointer.pointerTo(this, GstRTCPPacket.class)), Pointer.class);
    }

    protected native void gst_rtcp_packet_sr_set_sender_info(
        @Ptr
        long packet, long ssrc, long ntptime, long rtptime, long packet_count, long octet_count);

    public void sr_set_sender_info(long ssrc, long ntptime, long rtptime, long packet_count, long octet_count) {
        this.gst_rtcp_packet_sr_set_sender_info(Pointer.pointerTo(this, GstRTCPPacket.class), ssrc, ntptime, rtptime, packet_count, octet_count);
    }

    protected native boolean gst_rtcp_packet_move_to_next(
        @Ptr
        long packet);

    public boolean move_to_next() {
        return this.gst_rtcp_packet_move_to_next(Pointer.pointerTo(this, GstRTCPPacket.class));
    }

    protected native boolean gst_rtcp_packet_sdes_add_item(
        @Ptr
        long packet, long ssrc);

    public boolean sdes_add_item(long ssrc) {
        return this.gst_rtcp_packet_sdes_add_item(Pointer.pointerTo(this, GstRTCPPacket.class), ssrc);
    }

    protected native boolean gst_rtcp_packet_bye_add_ssrcs(
        @Ptr
        long packet,
        @Ptr
        long ssrc, long len);

    public boolean bye_add_ssrcs(Pointer<Long> ssrc, long len) {
        return this.gst_rtcp_packet_bye_add_ssrcs(Pointer.pointerTo(this, GstRTCPPacket.class), Pointer.getPeer(ssrc), len);
    }

    protected native void gst_rtcp_packet_fb_set_type(
        @Ptr
        long packet, IntValuedEnum<GstRTCPFBType> type);

    public void fb_set_type(IntValuedEnum<GstRTCPFBType> type) {
        this.gst_rtcp_packet_fb_set_type(Pointer.pointerTo(this, GstRTCPPacket.class), type);
    }

    protected native boolean gst_rtcp_packet_sdes_first_entry(
        @Ptr
        long packet);

    public boolean sdes_first_entry() {
        return this.gst_rtcp_packet_sdes_first_entry(Pointer.pointerTo(this, GstRTCPPacket.class));
    }

    protected native int gst_rtcp_packet_get_length(
        @Ptr
        long packet);

    public int get_length() {
        return this.gst_rtcp_packet_get_length(Pointer.pointerTo(this, GstRTCPPacket.class));
    }

    protected native long gst_rtcp_packet_bye_get_nth_ssrc(
        @Ptr
        long packet, long nth);

    public long bye_get_nth_ssrc(long nth) {
        return this.gst_rtcp_packet_bye_get_nth_ssrc(Pointer.pointerTo(this, GstRTCPPacket.class), nth);
    }

    protected native boolean gst_rtcp_packet_remove(
        @Ptr
        long packet);

    public boolean remove() {
        return this.gst_rtcp_packet_remove(Pointer.pointerTo(this, GstRTCPPacket.class));
    }

    protected native boolean gst_rtcp_packet_bye_add_ssrc(
        @Ptr
        long packet, long ssrc);

    public boolean bye_add_ssrc(long ssrc) {
        return this.gst_rtcp_packet_bye_add_ssrc(Pointer.pointerTo(this, GstRTCPPacket.class), ssrc);
    }

    protected native long gst_rtcp_packet_fb_get_sender_ssrc(
        @Ptr
        long packet);

    public long fb_get_sender_ssrc() {
        return this.gst_rtcp_packet_fb_get_sender_ssrc(Pointer.pointerTo(this, GstRTCPPacket.class));
    }

    protected native boolean gst_rtcp_packet_sdes_get_entry(
        @Ptr
        long packet,
        @Ptr
        long type,
        @Ptr
        long len,
        @Ptr
        long data);

    public boolean sdes_get_entry(Pointer<IntValuedEnum<GstRTCPSDESType>> type, Pointer<Short> len, Pointer<Short> data) {
        return this.gst_rtcp_packet_sdes_get_entry(Pointer.pointerTo(this, GstRTCPPacket.class), Pointer.getPeer(type), Pointer.getPeer(len), Pointer.getPeer(data));
    }

    protected native boolean gst_rtcp_packet_sdes_copy_entry(
        @Ptr
        long packet,
        @Ptr
        long type,
        @Ptr
        long len,
        @Ptr
        long data);

    public boolean sdes_copy_entry(Pointer<IntValuedEnum<GstRTCPSDESType>> type, Pointer<Short> len, Pointer<Short> data) {
        return this.gst_rtcp_packet_sdes_copy_entry(Pointer.pointerTo(this, GstRTCPPacket.class), Pointer.getPeer(type), Pointer.getPeer(len), Pointer.getPeer(data));
    }

    protected native void gst_rtcp_packet_fb_set_media_ssrc(
        @Ptr
        long packet, long ssrc);

    public void fb_set_media_ssrc(long ssrc) {
        this.gst_rtcp_packet_fb_set_media_ssrc(Pointer.pointerTo(this, GstRTCPPacket.class), ssrc);
    }

    protected native boolean gst_rtcp_packet_sdes_add_entry(
        @Ptr
        long packet, IntValuedEnum<GstRTCPSDESType> type, short len,
        @Ptr
        long data);

    public boolean sdes_add_entry(IntValuedEnum<GstRTCPSDESType> type, short len, short data) {
        return this.gst_rtcp_packet_sdes_add_entry(Pointer.pointerTo(this, GstRTCPPacket.class), type, len, Pointer.getPeer(data));
    }

    protected native void gst_rtcp_packet_fb_set_sender_ssrc(
        @Ptr
        long packet, long ssrc);

    public void fb_set_sender_ssrc(long ssrc) {
        this.gst_rtcp_packet_fb_set_sender_ssrc(Pointer.pointerTo(this, GstRTCPPacket.class), ssrc);
    }

    protected native boolean gst_rtcp_packet_sdes_next_entry(
        @Ptr
        long packet);

    public boolean sdes_next_entry() {
        return this.gst_rtcp_packet_sdes_next_entry(Pointer.pointerTo(this, GstRTCPPacket.class));
    }

    protected native boolean gst_rtcp_packet_get_padding(
        @Ptr
        long packet);

    public boolean get_padding() {
        return this.gst_rtcp_packet_get_padding(Pointer.pointerTo(this, GstRTCPPacket.class));
    }

    protected native long gst_rtcp_packet_sdes_get_ssrc(
        @Ptr
        long packet);

    public long sdes_get_ssrc() {
        return this.gst_rtcp_packet_sdes_get_ssrc(Pointer.pointerTo(this, GstRTCPPacket.class));
    }

    protected native long gst_rtcp_packet_bye_get_ssrc_count(
        @Ptr
        long packet);

    public long bye_get_ssrc_count() {
        return this.gst_rtcp_packet_bye_get_ssrc_count(Pointer.pointerTo(this, GstRTCPPacket.class));
    }

    protected native IntValuedEnum<GstRTCPFBType> gst_rtcp_packet_fb_get_type(
        @Ptr
        long packet);

    public IntValuedEnum<GstRTCPFBType> fb_get_type() {
        return this.gst_rtcp_packet_fb_get_type(Pointer.pointerTo(this, GstRTCPPacket.class));
    }

    protected native void gst_rtcp_packet_get_rb(
        @Ptr
        long packet, long nth,
        @Ptr
        long ssrc,
        @Ptr
        long fractionlost,
        @Ptr
        long packetslost,
        @Ptr
        long exthighestseq,
        @Ptr
        long jitter,
        @Ptr
        long lsr,
        @Ptr
        long dlsr);

    public void get_rb(long nth, Pointer<Long> ssrc, Pointer<Short> fractionlost, Pointer<Integer> packetslost, Pointer<Long> exthighestseq, Pointer<Long> jitter, Pointer<Long> lsr, Pointer<Long> dlsr) {
        this.gst_rtcp_packet_get_rb(Pointer.pointerTo(this, GstRTCPPacket.class), nth, Pointer.getPeer(ssrc), Pointer.getPeer(fractionlost), Pointer.getPeer(packetslost), Pointer.getPeer(exthighestseq), Pointer.getPeer(jitter), Pointer.getPeer(lsr), Pointer.getPeer(dlsr));
    }

    protected native boolean gst_rtcp_packet_bye_set_reason(
        @Ptr
        long packet,
        @Ptr
        long reason);

    public boolean bye_set_reason(Pointer reason) {
        return this.gst_rtcp_packet_bye_set_reason(Pointer.pointerTo(this, GstRTCPPacket.class), Pointer.getPeer(reason));
    }

    @Ptr
    protected native long gst_rtcp_packet_bye_get_reason(
        @Ptr
        long packet);

    public Pointer bye_get_reason() {
        return Pointer.pointerToAddress(this.gst_rtcp_packet_bye_get_reason(Pointer.pointerTo(this, GstRTCPPacket.class)));
    }

    protected native long gst_rtcp_packet_fb_get_media_ssrc(
        @Ptr
        long packet);

    public long fb_get_media_ssrc() {
        return this.gst_rtcp_packet_fb_get_media_ssrc(Pointer.pointerTo(this, GstRTCPPacket.class));
    }

    protected native long gst_rtcp_packet_rr_get_ssrc(
        @Ptr
        long packet);

    public long rr_get_ssrc() {
        return this.gst_rtcp_packet_rr_get_ssrc(Pointer.pointerTo(this, GstRTCPPacket.class));
    }

    @Field(5)
    public long field_item_offset() {
        return this.io.getNativeObjectField(this, 5);
    }

    @Field(5)
    public GstRTCPPacket field_item_offset(long field_item_offset) {
        this.io.setNativeObjectField(this, 5, field_item_offset);
        return this;
    }

    protected native short gst_rtcp_packet_get_count(
        @Ptr
        long packet);

    public short get_count() {
        return this.gst_rtcp_packet_get_count(Pointer.pointerTo(this, GstRTCPPacket.class));
    }

    protected native short gst_rtcp_packet_bye_get_reason_len(
        @Ptr
        long packet);

    public short bye_get_reason_len() {
        return this.gst_rtcp_packet_bye_get_reason_len(Pointer.pointerTo(this, GstRTCPPacket.class));
    }

    protected native boolean gst_rtcp_packet_add_rb(
        @Ptr
        long packet, long ssrc, short fractionlost, int packetslost, long exthighestseq, long jitter, long lsr, long dlsr);

    public boolean add_rb(long ssrc, short fractionlost, int packetslost, long exthighestseq, long jitter, long lsr, long dlsr) {
        return this.gst_rtcp_packet_add_rb(Pointer.pointerTo(this, GstRTCPPacket.class), ssrc, fractionlost, packetslost, exthighestseq, jitter, lsr, dlsr);
    }

    protected native void gst_rtcp_packet_rr_set_ssrc(
        @Ptr
        long packet, long ssrc);

    public void rr_set_ssrc(long ssrc) {
        this.gst_rtcp_packet_rr_set_ssrc(Pointer.pointerTo(this, GstRTCPPacket.class), ssrc);
    }

    protected native boolean gst_rtcp_packet_sdes_first_item(
        @Ptr
        long packet);

    public boolean sdes_first_item() {
        return this.gst_rtcp_packet_sdes_first_item(Pointer.pointerTo(this, GstRTCPPacket.class));
    }

    @Field(6)
    public int field_length() {
        return this.io.getNativeObjectField(this, 6);
    }

    @Field(6)
    public GstRTCPPacket field_length(int field_length) {
        this.io.setNativeObjectField(this, 6, field_length);
        return this;
    }

    protected native boolean gst_rtcp_packet_sdes_next_item(
        @Ptr
        long packet);

    public boolean sdes_next_item() {
        return this.gst_rtcp_packet_sdes_next_item(Pointer.pointerTo(this, GstRTCPPacket.class));
    }

    @Field(7)
    public IntValuedEnum<GstRTCPType> field_type() {
        return this.io.getEnumField(this, 7);
    }

    @Field(7)
    public GstRTCPPacket field_type(IntValuedEnum<GstRTCPType> field_type) {
        this.io.setEnumField(this, 7, field_type);
        return this;
    }

    protected native long gst_rtcp_packet_sdes_get_item_count(
        @Ptr
        long packet);

    public long sdes_get_item_count() {
        return this.gst_rtcp_packet_sdes_get_item_count(Pointer.pointerTo(this, GstRTCPPacket.class));
    }

    @Field(8)
    public long field_item_count() {
        return this.io.getNativeObjectField(this, 8);
    }

    @Field(8)
    public GstRTCPPacket field_item_count(long field_item_count) {
        this.io.setNativeObjectField(this, 8, field_item_count);
        return this;
    }

}
