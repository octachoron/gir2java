
package generated.gstreamer10.gst;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstBuffer
    extends StructObject
{


    public GstBuffer() {
        super();
    }

    public GstBuffer(Pointer pointer) {
        super(pointer);
    }

    protected native void gst_buffer_remove_memory(
        @Ptr
        long buffer, long idx);

    public void remove_memory(long idx) {
        this.gst_buffer_remove_memory(Pointer.pointerTo(this, GstBuffer.class), idx);
    }

    protected native void gst_buffer_replace_memory_range(
        @Ptr
        long buffer, long idx, int length,
        @Ptr
        long mem);

    public void replace_memory_range(long idx, int length, Pointer<GstMemory> mem) {
        this.gst_buffer_replace_memory_range(Pointer.pointerTo(this, GstBuffer.class), idx, length, Pointer.getPeer(mem));
    }

    protected native void gst_buffer_remove_all_memory(
        @Ptr
        long buffer);

    public void remove_all_memory() {
        this.gst_buffer_remove_all_memory(Pointer.pointerTo(this, GstBuffer.class));
    }

    @Ptr
    protected native long gst_buffer_get_meta(
        @Ptr
        long buffer, long api);

    public Pointer<GstMeta> get_meta(long api) {
        return Pointer.pointerToAddress(this.gst_buffer_get_meta(Pointer.pointerTo(this, GstBuffer.class), api), Pointer.class);
    }

    @Field(0)
    public GstMiniObject field_mini_object() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstBuffer field_mini_object(GstMiniObject field_mini_object) {
        this.io.setNativeObjectField(this, 0, field_mini_object);
        return this;
    }

    protected native long gst_buffer_get_size(
        @Ptr
        long buffer);

    public long get_size() {
        return this.gst_buffer_get_size(Pointer.pointerTo(this, GstBuffer.class));
    }

    protected native void gst_buffer_unmap(
        @Ptr
        long buffer,
        @Ptr
        long info);

    public void unmap(Pointer<GstMapInfo> info) {
        this.gst_buffer_unmap(Pointer.pointerTo(this, GstBuffer.class), Pointer.getPeer(info));
    }

    @Ptr
    protected native long gst_buffer_get_memory_range(
        @Ptr
        long buffer, long idx, int length);

    public Pointer<GstMemory> get_memory_range(long idx, int length) {
        return Pointer.pointerToAddress(this.gst_buffer_get_memory_range(Pointer.pointerTo(this, GstBuffer.class), idx, length), Pointer.class);
    }

    protected native boolean gst_buffer_map_range(
        @Ptr
        long buffer, long idx, int length,
        @Ptr
        long info, Object flags);

    public boolean map_range(long idx, int length, Pointer<GstMapInfo> info, Object flags) {
        return this.gst_buffer_map_range(Pointer.pointerTo(this, GstBuffer.class), idx, length, Pointer.getPeer(info), flags);
    }

    protected native long gst_buffer_get_sizes(
        @Ptr
        long buffer,
        @Ptr
        long offset,
        @Ptr
        long maxsize);

    public long get_sizes(Pointer<Long> offset, Pointer<Long> maxsize) {
        return this.gst_buffer_get_sizes(Pointer.pointerTo(this, GstBuffer.class), Pointer.getPeer(offset), Pointer.getPeer(maxsize));
    }

    @Field(1)
    public Object field_duration() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GstBuffer field_duration(Object field_duration) {
        this.io.setNativeObjectField(this, 1, field_duration);
        return this;
    }

    protected native boolean gst_buffer_remove_meta(
        @Ptr
        long buffer,
        @Ptr
        long meta);

    public boolean remove_meta(Pointer<GstMeta> meta) {
        return this.gst_buffer_remove_meta(Pointer.pointerTo(this, GstBuffer.class), Pointer.getPeer(meta));
    }

    protected native void gst_buffer_replace_memory(
        @Ptr
        long buffer, long idx,
        @Ptr
        long mem);

    public void replace_memory(long idx, Pointer<GstMemory> mem) {
        this.gst_buffer_replace_memory(Pointer.pointerTo(this, GstBuffer.class), idx, Pointer.getPeer(mem));
    }

    @Field(2)
    public Object field_pts() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GstBuffer field_pts(Object field_pts) {
        this.io.setNativeObjectField(this, 2, field_pts);
        return this;
    }

    protected native int gst_buffer_memcmp(
        @Ptr
        long buffer, long offset,
        @Ptr
        long mem, long size);

    public int memcmp(long offset, short mem, long size) {
        return this.gst_buffer_memcmp(Pointer.pointerTo(this, GstBuffer.class), offset, Pointer.getPeer(mem), size);
    }

    @Field(3)
    public long field_offset() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GstBuffer field_offset(long field_offset) {
        this.io.setNativeObjectField(this, 3, field_offset);
        return this;
    }

    @Ptr
    protected native long gst_buffer_get_all_memory(
        @Ptr
        long buffer);

    public Pointer<GstMemory> get_all_memory() {
        return Pointer.pointerToAddress(this.gst_buffer_get_all_memory(Pointer.pointerTo(this, GstBuffer.class)), Pointer.class);
    }

    protected native void gst_buffer_prepend_memory(
        @Ptr
        long buffer,
        @Ptr
        long mem);

    public void prepend_memory(Pointer<GstMemory> mem) {
        this.gst_buffer_prepend_memory(Pointer.pointerTo(this, GstBuffer.class), Pointer.getPeer(mem));
    }

    protected native long gst_buffer_get_sizes_range(
        @Ptr
        long buffer, long idx, int length,
        @Ptr
        long offset,
        @Ptr
        long maxsize);

    public long get_sizes_range(long idx, int length, Pointer<Long> offset, Pointer<Long> maxsize) {
        return this.gst_buffer_get_sizes_range(Pointer.pointerTo(this, GstBuffer.class), idx, length, Pointer.getPeer(offset), Pointer.getPeer(maxsize));
    }

    @Ptr
    protected native long gst_buffer_append(
        @Ptr
        long buf1,
        @Ptr
        long buf2);

    public Pointer<GstBuffer> append(Pointer<GstBuffer> buf2) {
        return Pointer.pointerToAddress(this.gst_buffer_append(Pointer.pointerTo(this, GstBuffer.class), Pointer.getPeer(buf2)), Pointer.class);
    }

    protected native void gst_buffer_replace_all_memory(
        @Ptr
        long buffer,
        @Ptr
        long mem);

    public void replace_all_memory(Pointer<GstMemory> mem) {
        this.gst_buffer_replace_all_memory(Pointer.pointerTo(this, GstBuffer.class), Pointer.getPeer(mem));
    }

    protected native long gst_buffer_fill(
        @Ptr
        long buffer, long offset,
        @Ptr
        long src, long size);

    public long fill(long offset, short src, long size) {
        return this.gst_buffer_fill(Pointer.pointerTo(this, GstBuffer.class), offset, Pointer.getPeer(src), size);
    }

    @Field(4)
    public Object field_dts() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    public GstBuffer field_dts(Object field_dts) {
        this.io.setNativeObjectField(this, 4, field_dts);
        return this;
    }

    @Ptr
    protected native long gst_buffer_peek_memory(
        @Ptr
        long buffer, long idx);

    public Pointer<GstMemory> peek_memory(long idx) {
        return Pointer.pointerToAddress(this.gst_buffer_peek_memory(Pointer.pointerTo(this, GstBuffer.class), idx), Pointer.class);
    }

    protected native void gst_buffer_set_size(
        @Ptr
        long buffer, long size);

    public void set_size(long size) {
        this.gst_buffer_set_size(Pointer.pointerTo(this, GstBuffer.class), size);
    }

    protected native void gst_buffer_resize(
        @Ptr
        long buffer, long offset, long size);

    public void resize(long offset, long size) {
        this.gst_buffer_resize(Pointer.pointerTo(this, GstBuffer.class), offset, size);
    }

    @Field(5)
    public Pointer<GstBufferPool> field_pool() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    public GstBuffer field_pool(Pointer<GstBufferPool> field_pool) {
        this.io.setPointerField(this, 5, field_pool);
        return this;
    }

    protected native long gst_buffer_extract(
        @Ptr
        long buffer, long offset, Pointer dest, long size);

    public long extract(long offset, Pointer dest, long size) {
        return this.gst_buffer_extract(Pointer.pointerTo(this, GstBuffer.class), offset, dest, size);
    }

    @Ptr
    protected native long gst_buffer_iterate_meta(
        @Ptr
        long buffer, Pointer state);

    public Pointer<GstMeta> iterate_meta(Pointer state) {
        return Pointer.pointerToAddress(this.gst_buffer_iterate_meta(Pointer.pointerTo(this, GstBuffer.class), state), Pointer.class);
    }

    protected native boolean gst_buffer_resize_range(
        @Ptr
        long buffer, long idx, int length, long offset, long size);

    public boolean resize_range(long idx, int length, long offset, long size) {
        return this.gst_buffer_resize_range(Pointer.pointerTo(this, GstBuffer.class), idx, length, offset, size);
    }

    protected native void gst_buffer_append_memory(
        @Ptr
        long buffer,
        @Ptr
        long mem);

    public void append_memory(Pointer<GstMemory> mem) {
        this.gst_buffer_append_memory(Pointer.pointerTo(this, GstBuffer.class), Pointer.getPeer(mem));
    }

    protected native void gst_buffer_insert_memory(
        @Ptr
        long buffer, int idx,
        @Ptr
        long mem);

    public void insert_memory(int idx, Pointer<GstMemory> mem) {
        this.gst_buffer_insert_memory(Pointer.pointerTo(this, GstBuffer.class), idx, Pointer.getPeer(mem));
    }

    @Field(6)
    public long field_offset_end() {
        return this.io.getNativeObjectField(this, 6);
    }

    @Field(6)
    public GstBuffer field_offset_end(long field_offset_end) {
        this.io.setNativeObjectField(this, 6, field_offset_end);
        return this;
    }

    @Ptr
    protected native long gst_buffer_copy_region(
        @Ptr
        long parent, Object flags, long offset, long size);

    public Pointer<GstBuffer> copy_region(Object flags, long offset, long size) {
        return Pointer.pointerToAddress(this.gst_buffer_copy_region(Pointer.pointerTo(this, GstBuffer.class), flags, offset, size), Pointer.class);
    }

    protected native long gst_buffer_memset(
        @Ptr
        long buffer, long offset, short val, long size);

    public long memset(long offset, short val, long size) {
        return this.gst_buffer_memset(Pointer.pointerTo(this, GstBuffer.class), offset, val, size);
    }

    protected native void gst_buffer_remove_memory_range(
        @Ptr
        long buffer, long idx, int length);

    public void remove_memory_range(long idx, int length) {
        this.gst_buffer_remove_memory_range(Pointer.pointerTo(this, GstBuffer.class), idx, length);
    }

    public native long gst_buffer_get_max_memory();

    protected native void gst_buffer_extract_dup(
        @Ptr
        long buffer, long offset, long size,
        @Ptr
        long dest,
        @Ptr
        long dest_size);

    public void extract_dup(long offset, long size, short dest, Pointer<Long> dest_size) {
        this.gst_buffer_extract_dup(Pointer.pointerTo(this, GstBuffer.class), offset, size, Pointer.getPeer(dest), Pointer.getPeer(dest_size));
    }

    @Ptr
    protected native long gst_buffer_add_meta(
        @Ptr
        long buffer,
        @Ptr
        long info, Pointer params);

    public Pointer<GstMeta> add_meta(Pointer<GstMetaInfo> info, Pointer params) {
        return Pointer.pointerToAddress(this.gst_buffer_add_meta(Pointer.pointerTo(this, GstBuffer.class), Pointer.getPeer(info), params), Pointer.class);
    }

    protected native long gst_buffer_n_memory(
        @Ptr
        long buffer);

    public long n_memory() {
        return this.gst_buffer_n_memory(Pointer.pointerTo(this, GstBuffer.class));
    }

    protected native boolean gst_buffer_find_memory(
        @Ptr
        long buffer, long offset, long size,
        @Ptr
        long idx,
        @Ptr
        long length,
        @Ptr
        long skip);

    public boolean find_memory(long offset, long size, Pointer<Long> idx, Pointer<Long> length, Pointer<Long> skip) {
        return this.gst_buffer_find_memory(Pointer.pointerTo(this, GstBuffer.class), offset, size, Pointer.getPeer(idx), Pointer.getPeer(length), Pointer.getPeer(skip));
    }

    protected native boolean gst_buffer_map(
        @Ptr
        long buffer,
        @Ptr
        long info, Object flags);

    public boolean map(Pointer<GstMapInfo> info, Object flags) {
        return this.gst_buffer_map(Pointer.pointerTo(this, GstBuffer.class), Pointer.getPeer(info), flags);
    }

    protected native boolean gst_buffer_foreach_meta(
        @Ptr
        long buffer, Object func, Pointer user_data);

    public boolean foreach_meta(Object func, Pointer user_data) {
        return this.gst_buffer_foreach_meta(Pointer.pointerTo(this, GstBuffer.class), func, user_data);
    }

    @Ptr
    protected native long gst_buffer_get_memory(
        @Ptr
        long buffer, long idx);

    public Pointer<GstMemory> get_memory(long idx) {
        return Pointer.pointerToAddress(this.gst_buffer_get_memory(Pointer.pointerTo(this, GstBuffer.class), idx), Pointer.class);
    }

    protected native boolean gst_buffer_copy_into(
        @Ptr
        long dest,
        @Ptr
        long src, Object flags, long offset, long size);

    public boolean copy_into(Pointer<GstBuffer> src, Object flags, long offset, long size) {
        return this.gst_buffer_copy_into(Pointer.pointerTo(this, GstBuffer.class), Pointer.getPeer(src), flags, offset, size);
    }

    @Ptr
    protected native long gst_buffer_append_region(
        @Ptr
        long buf1,
        @Ptr
        long buf2, long offset, long size);

    public Pointer<GstBuffer> append_region(Pointer<GstBuffer> buf2, long offset, long size) {
        return Pointer.pointerToAddress(this.gst_buffer_append_region(Pointer.pointerTo(this, GstBuffer.class), Pointer.getPeer(buf2), offset, size), Pointer.class);
    }

}
