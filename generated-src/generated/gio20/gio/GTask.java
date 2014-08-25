
package generated.gio20.gio;

import generated.glib20.glib.GError;
import generated.glib20.glib.GMainContext;
import generated.glib20.glib.GSource;
import generated.gobject20.gobject.GObject;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GTask
    extends GObject
{


    static {
        BridJ.register();
    }

    public GTask() {
        super();
    }

    public GTask(Pointer pointer) {
        super(pointer);
    }

    protected native void g_task_attach_source(
        @Ptr
        long task,
        @Ptr
        long source,
        @Ptr
        long callback);

    public void attach_source(Pointer<GSource> source, Pointer callback) {
        this.g_task_attach_source(Pointer.pointerTo(this, GTask.class).getPeer(), Pointer.getPeer(source), Pointer.getPeer(callback));
    }

    @Ptr
    protected native long g_task_get_cancellable(
        @Ptr
        long task);

    public Pointer<GCancellable> get_cancellable() {
        return Pointer.pointerToAddress(this.g_task_get_cancellable(Pointer.pointerTo(this, GTask.class).getPeer()), GCancellable.class);
    }

    protected native boolean g_task_get_check_cancellable(
        @Ptr
        long task);

    public boolean get_check_cancellable() {
        return this.g_task_get_check_cancellable(Pointer.pointerTo(this, GTask.class).getPeer());
    }

    @Ptr
    protected native long g_task_get_context(
        @Ptr
        long task);

    public Pointer<GMainContext> get_context() {
        return Pointer.pointerToAddress(this.g_task_get_context(Pointer.pointerTo(this, GTask.class).getPeer()), GMainContext.class);
    }

    protected native int g_task_get_priority(
        @Ptr
        long task);

    public int get_priority() {
        return this.g_task_get_priority(Pointer.pointerTo(this, GTask.class).getPeer());
    }

    protected native boolean g_task_get_return_on_cancel(
        @Ptr
        long task);

    public boolean get_return_on_cancel() {
        return this.g_task_get_return_on_cancel(Pointer.pointerTo(this, GTask.class).getPeer());
    }

    @Ptr
    protected native long g_task_get_source_tag(
        @Ptr
        long task);

    public Pointer get_source_tag() {
        return Pointer.pointerToAddress(this.g_task_get_source_tag(Pointer.pointerTo(this, GTask.class).getPeer()));
    }

    @Ptr
    protected native long g_task_get_task_data(
        @Ptr
        long task);

    public Pointer get_task_data() {
        return Pointer.pointerToAddress(this.g_task_get_task_data(Pointer.pointerTo(this, GTask.class).getPeer()));
    }

    protected native boolean g_task_had_error(
        @Ptr
        long task);

    public boolean had_error() {
        return this.g_task_had_error(Pointer.pointerTo(this, GTask.class).getPeer());
    }

    protected native boolean g_task_propagate_boolean(
        @Ptr
        long task);

    public boolean propagate_boolean() {
        return this.g_task_propagate_boolean(Pointer.pointerTo(this, GTask.class).getPeer());
    }

    protected native long g_task_propagate_int(
        @Ptr
        long task);

    public long propagate_int() {
        return this.g_task_propagate_int(Pointer.pointerTo(this, GTask.class).getPeer());
    }

    @Ptr
    protected native long g_task_propagate_pointer(
        @Ptr
        long task);

    public Pointer propagate_pointer() {
        return Pointer.pointerToAddress(this.g_task_propagate_pointer(Pointer.pointerTo(this, GTask.class).getPeer()));
    }

    protected native void g_task_return_boolean(
        @Ptr
        long task, boolean result);

    public void return_boolean(boolean result) {
        this.g_task_return_boolean(Pointer.pointerTo(this, GTask.class).getPeer(), result);
    }

    protected native void g_task_return_error(
        @Ptr
        long task,
        @Ptr
        long error);

    public void return_error(Pointer<GError> error) {
        this.g_task_return_error(Pointer.pointerTo(this, GTask.class).getPeer(), Pointer.getPeer(error));
    }

    protected native boolean g_task_return_error_if_cancelled(
        @Ptr
        long task);

    public boolean return_error_if_cancelled() {
        return this.g_task_return_error_if_cancelled(Pointer.pointerTo(this, GTask.class).getPeer());
    }

    protected native void g_task_return_int(
        @Ptr
        long task, long result);

    public void return_int(long result) {
        this.g_task_return_int(Pointer.pointerTo(this, GTask.class).getPeer(), result);
    }

    protected native void g_task_return_new_error(
        @Ptr
        long task, long domain, int code,
        @Ptr
        long format, Object... varargs);

    public void return_new_error(long domain, int code, Pointer format, Object... varargs) {
        this.g_task_return_new_error(Pointer.pointerTo(this, GTask.class).getPeer(), domain, code, Pointer.getPeer(format), varargs);
    }

    protected native void g_task_return_pointer(
        @Ptr
        long task,
        @Ptr
        long result,
        @Ptr
        long result_destroy);

    public void return_pointer(Pointer result, Pointer result_destroy) {
        this.g_task_return_pointer(Pointer.pointerTo(this, GTask.class).getPeer(), Pointer.getPeer(result), Pointer.getPeer(result_destroy));
    }

    protected native void g_task_set_check_cancellable(
        @Ptr
        long task, boolean check_cancellable);

    public void set_check_cancellable(boolean check_cancellable) {
        this.g_task_set_check_cancellable(Pointer.pointerTo(this, GTask.class).getPeer(), check_cancellable);
    }

    protected native void g_task_set_priority(
        @Ptr
        long task, int priority);

    public void set_priority(int priority) {
        this.g_task_set_priority(Pointer.pointerTo(this, GTask.class).getPeer(), priority);
    }

    protected native boolean g_task_set_return_on_cancel(
        @Ptr
        long task, boolean return_on_cancel);

    public boolean set_return_on_cancel(boolean return_on_cancel) {
        return this.g_task_set_return_on_cancel(Pointer.pointerTo(this, GTask.class).getPeer(), return_on_cancel);
    }

    protected native void g_task_set_source_tag(
        @Ptr
        long task,
        @Ptr
        long source_tag);

    public void set_source_tag(Pointer source_tag) {
        this.g_task_set_source_tag(Pointer.pointerTo(this, GTask.class).getPeer(), Pointer.getPeer(source_tag));
    }

    protected native void g_task_set_task_data(
        @Ptr
        long task,
        @Ptr
        long task_data,
        @Ptr
        long task_data_destroy);

    public void set_task_data(Pointer task_data, Pointer task_data_destroy) {
        this.g_task_set_task_data(Pointer.pointerTo(this, GTask.class).getPeer(), Pointer.getPeer(task_data), Pointer.getPeer(task_data_destroy));
    }

    protected native void g_task_run_in_thread_sync(
        @Ptr
        long task,
        @Ptr
        long task_func);

    public void run_in_thread_sync(Pointer task_func) {
        this.g_task_run_in_thread_sync(Pointer.pointerTo(this, GTask.class).getPeer(), Pointer.getPeer(task_func));
    }

    protected native void g_task_run_in_thread(
        @Ptr
        long task,
        @Ptr
        long task_func);

    public void run_in_thread(Pointer task_func) {
        this.g_task_run_in_thread(Pointer.pointerTo(this, GTask.class).getPeer(), Pointer.getPeer(task_func));
    }

}
