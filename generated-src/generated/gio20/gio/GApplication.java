
package generated.gio20.gio;

import generated.glib20.glib.GOptionEntry;
import generated.glib20.glib.GOptionGroup;
import generated.gobject20.gobject.GObject;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GApplication
    extends GObject
{


    static {
        BridJ.register();
    }

    public GApplication() {
        super();
    }

    public GApplication(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_application_get_default();

    public static Pointer get_default() {
        return Pointer.pointerToAddress(GApplication.g_application_get_default());
    }

    protected static native boolean g_application_id_is_valid(
        @Ptr
        long application_id);

    public static boolean id_is_valid(Pointer application_id) {
        return GApplication.g_application_id_is_valid(Pointer.getPeer(application_id));
    }

    protected native void g_application_activate(
        @Ptr
        long application);

    public void activate() {
        this.g_application_activate(Pointer.pointerTo(this, GApplication.class).getPeer());
    }

    protected native void g_application_add_main_option_entries(
        @Ptr
        long application,
        @Ptr
        long entries);

    public void add_main_option_entries(Pointer<GOptionEntry> entries) {
        this.g_application_add_main_option_entries(Pointer.pointerTo(this, GApplication.class).getPeer(), Pointer.getPeer(entries));
    }

    protected native void g_application_add_option_group(
        @Ptr
        long application,
        @Ptr
        long group);

    public void add_option_group(Pointer<GOptionGroup> group) {
        this.g_application_add_option_group(Pointer.pointerTo(this, GApplication.class).getPeer(), Pointer.getPeer(group));
    }

    @Ptr
    protected native long g_application_get_application_id(
        @Ptr
        long application);

    public Pointer get_application_id() {
        return Pointer.pointerToAddress(this.g_application_get_application_id(Pointer.pointerTo(this, GApplication.class).getPeer()));
    }

    @Ptr
    protected native long g_application_get_dbus_connection(
        @Ptr
        long application);

    public Pointer get_dbus_connection() {
        return Pointer.pointerToAddress(this.g_application_get_dbus_connection(Pointer.pointerTo(this, GApplication.class).getPeer()));
    }

    @Ptr
    protected native long g_application_get_dbus_object_path(
        @Ptr
        long application);

    public Pointer get_dbus_object_path() {
        return Pointer.pointerToAddress(this.g_application_get_dbus_object_path(Pointer.pointerTo(this, GApplication.class).getPeer()));
    }

    protected native long g_application_get_inactivity_timeout(
        @Ptr
        long application);

    public long get_inactivity_timeout() {
        return this.g_application_get_inactivity_timeout(Pointer.pointerTo(this, GApplication.class).getPeer());
    }

    protected native boolean g_application_get_is_registered(
        @Ptr
        long application);

    public boolean get_is_registered() {
        return this.g_application_get_is_registered(Pointer.pointerTo(this, GApplication.class).getPeer());
    }

    protected native boolean g_application_get_is_remote(
        @Ptr
        long application);

    public boolean get_is_remote() {
        return this.g_application_get_is_remote(Pointer.pointerTo(this, GApplication.class).getPeer());
    }

    protected native void g_application_hold(
        @Ptr
        long application);

    public void hold() {
        this.g_application_hold(Pointer.pointerTo(this, GApplication.class).getPeer());
    }

    protected native void g_application_mark_busy(
        @Ptr
        long application);

    public void mark_busy() {
        this.g_application_mark_busy(Pointer.pointerTo(this, GApplication.class).getPeer());
    }

    protected native void g_application_open(
        @Ptr
        long application,
        @Ptr
        long files, int n_files,
        @Ptr
        long hint);

    public void open(Pointer files, int n_files, Pointer hint) {
        this.g_application_open(Pointer.pointerTo(this, GApplication.class).getPeer(), Pointer.getPeer(files), n_files, Pointer.getPeer(hint));
    }

    protected native void g_application_quit(
        @Ptr
        long application);

    public void quit() {
        this.g_application_quit(Pointer.pointerTo(this, GApplication.class).getPeer());
    }

    protected native boolean g_application_register(
        @Ptr
        long application,
        @Ptr
        long cancellable);

    public boolean register(Pointer cancellable) {
        return this.g_application_register(Pointer.pointerTo(this, GApplication.class).getPeer(), Pointer.getPeer(cancellable));
    }

    protected native void g_application_release(
        @Ptr
        long application);

    public void release() {
        this.g_application_release(Pointer.pointerTo(this, GApplication.class).getPeer());
    }

    protected native int g_application_run(
        @Ptr
        long application, int argc,
        @Ptr
        long argv);

    public int run(int argc, Pointer argv) {
        return this.g_application_run(Pointer.pointerTo(this, GApplication.class).getPeer(), argc, Pointer.getPeer(argv));
    }

    protected native void g_application_send_notification(
        @Ptr
        long application,
        @Ptr
        long id,
        @Ptr
        long notification);

    public void send_notification(Pointer id, Pointer notification) {
        this.g_application_send_notification(Pointer.pointerTo(this, GApplication.class).getPeer(), Pointer.getPeer(id), Pointer.getPeer(notification));
    }

    protected native void g_application_set_action_group(
        @Ptr
        long application,
        @Ptr
        long action_group);

    public void set_action_group(Pointer<Object> action_group) {
        this.g_application_set_action_group(Pointer.pointerTo(this, GApplication.class).getPeer(), Pointer.getPeer(action_group));
    }

    protected native void g_application_set_application_id(
        @Ptr
        long application,
        @Ptr
        long application_id);

    public void set_application_id(Pointer application_id) {
        this.g_application_set_application_id(Pointer.pointerTo(this, GApplication.class).getPeer(), Pointer.getPeer(application_id));
    }

    protected native void g_application_set_default(
        @Ptr
        long application);

    public void set_default() {
        this.g_application_set_default(Pointer.pointerTo(this, GApplication.class).getPeer());
    }

    protected native void g_application_set_inactivity_timeout(
        @Ptr
        long application, long inactivity_timeout);

    public void set_inactivity_timeout(long inactivity_timeout) {
        this.g_application_set_inactivity_timeout(Pointer.pointerTo(this, GApplication.class).getPeer(), inactivity_timeout);
    }

    protected native void g_application_unmark_busy(
        @Ptr
        long application);

    public void unmark_busy() {
        this.g_application_unmark_busy(Pointer.pointerTo(this, GApplication.class).getPeer());
    }

    protected native void g_application_withdraw_notification(
        @Ptr
        long application,
        @Ptr
        long id);

    public void withdraw_notification(Pointer id) {
        this.g_application_withdraw_notification(Pointer.pointerTo(this, GApplication.class).getPeer(), Pointer.getPeer(id));
    }

    @Field(0)
    private GObject gapplication_field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    private GApplication gapplication_field_parent_instance(GObject gapplication_field_parent_instance) {
        this.io.setNativeObjectField(this, 0, gapplication_field_parent_instance);
        return this;
    }

    @Field(1)
    private Pointer gapplication_field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GApplication gapplication_field_priv(Pointer gapplication_field_priv) {
        this.io.setPointerField(this, 1, gapplication_field_priv);
        return this;
    }

    protected native void g_application_set_flags(
        @Ptr
        long application, IntValuedEnum<GApplicationFlags> flags);

    public void set_flags(IntValuedEnum<GApplicationFlags> flags) {
        this.g_application_set_flags(Pointer.pointerTo(this, GApplication.class).getPeer(), flags);
    }

    protected native IntValuedEnum<GApplicationFlags> g_application_get_flags(
        @Ptr
        long application);

    public IntValuedEnum<GApplicationFlags> get_flags() {
        return this.g_application_get_flags(Pointer.pointerTo(this, GApplication.class).getPeer());
    }

    @Ptr
    protected static native long g_application_new(
        @Ptr
        long application_id, IntValuedEnum<GApplicationFlags> flags);

    public static Pointer<GApplication> gapplication__new(Pointer application_id, IntValuedEnum<GApplicationFlags> flags) {
        return Pointer.pointerToAddress(GApplication.g_application_new(Pointer.getPeer(application_id), flags), GApplication.class);
    }

}
