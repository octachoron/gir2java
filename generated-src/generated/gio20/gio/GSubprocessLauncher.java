
package generated.gio20.gio;

import generated.glib20.glib.GError;
import generated.gobject20.gobject.GObject;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GSubprocessLauncher
    extends GObject
{


    public GSubprocessLauncher() {
        super();
    }

    public GSubprocessLauncher(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long g_subprocess_launcher_getenv(
        @Ptr
        long self,
        @Ptr
        long variable);

    public Pointer getenv(Pointer variable) {
        return Pointer.pointerToAddress(this.g_subprocess_launcher_getenv(Pointer.pointerTo(this, GSubprocessLauncher.class), Pointer.getPeer(variable)));
    }

    protected native void g_subprocess_launcher_set_child_setup(
        @Ptr
        long self, Object child_setup, Pointer user_data, Object destroy_notify);

    public void set_child_setup(Object child_setup, Pointer user_data, Object destroy_notify) {
        this.g_subprocess_launcher_set_child_setup(Pointer.pointerTo(this, GSubprocessLauncher.class), child_setup, user_data, destroy_notify);
    }

    protected native void g_subprocess_launcher_set_cwd(
        @Ptr
        long self,
        @Ptr
        long cwd);

    public void set_cwd(Pointer cwd) {
        this.g_subprocess_launcher_set_cwd(Pointer.pointerTo(this, GSubprocessLauncher.class), Pointer.getPeer(cwd));
    }

    protected native void g_subprocess_launcher_set_environ(
        @Ptr
        long self,
        @Ptr
        long env);

    public void set_environ(Pointer env) {
        this.g_subprocess_launcher_set_environ(Pointer.pointerTo(this, GSubprocessLauncher.class), Pointer.getPeer(env));
    }

    protected native void g_subprocess_launcher_set_flags(
        @Ptr
        long self, Object flags);

    public void set_flags(Object flags) {
        this.g_subprocess_launcher_set_flags(Pointer.pointerTo(this, GSubprocessLauncher.class), flags);
    }

    protected native void g_subprocess_launcher_set_stderr_file_path(
        @Ptr
        long self,
        @Ptr
        long path);

    public void set_stderr_file_path(Pointer path) {
        this.g_subprocess_launcher_set_stderr_file_path(Pointer.pointerTo(this, GSubprocessLauncher.class), Pointer.getPeer(path));
    }

    protected native void g_subprocess_launcher_set_stdin_file_path(
        @Ptr
        long self,
        @Ptr
        long path);

    public void set_stdin_file_path(Pointer path) {
        this.g_subprocess_launcher_set_stdin_file_path(Pointer.pointerTo(this, GSubprocessLauncher.class), Pointer.getPeer(path));
    }

    protected native void g_subprocess_launcher_set_stdout_file_path(
        @Ptr
        long self,
        @Ptr
        long path);

    public void set_stdout_file_path(Pointer path) {
        this.g_subprocess_launcher_set_stdout_file_path(Pointer.pointerTo(this, GSubprocessLauncher.class), Pointer.getPeer(path));
    }

    protected native void g_subprocess_launcher_setenv(
        @Ptr
        long self,
        @Ptr
        long variable,
        @Ptr
        long value, boolean overwrite);

    public void setenv(Pointer variable, Pointer value, boolean overwrite) {
        this.g_subprocess_launcher_setenv(Pointer.pointerTo(this, GSubprocessLauncher.class), Pointer.getPeer(variable), Pointer.getPeer(value), overwrite);
    }

    @Ptr
    protected native long g_subprocess_launcher_spawn(
        @Ptr
        long self,
        @Ptr
        long error,
        @Ptr
        long argv0, Object... varargs);

    public Pointer<GSubprocess> spawn(Pointer<Pointer<GError>> error, Pointer argv0, Object... varargs) {
        return Pointer.pointerToAddress(this.g_subprocess_launcher_spawn(Pointer.pointerTo(this, GSubprocessLauncher.class), Pointer.getPeer(error), Pointer.getPeer(argv0), varargs), Pointer.class);
    }

    @Ptr
    protected native long g_subprocess_launcher_spawnv(
        @Ptr
        long self,
        @Ptr
        long argv);

    public Pointer<GSubprocess> spawnv(Pointer argv) {
        return Pointer.pointerToAddress(this.g_subprocess_launcher_spawnv(Pointer.pointerTo(this, GSubprocessLauncher.class), Pointer.getPeer(argv)), Pointer.class);
    }

    protected native void g_subprocess_launcher_take_fd(
        @Ptr
        long self, int source_fd, int target_fd);

    public void take_fd(int source_fd, int target_fd) {
        this.g_subprocess_launcher_take_fd(Pointer.pointerTo(this, GSubprocessLauncher.class), source_fd, target_fd);
    }

    protected native void g_subprocess_launcher_take_stderr_fd(
        @Ptr
        long self, int fd);

    public void take_stderr_fd(int fd) {
        this.g_subprocess_launcher_take_stderr_fd(Pointer.pointerTo(this, GSubprocessLauncher.class), fd);
    }

    protected native void g_subprocess_launcher_take_stdin_fd(
        @Ptr
        long self, int fd);

    public void take_stdin_fd(int fd) {
        this.g_subprocess_launcher_take_stdin_fd(Pointer.pointerTo(this, GSubprocessLauncher.class), fd);
    }

    protected native void g_subprocess_launcher_take_stdout_fd(
        @Ptr
        long self, int fd);

    public void take_stdout_fd(int fd) {
        this.g_subprocess_launcher_take_stdout_fd(Pointer.pointerTo(this, GSubprocessLauncher.class), fd);
    }

    protected native void g_subprocess_launcher_unsetenv(
        @Ptr
        long self,
        @Ptr
        long variable);

    public void unsetenv(Pointer variable) {
        this.g_subprocess_launcher_unsetenv(Pointer.pointerTo(this, GSubprocessLauncher.class), Pointer.getPeer(variable));
    }

}
