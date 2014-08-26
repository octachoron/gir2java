
package generated.gstreamer10.gst;

import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstEvent
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstEvent() {
        super();
    }

    public GstEvent(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long gst_event_new_stream_start(
        @Ptr
        long stream_id);

    public static Pointer<GstEvent> new_stream_start(Pointer stream_id) {
        return Pointer.pointerToAddress(GstEvent.gst_event_new_stream_start(Pointer.getPeer(stream_id)), GstEvent.class);
    }

    @Ptr
    protected static native long gst_event_new_eos();

    public static Pointer<GstEvent> new_eos() {
        return Pointer.pointerToAddress(GstEvent.gst_event_new_eos(), GstEvent.class);
    }

    protected native void gst_event_parse_toc(
        @Ptr
        long event,
        @Ptr
        long toc,
        @Ptr
        long updated);

    public void parse_toc(Pointer<Pointer<GstToc>> toc, Pointer<Boolean> updated) {
        this.gst_event_parse_toc(Pointer.pointerTo(this, GstEvent.class).getPeer(), Pointer.getPeer(toc), Pointer.getPeer(updated));
    }

    protected native void gst_event_set_seqnum(
        @Ptr
        long event, long seqnum);

    public void set_seqnum(long seqnum) {
        this.gst_event_set_seqnum(Pointer.pointerTo(this, GstEvent.class).getPeer(), seqnum);
    }

    protected native long gst_event_get_seqnum(
        @Ptr
        long event);

    public long get_seqnum() {
        return this.gst_event_get_seqnum(Pointer.pointerTo(this, GstEvent.class).getPeer());
    }

    @Ptr
    protected static native long gst_event_new_qos(IntValuedEnum<GstQOSType> type, double proportion, long diff, long timestamp);

    public static Pointer<GstEvent> new_qos(IntValuedEnum<GstQOSType> type, double proportion, long diff, long timestamp) {
        return Pointer.pointerToAddress(GstEvent.gst_event_new_qos(type, proportion, diff, timestamp), GstEvent.class);
    }

    @Ptr
    protected static native long gst_event_new_reconfigure();

    public static Pointer<GstEvent> new_reconfigure() {
        return Pointer.pointerToAddress(GstEvent.gst_event_new_reconfigure(), GstEvent.class);
    }

    protected native boolean gst_event_parse_group_id(
        @Ptr
        long event,
        @Ptr
        long group_id);

    public boolean parse_group_id(Pointer<Long> group_id) {
        return this.gst_event_parse_group_id(Pointer.pointerTo(this, GstEvent.class).getPeer(), Pointer.getPeer(group_id));
    }

    protected native void gst_event_parse_stream_flags(
        @Ptr
        long event,
        @Ptr
        long flags);

    public void parse_stream_flags(Pointer<IntValuedEnum<GstStreamFlags>> flags) {
        this.gst_event_parse_stream_flags(Pointer.pointerTo(this, GstEvent.class).getPeer(), Pointer.getPeer(flags));
    }

    @Ptr
    protected static native long gst_event_new_custom(IntValuedEnum<GstEventType> type,
        @Ptr
        long structure);

    public static Pointer<GstEvent> new_custom(IntValuedEnum<GstEventType> type, Pointer<GstStructure> structure) {
        return Pointer.pointerToAddress(GstEvent.gst_event_new_custom(type, Pointer.getPeer(structure)), GstEvent.class);
    }

    @Ptr
    protected static native long gst_event_new_seek(double rate, IntValuedEnum<GstFormat> format, IntValuedEnum<GstSeekFlags> flags, IntValuedEnum<GstSeekType> start_type, long start, IntValuedEnum<GstSeekType> stop_type, long stop);

    public static Pointer<GstEvent> new_seek(double rate, IntValuedEnum<GstFormat> format, IntValuedEnum<GstSeekFlags> flags, IntValuedEnum<GstSeekType> start_type, long start, IntValuedEnum<GstSeekType> stop_type, long stop) {
        return Pointer.pointerToAddress(GstEvent.gst_event_new_seek(rate, format, flags, start_type, start, stop_type, stop), GstEvent.class);
    }

    protected native void gst_event_parse_step(
        @Ptr
        long event,
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

    public void parse_step(Pointer<IntValuedEnum<GstFormat>> format, Pointer<Long> amount, Pointer<Double> rate, Pointer<Boolean> flush, Pointer<Boolean> intermediate) {
        this.gst_event_parse_step(Pointer.pointerTo(this, GstEvent.class).getPeer(), Pointer.getPeer(format), Pointer.getPeer(amount), Pointer.getPeer(rate), Pointer.getPeer(flush), Pointer.getPeer(intermediate));
    }

    protected native void gst_event_set_group_id(
        @Ptr
        long event, long group_id);

    public void set_group_id(long group_id) {
        this.gst_event_set_group_id(Pointer.pointerTo(this, GstEvent.class).getPeer(), group_id);
    }

    protected native void gst_event_parse_latency(
        @Ptr
        long event,
        @Ptr
        long latency);

    public void parse_latency(Pointer<Long> latency) {
        this.gst_event_parse_latency(Pointer.pointerTo(this, GstEvent.class).getPeer(), Pointer.getPeer(latency));
    }

    @Ptr
    protected static native long gst_event_new_latency(long latency);

    public static Pointer<GstEvent> new_latency(long latency) {
        return Pointer.pointerToAddress(GstEvent.gst_event_new_latency(latency), GstEvent.class);
    }

    @Ptr
    protected static native long gst_event_new_sink_message(
        @Ptr
        long name,
        @Ptr
        long msg);

    public static Pointer<GstEvent> new_sink_message(Pointer name, Pointer<GstMessage> msg) {
        return Pointer.pointerToAddress(GstEvent.gst_event_new_sink_message(Pointer.getPeer(name), Pointer.getPeer(msg)), GstEvent.class);
    }

    protected native void gst_event_parse_gap(
        @Ptr
        long event,
        @Ptr
        long timestamp,
        @Ptr
        long duration);

    public void parse_gap(Pointer<Long> timestamp, Pointer<Long> duration) {
        this.gst_event_parse_gap(Pointer.pointerTo(this, GstEvent.class).getPeer(), Pointer.getPeer(timestamp), Pointer.getPeer(duration));
    }

    protected native void gst_event_parse_toc_select(
        @Ptr
        long event,
        @Ptr
        long uid);

    public void parse_toc_select(Pointer uid) {
        this.gst_event_parse_toc_select(Pointer.pointerTo(this, GstEvent.class).getPeer(), Pointer.getPeer(uid));
    }

    protected native boolean gst_event_has_name(
        @Ptr
        long event,
        @Ptr
        long name);

    public boolean has_name(Pointer name) {
        return this.gst_event_has_name(Pointer.pointerTo(this, GstEvent.class).getPeer(), Pointer.getPeer(name));
    }

    protected native void gst_event_parse_sink_message(
        @Ptr
        long event,
        @Ptr
        long msg);

    public void parse_sink_message(Pointer<Pointer<GstMessage>> msg) {
        this.gst_event_parse_sink_message(Pointer.pointerTo(this, GstEvent.class).getPeer(), Pointer.getPeer(msg));
    }

    @Ptr
    protected native long gst_event_get_structure(
        @Ptr
        long event);

    public Pointer<GstStructure> get_structure() {
        return Pointer.pointerToAddress(this.gst_event_get_structure(Pointer.pointerTo(this, GstEvent.class).getPeer()), GstStructure.class);
    }

    protected native void gst_event_parse_buffer_size(
        @Ptr
        long event,
        @Ptr
        long format,
        @Ptr
        long minsize,
        @Ptr
        long maxsize,
        @Ptr
        long async);

    public void parse_buffer_size(Pointer<IntValuedEnum<GstFormat>> format, Pointer<Long> minsize, Pointer<Long> maxsize, Pointer<Boolean> async) {
        this.gst_event_parse_buffer_size(Pointer.pointerTo(this, GstEvent.class).getPeer(), Pointer.getPeer(format), Pointer.getPeer(minsize), Pointer.getPeer(maxsize), Pointer.getPeer(async));
    }

    @Ptr
    protected static native long gst_event_new_segment(
        @Ptr
        long segment);

    public static Pointer<GstEvent> new_segment(Pointer<GstSegment> segment) {
        return Pointer.pointerToAddress(GstEvent.gst_event_new_segment(Pointer.getPeer(segment)), GstEvent.class);
    }

    @Ptr
    protected static native long gst_event_new_step(IntValuedEnum<GstFormat> format, long amount, double rate, boolean flush, boolean intermediate);

    public static Pointer<GstEvent> new_step(IntValuedEnum<GstFormat> format, long amount, double rate, boolean flush, boolean intermediate) {
        return Pointer.pointerToAddress(GstEvent.gst_event_new_step(format, amount, rate, flush, intermediate), GstEvent.class);
    }

    @Ptr
    protected native long gst_event_writable_structure(
        @Ptr
        long event);

    public Pointer<GstStructure> writable_structure() {
        return Pointer.pointerToAddress(this.gst_event_writable_structure(Pointer.pointerTo(this, GstEvent.class).getPeer()), GstStructure.class);
    }

    @Field(0)
    public long gstevent_field_timestamp() {
        return this.io.getLongField(this, 0);
    }

    @Field(0)
    public GstEvent gstevent_field_timestamp(long gstevent_field_timestamp) {
        this.io.setLongField(this, 0, gstevent_field_timestamp);
        return this;
    }

    @Ptr
    protected static native long gst_event_new_toc_select(
        @Ptr
        long uid);

    public static Pointer<GstEvent> new_toc_select(Pointer uid) {
        return Pointer.pointerToAddress(GstEvent.gst_event_new_toc_select(Pointer.getPeer(uid)), GstEvent.class);
    }

    protected native void gst_event_set_stream_flags(
        @Ptr
        long event, IntValuedEnum<GstStreamFlags> flags);

    public void set_stream_flags(IntValuedEnum<GstStreamFlags> flags) {
        this.gst_event_set_stream_flags(Pointer.pointerTo(this, GstEvent.class).getPeer(), flags);
    }

    protected native void gst_event_parse_qos(
        @Ptr
        long event,
        @Ptr
        long type,
        @Ptr
        long proportion,
        @Ptr
        long diff,
        @Ptr
        long timestamp);

    public void parse_qos(Pointer<IntValuedEnum<GstQOSType>> type, Pointer<Double> proportion, Pointer<Long> diff, Pointer<Long> timestamp) {
        this.gst_event_parse_qos(Pointer.pointerTo(this, GstEvent.class).getPeer(), Pointer.getPeer(type), Pointer.getPeer(proportion), Pointer.getPeer(diff), Pointer.getPeer(timestamp));
    }

    @Field(1)
    public long gstevent_field_seqnum() {
        return this.io.getLongField(this, 1);
    }

    @Field(1)
    public GstEvent gstevent_field_seqnum(long gstevent_field_seqnum) {
        this.io.setLongField(this, 1, gstevent_field_seqnum);
        return this;
    }

    @Ptr
    protected static native long gst_event_new_navigation(
        @Ptr
        long structure);

    public static Pointer<GstEvent> new_navigation(Pointer<GstStructure> structure) {
        return Pointer.pointerToAddress(GstEvent.gst_event_new_navigation(Pointer.getPeer(structure)), GstEvent.class);
    }

    protected native void gst_event_parse_flush_stop(
        @Ptr
        long event,
        @Ptr
        long reset_time);

    public void parse_flush_stop(Pointer<Boolean> reset_time) {
        this.gst_event_parse_flush_stop(Pointer.pointerTo(this, GstEvent.class).getPeer(), Pointer.getPeer(reset_time));
    }

    protected native void gst_event_parse_stream_start(
        @Ptr
        long event,
        @Ptr
        long stream_id);

    public void parse_stream_start(Pointer stream_id) {
        this.gst_event_parse_stream_start(Pointer.pointerTo(this, GstEvent.class).getPeer(), Pointer.getPeer(stream_id));
    }

    protected native void gst_event_copy_segment(
        @Ptr
        long event,
        @Ptr
        long segment);

    public void copy_segment(Pointer<GstSegment> segment) {
        this.gst_event_copy_segment(Pointer.pointerTo(this, GstEvent.class).getPeer(), Pointer.getPeer(segment));
    }

    protected native void gst_event_parse_segment(
        @Ptr
        long event,
        @Ptr
        long segment);

    public void parse_segment(Pointer<Pointer<GstSegment>> segment) {
        this.gst_event_parse_segment(Pointer.pointerTo(this, GstEvent.class).getPeer(), Pointer.getPeer(segment));
    }

    @Field(2)
    public IntValuedEnum<GstEventType> gstevent_field_type() {
        return this.io.getEnumField(this, 2);
    }

    @Field(2)
    public GstEvent gstevent_field_type(IntValuedEnum<GstEventType> gstevent_field_type) {
        this.io.setEnumField(this, 2, gstevent_field_type);
        return this;
    }

    @Ptr
    protected static native long gst_event_new_segment_done(IntValuedEnum<GstFormat> format, long position);

    public static Pointer<GstEvent> new_segment_done(IntValuedEnum<GstFormat> format, long position) {
        return Pointer.pointerToAddress(GstEvent.gst_event_new_segment_done(format, position), GstEvent.class);
    }

    @Ptr
    protected static native long gst_event_new_flush_start();

    public static Pointer<GstEvent> new_flush_start() {
        return Pointer.pointerToAddress(GstEvent.gst_event_new_flush_start(), GstEvent.class);
    }

    @Field(3)
    public GstMiniObject gstevent_field_mini_object() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GstEvent gstevent_field_mini_object(GstMiniObject gstevent_field_mini_object) {
        this.io.setNativeObjectField(this, 3, gstevent_field_mini_object);
        return this;
    }

    protected native void gst_event_parse_segment_done(
        @Ptr
        long event,
        @Ptr
        long format,
        @Ptr
        long position);

    public void parse_segment_done(Pointer<IntValuedEnum<GstFormat>> format, Pointer<Long> position) {
        this.gst_event_parse_segment_done(Pointer.pointerTo(this, GstEvent.class).getPeer(), Pointer.getPeer(format), Pointer.getPeer(position));
    }

    @Ptr
    protected static native long gst_event_new_tag(
        @Ptr
        long taglist);

    public static Pointer<GstEvent> new_tag(Pointer<GstTagList> taglist) {
        return Pointer.pointerToAddress(GstEvent.gst_event_new_tag(Pointer.getPeer(taglist)), GstEvent.class);
    }

    protected native void gst_event_parse_seek(
        @Ptr
        long event,
        @Ptr
        long rate,
        @Ptr
        long format,
        @Ptr
        long flags,
        @Ptr
        long start_type,
        @Ptr
        long start,
        @Ptr
        long stop_type,
        @Ptr
        long stop);

    public void parse_seek(Pointer<Double> rate, Pointer<IntValuedEnum<GstFormat>> format, Pointer<IntValuedEnum<GstSeekFlags>> flags, Pointer<IntValuedEnum<GstSeekType>> start_type, Pointer<Long> start, Pointer<IntValuedEnum<GstSeekType>> stop_type, Pointer<Long> stop) {
        this.gst_event_parse_seek(Pointer.pointerTo(this, GstEvent.class).getPeer(), Pointer.getPeer(rate), Pointer.getPeer(format), Pointer.getPeer(flags), Pointer.getPeer(start_type), Pointer.getPeer(start), Pointer.getPeer(stop_type), Pointer.getPeer(stop));
    }

    @Ptr
    protected static native long gst_event_new_gap(long timestamp, long duration);

    public static Pointer<GstEvent> new_gap(long timestamp, long duration) {
        return Pointer.pointerToAddress(GstEvent.gst_event_new_gap(timestamp, duration), GstEvent.class);
    }

    protected native void gst_event_parse_caps(
        @Ptr
        long event,
        @Ptr
        long caps);

    public void parse_caps(Pointer<Pointer<GstCaps>> caps) {
        this.gst_event_parse_caps(Pointer.pointerTo(this, GstEvent.class).getPeer(), Pointer.getPeer(caps));
    }

    @Ptr
    protected static native long gst_event_new_caps(
        @Ptr
        long caps);

    public static Pointer<GstEvent> new_caps(Pointer<GstCaps> caps) {
        return Pointer.pointerToAddress(GstEvent.gst_event_new_caps(Pointer.getPeer(caps)), GstEvent.class);
    }

    @Ptr
    protected static native long gst_event_new_buffer_size(IntValuedEnum<GstFormat> format, long minsize, long maxsize, boolean async);

    public static Pointer<GstEvent> new_buffer_size(IntValuedEnum<GstFormat> format, long minsize, long maxsize, boolean async) {
        return Pointer.pointerToAddress(GstEvent.gst_event_new_buffer_size(format, minsize, maxsize, async), GstEvent.class);
    }

    @Ptr
    protected static native long gst_event_new_flush_stop(boolean reset_time);

    public static Pointer<GstEvent> new_flush_stop(boolean reset_time) {
        return Pointer.pointerToAddress(GstEvent.gst_event_new_flush_stop(reset_time), GstEvent.class);
    }

    protected native void gst_event_parse_tag(
        @Ptr
        long event,
        @Ptr
        long taglist);

    public void parse_tag(Pointer<Pointer<GstTagList>> taglist) {
        this.gst_event_parse_tag(Pointer.pointerTo(this, GstEvent.class).getPeer(), Pointer.getPeer(taglist));
    }

    @Ptr
    protected static native long gst_event_new_toc(
        @Ptr
        long toc, boolean updated);

    public static Pointer<GstEvent> new_toc(Pointer<GstToc> toc, boolean updated) {
        return Pointer.pointerToAddress(GstEvent.gst_event_new_toc(Pointer.getPeer(toc), updated), GstEvent.class);
    }

}
