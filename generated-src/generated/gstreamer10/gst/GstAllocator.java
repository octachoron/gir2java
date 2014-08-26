
package generated.gstreamer10.gst;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstAllocator
    extends GstObject
{


    static {
        BridJ.register();
    }

    public GstAllocator() {
        super();
    }

    public GstAllocator(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long gst_allocator_find(
        @Ptr
        long name);

    public static Pointer find(Pointer name) {
        return Pointer.pointerToAddress(GstAllocator.gst_allocator_find(Pointer.getPeer(name)));
    }

    protected static native void gst_allocator_register(
        @Ptr
        long name,
        @Ptr
        long allocator);

    public static void register(Pointer name, Pointer allocator) {
        GstAllocator.gst_allocator_register(Pointer.getPeer(name), Pointer.getPeer(allocator));
    }

    @Ptr
    protected native long gst_allocator_alloc(
        @Ptr
        long allocator, long size,
        @Ptr
        long params);

    public Pointer alloc(long size, Pointer<GstAllocationParams> params) {
        return Pointer.pointerToAddress(this.gst_allocator_alloc(Pointer.pointerTo(this, GstAllocator.class).getPeer(), size, Pointer.getPeer(params)));
    }

    protected native void gst_allocator_free(
        @Ptr
        long allocator,
        @Ptr
        long memory);

    public void free(Pointer memory) {
        this.gst_allocator_free(Pointer.pointerTo(this, GstAllocator.class).getPeer(), Pointer.getPeer(memory));
    }

    protected native void gst_allocator_set_default(
        @Ptr
        long allocator);

    public void set_default() {
        this.gst_allocator_set_default(Pointer.pointerTo(this, GstAllocator.class).getPeer());
    }

    @Field(0)
    public Pointer gstallocator_field_mem_unmap() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GstAllocator gstallocator_field_mem_unmap(Pointer gstallocator_field_mem_unmap) {
        this.io.setPointerField(this, 0, gstallocator_field_mem_unmap);
        return this;
    }

    @Field(1)
    private Pointer gstallocator_field__gst_reserved() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GstAllocator gstallocator_field__gst_reserved(Pointer gstallocator_field__gst_reserved) {
        this.io.setPointerField(this, 1, gstallocator_field__gst_reserved);
        return this;
    }

    @Field(2)
    public Pointer gstallocator_field_mem_map() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GstAllocator gstallocator_field_mem_map(Pointer gstallocator_field_mem_map) {
        this.io.setPointerField(this, 2, gstallocator_field_mem_map);
        return this;
    }

    @Field(3)
    public Pointer gstallocator_field_mem_share() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public GstAllocator gstallocator_field_mem_share(Pointer gstallocator_field_mem_share) {
        this.io.setPointerField(this, 3, gstallocator_field_mem_share);
        return this;
    }

    @Field(4)
    public GstObject gstallocator_field_object() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    public GstAllocator gstallocator_field_object(GstObject gstallocator_field_object) {
        this.io.setNativeObjectField(this, 4, gstallocator_field_object);
        return this;
    }

    @Field(5)
    public Pointer gstallocator_field_mem_copy() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    public GstAllocator gstallocator_field_mem_copy(Pointer gstallocator_field_mem_copy) {
        this.io.setPointerField(this, 5, gstallocator_field_mem_copy);
        return this;
    }

    @Field(6)
    public Pointer gstallocator_field_mem_is_span() {
        return this.io.getPointerField(this, 6);
    }

    @Field(6)
    public GstAllocator gstallocator_field_mem_is_span(Pointer gstallocator_field_mem_is_span) {
        this.io.setPointerField(this, 6, gstallocator_field_mem_is_span);
        return this;
    }

    @Field(7)
    private Pointer<GstAllocatorPrivate> gstallocator_field_priv() {
        return this.io.getPointerField(this, 7);
    }

    @Field(7)
    private GstAllocator gstallocator_field_priv(Pointer<GstAllocatorPrivate> gstallocator_field_priv) {
        this.io.setPointerField(this, 7, gstallocator_field_priv);
        return this;
    }

    @Field(8)
    public Pointer gstallocator_field_mem_type() {
        return this.io.getPointerField(this, 8);
    }

    @Field(8)
    public GstAllocator gstallocator_field_mem_type(Pointer gstallocator_field_mem_type) {
        this.io.setPointerField(this, 8, gstallocator_field_mem_type);
        return this;
    }

}
