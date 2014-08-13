
package generated.gstreamersdp10.gstsdp;

import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-sdp-1.0")
public class GstSDPAttribute
    extends StructObject
{


    public GstSDPAttribute() {
        super();
    }

    public GstSDPAttribute(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer field_key() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GstSDPAttribute field_key(Pointer field_key) {
        this.io.setPointerField(this, 0, field_key);
        return this;
    }

    @Field(1)
    public Pointer field_value() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstSDPAttribute field_value(Pointer field_value) {
        this.io.setPointerField(this, 1, field_value);
        return this;
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_attribute_clear(
        @Ptr
        long attr);

    public IntValuedEnum<GstSDPResult> clear() {
        return this.gst_sdp_attribute_clear(Pointer.pointerTo(this, GstSDPAttribute.class));
    }

    protected native IntValuedEnum<GstSDPResult> gst_sdp_attribute_set(
        @Ptr
        long attr,
        @Ptr
        long key,
        @Ptr
        long value);

    public IntValuedEnum<GstSDPResult> set(Pointer key, Pointer value) {
        return this.gst_sdp_attribute_set(Pointer.pointerTo(this, GstSDPAttribute.class), Pointer.getPeer(key), Pointer.getPeer(value));
    }

}
