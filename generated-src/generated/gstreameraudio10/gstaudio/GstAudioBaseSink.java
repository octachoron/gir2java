
package generated.gstreameraudio10.gstaudio;

import generated.gstreamer10.gst.GstClock;
import generated.gstreamerbase10.gstbase.GstBaseSink;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-audio-1.0")
public class GstAudioBaseSink
    extends GstBaseSink
{


    public GstAudioBaseSink() {
        super();
    }

    public GstAudioBaseSink(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long gst_audio_base_sink_create_ringbuffer(
        @Ptr
        long sink);

    public Pointer create_ringbuffer() {
        return Pointer.pointerToAddress(this.gst_audio_base_sink_create_ringbuffer(Pointer.pointerTo(this, GstAudioBaseSink.class)));
    }

    protected native Object gst_audio_base_sink_get_alignment_threshold(
        @Ptr
        long sink);

    public Object get_alignment_threshold() {
        return this.gst_audio_base_sink_get_alignment_threshold(Pointer.pointerTo(this, GstAudioBaseSink.class));
    }

    protected native Object gst_audio_base_sink_get_discont_wait(
        @Ptr
        long sink);

    public Object get_discont_wait() {
        return this.gst_audio_base_sink_get_discont_wait(Pointer.pointerTo(this, GstAudioBaseSink.class));
    }

    protected native long gst_audio_base_sink_get_drift_tolerance(
        @Ptr
        long sink);

    public long get_drift_tolerance() {
        return this.gst_audio_base_sink_get_drift_tolerance(Pointer.pointerTo(this, GstAudioBaseSink.class));
    }

    protected native boolean gst_audio_base_sink_get_provide_clock(
        @Ptr
        long sink);

    public boolean get_provide_clock() {
        return this.gst_audio_base_sink_get_provide_clock(Pointer.pointerTo(this, GstAudioBaseSink.class));
    }

    protected native void gst_audio_base_sink_set_alignment_threshold(
        @Ptr
        long sink, Object alignment_threshold);

    public void set_alignment_threshold(Object alignment_threshold) {
        this.gst_audio_base_sink_set_alignment_threshold(Pointer.pointerTo(this, GstAudioBaseSink.class), alignment_threshold);
    }

    protected native void gst_audio_base_sink_set_discont_wait(
        @Ptr
        long sink, Object discont_wait);

    public void set_discont_wait(Object discont_wait) {
        this.gst_audio_base_sink_set_discont_wait(Pointer.pointerTo(this, GstAudioBaseSink.class), discont_wait);
    }

    protected native void gst_audio_base_sink_set_drift_tolerance(
        @Ptr
        long sink, long drift_tolerance);

    public void set_drift_tolerance(long drift_tolerance) {
        this.gst_audio_base_sink_set_drift_tolerance(Pointer.pointerTo(this, GstAudioBaseSink.class), drift_tolerance);
    }

    protected native void gst_audio_base_sink_set_provide_clock(
        @Ptr
        long sink, boolean provide);

    public void set_provide_clock(boolean provide) {
        this.gst_audio_base_sink_set_provide_clock(Pointer.pointerTo(this, GstAudioBaseSink.class), provide);
    }

    @Field(0)
    public GstBaseSink field_element() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstAudioBaseSink field_element(GstBaseSink field_element) {
        this.io.setNativeObjectField(this, 0, field_element);
        return this;
    }

    @Field(1)
    public Pointer field_ringbuffer() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstAudioBaseSink field_ringbuffer(Pointer field_ringbuffer) {
        this.io.setPointerField(this, 1, field_ringbuffer);
        return this;
    }

    @Field(2)
    public long field_buffer_time() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GstAudioBaseSink field_buffer_time(long field_buffer_time) {
        this.io.setNativeObjectField(this, 2, field_buffer_time);
        return this;
    }

    @Field(3)
    public long field_latency_time() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GstAudioBaseSink field_latency_time(long field_latency_time) {
        this.io.setNativeObjectField(this, 3, field_latency_time);
        return this;
    }

    @Field(4)
    public long field_next_sample() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    public GstAudioBaseSink field_next_sample(long field_next_sample) {
        this.io.setNativeObjectField(this, 4, field_next_sample);
        return this;
    }

    @Field(5)
    public Pointer<GstClock> field_provided_clock() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    public GstAudioBaseSink field_provided_clock(Pointer<GstClock> field_provided_clock) {
        this.io.setPointerField(this, 5, field_provided_clock);
        return this;
    }

    @Field(6)
    public boolean field_eos_rendering() {
        return this.io.getNativeObjectField(this, 6);
    }

    @Field(6)
    public GstAudioBaseSink field_eos_rendering(boolean field_eos_rendering) {
        this.io.setNativeObjectField(this, 6, field_eos_rendering);
        return this;
    }

    @Field(7)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 7);
    }

    @Field(7)
    public GstAudioBaseSink field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 7, field_priv);
        return this;
    }

    @Field(8)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 8);
    }

    @Field(8)
    public GstAudioBaseSink field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 8, field__gst_reserved);
        return this;
    }

    protected native void gst_audio_base_sink_set_slave_method(
        @Ptr
        long sink, IntValuedEnum<GstAudioBaseSinkSlaveMethod> method);

    public void set_slave_method(IntValuedEnum<GstAudioBaseSinkSlaveMethod> method) {
        this.gst_audio_base_sink_set_slave_method(Pointer.pointerTo(this, GstAudioBaseSink.class), method);
    }

    protected native IntValuedEnum<GstAudioBaseSinkSlaveMethod> gst_audio_base_sink_get_slave_method(
        @Ptr
        long sink);

    public IntValuedEnum<GstAudioBaseSinkSlaveMethod> get_slave_method() {
        return this.gst_audio_base_sink_get_slave_method(Pointer.pointerTo(this, GstAudioBaseSink.class));
    }

}
