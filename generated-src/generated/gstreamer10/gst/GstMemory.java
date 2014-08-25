
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
    protected native long gst_memory_share(
        @Ptr
        long mem, long offset, long size);

    public Pointer<GstMemory> share(long offset, long size) {
        return Pointer.pointerToAddress(this.gst_memory_share(Pointer.pointerTo(this, GstMemory.class).getPeer(), offset, size), GstMemory.class);
    }

    protected native void gst_memory_unmap(
        @Ptr
        long mem,
        @Ptr
        long info);

    public void unmap(Pointer<GstMapInfo> info) {
        this.gst_memory_unmap(Pointer.pointerTo(this, GstMemory.class).getPeer(), Pointer.getPeer(info));
    }

    @Field(0)
    public GstMiniObject gstmemory_field_mini_object() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstMemory gstmemory_field_mini_object(GstMiniObject gstmemory_field_mini_object) {
        this.io.setNativeObjectField(this, 0, gstmemory_field_mini_object);
        return this;
    }

    protected native boolean gst_memory_is_type(
        @Ptr
        long mem,
        @Ptr
        long mem_type);

    public boolean is_type(Pointer mem_type) {
        return this.gst_memory_is_type(Pointer.pointerTo(this, GstMemory.class).getPeer(), Pointer.getPeer(mem_type));
    }

    @Field(1)
    public long gstmemory_field_offset() {
        return this.io.getLongField(this, 1);
    }

    @Field(1)
    public GstMemory gstmemory_field_offset(long gstmemory_field_offset) {
        this.io.setLongField(this, 1, gstmemory_field_offset);
        return this;
    }

    protected native boolean gst_memory_map(
        @Ptr
        long mem,
        @Ptr
        long info, IntValuedEnum<GstMapFlags> flags);

    public boolean map(Pointer<GstMapInfo> info, IntValuedEnum<GstMapFlags> flags) {
        return this.gst_memory_map(Pointer.pointerTo(this, GstMemory.class).getPeer(), Pointer.getPeer(info), flags);
    }

    @Field(2)
    public long gstmemory_field_align() {
        return this.io.getLongField(this, 2);
    }

    @Field(2)
    public GstMemory gstmemory_field_align(long gstmemory_field_align) {
        this.io.setLongField(this, 2, gstmemory_field_align);
        return this;
    }

    @Field(3)
    public Pointer<GstMemory> gstmemory_field_parent() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public GstMemory gstmemory_field_parent(Pointer<GstMemory> gstmemory_field_parent) {
        this.io.setPointerField(this, 3, gstmemory_field_parent);
        return this;
    }

    @Field(4)
    public long gstmemory_field_size() {
        return this.io.getLongField(this, 4);
    }

    @Field(4)
    public GstMemory gstmemory_field_size(long gstmemory_field_size) {
        this.io.setLongField(this, 4, gstmemory_field_size);
        return this;
    }

    @Field(5)
    public long gstmemory_field_maxsize() {
        return this.io.getLongField(this, 5);
    }

    @Field(5)
    public GstMemory gstmemory_field_maxsize(long gstmemory_field_maxsize) {
        this.io.setLongField(this, 5, gstmemory_field_maxsize);
        return this;
    }

    @Field(6)
    public Pointer<GstAllocator> gstmemory_field_allocator() {
        return this.io.getPointerField(this, 6);
    }

    @Field(6)
    public GstMemory gstmemory_field_allocator(Pointer<GstAllocator> gstmemory_field_allocator) {
        this.io.setPointerField(this, 6, gstmemory_field_allocator);
        return this;
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

    protected native void gst_memory_resize(
        @Ptr
        long mem, long offset, long size);

    public void resize(long offset, long size) {
        this.gst_memory_resize(Pointer.pointerTo(this, GstMemory.class).getPeer(), offset, size);
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

}
