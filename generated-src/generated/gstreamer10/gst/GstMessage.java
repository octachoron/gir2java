
package generated.gstreamer10.gst;

import generated.glib20.glib.GCond;
import generated.glib20.glib.GError;
import generated.glib20.glib.GMutex;
import generated.gobject20.gobject.GValue;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstMessage
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstMessage() {
        super();
    }

    public GstMessage(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long gst_message_new_duration_changed(
        @Ptr
        long src);

    public static Pointer<GstMessage> new_duration_changed(Pointer<GstObject> src) {
        return Pointer.pointerToAddress(GstMessage.gst_message_new_duration_changed(Pointer.getPeer(src)), GstMessage.class);
    }

    protected native void gst_message_parse_stream_status(
        @Ptr
        long message,
        @Ptr
        long type,
        @Ptr
        long owner);

    public void parse_stream_status(Pointer<IntValuedEnum<GstStreamStatusType>> type, Pointer owner) {
        this.gst_message_parse_stream_status(Pointer.pointerTo(this, GstMessage.class).getPeer(), Pointer.getPeer(type), Pointer.getPeer(owner));
    }

    @Ptr
    protected static native long gst_message_new_step_done(
        @Ptr
        long src, IntValuedEnum<GstFormat> format, long amount, double rate, boolean flush, boolean intermediate, long duration, boolean eos);

    public static Pointer<GstMessage> new_step_done(Pointer<GstObject> src, IntValuedEnum<GstFormat> format, long amount, double rate, boolean flush, boolean intermediate, long duration, boolean eos) {
        return Pointer.pointerToAddress(GstMessage.gst_message_new_step_done(Pointer.getPeer(src), format, amount, rate, flush, intermediate, duration, eos), GstMessage.class);
    }

    @Field(0)
    public long field_seqnum() {
        return this.io.getLongField(this, 0);
    }

    @Field(0)
    public GstMessage field_seqnum(long field_seqnum) {
        this.io.setLongField(this, 0, field_seqnum);
        return this;
    }

    @Ptr
    protected static native long gst_message_new_stream_start(
        @Ptr
        long src);

    public static Pointer<GstMessage> new_stream_start(Pointer<GstObject> src) {
        return Pointer.pointerToAddress(GstMessage.gst_message_new_stream_start(Pointer.getPeer(src)), GstMessage.class);
    }

    @Ptr
    protected static native long gst_message_new_custom(IntValuedEnum<GstMessageType> type,
        @Ptr
        long src,
        @Ptr
        long structure);

    public static Pointer<GstMessage> new_custom(IntValuedEnum<GstMessageType> type, Pointer<GstObject> src, Pointer<GstStructure> structure) {
        return Pointer.pointerToAddress(GstMessage.gst_message_new_custom(type, Pointer.getPeer(src), Pointer.getPeer(structure)), GstMessage.class);
    }

    @Ptr
    protected static native long gst_message_new_clock_provide(
        @Ptr
        long src,
        @Ptr
        long clock, boolean ready);

    public static Pointer<GstMessage> new_clock_provide(Pointer<GstObject> src, Pointer clock, boolean ready) {
        return Pointer.pointerToAddress(GstMessage.gst_message_new_clock_provide(Pointer.getPeer(src), Pointer.getPeer(clock), ready), GstMessage.class);
    }

    @Ptr
    protected static native long gst_message_new_state_changed(
        @Ptr
        long src, IntValuedEnum<GstState> oldstate, IntValuedEnum<GstState> newstate, IntValuedEnum<GstState> pending);

    public static Pointer<GstMessage> new_state_changed(Pointer<GstObject> src, IntValuedEnum<GstState> oldstate, IntValuedEnum<GstState> newstate, IntValuedEnum<GstState> pending) {
        return Pointer.pointerToAddress(GstMessage.gst_message_new_state_changed(Pointer.getPeer(src), oldstate, newstate, pending), GstMessage.class);
    }

    @Ptr
    protected static native long gst_message_new_stream_status(
        @Ptr
        long src, IntValuedEnum<GstStreamStatusType> type,
        @Ptr
        long owner);

    public static Pointer<GstMessage> new_stream_status(Pointer<GstObject> src, IntValuedEnum<GstStreamStatusType> type, Pointer owner) {
        return Pointer.pointerToAddress(GstMessage.gst_message_new_stream_status(Pointer.getPeer(src), type, Pointer.getPeer(owner)), GstMessage.class);
    }

    @Ptr
    protected static native long gst_message_new_element(
        @Ptr
        long src,
        @Ptr
        long structure);

    public static Pointer<GstMessage> new_element(Pointer<GstObject> src, Pointer<GstStructure> structure) {
        return Pointer.pointerToAddress(GstMessage.gst_message_new_element(Pointer.getPeer(src), Pointer.getPeer(structure)), GstMessage.class);
    }

    @Ptr
    protected static native long gst_message_new_step_start(
        @Ptr
        long src, boolean active, IntValuedEnum<GstFormat> format, long amount, double rate, boolean flush, boolean intermediate);

    public static Pointer<GstMessage> new_step_start(Pointer<GstObject> src, boolean active, IntValuedEnum<GstFormat> format, long amount, double rate, boolean flush, boolean intermediate) {
        return Pointer.pointerToAddress(GstMessage.gst_message_new_step_start(Pointer.getPeer(src), active, format, amount, rate, flush, intermediate), GstMessage.class);
    }

    @Ptr
    protected static native long gst_message_new_eos(
        @Ptr
        long src);

    public static Pointer<GstMessage> new_eos(Pointer<GstObject> src) {
        return Pointer.pointerToAddress(GstMessage.gst_message_new_eos(Pointer.getPeer(src)), GstMessage.class);
    }

    @Ptr
    protected static native long gst_message_new_clock_lost(
        @Ptr
        long src,
        @Ptr
        long clock);

    public static Pointer<GstMessage> new_clock_lost(Pointer<GstObject> src, Pointer clock) {
        return Pointer.pointerToAddress(GstMessage.gst_message_new_clock_lost(Pointer.getPeer(src), Pointer.getPeer(clock)), GstMessage.class);
    }

    protected native void gst_message_set_qos_values(
        @Ptr
        long message, long jitter, double proportion, int quality);

    public void set_qos_values(long jitter, double proportion, int quality) {
        this.gst_message_set_qos_values(Pointer.pointerTo(this, GstMessage.class).getPeer(), jitter, proportion, quality);
    }

    @Field(1)
    public long field_timestamp() {
        return this.io.getLongField(this, 1);
    }

    @Field(1)
    public GstMessage field_timestamp(long field_timestamp) {
        this.io.setLongField(this, 1, field_timestamp);
        return this;
    }

    @Ptr
    protected static native long gst_message_new_latency(
        @Ptr
        long src);

    public static Pointer<GstMessage> new_latency(Pointer<GstObject> src) {
        return Pointer.pointerToAddress(GstMessage.gst_message_new_latency(Pointer.getPeer(src)), GstMessage.class);
    }

    protected native void gst_message_parse_request_state(
        @Ptr
        long message,
        @Ptr
        long state);

    public void parse_request_state(Pointer<IntValuedEnum<GstState>> state) {
        this.gst_message_parse_request_state(Pointer.pointerTo(this, GstMessage.class).getPeer(), Pointer.getPeer(state));
    }

    protected native void gst_message_parse_reset_time(
        @Ptr
        long message,
        @Ptr
        long running_time);

    public void parse_reset_time(Pointer<Long> running_time) {
        this.gst_message_parse_reset_time(Pointer.pointerTo(this, GstMessage.class).getPeer(), Pointer.getPeer(running_time));
    }

    protected native boolean gst_message_has_name(
        @Ptr
        long message,
        @Ptr
        long name);

    public boolean has_name(Pointer name) {
        return this.gst_message_has_name(Pointer.pointerTo(this, GstMessage.class).getPeer(), Pointer.getPeer(name));
    }

    protected native void gst_message_parse_segment_done(
        @Ptr
        long message,
        @Ptr
        long format,
        @Ptr
        long position);

    public void parse_segment_done(Pointer<IntValuedEnum<GstFormat>> format, Pointer<Long> position) {
        this.gst_message_parse_segment_done(Pointer.pointerTo(this, GstMessage.class).getPeer(), Pointer.getPeer(format), Pointer.getPeer(position));
    }

    @Ptr
    protected native long gst_message_get_stream_status_object(
        @Ptr
        long message);

    public Pointer<GValue> get_stream_status_object() {
        return Pointer.pointerToAddress(this.gst_message_get_stream_status_object(Pointer.pointerTo(this, GstMessage.class).getPeer()), GValue.class);
    }

    @Ptr
    protected static native long gst_message_new_toc(
        @Ptr
        long src,
        @Ptr
        long toc, boolean updated);

    public static Pointer<GstMessage> new_toc(Pointer<GstObject> src, Pointer<GstToc> toc, boolean updated) {
        return Pointer.pointerToAddress(GstMessage.gst_message_new_toc(Pointer.getPeer(src), Pointer.getPeer(toc), updated), GstMessage.class);
    }

    protected native void gst_message_parse_step_start(
        @Ptr
        long message,
        @Ptr
        long active,
        @Ptr
        long format,
        @Ptr
        long amount,
        @Ptr
        long rate,
        @Ptr
        long flush,
        @Ptr
        long intermediate);

    public void parse_step_start(Pointer<Boolean> active, Pointer<IntValuedEnum<GstFormat>> format, Pointer<Long> amount, Pointer<Double> rate, Pointer<Boolean> flush, Pointer<Boolean> intermediate) {
        this.gst_message_parse_step_start(Pointer.pointerTo(this, GstMessage.class).getPeer(), Pointer.getPeer(active), Pointer.getPeer(format), Pointer.getPeer(amount), Pointer.getPeer(rate), Pointer.getPeer(flush), Pointer.getPeer(intermediate));
    }

    @Field(2)
    public Pointer<GstObject> field_src() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GstMessage field_src(Pointer<GstObject> field_src) {
        this.io.setPointerField(this, 2, field_src);
        return this;
    }

    protected native void gst_message_parse_have_context(
        @Ptr
        long message,
        @Ptr
        long context);

    public void parse_have_context(Pointer<Pointer<GstContext>> context) {
        this.gst_message_parse_have_context(Pointer.pointerTo(this, GstMessage.class).getPeer(), Pointer.getPeer(context));
    }

    @Field(3)
    public IntValuedEnum<GstMessageType> field_type() {
        return this.io.getEnumField(this, 3);
    }

    @Field(3)
    public GstMessage field_type(IntValuedEnum<GstMessageType> field_type) {
        this.io.setEnumField(this, 3, field_type);
        return this;
    }

    @Ptr
    protected static native long gst_message_new_qos(
        @Ptr
        long src, boolean live, long running_time, long stream_time, long timestamp, long duration);

    public static Pointer<GstMessage> new_qos(Pointer<GstObject> src, boolean live, long running_time, long stream_time, long timestamp, long duration) {
        return Pointer.pointerToAddress(GstMessage.gst_message_new_qos(Pointer.getPeer(src), live, running_time, stream_time, timestamp, duration), GstMessage.class);
    }

    protected native void gst_message_parse_toc(
        @Ptr
        long message,
        @Ptr
        long toc,
        @Ptr
        long updated);

    public void parse_toc(Pointer<Pointer<GstToc>> toc, Pointer<Boolean> updated) {
        this.gst_message_parse_toc(Pointer.pointerTo(this, GstMessage.class).getPeer(), Pointer.getPeer(toc), Pointer.getPeer(updated));
    }

    protected native void gst_message_parse_buffering(
        @Ptr
        long message,
        @Ptr
        long percent);

    public void parse_buffering(Pointer<Integer> percent) {
        this.gst_message_parse_buffering(Pointer.pointerTo(this, GstMessage.class).getPeer(), Pointer.getPeer(percent));
    }

    protected native void gst_message_parse_warning(
        @Ptr
        long message,
        @Ptr
        long gerror,
        @Ptr
        long debug);

    public void parse_warning(Pointer<Pointer<GError>> gerror, Pointer debug) {
        this.gst_message_parse_warning(Pointer.pointerTo(this, GstMessage.class).getPeer(), Pointer.getPeer(gerror), Pointer.getPeer(debug));
    }

    @Ptr
    protected static native long gst_message_new_async_start(
        @Ptr
        long src);

    public static Pointer<GstMessage> new_async_start(Pointer<GstObject> src) {
        return Pointer.pointerToAddress(GstMessage.gst_message_new_async_start(Pointer.getPeer(src)), GstMessage.class);
    }

    protected native void gst_message_parse_structure_change(
        @Ptr
        long message,
        @Ptr
        long type,
        @Ptr
        long owner,
        @Ptr
        long busy);

    public void parse_structure_change(Pointer<IntValuedEnum<GstStructureChangeType>> type, Pointer<Pointer<GstElement>> owner, Pointer<Boolean> busy) {
        this.gst_message_parse_structure_change(Pointer.pointerTo(this, GstMessage.class).getPeer(), Pointer.getPeer(type), Pointer.getPeer(owner), Pointer.getPeer(busy));
    }

    protected native void gst_message_parse_buffering_stats(
        @Ptr
        long message,
        @Ptr
        long mode,
        @Ptr
        long avg_in,
        @Ptr
        long avg_out,
        @Ptr
        long buffering_left);

    public void parse_buffering_stats(Pointer<IntValuedEnum<GstBufferingMode>> mode, Pointer<Integer> avg_in, Pointer<Integer> avg_out, Pointer<Long> buffering_left) {
        this.gst_message_parse_buffering_stats(Pointer.pointerTo(this, GstMessage.class).getPeer(), Pointer.getPeer(mode), Pointer.getPeer(avg_in), Pointer.getPeer(avg_out), Pointer.getPeer(buffering_left));
    }

    @Ptr
    protected native long gst_message_get_structure(
        @Ptr
        long message);

    public Pointer<GstStructure> get_structure() {
        return Pointer.pointerToAddress(this.gst_message_get_structure(Pointer.pointerTo(this, GstMessage.class).getPeer()), GstStructure.class);
    }

    protected native void gst_message_parse_state_changed(
        @Ptr
        long message,
        @Ptr
        long oldstate,
        @Ptr
        long newstate,
        @Ptr
        long pending);

    public void parse_state_changed(Pointer<IntValuedEnum<GstState>> oldstate, Pointer<IntValuedEnum<GstState>> newstate, Pointer<IntValuedEnum<GstState>> pending) {
        this.gst_message_parse_state_changed(Pointer.pointerTo(this, GstMessage.class).getPeer(), Pointer.getPeer(oldstate), Pointer.getPeer(newstate), Pointer.getPeer(pending));
    }

    protected native void gst_message_parse_segment_start(
        @Ptr
        long message,
        @Ptr
        long format,
        @Ptr
        long position);

    public void parse_segment_start(Pointer<IntValuedEnum<GstFormat>> format, Pointer<Long> position) {
        this.gst_message_parse_segment_start(Pointer.pointerTo(this, GstMessage.class).getPeer(), Pointer.getPeer(format), Pointer.getPeer(position));
    }

    @Ptr
    protected static native long gst_message_new_segment_done(
        @Ptr
        long src, IntValuedEnum<GstFormat> format, long position);

    public static Pointer<GstMessage> new_segment_done(Pointer<GstObject> src, IntValuedEnum<GstFormat> format, long position) {
        return Pointer.pointerToAddress(GstMessage.gst_message_new_segment_done(Pointer.getPeer(src), format, position), GstMessage.class);
    }

    protected native void gst_message_parse_qos(
        @Ptr
        long message,
        @Ptr
        long live,
        @Ptr
        long running_time,
        @Ptr
        long stream_time,
        @Ptr
        long timestamp,
        @Ptr
        long duration);

    public void parse_qos(Pointer<Boolean> live, Pointer<Long> running_time, Pointer<Long> stream_time, Pointer<Long> timestamp, Pointer<Long> duration) {
        this.gst_message_parse_qos(Pointer.pointerTo(this, GstMessage.class).getPeer(), Pointer.getPeer(live), Pointer.getPeer(running_time), Pointer.getPeer(stream_time), Pointer.getPeer(timestamp), Pointer.getPeer(duration));
    }

    protected native void gst_message_parse_new_clock(
        @Ptr
        long message,
        @Ptr
        long clock);

    public void parse_new_clock(Pointer clock) {
        this.gst_message_parse_new_clock(Pointer.pointerTo(this, GstMessage.class).getPeer(), Pointer.getPeer(clock));
    }

    @Ptr
    protected static native long gst_message_new_new_clock(
        @Ptr
        long src,
        @Ptr
        long clock);

    public static Pointer<GstMessage> new_new_clock(Pointer<GstObject> src, Pointer clock) {
        return Pointer.pointerToAddress(GstMessage.gst_message_new_new_clock(Pointer.getPeer(src), Pointer.getPeer(clock)), GstMessage.class);
    }

    protected native void gst_message_set_group_id(
        @Ptr
        long message, long group_id);

    public void set_group_id(long group_id) {
        this.gst_message_set_group_id(Pointer.pointerTo(this, GstMessage.class).getPeer(), group_id);
    }

    @Ptr
    protected static native long gst_message_new_progress(
        @Ptr
        long src, IntValuedEnum<GstProgressType> type,
        @Ptr
        long code,
        @Ptr
        long text);

    public static Pointer<GstMessage> new_progress(Pointer<GstObject> src, IntValuedEnum<GstProgressType> type, Pointer code, Pointer text) {
        return Pointer.pointerToAddress(GstMessage.gst_message_new_progress(Pointer.getPeer(src), type, Pointer.getPeer(code), Pointer.getPeer(text)), GstMessage.class);
    }

    protected native void gst_message_parse_step_done(
        @Ptr
        long message,
        @Ptr
        long format,
        @Ptr
        long amount,
        @Ptr
        long rate,
        @Ptr
        long flush,
        @Ptr
        long intermediate,
        @Ptr
        long duration,
        @Ptr
        long eos);

    public void parse_step_done(Pointer<IntValuedEnum<GstFormat>> format, Pointer<Long> amount, Pointer<Double> rate, Pointer<Boolean> flush, Pointer<Boolean> intermediate, Pointer<Long> duration, Pointer<Boolean> eos) {
        this.gst_message_parse_step_done(Pointer.pointerTo(this, GstMessage.class).getPeer(), Pointer.getPeer(format), Pointer.getPeer(amount), Pointer.getPeer(rate), Pointer.getPeer(flush), Pointer.getPeer(intermediate), Pointer.getPeer(duration), Pointer.getPeer(eos));
    }

    protected native void gst_message_parse_async_done(
        @Ptr
        long message,
        @Ptr
        long running_time);

    public void parse_async_done(Pointer<Long> running_time) {
        this.gst_message_parse_async_done(Pointer.pointerTo(this, GstMessage.class).getPeer(), Pointer.getPeer(running_time));
    }

    @Ptr
    protected static native long gst_message_new_async_done(
        @Ptr
        long src, long running_time);

    public static Pointer<GstMessage> new_async_done(Pointer<GstObject> src, long running_time) {
        return Pointer.pointerToAddress(GstMessage.gst_message_new_async_done(Pointer.getPeer(src), running_time), GstMessage.class);
    }

    protected native void gst_message_set_qos_stats(
        @Ptr
        long message, IntValuedEnum<GstFormat> format, long processed, long dropped);

    public void set_qos_stats(IntValuedEnum<GstFormat> format, long processed, long dropped) {
        this.gst_message_set_qos_stats(Pointer.pointerTo(this, GstMessage.class).getPeer(), format, processed, dropped);
    }

    protected native void gst_message_parse_qos_values(
        @Ptr
        long message,
        @Ptr
        long jitter,
        @Ptr
        long proportion,
        @Ptr
        long quality);

    public void parse_qos_values(Pointer<Long> jitter, Pointer<Double> proportion, Pointer<Integer> quality) {
        this.gst_message_parse_qos_values(Pointer.pointerTo(this, GstMessage.class).getPeer(), Pointer.getPeer(jitter), Pointer.getPeer(proportion), Pointer.getPeer(quality));
    }

    protected native void gst_message_parse_error(
        @Ptr
        long message,
        @Ptr
        long gerror,
        @Ptr
        long debug);

    public void parse_error(Pointer<Pointer<GError>> gerror, Pointer debug) {
        this.gst_message_parse_error(Pointer.pointerTo(this, GstMessage.class).getPeer(), Pointer.getPeer(gerror), Pointer.getPeer(debug));
    }

    @Ptr
    protected static native long gst_message_new_state_dirty(
        @Ptr
        long src);

    public static Pointer<GstMessage> new_state_dirty(Pointer<GstObject> src) {
        return Pointer.pointerToAddress(GstMessage.gst_message_new_state_dirty(Pointer.getPeer(src)), GstMessage.class);
    }

    protected native void gst_message_parse_qos_stats(
        @Ptr
        long message,
        @Ptr
        long format,
        @Ptr
        long processed,
        @Ptr
        long dropped);

    public void parse_qos_stats(Pointer<IntValuedEnum<GstFormat>> format, Pointer<Long> processed, Pointer<Long> dropped) {
        this.gst_message_parse_qos_stats(Pointer.pointerTo(this, GstMessage.class).getPeer(), Pointer.getPeer(format), Pointer.getPeer(processed), Pointer.getPeer(dropped));
    }

    @Ptr
    protected static native long gst_message_new_error(
        @Ptr
        long src,
        @Ptr
        long error,
        @Ptr
        long debug);

    public static Pointer<GstMessage> new_error(Pointer<GstObject> src, Pointer<GError> error, Pointer debug) {
        return Pointer.pointerToAddress(GstMessage.gst_message_new_error(Pointer.getPeer(src), Pointer.getPeer(error), Pointer.getPeer(debug)), GstMessage.class);
    }

    @Ptr
    protected static native long gst_message_new_buffering(
        @Ptr
        long src, int percent);

    public static Pointer<GstMessage> new_buffering(Pointer<GstObject> src, int percent) {
        return Pointer.pointerToAddress(GstMessage.gst_message_new_buffering(Pointer.getPeer(src), percent), GstMessage.class);
    }

    protected native boolean gst_message_parse_context_type(
        @Ptr
        long message,
        @Ptr
        long context_type);

    public boolean parse_context_type(Pointer context_type) {
        return this.gst_message_parse_context_type(Pointer.pointerTo(this, GstMessage.class).getPeer(), Pointer.getPeer(context_type));
    }

    @Field(4)
    private GCond field_cond() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    private GstMessage field_cond(GCond field_cond) {
        this.io.setNativeObjectField(this, 4, field_cond);
        return this;
    }

    @Ptr
    protected static native long gst_message_new_request_state(
        @Ptr
        long src, IntValuedEnum<GstState> state);

    public static Pointer<GstMessage> new_request_state(Pointer<GstObject> src, IntValuedEnum<GstState> state) {
        return Pointer.pointerToAddress(GstMessage.gst_message_new_request_state(Pointer.getPeer(src), state), GstMessage.class);
    }

    protected native void gst_message_set_buffering_stats(
        @Ptr
        long message, IntValuedEnum<GstBufferingMode> mode, int avg_in, int avg_out, long buffering_left);

    public void set_buffering_stats(IntValuedEnum<GstBufferingMode> mode, int avg_in, int avg_out, long buffering_left) {
        this.gst_message_set_buffering_stats(Pointer.pointerTo(this, GstMessage.class).getPeer(), mode, avg_in, avg_out, buffering_left);
    }

    protected native void gst_message_parse_clock_provide(
        @Ptr
        long message,
        @Ptr
        long clock,
        @Ptr
        long ready);

    public void parse_clock_provide(Pointer clock, Pointer<Boolean> ready) {
        this.gst_message_parse_clock_provide(Pointer.pointerTo(this, GstMessage.class).getPeer(), Pointer.getPeer(clock), Pointer.getPeer(ready));
    }

    @Field(5)
    private GMutex field_lock() {
        return this.io.getNativeObjectField(this, 5);
    }

    @Field(5)
    private GstMessage field_lock(GMutex field_lock) {
        this.io.setNativeObjectField(this, 5, field_lock);
        return this;
    }

    protected native long gst_message_get_seqnum(
        @Ptr
        long message);

    public long get_seqnum() {
        return this.gst_message_get_seqnum(Pointer.pointerTo(this, GstMessage.class).getPeer());
    }

    @Ptr
    protected static native long gst_message_new_reset_time(
        @Ptr
        long src, long running_time);

    public static Pointer<GstMessage> new_reset_time(Pointer<GstObject> src, long running_time) {
        return Pointer.pointerToAddress(GstMessage.gst_message_new_reset_time(Pointer.getPeer(src), running_time), GstMessage.class);
    }

    @Ptr
    protected static native long gst_message_new_segment_start(
        @Ptr
        long src, IntValuedEnum<GstFormat> format, long position);

    public static Pointer<GstMessage> new_segment_start(Pointer<GstObject> src, IntValuedEnum<GstFormat> format, long position) {
        return Pointer.pointerToAddress(GstMessage.gst_message_new_segment_start(Pointer.getPeer(src), format, position), GstMessage.class);
    }

    protected native void gst_message_parse_info(
        @Ptr
        long message,
        @Ptr
        long gerror,
        @Ptr
        long debug);

    public void parse_info(Pointer<Pointer<GError>> gerror, Pointer debug) {
        this.gst_message_parse_info(Pointer.pointerTo(this, GstMessage.class).getPeer(), Pointer.getPeer(gerror), Pointer.getPeer(debug));
    }

    @Ptr
    protected static native long gst_message_new_have_context(
        @Ptr
        long src,
        @Ptr
        long context);

    public static Pointer<GstMessage> new_have_context(Pointer<GstObject> src, Pointer<GstContext> context) {
        return Pointer.pointerToAddress(GstMessage.gst_message_new_have_context(Pointer.getPeer(src), Pointer.getPeer(context)), GstMessage.class);
    }

    protected native void gst_message_set_seqnum(
        @Ptr
        long message, long seqnum);

    public void set_seqnum(long seqnum) {
        this.gst_message_set_seqnum(Pointer.pointerTo(this, GstMessage.class).getPeer(), seqnum);
    }

    @Field(6)
    public GstMiniObject field_mini_object() {
        return this.io.getNativeObjectField(this, 6);
    }

    @Field(6)
    public GstMessage field_mini_object(GstMiniObject field_mini_object) {
        this.io.setNativeObjectField(this, 6, field_mini_object);
        return this;
    }

    protected native void gst_message_parse_clock_lost(
        @Ptr
        long message,
        @Ptr
        long clock);

    public void parse_clock_lost(Pointer<Pointer<GstClock>> clock) {
        this.gst_message_parse_clock_lost(Pointer.pointerTo(this, GstMessage.class).getPeer(), Pointer.getPeer(clock));
    }

    @Ptr
    protected static native long gst_message_new_need_context(
        @Ptr
        long src,
        @Ptr
        long context_type);

    public static Pointer<GstMessage> new_need_context(Pointer<GstObject> src, Pointer context_type) {
        return Pointer.pointerToAddress(GstMessage.gst_message_new_need_context(Pointer.getPeer(src), Pointer.getPeer(context_type)), GstMessage.class);
    }

    @Ptr
    protected static native long gst_message_new_tag(
        @Ptr
        long src,
        @Ptr
        long tag_list);

    public static Pointer<GstMessage> new_tag(Pointer<GstObject> src, Pointer<GstTagList> tag_list) {
        return Pointer.pointerToAddress(GstMessage.gst_message_new_tag(Pointer.getPeer(src), Pointer.getPeer(tag_list)), GstMessage.class);
    }

    protected native boolean gst_message_parse_group_id(
        @Ptr
        long message,
        @Ptr
        long group_id);

    public boolean parse_group_id(Pointer<Long> group_id) {
        return this.gst_message_parse_group_id(Pointer.pointerTo(this, GstMessage.class).getPeer(), Pointer.getPeer(group_id));
    }

    protected native void gst_message_parse_tag(
        @Ptr
        long message,
        @Ptr
        long tag_list);

    public void parse_tag(Pointer<Pointer<GstTagList>> tag_list) {
        this.gst_message_parse_tag(Pointer.pointerTo(this, GstMessage.class).getPeer(), Pointer.getPeer(tag_list));
    }

    protected native void gst_message_set_stream_status_object(
        @Ptr
        long message,
        @Ptr
        long object);

    public void set_stream_status_object(Pointer<GValue> object) {
        this.gst_message_set_stream_status_object(Pointer.pointerTo(this, GstMessage.class).getPeer(), Pointer.getPeer(object));
    }

    @Ptr
    protected static native long gst_message_new_info(
        @Ptr
        long src,
        @Ptr
        long error,
        @Ptr
        long debug);

    public static Pointer<GstMessage> new_info(Pointer<GstObject> src, Pointer<GError> error, Pointer debug) {
        return Pointer.pointerToAddress(GstMessage.gst_message_new_info(Pointer.getPeer(src), Pointer.getPeer(error), Pointer.getPeer(debug)), GstMessage.class);
    }

    @Ptr
    protected static native long gst_message_new_warning(
        @Ptr
        long src,
        @Ptr
        long error,
        @Ptr
        long debug);

    public static Pointer<GstMessage> new_warning(Pointer<GstObject> src, Pointer<GError> error, Pointer debug) {
        return Pointer.pointerToAddress(GstMessage.gst_message_new_warning(Pointer.getPeer(src), Pointer.getPeer(error), Pointer.getPeer(debug)), GstMessage.class);
    }

    @Ptr
    protected static native long gst_message_new_application(
        @Ptr
        long src,
        @Ptr
        long structure);

    public static Pointer<GstMessage> new_application(Pointer<GstObject> src, Pointer<GstStructure> structure) {
        return Pointer.pointerToAddress(GstMessage.gst_message_new_application(Pointer.getPeer(src), Pointer.getPeer(structure)), GstMessage.class);
    }

    protected native void gst_message_parse_progress(
        @Ptr
        long message,
        @Ptr
        long type,
        @Ptr
        long code,
        @Ptr
        long text);

    public void parse_progress(Pointer<IntValuedEnum<GstProgressType>> type, Pointer code, Pointer text) {
        this.gst_message_parse_progress(Pointer.pointerTo(this, GstMessage.class).getPeer(), Pointer.getPeer(type), Pointer.getPeer(code), Pointer.getPeer(text));
    }

    @Ptr
    protected static native long gst_message_new_structure_change(
        @Ptr
        long src, IntValuedEnum<GstStructureChangeType> type,
        @Ptr
        long owner, boolean busy);

    public static Pointer<GstMessage> new_structure_change(Pointer<GstObject> src, IntValuedEnum<GstStructureChangeType> type, Pointer<GstElement> owner, boolean busy) {
        return Pointer.pointerToAddress(GstMessage.gst_message_new_structure_change(Pointer.getPeer(src), type, Pointer.getPeer(owner), busy), GstMessage.class);
    }

}
