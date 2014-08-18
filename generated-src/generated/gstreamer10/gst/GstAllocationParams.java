
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
    public long field_padding() {
        return this.io.getLongField(this, 0);
    }

    @Field(0)
    public GstAllocationParams field_padding(long field_padding) {
        this.io.setLongField(this, 0, field_padding);
        return this;
    }

    @Field(1)
    public long field_prefix() {
        return this.io.getLongField(this, 1);
    }

    @Field(1)
    public GstAllocationParams field_prefix(long field_prefix) {
        this.io.setLongField(this, 1, field_prefix);
        return this;
    }

    @Field(2)
    private Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    private GstAllocationParams field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 2, field__gst_reserved);
        return this;
    }

    @Field(3)
    public long field_align() {
        return this.io.getLongField(this, 3);
    }

    @Field(3)
    public GstAllocationParams field_align(long field_align) {
        this.io.setLongField(this, 3, field_align);
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

    protected native void gst_allocation_params_free(
        @Ptr
        long params);

    public void free() {
        this.gst_allocation_params_free(Pointer.pointerTo(this, GstAllocationParams.class).getPeer());
    }

    @Field(4)
    public IntValuedEnum<GstMemoryFlags> field_flags() {
        return this.io.getEnumField(this, 4);
    }

    @Field(4)
    public GstAllocationParams field_flags(IntValuedEnum<GstMemoryFlags> field_flags) {
        this.io.setEnumField(this, 4, field_flags);
        return this;
    }

}
