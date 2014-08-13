
package generated.gstreamersdp10.gstsdp;

import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-sdp-1.0")
public class GstSDPZone
    extends StructObject
{


    public GstSDPZone() {
        super();
    }

    public GstSDPZone(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer field_time() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GstSDPZone field_time(Pointer field_time) {
        this.io.setPointerField(this, 0, field_time);
        return this;
    }

    @Field(1)
    public Pointer field_typed_time() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstSDPZone field_typed_time(Pointer field_typed_time) {
        this.io.setPointerField(this, 1, field_typed_time);
        return this;
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_zone_clear(
        @Ptr
        long zone);

    public IntValuedEnum<GstSDPResult> clear() {
        return this.gst_sdp_zone_clear(Pointer.pointerTo(this, GstSDPZone.class));
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_zone_set(
        @Ptr
        long zone,
        @Ptr
        long adj_time,
        @Ptr
        long typed_time);

    public IntValuedEnum<GstSDPResult> set(Pointer adj_time, Pointer typed_time) {
        return this.gst_sdp_zone_set(Pointer.pointerTo(this, GstSDPZone.class), Pointer.getPeer(adj_time), Pointer.getPeer(typed_time));
    }

}
