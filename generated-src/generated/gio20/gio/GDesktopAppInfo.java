
package generated.gio20.gio;

import generated.glib20.glib.GList;
import generated.gobject20.gobject.GObject;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GDesktopAppInfo
    extends GObject
{


    public GDesktopAppInfo() {
        super();
    }

    public GDesktopAppInfo(Pointer pointer) {
        super(pointer);
    }

    protected native void g_desktop_app_info_set_desktop_env(
        @Ptr
        long desktop_env);

    public void set_desktop_env(Pointer desktop_env) {
        this.g_desktop_app_info_set_desktop_env(Pointer.getPeer(desktop_env));
    }

    @Ptr
    protected native long g_desktop_app_info_get_action_name(
        @Ptr
        long info,
        @Ptr
        long action_name);

    public Pointer get_action_name(Pointer action_name) {
        return Pointer.pointerToAddress(this.g_desktop_app_info_get_action_name(Pointer.pointerTo(this, GDesktopAppInfo.class), Pointer.getPeer(action_name)));
    }

    protected native boolean g_desktop_app_info_get_boolean(
        @Ptr
        long info,
        @Ptr
        long key);

    public boolean get_boolean(Pointer key) {
        return this.g_desktop_app_info_get_boolean(Pointer.pointerTo(this, GDesktopAppInfo.class), Pointer.getPeer(key));
    }

    @Ptr
    protected native long g_desktop_app_info_get_categories(
        @Ptr
        long info);

    public Pointer get_categories() {
        return Pointer.pointerToAddress(this.g_desktop_app_info_get_categories(Pointer.pointerTo(this, GDesktopAppInfo.class)));
    }

    @Ptr
    protected native long g_desktop_app_info_get_filename(
        @Ptr
        long info);

    public Pointer get_filename() {
        return Pointer.pointerToAddress(this.g_desktop_app_info_get_filename(Pointer.pointerTo(this, GDesktopAppInfo.class)));
    }

    @Ptr
    protected native long g_desktop_app_info_get_generic_name(
        @Ptr
        long info);

    public Pointer get_generic_name() {
        return Pointer.pointerToAddress(this.g_desktop_app_info_get_generic_name(Pointer.pointerTo(this, GDesktopAppInfo.class)));
    }

    protected native boolean g_desktop_app_info_get_is_hidden(
        @Ptr
        long info);

    public boolean get_is_hidden() {
        return this.g_desktop_app_info_get_is_hidden(Pointer.pointerTo(this, GDesktopAppInfo.class));
    }

    @Ptr
    protected native long g_desktop_app_info_get_keywords(
        @Ptr
        long info);

    public Pointer get_keywords() {
        return Pointer.pointerToAddress(this.g_desktop_app_info_get_keywords(Pointer.pointerTo(this, GDesktopAppInfo.class)));
    }

    protected native boolean g_desktop_app_info_get_nodisplay(
        @Ptr
        long info);

    public boolean get_nodisplay() {
        return this.g_desktop_app_info_get_nodisplay(Pointer.pointerTo(this, GDesktopAppInfo.class));
    }

    protected native boolean g_desktop_app_info_get_show_in(
        @Ptr
        long info,
        @Ptr
        long desktop_env);

    public boolean get_show_in(Pointer desktop_env) {
        return this.g_desktop_app_info_get_show_in(Pointer.pointerTo(this, GDesktopAppInfo.class), Pointer.getPeer(desktop_env));
    }

    @Ptr
    protected native long g_desktop_app_info_get_startup_wm_class(
        @Ptr
        long info);

    public Pointer get_startup_wm_class() {
        return Pointer.pointerToAddress(this.g_desktop_app_info_get_startup_wm_class(Pointer.pointerTo(this, GDesktopAppInfo.class)));
    }

    @Ptr
    protected native long g_desktop_app_info_get_string(
        @Ptr
        long info,
        @Ptr
        long key);

    public Pointer get_string(Pointer key) {
        return Pointer.pointerToAddress(this.g_desktop_app_info_get_string(Pointer.pointerTo(this, GDesktopAppInfo.class), Pointer.getPeer(key)));
    }

    protected native boolean g_desktop_app_info_has_key(
        @Ptr
        long info,
        @Ptr
        long key);

    public boolean has_key(Pointer key) {
        return this.g_desktop_app_info_has_key(Pointer.pointerTo(this, GDesktopAppInfo.class), Pointer.getPeer(key));
    }

    protected native void g_desktop_app_info_launch_action(
        @Ptr
        long info,
        @Ptr
        long action_name,
        @Ptr
        long launch_context);

    public void launch_action(Pointer action_name, Pointer<GAppLaunchContext> launch_context) {
        this.g_desktop_app_info_launch_action(Pointer.pointerTo(this, GDesktopAppInfo.class), Pointer.getPeer(action_name), Pointer.getPeer(launch_context));
    }

    @Ptr
    protected native long g_desktop_app_info_list_actions(
        @Ptr
        long info);

    public Pointer list_actions() {
        return Pointer.pointerToAddress(this.g_desktop_app_info_list_actions(Pointer.pointerTo(this, GDesktopAppInfo.class)));
    }

    protected native boolean g_desktop_app_info_launch_uris_as_manager(
        @Ptr
        long appinfo,
        @Ptr
        long uris,
        @Ptr
        long launch_context, Object spawn_flags, Object user_setup, Pointer user_setup_data, Object pid_callback, Pointer pid_callback_data);

    public boolean launch_uris_as_manager(Pointer<GList> uris, Pointer<GAppLaunchContext> launch_context, Object spawn_flags, Object user_setup, Pointer user_setup_data, Object pid_callback, Pointer pid_callback_data) {
        return this.g_desktop_app_info_launch_uris_as_manager(Pointer.pointerTo(this, GDesktopAppInfo.class), Pointer.getPeer(uris), Pointer.getPeer(launch_context), spawn_flags, user_setup, user_setup_data, pid_callback, pid_callback_data);
    }

}
