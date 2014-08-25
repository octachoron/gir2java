
package generated.gio20.gio;

import generated.glib20.glib.GPollFD;
import generated.glib20.glib.GSource;
import generated.gobject20.gobject.GObject;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GCancellable
    extends GObject
{


    static {
        BridJ.register();
    }

    public GCancellable() {
        super();
    }

    public GCancellable(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_cancellable_new();

    public static Pointer gcancellable__new() {
        return Pointer.pointerToAddress(GCancellable.g_cancellable_new());
    }

    @Ptr
    protected static native long g_cancellable_get_current();

    public static Pointer get_current() {
        return Pointer.pointerToAddress(GCancellable.g_cancellable_get_current());
    }

    protected native void g_cancellable_cancel(
        @Ptr
        long cancellable);

    public void cancel() {
        this.g_cancellable_cancel(Pointer.pointerTo(this, GCancellable.class).getPeer());
    }

    protected native long g_cancellable_connect(
        @Ptr
        long cancellable,
        @Ptr
        long callback,
        @Ptr
        long data,
        @Ptr
        long data_destroy_func);

    public long gcancellable_connect(Pointer callback, Pointer data, Pointer data_destroy_func) {
        return this.g_cancellable_connect(Pointer.pointerTo(this, GCancellable.class).getPeer(), Pointer.getPeer(callback), Pointer.getPeer(data), Pointer.getPeer(data_destroy_func));
    }

    protected native void g_cancellable_disconnect(
        @Ptr
        long cancellable, long handler_id);

    public void gcancellable_disconnect(long handler_id) {
        this.g_cancellable_disconnect(Pointer.pointerTo(this, GCancellable.class).getPeer(), handler_id);
    }

    protected native int g_cancellable_get_fd(
        @Ptr
        long cancellable);

    public int get_fd() {
        return this.g_cancellable_get_fd(Pointer.pointerTo(this, GCancellable.class).getPeer());
    }

    protected native boolean g_cancellable_is_cancelled(
        @Ptr
        long cancellable);

    public boolean is_cancelled() {
        return this.g_cancellable_is_cancelled(Pointer.pointerTo(this, GCancellable.class).getPeer());
    }

    protected native boolean g_cancellable_make_pollfd(
        @Ptr
        long cancellable,
        @Ptr
        long pollfd);

    public boolean make_pollfd(Pointer<GPollFD> pollfd) {
        return this.g_cancellable_make_pollfd(Pointer.pointerTo(this, GCancellable.class).getPeer(), Pointer.getPeer(pollfd));
    }

    protected native void g_cancellable_pop_current(
        @Ptr
        long cancellable);

    public void pop_current() {
        this.g_cancellable_pop_current(Pointer.pointerTo(this, GCancellable.class).getPeer());
    }

    protected native void g_cancellable_push_current(
        @Ptr
        long cancellable);

    public void push_current() {
        this.g_cancellable_push_current(Pointer.pointerTo(this, GCancellable.class).getPeer());
    }

    protected native void g_cancellable_release_fd(
        @Ptr
        long cancellable);

    public void release_fd() {
        this.g_cancellable_release_fd(Pointer.pointerTo(this, GCancellable.class).getPeer());
    }

    protected native void g_cancellable_reset(
        @Ptr
        long cancellable);

    public void reset() {
        this.g_cancellable_reset(Pointer.pointerTo(this, GCancellable.class).getPeer());
    }

    protected native boolean g_cancellable_set_error_if_cancelled(
        @Ptr
        long cancellable);

    public boolean set_error_if_cancelled() {
        return this.g_cancellable_set_error_if_cancelled(Pointer.pointerTo(this, GCancellable.class).getPeer());
    }

    @Ptr
    protected native long g_cancellable_source_new(
        @Ptr
        long cancellable);

    public Pointer<GSource> source_new() {
        return Pointer.pointerToAddress(this.g_cancellable_source_new(Pointer.pointerTo(this, GCancellable.class).getPeer()), GSource.class);
    }

    @Field(0)
    public GObject gcancellable_field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GCancellable gcancellable_field_parent_instance(GObject gcancellable_field_parent_instance) {
        this.io.setNativeObjectField(this, 0, gcancellable_field_parent_instance);
        return this;
    }

    @Field(1)
    private Pointer gcancellable_field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GCancellable gcancellable_field_priv(Pointer gcancellable_field_priv) {
        this.io.setPointerField(this, 1, gcancellable_field_priv);
        return this;
    }

}
