
package generated.gstreameraudio10.gstaudio;

import generated.gstreamer10.gst.GstClock;
import generated.gstreamerbase10.gstbase.GstPushSrc;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-audio-1.0")
public class GstAudioBaseSrc
    extends GstPushSrc
{


    public GstAudioBaseSrc() {
        super();
    }

    public GstAudioBaseSrc(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long gst_audio_base_src_create_ringbuffer(
        @Ptr
        long src);

    public Pointer create_ringbuffer() {
        return Pointer.pointerToAddress(this.gst_audio_base_src_create_ringbuffer(Pointer.pointerTo(this, GstAudioBaseSrc.class)));
    }

    protected native boolean gst_audio_base_src_get_provide_clock(
        @Ptr
        long src);

    public boolean get_provide_clock() {
        return this.gst_audio_base_src_get_provide_clock(Pointer.pointerTo(this, GstAudioBaseSrc.class));
    }

    protected native void gst_audio_base_src_set_provide_clock(
        @Ptr
        long src, boolean provide);

    public void set_provide_clock(boolean provide) {
        this.gst_audio_base_src_set_provide_clock(Pointer.pointerTo(this, GstAudioBaseSrc.class), provide);
    }

    @Field(0)
    public GstPushSrc field_element() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstAudioBaseSrc field_element(GstPushSrc field_element) {
        this.io.setNativeObjectField(this, 0, field_element);
        return this;
    }

    @Field(1)
    public Pointer field_ringbuffer() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstAudioBaseSrc field_ringbuffer(Pointer field_ringbuffer) {
        this.io.setPointerField(this, 1, field_ringbuffer);
        return this;
    }

    @Field(2)
    public Object field_buffer_time() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GstAudioBaseSrc field_buffer_time(Object field_buffer_time) {
        this.io.setNativeObjectField(this, 2, field_buffer_time);
        return this;
    }

    @Field(3)
    public Object field_latency_time() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GstAudioBaseSrc field_latency_time(Object field_latency_time) {
        this.io.setNativeObjectField(this, 3, field_latency_time);
        return this;
    }

    @Field(4)
    public long field_next_sample() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    public GstAudioBaseSrc field_next_sample(long field_next_sample) {
        this.io.setNativeObjectField(this, 4, field_next_sample);
        return this;
    }

    @Field(5)
    public Pointer<GstClock> field_clock() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    public GstAudioBaseSrc field_clock(Pointer<GstClock> field_clock) {
        this.io.setPointerField(this, 5, field_clock);
        return this;
    }

    @Field(6)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 6);
    }

    @Field(6)
    public GstAudioBaseSrc field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 6, field_priv);
        return this;
    }

    @Field(7)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 7);
    }

    @Field(7)
    public GstAudioBaseSrc field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 7, field__gst_reserved);
        return this;
    }

    protected native void gst_audio_base_src_set_slave_method(
        @Ptr
        long src, IntValuedEnum<GstAudioBaseSrcSlaveMethod> method);

    public void set_slave_method(IntValuedEnum<GstAudioBaseSrcSlaveMethod> method) {
        this.gst_audio_base_src_set_slave_method(Pointer.pointerTo(this, GstAudioBaseSrc.class), method);
    }

    protected native IntValuedEnum<GstAudioBaseSrcSlaveMethod> gst_audio_base_src_get_slave_method(
        @Ptr
        long src);

    public IntValuedEnum<GstAudioBaseSrcSlaveMethod> get_slave_method() {
        return this.gst_audio_base_src_get_slave_method(Pointer.pointerTo(this, GstAudioBaseSrc.class));
    }

}
