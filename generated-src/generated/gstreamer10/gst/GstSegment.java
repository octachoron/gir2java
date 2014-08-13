
package generated.gstreamer10.gst;

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


    public GstSegment() {
        super();
    }

    public GstSegment(Pointer pointer) {
        super(pointer);
    }

    protected native long gst_segment_to_running_time(
        @Ptr
        long segment, IntValuedEnum<GstFormat> format, long position);

    public long to_running_time(IntValuedEnum<GstFormat> format, long position) {
        return this.gst_segment_to_running_time(Pointer.pointerTo(this, GstSegment.class), format, position);
    }

    protected native boolean gst_segment_clip(
        @Ptr
        long segment, IntValuedEnum<GstFormat> format, long start, long stop,
        @Ptr
        long clip_start,
        @Ptr
        long clip_stop);

    public boolean clip(IntValuedEnum<GstFormat> format, long start, long stop, Pointer<Long> clip_start, Pointer<Long> clip_stop) {
        return this.gst_segment_clip(Pointer.pointerTo(this, GstSegment.class), format, start, stop, Pointer.getPeer(clip_start), Pointer.getPeer(clip_stop));
    }

    protected native boolean gst_segment_offset_running_time(
        @Ptr
        long segment, IntValuedEnum<GstFormat> format, long offset);

    public boolean offset_running_time(IntValuedEnum<GstFormat> format, long offset) {
        return this.gst_segment_offset_running_time(Pointer.pointerTo(this, GstSegment.class), format, offset);
    }

    protected native void gst_segment_copy_into(
        @Ptr
        long src,
        @Ptr
        long dest);

    public void copy_into(Pointer<GstSegment> dest) {
        this.gst_segment_copy_into(Pointer.pointerTo(this, GstSegment.class), Pointer.getPeer(dest));
    }

    @Field(0)
    public long field_stop() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstSegment field_stop(long field_stop) {
        this.io.setNativeObjectField(this, 0, field_stop);
        return this;
    }

    @Field(1)
    public double field_applied_rate() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GstSegment field_applied_rate(double field_applied_rate) {
        this.io.setNativeObjectField(this, 1, field_applied_rate);
        return this;
    }

    @Field(2)
    public double field_rate() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GstSegment field_rate(double field_rate) {
        this.io.setNativeObjectField(this, 2, field_rate);
        return this;
    }

    @Field(3)
    public long field_start() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GstSegment field_start(long field_start) {
        this.io.setNativeObjectField(this, 3, field_start);
        return this;
    }

    @Field(4)
    public IntValuedEnum<GstFormat> field_format() {
        return this.io.getEnumField(this, 4);
    }

    @Field(4)
    public GstSegment field_format(IntValuedEnum<GstFormat> field_format) {
        this.io.setEnumField(this, 4, field_format);
        return this;
    }

    @Field(5)
    public Object field_flags() {
        return this.io.getNativeObjectField(this, 5);
    }

    @Field(5)
    public GstSegment field_flags(Object field_flags) {
        this.io.setNativeObjectField(this, 5, field_flags);
        return this;
    }

    @Field(6)
    public long field_position() {
        return this.io.getNativeObjectField(this, 6);
    }

    @Field(6)
    public GstSegment field_position(long field_position) {
        this.io.setNativeObjectField(this, 6, field_position);
        return this;
    }

    @Ptr
    protected native long gst_segment_copy(
        @Ptr
        long segment);

    public Pointer<GstSegment> copy() {
        return Pointer.pointerToAddress(this.gst_segment_copy(Pointer.pointerTo(this, GstSegment.class)), Pointer.class);
    }

    protected native boolean gst_segment_do_seek(
        @Ptr
        long segment, double rate, IntValuedEnum<GstFormat> format, Object flags, IntValuedEnum<GstSeekType> start_type, long start, IntValuedEnum<GstSeekType> stop_type, long stop,
        @Ptr
        long update);

    public boolean do_seek(double rate, IntValuedEnum<GstFormat> format, Object flags, IntValuedEnum<GstSeekType> start_type, long start, IntValuedEnum<GstSeekType> stop_type, long stop, Pointer<Boolean> update) {
        return this.gst_segment_do_seek(Pointer.pointerTo(this, GstSegment.class), rate, format, flags, start_type, start, stop_type, stop, Pointer.getPeer(update));
    }

    protected native long gst_segment_to_stream_time(
        @Ptr
        long segment, IntValuedEnum<GstFormat> format, long position);

    public long to_stream_time(IntValuedEnum<GstFormat> format, long position) {
        return this.gst_segment_to_stream_time(Pointer.pointerTo(this, GstSegment.class), format, position);
    }

    @Field(7)
    public long field_time() {
        return this.io.getNativeObjectField(this, 7);
    }

    @Field(7)
    public GstSegment field_time(long field_time) {
        this.io.setNativeObjectField(this, 7, field_time);
        return this;
    }

    protected native void gst_segment_free(
        @Ptr
        long segment);

    public void free() {
        this.gst_segment_free(Pointer.pointerTo(this, GstSegment.class));
    }

    @Field(8)
    public long field_duration() {
        return this.io.getNativeObjectField(this, 8);
    }

    @Field(8)
    public GstSegment field_duration(long field_duration) {
        this.io.setNativeObjectField(this, 8, field_duration);
        return this;
    }

    @Field(9)
    public long field_base() {
        return this.io.getNativeObjectField(this, 9);
    }

    @Field(9)
    public GstSegment field_base(long field_base) {
        this.io.setNativeObjectField(this, 9, field_base);
        return this;
    }

    @Field(10)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 10);
    }

    @Field(10)
    public GstSegment field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 10, field__gst_reserved);
        return this;
    }

    protected native boolean gst_segment_set_running_time(
        @Ptr
        long segment, IntValuedEnum<GstFormat> format, long running_time);

    public boolean set_running_time(IntValuedEnum<GstFormat> format, long running_time) {
        return this.gst_segment_set_running_time(Pointer.pointerTo(this, GstSegment.class), format, running_time);
    }

    @Field(11)
    public long field_offset() {
        return this.io.getNativeObjectField(this, 11);
    }

    @Field(11)
    public GstSegment field_offset(long field_offset) {
        this.io.setNativeObjectField(this, 11, field_offset);
        return this;
    }

    protected native void gst_segment_init(
        @Ptr
        long segment, IntValuedEnum<GstFormat> format);

    public void init(IntValuedEnum<GstFormat> format) {
        this.gst_segment_init(Pointer.pointerTo(this, GstSegment.class), format);
    }

    protected native long gst_segment_to_position(
        @Ptr
        long segment, IntValuedEnum<GstFormat> format, long running_time);

    public long to_position(IntValuedEnum<GstFormat> format, long running_time) {
        return this.gst_segment_to_position(Pointer.pointerTo(this, GstSegment.class), format, running_time);
    }

}
