
package generated;

import generated.gstreamer10.gst.GstAllocator;
import generated.gstreamer10.gst.GstMemory;
import org.bridj.Pointer;
import org.bridj.ann.Ptr;

public class GstAllocators {


    @Ptr
    protected native long gst_dmabuf_allocator_alloc(
        @Ptr
        long allocator, int fd, long size);

    public Pointer<GstMemory> dmabuf_allocator_alloc(Pointer<GstAllocator> allocator, int fd, long size) {
        return Pointer.pointerToAddress(this.gst_dmabuf_allocator_alloc(Pointer.getPeer(allocator), fd, size), Pointer.class);
    }

    @Ptr
    protected native long gst_dmabuf_allocator_new();

    public Pointer<GstAllocator> dmabuf_allocator_new() {
        return Pointer.pointerToAddress(this.gst_dmabuf_allocator_new(), Pointer.class);
    }

    protected native int gst_dmabuf_memory_get_fd(
        @Ptr
        long mem);

    public int dmabuf_memory_get_fd(Pointer<GstMemory> mem) {
        return this.gst_dmabuf_memory_get_fd(Pointer.getPeer(mem));
    }

    protected native boolean gst_is_dmabuf_memory(
        @Ptr
        long mem);

    public boolean is_dmabuf_memory(Pointer<GstMemory> mem) {
        return this.gst_is_dmabuf_memory(Pointer.getPeer(mem));
    }

}
