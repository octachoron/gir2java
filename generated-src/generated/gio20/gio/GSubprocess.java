
package generated.gio20.gio;

import generated.glib20.glib.GBytes;
import generated.gobject20.gobject.GObject;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GSubprocess
    extends GObject
{


    public GSubprocess() {
        super();
    }

    public GSubprocess(Pointer pointer) {
        super(pointer);
    }

    protected native boolean g_subprocess_communicate(
        @Ptr
        long subprocess,
        @Ptr
        long stdin_buf,
        @Ptr
        long cancellable,
        @Ptr
        long stdout_buf,
        @Ptr
        long stderr_buf);

    public boolean communicate(Pointer<GBytes> stdin_buf, Pointer<GCancellable> cancellable, Pointer<Pointer<GBytes>> stdout_buf, Pointer<Pointer<GBytes>> stderr_buf) {
        return this.g_subprocess_communicate(Pointer.pointerTo(this, GSubprocess.class), Pointer.getPeer(stdin_buf), Pointer.getPeer(cancellable), Pointer.getPeer(stdout_buf), Pointer.getPeer(stderr_buf));
    }

    protected native void g_subprocess_communicate_async(
        @Ptr
        long subprocess,
        @Ptr
        long stdin_buf,
        @Ptr
        long cancellable, Object callback, Pointer user_data);

    public void communicate_async(Pointer<GBytes> stdin_buf, Pointer<GCancellable> cancellable, Object callback, Pointer user_data) {
        this.g_subprocess_communicate_async(Pointer.pointerTo(this, GSubprocess.class), Pointer.getPeer(stdin_buf), Pointer.getPeer(cancellable), callback, user_data);
    }

    protected native boolean g_subprocess_communicate_finish(
        @Ptr
        long subprocess,
        @Ptr
        long result,
        @Ptr
        long stdout_buf,
        @Ptr
        long stderr_buf);

    public boolean communicate_finish(Pointer<Object> result, Pointer<Pointer<GBytes>> stdout_buf, Pointer<Pointer<GBytes>> stderr_buf) {
        return this.g_subprocess_communicate_finish(Pointer.pointerTo(this, GSubprocess.class), Pointer.getPeer(result), Pointer.getPeer(stdout_buf), Pointer.getPeer(stderr_buf));
    }

    protected native boolean g_subprocess_communicate_utf8(
        @Ptr
        long subprocess,
        @Ptr
        long stdin_buf,
        @Ptr
        long cancellable,
        @Ptr
        long stdout_buf,
        @Ptr
        long stderr_buf);

    public boolean communicate_utf8(Pointer stdin_buf, Pointer<GCancellable> cancellable, Pointer stdout_buf, Pointer stderr_buf) {
        return this.g_subprocess_communicate_utf8(Pointer.pointerTo(this, GSubprocess.class), Pointer.getPeer(stdin_buf), Pointer.getPeer(cancellable), Pointer.getPeer(stdout_buf), Pointer.getPeer(stderr_buf));
    }

    protected native void g_subprocess_communicate_utf8_async(
        @Ptr
        long subprocess,
        @Ptr
        long stdin_buf,
        @Ptr
        long cancellable, Object callback, Pointer user_data);

    public void communicate_utf8_async(Pointer stdin_buf, Pointer<GCancellable> cancellable, Object callback, Pointer user_data) {
        this.g_subprocess_communicate_utf8_async(Pointer.pointerTo(this, GSubprocess.class), Pointer.getPeer(stdin_buf), Pointer.getPeer(cancellable), callback, user_data);
    }

    protected native boolean g_subprocess_communicate_utf8_finish(
        @Ptr
        long subprocess,
        @Ptr
        long result,
        @Ptr
        long stdout_buf,
        @Ptr
        long stderr_buf);

    public boolean communicate_utf8_finish(Pointer<Object> result, Pointer stdout_buf, Pointer stderr_buf) {
        return this.g_subprocess_communicate_utf8_finish(Pointer.pointerTo(this, GSubprocess.class), Pointer.getPeer(result), Pointer.getPeer(stdout_buf), Pointer.getPeer(stderr_buf));
    }

    protected native void g_subprocess_force_exit(
        @Ptr
        long subprocess);

    public void force_exit() {
        this.g_subprocess_force_exit(Pointer.pointerTo(this, GSubprocess.class));
    }

    protected native int g_subprocess_get_exit_status(
        @Ptr
        long subprocess);

    public int get_exit_status() {
        return this.g_subprocess_get_exit_status(Pointer.pointerTo(this, GSubprocess.class));
    }

    @Ptr
    protected native long g_subprocess_get_identifier(
        @Ptr
        long subprocess);

    public Pointer get_identifier() {
        return Pointer.pointerToAddress(this.g_subprocess_get_identifier(Pointer.pointerTo(this, GSubprocess.class)));
    }

    protected native boolean g_subprocess_get_if_exited(
        @Ptr
        long subprocess);

    public boolean get_if_exited() {
        return this.g_subprocess_get_if_exited(Pointer.pointerTo(this, GSubprocess.class));
    }

    protected native boolean g_subprocess_get_if_signaled(
        @Ptr
        long subprocess);

    public boolean get_if_signaled() {
        return this.g_subprocess_get_if_signaled(Pointer.pointerTo(this, GSubprocess.class));
    }

    protected native int g_subprocess_get_status(
        @Ptr
        long subprocess);

    public int get_status() {
        return this.g_subprocess_get_status(Pointer.pointerTo(this, GSubprocess.class));
    }

    @Ptr
    protected native long g_subprocess_get_stderr_pipe(
        @Ptr
        long subprocess);

    public Pointer<GInputStream> get_stderr_pipe() {
        return Pointer.pointerToAddress(this.g_subprocess_get_stderr_pipe(Pointer.pointerTo(this, GSubprocess.class)), Pointer.class);
    }

    @Ptr
    protected native long g_subprocess_get_stdin_pipe(
        @Ptr
        long subprocess);

    public Pointer<GOutputStream> get_stdin_pipe() {
        return Pointer.pointerToAddress(this.g_subprocess_get_stdin_pipe(Pointer.pointerTo(this, GSubprocess.class)), Pointer.class);
    }

    @Ptr
    protected native long g_subprocess_get_stdout_pipe(
        @Ptr
        long subprocess);

    public Pointer<GInputStream> get_stdout_pipe() {
        return Pointer.pointerToAddress(this.g_subprocess_get_stdout_pipe(Pointer.pointerTo(this, GSubprocess.class)), Pointer.class);
    }

    protected native boolean g_subprocess_get_successful(
        @Ptr
        long subprocess);

    public boolean get_successful() {
        return this.g_subprocess_get_successful(Pointer.pointerTo(this, GSubprocess.class));
    }

    protected native int g_subprocess_get_term_sig(
        @Ptr
        long subprocess);

    public int get_term_sig() {
        return this.g_subprocess_get_term_sig(Pointer.pointerTo(this, GSubprocess.class));
    }

    protected native void g_subprocess_send_signal(
        @Ptr
        long subprocess, int signal_num);

    public void send_signal(int signal_num) {
        this.g_subprocess_send_signal(Pointer.pointerTo(this, GSubprocess.class), signal_num);
    }

    protected native boolean g_subprocess_wait(
        @Ptr
        long subprocess,
        @Ptr
        long cancellable);

    public boolean wait(Pointer<GCancellable> cancellable) {
        return this.g_subprocess_wait(Pointer.pointerTo(this, GSubprocess.class), Pointer.getPeer(cancellable));
    }

    protected native void g_subprocess_wait_async(
        @Ptr
        long subprocess,
        @Ptr
        long cancellable, Object callback, Pointer user_data);

    public void wait_async(Pointer<GCancellable> cancellable, Object callback, Pointer user_data) {
        this.g_subprocess_wait_async(Pointer.pointerTo(this, GSubprocess.class), Pointer.getPeer(cancellable), callback, user_data);
    }

    protected native boolean g_subprocess_wait_check(
        @Ptr
        long subprocess,
        @Ptr
        long cancellable);

    public boolean wait_check(Pointer<GCancellable> cancellable) {
        return this.g_subprocess_wait_check(Pointer.pointerTo(this, GSubprocess.class), Pointer.getPeer(cancellable));
    }

    protected native void g_subprocess_wait_check_async(
        @Ptr
        long subprocess,
        @Ptr
        long cancellable, Object callback, Pointer user_data);

    public void wait_check_async(Pointer<GCancellable> cancellable, Object callback, Pointer user_data) {
        this.g_subprocess_wait_check_async(Pointer.pointerTo(this, GSubprocess.class), Pointer.getPeer(cancellable), callback, user_data);
    }

    protected native boolean g_subprocess_wait_check_finish(
        @Ptr
        long subprocess,
        @Ptr
        long result);

    public boolean wait_check_finish(Pointer<Object> result) {
        return this.g_subprocess_wait_check_finish(Pointer.pointerTo(this, GSubprocess.class), Pointer.getPeer(result));
    }

    protected native boolean g_subprocess_wait_finish(
        @Ptr
        long subprocess,
        @Ptr
        long result);

    public boolean wait_finish(Pointer<Object> result) {
        return this.g_subprocess_wait_finish(Pointer.pointerTo(this, GSubprocess.class), Pointer.getPeer(result));
    }

}
