
package generated.gstreamer10.gst;

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


    public GstEvent() {
        super();
    }

    public GstEvent(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public IntValuedEnum<GstEventType> field_type() {
        return this.io.getEnumField(this, 0);
    }

    @Field(0)
    public GstEvent field_type(IntValuedEnum<GstEventType> field_type) {
        this.io.setEnumField(this, 0, field_type);
        return this;
    }

    protected native void gst_event_set_group_id(
        @Ptr
        long event, long group_id);

    public void set_group_id(long group_id) {
        this.gst_event_set_group_id(Pointer.pointerTo(this, GstEvent.class), group_id);
    }

    protected native long gst_event_get_seqnum(
        @Ptr
        long event);

    public long get_seqnum() {
        return this.gst_event_get_seqnum(Pointer.pointerTo(this, GstEvent.class));
    }

    @Ptr
    protected native long gst_event_get_structure(
        @Ptr
        long event);

    public Pointer<GstStructure> get_structure() {
        return Pointer.pointerToAddress(this.gst_event_get_structure(Pointer.pointerTo(this, GstEvent.class)), Pointer.class);
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

    public void parse_qos(Pointer<IntValuedEnum<GstQOSType>> type, Pointer<Double> proportion, Pointer<Object> diff, Pointer<Object> timestamp) {
        this.gst_event_parse_qos(Pointer.pointerTo(this, GstEvent.class), Pointer.getPeer(type), Pointer.getPeer(proportion), Pointer.getPeer(diff), Pointer.getPeer(timestamp));
    }

    protected native boolean gst_event_parse_group_id(
        @Ptr
        long event,
        @Ptr
        long group_id);

    public boolean parse_group_id(Pointer<Long> group_id) {
        return this.gst_event_parse_group_id(Pointer.pointerTo(this, GstEvent.class), Pointer.getPeer(group_id));
    }

    protected native void gst_event_parse_flush_stop(
        @Ptr
        long event,
        @Ptr
        long reset_time);

    public void parse_flush_stop(Pointer<Boolean> reset_time) {
        this.gst_event_parse_flush_stop(Pointer.pointerTo(this, GstEvent.class), Pointer.getPeer(reset_time));
    }

    @Field(1)
    public long field_seqnum() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GstEvent field_seqnum(long field_seqnum) {
        this.io.setNativeObjectField(this, 1, field_seqnum);
        return this;
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

    public void parse_seek(Pointer<Double> rate, Pointer<IntValuedEnum<GstFormat>> format, Pointer<Object> flags, Pointer<IntValuedEnum<GstSeekType>> start_type, Pointer<Long> start, Pointer<IntValuedEnum<GstSeekType>> stop_type, Pointer<Long> stop) {
        this.gst_event_parse_seek(Pointer.pointerTo(this, GstEvent.class), Pointer.getPeer(rate), Pointer.getPeer(format), Pointer.getPeer(flags), Pointer.getPeer(start_type), Pointer.getPeer(start), Pointer.getPeer(stop_type), Pointer.getPeer(stop));
    }

    protected native boolean gst_event_has_name(
        @Ptr
        long event,
        @Ptr
        long name);

    public boolean has_name(Pointer name) {
        return this.gst_event_has_name(Pointer.pointerTo(this, GstEvent.class), Pointer.getPeer(name));
    }

    protected native void gst_event_parse_caps(
        @Ptr
        long event,
        @Ptr
        long caps);

    public void parse_caps(Pointer<Pointer<GstCaps>> caps) {
        this.gst_event_parse_caps(Pointer.pointerTo(this, GstEvent.class), Pointer.getPeer(caps));
    }

    @Field(2)
    public long field_timestamp() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GstEvent field_timestamp(long field_timestamp) {
        this.io.setNativeObjectField(this, 2, field_timestamp);
        return this;
    }

    @Ptr
    protected native long gst_event_writable_structure(
        @Ptr
        long event);

    public Pointer<GstStructure> writable_structure() {
        return Pointer.pointerToAddress(this.gst_event_writable_structure(Pointer.pointerTo(this, GstEvent.class)), Pointer.class);
    }

    protected native void gst_event_parse_latency(
        @Ptr
        long event,
        @Ptr
        long latency);

    public void parse_latency(Pointer<Object> latency) {
        this.gst_event_parse_latency(Pointer.pointerTo(this, GstEvent.class), Pointer.getPeer(latency));
    }

    protected native void gst_event_parse_tag(
        @Ptr
        long event,
        @Ptr
        long taglist);

    public void parse_tag(Pointer<Pointer<GstTagList>> taglist) {
        this.gst_event_parse_tag(Pointer.pointerTo(this, GstEvent.class), Pointer.getPeer(taglist));
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
        this.gst_event_parse_buffer_size(Pointer.pointerTo(this, GstEvent.class), Pointer.getPeer(format), Pointer.getPeer(minsize), Pointer.getPeer(maxsize), Pointer.getPeer(async));
    }

    protected native void gst_event_parse_segment(
        @Ptr
        long event,
        @Ptr
        long segment);

    public void parse_segment(Pointer<Pointer<GstSegment>> segment) {
        this.gst_event_parse_segment(Pointer.pointerTo(this, GstEvent.class), Pointer.getPeer(segment));
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
        this.gst_event_parse_step(Pointer.pointerTo(this, GstEvent.class), Pointer.getPeer(format), Pointer.getPeer(amount), Pointer.getPeer(rate), Pointer.getPeer(flush), Pointer.getPeer(intermediate));
    }

    protected native void gst_event_parse_toc(
        @Ptr
        long event,
        @Ptr
        long toc,
        @Ptr
        long updated);

    public void parse_toc(Pointer<Pointer<GstToc>> toc, Pointer<Boolean> updated) {
        this.gst_event_parse_toc(Pointer.pointerTo(this, GstEvent.class), Pointer.getPeer(toc), Pointer.getPeer(updated));
    }

    protected native void gst_event_parse_stream_start(
        @Ptr
        long event,
        @Ptr
        long stream_id);

    public void parse_stream_start(Pointer stream_id) {
        this.gst_event_parse_stream_start(Pointer.pointerTo(this, GstEvent.class), Pointer.getPeer(stream_id));
    }

    protected native void gst_event_set_stream_flags(
        @Ptr
        long event, Object flags);

    public void set_stream_flags(Object flags) {
        this.gst_event_set_stream_flags(Pointer.pointerTo(this, GstEvent.class), flags);
    }

    protected native void gst_event_parse_toc_select(
        @Ptr
        long event,
        @Ptr
        long uid);

    public void parse_toc_select(Pointer uid) {
        this.gst_event_parse_toc_select(Pointer.pointerTo(this, GstEvent.class), Pointer.getPeer(uid));
    }

    protected native void gst_event_parse_stream_flags(
        @Ptr
        long event,
        @Ptr
        long flags);

    public void parse_stream_flags(Pointer<Object> flags) {
        this.gst_event_parse_stream_flags(Pointer.pointerTo(this, GstEvent.class), Pointer.getPeer(flags));
    }

    protected native void gst_event_parse_segment_done(
        @Ptr
        long event,
        @Ptr
        long format,
        @Ptr
        long position);

    public void parse_segment_done(Pointer<IntValuedEnum<GstFormat>> format, Pointer<Long> position) {
        this.gst_event_parse_segment_done(Pointer.pointerTo(this, GstEvent.class), Pointer.getPeer(format), Pointer.getPeer(position));
    }

    protected native void gst_event_set_seqnum(
        @Ptr
        long event, long seqnum);

    public void set_seqnum(long seqnum) {
        this.gst_event_set_seqnum(Pointer.pointerTo(this, GstEvent.class), seqnum);
    }

    protected native void gst_event_parse_gap(
        @Ptr
        long event,
        @Ptr
        long timestamp,
        @Ptr
        long duration);

    public void parse_gap(Pointer<Object> timestamp, Pointer<Object> duration) {
        this.gst_event_parse_gap(Pointer.pointerTo(this, GstEvent.class), Pointer.getPeer(timestamp), Pointer.getPeer(duration));
    }

    @Field(3)
    public GstMiniObject field_mini_object() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GstEvent field_mini_object(GstMiniObject field_mini_object) {
        this.io.setNativeObjectField(this, 3, field_mini_object);
        return this;
    }

    protected native void gst_event_parse_sink_message(
        @Ptr
        long event,
        @Ptr
        long msg);

    public void parse_sink_message(Pointer<Pointer<GstMessage>> msg) {
        this.gst_event_parse_sink_message(Pointer.pointerTo(this, GstEvent.class), Pointer.getPeer(msg));
    }

    protected native void gst_event_copy_segment(
        @Ptr
        long event,
        @Ptr
        long segment);

    public void copy_segment(Pointer<GstSegment> segment) {
        this.gst_event_copy_segment(Pointer.pointerTo(this, GstEvent.class), Pointer.getPeer(segment));
    }

}
