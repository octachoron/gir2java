
package generated.gstreamersdp10.gstsdp;

import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-sdp-1.0")
public class GstSDPBandwidth
    extends StructObject
{


    public GstSDPBandwidth() {
        super();
    }

    public GstSDPBandwidth(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer field_bwtype() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GstSDPBandwidth field_bwtype(Pointer field_bwtype) {
        this.io.setPointerField(this, 0, field_bwtype);
        return this;
    }

    @Field(1)
    public long field_bandwidth() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GstSDPBandwidth field_bandwidth(long field_bandwidth) {
        this.io.setNativeObjectField(this, 1, field_bandwidth);
        return this;
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_bandwidth_clear(
        @Ptr
        long bw);

    public IntValuedEnum<GstSDPResult> clear() {
        return this.gst_sdp_bandwidth_clear(Pointer.pointerTo(this, GstSDPBandwidth.class));
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_bandwidth_set(
        @Ptr
        long bw,
        @Ptr
        long bwtype, long bandwidth);

    public IntValuedEnum<GstSDPResult> set(Pointer bwtype, long bandwidth) {
        return this.gst_sdp_bandwidth_set(Pointer.pointerTo(this, GstSDPBandwidth.class), Pointer.getPeer(bwtype), bandwidth);
    }

}
