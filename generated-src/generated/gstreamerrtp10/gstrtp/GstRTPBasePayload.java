
package generated.gstreamerrtp10.gstrtp;

import generated.gstreamer10.gst.GstBuffer;
import generated.gstreamer10.gst.GstBufferList;
import generated.gstreamer10.gst.GstElement;
import generated.gstreamer10.gst.GstFlowReturn;
import generated.gstreamer10.gst.GstPad;
import generated.gstreamer10.gst.GstSegment;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-rtp-1.0")
public class GstRTPBasePayload
    extends GstElement
{


    public GstRTPBasePayload() {
        super();
    }

    public GstRTPBasePayload(Pointer pointer) {
        super(pointer);
    }

    protected native boolean gst_rtp_base_payload_is_filled(
        @Ptr
        long payload, long size, Object duration);

    public boolean is_filled(long size, Object duration) {
        return this.gst_rtp_base_payload_is_filled(Pointer.pointerTo(this, GstRTPBasePayload.class), size, duration);
    }

    protected native IntValuedEnum<GstFlowReturn> gst_rtp_base_payload_push(
        @Ptr
        long payload,
        @Ptr
        long buffer);

    public IntValuedEnum<GstFlowReturn> push(Pointer<GstBuffer> buffer) {
        return this.gst_rtp_base_payload_push(Pointer.pointerTo(this, GstRTPBasePayload.class), Pointer.getPeer(buffer));
    }

    protected native IntValuedEnum<GstFlowReturn> gst_rtp_base_payload_push_list(
        @Ptr
        long payload,
        @Ptr
        long list);

    public IntValuedEnum<GstFlowReturn> push_list(Pointer<GstBufferList> list) {
        return this.gst_rtp_base_payload_push_list(Pointer.pointerTo(this, GstRTPBasePayload.class), Pointer.getPeer(list));
    }

    protected native void gst_rtp_base_payload_set_options(
        @Ptr
        long payload,
        @Ptr
        long media, boolean dynamic,
        @Ptr
        long encoding_name, long clock_rate);

    public void set_options(Pointer media, boolean dynamic, Pointer encoding_name, long clock_rate) {
        this.gst_rtp_base_payload_set_options(Pointer.pointerTo(this, GstRTPBasePayload.class), Pointer.getPeer(media), dynamic, Pointer.getPeer(encoding_name), clock_rate);
    }

    protected native boolean gst_rtp_base_payload_set_outcaps(
        @Ptr
        long payload,
        @Ptr
        long fieldname, Object... varargs);

    public boolean set_outcaps(Pointer fieldname, Object... varargs) {
        return this.gst_rtp_base_payload_set_outcaps(Pointer.pointerTo(this, GstRTPBasePayload.class), Pointer.getPeer(fieldname), varargs);
    }

    @Field(0)
    public GstElement field_element() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstRTPBasePayload field_element(GstElement field_element) {
        this.io.setNativeObjectField(this, 0, field_element);
        return this;
    }

    @Field(1)
    public Pointer<GstPad> field_sinkpad() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstRTPBasePayload field_sinkpad(Pointer<GstPad> field_sinkpad) {
        this.io.setPointerField(this, 1, field_sinkpad);
        return this;
    }

    @Field(2)
    public Pointer<GstPad> field_srcpad() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GstRTPBasePayload field_srcpad(Pointer<GstPad> field_srcpad) {
        this.io.setPointerField(this, 2, field_srcpad);
        return this;
    }

    @Field(3)
    public long field_ts_base() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GstRTPBasePayload field_ts_base(long field_ts_base) {
        this.io.setNativeObjectField(this, 3, field_ts_base);
        return this;
    }

    @Field(4)
    public int field_seqnum_base() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    public GstRTPBasePayload field_seqnum_base(int field_seqnum_base) {
        this.io.setNativeObjectField(this, 4, field_seqnum_base);
        return this;
    }

    @Field(5)
    public Pointer field_media() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    public GstRTPBasePayload field_media(Pointer field_media) {
        this.io.setPointerField(this, 5, field_media);
        return this;
    }

    @Field(6)
    public Pointer field_encoding_name() {
        return this.io.getPointerField(this, 6);
    }

    @Field(6)
    public GstRTPBasePayload field_encoding_name(Pointer field_encoding_name) {
        this.io.setPointerField(this, 6, field_encoding_name);
        return this;
    }

    @Field(7)
    public boolean field_dynamic() {
        return this.io.getNativeObjectField(this, 7);
    }

    @Field(7)
    public GstRTPBasePayload field_dynamic(boolean field_dynamic) {
        this.io.setNativeObjectField(this, 7, field_dynamic);
        return this;
    }

    @Field(8)
    public long field_clock_rate() {
        return this.io.getNativeObjectField(this, 8);
    }

    @Field(8)
    public GstRTPBasePayload field_clock_rate(long field_clock_rate) {
        this.io.setNativeObjectField(this, 8, field_clock_rate);
        return this;
    }

    @Field(9)
    public int field_ts_offset() {
        return this.io.getNativeObjectField(this, 9);
    }

    @Field(9)
    public GstRTPBasePayload field_ts_offset(int field_ts_offset) {
        this.io.setNativeObjectField(this, 9, field_ts_offset);
        return this;
    }

    @Field(10)
    public long field_timestamp() {
        return this.io.getNativeObjectField(this, 10);
    }

    @Field(10)
    public GstRTPBasePayload field_timestamp(long field_timestamp) {
        this.io.setNativeObjectField(this, 10, field_timestamp);
        return this;
    }

    @Field(11)
    public short field_seqnum_offset() {
        return this.io.getNativeObjectField(this, 11);
    }

    @Field(11)
    public GstRTPBasePayload field_seqnum_offset(short field_seqnum_offset) {
        this.io.setNativeObjectField(this, 11, field_seqnum_offset);
        return this;
    }

    @Field(12)
    public int field_seqnum() {
        return this.io.getNativeObjectField(this, 12);
    }

    @Field(12)
    public GstRTPBasePayload field_seqnum(int field_seqnum) {
        this.io.setNativeObjectField(this, 12, field_seqnum);
        return this;
    }

    @Field(13)
    public long field_max_ptime() {
        return this.io.getNativeObjectField(this, 13);
    }

    @Field(13)
    public GstRTPBasePayload field_max_ptime(long field_max_ptime) {
        this.io.setNativeObjectField(this, 13, field_max_ptime);
        return this;
    }

    @Field(14)
    public long field_pt() {
        return this.io.getNativeObjectField(this, 14);
    }

    @Field(14)
    public GstRTPBasePayload field_pt(long field_pt) {
        this.io.setNativeObjectField(this, 14, field_pt);
        return this;
    }

    @Field(15)
    public long field_ssrc() {
        return this.io.getNativeObjectField(this, 15);
    }

    @Field(15)
    public GstRTPBasePayload field_ssrc(long field_ssrc) {
        this.io.setNativeObjectField(this, 15, field_ssrc);
        return this;
    }

    @Field(16)
    public long field_current_ssrc() {
        return this.io.getNativeObjectField(this, 16);
    }

    @Field(16)
    public GstRTPBasePayload field_current_ssrc(long field_current_ssrc) {
        this.io.setNativeObjectField(this, 16, field_current_ssrc);
        return this;
    }

    @Field(17)
    public long field_mtu() {
        return this.io.getNativeObjectField(this, 17);
    }

    @Field(17)
    public GstRTPBasePayload field_mtu(long field_mtu) {
        this.io.setNativeObjectField(this, 17, field_mtu);
        return this;
    }

    @Field(18)
    public GstSegment field_segment() {
        return this.io.getNativeObjectField(this, 18);
    }

    @Field(18)
    public GstRTPBasePayload field_segment(GstSegment field_segment) {
        this.io.setNativeObjectField(this, 18, field_segment);
        return this;
    }

    @Field(19)
    public long field_min_ptime() {
        return this.io.getNativeObjectField(this, 19);
    }

    @Field(19)
    public GstRTPBasePayload field_min_ptime(long field_min_ptime) {
        this.io.setNativeObjectField(this, 19, field_min_ptime);
        return this;
    }

    @Field(20)
    public long field_ptime() {
        return this.io.getNativeObjectField(this, 20);
    }

    @Field(20)
    public GstRTPBasePayload field_ptime(long field_ptime) {
        this.io.setNativeObjectField(this, 20, field_ptime);
        return this;
    }

    @Field(21)
    public long field_ptime_multiple() {
        return this.io.getNativeObjectField(this, 21);
    }

    @Field(21)
    public GstRTPBasePayload field_ptime_multiple(long field_ptime_multiple) {
        this.io.setNativeObjectField(this, 21, field_ptime_multiple);
        return this;
    }

    @Field(22)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 22);
    }

    @Field(22)
    public GstRTPBasePayload field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 22, field_priv);
        return this;
    }

    @Field(23)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 23);
    }

    @Field(23)
    public GstRTPBasePayload field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 23, field__gst_reserved);
        return this;
    }

}
