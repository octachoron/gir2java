
package generated.gstreamer10.gst;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstMemory
    extends StructObject
{


    public GstMemory() {
        super();
    }

    public GstMemory(Pointer pointer) {
        super(pointer);
    }

    protected native boolean gst_memory_is_span(
        @Ptr
        long mem1,
        @Ptr
        long mem2,
        @Ptr
        long offset);

    public boolean is_span(Pointer<GstMemory> mem2, Pointer<Long> offset) {
        return this.gst_memory_is_span(Pointer.pointerTo(this, GstMemory.class), Pointer.getPeer(mem2), Pointer.getPeer(offset));
    }

    @Ptr
    protected native long gst_memory_share(
        @Ptr
        long mem, long offset, long size);

    public Pointer<GstMemory> share(long offset, long size) {
        return Pointer.pointerToAddress(this.gst_memory_share(Pointer.pointerTo(this, GstMemory.class), offset, size), Pointer.class);
    }

    protected native void gst_memory_init(
        @Ptr
        long mem, Object flags,
        @Ptr
        long allocator,
        @Ptr
        long parent, long maxsize, long align, long offset, long size);

    public void init(Object flags, Pointer<GstAllocator> allocator, Pointer<GstMemory> parent, long maxsize, long align, long offset, long size) {
        this.gst_memory_init(Pointer.pointerTo(this, GstMemory.class), flags, Pointer.getPeer(allocator), Pointer.getPeer(parent), maxsize, align, offset, size);
    }

    @Field(0)
    public GstMiniObject field_mini_object() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstMemory field_mini_object(GstMiniObject field_mini_object) {
        this.io.setNativeObjectField(this, 0, field_mini_object);
        return this;
    }

    protected native void gst_memory_unmap(
        @Ptr
        long mem,
        @Ptr
        long info);

    public void unmap(Pointer<GstMapInfo> info) {
        this.gst_memory_unmap(Pointer.pointerTo(this, GstMemory.class), Pointer.getPeer(info));
    }

    protected native boolean gst_memory_is_type(
        @Ptr
        long mem,
        @Ptr
        long mem_type);

    public boolean is_type(Pointer mem_type) {
        return this.gst_memory_is_type(Pointer.pointerTo(this, GstMemory.class), Pointer.getPeer(mem_type));
    }

    protected native void gst_memory_resize(
        @Ptr
        long mem, long offset, long size);

    public void resize(long offset, long size) {
        this.gst_memory_resize(Pointer.pointerTo(this, GstMemory.class), offset, size);
    }

    @Ptr
    protected native long gst_memory_copy(
        @Ptr
        long mem, long offset, long size);

    public Pointer<GstMemory> copy(long offset, long size) {
        return Pointer.pointerToAddress(this.gst_memory_copy(Pointer.pointerTo(this, GstMemory.class), offset, size), Pointer.class);
    }

    @Field(1)
    public Pointer<GstMemory> field_parent() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstMemory field_parent(Pointer<GstMemory> field_parent) {
        this.io.setPointerField(this, 1, field_parent);
        return this;
    }

    @Ptr
    protected native long gst_memory_make_mapped(
        @Ptr
        long mem,
        @Ptr
        long info, Object flags);

    public Pointer<GstMemory> make_mapped(Pointer<GstMapInfo> info, Object flags) {
        return Pointer.pointerToAddress(this.gst_memory_make_mapped(Pointer.pointerTo(this, GstMemory.class), Pointer.getPeer(info), flags), Pointer.class);
    }

    @Field(2)
    public long field_size() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GstMemory field_size(long field_size) {
        this.io.setNativeObjectField(this, 2, field_size);
        return this;
    }

    @Field(3)
    public long field_align() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GstMemory field_align(long field_align) {
        this.io.setNativeObjectField(this, 3, field_align);
        return this;
    }

    @Field(4)
    public Pointer<GstAllocator> field_allocator() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public GstMemory field_allocator(Pointer<GstAllocator> field_allocator) {
        this.io.setPointerField(this, 4, field_allocator);
        return this;
    }

    @Field(5)
    public long field_maxsize() {
        return this.io.getNativeObjectField(this, 5);
    }

    @Field(5)
    public GstMemory field_maxsize(long field_maxsize) {
        this.io.setNativeObjectField(this, 5, field_maxsize);
        return this;
    }

    protected native boolean gst_memory_map(
        @Ptr
        long mem,
        @Ptr
        long info, Object flags);

    public boolean map(Pointer<GstMapInfo> info, Object flags) {
        return this.gst_memory_map(Pointer.pointerTo(this, GstMemory.class), Pointer.getPeer(info), flags);
    }

    @Field(6)
    public long field_offset() {
        return this.io.getNativeObjectField(this, 6);
    }

    @Field(6)
    public GstMemory field_offset(long field_offset) {
        this.io.setNativeObjectField(this, 6, field_offset);
        return this;
    }

    protected native long gst_memory_get_sizes(
        @Ptr
        long mem,
        @Ptr
        long offset,
        @Ptr
        long maxsize);

    public long get_sizes(Pointer<Long> offset, Pointer<Long> maxsize) {
        return this.gst_memory_get_sizes(Pointer.pointerTo(this, GstMemory.class), Pointer.getPeer(offset), Pointer.getPeer(maxsize));
    }

}
