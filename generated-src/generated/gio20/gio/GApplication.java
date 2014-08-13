
package generated.gio20.gio;

import generated.glib20.glib.GOptionEntry;
import generated.glib20.glib.GOptionGroup;
import generated.gobject20.gobject.GObject;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GApplication
    extends GObject
{


    public GApplication() {
        super();
    }

    public GApplication(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long g_application_get_default();

    public Pointer get_default() {
        return Pointer.pointerToAddress(this.g_application_get_default());
    }

    protected native boolean g_application_id_is_valid(
        @Ptr
        long application_id);

    public boolean id_is_valid(Pointer application_id) {
        return this.g_application_id_is_valid(Pointer.getPeer(application_id));
    }

    protected native void g_application_activate(
        @Ptr
        long application);

    public void activate() {
        this.g_application_activate(Pointer.pointerTo(this, GApplication.class));
    }

    protected native void g_application_add_main_option_entries(
        @Ptr
        long application,
        @Ptr
        long entries);

    public void add_main_option_entries(GOptionEntry entries) {
        this.g_application_add_main_option_entries(Pointer.pointerTo(this, GApplication.class), Pointer.getPeer(entries));
    }

    protected native void g_application_add_option_group(
        @Ptr
        long application,
        @Ptr
        long group);

    public void add_option_group(Pointer<GOptionGroup> group) {
        this.g_application_add_option_group(Pointer.pointerTo(this, GApplication.class), Pointer.getPeer(group));
    }

    @Ptr
    protected native long g_application_get_application_id(
        @Ptr
        long application);

    public Pointer get_application_id() {
        return Pointer.pointerToAddress(this.g_application_get_application_id(Pointer.pointerTo(this, GApplication.class)));
    }

    @Ptr
    protected native long g_application_get_dbus_connection(
        @Ptr
        long application);

    public Pointer get_dbus_connection() {
        return Pointer.pointerToAddress(this.g_application_get_dbus_connection(Pointer.pointerTo(this, GApplication.class)));
    }

    @Ptr
    protected native long g_application_get_dbus_object_path(
        @Ptr
        long application);

    public Pointer get_dbus_object_path() {
        return Pointer.pointerToAddress(this.g_application_get_dbus_object_path(Pointer.pointerTo(this, GApplication.class)));
    }

    protected native long g_application_get_inactivity_timeout(
        @Ptr
        long application);

    public long get_inactivity_timeout() {
        return this.g_application_get_inactivity_timeout(Pointer.pointerTo(this, GApplication.class));
    }

    protected native boolean g_application_get_is_registered(
        @Ptr
        long application);

    public boolean get_is_registered() {
        return this.g_application_get_is_registered(Pointer.pointerTo(this, GApplication.class));
    }

    protected native boolean g_application_get_is_remote(
        @Ptr
        long application);

    public boolean get_is_remote() {
        return this.g_application_get_is_remote(Pointer.pointerTo(this, GApplication.class));
    }

    protected native void g_application_hold(
        @Ptr
        long application);

    public void hold() {
        this.g_application_hold(Pointer.pointerTo(this, GApplication.class));
    }

    protected native void g_application_mark_busy(
        @Ptr
        long application);

    public void mark_busy() {
        this.g_application_mark_busy(Pointer.pointerTo(this, GApplication.class));
    }

    protected native void g_application_open(
        @Ptr
        long application,
        @Ptr
        long files, int n_files,
        @Ptr
        long hint);

    public void open(Pointer files, int n_files, Pointer hint) {
        this.g_application_open(Pointer.pointerTo(this, GApplication.class), Pointer.getPeer(files), n_files, Pointer.getPeer(hint));
    }

    protected native void g_application_quit(
        @Ptr
        long application);

    public void quit() {
        this.g_application_quit(Pointer.pointerTo(this, GApplication.class));
    }

    protected native boolean g_application_register(
        @Ptr
        long application,
        @Ptr
        long cancellable);

    public boolean register(Pointer cancellable) {
        return this.g_application_register(Pointer.pointerTo(this, GApplication.class), Pointer.getPeer(cancellable));
    }

    protected native void g_application_release(
        @Ptr
        long application);

    public void release() {
        this.g_application_release(Pointer.pointerTo(this, GApplication.class));
    }

    protected native int g_application_run(
        @Ptr
        long application, int argc,
        @Ptr
        long argv);

    public int run(int argc, Pointer argv) {
        return this.g_application_run(Pointer.pointerTo(this, GApplication.class), argc, Pointer.getPeer(argv));
    }

    protected native void g_application_send_notification(
        @Ptr
        long application,
        @Ptr
        long id,
        @Ptr
        long notification);

    public void send_notification(Pointer id, Pointer notification) {
        this.g_application_send_notification(Pointer.pointerTo(this, GApplication.class), Pointer.getPeer(id), Pointer.getPeer(notification));
    }

    protected native void g_application_set_action_group(
        @Ptr
        long application,
        @Ptr
        long action_group);

    public void set_action_group(Pointer<Object> action_group) {
        this.g_application_set_action_group(Pointer.pointerTo(this, GApplication.class), Pointer.getPeer(action_group));
    }

    protected native void g_application_set_application_id(
        @Ptr
        long application,
        @Ptr
        long application_id);

    public void set_application_id(Pointer application_id) {
        this.g_application_set_application_id(Pointer.pointerTo(this, GApplication.class), Pointer.getPeer(application_id));
    }

    protected native void g_application_set_default(
        @Ptr
        long application);

    public void set_default() {
        this.g_application_set_default(Pointer.pointerTo(this, GApplication.class));
    }

    protected native void g_application_set_inactivity_timeout(
        @Ptr
        long application, long inactivity_timeout);

    public void set_inactivity_timeout(long inactivity_timeout) {
        this.g_application_set_inactivity_timeout(Pointer.pointerTo(this, GApplication.class), inactivity_timeout);
    }

    protected native void g_application_unmark_busy(
        @Ptr
        long application);

    public void unmark_busy() {
        this.g_application_unmark_busy(Pointer.pointerTo(this, GApplication.class));
    }

    protected native void g_application_withdraw_notification(
        @Ptr
        long application,
        @Ptr
        long id);

    public void withdraw_notification(Pointer id) {
        this.g_application_withdraw_notification(Pointer.pointerTo(this, GApplication.class), Pointer.getPeer(id));
    }

    @Field(0)
    public GObject field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GApplication field_parent_instance(GObject field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GApplication field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

    protected native void g_application_set_flags(
        @Ptr
        long application, Object flags);

    public void set_flags(Object flags) {
        this.g_application_set_flags(Pointer.pointerTo(this, GApplication.class), flags);
    }

    protected native Object g_application_get_flags(
        @Ptr
        long application);

    public Object get_flags() {
        return this.g_application_get_flags(Pointer.pointerTo(this, GApplication.class));
    }

}
