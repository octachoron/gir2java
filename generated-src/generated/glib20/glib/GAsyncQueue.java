
package generated.glib20.glib;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GAsyncQueue
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GAsyncQueue() {
        super();
    }

    public GAsyncQueue(Pointer pointer) {
        super(pointer);
    }

    protected native int g_async_queue_length(
        @Ptr
        long queue);

    public int length() {
        return this.g_async_queue_length(Pointer.pointerTo(this, GAsyncQueue.class).getPeer());
    }

    protected native int g_async_queue_length_unlocked(
        @Ptr
        long queue);

    public int length_unlocked() {
        return this.g_async_queue_length_unlocked(Pointer.pointerTo(this, GAsyncQueue.class).getPeer());
    }

    protected native void g_async_queue_lock(
        @Ptr
        long queue);

    public void lock() {
        this.g_async_queue_lock(Pointer.pointerTo(this, GAsyncQueue.class).getPeer());
    }

    @Ptr
    protected native long g_async_queue_pop(
        @Ptr
        long queue);

    public Pointer pop() {
        return Pointer.pointerToAddress(this.g_async_queue_pop(Pointer.pointerTo(this, GAsyncQueue.class).getPeer()));
    }

    @Ptr
    protected native long g_async_queue_pop_unlocked(
        @Ptr
        long queue);

    public Pointer pop_unlocked() {
        return Pointer.pointerToAddress(this.g_async_queue_pop_unlocked(Pointer.pointerTo(this, GAsyncQueue.class).getPeer()));
    }

    protected native void g_async_queue_push(
        @Ptr
        long queue,
        @Ptr
        long data);

    public void push(Pointer data) {
        this.g_async_queue_push(Pointer.pointerTo(this, GAsyncQueue.class).getPeer(), Pointer.getPeer(data));
    }

    protected native void g_async_queue_push_unlocked(
        @Ptr
        long queue,
        @Ptr
        long data);

    public void push_unlocked(Pointer data) {
        this.g_async_queue_push_unlocked(Pointer.pointerTo(this, GAsyncQueue.class).getPeer(), Pointer.getPeer(data));
    }

    @Ptr
    protected native long g_async_queue_ref(
        @Ptr
        long queue);

    public Pointer ref() {
        return Pointer.pointerToAddress(this.g_async_queue_ref(Pointer.pointerTo(this, GAsyncQueue.class).getPeer()));
    }

    protected native void g_async_queue_ref_unlocked(
        @Ptr
        long queue);

    public void ref_unlocked() {
        this.g_async_queue_ref_unlocked(Pointer.pointerTo(this, GAsyncQueue.class).getPeer());
    }

    @Ptr
    protected native long g_async_queue_timed_pop(
        @Ptr
        long queue,
        @Ptr
        long end_time);

    public Pointer timed_pop(Pointer end_time) {
        return Pointer.pointerToAddress(this.g_async_queue_timed_pop(Pointer.pointerTo(this, GAsyncQueue.class).getPeer(), Pointer.getPeer(end_time)));
    }

    @Ptr
    protected native long g_async_queue_timed_pop_unlocked(
        @Ptr
        long queue,
        @Ptr
        long end_time);

    public Pointer timed_pop_unlocked(Pointer end_time) {
        return Pointer.pointerToAddress(this.g_async_queue_timed_pop_unlocked(Pointer.pointerTo(this, GAsyncQueue.class).getPeer(), Pointer.getPeer(end_time)));
    }

    @Ptr
    protected native long g_async_queue_timeout_pop(
        @Ptr
        long queue, long timeout);

    public Pointer timeout_pop(long timeout) {
        return Pointer.pointerToAddress(this.g_async_queue_timeout_pop(Pointer.pointerTo(this, GAsyncQueue.class).getPeer(), timeout));
    }

    @Ptr
    protected native long g_async_queue_timeout_pop_unlocked(
        @Ptr
        long queue, long timeout);

    public Pointer timeout_pop_unlocked(long timeout) {
        return Pointer.pointerToAddress(this.g_async_queue_timeout_pop_unlocked(Pointer.pointerTo(this, GAsyncQueue.class).getPeer(), timeout));
    }

    @Ptr
    protected native long g_async_queue_try_pop(
        @Ptr
        long queue);

    public Pointer try_pop() {
        return Pointer.pointerToAddress(this.g_async_queue_try_pop(Pointer.pointerTo(this, GAsyncQueue.class).getPeer()));
    }

    @Ptr
    protected native long g_async_queue_try_pop_unlocked(
        @Ptr
        long queue);

    public Pointer try_pop_unlocked() {
        return Pointer.pointerToAddress(this.g_async_queue_try_pop_unlocked(Pointer.pointerTo(this, GAsyncQueue.class).getPeer()));
    }

    protected native void g_async_queue_unlock(
        @Ptr
        long queue);

    public void unlock() {
        this.g_async_queue_unlock(Pointer.pointerTo(this, GAsyncQueue.class).getPeer());
    }

    protected native void g_async_queue_unref(
        @Ptr
        long queue);

    public void unref() {
        this.g_async_queue_unref(Pointer.pointerTo(this, GAsyncQueue.class).getPeer());
    }

    protected native void g_async_queue_unref_and_unlock(
        @Ptr
        long queue);

    public void unref_and_unlock() {
        this.g_async_queue_unref_and_unlock(Pointer.pointerTo(this, GAsyncQueue.class).getPeer());
    }

    @Ptr
    protected static native long g_async_queue_new();

    public static Pointer _new() {
        return Pointer.pointerToAddress(GAsyncQueue.g_async_queue_new());
    }

    @Ptr
    protected static native long g_async_queue_new_full(
        @Ptr
        long item_free_func);

    public static Pointer<GAsyncQueue> new_full(Pointer item_free_func) {
        return Pointer.pointerToAddress(GAsyncQueue.g_async_queue_new_full(Pointer.getPeer(item_free_func)), GAsyncQueue.class);
    }

    protected native void g_async_queue_push_sorted(
        @Ptr
        long queue,
        @Ptr
        long data,
        @Ptr
        long func,
        @Ptr
        long user_data);

    public void push_sorted(Pointer data, Pointer func, Pointer user_data) {
        this.g_async_queue_push_sorted(Pointer.pointerTo(this, GAsyncQueue.class).getPeer(), Pointer.getPeer(data), Pointer.getPeer(func), Pointer.getPeer(user_data));
    }

    protected native void g_async_queue_push_sorted_unlocked(
        @Ptr
        long queue,
        @Ptr
        long data,
        @Ptr
        long func,
        @Ptr
        long user_data);

    public void push_sorted_unlocked(Pointer data, Pointer func, Pointer user_data) {
        this.g_async_queue_push_sorted_unlocked(Pointer.pointerTo(this, GAsyncQueue.class).getPeer(), Pointer.getPeer(data), Pointer.getPeer(func), Pointer.getPeer(user_data));
    }

    protected native void g_async_queue_sort_unlocked(
        @Ptr
        long queue,
        @Ptr
        long func,
        @Ptr
        long user_data);

    public void sort_unlocked(Pointer func, Pointer user_data) {
        this.g_async_queue_sort_unlocked(Pointer.pointerTo(this, GAsyncQueue.class).getPeer(), Pointer.getPeer(func), Pointer.getPeer(user_data));
    }

    protected native void g_async_queue_sort(
        @Ptr
        long queue,
        @Ptr
        long func,
        @Ptr
        long user_data);

    public void sort(Pointer func, Pointer user_data) {
        this.g_async_queue_sort(Pointer.pointerTo(this, GAsyncQueue.class).getPeer(), Pointer.getPeer(func), Pointer.getPeer(user_data));
    }

}
