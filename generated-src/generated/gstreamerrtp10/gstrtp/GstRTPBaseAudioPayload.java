
package generated.gstreamerrtp10.gstrtp;

import generated.gstreamer10.gst.GstFlowReturn;
import generated.gstreamerbase10.gstbase.GstAdapter;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-rtp-1.0")
public class GstRTPBaseAudioPayload
    extends StructObject
{


    public GstRTPBaseAudioPayload() {
        super();
    }

    public GstRTPBaseAudioPayload(Pointer pointer) {
        super(pointer);
    }

    protected native IntValuedEnum<GstFlowReturn> gst_rtp_base_audio_payload_flush(
        @Ptr
        long baseaudiopayload, long payload_len, Object timestamp);

    public IntValuedEnum<GstFlowReturn> flush(long payload_len, Object timestamp) {
        return this.gst_rtp_base_audio_payload_flush(Pointer.pointerTo(this, GstRTPBaseAudioPayload.class), payload_len, timestamp);
    }

    @Ptr
    protected native long gst_rtp_base_audio_payload_get_adapter(
        @Ptr
        long rtpbaseaudiopayload);

    public Pointer<GstAdapter> get_adapter() {
        return Pointer.pointerToAddress(this.gst_rtp_base_audio_payload_get_adapter(Pointer.pointerTo(this, GstRTPBaseAudioPayload.class)), Pointer.class);
    }

    protected native IntValuedEnum<GstFlowReturn> gst_rtp_base_audio_payload_push(
        @Ptr
        long baseaudiopayload,
        @Ptr
        long data, long payload_len, Object timestamp);

    public IntValuedEnum<GstFlowReturn> push(Pointer<Short> data, long payload_len, Object timestamp) {
        return this.gst_rtp_base_audio_payload_push(Pointer.pointerTo(this, GstRTPBaseAudioPayload.class), Pointer.getPeer(data), payload_len, timestamp);
    }

    protected native void gst_rtp_base_audio_payload_set_frame_based(
        @Ptr
        long rtpbaseaudiopayload);

    public void set_frame_based() {
        this.gst_rtp_base_audio_payload_set_frame_based(Pointer.pointerTo(this, GstRTPBaseAudioPayload.class));
    }

    protected native void gst_rtp_base_audio_payload_set_frame_options(
        @Ptr
        long rtpbaseaudiopayload, int frame_duration, int frame_size);

    public void set_frame_options(int frame_duration, int frame_size) {
        this.gst_rtp_base_audio_payload_set_frame_options(Pointer.pointerTo(this, GstRTPBaseAudioPayload.class), frame_duration, frame_size);
    }

    protected native void gst_rtp_base_audio_payload_set_sample_based(
        @Ptr
        long rtpbaseaudiopayload);

    public void set_sample_based() {
        this.gst_rtp_base_audio_payload_set_sample_based(Pointer.pointerTo(this, GstRTPBaseAudioPayload.class));
    }

    protected native void gst_rtp_base_audio_payload_set_sample_options(
        @Ptr
        long rtpbaseaudiopayload, int sample_size);

    public void set_sample_options(int sample_size) {
        this.gst_rtp_base_audio_payload_set_sample_options(Pointer.pointerTo(this, GstRTPBaseAudioPayload.class), sample_size);
    }

    protected native void gst_rtp_base_audio_payload_set_samplebits_options(
        @Ptr
        long rtpbaseaudiopayload, int sample_size);

    public void set_samplebits_options(int sample_size) {
        this.gst_rtp_base_audio_payload_set_samplebits_options(Pointer.pointerTo(this, GstRTPBaseAudioPayload.class), sample_size);
    }

    @Field(0)
    public int field_frame_size() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstRTPBaseAudioPayload field_frame_size(int field_frame_size) {
        this.io.setNativeObjectField(this, 0, field_frame_size);
        return this;
    }

    @Field(1)
    public Object field_base_ts() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GstRTPBaseAudioPayload field_base_ts(Object field_base_ts) {
        this.io.setNativeObjectField(this, 1, field_base_ts);
        return this;
    }

    @Field(2)
    public int field_sample_size() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GstRTPBaseAudioPayload field_sample_size(int field_sample_size) {
        this.io.setNativeObjectField(this, 2, field_sample_size);
        return this;
    }

    @Field(3)
    public Pointer<GstRTPBaseAudioPayloadPrivate> field_priv() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public GstRTPBaseAudioPayload field_priv(Pointer<GstRTPBaseAudioPayloadPrivate> field_priv) {
        this.io.setPointerField(this, 3, field_priv);
        return this;
    }

    @Field(4)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public GstRTPBaseAudioPayload field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 4, field__gst_reserved);
        return this;
    }

    @Field(5)
    public int field_frame_duration() {
        return this.io.getNativeObjectField(this, 5);
    }

    @Field(5)
    public GstRTPBaseAudioPayload field_frame_duration(int field_frame_duration) {
        this.io.setNativeObjectField(this, 5, field_frame_duration);
        return this;
    }

    @Field(6)
    public GstRTPBasePayload field_payload() {
        return this.io.getNativeObjectField(this, 6);
    }

    @Field(6)
    public GstRTPBaseAudioPayload field_payload(GstRTPBasePayload field_payload) {
        this.io.setNativeObjectField(this, 6, field_payload);
        return this;
    }

}
