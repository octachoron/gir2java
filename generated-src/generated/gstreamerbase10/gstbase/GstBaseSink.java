
package generated.gstreamerbase10.gstbase;

import generated.glib20.glib.GCond;
import generated.glib20.glib.GMutex;
import generated.gstreamer10.gst.GstClockReturn;
import generated.gstreamer10.gst.GstElement;
import generated.gstreamer10.gst.GstFlowReturn;
import generated.gstreamer10.gst.GstMiniObject;
import generated.gstreamer10.gst.GstPad;
import generated.gstreamer10.gst.GstPadMode;
import generated.gstreamer10.gst.GstSample;
import generated.gstreamer10.gst.GstSegment;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-base-1.0")
public class GstBaseSink
    extends GstElement
{


    static {
        BridJ.register();
    }

    public GstBaseSink() {
        super();
    }

    public GstBaseSink(Pointer pointer) {
        super(pointer);
    }

    protected native IntValuedEnum<GstFlowReturn> gst_base_sink_do_preroll(
        @Ptr
        long sink,
        @Ptr
        long obj);

    public IntValuedEnum<GstFlowReturn> do_preroll(Pointer<GstMiniObject> obj) {
        return this.gst_base_sink_do_preroll(Pointer.pointerTo(this, GstBaseSink.class).getPeer(), Pointer.getPeer(obj));
    }

    protected native long gst_base_sink_get_blocksize(
        @Ptr
        long sink);

    public long get_blocksize() {
        return this.gst_base_sink_get_blocksize(Pointer.pointerTo(this, GstBaseSink.class).getPeer());
    }

    @Ptr
    protected native long gst_base_sink_get_last_sample(
        @Ptr
        long sink);

    public Pointer<GstSample> get_last_sample() {
        return Pointer.pointerToAddress(this.gst_base_sink_get_last_sample(Pointer.pointerTo(this, GstBaseSink.class).getPeer()), GstSample.class);
    }

    protected native long gst_base_sink_get_latency(
        @Ptr
        long sink);

    public long get_latency() {
        return this.gst_base_sink_get_latency(Pointer.pointerTo(this, GstBaseSink.class).getPeer());
    }

    protected native long gst_base_sink_get_max_bitrate(
        @Ptr
        long sink);

    public long get_max_bitrate() {
        return this.gst_base_sink_get_max_bitrate(Pointer.pointerTo(this, GstBaseSink.class).getPeer());
    }

    protected native long gst_base_sink_get_max_lateness(
        @Ptr
        long sink);

    public long get_max_lateness() {
        return this.gst_base_sink_get_max_lateness(Pointer.pointerTo(this, GstBaseSink.class).getPeer());
    }

    protected native long gst_base_sink_get_render_delay(
        @Ptr
        long sink);

    public long get_render_delay() {
        return this.gst_base_sink_get_render_delay(Pointer.pointerTo(this, GstBaseSink.class).getPeer());
    }

    protected native boolean gst_base_sink_get_sync(
        @Ptr
        long sink);

    public boolean get_sync() {
        return this.gst_base_sink_get_sync(Pointer.pointerTo(this, GstBaseSink.class).getPeer());
    }

    protected native long gst_base_sink_get_throttle_time(
        @Ptr
        long sink);

    public long get_throttle_time() {
        return this.gst_base_sink_get_throttle_time(Pointer.pointerTo(this, GstBaseSink.class).getPeer());
    }

    protected native long gst_base_sink_get_ts_offset(
        @Ptr
        long sink);

    public long get_ts_offset() {
        return this.gst_base_sink_get_ts_offset(Pointer.pointerTo(this, GstBaseSink.class).getPeer());
    }

    protected native boolean gst_base_sink_is_async_enabled(
        @Ptr
        long sink);

    public boolean is_async_enabled() {
        return this.gst_base_sink_is_async_enabled(Pointer.pointerTo(this, GstBaseSink.class).getPeer());
    }

    protected native boolean gst_base_sink_is_last_sample_enabled(
        @Ptr
        long sink);

    public boolean is_last_sample_enabled() {
        return this.gst_base_sink_is_last_sample_enabled(Pointer.pointerTo(this, GstBaseSink.class).getPeer());
    }

    protected native boolean gst_base_sink_is_qos_enabled(
        @Ptr
        long sink);

    public boolean is_qos_enabled() {
        return this.gst_base_sink_is_qos_enabled(Pointer.pointerTo(this, GstBaseSink.class).getPeer());
    }

    protected native boolean gst_base_sink_query_latency(
        @Ptr
        long sink,
        @Ptr
        long live,
        @Ptr
        long upstream_live,
        @Ptr
        long min_latency,
        @Ptr
        long max_latency);

    public boolean query_latency(Pointer<Boolean> live, Pointer<Boolean> upstream_live, Pointer<Long> min_latency, Pointer<Long> max_latency) {
        return this.gst_base_sink_query_latency(Pointer.pointerTo(this, GstBaseSink.class).getPeer(), Pointer.getPeer(live), Pointer.getPeer(upstream_live), Pointer.getPeer(min_latency), Pointer.getPeer(max_latency));
    }

    protected native void gst_base_sink_set_async_enabled(
        @Ptr
        long sink, boolean enabled);

    public void set_async_enabled(boolean enabled) {
        this.gst_base_sink_set_async_enabled(Pointer.pointerTo(this, GstBaseSink.class).getPeer(), enabled);
    }

    protected native void gst_base_sink_set_blocksize(
        @Ptr
        long sink, long blocksize);

    public void set_blocksize(long blocksize) {
        this.gst_base_sink_set_blocksize(Pointer.pointerTo(this, GstBaseSink.class).getPeer(), blocksize);
    }

    protected native void gst_base_sink_set_last_sample_enabled(
        @Ptr
        long sink, boolean enabled);

    public void set_last_sample_enabled(boolean enabled) {
        this.gst_base_sink_set_last_sample_enabled(Pointer.pointerTo(this, GstBaseSink.class).getPeer(), enabled);
    }

    protected native void gst_base_sink_set_max_bitrate(
        @Ptr
        long sink, long max_bitrate);

    public void set_max_bitrate(long max_bitrate) {
        this.gst_base_sink_set_max_bitrate(Pointer.pointerTo(this, GstBaseSink.class).getPeer(), max_bitrate);
    }

    protected native void gst_base_sink_set_max_lateness(
        @Ptr
        long sink, long max_lateness);

    public void set_max_lateness(long max_lateness) {
        this.gst_base_sink_set_max_lateness(Pointer.pointerTo(this, GstBaseSink.class).getPeer(), max_lateness);
    }

    protected native void gst_base_sink_set_qos_enabled(
        @Ptr
        long sink, boolean enabled);

    public void set_qos_enabled(boolean enabled) {
        this.gst_base_sink_set_qos_enabled(Pointer.pointerTo(this, GstBaseSink.class).getPeer(), enabled);
    }

    protected native void gst_base_sink_set_render_delay(
        @Ptr
        long sink, long delay);

    public void set_render_delay(long delay) {
        this.gst_base_sink_set_render_delay(Pointer.pointerTo(this, GstBaseSink.class).getPeer(), delay);
    }

    protected native void gst_base_sink_set_sync(
        @Ptr
        long sink, boolean sync);

    public void set_sync(boolean sync) {
        this.gst_base_sink_set_sync(Pointer.pointerTo(this, GstBaseSink.class).getPeer(), sync);
    }

    protected native void gst_base_sink_set_throttle_time(
        @Ptr
        long sink, long throttle);

    public void set_throttle_time(long throttle) {
        this.gst_base_sink_set_throttle_time(Pointer.pointerTo(this, GstBaseSink.class).getPeer(), throttle);
    }

    protected native void gst_base_sink_set_ts_offset(
        @Ptr
        long sink, long offset);

    public void set_ts_offset(long offset) {
        this.gst_base_sink_set_ts_offset(Pointer.pointerTo(this, GstBaseSink.class).getPeer(), offset);
    }

    protected native IntValuedEnum<GstFlowReturn> gst_base_sink_wait(
        @Ptr
        long sink, long time,
        @Ptr
        long jitter);

    public IntValuedEnum<GstFlowReturn> gstbasesink_wait(long time, Pointer<Long> jitter) {
        return this.gst_base_sink_wait(Pointer.pointerTo(this, GstBaseSink.class).getPeer(), time, Pointer.getPeer(jitter));
    }

    protected native IntValuedEnum<GstClockReturn> gst_base_sink_wait_clock(
        @Ptr
        long sink, long time,
        @Ptr
        long jitter);

    public IntValuedEnum<GstClockReturn> wait_clock(long time, Pointer<Long> jitter) {
        return this.gst_base_sink_wait_clock(Pointer.pointerTo(this, GstBaseSink.class).getPeer(), time, Pointer.getPeer(jitter));
    }

    protected native IntValuedEnum<GstFlowReturn> gst_base_sink_wait_preroll(
        @Ptr
        long sink);

    public IntValuedEnum<GstFlowReturn> wait_preroll() {
        return this.gst_base_sink_wait_preroll(Pointer.pointerTo(this, GstBaseSink.class).getPeer());
    }

    @Field(0)
    public GstElement gstbasesink_field_element() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstBaseSink gstbasesink_field_element(GstElement gstbasesink_field_element) {
        this.io.setNativeObjectField(this, 0, gstbasesink_field_element);
        return this;
    }

    @Field(1)
    public Pointer<GstPad> gstbasesink_field_sinkpad() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstBaseSink gstbasesink_field_sinkpad(Pointer<GstPad> gstbasesink_field_sinkpad) {
        this.io.setPointerField(this, 1, gstbasesink_field_sinkpad);
        return this;
    }

    @Field(2)
    public IntValuedEnum<GstPadMode> gstbasesink_field_pad_mode() {
        return this.io.getEnumField(this, 2);
    }

    @Field(2)
    public GstBaseSink gstbasesink_field_pad_mode(IntValuedEnum<GstPadMode> gstbasesink_field_pad_mode) {
        this.io.setEnumField(this, 2, gstbasesink_field_pad_mode);
        return this;
    }

    @Field(3)
    public long gstbasesink_field_offset() {
        return this.io.getLongField(this, 3);
    }

    @Field(3)
    public GstBaseSink gstbasesink_field_offset(long gstbasesink_field_offset) {
        this.io.setLongField(this, 3, gstbasesink_field_offset);
        return this;
    }

    @Field(4)
    public boolean gstbasesink_field_can_activate_pull() {
        return this.io.getBooleanField(this, 4);
    }

    @Field(4)
    public GstBaseSink gstbasesink_field_can_activate_pull(boolean gstbasesink_field_can_activate_pull) {
        this.io.setBooleanField(this, 4, gstbasesink_field_can_activate_pull);
        return this;
    }

    @Field(5)
    public boolean gstbasesink_field_can_activate_push() {
        return this.io.getBooleanField(this, 5);
    }

    @Field(5)
    public GstBaseSink gstbasesink_field_can_activate_push(boolean gstbasesink_field_can_activate_push) {
        this.io.setBooleanField(this, 5, gstbasesink_field_can_activate_push);
        return this;
    }

    @Field(6)
    public GMutex gstbasesink_field_preroll_lock() {
        return this.io.getNativeObjectField(this, 6);
    }

    @Field(6)
    public GstBaseSink gstbasesink_field_preroll_lock(GMutex gstbasesink_field_preroll_lock) {
        this.io.setNativeObjectField(this, 6, gstbasesink_field_preroll_lock);
        return this;
    }

    @Field(7)
    public GCond gstbasesink_field_preroll_cond() {
        return this.io.getNativeObjectField(this, 7);
    }

    @Field(7)
    public GstBaseSink gstbasesink_field_preroll_cond(GCond gstbasesink_field_preroll_cond) {
        this.io.setNativeObjectField(this, 7, gstbasesink_field_preroll_cond);
        return this;
    }

    @Field(8)
    public boolean gstbasesink_field_eos() {
        return this.io.getBooleanField(this, 8);
    }

    @Field(8)
    public GstBaseSink gstbasesink_field_eos(boolean gstbasesink_field_eos) {
        this.io.setBooleanField(this, 8, gstbasesink_field_eos);
        return this;
    }

    @Field(9)
    public boolean gstbasesink_field_need_preroll() {
        return this.io.getBooleanField(this, 9);
    }

    @Field(9)
    public GstBaseSink gstbasesink_field_need_preroll(boolean gstbasesink_field_need_preroll) {
        this.io.setBooleanField(this, 9, gstbasesink_field_need_preroll);
        return this;
    }

    @Field(10)
    public boolean gstbasesink_field_have_preroll() {
        return this.io.getBooleanField(this, 10);
    }

    @Field(10)
    public GstBaseSink gstbasesink_field_have_preroll(boolean gstbasesink_field_have_preroll) {
        this.io.setBooleanField(this, 10, gstbasesink_field_have_preroll);
        return this;
    }

    @Field(11)
    public boolean gstbasesink_field_playing_async() {
        return this.io.getBooleanField(this, 11);
    }

    @Field(11)
    public GstBaseSink gstbasesink_field_playing_async(boolean gstbasesink_field_playing_async) {
        this.io.setBooleanField(this, 11, gstbasesink_field_playing_async);
        return this;
    }

    @Field(12)
    public boolean gstbasesink_field_have_newsegment() {
        return this.io.getBooleanField(this, 12);
    }

    @Field(12)
    public GstBaseSink gstbasesink_field_have_newsegment(boolean gstbasesink_field_have_newsegment) {
        this.io.setBooleanField(this, 12, gstbasesink_field_have_newsegment);
        return this;
    }

    @Field(13)
    public GstSegment gstbasesink_field_segment() {
        return this.io.getNativeObjectField(this, 13);
    }

    @Field(13)
    public GstBaseSink gstbasesink_field_segment(GstSegment gstbasesink_field_segment) {
        this.io.setNativeObjectField(this, 13, gstbasesink_field_segment);
        return this;
    }

    @Field(14)
    private Pointer gstbasesink_field_clock_id() {
        return this.io.getPointerField(this, 14);
    }

    @Field(14)
    private GstBaseSink gstbasesink_field_clock_id(Pointer gstbasesink_field_clock_id) {
        this.io.setPointerField(this, 14, gstbasesink_field_clock_id);
        return this;
    }

    @Field(15)
    private boolean gstbasesink_field_sync() {
        return this.io.getBooleanField(this, 15);
    }

    @Field(15)
    private GstBaseSink gstbasesink_field_sync(boolean gstbasesink_field_sync) {
        this.io.setBooleanField(this, 15, gstbasesink_field_sync);
        return this;
    }

    @Field(16)
    private boolean gstbasesink_field_flushing() {
        return this.io.getBooleanField(this, 16);
    }

    @Field(16)
    private GstBaseSink gstbasesink_field_flushing(boolean gstbasesink_field_flushing) {
        this.io.setBooleanField(this, 16, gstbasesink_field_flushing);
        return this;
    }

    @Field(17)
    private boolean gstbasesink_field_running() {
        return this.io.getBooleanField(this, 17);
    }

    @Field(17)
    private GstBaseSink gstbasesink_field_running(boolean gstbasesink_field_running) {
        this.io.setBooleanField(this, 17, gstbasesink_field_running);
        return this;
    }

    @Field(18)
    private long gstbasesink_field_max_lateness() {
        return this.io.getLongField(this, 18);
    }

    @Field(18)
    private GstBaseSink gstbasesink_field_max_lateness(long gstbasesink_field_max_lateness) {
        this.io.setLongField(this, 18, gstbasesink_field_max_lateness);
        return this;
    }

    @Field(19)
    private Pointer gstbasesink_field_priv() {
        return this.io.getPointerField(this, 19);
    }

    @Field(19)
    private GstBaseSink gstbasesink_field_priv(Pointer gstbasesink_field_priv) {
        this.io.setPointerField(this, 19, gstbasesink_field_priv);
        return this;
    }

    @Field(20)
    private Pointer gstbasesink_field__gst_reserved() {
        return this.io.getPointerField(this, 20);
    }

    @Field(20)
    private GstBaseSink gstbasesink_field__gst_reserved(Pointer gstbasesink_field__gst_reserved) {
        this.io.setPointerField(this, 20, gstbasesink_field__gst_reserved);
        return this;
    }

}
