
package generated.gio20.gio;

import generated.glib20.glib.GError;
import generated.gobject20.gobject.GObject;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GSimpleAsyncResult
    extends GObject
{


    static {
        BridJ.register();
    }

    public GSimpleAsyncResult() {
        super();
    }

    public GSimpleAsyncResult(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_simple_async_result_new(
        @Ptr
        long source_object,
        @Ptr
        long callback,
        @Ptr
        long user_data,
        @Ptr
        long source_tag);

    public static Pointer gsimpleasyncresult__new(Pointer<GObject> source_object, Pointer callback, Pointer user_data, Pointer source_tag) {
        return Pointer.pointerToAddress(GSimpleAsyncResult.g_simple_async_result_new(Pointer.getPeer(source_object), Pointer.getPeer(callback), Pointer.getPeer(user_data), Pointer.getPeer(source_tag)));
    }

    @Ptr
    protected static native long g_simple_async_result_new_error(
        @Ptr
        long source_object,
        @Ptr
        long callback,
        @Ptr
        long user_data, long domain, int code,
        @Ptr
        long format, Object... varargs);

    public static Pointer new_error(Pointer<GObject> source_object, Pointer callback, Pointer user_data, long domain, int code, Pointer format, Object... varargs) {
        return Pointer.pointerToAddress(GSimpleAsyncResult.g_simple_async_result_new_error(Pointer.getPeer(source_object), Pointer.getPeer(callback), Pointer.getPeer(user_data), domain, code, Pointer.getPeer(format), varargs));
    }

    @Ptr
    protected static native long g_simple_async_result_new_from_error(
        @Ptr
        long source_object,
        @Ptr
        long callback,
        @Ptr
        long user_data,
        @Ptr
        long error);

    public static Pointer new_from_error(Pointer<GObject> source_object, Pointer callback, Pointer user_data, Pointer<GError> error) {
        return Pointer.pointerToAddress(GSimpleAsyncResult.g_simple_async_result_new_from_error(Pointer.getPeer(source_object), Pointer.getPeer(callback), Pointer.getPeer(user_data), Pointer.getPeer(error)));
    }

    @Ptr
    protected static native long g_simple_async_result_new_take_error(
        @Ptr
        long source_object,
        @Ptr
        long callback,
        @Ptr
        long user_data,
        @Ptr
        long error);

    public static Pointer new_take_error(Pointer<GObject> source_object, Pointer callback, Pointer user_data, Pointer<GError> error) {
        return Pointer.pointerToAddress(GSimpleAsyncResult.g_simple_async_result_new_take_error(Pointer.getPeer(source_object), Pointer.getPeer(callback), Pointer.getPeer(user_data), Pointer.getPeer(error)));
    }

    protected static native boolean g_simple_async_result_is_valid(
        @Ptr
        long result,
        @Ptr
        long source,
        @Ptr
        long source_tag);

    public static boolean is_valid(Pointer<Object> result, Pointer<GObject> source, Pointer source_tag) {
        return GSimpleAsyncResult.g_simple_async_result_is_valid(Pointer.getPeer(result), Pointer.getPeer(source), Pointer.getPeer(source_tag));
    }

    protected native void g_simple_async_result_complete(
        @Ptr
        long simple);

    public void complete() {
        this.g_simple_async_result_complete(Pointer.pointerTo(this, GSimpleAsyncResult.class).getPeer());
    }

    protected native void g_simple_async_result_complete_in_idle(
        @Ptr
        long simple);

    public void complete_in_idle() {
        this.g_simple_async_result_complete_in_idle(Pointer.pointerTo(this, GSimpleAsyncResult.class).getPeer());
    }

    protected native boolean g_simple_async_result_get_op_res_gboolean(
        @Ptr
        long simple);

    public boolean get_op_res_gboolean() {
        return this.g_simple_async_result_get_op_res_gboolean(Pointer.pointerTo(this, GSimpleAsyncResult.class).getPeer());
    }

    @Ptr
    protected native long g_simple_async_result_get_op_res_gpointer(
        @Ptr
        long simple);

    public Pointer get_op_res_gpointer() {
        return Pointer.pointerToAddress(this.g_simple_async_result_get_op_res_gpointer(Pointer.pointerTo(this, GSimpleAsyncResult.class).getPeer()));
    }

    protected native long g_simple_async_result_get_op_res_gssize(
        @Ptr
        long simple);

    public long get_op_res_gssize() {
        return this.g_simple_async_result_get_op_res_gssize(Pointer.pointerTo(this, GSimpleAsyncResult.class).getPeer());
    }

    @Ptr
    protected native long g_simple_async_result_get_source_tag(
        @Ptr
        long simple);

    public Pointer get_source_tag() {
        return Pointer.pointerToAddress(this.g_simple_async_result_get_source_tag(Pointer.pointerTo(this, GSimpleAsyncResult.class).getPeer()));
    }

    protected native boolean g_simple_async_result_propagate_error(
        @Ptr
        long simple);

    public boolean propagate_error() {
        return this.g_simple_async_result_propagate_error(Pointer.pointerTo(this, GSimpleAsyncResult.class).getPeer());
    }

    protected native void g_simple_async_result_set_check_cancellable(
        @Ptr
        long simple,
        @Ptr
        long check_cancellable);

    public void set_check_cancellable(Pointer<GCancellable> check_cancellable) {
        this.g_simple_async_result_set_check_cancellable(Pointer.pointerTo(this, GSimpleAsyncResult.class).getPeer(), Pointer.getPeer(check_cancellable));
    }

    protected native void g_simple_async_result_set_error(
        @Ptr
        long simple, long domain, int code,
        @Ptr
        long format, Object... varargs);

    public void set_error(long domain, int code, Pointer format, Object... varargs) {
        this.g_simple_async_result_set_error(Pointer.pointerTo(this, GSimpleAsyncResult.class).getPeer(), domain, code, Pointer.getPeer(format), varargs);
    }

    protected native void g_simple_async_result_set_from_error(
        @Ptr
        long simple,
        @Ptr
        long error);

    public void set_from_error(Pointer<GError> error) {
        this.g_simple_async_result_set_from_error(Pointer.pointerTo(this, GSimpleAsyncResult.class).getPeer(), Pointer.getPeer(error));
    }

    protected native void g_simple_async_result_set_handle_cancellation(
        @Ptr
        long simple, boolean handle_cancellation);

    public void set_handle_cancellation(boolean handle_cancellation) {
        this.g_simple_async_result_set_handle_cancellation(Pointer.pointerTo(this, GSimpleAsyncResult.class).getPeer(), handle_cancellation);
    }

    protected native void g_simple_async_result_set_op_res_gboolean(
        @Ptr
        long simple, boolean op_res);

    public void set_op_res_gboolean(boolean op_res) {
        this.g_simple_async_result_set_op_res_gboolean(Pointer.pointerTo(this, GSimpleAsyncResult.class).getPeer(), op_res);
    }

    protected native void g_simple_async_result_set_op_res_gpointer(
        @Ptr
        long simple,
        @Ptr
        long op_res,
        @Ptr
        long destroy_op_res);

    public void set_op_res_gpointer(Pointer op_res, Pointer destroy_op_res) {
        this.g_simple_async_result_set_op_res_gpointer(Pointer.pointerTo(this, GSimpleAsyncResult.class).getPeer(), Pointer.getPeer(op_res), Pointer.getPeer(destroy_op_res));
    }

    protected native void g_simple_async_result_set_op_res_gssize(
        @Ptr
        long simple, long op_res);

    public void set_op_res_gssize(long op_res) {
        this.g_simple_async_result_set_op_res_gssize(Pointer.pointerTo(this, GSimpleAsyncResult.class).getPeer(), op_res);
    }

    protected native void g_simple_async_result_take_error(
        @Ptr
        long simple,
        @Ptr
        long error);

    public void take_error(Pointer<GError> error) {
        this.g_simple_async_result_take_error(Pointer.pointerTo(this, GSimpleAsyncResult.class).getPeer(), Pointer.getPeer(error));
    }

    protected native void g_simple_async_result_run_in_thread(
        @Ptr
        long simple,
        @Ptr
        long func, int io_priority,
        @Ptr
        long cancellable);

    public void run_in_thread(Pointer func, int io_priority, Pointer<GCancellable> cancellable) {
        this.g_simple_async_result_run_in_thread(Pointer.pointerTo(this, GSimpleAsyncResult.class).getPeer(), Pointer.getPeer(func), io_priority, Pointer.getPeer(cancellable));
    }

}
