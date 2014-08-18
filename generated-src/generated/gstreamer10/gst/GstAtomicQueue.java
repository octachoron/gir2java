
package generated.gstreamer10.gst;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstAtomicQueue
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstAtomicQueue() {
        super();
    }

    public GstAtomicQueue(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long gst_atomic_queue_new(long initial_size);

    public static Pointer _new(long initial_size) {
        return Pointer.pointerToAddress(GstAtomicQueue.gst_atomic_queue_new(initial_size));
    }

    protected native long gst_atomic_queue_length(
        @Ptr
        long queue);

    public long length() {
        return this.gst_atomic_queue_length(Pointer.pointerTo(this, GstAtomicQueue.class).getPeer());
    }

    @Ptr
    protected native long gst_atomic_queue_peek(
        @Ptr
        long queue);

    public Pointer peek() {
        return Pointer.pointerToAddress(this.gst_atomic_queue_peek(Pointer.pointerTo(this, GstAtomicQueue.class).getPeer()));
    }

    @Ptr
    protected native long gst_atomic_queue_pop(
        @Ptr
        long queue);

    public Pointer pop() {
        return Pointer.pointerToAddress(this.gst_atomic_queue_pop(Pointer.pointerTo(this, GstAtomicQueue.class).getPeer()));
    }

    protected native void gst_atomic_queue_push(
        @Ptr
        long queue,
        @Ptr
        long data);

    public void push(Pointer data) {
        this.gst_atomic_queue_push(Pointer.pointerTo(this, GstAtomicQueue.class).getPeer(), Pointer.getPeer(data));
    }

    protected native void gst_atomic_queue_ref(
        @Ptr
        long queue);

    public void ref() {
        this.gst_atomic_queue_ref(Pointer.pointerTo(this, GstAtomicQueue.class).getPeer());
    }

    protected native void gst_atomic_queue_unref(
        @Ptr
        long queue);

    public void unref() {
        this.gst_atomic_queue_unref(Pointer.pointerTo(this, GstAtomicQueue.class).getPeer());
    }

}
