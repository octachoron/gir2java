
package generated.gstreamer10.gst;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstAllocationParams
    extends StructObject
{


    public GstAllocationParams() {
        super();
    }

    public GstAllocationParams(Pointer pointer) {
        super(pointer);
    }

    protected native void gst_allocation_params_free(
        @Ptr
        long params);

    public void free() {
        this.gst_allocation_params_free(Pointer.pointerTo(this, GstAllocationParams.class));
    }

    @Field(0)
    public long field_padding() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstAllocationParams field_padding(long field_padding) {
        this.io.setNativeObjectField(this, 0, field_padding);
        return this;
    }

    @Field(1)
    public long field_align() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GstAllocationParams field_align(long field_align) {
        this.io.setNativeObjectField(this, 1, field_align);
        return this;
    }

    @Ptr
    protected native long gst_allocation_params_copy(
        @Ptr
        long params);

    public Pointer<GstAllocationParams> copy() {
        return Pointer.pointerToAddress(this.gst_allocation_params_copy(Pointer.pointerTo(this, GstAllocationParams.class)), Pointer.class);
    }

    @Field(2)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GstAllocationParams field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 2, field__gst_reserved);
        return this;
    }

    protected native void gst_allocation_params_init(
        @Ptr
        long params);

    public void init() {
        this.gst_allocation_params_init(Pointer.pointerTo(this, GstAllocationParams.class));
    }

    @Field(3)
    public Object field_flags() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GstAllocationParams field_flags(Object field_flags) {
        this.io.setNativeObjectField(this, 3, field_flags);
        return this;
    }

    @Field(4)
    public long field_prefix() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    public GstAllocationParams field_prefix(long field_prefix) {
        this.io.setNativeObjectField(this, 4, field_prefix);
        return this;
    }

}
