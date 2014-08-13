
package generated.gstreamerbase10.gstbase;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-base-1.0")
public class GstQueueArray
    extends StructObject
{


    public GstQueueArray() {
        super();
    }

    public GstQueueArray(Pointer pointer) {
        super(pointer);
    }

    protected native Pointer gst_queue_array_drop_element(
        @Ptr
        long array, long idx);

    public Pointer drop_element(long idx) {
        return this.gst_queue_array_drop_element(Pointer.pointerTo(this, GstQueueArray.class), idx);
    }

    protected native long gst_queue_array_find(
        @Ptr
        long array, Object func, Pointer data);

    public long find(Object func, Pointer data) {
        return this.gst_queue_array_find(Pointer.pointerTo(this, GstQueueArray.class), func, data);
    }

    protected native void gst_queue_array_free(
        @Ptr
        long array);

    public void free() {
        this.gst_queue_array_free(Pointer.pointerTo(this, GstQueueArray.class));
    }

    protected native long gst_queue_array_get_length(
        @Ptr
        long array);

    public long get_length() {
        return this.gst_queue_array_get_length(Pointer.pointerTo(this, GstQueueArray.class));
    }

    protected native boolean gst_queue_array_is_empty(
        @Ptr
        long array);

    public boolean is_empty() {
        return this.gst_queue_array_is_empty(Pointer.pointerTo(this, GstQueueArray.class));
    }

    protected native Pointer gst_queue_array_peek_head(
        @Ptr
        long array);

    public Pointer peek_head() {
        return this.gst_queue_array_peek_head(Pointer.pointerTo(this, GstQueueArray.class));
    }

    protected native Pointer gst_queue_array_pop_head(
        @Ptr
        long array);

    public Pointer pop_head() {
        return this.gst_queue_array_pop_head(Pointer.pointerTo(this, GstQueueArray.class));
    }

    protected native void gst_queue_array_push_tail(
        @Ptr
        long array, Pointer data);

    public void push_tail(Pointer data) {
        this.gst_queue_array_push_tail(Pointer.pointerTo(this, GstQueueArray.class), data);
    }

    @Ptr
    protected native long gst_queue_array_new(long initial_size);

    public Pointer _new(long initial_size) {
        return Pointer.pointerToAddress(this.gst_queue_array_new(initial_size));
    }

}
