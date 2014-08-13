
package generated.gstreamer10.gst;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstAtomicQueue
    extends StructObject
{


    public GstAtomicQueue() {
        super();
    }

    public GstAtomicQueue(Pointer pointer) {
        super(pointer);
    }

    protected native long gst_atomic_queue_length(
        @Ptr
        long queue);

    public long length() {
        return this.gst_atomic_queue_length(Pointer.pointerTo(this, GstAtomicQueue.class));
    }

    protected native Pointer gst_atomic_queue_peek(
        @Ptr
        long queue);

    public Pointer peek() {
        return this.gst_atomic_queue_peek(Pointer.pointerTo(this, GstAtomicQueue.class));
    }

    protected native Pointer gst_atomic_queue_pop(
        @Ptr
        long queue);

    public Pointer pop() {
        return this.gst_atomic_queue_pop(Pointer.pointerTo(this, GstAtomicQueue.class));
    }

    protected native void gst_atomic_queue_push(
        @Ptr
        long queue, Pointer data);

    public void push(Pointer data) {
        this.gst_atomic_queue_push(Pointer.pointerTo(this, GstAtomicQueue.class), data);
    }

    protected native void gst_atomic_queue_ref(
        @Ptr
        long queue);

    public void ref() {
        this.gst_atomic_queue_ref(Pointer.pointerTo(this, GstAtomicQueue.class));
    }

    protected native void gst_atomic_queue_unref(
        @Ptr
        long queue);

    public void unref() {
        this.gst_atomic_queue_unref(Pointer.pointerTo(this, GstAtomicQueue.class));
    }

}
