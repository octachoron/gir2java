
package generated.gstreamersdp10.gstsdp;

import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-sdp-1.0")
public class GstSDPTime
    extends StructObject
{


    public GstSDPTime() {
        super();
    }

    public GstSDPTime(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer field_start() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GstSDPTime field_start(Pointer field_start) {
        this.io.setPointerField(this, 0, field_start);
        return this;
    }

    @Field(1)
    public Pointer field_stop() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstSDPTime field_stop(Pointer field_stop) {
        this.io.setPointerField(this, 1, field_stop);
        return this;
    }

    @Field(2)
    public Pointer field_repeat() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GstSDPTime field_repeat(Pointer field_repeat) {
        this.io.setPointerField(this, 2, field_repeat);
        return this;
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_time_clear(
        @Ptr
        long t);

    public IntValuedEnum<GstSDPResult> clear() {
        return this.gst_sdp_time_clear(Pointer.pointerTo(this, GstSDPTime.class));
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_time_set(
        @Ptr
        long t,
        @Ptr
        long start,
        @Ptr
        long stop,
        @Ptr
        long repeat);

    public IntValuedEnum<GstSDPResult> set(Pointer start, Pointer stop, Pointer repeat) {
        return this.gst_sdp_time_set(Pointer.pointerTo(this, GstSDPTime.class), Pointer.getPeer(start), Pointer.getPeer(stop), Pointer.getPeer(repeat));
    }

}
