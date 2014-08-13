
package generated.gio20.gio;

import generated.glib20.glib.GVariant;
import generated.glib20.glib.GVariantDict;
import generated.gobject20.gobject.GObject;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GApplicationCommandLine
    extends GObject
{


    public GApplicationCommandLine() {
        super();
    }

    public GApplicationCommandLine(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long g_application_command_line_create_file_for_arg(
        @Ptr
        long cmdline,
        @Ptr
        long arg);

    public Pointer create_file_for_arg(Pointer arg) {
        return Pointer.pointerToAddress(this.g_application_command_line_create_file_for_arg(Pointer.pointerTo(this, GApplicationCommandLine.class), Pointer.getPeer(arg)));
    }

    @Ptr
    protected native long g_application_command_line_get_arguments(
        @Ptr
        long cmdline,
        @Ptr
        long argc);

    public Pointer get_arguments(Pointer<Integer> argc) {
        return Pointer.pointerToAddress(this.g_application_command_line_get_arguments(Pointer.pointerTo(this, GApplicationCommandLine.class), Pointer.getPeer(argc)));
    }

    @Ptr
    protected native long g_application_command_line_get_cwd(
        @Ptr
        long cmdline);

    public Pointer get_cwd() {
        return Pointer.pointerToAddress(this.g_application_command_line_get_cwd(Pointer.pointerTo(this, GApplicationCommandLine.class)));
    }

    @Ptr
    protected native long g_application_command_line_get_environ(
        @Ptr
        long cmdline);

    public Pointer get_environ() {
        return Pointer.pointerToAddress(this.g_application_command_line_get_environ(Pointer.pointerTo(this, GApplicationCommandLine.class)));
    }

    protected native int g_application_command_line_get_exit_status(
        @Ptr
        long cmdline);

    public int get_exit_status() {
        return this.g_application_command_line_get_exit_status(Pointer.pointerTo(this, GApplicationCommandLine.class));
    }

    protected native boolean g_application_command_line_get_is_remote(
        @Ptr
        long cmdline);

    public boolean get_is_remote() {
        return this.g_application_command_line_get_is_remote(Pointer.pointerTo(this, GApplicationCommandLine.class));
    }

    @Ptr
    protected native long g_application_command_line_get_options_dict(
        @Ptr
        long cmdline);

    public Pointer<GVariantDict> get_options_dict() {
        return Pointer.pointerToAddress(this.g_application_command_line_get_options_dict(Pointer.pointerTo(this, GApplicationCommandLine.class)), Pointer.class);
    }

    @Ptr
    protected native long g_application_command_line_get_platform_data(
        @Ptr
        long cmdline);

    public Pointer<GVariant> get_platform_data() {
        return Pointer.pointerToAddress(this.g_application_command_line_get_platform_data(Pointer.pointerTo(this, GApplicationCommandLine.class)), Pointer.class);
    }

    @Ptr
    protected native long g_application_command_line_get_stdin(
        @Ptr
        long cmdline);

    public Pointer get_stdin() {
        return Pointer.pointerToAddress(this.g_application_command_line_get_stdin(Pointer.pointerTo(this, GApplicationCommandLine.class)));
    }

    @Ptr
    protected native long g_application_command_line_getenv(
        @Ptr
        long cmdline,
        @Ptr
        long name);

    public Pointer getenv(Pointer name) {
        return Pointer.pointerToAddress(this.g_application_command_line_getenv(Pointer.pointerTo(this, GApplicationCommandLine.class), Pointer.getPeer(name)));
    }

    protected native void g_application_command_line_print(
        @Ptr
        long cmdline,
        @Ptr
        long format, Object... varargs);

    public void print(Pointer format, Object... varargs) {
        this.g_application_command_line_print(Pointer.pointerTo(this, GApplicationCommandLine.class), Pointer.getPeer(format), varargs);
    }

    protected native void g_application_command_line_printerr(
        @Ptr
        long cmdline,
        @Ptr
        long format, Object... varargs);

    public void printerr(Pointer format, Object... varargs) {
        this.g_application_command_line_printerr(Pointer.pointerTo(this, GApplicationCommandLine.class), Pointer.getPeer(format), varargs);
    }

    protected native void g_application_command_line_set_exit_status(
        @Ptr
        long cmdline, int exit_status);

    public void set_exit_status(int exit_status) {
        this.g_application_command_line_set_exit_status(Pointer.pointerTo(this, GApplicationCommandLine.class), exit_status);
    }

    @Field(0)
    public GObject field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GApplicationCommandLine field_parent_instance(GObject field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GApplicationCommandLine field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

}
