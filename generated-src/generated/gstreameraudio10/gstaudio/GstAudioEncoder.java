
package generated.gstreameraudio10.gstaudio;

import generated.glib20.glib.GList;
import generated.glib20.glib.GRecMutex;
import generated.gstreamer10.gst.GstAllocationParams;
import generated.gstreamer10.gst.GstAllocator;
import generated.gstreamer10.gst.GstBuffer;
import generated.gstreamer10.gst.GstCaps;
import generated.gstreamer10.gst.GstElement;
import generated.gstreamer10.gst.GstFlowReturn;
import generated.gstreamer10.gst.GstPad;
import generated.gstreamer10.gst.GstSegment;
import generated.gstreamer10.gst.GstTagList;
import generated.gstreamer10.gst.GstTagMergeMode;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-audio-1.0")
public class GstAudioEncoder
    extends GstElement
{


    public GstAudioEncoder() {
        super();
    }

    public GstAudioEncoder(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long gst_audio_encoder_allocate_output_buffer(
        @Ptr
        long enc, long size);

    public Pointer<GstBuffer> allocate_output_buffer(long size) {
        return Pointer.pointerToAddress(this.gst_audio_encoder_allocate_output_buffer(Pointer.pointerTo(this, GstAudioEncoder.class), size), Pointer.class);
    }

    protected native IntValuedEnum<GstFlowReturn> gst_audio_encoder_finish_frame(
        @Ptr
        long enc,
        @Ptr
        long buffer, int samples);

    public IntValuedEnum<GstFlowReturn> finish_frame(Pointer<GstBuffer> buffer, int samples) {
        return this.gst_audio_encoder_finish_frame(Pointer.pointerTo(this, GstAudioEncoder.class), Pointer.getPeer(buffer), samples);
    }

    protected native void gst_audio_encoder_get_allocator(
        @Ptr
        long enc,
        @Ptr
        long allocator,
        @Ptr
        long params);

    public void get_allocator(Pointer<Pointer<GstAllocator>> allocator, Pointer<GstAllocationParams> params) {
        this.gst_audio_encoder_get_allocator(Pointer.pointerTo(this, GstAudioEncoder.class), Pointer.getPeer(allocator), Pointer.getPeer(params));
    }

    @Ptr
    protected native long gst_audio_encoder_get_audio_info(
        @Ptr
        long enc);

    public Pointer get_audio_info() {
        return Pointer.pointerToAddress(this.gst_audio_encoder_get_audio_info(Pointer.pointerTo(this, GstAudioEncoder.class)));
    }

    protected native boolean gst_audio_encoder_get_drainable(
        @Ptr
        long enc);

    public boolean get_drainable() {
        return this.gst_audio_encoder_get_drainable(Pointer.pointerTo(this, GstAudioEncoder.class));
    }

    protected native int gst_audio_encoder_get_frame_max(
        @Ptr
        long enc);

    public int get_frame_max() {
        return this.gst_audio_encoder_get_frame_max(Pointer.pointerTo(this, GstAudioEncoder.class));
    }

    protected native int gst_audio_encoder_get_frame_samples_max(
        @Ptr
        long enc);

    public int get_frame_samples_max() {
        return this.gst_audio_encoder_get_frame_samples_max(Pointer.pointerTo(this, GstAudioEncoder.class));
    }

    protected native int gst_audio_encoder_get_frame_samples_min(
        @Ptr
        long enc);

    public int get_frame_samples_min() {
        return this.gst_audio_encoder_get_frame_samples_min(Pointer.pointerTo(this, GstAudioEncoder.class));
    }

    protected native boolean gst_audio_encoder_get_hard_min(
        @Ptr
        long enc);

    public boolean get_hard_min() {
        return this.gst_audio_encoder_get_hard_min(Pointer.pointerTo(this, GstAudioEncoder.class));
    }

    protected native boolean gst_audio_encoder_get_hard_resync(
        @Ptr
        long enc);

    public boolean get_hard_resync() {
        return this.gst_audio_encoder_get_hard_resync(Pointer.pointerTo(this, GstAudioEncoder.class));
    }

    protected native void gst_audio_encoder_get_latency(
        @Ptr
        long enc,
        @Ptr
        long min,
        @Ptr
        long max);

    public void get_latency(Pointer<Object> min, Pointer<Object> max) {
        this.gst_audio_encoder_get_latency(Pointer.pointerTo(this, GstAudioEncoder.class), Pointer.getPeer(min), Pointer.getPeer(max));
    }

    protected native int gst_audio_encoder_get_lookahead(
        @Ptr
        long enc);

    public int get_lookahead() {
        return this.gst_audio_encoder_get_lookahead(Pointer.pointerTo(this, GstAudioEncoder.class));
    }

    protected native boolean gst_audio_encoder_get_mark_granule(
        @Ptr
        long enc);

    public boolean get_mark_granule() {
        return this.gst_audio_encoder_get_mark_granule(Pointer.pointerTo(this, GstAudioEncoder.class));
    }

    protected native boolean gst_audio_encoder_get_perfect_timestamp(
        @Ptr
        long enc);

    public boolean get_perfect_timestamp() {
        return this.gst_audio_encoder_get_perfect_timestamp(Pointer.pointerTo(this, GstAudioEncoder.class));
    }

    protected native Object gst_audio_encoder_get_tolerance(
        @Ptr
        long enc);

    public Object get_tolerance() {
        return this.gst_audio_encoder_get_tolerance(Pointer.pointerTo(this, GstAudioEncoder.class));
    }

    protected native void gst_audio_encoder_merge_tags(
        @Ptr
        long enc,
        @Ptr
        long tags, IntValuedEnum<GstTagMergeMode> mode);

    public void merge_tags(Pointer<GstTagList> tags, IntValuedEnum<GstTagMergeMode> mode) {
        this.gst_audio_encoder_merge_tags(Pointer.pointerTo(this, GstAudioEncoder.class), Pointer.getPeer(tags), mode);
    }

    protected native boolean gst_audio_encoder_negotiate(
        @Ptr
        long enc);

    public boolean negotiate() {
        return this.gst_audio_encoder_negotiate(Pointer.pointerTo(this, GstAudioEncoder.class));
    }

    @Ptr
    protected native long gst_audio_encoder_proxy_getcaps(
        @Ptr
        long enc,
        @Ptr
        long caps,
        @Ptr
        long filter);

    public Pointer<GstCaps> proxy_getcaps(Pointer<GstCaps> caps, Pointer<GstCaps> filter) {
        return Pointer.pointerToAddress(this.gst_audio_encoder_proxy_getcaps(Pointer.pointerTo(this, GstAudioEncoder.class), Pointer.getPeer(caps), Pointer.getPeer(filter)), Pointer.class);
    }

    protected native void gst_audio_encoder_set_drainable(
        @Ptr
        long enc, boolean enabled);

    public void set_drainable(boolean enabled) {
        this.gst_audio_encoder_set_drainable(Pointer.pointerTo(this, GstAudioEncoder.class), enabled);
    }

    protected native void gst_audio_encoder_set_frame_max(
        @Ptr
        long enc, int num);

    public void set_frame_max(int num) {
        this.gst_audio_encoder_set_frame_max(Pointer.pointerTo(this, GstAudioEncoder.class), num);
    }

    protected native void gst_audio_encoder_set_frame_samples_max(
        @Ptr
        long enc, int num);

    public void set_frame_samples_max(int num) {
        this.gst_audio_encoder_set_frame_samples_max(Pointer.pointerTo(this, GstAudioEncoder.class), num);
    }

    protected native void gst_audio_encoder_set_frame_samples_min(
        @Ptr
        long enc, int num);

    public void set_frame_samples_min(int num) {
        this.gst_audio_encoder_set_frame_samples_min(Pointer.pointerTo(this, GstAudioEncoder.class), num);
    }

    protected native void gst_audio_encoder_set_hard_min(
        @Ptr
        long enc, boolean enabled);

    public void set_hard_min(boolean enabled) {
        this.gst_audio_encoder_set_hard_min(Pointer.pointerTo(this, GstAudioEncoder.class), enabled);
    }

    protected native void gst_audio_encoder_set_hard_resync(
        @Ptr
        long enc, boolean enabled);

    public void set_hard_resync(boolean enabled) {
        this.gst_audio_encoder_set_hard_resync(Pointer.pointerTo(this, GstAudioEncoder.class), enabled);
    }

    protected native void gst_audio_encoder_set_headers(
        @Ptr
        long enc,
        @Ptr
        long headers);

    public void set_headers(Pointer<GList> headers) {
        this.gst_audio_encoder_set_headers(Pointer.pointerTo(this, GstAudioEncoder.class), Pointer.getPeer(headers));
    }

    protected native void gst_audio_encoder_set_latency(
        @Ptr
        long enc, Object min, Object max);

    public void set_latency(Object min, Object max) {
        this.gst_audio_encoder_set_latency(Pointer.pointerTo(this, GstAudioEncoder.class), min, max);
    }

    protected native void gst_audio_encoder_set_lookahead(
        @Ptr
        long enc, int num);

    public void set_lookahead(int num) {
        this.gst_audio_encoder_set_lookahead(Pointer.pointerTo(this, GstAudioEncoder.class), num);
    }

    protected native void gst_audio_encoder_set_mark_granule(
        @Ptr
        long enc, boolean enabled);

    public void set_mark_granule(boolean enabled) {
        this.gst_audio_encoder_set_mark_granule(Pointer.pointerTo(this, GstAudioEncoder.class), enabled);
    }

    protected native boolean gst_audio_encoder_set_output_format(
        @Ptr
        long enc,
        @Ptr
        long caps);

    public boolean set_output_format(Pointer<GstCaps> caps) {
        return this.gst_audio_encoder_set_output_format(Pointer.pointerTo(this, GstAudioEncoder.class), Pointer.getPeer(caps));
    }

    protected native void gst_audio_encoder_set_perfect_timestamp(
        @Ptr
        long enc, boolean enabled);

    public void set_perfect_timestamp(boolean enabled) {
        this.gst_audio_encoder_set_perfect_timestamp(Pointer.pointerTo(this, GstAudioEncoder.class), enabled);
    }

    protected native void gst_audio_encoder_set_tolerance(
        @Ptr
        long enc, Object tolerance);

    public void set_tolerance(Object tolerance) {
        this.gst_audio_encoder_set_tolerance(Pointer.pointerTo(this, GstAudioEncoder.class), tolerance);
    }

    @Field(0)
    public GstElement field_element() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstAudioEncoder field_element(GstElement field_element) {
        this.io.setNativeObjectField(this, 0, field_element);
        return this;
    }

    @Field(1)
    public Pointer<GstPad> field_sinkpad() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstAudioEncoder field_sinkpad(Pointer<GstPad> field_sinkpad) {
        this.io.setPointerField(this, 1, field_sinkpad);
        return this;
    }

    @Field(2)
    public Pointer<GstPad> field_srcpad() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GstAudioEncoder field_srcpad(Pointer<GstPad> field_srcpad) {
        this.io.setPointerField(this, 2, field_srcpad);
        return this;
    }

    @Field(3)
    public GRecMutex field_stream_lock() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GstAudioEncoder field_stream_lock(GRecMutex field_stream_lock) {
        this.io.setNativeObjectField(this, 3, field_stream_lock);
        return this;
    }

    @Field(4)
    public GstSegment field_input_segment() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    public GstAudioEncoder field_input_segment(GstSegment field_input_segment) {
        this.io.setNativeObjectField(this, 4, field_input_segment);
        return this;
    }

    @Field(5)
    public GstSegment field_output_segment() {
        return this.io.getNativeObjectField(this, 5);
    }

    @Field(5)
    public GstAudioEncoder field_output_segment(GstSegment field_output_segment) {
        this.io.setNativeObjectField(this, 5, field_output_segment);
        return this;
    }

    @Field(6)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 6);
    }

    @Field(6)
    public GstAudioEncoder field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 6, field_priv);
        return this;
    }

    @Field(7)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 7);
    }

    @Field(7)
    public GstAudioEncoder field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 7, field__gst_reserved);
        return this;
    }

}
