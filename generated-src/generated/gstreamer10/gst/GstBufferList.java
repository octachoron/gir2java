
package generated.gstreamer10.gst;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstBufferList
    extends StructObject
{


    public GstBufferList() {
        super();
    }

    public GstBufferList(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long gst_buffer_list_get(
        @Ptr
        long list, long idx);

    public Pointer<GstBuffer> get(long idx) {
        return Pointer.pointerToAddress(this.gst_buffer_list_get(Pointer.pointerTo(this, GstBufferList.class), idx), Pointer.class);
    }

    protected native void gst_buffer_list_insert(
        @Ptr
        long list, int idx,
        @Ptr
        long buffer);

    public void insert(int idx, Pointer<GstBuffer> buffer) {
        this.gst_buffer_list_insert(Pointer.pointerTo(this, GstBufferList.class), idx, Pointer.getPeer(buffer));
    }

    protected native long gst_buffer_list_length(
        @Ptr
        long list);

    public long length() {
        return this.gst_buffer_list_length(Pointer.pointerTo(this, GstBufferList.class));
    }

    protected native void gst_buffer_list_remove(
        @Ptr
        long list, long idx, long length);

    public void remove(long idx, long length) {
        this.gst_buffer_list_remove(Pointer.pointerTo(this, GstBufferList.class), idx, length);
    }

    protected native boolean gst_buffer_list_foreach(
        @Ptr
        long list, Object func, Pointer user_data);

    public boolean foreach(Object func, Pointer user_data) {
        return this.gst_buffer_list_foreach(Pointer.pointerTo(this, GstBufferList.class), func, user_data);
    }

}
