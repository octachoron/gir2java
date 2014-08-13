
package generated.gstreamerrtsp10.gstrtsp;

import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-rtsp-1.0")
public class GstRTSPRange
    extends StructObject
{


    public GstRTSPRange() {
        super();
    }

    public GstRTSPRange(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public int field_min() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstRTSPRange field_min(int field_min) {
        this.io.setNativeObjectField(this, 0, field_min);
        return this;
    }

    @Field(1)
    public int field_max() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GstRTSPRange field_max(int field_max) {
        this.io.setNativeObjectField(this, 1, field_max);
        return this;
    }

    protected native void gst_rtsp_range_free(
        @Ptr
        long range);

    public void free(Pointer range) {
        this.gst_rtsp_range_free(Pointer.getPeer(range));
    }

    protected native boolean gst_rtsp_range_get_times(
        @Ptr
        long range,
        @Ptr
        long min,
        @Ptr
        long max);

    public boolean get_times(Pointer range, Pointer<Object> min, Pointer<Object> max) {
        return this.gst_rtsp_range_get_times(Pointer.getPeer(range), Pointer.getPeer(min), Pointer.getPeer(max));
    }

    @Ptr
    protected native long gst_rtsp_range_to_string(
        @Ptr
        long range);

    public Pointer to_string(Pointer range) {
        return Pointer.pointerToAddress(this.gst_rtsp_range_to_string(Pointer.getPeer(range)));
    }

    protected native boolean gst_rtsp_range_convert_units(
        @Ptr
        long range, IntValuedEnum<GstRTSPRangeUnit> unit);

    public boolean convert_units(Pointer<GstRTSPTimeRange> range, IntValuedEnum<GstRTSPRangeUnit> unit) {
        return this.gst_rtsp_range_convert_units(Pointer.getPeer(range), unit);
    }

    protected native IntValuedEnum<GstRTSPResult> gst_rtsp_range_parse(
        @Ptr
        long rangestr,
        @Ptr
        long range);

    public IntValuedEnum<GstRTSPResult> parse(Pointer rangestr, Pointer<Pointer<GstRTSPTimeRange>> range) {
        return this.gst_rtsp_range_parse(Pointer.getPeer(rangestr), Pointer.getPeer(range));
    }

}
