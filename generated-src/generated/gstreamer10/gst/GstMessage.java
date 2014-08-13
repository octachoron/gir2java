
package generated.gstreamer10.gst;

import generated.glib20.glib.GCond;
import generated.glib20.glib.GError;
import generated.gobject20.gobject.GValue;
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


    public GstMessage() {
        super();
    }

    public GstMessage(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long gst_message_get_structure(
        @Ptr
        long message);

    public Pointer<GstStructure> get_structure() {
        return Pointer.pointerToAddress(this.gst_message_get_structure(Pointer.pointerTo(this, GstMessage.class)), Pointer.class);
    }

    protected native void gst_message_parse_segment_start(
        @Ptr
        long message,
        @Ptr
        long format,
        @Ptr
        long position);

    public void parse_segment_start(Pointer<IntValuedEnum<GstFormat>> format, Pointer<Long> position) {
        this.gst_message_parse_segment_start(Pointer.pointerTo(this, GstMessage.class), Pointer.getPeer(format), Pointer.getPeer(position));
    }

    protected native boolean gst_message_parse_context_type(
        @Ptr
        long message,
        @Ptr
        long context_type);

    public boolean parse_context_type(Pointer context_type) {
        return this.gst_message_parse_context_type(Pointer.pointerTo(this, GstMessage.class), Pointer.getPeer(context_type));
    }

    protected native long gst_message_get_seqnum(
        @Ptr
        long message);

    public long get_seqnum() {
        return this.gst_message_get_seqnum(Pointer.pointerTo(this, GstMessage.class));
    }

    protected native void gst_message_set_seqnum(
        @Ptr
        long message, long seqnum);

    public void set_seqnum(long seqnum) {
        this.gst_message_set_seqnum(Pointer.pointerTo(this, GstMessage.class), seqnum);
    }

    protected native boolean gst_message_parse_group_id(
        @Ptr
        long message,
        @Ptr
        long group_id);

    public boolean parse_group_id(Pointer<Long> group_id) {
        return this.gst_message_parse_group_id(Pointer.pointerTo(this, GstMessage.class), Pointer.getPeer(group_id));
    }

    @Field(0)
    public GstMiniObject field_mini_object() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstMessage field_mini_object(GstMiniObject field_mini_object) {
        this.io.setNativeObjectField(this, 0, field_mini_object);
        return this;
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
        this.gst_message_parse_structure_change(Pointer.pointerTo(this, GstMessage.class), Pointer.getPeer(type), Pointer.getPeer(owner), Pointer.getPeer(busy));
    }

    @Field(1)
    public Object field_lock() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GstMessage field_lock(Object field_lock) {
        this.io.setNativeObjectField(this, 1, field_lock);
        return this;
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
        this.gst_message_parse_progress(Pointer.pointerTo(this, GstMessage.class), Pointer.getPeer(type), Pointer.getPeer(code), Pointer.getPeer(text));
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
        this.gst_message_parse_buffering_stats(Pointer.pointerTo(this, GstMessage.class), Pointer.getPeer(mode), Pointer.getPeer(avg_in), Pointer.getPeer(avg_out), Pointer.getPeer(buffering_left));
    }

    protected native void gst_message_parse_async_done(
        @Ptr
        long message,
        @Ptr
        long running_time);

    public void parse_async_done(Pointer<Object> running_time) {
        this.gst_message_parse_async_done(Pointer.pointerTo(this, GstMessage.class), Pointer.getPeer(running_time));
    }

    protected native void gst_message_parse_toc(
        @Ptr
        long message,
        @Ptr
        long toc,
        @Ptr
        long updated);

    public void parse_toc(Pointer<Pointer<GstToc>> toc, Pointer<Boolean> updated) {
        this.gst_message_parse_toc(Pointer.pointerTo(this, GstMessage.class), Pointer.getPeer(toc), Pointer.getPeer(updated));
    }

    protected native void gst_message_parse_new_clock(
        @Ptr
        long message,
        @Ptr
        long clock);

    public void parse_new_clock(Pointer<Pointer<GstClock>> clock) {
        this.gst_message_parse_new_clock(Pointer.pointerTo(this, GstMessage.class), Pointer.getPeer(clock));
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
        this.gst_message_parse_state_changed(Pointer.pointerTo(this, GstMessage.class), Pointer.getPeer(oldstate), Pointer.getPeer(newstate), Pointer.getPeer(pending));
    }

    protected native void gst_message_parse_request_state(
        @Ptr
        long message,
        @Ptr
        long state);

    public void parse_request_state(Pointer<IntValuedEnum<GstState>> state) {
        this.gst_message_parse_request_state(Pointer.pointerTo(this, GstMessage.class), Pointer.getPeer(state));
    }

    protected native boolean gst_message_has_name(
        @Ptr
        long message,
        @Ptr
        long name);

    public boolean has_name(Pointer name) {
        return this.gst_message_has_name(Pointer.pointerTo(this, GstMessage.class), Pointer.getPeer(name));
    }

    protected native void gst_message_set_qos_values(
        @Ptr
        long message, long jitter, double proportion, int quality);

    public void set_qos_values(long jitter, double proportion, int quality) {
        this.gst_message_set_qos_values(Pointer.pointerTo(this, GstMessage.class), jitter, proportion, quality);
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

    @Field(3)
    public long field_seqnum() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GstMessage field_seqnum(long field_seqnum) {
        this.io.setNativeObjectField(this, 3, field_seqnum);
        return this;
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
        this.gst_message_parse_qos_stats(Pointer.pointerTo(this, GstMessage.class), Pointer.getPeer(format), Pointer.getPeer(processed), Pointer.getPeer(dropped));
    }

    protected native void gst_message_set_stream_status_object(
        @Ptr
        long message,
        @Ptr
        long object);

    public void set_stream_status_object(Pointer<GValue> object) {
        this.gst_message_set_stream_status_object(Pointer.pointerTo(this, GstMessage.class), Pointer.getPeer(object));
    }

    protected native void gst_message_parse_segment_done(
        @Ptr
        long message,
        @Ptr
        long format,
        @Ptr
        long position);

    public void parse_segment_done(Pointer<IntValuedEnum<GstFormat>> format, Pointer<Long> position) {
        this.gst_message_parse_segment_done(Pointer.pointerTo(this, GstMessage.class), Pointer.getPeer(format), Pointer.getPeer(position));
    }

    protected native void gst_message_parse_error(
        @Ptr
        long message,
        @Ptr
        long gerror,
        @Ptr
        long debug);

    public void parse_error(Pointer<Pointer<GError>> gerror, Pointer debug) {
        this.gst_message_parse_error(Pointer.pointerTo(this, GstMessage.class), Pointer.getPeer(gerror), Pointer.getPeer(debug));
    }

    protected native void gst_message_set_group_id(
        @Ptr
        long message, long group_id);

    public void set_group_id(long group_id) {
        this.gst_message_set_group_id(Pointer.pointerTo(this, GstMessage.class), group_id);
    }

    protected native void gst_message_parse_buffering(
        @Ptr
        long message,
        @Ptr
        long percent);

    public void parse_buffering(Pointer<Integer> percent) {
        this.gst_message_parse_buffering(Pointer.pointerTo(this, GstMessage.class), Pointer.getPeer(percent));
    }

    protected native void gst_message_parse_have_context(
        @Ptr
        long message,
        @Ptr
        long context);

    public void parse_have_context(Pointer<Pointer<GstContext>> context) {
        this.gst_message_parse_have_context(Pointer.pointerTo(this, GstMessage.class), Pointer.getPeer(context));
    }

    @Field(4)
    public Object field_type() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    public GstMessage field_type(Object field_type) {
        this.io.setNativeObjectField(this, 4, field_type);
        return this;
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
        this.gst_message_parse_step_done(Pointer.pointerTo(this, GstMessage.class), Pointer.getPeer(format), Pointer.getPeer(amount), Pointer.getPeer(rate), Pointer.getPeer(flush), Pointer.getPeer(intermediate), Pointer.getPeer(duration), Pointer.getPeer(eos));
    }

    protected native void gst_message_parse_warning(
        @Ptr
        long message,
        @Ptr
        long gerror,
        @Ptr
        long debug);

    public void parse_warning(Pointer<Pointer<GError>> gerror, Pointer debug) {
        this.gst_message_parse_warning(Pointer.pointerTo(this, GstMessage.class), Pointer.getPeer(gerror), Pointer.getPeer(debug));
    }

    protected native void gst_message_parse_tag(
        @Ptr
        long message,
        @Ptr
        long tag_list);

    public void parse_tag(Pointer<Pointer<GstTagList>> tag_list) {
        this.gst_message_parse_tag(Pointer.pointerTo(this, GstMessage.class), Pointer.getPeer(tag_list));
    }

    @Field(5)
    public GCond field_cond() {
        return this.io.getNativeObjectField(this, 5);
    }

    @Field(5)
    public GstMessage field_cond(GCond field_cond) {
        this.io.setNativeObjectField(this, 5, field_cond);
        return this;
    }

    protected native void gst_message_parse_info(
        @Ptr
        long message,
        @Ptr
        long gerror,
        @Ptr
        long debug);

    public void parse_info(Pointer<Pointer<GError>> gerror, Pointer debug) {
        this.gst_message_parse_info(Pointer.pointerTo(this, GstMessage.class), Pointer.getPeer(gerror), Pointer.getPeer(debug));
    }

    protected native void gst_message_parse_clock_provide(
        @Ptr
        long message,
        @Ptr
        long clock,
        @Ptr
        long ready);

    public void parse_clock_provide(Pointer<Pointer<GstClock>> clock, Pointer<Boolean> ready) {
        this.gst_message_parse_clock_provide(Pointer.pointerTo(this, GstMessage.class), Pointer.getPeer(clock), Pointer.getPeer(ready));
    }

    protected native void gst_message_set_qos_stats(
        @Ptr
        long message, IntValuedEnum<GstFormat> format, long processed, long dropped);

    public void set_qos_stats(IntValuedEnum<GstFormat> format, long processed, long dropped) {
        this.gst_message_set_qos_stats(Pointer.pointerTo(this, GstMessage.class), format, processed, dropped);
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
        this.gst_message_parse_qos(Pointer.pointerTo(this, GstMessage.class), Pointer.getPeer(live), Pointer.getPeer(running_time), Pointer.getPeer(stream_time), Pointer.getPeer(timestamp), Pointer.getPeer(duration));
    }

    protected native void gst_message_parse_reset_time(
        @Ptr
        long message,
        @Ptr
        long running_time);

    public void parse_reset_time(Pointer<Object> running_time) {
        this.gst_message_parse_reset_time(Pointer.pointerTo(this, GstMessage.class), Pointer.getPeer(running_time));
    }

    protected native void gst_message_parse_stream_status(
        @Ptr
        long message,
        @Ptr
        long type,
        @Ptr
        long owner);

    public void parse_stream_status(Pointer<IntValuedEnum<GstStreamStatusType>> type, Pointer<Pointer<GstElement>> owner) {
        this.gst_message_parse_stream_status(Pointer.pointerTo(this, GstMessage.class), Pointer.getPeer(type), Pointer.getPeer(owner));
    }

    @Field(6)
    public long field_timestamp() {
        return this.io.getNativeObjectField(this, 6);
    }

    @Field(6)
    public GstMessage field_timestamp(long field_timestamp) {
        this.io.setNativeObjectField(this, 6, field_timestamp);
        return this;
    }

    protected native void gst_message_set_buffering_stats(
        @Ptr
        long message, IntValuedEnum<GstBufferingMode> mode, int avg_in, int avg_out, long buffering_left);

    public void set_buffering_stats(IntValuedEnum<GstBufferingMode> mode, int avg_in, int avg_out, long buffering_left) {
        this.gst_message_set_buffering_stats(Pointer.pointerTo(this, GstMessage.class), mode, avg_in, avg_out, buffering_left);
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
        this.gst_message_parse_step_start(Pointer.pointerTo(this, GstMessage.class), Pointer.getPeer(active), Pointer.getPeer(format), Pointer.getPeer(amount), Pointer.getPeer(rate), Pointer.getPeer(flush), Pointer.getPeer(intermediate));
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
        this.gst_message_parse_qos_values(Pointer.pointerTo(this, GstMessage.class), Pointer.getPeer(jitter), Pointer.getPeer(proportion), Pointer.getPeer(quality));
    }

    @Ptr
    protected native long gst_message_get_stream_status_object(
        @Ptr
        long message);

    public Pointer<GValue> get_stream_status_object() {
        return Pointer.pointerToAddress(this.gst_message_get_stream_status_object(Pointer.pointerTo(this, GstMessage.class)), Pointer.class);
    }

    protected native void gst_message_parse_clock_lost(
        @Ptr
        long message,
        @Ptr
        long clock);

    public void parse_clock_lost(Pointer<Pointer<GstClock>> clock) {
        this.gst_message_parse_clock_lost(Pointer.pointerTo(this, GstMessage.class), Pointer.getPeer(clock));
    }

}
