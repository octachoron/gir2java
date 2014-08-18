
package generated.gstreamerbase10.gstbase;

import generated.gstreamer10.gst.GstElement;
import generated.gstreamer10.gst.GstFlowReturn;
import generated.gstreamer10.gst.GstFormat;
import generated.gstreamer10.gst.GstPad;
import generated.gstreamer10.gst.GstSegment;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-base-1.0")
public class GstBaseParse
    extends GstElement
{


    static {
        BridJ.register();
    }

    public GstBaseParse() {
        super();
    }

    public GstBaseParse(Pointer pointer) {
        super(pointer);
    }

    protected native boolean gst_base_parse_add_index_entry(
        @Ptr
        long parse, long offset, long ts, boolean key, boolean force);

    public boolean add_index_entry(long offset, long ts, boolean key, boolean force) {
        return this.gst_base_parse_add_index_entry(Pointer.pointerTo(this, GstBaseParse.class).getPeer(), offset, ts, key, force);
    }

    protected native boolean gst_base_parse_convert_default(
        @Ptr
        long parse, IntValuedEnum<GstFormat> src_format, long src_value, IntValuedEnum<GstFormat> dest_format,
        @Ptr
        long dest_value);

    public boolean convert_default(IntValuedEnum<GstFormat> src_format, long src_value, IntValuedEnum<GstFormat> dest_format, Pointer<Long> dest_value) {
        return this.gst_base_parse_convert_default(Pointer.pointerTo(this, GstBaseParse.class).getPeer(), src_format, src_value, dest_format, Pointer.getPeer(dest_value));
    }

    protected native IntValuedEnum<GstFlowReturn> gst_base_parse_finish_frame(
        @Ptr
        long parse,
        @Ptr
        long frame, int size);

    public IntValuedEnum<GstFlowReturn> finish_frame(Pointer frame, int size) {
        return this.gst_base_parse_finish_frame(Pointer.pointerTo(this, GstBaseParse.class).getPeer(), Pointer.getPeer(frame), size);
    }

    protected native IntValuedEnum<GstFlowReturn> gst_base_parse_push_frame(
        @Ptr
        long parse,
        @Ptr
        long frame);

    public IntValuedEnum<GstFlowReturn> push_frame(Pointer frame) {
        return this.gst_base_parse_push_frame(Pointer.pointerTo(this, GstBaseParse.class).getPeer(), Pointer.getPeer(frame));
    }

    protected native void gst_base_parse_set_average_bitrate(
        @Ptr
        long parse, long bitrate);

    public void set_average_bitrate(long bitrate) {
        this.gst_base_parse_set_average_bitrate(Pointer.pointerTo(this, GstBaseParse.class).getPeer(), bitrate);
    }

    protected native void gst_base_parse_set_duration(
        @Ptr
        long parse, IntValuedEnum<GstFormat> fmt, long duration, int interval);

    public void set_duration(IntValuedEnum<GstFormat> fmt, long duration, int interval) {
        this.gst_base_parse_set_duration(Pointer.pointerTo(this, GstBaseParse.class).getPeer(), fmt, duration, interval);
    }

    protected native void gst_base_parse_set_frame_rate(
        @Ptr
        long parse, long fps_num, long fps_den, long lead_in, long lead_out);

    public void set_frame_rate(long fps_num, long fps_den, long lead_in, long lead_out) {
        this.gst_base_parse_set_frame_rate(Pointer.pointerTo(this, GstBaseParse.class).getPeer(), fps_num, fps_den, lead_in, lead_out);
    }

    protected native void gst_base_parse_set_has_timing_info(
        @Ptr
        long parse, boolean has_timing);

    public void set_has_timing_info(boolean has_timing) {
        this.gst_base_parse_set_has_timing_info(Pointer.pointerTo(this, GstBaseParse.class).getPeer(), has_timing);
    }

    protected native void gst_base_parse_set_infer_ts(
        @Ptr
        long parse, boolean infer_ts);

    public void set_infer_ts(boolean infer_ts) {
        this.gst_base_parse_set_infer_ts(Pointer.pointerTo(this, GstBaseParse.class).getPeer(), infer_ts);
    }

    protected native void gst_base_parse_set_latency(
        @Ptr
        long parse, long min_latency, long max_latency);

    public void set_latency(long min_latency, long max_latency) {
        this.gst_base_parse_set_latency(Pointer.pointerTo(this, GstBaseParse.class).getPeer(), min_latency, max_latency);
    }

    protected native void gst_base_parse_set_min_frame_size(
        @Ptr
        long parse, long min_size);

    public void set_min_frame_size(long min_size) {
        this.gst_base_parse_set_min_frame_size(Pointer.pointerTo(this, GstBaseParse.class).getPeer(), min_size);
    }

    protected native void gst_base_parse_set_passthrough(
        @Ptr
        long parse, boolean passthrough);

    public void set_passthrough(boolean passthrough) {
        this.gst_base_parse_set_passthrough(Pointer.pointerTo(this, GstBaseParse.class).getPeer(), passthrough);
    }

    protected native void gst_base_parse_set_pts_interpolation(
        @Ptr
        long parse, boolean pts_interpolate);

    public void set_pts_interpolation(boolean pts_interpolate) {
        this.gst_base_parse_set_pts_interpolation(Pointer.pointerTo(this, GstBaseParse.class).getPeer(), pts_interpolate);
    }

    protected native void gst_base_parse_set_syncable(
        @Ptr
        long parse, boolean syncable);

    public void set_syncable(boolean syncable) {
        this.gst_base_parse_set_syncable(Pointer.pointerTo(this, GstBaseParse.class).getPeer(), syncable);
    }

    protected native void gst_base_parse_set_ts_at_offset(
        @Ptr
        long parse, long offset);

    public void set_ts_at_offset(long offset) {
        this.gst_base_parse_set_ts_at_offset(Pointer.pointerTo(this, GstBaseParse.class).getPeer(), offset);
    }

    @Field(0)
    public GstElement field_element() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstBaseParse field_element(GstElement field_element) {
        this.io.setNativeObjectField(this, 0, field_element);
        return this;
    }

    @Field(1)
    public Pointer<GstPad> field_sinkpad() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstBaseParse field_sinkpad(Pointer<GstPad> field_sinkpad) {
        this.io.setPointerField(this, 1, field_sinkpad);
        return this;
    }

    @Field(2)
    public Pointer<GstPad> field_srcpad() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GstBaseParse field_srcpad(Pointer<GstPad> field_srcpad) {
        this.io.setPointerField(this, 2, field_srcpad);
        return this;
    }

    @Field(3)
    public long gstbaseparse_field_flags() {
        return this.io.getLongField(this, 3);
    }

    @Field(3)
    public GstBaseParse gstbaseparse_field_flags(long gstbaseparse_field_flags) {
        this.io.setLongField(this, 3, gstbaseparse_field_flags);
        return this;
    }

    @Field(4)
    public GstSegment field_segment() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    public GstBaseParse field_segment(GstSegment field_segment) {
        this.io.setNativeObjectField(this, 4, field_segment);
        return this;
    }

    @Field(5)
    private Pointer gstbaseparse_field__gst_reserved() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    private GstBaseParse gstbaseparse_field__gst_reserved(Pointer gstbaseparse_field__gst_reserved) {
        this.io.setPointerField(this, 5, gstbaseparse_field__gst_reserved);
        return this;
    }

    @Field(6)
    private Pointer field_priv() {
        return this.io.getPointerField(this, 6);
    }

    @Field(6)
    private GstBaseParse field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 6, field_priv);
        return this;
    }

}
