
package generated.gstreameraudio10.gstaudio;

import generated.glib20.glib.GRecMutex;
import generated.gstreamer10.gst.GstAllocationParams;
import generated.gstreamer10.gst.GstAllocator;
import generated.gstreamer10.gst.GstBuffer;
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
public class GstAudioDecoder
    extends GstElement
{


    public GstAudioDecoder() {
        super();
    }

    public GstAudioDecoder(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long gst_audio_decoder_allocate_output_buffer(
        @Ptr
        long dec, long size);

    public Pointer<GstBuffer> allocate_output_buffer(long size) {
        return Pointer.pointerToAddress(this.gst_audio_decoder_allocate_output_buffer(Pointer.pointerTo(this, GstAudioDecoder.class), size), Pointer.class);
    }

    protected native IntValuedEnum<GstFlowReturn> gst_audio_decoder_finish_frame(
        @Ptr
        long dec,
        @Ptr
        long buf, int frames);

    public IntValuedEnum<GstFlowReturn> finish_frame(Pointer<GstBuffer> buf, int frames) {
        return this.gst_audio_decoder_finish_frame(Pointer.pointerTo(this, GstAudioDecoder.class), Pointer.getPeer(buf), frames);
    }

    protected native void gst_audio_decoder_get_allocator(
        @Ptr
        long dec,
        @Ptr
        long allocator,
        @Ptr
        long params);

    public void get_allocator(Pointer<Pointer<GstAllocator>> allocator, Pointer<GstAllocationParams> params) {
        this.gst_audio_decoder_get_allocator(Pointer.pointerTo(this, GstAudioDecoder.class), Pointer.getPeer(allocator), Pointer.getPeer(params));
    }

    @Ptr
    protected native long gst_audio_decoder_get_audio_info(
        @Ptr
        long dec);

    public Pointer get_audio_info() {
        return Pointer.pointerToAddress(this.gst_audio_decoder_get_audio_info(Pointer.pointerTo(this, GstAudioDecoder.class)));
    }

    protected native int gst_audio_decoder_get_delay(
        @Ptr
        long dec);

    public int get_delay() {
        return this.gst_audio_decoder_get_delay(Pointer.pointerTo(this, GstAudioDecoder.class));
    }

    protected native boolean gst_audio_decoder_get_drainable(
        @Ptr
        long dec);

    public boolean get_drainable() {
        return this.gst_audio_decoder_get_drainable(Pointer.pointerTo(this, GstAudioDecoder.class));
    }

    protected native int gst_audio_decoder_get_estimate_rate(
        @Ptr
        long dec);

    public int get_estimate_rate() {
        return this.gst_audio_decoder_get_estimate_rate(Pointer.pointerTo(this, GstAudioDecoder.class));
    }

    protected native void gst_audio_decoder_get_latency(
        @Ptr
        long dec,
        @Ptr
        long min,
        @Ptr
        long max);

    public void get_latency(Pointer<Object> min, Pointer<Object> max) {
        this.gst_audio_decoder_get_latency(Pointer.pointerTo(this, GstAudioDecoder.class), Pointer.getPeer(min), Pointer.getPeer(max));
    }

    protected native int gst_audio_decoder_get_max_errors(
        @Ptr
        long dec);

    public int get_max_errors() {
        return this.gst_audio_decoder_get_max_errors(Pointer.pointerTo(this, GstAudioDecoder.class));
    }

    protected native Object gst_audio_decoder_get_min_latency(
        @Ptr
        long dec);

    public Object get_min_latency() {
        return this.gst_audio_decoder_get_min_latency(Pointer.pointerTo(this, GstAudioDecoder.class));
    }

    protected native boolean gst_audio_decoder_get_needs_format(
        @Ptr
        long dec);

    public boolean get_needs_format() {
        return this.gst_audio_decoder_get_needs_format(Pointer.pointerTo(this, GstAudioDecoder.class));
    }

    protected native void gst_audio_decoder_get_parse_state(
        @Ptr
        long dec,
        @Ptr
        long sync,
        @Ptr
        long eos);

    public void get_parse_state(Pointer<Boolean> sync, Pointer<Boolean> eos) {
        this.gst_audio_decoder_get_parse_state(Pointer.pointerTo(this, GstAudioDecoder.class), Pointer.getPeer(sync), Pointer.getPeer(eos));
    }

    protected native boolean gst_audio_decoder_get_plc(
        @Ptr
        long dec);

    public boolean get_plc() {
        return this.gst_audio_decoder_get_plc(Pointer.pointerTo(this, GstAudioDecoder.class));
    }

    protected native int gst_audio_decoder_get_plc_aware(
        @Ptr
        long dec);

    public int get_plc_aware() {
        return this.gst_audio_decoder_get_plc_aware(Pointer.pointerTo(this, GstAudioDecoder.class));
    }

    protected native Object gst_audio_decoder_get_tolerance(
        @Ptr
        long dec);

    public Object get_tolerance() {
        return this.gst_audio_decoder_get_tolerance(Pointer.pointerTo(this, GstAudioDecoder.class));
    }

    protected native void gst_audio_decoder_merge_tags(
        @Ptr
        long dec,
        @Ptr
        long tags, IntValuedEnum<GstTagMergeMode> mode);

    public void merge_tags(Pointer<GstTagList> tags, IntValuedEnum<GstTagMergeMode> mode) {
        this.gst_audio_decoder_merge_tags(Pointer.pointerTo(this, GstAudioDecoder.class), Pointer.getPeer(tags), mode);
    }

    protected native boolean gst_audio_decoder_negotiate(
        @Ptr
        long dec);

    public boolean negotiate() {
        return this.gst_audio_decoder_negotiate(Pointer.pointerTo(this, GstAudioDecoder.class));
    }

    protected native void gst_audio_decoder_set_drainable(
        @Ptr
        long dec, boolean enabled);

    public void set_drainable(boolean enabled) {
        this.gst_audio_decoder_set_drainable(Pointer.pointerTo(this, GstAudioDecoder.class), enabled);
    }

    protected native void gst_audio_decoder_set_estimate_rate(
        @Ptr
        long dec, boolean enabled);

    public void set_estimate_rate(boolean enabled) {
        this.gst_audio_decoder_set_estimate_rate(Pointer.pointerTo(this, GstAudioDecoder.class), enabled);
    }

    protected native void gst_audio_decoder_set_latency(
        @Ptr
        long dec, Object min, Object max);

    public void set_latency(Object min, Object max) {
        this.gst_audio_decoder_set_latency(Pointer.pointerTo(this, GstAudioDecoder.class), min, max);
    }

    protected native void gst_audio_decoder_set_max_errors(
        @Ptr
        long dec, int num);

    public void set_max_errors(int num) {
        this.gst_audio_decoder_set_max_errors(Pointer.pointerTo(this, GstAudioDecoder.class), num);
    }

    protected native void gst_audio_decoder_set_min_latency(
        @Ptr
        long dec, Object num);

    public void set_min_latency(Object num) {
        this.gst_audio_decoder_set_min_latency(Pointer.pointerTo(this, GstAudioDecoder.class), num);
    }

    protected native void gst_audio_decoder_set_needs_format(
        @Ptr
        long dec, boolean enabled);

    public void set_needs_format(boolean enabled) {
        this.gst_audio_decoder_set_needs_format(Pointer.pointerTo(this, GstAudioDecoder.class), enabled);
    }

    protected native boolean gst_audio_decoder_set_output_format(
        @Ptr
        long dec,
        @Ptr
        long info);

    public boolean set_output_format(Pointer info) {
        return this.gst_audio_decoder_set_output_format(Pointer.pointerTo(this, GstAudioDecoder.class), Pointer.getPeer(info));
    }

    protected native void gst_audio_decoder_set_plc(
        @Ptr
        long dec, boolean enabled);

    public void set_plc(boolean enabled) {
        this.gst_audio_decoder_set_plc(Pointer.pointerTo(this, GstAudioDecoder.class), enabled);
    }

    protected native void gst_audio_decoder_set_plc_aware(
        @Ptr
        long dec, boolean plc);

    public void set_plc_aware(boolean plc) {
        this.gst_audio_decoder_set_plc_aware(Pointer.pointerTo(this, GstAudioDecoder.class), plc);
    }

    protected native void gst_audio_decoder_set_tolerance(
        @Ptr
        long dec, Object tolerance);

    public void set_tolerance(Object tolerance) {
        this.gst_audio_decoder_set_tolerance(Pointer.pointerTo(this, GstAudioDecoder.class), tolerance);
    }

    @Field(0)
    public GstElement field_element() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstAudioDecoder field_element(GstElement field_element) {
        this.io.setNativeObjectField(this, 0, field_element);
        return this;
    }

    @Field(1)
    public Pointer<GstPad> field_sinkpad() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstAudioDecoder field_sinkpad(Pointer<GstPad> field_sinkpad) {
        this.io.setPointerField(this, 1, field_sinkpad);
        return this;
    }

    @Field(2)
    public Pointer<GstPad> field_srcpad() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GstAudioDecoder field_srcpad(Pointer<GstPad> field_srcpad) {
        this.io.setPointerField(this, 2, field_srcpad);
        return this;
    }

    @Field(3)
    public GRecMutex field_stream_lock() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GstAudioDecoder field_stream_lock(GRecMutex field_stream_lock) {
        this.io.setNativeObjectField(this, 3, field_stream_lock);
        return this;
    }

    @Field(4)
    public GstSegment field_input_segment() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    public GstAudioDecoder field_input_segment(GstSegment field_input_segment) {
        this.io.setNativeObjectField(this, 4, field_input_segment);
        return this;
    }

    @Field(5)
    public GstSegment field_output_segment() {
        return this.io.getNativeObjectField(this, 5);
    }

    @Field(5)
    public GstAudioDecoder field_output_segment(GstSegment field_output_segment) {
        this.io.setNativeObjectField(this, 5, field_output_segment);
        return this;
    }

    @Field(6)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 6);
    }

    @Field(6)
    public GstAudioDecoder field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 6, field_priv);
        return this;
    }

    @Field(7)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 7);
    }

    @Field(7)
    public GstAudioDecoder field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 7, field__gst_reserved);
        return this;
    }

}
