
package generated.gstreamerbase10.gstbase;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-base-1.0")
public class GstQueueArray
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstQueueArray() {
        super();
    }

    public GstQueueArray(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long gst_queue_array_drop_element(
        @Ptr
        long array, long idx);

    public Pointer drop_element(long idx) {
        return Pointer.pointerToAddress(this.gst_queue_array_drop_element(Pointer.pointerTo(this, GstQueueArray.class).getPeer(), idx));
    }

    protected native long gst_queue_array_find(
        @Ptr
        long array,
        @Ptr
        long func,
        @Ptr
        long data);

    public long find(Pointer func, Pointer data) {
        return this.gst_queue_array_find(Pointer.pointerTo(this, GstQueueArray.class).getPeer(), Pointer.getPeer(func), Pointer.getPeer(data));
    }

    protected native void gst_queue_array_free(
        @Ptr
        long array);

    public void free() {
        this.gst_queue_array_free(Pointer.pointerTo(this, GstQueueArray.class).getPeer());
    }

    protected native long gst_queue_array_get_length(
        @Ptr
        long array);

    public long get_length() {
        return this.gst_queue_array_get_length(Pointer.pointerTo(this, GstQueueArray.class).getPeer());
    }

    protected native boolean gst_queue_array_is_empty(
        @Ptr
        long array);

    public boolean is_empty() {
        return this.gst_queue_array_is_empty(Pointer.pointerTo(this, GstQueueArray.class).getPeer());
    }

    @Ptr
    protected native long gst_queue_array_peek_head(
        @Ptr
        long array);

    public Pointer peek_head() {
        return Pointer.pointerToAddress(this.gst_queue_array_peek_head(Pointer.pointerTo(this, GstQueueArray.class).getPeer()));
    }

    @Ptr
    protected native long gst_queue_array_pop_head(
        @Ptr
        long array);

    public Pointer pop_head() {
        return Pointer.pointerToAddress(this.gst_queue_array_pop_head(Pointer.pointerTo(this, GstQueueArray.class).getPeer()));
    }

    protected native void gst_queue_array_push_tail(
        @Ptr
        long array,
        @Ptr
        long data);

    public void push_tail(Pointer data) {
        this.gst_queue_array_push_tail(Pointer.pointerTo(this, GstQueueArray.class).getPeer(), Pointer.getPeer(data));
    }

    @Ptr
    protected static native long gst_queue_array_new(long initial_size);

    public static Pointer _new(long initial_size) {
        return Pointer.pointerToAddress(GstQueueArray.gst_queue_array_new(initial_size));
    }

}
