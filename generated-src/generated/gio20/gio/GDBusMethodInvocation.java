
package generated.gio20.gio;

import generated.glib20.glib.GError;
import generated.glib20.glib.GVariant;
import generated.gobject20.gobject.GObject;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GDBusMethodInvocation
    extends GObject
{


    static {
        BridJ.register();
    }

    public GDBusMethodInvocation() {
        super();
    }

    public GDBusMethodInvocation(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long g_dbus_method_invocation_get_connection(
        @Ptr
        long invocation);

    public Pointer<GDBusConnection> get_connection() {
        return Pointer.pointerToAddress(this.g_dbus_method_invocation_get_connection(Pointer.pointerTo(this, GDBusMethodInvocation.class).getPeer()), GDBusConnection.class);
    }

    @Ptr
    protected native long g_dbus_method_invocation_get_interface_name(
        @Ptr
        long invocation);

    public Pointer get_interface_name() {
        return Pointer.pointerToAddress(this.g_dbus_method_invocation_get_interface_name(Pointer.pointerTo(this, GDBusMethodInvocation.class).getPeer()));
    }

    @Ptr
    protected native long g_dbus_method_invocation_get_message(
        @Ptr
        long invocation);

    public Pointer<GDBusMessage> get_message() {
        return Pointer.pointerToAddress(this.g_dbus_method_invocation_get_message(Pointer.pointerTo(this, GDBusMethodInvocation.class).getPeer()), GDBusMessage.class);
    }

    @Ptr
    protected native long g_dbus_method_invocation_get_method_info(
        @Ptr
        long invocation);

    public Pointer<GDBusMethodInfo> get_method_info() {
        return Pointer.pointerToAddress(this.g_dbus_method_invocation_get_method_info(Pointer.pointerTo(this, GDBusMethodInvocation.class).getPeer()), GDBusMethodInfo.class);
    }

    @Ptr
    protected native long g_dbus_method_invocation_get_method_name(
        @Ptr
        long invocation);

    public Pointer get_method_name() {
        return Pointer.pointerToAddress(this.g_dbus_method_invocation_get_method_name(Pointer.pointerTo(this, GDBusMethodInvocation.class).getPeer()));
    }

    @Ptr
    protected native long g_dbus_method_invocation_get_object_path(
        @Ptr
        long invocation);

    public Pointer get_object_path() {
        return Pointer.pointerToAddress(this.g_dbus_method_invocation_get_object_path(Pointer.pointerTo(this, GDBusMethodInvocation.class).getPeer()));
    }

    @Ptr
    protected native long g_dbus_method_invocation_get_parameters(
        @Ptr
        long invocation);

    public Pointer<GVariant> get_parameters() {
        return Pointer.pointerToAddress(this.g_dbus_method_invocation_get_parameters(Pointer.pointerTo(this, GDBusMethodInvocation.class).getPeer()), GVariant.class);
    }

    @Ptr
    protected native long g_dbus_method_invocation_get_property_info(
        @Ptr
        long invocation);

    public Pointer get_property_info() {
        return Pointer.pointerToAddress(this.g_dbus_method_invocation_get_property_info(Pointer.pointerTo(this, GDBusMethodInvocation.class).getPeer()));
    }

    @Ptr
    protected native long g_dbus_method_invocation_get_sender(
        @Ptr
        long invocation);

    public Pointer get_sender() {
        return Pointer.pointerToAddress(this.g_dbus_method_invocation_get_sender(Pointer.pointerTo(this, GDBusMethodInvocation.class).getPeer()));
    }

    @Ptr
    protected native long g_dbus_method_invocation_get_user_data(
        @Ptr
        long invocation);

    public Pointer get_user_data() {
        return Pointer.pointerToAddress(this.g_dbus_method_invocation_get_user_data(Pointer.pointerTo(this, GDBusMethodInvocation.class).getPeer()));
    }

    protected native void g_dbus_method_invocation_return_dbus_error(
        @Ptr
        long invocation,
        @Ptr
        long error_name,
        @Ptr
        long error_message);

    public void return_dbus_error(Pointer error_name, Pointer error_message) {
        this.g_dbus_method_invocation_return_dbus_error(Pointer.pointerTo(this, GDBusMethodInvocation.class).getPeer(), Pointer.getPeer(error_name), Pointer.getPeer(error_message));
    }

    protected native void g_dbus_method_invocation_return_error(
        @Ptr
        long invocation, long domain, int code,
        @Ptr
        long format, Object... varargs);

    public void return_error(long domain, int code, Pointer format, Object... varargs) {
        this.g_dbus_method_invocation_return_error(Pointer.pointerTo(this, GDBusMethodInvocation.class).getPeer(), domain, code, Pointer.getPeer(format), varargs);
    }

    protected native void g_dbus_method_invocation_return_error_literal(
        @Ptr
        long invocation, long domain, int code,
        @Ptr
        long message);

    public void return_error_literal(long domain, int code, Pointer message) {
        this.g_dbus_method_invocation_return_error_literal(Pointer.pointerTo(this, GDBusMethodInvocation.class).getPeer(), domain, code, Pointer.getPeer(message));
    }

    protected native void g_dbus_method_invocation_return_gerror(
        @Ptr
        long invocation,
        @Ptr
        long error);

    public void return_gerror(Pointer<GError> error) {
        this.g_dbus_method_invocation_return_gerror(Pointer.pointerTo(this, GDBusMethodInvocation.class).getPeer(), Pointer.getPeer(error));
    }

    protected native void g_dbus_method_invocation_return_value(
        @Ptr
        long invocation,
        @Ptr
        long parameters);

    public void return_value(Pointer<GVariant> parameters) {
        this.g_dbus_method_invocation_return_value(Pointer.pointerTo(this, GDBusMethodInvocation.class).getPeer(), Pointer.getPeer(parameters));
    }

    protected native void g_dbus_method_invocation_return_value_with_unix_fd_list(
        @Ptr
        long invocation,
        @Ptr
        long parameters,
        @Ptr
        long fd_list);

    public void return_value_with_unix_fd_list(Pointer<GVariant> parameters, Pointer fd_list) {
        this.g_dbus_method_invocation_return_value_with_unix_fd_list(Pointer.pointerTo(this, GDBusMethodInvocation.class).getPeer(), Pointer.getPeer(parameters), Pointer.getPeer(fd_list));
    }

    protected native void g_dbus_method_invocation_take_error(
        @Ptr
        long invocation,
        @Ptr
        long error);

    public void take_error(Pointer<GError> error) {
        this.g_dbus_method_invocation_take_error(Pointer.pointerTo(this, GDBusMethodInvocation.class).getPeer(), Pointer.getPeer(error));
    }

}
