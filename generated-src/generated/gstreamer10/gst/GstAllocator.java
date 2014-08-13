
package generated.gstreamer10.gst;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstAllocator
    extends StructObject
{


    public GstAllocator() {
        super();
    }

    public GstAllocator(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long gst_allocator_find(
        @Ptr
        long name);

    public Pointer find(Pointer name) {
        return Pointer.pointerToAddress(this.gst_allocator_find(Pointer.getPeer(name)));
    }

    protected native void gst_allocator_register(
        @Ptr
        long name,
        @Ptr
        long allocator);

    public void register(Pointer name, Pointer allocator) {
        this.gst_allocator_register(Pointer.getPeer(name), Pointer.getPeer(allocator));
    }

    @Ptr
    protected native long gst_allocator_alloc(
        @Ptr
        long allocator, long size,
        @Ptr
        long params);

    public Pointer alloc(long size, Pointer<GstAllocationParams> params) {
        return Pointer.pointerToAddress(this.gst_allocator_alloc(Pointer.pointerTo(this, GstAllocator.class), size, Pointer.getPeer(params)));
    }

    protected native void gst_allocator_free(
        @Ptr
        long allocator,
        @Ptr
        long memory);

    public void free(Pointer memory) {
        this.gst_allocator_free(Pointer.pointerTo(this, GstAllocator.class), Pointer.getPeer(memory));
    }

    protected native void gst_allocator_set_default(
        @Ptr
        long allocator);

    public void set_default() {
        this.gst_allocator_set_default(Pointer.pointerTo(this, GstAllocator.class));
    }

    @Field(0)
    public Object field_mem_is_span() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstAllocator field_mem_is_span(Object field_mem_is_span) {
        this.io.setNativeObjectField(this, 0, field_mem_is_span);
        return this;
    }

    @Field(1)
    public Object field_mem_unmap() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GstAllocator field_mem_unmap(Object field_mem_unmap) {
        this.io.setNativeObjectField(this, 1, field_mem_unmap);
        return this;
    }

    @Field(2)
    public Pointer field_mem_type() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GstAllocator field_mem_type(Pointer field_mem_type) {
        this.io.setPointerField(this, 2, field_mem_type);
        return this;
    }

    @Field(3)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public GstAllocator field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 3, field__gst_reserved);
        return this;
    }

    @Field(4)
    public Object field_mem_copy() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    public GstAllocator field_mem_copy(Object field_mem_copy) {
        this.io.setNativeObjectField(this, 4, field_mem_copy);
        return this;
    }

    @Field(5)
    public Pointer<GstAllocatorPrivate> field_priv() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    public GstAllocator field_priv(Pointer<GstAllocatorPrivate> field_priv) {
        this.io.setPointerField(this, 5, field_priv);
        return this;
    }

    @Field(6)
    public Object field_mem_share() {
        return this.io.getNativeObjectField(this, 6);
    }

    @Field(6)
    public GstAllocator field_mem_share(Object field_mem_share) {
        this.io.setNativeObjectField(this, 6, field_mem_share);
        return this;
    }

    @Field(7)
    public GstObject field_object() {
        return this.io.getNativeObjectField(this, 7);
    }

    @Field(7)
    public GstAllocator field_object(GstObject field_object) {
        this.io.setNativeObjectField(this, 7, field_object);
        return this;
    }

    @Field(8)
    public Object field_mem_map() {
        return this.io.getNativeObjectField(this, 8);
    }

    @Field(8)
    public GstAllocator field_mem_map(Object field_mem_map) {
        this.io.setNativeObjectField(this, 8, field_mem_map);
        return this;
    }

}
