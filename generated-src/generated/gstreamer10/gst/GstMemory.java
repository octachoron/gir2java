
package generated.gstreamer10.gst;

import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstMemory
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstMemory() {
        super();
    }

    public GstMemory(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long gst_memory_new_wrapped(IntValuedEnum<GstMemoryFlags> flags, short data, long maxsize, long offset, long size,
        @Ptr
        long user_data,
        @Ptr
        long notify);

    public static Pointer<GstMemory> new_wrapped(IntValuedEnum<GstMemoryFlags> flags, short data, long maxsize, long offset, long size, Pointer user_data, Pointer notify) {
        return Pointer.pointerToAddress(GstMemory.gst_memory_new_wrapped(flags, data, maxsize, offset, size, Pointer.getPeer(user_data), Pointer.getPeer(notify)), GstMemory.class);
    }

    @Ptr
    protected native long gst_memory_share(
        @Ptr
        long mem, long offset, long size);

    public Pointer<GstMemory> share(long offset, long size) {
        return Pointer.pointerToAddress(this.gst_memory_share(Pointer.pointerTo(this, GstMemory.class).getPeer(), offset, size), GstMemory.class);
    }

    @Field(0)
    public long field_align() {
        return this.io.getLongField(this, 0);
    }

    @Field(0)
    public GstMemory field_align(long field_align) {
        this.io.setLongField(this, 0, field_align);
        return this;
    }

    @Field(1)
    public Pointer field_allocator() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstMemory field_allocator(Pointer field_allocator) {
        this.io.setPointerField(this, 1, field_allocator);
        return this;
    }

    @Ptr
    protected native long gst_memory_make_mapped(
        @Ptr
        long mem,
        @Ptr
        long info, IntValuedEnum<GstMapFlags> flags);

    public Pointer<GstMemory> make_mapped(Pointer<GstMapInfo> info, IntValuedEnum<GstMapFlags> flags) {
        return Pointer.pointerToAddress(this.gst_memory_make_mapped(Pointer.pointerTo(this, GstMemory.class).getPeer(), Pointer.getPeer(info), flags), GstMemory.class);
    }

    @Ptr
    protected native long gst_memory_copy(
        @Ptr
        long mem, long offset, long size);

    public Pointer<GstMemory> copy(long offset, long size) {
        return Pointer.pointerToAddress(this.gst_memory_copy(Pointer.pointerTo(this, GstMemory.class).getPeer(), offset, size), GstMemory.class);
    }

    protected native long gst_memory_get_sizes(
        @Ptr
        long mem,
        @Ptr
        long offset,
        @Ptr
        long maxsize);

    public long get_sizes(Pointer<Long> offset, Pointer<Long> maxsize) {
        return this.gst_memory_get_sizes(Pointer.pointerTo(this, GstMemory.class).getPeer(), Pointer.getPeer(offset), Pointer.getPeer(maxsize));
    }

    protected native boolean gst_memory_is_type(
        @Ptr
        long mem,
        @Ptr
        long mem_type);

    public boolean is_type(Pointer mem_type) {
        return this.gst_memory_is_type(Pointer.pointerTo(this, GstMemory.class).getPeer(), Pointer.getPeer(mem_type));
    }

    protected native void gst_memory_unmap(
        @Ptr
        long mem,
        @Ptr
        long info);

    public void unmap(Pointer<GstMapInfo> info) {
        this.gst_memory_unmap(Pointer.pointerTo(this, GstMemory.class).getPeer(), Pointer.getPeer(info));
    }

    @Field(2)
    public long field_maxsize() {
        return this.io.getLongField(this, 2);
    }

    @Field(2)
    public GstMemory field_maxsize(long field_maxsize) {
        this.io.setLongField(this, 2, field_maxsize);
        return this;
    }

    @Field(3)
    public long field_offset() {
        return this.io.getLongField(this, 3);
    }

    @Field(3)
    public GstMemory field_offset(long field_offset) {
        this.io.setLongField(this, 3, field_offset);
        return this;
    }

    @Field(4)
    public Pointer<GstMemory> field_parent() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public GstMemory field_parent(Pointer<GstMemory> field_parent) {
        this.io.setPointerField(this, 4, field_parent);
        return this;
    }

    @Field(5)
    public long field_size() {
        return this.io.getLongField(this, 5);
    }

    @Field(5)
    public GstMemory field_size(long field_size) {
        this.io.setLongField(this, 5, field_size);
        return this;
    }

    protected native boolean gst_memory_is_span(
        @Ptr
        long mem1,
        @Ptr
        long mem2,
        @Ptr
        long offset);

    public boolean is_span(Pointer<GstMemory> mem2, Pointer<Long> offset) {
        return this.gst_memory_is_span(Pointer.pointerTo(this, GstMemory.class).getPeer(), Pointer.getPeer(mem2), Pointer.getPeer(offset));
    }

    protected native void gst_memory_init(
        @Ptr
        long mem, IntValuedEnum<GstMemoryFlags> flags,
        @Ptr
        long allocator,
        @Ptr
        long parent, long maxsize, long align, long offset, long size);

    public void init(IntValuedEnum<GstMemoryFlags> flags, Pointer<GstAllocator> allocator, Pointer<GstMemory> parent, long maxsize, long align, long offset, long size) {
        this.gst_memory_init(Pointer.pointerTo(this, GstMemory.class).getPeer(), flags, Pointer.getPeer(allocator), Pointer.getPeer(parent), maxsize, align, offset, size);
    }

    protected native boolean gst_memory_map(
        @Ptr
        long mem,
        @Ptr
        long info, IntValuedEnum<GstMapFlags> flags);

    public boolean map(Pointer<GstMapInfo> info, IntValuedEnum<GstMapFlags> flags) {
        return this.gst_memory_map(Pointer.pointerTo(this, GstMemory.class).getPeer(), Pointer.getPeer(info), flags);
    }

    @Field(6)
    public GstMiniObject field_mini_object() {
        return this.io.getNativeObjectField(this, 6);
    }

    @Field(6)
    public GstMemory field_mini_object(GstMiniObject field_mini_object) {
        this.io.setNativeObjectField(this, 6, field_mini_object);
        return this;
    }

    protected native void gst_memory_resize(
        @Ptr
        long mem, long offset, long size);

    public void resize(long offset, long size) {
        this.gst_memory_resize(Pointer.pointerTo(this, GstMemory.class).getPeer(), offset, size);
    }

}
