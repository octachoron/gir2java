
package generated.gstreamer10.gst;

import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstAllocationParams
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstAllocationParams() {
        super();
    }

    public GstAllocationParams(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public IntValuedEnum<GstMemoryFlags> gstallocationparams_field_flags() {
        return this.io.getEnumField(this, 0);
    }

    @Field(0)
    public GstAllocationParams gstallocationparams_field_flags(IntValuedEnum<GstMemoryFlags> gstallocationparams_field_flags) {
        this.io.setEnumField(this, 0, gstallocationparams_field_flags);
        return this;
    }

    @Field(1)
    public long gstallocationparams_field_prefix() {
        return this.io.getLongField(this, 1);
    }

    @Field(1)
    public GstAllocationParams gstallocationparams_field_prefix(long gstallocationparams_field_prefix) {
        this.io.setLongField(this, 1, gstallocationparams_field_prefix);
        return this;
    }

    protected native void gst_allocation_params_init(
        @Ptr
        long params);

    public void init() {
        this.gst_allocation_params_init(Pointer.pointerTo(this, GstAllocationParams.class).getPeer());
    }

    @Ptr
    protected native long gst_allocation_params_copy(
        @Ptr
        long params);

    public Pointer<GstAllocationParams> copy() {
        return Pointer.pointerToAddress(this.gst_allocation_params_copy(Pointer.pointerTo(this, GstAllocationParams.class).getPeer()), GstAllocationParams.class);
    }

    @Field(2)
    public long gstallocationparams_field_padding() {
        return this.io.getLongField(this, 2);
    }

    @Field(2)
    public GstAllocationParams gstallocationparams_field_padding(long gstallocationparams_field_padding) {
        this.io.setLongField(this, 2, gstallocationparams_field_padding);
        return this;
    }

    @Field(3)
    public long gstallocationparams_field_align() {
        return this.io.getLongField(this, 3);
    }

    @Field(3)
    public GstAllocationParams gstallocationparams_field_align(long gstallocationparams_field_align) {
        this.io.setLongField(this, 3, gstallocationparams_field_align);
        return this;
    }

    protected native void gst_allocation_params_free(
        @Ptr
        long params);

    public void free() {
        this.gst_allocation_params_free(Pointer.pointerTo(this, GstAllocationParams.class).getPeer());
    }

    @Field(4)
    private Pointer gstallocationparams_field__gst_reserved() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    private GstAllocationParams gstallocationparams_field__gst_reserved(Pointer gstallocationparams_field__gst_reserved) {
        this.io.setPointerField(this, 4, gstallocationparams_field__gst_reserved);
        return this;
    }

}
