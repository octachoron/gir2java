
package generated.gstreamerrtp10.gstrtp;

import generated.glib20.glib.GBytes;
import generated.gstreamer10.gst.GstBuffer;
import generated.gstreamer10.gst.GstMapInfo;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-rtp-1.0")
public class GstRTPBuffer
    extends StructObject
{


    public GstRTPBuffer() {
        super();
    }

    public GstRTPBuffer(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer<GstBuffer> field_buffer() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GstRTPBuffer field_buffer(Pointer<GstBuffer> field_buffer) {
        this.io.setPointerField(this, 0, field_buffer);
        return this;
    }

    @Field(1)
    public long field_state() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GstRTPBuffer field_state(long field_state) {
        this.io.setNativeObjectField(this, 1, field_state);
        return this;
    }

    @Field(2)
    public Pointer field_data() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GstRTPBuffer field_data(Pointer field_data) {
        this.io.setPointerField(this, 2, field_data);
        return this;
    }

    @Field(3)
    public long field_size() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public GstRTPBuffer field_size(long field_size) {
        this.io.setPointerField(this, 3, field_size);
        return this;
    }

    @Field(4)
    public GstMapInfo field_map() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public GstRTPBuffer field_map(GstMapInfo field_map) {
        this.io.setPointerField(this, 4, field_map);
        return this;
    }

    protected native boolean gst_rtp_buffer_add_extension_onebyte_header(
        @Ptr
        long rtp, short id,
        @Ptr
        long data, long size);

    public boolean add_extension_onebyte_header(short id, short data, long size) {
        return this.gst_rtp_buffer_add_extension_onebyte_header(Pointer.pointerTo(this, GstRTPBuffer.class), id, Pointer.getPeer(data), size);
    }

    protected native boolean gst_rtp_buffer_add_extension_twobytes_header(
        @Ptr
        long rtp, short appbits, short id,
        @Ptr
        long data, long size);

    public boolean add_extension_twobytes_header(short appbits, short id, short data, long size) {
        return this.gst_rtp_buffer_add_extension_twobytes_header(Pointer.pointerTo(this, GstRTPBuffer.class), appbits, id, Pointer.getPeer(data), size);
    }

    protected native long gst_rtp_buffer_get_csrc(
        @Ptr
        long rtp, short idx);

    public long get_csrc(short idx) {
        return this.gst_rtp_buffer_get_csrc(Pointer.pointerTo(this, GstRTPBuffer.class), idx);
    }

    protected native short gst_rtp_buffer_get_csrc_count(
        @Ptr
        long rtp);

    public short get_csrc_count() {
        return this.gst_rtp_buffer_get_csrc_count(Pointer.pointerTo(this, GstRTPBuffer.class));
    }

    protected native boolean gst_rtp_buffer_get_extension(
        @Ptr
        long rtp);

    public boolean get_extension() {
        return this.gst_rtp_buffer_get_extension(Pointer.pointerTo(this, GstRTPBuffer.class));
    }

    @Ptr
    protected native long gst_rtp_buffer_get_extension_bytes(
        @Ptr
        long rtp,
        @Ptr
        long bits);

    public Pointer<GBytes> get_extension_bytes(Pointer<Integer> bits) {
        return Pointer.pointerToAddress(this.gst_rtp_buffer_get_extension_bytes(Pointer.pointerTo(this, GstRTPBuffer.class), Pointer.getPeer(bits)), Pointer.class);
    }

    protected native boolean gst_rtp_buffer_get_extension_data(
        @Ptr
        long rtp,
        @Ptr
        long bits,
        @Ptr
        long data,
        @Ptr
        long wordlen);

    public boolean get_extension_data(Pointer<Integer> bits, short data, Pointer<Long> wordlen) {
        return this.gst_rtp_buffer_get_extension_data(Pointer.pointerTo(this, GstRTPBuffer.class), Pointer.getPeer(bits), Pointer.getPeer(data), Pointer.getPeer(wordlen));
    }

    protected native boolean gst_rtp_buffer_get_extension_onebyte_header(
        @Ptr
        long rtp, short id, long nth,
        @Ptr
        long data,
        @Ptr
        long size);

    public boolean get_extension_onebyte_header(short id, long nth, short data, Pointer<Long> size) {
        return this.gst_rtp_buffer_get_extension_onebyte_header(Pointer.pointerTo(this, GstRTPBuffer.class), id, nth, Pointer.getPeer(data), Pointer.getPeer(size));
    }

    protected native boolean gst_rtp_buffer_get_extension_twobytes_header(
        @Ptr
        long rtp,
        @Ptr
        long appbits, short id, long nth,
        @Ptr
        long data,
        @Ptr
        long size);

    public boolean get_extension_twobytes_header(Pointer<Short> appbits, short id, long nth, short data, Pointer<Long> size) {
        return this.gst_rtp_buffer_get_extension_twobytes_header(Pointer.pointerTo(this, GstRTPBuffer.class), Pointer.getPeer(appbits), id, nth, Pointer.getPeer(data), Pointer.getPeer(size));
    }

    protected native long gst_rtp_buffer_get_header_len(
        @Ptr
        long rtp);

    public long get_header_len() {
        return this.gst_rtp_buffer_get_header_len(Pointer.pointerTo(this, GstRTPBuffer.class));
    }

    protected native boolean gst_rtp_buffer_get_marker(
        @Ptr
        long rtp);

    public boolean get_marker() {
        return this.gst_rtp_buffer_get_marker(Pointer.pointerTo(this, GstRTPBuffer.class));
    }

    protected native long gst_rtp_buffer_get_packet_len(
        @Ptr
        long rtp);

    public long get_packet_len() {
        return this.gst_rtp_buffer_get_packet_len(Pointer.pointerTo(this, GstRTPBuffer.class));
    }

    protected native boolean gst_rtp_buffer_get_padding(
        @Ptr
        long rtp);

    public boolean get_padding() {
        return this.gst_rtp_buffer_get_padding(Pointer.pointerTo(this, GstRTPBuffer.class));
    }

    @Ptr
    protected native long gst_rtp_buffer_get_payload(
        @Ptr
        long rtp);

    public short get_payload() {
        return Pointer.pointerToAddress(this.gst_rtp_buffer_get_payload(Pointer.pointerTo(this, GstRTPBuffer.class)), Short.class);
    }

    @Ptr
    protected native long gst_rtp_buffer_get_payload_buffer(
        @Ptr
        long rtp);

    public Pointer<GstBuffer> get_payload_buffer() {
        return Pointer.pointerToAddress(this.gst_rtp_buffer_get_payload_buffer(Pointer.pointerTo(this, GstRTPBuffer.class)), Pointer.class);
    }

    @Ptr
    protected native long gst_rtp_buffer_get_payload_bytes(
        @Ptr
        long rtp);

    public Pointer<GBytes> get_payload_bytes() {
        return Pointer.pointerToAddress(this.gst_rtp_buffer_get_payload_bytes(Pointer.pointerTo(this, GstRTPBuffer.class)), Pointer.class);
    }

    protected native long gst_rtp_buffer_get_payload_len(
        @Ptr
        long rtp);

    public long get_payload_len() {
        return this.gst_rtp_buffer_get_payload_len(Pointer.pointerTo(this, GstRTPBuffer.class));
    }

    @Ptr
    protected native long gst_rtp_buffer_get_payload_subbuffer(
        @Ptr
        long rtp, long offset, long len);

    public Pointer<GstBuffer> get_payload_subbuffer(long offset, long len) {
        return Pointer.pointerToAddress(this.gst_rtp_buffer_get_payload_subbuffer(Pointer.pointerTo(this, GstRTPBuffer.class), offset, len), Pointer.class);
    }

    protected native short gst_rtp_buffer_get_payload_type(
        @Ptr
        long rtp);

    public short get_payload_type() {
        return this.gst_rtp_buffer_get_payload_type(Pointer.pointerTo(this, GstRTPBuffer.class));
    }

    protected native int gst_rtp_buffer_get_seq(
        @Ptr
        long rtp);

    public int get_seq() {
        return this.gst_rtp_buffer_get_seq(Pointer.pointerTo(this, GstRTPBuffer.class));
    }

    protected native long gst_rtp_buffer_get_ssrc(
        @Ptr
        long rtp);

    public long get_ssrc() {
        return this.gst_rtp_buffer_get_ssrc(Pointer.pointerTo(this, GstRTPBuffer.class));
    }

    protected native long gst_rtp_buffer_get_timestamp(
        @Ptr
        long rtp);

    public long get_timestamp() {
        return this.gst_rtp_buffer_get_timestamp(Pointer.pointerTo(this, GstRTPBuffer.class));
    }

    protected native short gst_rtp_buffer_get_version(
        @Ptr
        long rtp);

    public short get_version() {
        return this.gst_rtp_buffer_get_version(Pointer.pointerTo(this, GstRTPBuffer.class));
    }

    protected native void gst_rtp_buffer_pad_to(
        @Ptr
        long rtp, long len);

    public void pad_to(long len) {
        this.gst_rtp_buffer_pad_to(Pointer.pointerTo(this, GstRTPBuffer.class), len);
    }

    protected native void gst_rtp_buffer_set_csrc(
        @Ptr
        long rtp, short idx, long csrc);

    public void set_csrc(short idx, long csrc) {
        this.gst_rtp_buffer_set_csrc(Pointer.pointerTo(this, GstRTPBuffer.class), idx, csrc);
    }

    protected native void gst_rtp_buffer_set_extension(
        @Ptr
        long rtp, boolean extension);

    public void set_extension(boolean extension) {
        this.gst_rtp_buffer_set_extension(Pointer.pointerTo(this, GstRTPBuffer.class), extension);
    }

    protected native boolean gst_rtp_buffer_set_extension_data(
        @Ptr
        long rtp, int bits, int length);

    public boolean set_extension_data(int bits, int length) {
        return this.gst_rtp_buffer_set_extension_data(Pointer.pointerTo(this, GstRTPBuffer.class), bits, length);
    }

    protected native void gst_rtp_buffer_set_marker(
        @Ptr
        long rtp, boolean marker);

    public void set_marker(boolean marker) {
        this.gst_rtp_buffer_set_marker(Pointer.pointerTo(this, GstRTPBuffer.class), marker);
    }

    protected native void gst_rtp_buffer_set_packet_len(
        @Ptr
        long rtp, long len);

    public void set_packet_len(long len) {
        this.gst_rtp_buffer_set_packet_len(Pointer.pointerTo(this, GstRTPBuffer.class), len);
    }

    protected native void gst_rtp_buffer_set_padding(
        @Ptr
        long rtp, boolean padding);

    public void set_padding(boolean padding) {
        this.gst_rtp_buffer_set_padding(Pointer.pointerTo(this, GstRTPBuffer.class), padding);
    }

    protected native void gst_rtp_buffer_set_payload_type(
        @Ptr
        long rtp, short payload_type);

    public void set_payload_type(short payload_type) {
        this.gst_rtp_buffer_set_payload_type(Pointer.pointerTo(this, GstRTPBuffer.class), payload_type);
    }

    protected native void gst_rtp_buffer_set_seq(
        @Ptr
        long rtp, int seq);

    public void set_seq(int seq) {
        this.gst_rtp_buffer_set_seq(Pointer.pointerTo(this, GstRTPBuffer.class), seq);
    }

    protected native void gst_rtp_buffer_set_ssrc(
        @Ptr
        long rtp, long ssrc);

    public void set_ssrc(long ssrc) {
        this.gst_rtp_buffer_set_ssrc(Pointer.pointerTo(this, GstRTPBuffer.class), ssrc);
    }

    protected native void gst_rtp_buffer_set_timestamp(
        @Ptr
        long rtp, long timestamp);

    public void set_timestamp(long timestamp) {
        this.gst_rtp_buffer_set_timestamp(Pointer.pointerTo(this, GstRTPBuffer.class), timestamp);
    }

    protected native void gst_rtp_buffer_set_version(
        @Ptr
        long rtp, short version);

    public void set_version(short version) {
        this.gst_rtp_buffer_set_version(Pointer.pointerTo(this, GstRTPBuffer.class), version);
    }

    protected native void gst_rtp_buffer_unmap(
        @Ptr
        long rtp);

    public void unmap() {
        this.gst_rtp_buffer_unmap(Pointer.pointerTo(this, GstRTPBuffer.class));
    }

    protected native void gst_rtp_buffer_allocate_data(
        @Ptr
        long buffer, long payload_len, short pad_len, short csrc_count);

    public void allocate_data(Pointer<GstBuffer> buffer, long payload_len, short pad_len, short csrc_count) {
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

    public long ext_timestamp(Pointer<Long> exttimestamp, long timestamp) {
        return this.gst_rtp_buffer_ext_timestamp(Pointer.getPeer(exttimestamp), timestamp);
    }

    protected native boolean gst_rtp_buffer_map(
        @Ptr
        long buffer, Object flags,
        @Ptr
        long rtp);

    public boolean map(Pointer<GstBuffer> buffer, Object flags, Pointer rtp) {
        return this.gst_rtp_buffer_map(Pointer.getPeer(buffer), flags, Pointer.getPeer(rtp));
    }

    @Ptr
    protected native long gst_rtp_buffer_new_allocate(long payload_len, short pad_len, short csrc_count);

    public Pointer<GstBuffer> new_allocate(long payload_len, short pad_len, short csrc_count) {
        return Pointer.pointerToAddress(this.gst_rtp_buffer_new_allocate(payload_len, pad_len, csrc_count), Pointer.class);
    }

    @Ptr
    protected native long gst_rtp_buffer_new_allocate_len(long packet_len, short pad_len, short csrc_count);

    public Pointer<GstBuffer> new_allocate_len(long packet_len, short pad_len, short csrc_count) {
        return Pointer.pointerToAddress(this.gst_rtp_buffer_new_allocate_len(packet_len, pad_len, csrc_count), Pointer.class);
    }

    @Ptr
    protected native long gst_rtp_buffer_new_copy_data(
        @Ptr
        long data, long len);

    public Pointer<GstBuffer> new_copy_data(short data, long len) {
        return Pointer.pointerToAddress(this.gst_rtp_buffer_new_copy_data(Pointer.getPeer(data), len), Pointer.class);
    }

    @Ptr
    protected native long gst_rtp_buffer_new_take_data(
        @Ptr
        long data, long len);

    public Pointer<GstBuffer> new_take_data(short data, long len) {
        return Pointer.pointerToAddress(this.gst_rtp_buffer_new_take_data(Pointer.getPeer(data), len), Pointer.class);
    }

}
