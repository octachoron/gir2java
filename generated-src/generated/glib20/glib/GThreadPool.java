
package generated.glib20.glib;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GThreadPool
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GThreadPool() {
        super();
    }

    public GThreadPool(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer field_func() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GThreadPool field_func(Pointer field_func) {
        this.io.setPointerField(this, 0, field_func);
        return this;
    }

    @Field(1)
    public Pointer field_user_data() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GThreadPool field_user_data(Pointer field_user_data) {
        this.io.setPointerField(this, 1, field_user_data);
        return this;
    }

    @Field(2)
    public boolean field_exclusive() {
        return this.io.getBooleanField(this, 2);
    }

    @Field(2)
    public GThreadPool field_exclusive(boolean field_exclusive) {
        this.io.setBooleanField(this, 2, field_exclusive);
        return this;
    }

    protected native void g_thread_pool_free(
        @Ptr
        long pool, boolean immediate, boolean wait_);

    public void free(boolean immediate, boolean wait_) {
        this.g_thread_pool_free(Pointer.pointerTo(this, GThreadPool.class).getPeer(), immediate, wait_);
    }

    protected native int g_thread_pool_get_max_threads(
        @Ptr
        long pool);

    public int get_max_threads() {
        return this.g_thread_pool_get_max_threads(Pointer.pointerTo(this, GThreadPool.class).getPeer());
    }

    protected native long g_thread_pool_get_num_threads(
        @Ptr
        long pool);

    public long get_num_threads() {
        return this.g_thread_pool_get_num_threads(Pointer.pointerTo(this, GThreadPool.class).getPeer());
    }

    protected native boolean g_thread_pool_push(
        @Ptr
        long pool,
        @Ptr
        long data);

    public boolean push(Pointer data) {
        return this.g_thread_pool_push(Pointer.pointerTo(this, GThreadPool.class).getPeer(), Pointer.getPeer(data));
    }

    protected native boolean g_thread_pool_set_max_threads(
        @Ptr
        long pool, int max_threads);

    public boolean set_max_threads(int max_threads) {
        return this.g_thread_pool_set_max_threads(Pointer.pointerTo(this, GThreadPool.class).getPeer(), max_threads);
    }

    protected native void g_thread_pool_set_sort_function(
        @Ptr
        long pool,
        @Ptr
        long func,
        @Ptr
        long user_data);

    public void set_sort_function(Pointer func, Pointer user_data) {
        this.g_thread_pool_set_sort_function(Pointer.pointerTo(this, GThreadPool.class).getPeer(), Pointer.getPeer(func), Pointer.getPeer(user_data));
    }

    protected native long g_thread_pool_unprocessed(
        @Ptr
        long pool);

    public long unprocessed() {
        return this.g_thread_pool_unprocessed(Pointer.pointerTo(this, GThreadPool.class).getPeer());
    }

    public static native long g_thread_pool_get_max_idle_time();

    public static native int g_thread_pool_get_max_unused_threads();

    public static native long g_thread_pool_get_num_unused_threads();

    @Ptr
    protected static native long g_thread_pool_new(
        @Ptr
        long func,
        @Ptr
        long user_data, int max_threads, boolean exclusive);

    public static Pointer _new(Pointer func, Pointer user_data, int max_threads, boolean exclusive) {
        return Pointer.pointerToAddress(GThreadPool.g_thread_pool_new(Pointer.getPeer(func), Pointer.getPeer(user_data), max_threads, exclusive));
    }

    public static native void g_thread_pool_set_max_idle_time(long interval);

    public static native void g_thread_pool_set_max_unused_threads(int max_threads);

    public static native void g_thread_pool_stop_unused_threads();

}
