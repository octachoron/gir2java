
package generated.gstreamer10.gst;

import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstSegment
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstSegment() {
        super();
    }

    public GstSegment(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public IntValuedEnum<GstSegmentFlags> field_flags() {
        return this.io.getEnumField(this, 0);
    }

    @Field(0)
    public GstSegment field_flags(IntValuedEnum<GstSegmentFlags> field_flags) {
        this.io.setEnumField(this, 0, field_flags);
        return this;
    }

    protected native boolean gst_segment_clip(
        @Ptr
        long segment, IntValuedEnum<GstFormat> format, long start, long stop,
        @Ptr
        long clip_start,
        @Ptr
        long clip_stop);

    public boolean clip(IntValuedEnum<GstFormat> format, long start, long stop, Pointer<Long> clip_start, Pointer<Long> clip_stop) {
        return this.gst_segment_clip(Pointer.pointerTo(this, GstSegment.class).getPeer(), format, start, stop, Pointer.getPeer(clip_start), Pointer.getPeer(clip_stop));
    }

    @Ptr
    protected static native long gst_segment_new();

    public static Pointer<GstSegment> _new() {
        return Pointer.pointerToAddress(GstSegment.gst_segment_new(), GstSegment.class);
    }

    protected native void gst_segment_init(
        @Ptr
        long segment, IntValuedEnum<GstFormat> format);

    public void init(IntValuedEnum<GstFormat> format) {
        this.gst_segment_init(Pointer.pointerTo(this, GstSegment.class).getPeer(), format);
    }

    protected native void gst_segment_free(
        @Ptr
        long segment);

    public void free() {
        this.gst_segment_free(Pointer.pointerTo(this, GstSegment.class).getPeer());
    }

    protected native boolean gst_segment_set_running_time(
        @Ptr
        long segment, IntValuedEnum<GstFormat> format, long running_time);

    public boolean set_running_time(IntValuedEnum<GstFormat> format, long running_time) {
        return this.gst_segment_set_running_time(Pointer.pointerTo(this, GstSegment.class).getPeer(), format, running_time);
    }

    @Field(1)
    public long field_start() {
        return this.io.getLongField(this, 1);
    }

    @Field(1)
    public GstSegment field_start(long field_start) {
        this.io.setLongField(this, 1, field_start);
        return this;
    }

    protected native boolean gst_segment_offset_running_time(
        @Ptr
        long segment, IntValuedEnum<GstFormat> format, long offset);

    public boolean offset_running_time(IntValuedEnum<GstFormat> format, long offset) {
        return this.gst_segment_offset_running_time(Pointer.pointerTo(this, GstSegment.class).getPeer(), format, offset);
    }

    protected native long gst_segment_to_running_time(
        @Ptr
        long segment, IntValuedEnum<GstFormat> format, long position);

    public long to_running_time(IntValuedEnum<GstFormat> format, long position) {
        return this.gst_segment_to_running_time(Pointer.pointerTo(this, GstSegment.class).getPeer(), format, position);
    }

    @Field(2)
    public long field_time() {
        return this.io.getLongField(this, 2);
    }

    @Field(2)
    public GstSegment field_time(long field_time) {
        this.io.setLongField(this, 2, field_time);
        return this;
    }

    protected native boolean gst_segment_do_seek(
        @Ptr
        long segment, double rate, IntValuedEnum<GstFormat> format, IntValuedEnum<GstSeekFlags> flags, IntValuedEnum<GstSeekType> start_type, long start, IntValuedEnum<GstSeekType> stop_type, long stop,
        @Ptr
        long update);

    public boolean do_seek(double rate, IntValuedEnum<GstFormat> format, IntValuedEnum<GstSeekFlags> flags, IntValuedEnum<GstSeekType> start_type, long start, IntValuedEnum<GstSeekType> stop_type, long stop, Pointer<Boolean> update) {
        return this.gst_segment_do_seek(Pointer.pointerTo(this, GstSegment.class).getPeer(), rate, format, flags, start_type, start, stop_type, stop, Pointer.getPeer(update));
    }

    @Field(3)
    public IntValuedEnum<GstFormat> field_format() {
        return this.io.getEnumField(this, 3);
    }

    @Field(3)
    public GstSegment field_format(IntValuedEnum<GstFormat> field_format) {
        this.io.setEnumField(this, 3, field_format);
        return this;
    }

    @Field(4)
    public long field_base() {
        return this.io.getLongField(this, 4);
    }

    @Field(4)
    public GstSegment field_base(long field_base) {
        this.io.setLongField(this, 4, field_base);
        return this;
    }

    @Field(5)
    private Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    private GstSegment field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 5, field__gst_reserved);
        return this;
    }

    @Field(6)
    public long field_offset() {
        return this.io.getLongField(this, 6);
    }

    @Field(6)
    public GstSegment field_offset(long field_offset) {
        this.io.setLongField(this, 6, field_offset);
        return this;
    }

    @Field(7)
    public long field_position() {
        return this.io.getLongField(this, 7);
    }

    @Field(7)
    public GstSegment field_position(long field_position) {
        this.io.setLongField(this, 7, field_position);
        return this;
    }

    protected native long gst_segment_to_position(
        @Ptr
        long segment, IntValuedEnum<GstFormat> format, long running_time);

    public long to_position(IntValuedEnum<GstFormat> format, long running_time) {
        return this.gst_segment_to_position(Pointer.pointerTo(this, GstSegment.class).getPeer(), format, running_time);
    }

    @Field(8)
    public double field_applied_rate() {
        return this.io.getDoubleField(this, 8);
    }

    @Field(8)
    public GstSegment field_applied_rate(double field_applied_rate) {
        this.io.setDoubleField(this, 8, field_applied_rate);
        return this;
    }

    protected native long gst_segment_to_stream_time(
        @Ptr
        long segment, IntValuedEnum<GstFormat> format, long position);

    public long to_stream_time(IntValuedEnum<GstFormat> format, long position) {
        return this.gst_segment_to_stream_time(Pointer.pointerTo(this, GstSegment.class).getPeer(), format, position);
    }

    protected native void gst_segment_copy_into(
        @Ptr
        long src,
        @Ptr
        long dest);

    public void copy_into(Pointer<GstSegment> dest) {
        this.gst_segment_copy_into(Pointer.pointerTo(this, GstSegment.class).getPeer(), Pointer.getPeer(dest));
    }

    @Field(9)
    public long field_stop() {
        return this.io.getLongField(this, 9);
    }

    @Field(9)
    public GstSegment field_stop(long field_stop) {
        this.io.setLongField(this, 9, field_stop);
        return this;
    }

    @Field(10)
    public double field_rate() {
        return this.io.getDoubleField(this, 10);
    }

    @Field(10)
    public GstSegment field_rate(double field_rate) {
        this.io.setDoubleField(this, 10, field_rate);
        return this;
    }

    @Field(11)
    public long field_duration() {
        return this.io.getLongField(this, 11);
    }

    @Field(11)
    public GstSegment field_duration(long field_duration) {
        this.io.setLongField(this, 11, field_duration);
        return this;
    }

    @Ptr
    protected native long gst_segment_copy(
        @Ptr
        long segment);

    public Pointer<GstSegment> copy() {
        return Pointer.pointerToAddress(this.gst_segment_copy(Pointer.pointerTo(this, GstSegment.class).getPeer()), GstSegment.class);
    }

}
