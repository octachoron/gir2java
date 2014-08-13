
package generated.gio20.gio;

import generated.glib20.glib.GPollFD;
import generated.glib20.glib.GSource;
import generated.gobject20.gobject.GObject;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GCancellable
    extends GObject
{


    public GCancellable() {
        super();
    }

    public GCancellable(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long g_cancellable_get_current();

    public Pointer get_current() {
        return Pointer.pointerToAddress(this.g_cancellable_get_current());
    }

    protected native void g_cancellable_cancel(
        @Ptr
        long cancellable);

    public void cancel() {
        this.g_cancellable_cancel(Pointer.pointerTo(this, GCancellable.class));
    }

    protected native long g_cancellable_connect(
        @Ptr
        long cancellable, Object callback, Pointer data, Object data_destroy_func);

    public long connect(Object callback, Pointer data, Object data_destroy_func) {
        return this.g_cancellable_connect(Pointer.pointerTo(this, GCancellable.class), callback, data, data_destroy_func);
    }

    protected native void g_cancellable_disconnect(
        @Ptr
        long cancellable, long handler_id);

    public void disconnect(long handler_id) {
        this.g_cancellable_disconnect(Pointer.pointerTo(this, GCancellable.class), handler_id);
    }

    protected native int g_cancellable_get_fd(
        @Ptr
        long cancellable);

    public int get_fd() {
        return this.g_cancellable_get_fd(Pointer.pointerTo(this, GCancellable.class));
    }

    protected native boolean g_cancellable_is_cancelled(
        @Ptr
        long cancellable);

    public boolean is_cancelled() {
        return this.g_cancellable_is_cancelled(Pointer.pointerTo(this, GCancellable.class));
    }

    protected native boolean g_cancellable_make_pollfd(
        @Ptr
        long cancellable,
        @Ptr
        long pollfd);

    public boolean make_pollfd(Pointer<GPollFD> pollfd) {
        return this.g_cancellable_make_pollfd(Pointer.pointerTo(this, GCancellable.class), Pointer.getPeer(pollfd));
    }

    protected native void g_cancellable_pop_current(
        @Ptr
        long cancellable);

    public void pop_current() {
        this.g_cancellable_pop_current(Pointer.pointerTo(this, GCancellable.class));
    }

    protected native void g_cancellable_push_current(
        @Ptr
        long cancellable);

    public void push_current() {
        this.g_cancellable_push_current(Pointer.pointerTo(this, GCancellable.class));
    }

    protected native void g_cancellable_release_fd(
        @Ptr
        long cancellable);

    public void release_fd() {
        this.g_cancellable_release_fd(Pointer.pointerTo(this, GCancellable.class));
    }

    protected native void g_cancellable_reset(
        @Ptr
        long cancellable);

    public void reset() {
        this.g_cancellable_reset(Pointer.pointerTo(this, GCancellable.class));
    }

    protected native boolean g_cancellable_set_error_if_cancelled(
        @Ptr
        long cancellable);

    public boolean set_error_if_cancelled() {
        return this.g_cancellable_set_error_if_cancelled(Pointer.pointerTo(this, GCancellable.class));
    }

    @Ptr
    protected native long g_cancellable_source_new(
        @Ptr
        long cancellable);

    public Pointer<GSource> source_new() {
        return Pointer.pointerToAddress(this.g_cancellable_source_new(Pointer.pointerTo(this, GCancellable.class)), Pointer.class);
    }

    @Field(0)
    public GObject field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GCancellable field_parent_instance(GObject field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GCancellable field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

}
