
package generated.gio20.gio;

import generated.glib20.glib.GError;
import generated.gobject20.gobject.GObject;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GSimpleAsyncResult
    extends GObject
{


    public GSimpleAsyncResult() {
        super();
    }

    public GSimpleAsyncResult(Pointer pointer) {
        super(pointer);
    }

    protected native boolean g_simple_async_result_is_valid(
        @Ptr
        long result,
        @Ptr
        long source, Pointer source_tag);

    public boolean is_valid(Pointer<Object> result, Pointer<GObject> source, Pointer source_tag) {
        return this.g_simple_async_result_is_valid(Pointer.getPeer(result), Pointer.getPeer(source), source_tag);
    }

    protected native void g_simple_async_result_complete(
        @Ptr
        long simple);

    public void complete() {
        this.g_simple_async_result_complete(Pointer.pointerTo(this, GSimpleAsyncResult.class));
    }

    protected native void g_simple_async_result_complete_in_idle(
        @Ptr
        long simple);

    public void complete_in_idle() {
        this.g_simple_async_result_complete_in_idle(Pointer.pointerTo(this, GSimpleAsyncResult.class));
    }

    protected native boolean g_simple_async_result_get_op_res_gboolean(
        @Ptr
        long simple);

    public boolean get_op_res_gboolean() {
        return this.g_simple_async_result_get_op_res_gboolean(Pointer.pointerTo(this, GSimpleAsyncResult.class));
    }

    protected native Pointer g_simple_async_result_get_op_res_gpointer(
        @Ptr
        long simple);

    public Pointer get_op_res_gpointer() {
        return this.g_simple_async_result_get_op_res_gpointer(Pointer.pointerTo(this, GSimpleAsyncResult.class));
    }

    protected native long g_simple_async_result_get_op_res_gssize(
        @Ptr
        long simple);

    public long get_op_res_gssize() {
        return this.g_simple_async_result_get_op_res_gssize(Pointer.pointerTo(this, GSimpleAsyncResult.class));
    }

    protected native Pointer g_simple_async_result_get_source_tag(
        @Ptr
        long simple);

    public Pointer get_source_tag() {
        return this.g_simple_async_result_get_source_tag(Pointer.pointerTo(this, GSimpleAsyncResult.class));
    }

    protected native boolean g_simple_async_result_propagate_error(
        @Ptr
        long simple);

    public boolean propagate_error() {
        return this.g_simple_async_result_propagate_error(Pointer.pointerTo(this, GSimpleAsyncResult.class));
    }

    protected native void g_simple_async_result_set_check_cancellable(
        @Ptr
        long simple,
        @Ptr
        long check_cancellable);

    public void set_check_cancellable(Pointer<GCancellable> check_cancellable) {
        this.g_simple_async_result_set_check_cancellable(Pointer.pointerTo(this, GSimpleAsyncResult.class), Pointer.getPeer(check_cancellable));
    }

    protected native void g_simple_async_result_set_error(
        @Ptr
        long simple, Object domain, int code,
        @Ptr
        long format, Object... varargs);

    public void set_error(Object domain, int code, Pointer format, Object... varargs) {
        this.g_simple_async_result_set_error(Pointer.pointerTo(this, GSimpleAsyncResult.class), domain, code, Pointer.getPeer(format), varargs);
    }

    protected native void g_simple_async_result_set_from_error(
        @Ptr
        long simple,
        @Ptr
        long error);

    public void set_from_error(Pointer<GError> error) {
        this.g_simple_async_result_set_from_error(Pointer.pointerTo(this, GSimpleAsyncResult.class), Pointer.getPeer(error));
    }

    protected native void g_simple_async_result_set_handle_cancellation(
        @Ptr
        long simple, boolean handle_cancellation);

    public void set_handle_cancellation(boolean handle_cancellation) {
        this.g_simple_async_result_set_handle_cancellation(Pointer.pointerTo(this, GSimpleAsyncResult.class), handle_cancellation);
    }

    protected native void g_simple_async_result_set_op_res_gboolean(
        @Ptr
        long simple, boolean op_res);

    public void set_op_res_gboolean(boolean op_res) {
        this.g_simple_async_result_set_op_res_gboolean(Pointer.pointerTo(this, GSimpleAsyncResult.class), op_res);
    }

    protected native void g_simple_async_result_set_op_res_gpointer(
        @Ptr
        long simple, Pointer op_res, Object destroy_op_res);

    public void set_op_res_gpointer(Pointer op_res, Object destroy_op_res) {
        this.g_simple_async_result_set_op_res_gpointer(Pointer.pointerTo(this, GSimpleAsyncResult.class), op_res, destroy_op_res);
    }

    protected native void g_simple_async_result_set_op_res_gssize(
        @Ptr
        long simple, long op_res);

    public void set_op_res_gssize(long op_res) {
        this.g_simple_async_result_set_op_res_gssize(Pointer.pointerTo(this, GSimpleAsyncResult.class), op_res);
    }

    protected native void g_simple_async_result_take_error(
        @Ptr
        long simple,
        @Ptr
        long error);

    public void take_error(Pointer<GError> error) {
        this.g_simple_async_result_take_error(Pointer.pointerTo(this, GSimpleAsyncResult.class), Pointer.getPeer(error));
    }

    protected native void g_simple_async_result_run_in_thread(
        @Ptr
        long simple, Object func, int io_priority,
        @Ptr
        long cancellable);

    public void run_in_thread(Object func, int io_priority, Pointer<GCancellable> cancellable) {
        this.g_simple_async_result_run_in_thread(Pointer.pointerTo(this, GSimpleAsyncResult.class), func, io_priority, Pointer.getPeer(cancellable));
    }

}
