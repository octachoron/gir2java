
package generated.gstreameraudio10.gstaudio;

import generated.glib20.glib.GCond;
import generated.gstreamer10.gst.GstCaps;
import generated.gstreamer10.gst.GstFormat;
import generated.gstreamer10.gst.GstObject;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-audio-1.0")
public class GstAudioRingBuffer
    extends GstObject
{


    public GstAudioRingBuffer() {
        super();
    }

    public GstAudioRingBuffer(Pointer pointer) {
        super(pointer);
    }

    protected native void gst_audio_ring_buffer_debug_spec_buff(
        @Ptr
        long spec);

    public void debug_spec_buff(Pointer spec) {
        this.gst_audio_ring_buffer_debug_spec_buff(Pointer.getPeer(spec));
    }

    protected native void gst_audio_ring_buffer_debug_spec_caps(
        @Ptr
        long spec);

    public void debug_spec_caps(Pointer spec) {
        this.gst_audio_ring_buffer_debug_spec_caps(Pointer.getPeer(spec));
    }

    protected native boolean gst_audio_ring_buffer_parse_caps(
        @Ptr
        long spec,
        @Ptr
        long caps);

    public boolean parse_caps(Pointer spec, Pointer<GstCaps> caps) {
        return this.gst_audio_ring_buffer_parse_caps(Pointer.getPeer(spec), Pointer.getPeer(caps));
    }

    protected native boolean gst_audio_ring_buffer_acquire(
        @Ptr
        long buf,
        @Ptr
        long spec);

    public boolean acquire(Pointer spec) {
        return this.gst_audio_ring_buffer_acquire(Pointer.pointerTo(this, GstAudioRingBuffer.class), Pointer.getPeer(spec));
    }

    protected native boolean gst_audio_ring_buffer_activate(
        @Ptr
        long buf, boolean active);

    public boolean activate(boolean active) {
        return this.gst_audio_ring_buffer_activate(Pointer.pointerTo(this, GstAudioRingBuffer.class), active);
    }

    protected native void gst_audio_ring_buffer_advance(
        @Ptr
        long buf, long advance);

    public void advance(long advance) {
        this.gst_audio_ring_buffer_advance(Pointer.pointerTo(this, GstAudioRingBuffer.class), advance);
    }

    protected native void gst_audio_ring_buffer_clear(
        @Ptr
        long buf, int segment);

    public void clear(int segment) {
        this.gst_audio_ring_buffer_clear(Pointer.pointerTo(this, GstAudioRingBuffer.class), segment);
    }

    protected native void gst_audio_ring_buffer_clear_all(
        @Ptr
        long buf);

    public void clear_all() {
        this.gst_audio_ring_buffer_clear_all(Pointer.pointerTo(this, GstAudioRingBuffer.class));
    }

    protected native boolean gst_audio_ring_buffer_close_device(
        @Ptr
        long buf);

    public boolean close_device() {
        return this.gst_audio_ring_buffer_close_device(Pointer.pointerTo(this, GstAudioRingBuffer.class));
    }

    protected native long gst_audio_ring_buffer_commit(
        @Ptr
        long buf,
        @Ptr
        long sample,
        @Ptr
        long data, int in_samples, int out_samples,
        @Ptr
        long accum);

    public long commit(Pointer<Long> sample, Pointer<Short> data, int in_samples, int out_samples, Pointer<Integer> accum) {
        return this.gst_audio_ring_buffer_commit(Pointer.pointerTo(this, GstAudioRingBuffer.class), Pointer.getPeer(sample), Pointer.getPeer(data), in_samples, out_samples, Pointer.getPeer(accum));
    }

    protected native boolean gst_audio_ring_buffer_convert(
        @Ptr
        long buf, IntValuedEnum<GstFormat> src_fmt, long src_val, IntValuedEnum<GstFormat> dest_fmt,
        @Ptr
        long dest_val);

    public boolean convert(IntValuedEnum<GstFormat> src_fmt, long src_val, IntValuedEnum<GstFormat> dest_fmt, Pointer<Long> dest_val) {
        return this.gst_audio_ring_buffer_convert(Pointer.pointerTo(this, GstAudioRingBuffer.class), src_fmt, src_val, dest_fmt, Pointer.getPeer(dest_val));
    }

    protected native long gst_audio_ring_buffer_delay(
        @Ptr
        long buf);

    public long delay() {
        return this.gst_audio_ring_buffer_delay(Pointer.pointerTo(this, GstAudioRingBuffer.class));
    }

    protected native boolean gst_audio_ring_buffer_device_is_open(
        @Ptr
        long buf);

    public boolean device_is_open() {
        return this.gst_audio_ring_buffer_device_is_open(Pointer.pointerTo(this, GstAudioRingBuffer.class));
    }

    protected native boolean gst_audio_ring_buffer_is_acquired(
        @Ptr
        long buf);

    public boolean is_acquired() {
        return this.gst_audio_ring_buffer_is_acquired(Pointer.pointerTo(this, GstAudioRingBuffer.class));
    }

    protected native boolean gst_audio_ring_buffer_is_active(
        @Ptr
        long buf);

    public boolean is_active() {
        return this.gst_audio_ring_buffer_is_active(Pointer.pointerTo(this, GstAudioRingBuffer.class));
    }

    protected native boolean gst_audio_ring_buffer_is_flushing(
        @Ptr
        long buf);

    public boolean is_flushing() {
        return this.gst_audio_ring_buffer_is_flushing(Pointer.pointerTo(this, GstAudioRingBuffer.class));
    }

    protected native void gst_audio_ring_buffer_may_start(
        @Ptr
        long buf, boolean allowed);

    public void may_start(boolean allowed) {
        this.gst_audio_ring_buffer_may_start(Pointer.pointerTo(this, GstAudioRingBuffer.class), allowed);
    }

    protected native boolean gst_audio_ring_buffer_open_device(
        @Ptr
        long buf);

    public boolean open_device() {
        return this.gst_audio_ring_buffer_open_device(Pointer.pointerTo(this, GstAudioRingBuffer.class));
    }

    protected native boolean gst_audio_ring_buffer_pause(
        @Ptr
        long buf);

    public boolean pause() {
        return this.gst_audio_ring_buffer_pause(Pointer.pointerTo(this, GstAudioRingBuffer.class));
    }

    protected native boolean gst_audio_ring_buffer_prepare_read(
        @Ptr
        long buf,
        @Ptr
        long segment,
        @Ptr
        long readptr,
        @Ptr
        long len);

    public boolean prepare_read(Pointer<Integer> segment, Pointer<Pointer<Short>> readptr, Pointer<Integer> len) {
        return this.gst_audio_ring_buffer_prepare_read(Pointer.pointerTo(this, GstAudioRingBuffer.class), Pointer.getPeer(segment), Pointer.getPeer(readptr), Pointer.getPeer(len));
    }

    protected native long gst_audio_ring_buffer_read(
        @Ptr
        long buf, long sample,
        @Ptr
        long data, long len,
        @Ptr
        long timestamp);

    public long read(long sample, Pointer<Short> data, long len, Pointer<Object> timestamp) {
        return this.gst_audio_ring_buffer_read(Pointer.pointerTo(this, GstAudioRingBuffer.class), sample, Pointer.getPeer(data), len, Pointer.getPeer(timestamp));
    }

    protected native boolean gst_audio_ring_buffer_release(
        @Ptr
        long buf);

    public boolean release() {
        return this.gst_audio_ring_buffer_release(Pointer.pointerTo(this, GstAudioRingBuffer.class));
    }

    protected native long gst_audio_ring_buffer_samples_done(
        @Ptr
        long buf);

    public long samples_done() {
        return this.gst_audio_ring_buffer_samples_done(Pointer.pointerTo(this, GstAudioRingBuffer.class));
    }

    protected native void gst_audio_ring_buffer_set_channel_positions(
        @Ptr
        long buf,
        @Ptr
        long position);

    public void set_channel_positions(Pointer<IntValuedEnum<GstAudioChannelPosition>> position) {
        this.gst_audio_ring_buffer_set_channel_positions(Pointer.pointerTo(this, GstAudioRingBuffer.class), Pointer.getPeer(position));
    }

    protected native void gst_audio_ring_buffer_set_flushing(
        @Ptr
        long buf, boolean flushing);

    public void set_flushing(boolean flushing) {
        this.gst_audio_ring_buffer_set_flushing(Pointer.pointerTo(this, GstAudioRingBuffer.class), flushing);
    }

    protected native void gst_audio_ring_buffer_set_sample(
        @Ptr
        long buf, long sample);

    public void set_sample(long sample) {
        this.gst_audio_ring_buffer_set_sample(Pointer.pointerTo(this, GstAudioRingBuffer.class), sample);
    }

    protected native void gst_audio_ring_buffer_set_timestamp(
        @Ptr
        long buf, int readseg, Object timestamp);

    public void set_timestamp(int readseg, Object timestamp) {
        this.gst_audio_ring_buffer_set_timestamp(Pointer.pointerTo(this, GstAudioRingBuffer.class), readseg, timestamp);
    }

    protected native boolean gst_audio_ring_buffer_start(
        @Ptr
        long buf);

    public boolean start() {
        return this.gst_audio_ring_buffer_start(Pointer.pointerTo(this, GstAudioRingBuffer.class));
    }

    protected native boolean gst_audio_ring_buffer_stop(
        @Ptr
        long buf);

    public boolean stop() {
        return this.gst_audio_ring_buffer_stop(Pointer.pointerTo(this, GstAudioRingBuffer.class));
    }

    @Field(0)
    public GstObject field_object() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstAudioRingBuffer field_object(GstObject field_object) {
        this.io.setNativeObjectField(this, 0, field_object);
        return this;
    }

    @Field(1)
    public GCond field_cond() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GstAudioRingBuffer field_cond(GCond field_cond) {
        this.io.setNativeObjectField(this, 1, field_cond);
        return this;
    }

    @Field(2)
    public boolean field_open() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GstAudioRingBuffer field_open(boolean field_open) {
        this.io.setNativeObjectField(this, 2, field_open);
        return this;
    }

    @Field(3)
    public boolean field_acquired() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GstAudioRingBuffer field_acquired(boolean field_acquired) {
        this.io.setNativeObjectField(this, 3, field_acquired);
        return this;
    }

    @Field(4)
    public Pointer<Short> field_memory() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public GstAudioRingBuffer field_memory(Pointer<Short> field_memory) {
        this.io.setPointerField(this, 4, field_memory);
        return this;
    }

    @Field(5)
    public long field_size() {
        return this.io.getNativeObjectField(this, 5);
    }

    @Field(5)
    public GstAudioRingBuffer field_size(long field_size) {
        this.io.setNativeObjectField(this, 5, field_size);
        return this;
    }

    @Field(6)
    public Pointer<Object> field_timestamps() {
        return this.io.getPointerField(this, 6);
    }

    @Field(6)
    public GstAudioRingBuffer field_timestamps(Pointer<Object> field_timestamps) {
        this.io.setPointerField(this, 6, field_timestamps);
        return this;
    }

    protected native void gst_audio_ring_buffer_set_callback(
        @Ptr
        long buf, Object cb, Pointer user_data);

    public void set_callback(Object cb, Pointer user_data) {
        this.gst_audio_ring_buffer_set_callback(Pointer.pointerTo(this, GstAudioRingBuffer.class), cb, user_data);
    }

    @Field(7)
    public Object field_callback() {
        return this.io.getNativeObjectField(this, 7);
    }

    @Field(7)
    public GstAudioRingBuffer field_callback(Object field_callback) {
        this.io.setNativeObjectField(this, 7, field_callback);
        return this;
    }

    @Field(8)
    public Pointer field_cb_data() {
        return this.io.getNativeObjectField(this, 8);
    }

    @Field(8)
    public GstAudioRingBuffer field_cb_data(Pointer field_cb_data) {
        this.io.setNativeObjectField(this, 8, field_cb_data);
        return this;
    }

    @Field(9)
    public int field_segbase() {
        return this.io.getNativeObjectField(this, 9);
    }

    @Field(9)
    public GstAudioRingBuffer field_segbase(int field_segbase) {
        this.io.setNativeObjectField(this, 9, field_segbase);
        return this;
    }

    @Field(10)
    public int field_waiting() {
        return this.io.getNativeObjectField(this, 10);
    }

    @Field(10)
    public GstAudioRingBuffer field_waiting(int field_waiting) {
        this.io.setNativeObjectField(this, 10, field_waiting);
        return this;
    }

    @Field(11)
    public int field_samples_per_seg() {
        return this.io.getNativeObjectField(this, 11);
    }

    @Field(11)
    public GstAudioRingBuffer field_samples_per_seg(int field_samples_per_seg) {
        this.io.setNativeObjectField(this, 11, field_samples_per_seg);
        return this;
    }

    @Field(12)
    public Pointer<Short> field_empty_seg() {
        return this.io.getPointerField(this, 12);
    }

    @Field(12)
    public GstAudioRingBuffer field_empty_seg(Pointer<Short> field_empty_seg) {
        this.io.setPointerField(this, 12, field_empty_seg);
        return this;
    }

    @Field(13)
    public int field_channel_reorder_map() {
        return this.io.getPointerField(this, 13);
    }

    @Field(13)
    public GstAudioRingBuffer field_channel_reorder_map(int field_channel_reorder_map) {
        this.io.setPointerField(this, 13, field_channel_reorder_map);
        return this;
    }

    @Field(14)
    public int field_may_start() {
        return this.io.getNativeObjectField(this, 14);
    }

    @Field(14)
    public GstAudioRingBuffer field_may_start(int field_may_start) {
        this.io.setNativeObjectField(this, 14, field_may_start);
        return this;
    }

    @Field(15)
    public boolean field_flushing() {
        return this.io.getNativeObjectField(this, 15);
    }

    @Field(15)
    public GstAudioRingBuffer field_flushing(boolean field_flushing) {
        this.io.setNativeObjectField(this, 15, field_flushing);
        return this;
    }

    @Field(16)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 16);
    }

    @Field(16)
    public GstAudioRingBuffer field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 16, field__gst_reserved);
        return this;
    }

    @Field(17)
    public int field_state() {
        return this.io.getNativeObjectField(this, 17);
    }

    @Field(17)
    public GstAudioRingBuffer field_state(int field_state) {
        this.io.setNativeObjectField(this, 17, field_state);
        return this;
    }

    @Field(18)
    public GstAudioRingBufferSpec field_spec() {
        return this.io.getNativeObjectField(this, 18);
    }

    @Field(18)
    public GstAudioRingBuffer field_spec(GstAudioRingBufferSpec field_spec) {
        this.io.setNativeObjectField(this, 18, field_spec);
        return this;
    }

    @Field(19)
    public int field_segdone() {
        return this.io.getNativeObjectField(this, 19);
    }

    @Field(19)
    public GstAudioRingBuffer field_segdone(int field_segdone) {
        this.io.setNativeObjectField(this, 19, field_segdone);
        return this;
    }

    @Field(20)
    public boolean field_active() {
        return this.io.getNativeObjectField(this, 20);
    }

    @Field(20)
    public GstAudioRingBuffer field_active(boolean field_active) {
        this.io.setNativeObjectField(this, 20, field_active);
        return this;
    }

    @Field(21)
    public boolean field_need_reorder() {
        return this.io.getNativeObjectField(this, 21);
    }

    @Field(21)
    public GstAudioRingBuffer field_need_reorder(boolean field_need_reorder) {
        this.io.setNativeObjectField(this, 21, field_need_reorder);
        return this;
    }

}
