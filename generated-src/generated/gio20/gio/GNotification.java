
package generated.gio20.gio;

import generated.glib20.glib.GVariant;
import generated.gobject20.gobject.GObject;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GNotification
    extends GObject
{


    static {
        BridJ.register();
    }

    public GNotification() {
        super();
    }

    public GNotification(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_notification_new(
        @Ptr
        long title);

    public static Pointer gnotification__new(Pointer title) {
        return Pointer.pointerToAddress(GNotification.g_notification_new(Pointer.getPeer(title)));
    }

    protected native void g_notification_add_button(
        @Ptr
        long notification,
        @Ptr
        long label,
        @Ptr
        long detailed_action);

    public void add_button(Pointer label, Pointer detailed_action) {
        this.g_notification_add_button(Pointer.pointerTo(this, GNotification.class).getPeer(), Pointer.getPeer(label), Pointer.getPeer(detailed_action));
    }

    protected native void g_notification_add_button_with_target(
        @Ptr
        long notification,
        @Ptr
        long label,
        @Ptr
        long action,
        @Ptr
        long target_format, Object... varargs);

    public void add_button_with_target(Pointer label, Pointer action, Pointer target_format, Object... varargs) {
        this.g_notification_add_button_with_target(Pointer.pointerTo(this, GNotification.class).getPeer(), Pointer.getPeer(label), Pointer.getPeer(action), Pointer.getPeer(target_format), varargs);
    }

    protected native void g_notification_add_button_with_target_value(
        @Ptr
        long notification,
        @Ptr
        long label,
        @Ptr
        long action,
        @Ptr
        long target);

    public void add_button_with_target_value(Pointer label, Pointer action, Pointer<GVariant> target) {
        this.g_notification_add_button_with_target_value(Pointer.pointerTo(this, GNotification.class).getPeer(), Pointer.getPeer(label), Pointer.getPeer(action), Pointer.getPeer(target));
    }

    protected native void g_notification_set_body(
        @Ptr
        long notification,
        @Ptr
        long body);

    public void set_body(Pointer body) {
        this.g_notification_set_body(Pointer.pointerTo(this, GNotification.class).getPeer(), Pointer.getPeer(body));
    }

    protected native void g_notification_set_default_action(
        @Ptr
        long notification,
        @Ptr
        long detailed_action);

    public void set_default_action(Pointer detailed_action) {
        this.g_notification_set_default_action(Pointer.pointerTo(this, GNotification.class).getPeer(), Pointer.getPeer(detailed_action));
    }

    protected native void g_notification_set_default_action_and_target(
        @Ptr
        long notification,
        @Ptr
        long action,
        @Ptr
        long target_format, Object... varargs);

    public void set_default_action_and_target(Pointer action, Pointer target_format, Object... varargs) {
        this.g_notification_set_default_action_and_target(Pointer.pointerTo(this, GNotification.class).getPeer(), Pointer.getPeer(action), Pointer.getPeer(target_format), varargs);
    }

    protected native void g_notification_set_default_action_and_target_value(
        @Ptr
        long notification,
        @Ptr
        long action,
        @Ptr
        long target);

    public void set_default_action_and_target_value(Pointer action, Pointer<GVariant> target) {
        this.g_notification_set_default_action_and_target_value(Pointer.pointerTo(this, GNotification.class).getPeer(), Pointer.getPeer(action), Pointer.getPeer(target));
    }

    protected native void g_notification_set_icon(
        @Ptr
        long notification,
        @Ptr
        long icon);

    public void set_icon(Pointer<Object> icon) {
        this.g_notification_set_icon(Pointer.pointerTo(this, GNotification.class).getPeer(), Pointer.getPeer(icon));
    }

    protected native void g_notification_set_title(
        @Ptr
        long notification,
        @Ptr
        long title);

    public void set_title(Pointer title) {
        this.g_notification_set_title(Pointer.pointerTo(this, GNotification.class).getPeer(), Pointer.getPeer(title));
    }

    protected native void g_notification_set_urgent(
        @Ptr
        long notification, boolean urgent);

    public void set_urgent(boolean urgent) {
        this.g_notification_set_urgent(Pointer.pointerTo(this, GNotification.class).getPeer(), urgent);
    }

}
