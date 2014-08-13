
package generated.gstreamerbase10.gstbase;

import generated.glib20.glib.GCond;
import generated.gstreamer10.gst.GstAllocationParams;
import generated.gstreamer10.gst.GstAllocator;
import generated.gstreamer10.gst.GstBufferPool;
import generated.gstreamer10.gst.GstCaps;
import generated.gstreamer10.gst.GstElement;
import generated.gstreamer10.gst.GstEvent;
import generated.gstreamer10.gst.GstFlowReturn;
import generated.gstreamer10.gst.GstFormat;
import generated.gstreamer10.gst.GstPad;
import generated.gstreamer10.gst.GstSegment;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-base-1.0")
public class GstBaseSrc
    extends GstElement
{


    public GstBaseSrc() {
        super();
    }

    public GstBaseSrc(Pointer pointer) {
        super(pointer);
    }

    protected native void gst_base_src_get_allocator(
        @Ptr
        long src,
        @Ptr
        long allocator,
        @Ptr
        long params);

    public void get_allocator(Pointer<Pointer<GstAllocator>> allocator, Pointer<GstAllocationParams> params) {
        this.gst_base_src_get_allocator(Pointer.pointerTo(this, GstBaseSrc.class), Pointer.getPeer(allocator), Pointer.getPeer(params));
    }

    protected native long gst_base_src_get_blocksize(
        @Ptr
        long src);

    public long get_blocksize() {
        return this.gst_base_src_get_blocksize(Pointer.pointerTo(this, GstBaseSrc.class));
    }

    @Ptr
    protected native long gst_base_src_get_buffer_pool(
        @Ptr
        long src);

    public Pointer<GstBufferPool> get_buffer_pool() {
        return Pointer.pointerToAddress(this.gst_base_src_get_buffer_pool(Pointer.pointerTo(this, GstBaseSrc.class)), Pointer.class);
    }

    protected native boolean gst_base_src_get_do_timestamp(
        @Ptr
        long src);

    public boolean get_do_timestamp() {
        return this.gst_base_src_get_do_timestamp(Pointer.pointerTo(this, GstBaseSrc.class));
    }

    protected native boolean gst_base_src_is_async(
        @Ptr
        long src);

    public boolean is_async() {
        return this.gst_base_src_is_async(Pointer.pointerTo(this, GstBaseSrc.class));
    }

    protected native boolean gst_base_src_is_live(
        @Ptr
        long src);

    public boolean is_live() {
        return this.gst_base_src_is_live(Pointer.pointerTo(this, GstBaseSrc.class));
    }

    protected native boolean gst_base_src_new_seamless_segment(
        @Ptr
        long src, long start, long stop, long time);

    public boolean new_seamless_segment(long start, long stop, long time) {
        return this.gst_base_src_new_seamless_segment(Pointer.pointerTo(this, GstBaseSrc.class), start, stop, time);
    }

    protected native boolean gst_base_src_query_latency(
        @Ptr
        long src,
        @Ptr
        long live,
        @Ptr
        long min_latency,
        @Ptr
        long max_latency);

    public boolean query_latency(Pointer<Boolean> live, Pointer<Object> min_latency, Pointer<Object> max_latency) {
        return this.gst_base_src_query_latency(Pointer.pointerTo(this, GstBaseSrc.class), Pointer.getPeer(live), Pointer.getPeer(min_latency), Pointer.getPeer(max_latency));
    }

    protected native void gst_base_src_set_async(
        @Ptr
        long src, boolean async);

    public void set_async(boolean async) {
        this.gst_base_src_set_async(Pointer.pointerTo(this, GstBaseSrc.class), async);
    }

    protected native void gst_base_src_set_blocksize(
        @Ptr
        long src, long blocksize);

    public void set_blocksize(long blocksize) {
        this.gst_base_src_set_blocksize(Pointer.pointerTo(this, GstBaseSrc.class), blocksize);
    }

    protected native boolean gst_base_src_set_caps(
        @Ptr
        long src,
        @Ptr
        long caps);

    public boolean set_caps(Pointer<GstCaps> caps) {
        return this.gst_base_src_set_caps(Pointer.pointerTo(this, GstBaseSrc.class), Pointer.getPeer(caps));
    }

    protected native void gst_base_src_set_do_timestamp(
        @Ptr
        long src, boolean timestamp);

    public void set_do_timestamp(boolean timestamp) {
        this.gst_base_src_set_do_timestamp(Pointer.pointerTo(this, GstBaseSrc.class), timestamp);
    }

    protected native void gst_base_src_set_dynamic_size(
        @Ptr
        long src, boolean dynamic);

    public void set_dynamic_size(boolean dynamic) {
        this.gst_base_src_set_dynamic_size(Pointer.pointerTo(this, GstBaseSrc.class), dynamic);
    }

    protected native void gst_base_src_set_format(
        @Ptr
        long src, IntValuedEnum<GstFormat> format);

    public void set_format(IntValuedEnum<GstFormat> format) {
        this.gst_base_src_set_format(Pointer.pointerTo(this, GstBaseSrc.class), format);
    }

    protected native void gst_base_src_set_live(
        @Ptr
        long src, boolean live);

    public void set_live(boolean live) {
        this.gst_base_src_set_live(Pointer.pointerTo(this, GstBaseSrc.class), live);
    }

    protected native void gst_base_src_start_complete(
        @Ptr
        long basesrc, IntValuedEnum<GstFlowReturn> ret);

    public void start_complete(IntValuedEnum<GstFlowReturn> ret) {
        this.gst_base_src_start_complete(Pointer.pointerTo(this, GstBaseSrc.class), ret);
    }

    protected native IntValuedEnum<GstFlowReturn> gst_base_src_start_wait(
        @Ptr
        long basesrc);

    public IntValuedEnum<GstFlowReturn> start_wait() {
        return this.gst_base_src_start_wait(Pointer.pointerTo(this, GstBaseSrc.class));
    }

    protected native IntValuedEnum<GstFlowReturn> gst_base_src_wait_playing(
        @Ptr
        long src);

    public IntValuedEnum<GstFlowReturn> wait_playing() {
        return this.gst_base_src_wait_playing(Pointer.pointerTo(this, GstBaseSrc.class));
    }

    @Field(0)
    public GstElement field_element() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstBaseSrc field_element(GstElement field_element) {
        this.io.setNativeObjectField(this, 0, field_element);
        return this;
    }

    @Field(1)
    public Pointer<GstPad> field_srcpad() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstBaseSrc field_srcpad(Pointer<GstPad> field_srcpad) {
        this.io.setPointerField(this, 1, field_srcpad);
        return this;
    }

    @Field(2)
    public Object field_live_lock() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GstBaseSrc field_live_lock(Object field_live_lock) {
        this.io.setNativeObjectField(this, 2, field_live_lock);
        return this;
    }

    @Field(3)
    public GCond field_live_cond() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GstBaseSrc field_live_cond(GCond field_live_cond) {
        this.io.setNativeObjectField(this, 3, field_live_cond);
        return this;
    }

    @Field(4)
    public boolean field_is_live() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    public GstBaseSrc field_is_live(boolean field_is_live) {
        this.io.setNativeObjectField(this, 4, field_is_live);
        return this;
    }

    @Field(5)
    public boolean field_live_running() {
        return this.io.getNativeObjectField(this, 5);
    }

    @Field(5)
    public GstBaseSrc field_live_running(boolean field_live_running) {
        this.io.setNativeObjectField(this, 5, field_live_running);
        return this;
    }

    @Field(6)
    public long field_blocksize() {
        return this.io.getNativeObjectField(this, 6);
    }

    @Field(6)
    public GstBaseSrc field_blocksize(long field_blocksize) {
        this.io.setNativeObjectField(this, 6, field_blocksize);
        return this;
    }

    @Field(7)
    public boolean field_can_activate_push() {
        return this.io.getNativeObjectField(this, 7);
    }

    @Field(7)
    public GstBaseSrc field_can_activate_push(boolean field_can_activate_push) {
        this.io.setNativeObjectField(this, 7, field_can_activate_push);
        return this;
    }

    @Field(8)
    public boolean field_random_access() {
        return this.io.getNativeObjectField(this, 8);
    }

    @Field(8)
    public GstBaseSrc field_random_access(boolean field_random_access) {
        this.io.setNativeObjectField(this, 8, field_random_access);
        return this;
    }

    @Field(9)
    public Object field_clock_id() {
        return this.io.getNativeObjectField(this, 9);
    }

    @Field(9)
    public GstBaseSrc field_clock_id(Object field_clock_id) {
        this.io.setNativeObjectField(this, 9, field_clock_id);
        return this;
    }

    @Field(10)
    public GstSegment field_segment() {
        return this.io.getNativeObjectField(this, 10);
    }

    @Field(10)
    public GstBaseSrc field_segment(GstSegment field_segment) {
        this.io.setNativeObjectField(this, 10, field_segment);
        return this;
    }

    @Field(11)
    public boolean field_need_newsegment() {
        return this.io.getNativeObjectField(this, 11);
    }

    @Field(11)
    public GstBaseSrc field_need_newsegment(boolean field_need_newsegment) {
        this.io.setNativeObjectField(this, 11, field_need_newsegment);
        return this;
    }

    @Field(12)
    public int field_num_buffers() {
        return this.io.getNativeObjectField(this, 12);
    }

    @Field(12)
    public GstBaseSrc field_num_buffers(int field_num_buffers) {
        this.io.setNativeObjectField(this, 12, field_num_buffers);
        return this;
    }

    @Field(13)
    public int field_num_buffers_left() {
        return this.io.getNativeObjectField(this, 13);
    }

    @Field(13)
    public GstBaseSrc field_num_buffers_left(int field_num_buffers_left) {
        this.io.setNativeObjectField(this, 13, field_num_buffers_left);
        return this;
    }

    @Field(14)
    public boolean field_typefind() {
        return this.io.getNativeObjectField(this, 14);
    }

    @Field(14)
    public GstBaseSrc field_typefind(boolean field_typefind) {
        this.io.setNativeObjectField(this, 14, field_typefind);
        return this;
    }

    @Field(15)
    public boolean field_running() {
        return this.io.getNativeObjectField(this, 15);
    }

    @Field(15)
    public GstBaseSrc field_running(boolean field_running) {
        this.io.setNativeObjectField(this, 15, field_running);
        return this;
    }

    @Field(16)
    public Pointer<GstEvent> field_pending_seek() {
        return this.io.getPointerField(this, 16);
    }

    @Field(16)
    public GstBaseSrc field_pending_seek(Pointer<GstEvent> field_pending_seek) {
        this.io.setPointerField(this, 16, field_pending_seek);
        return this;
    }

    @Field(17)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 17);
    }

    @Field(17)
    public GstBaseSrc field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 17, field_priv);
        return this;
    }

    @Field(18)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 18);
    }

    @Field(18)
    public GstBaseSrc field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 18, field__gst_reserved);
        return this;
    }

}
