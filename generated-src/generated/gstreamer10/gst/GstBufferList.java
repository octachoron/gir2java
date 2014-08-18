
package generated.gstreamer10.gst;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstBufferList
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstBufferList() {
        super();
    }

    public GstBufferList(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long gst_buffer_list_new();

    public static Pointer _new() {
        return Pointer.pointerToAddress(GstBufferList.gst_buffer_list_new());
    }

    @Ptr
    protected static native long gst_buffer_list_new_sized(long size);

    public static Pointer new_sized(long size) {
        return Pointer.pointerToAddress(GstBufferList.gst_buffer_list_new_sized(size));
    }

    @Ptr
    protected native long gst_buffer_list_get(
        @Ptr
        long list, long idx);

    public Pointer<GstBuffer> get(long idx) {
        return Pointer.pointerToAddress(this.gst_buffer_list_get(Pointer.pointerTo(this, GstBufferList.class).getPeer(), idx), GstBuffer.class);
    }

    protected native void gst_buffer_list_insert(
        @Ptr
        long list, int idx,
        @Ptr
        long buffer);

    public void insert(int idx, Pointer<GstBuffer> buffer) {
        this.gst_buffer_list_insert(Pointer.pointerTo(this, GstBufferList.class).getPeer(), idx, Pointer.getPeer(buffer));
    }

    protected native long gst_buffer_list_length(
        @Ptr
        long list);

    public long length() {
        return this.gst_buffer_list_length(Pointer.pointerTo(this, GstBufferList.class).getPeer());
    }

    protected native void gst_buffer_list_remove(
        @Ptr
        long list, long idx, long length);

    public void remove(long idx, long length) {
        this.gst_buffer_list_remove(Pointer.pointerTo(this, GstBufferList.class).getPeer(), idx, length);
    }

    protected native boolean gst_buffer_list_foreach(
        @Ptr
        long list,
        @Ptr
        long func,
        @Ptr
        long user_data);

    public boolean foreach(Pointer func, Pointer user_data) {
        return this.gst_buffer_list_foreach(Pointer.pointerTo(this, GstBufferList.class).getPeer(), Pointer.getPeer(func), Pointer.getPeer(user_data));
    }

}
