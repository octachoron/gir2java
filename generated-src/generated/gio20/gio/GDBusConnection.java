
package generated.gio20.gio;

import generated.glib20.glib.GVariant;
import generated.glib20.glib.GVariantType;
import generated.gobject20.gobject.GObject;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GDBusConnection
    extends GObject
{


    static {
        BridJ.register();
    }

    public GDBusConnection() {
        super();
    }

    public GDBusConnection(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_dbus_connection_new_finish(
        @Ptr
        long res);

    public static Pointer new_finish(Pointer<Object> res) {
        return Pointer.pointerToAddress(GDBusConnection.g_dbus_connection_new_finish(Pointer.getPeer(res)));
    }

    @Ptr
    protected static native long g_dbus_connection_new_for_address_finish(
        @Ptr
        long res);

    public static Pointer new_for_address_finish(Pointer<Object> res) {
        return Pointer.pointerToAddress(GDBusConnection.g_dbus_connection_new_for_address_finish(Pointer.getPeer(res)));
    }

    protected native void g_dbus_connection_call(
        @Ptr
        long connection,
        @Ptr
        long bus_name,
        @Ptr
        long object_path,
        @Ptr
        long interface_name,
        @Ptr
        long method_name,
        @Ptr
        long parameters,
        @Ptr
        long reply_type, IntValuedEnum<GDBusCallFlags> flags, int timeout_msec,
        @Ptr
        long cancellable,
        @Ptr
        long callback,
        @Ptr
        long user_data);

    public void call(Pointer bus_name, Pointer object_path, Pointer interface_name, Pointer method_name, Pointer<GVariant> parameters, Pointer<GVariantType> reply_type, IntValuedEnum<GDBusCallFlags> flags, int timeout_msec, Pointer<GCancellable> cancellable, Pointer callback, Pointer user_data) {
        this.g_dbus_connection_call(Pointer.pointerTo(this, GDBusConnection.class).getPeer(), Pointer.getPeer(bus_name), Pointer.getPeer(object_path), Pointer.getPeer(interface_name), Pointer.getPeer(method_name), Pointer.getPeer(parameters), Pointer.getPeer(reply_type), flags, timeout_msec, Pointer.getPeer(cancellable), Pointer.getPeer(callback), Pointer.getPeer(user_data));
    }

    @Ptr
    protected native long g_dbus_connection_call_finish(
        @Ptr
        long connection,
        @Ptr
        long res);

    public Pointer<GVariant> call_finish(Pointer<Object> res) {
        return Pointer.pointerToAddress(this.g_dbus_connection_call_finish(Pointer.pointerTo(this, GDBusConnection.class).getPeer(), Pointer.getPeer(res)), GVariant.class);
    }

    @Ptr
    protected native long g_dbus_connection_call_sync(
        @Ptr
        long connection,
        @Ptr
        long bus_name,
        @Ptr
        long object_path,
        @Ptr
        long interface_name,
        @Ptr
        long method_name,
        @Ptr
        long parameters,
        @Ptr
        long reply_type, IntValuedEnum<GDBusCallFlags> flags, int timeout_msec,
        @Ptr
        long cancellable);

    public Pointer<GVariant> call_sync(Pointer bus_name, Pointer object_path, Pointer interface_name, Pointer method_name, Pointer<GVariant> parameters, Pointer<GVariantType> reply_type, IntValuedEnum<GDBusCallFlags> flags, int timeout_msec, Pointer<GCancellable> cancellable) {
        return Pointer.pointerToAddress(this.g_dbus_connection_call_sync(Pointer.pointerTo(this, GDBusConnection.class).getPeer(), Pointer.getPeer(bus_name), Pointer.getPeer(object_path), Pointer.getPeer(interface_name), Pointer.getPeer(method_name), Pointer.getPeer(parameters), Pointer.getPeer(reply_type), flags, timeout_msec, Pointer.getPeer(cancellable)), GVariant.class);
    }

    protected native void g_dbus_connection_call_with_unix_fd_list(
        @Ptr
        long connection,
        @Ptr
        long bus_name,
        @Ptr
        long object_path,
        @Ptr
        long interface_name,
        @Ptr
        long method_name,
        @Ptr
        long parameters,
        @Ptr
        long reply_type, IntValuedEnum<GDBusCallFlags> flags, int timeout_msec,
        @Ptr
        long fd_list,
        @Ptr
        long cancellable,
        @Ptr
        long callback,
        @Ptr
        long user_data);

    public void call_with_unix_fd_list(Pointer bus_name, Pointer object_path, Pointer interface_name, Pointer method_name, Pointer<GVariant> parameters, Pointer<GVariantType> reply_type, IntValuedEnum<GDBusCallFlags> flags, int timeout_msec, Pointer fd_list, Pointer<GCancellable> cancellable, Pointer callback, Pointer user_data) {
        this.g_dbus_connection_call_with_unix_fd_list(Pointer.pointerTo(this, GDBusConnection.class).getPeer(), Pointer.getPeer(bus_name), Pointer.getPeer(object_path), Pointer.getPeer(interface_name), Pointer.getPeer(method_name), Pointer.getPeer(parameters), Pointer.getPeer(reply_type), flags, timeout_msec, Pointer.getPeer(fd_list), Pointer.getPeer(cancellable), Pointer.getPeer(callback), Pointer.getPeer(user_data));
    }

    @Ptr
    protected native long g_dbus_connection_call_with_unix_fd_list_finish(
        @Ptr
        long connection,
        @Ptr
        long out_fd_list,
        @Ptr
        long res);

    public Pointer<GVariant> call_with_unix_fd_list_finish(Pointer out_fd_list, Pointer<Object> res) {
        return Pointer.pointerToAddress(this.g_dbus_connection_call_with_unix_fd_list_finish(Pointer.pointerTo(this, GDBusConnection.class).getPeer(), Pointer.getPeer(out_fd_list), Pointer.getPeer(res)), GVariant.class);
    }

    @Ptr
    protected native long g_dbus_connection_call_with_unix_fd_list_sync(
        @Ptr
        long connection,
        @Ptr
        long bus_name,
        @Ptr
        long object_path,
        @Ptr
        long interface_name,
        @Ptr
        long method_name,
        @Ptr
        long parameters,
        @Ptr
        long reply_type, IntValuedEnum<GDBusCallFlags> flags, int timeout_msec,
        @Ptr
        long fd_list,
        @Ptr
        long out_fd_list,
        @Ptr
        long cancellable);

    public Pointer<GVariant> call_with_unix_fd_list_sync(Pointer bus_name, Pointer object_path, Pointer interface_name, Pointer method_name, Pointer<GVariant> parameters, Pointer<GVariantType> reply_type, IntValuedEnum<GDBusCallFlags> flags, int timeout_msec, Pointer fd_list, Pointer out_fd_list, Pointer<GCancellable> cancellable) {
        return Pointer.pointerToAddress(this.g_dbus_connection_call_with_unix_fd_list_sync(Pointer.pointerTo(this, GDBusConnection.class).getPeer(), Pointer.getPeer(bus_name), Pointer.getPeer(object_path), Pointer.getPeer(interface_name), Pointer.getPeer(method_name), Pointer.getPeer(parameters), Pointer.getPeer(reply_type), flags, timeout_msec, Pointer.getPeer(fd_list), Pointer.getPeer(out_fd_list), Pointer.getPeer(cancellable)), GVariant.class);
    }

    protected native void g_dbus_connection_close(
        @Ptr
        long connection,
        @Ptr
        long cancellable,
        @Ptr
        long callback,
        @Ptr
        long user_data);

    public void close(Pointer<GCancellable> cancellable, Pointer callback, Pointer user_data) {
        this.g_dbus_connection_close(Pointer.pointerTo(this, GDBusConnection.class).getPeer(), Pointer.getPeer(cancellable), Pointer.getPeer(callback), Pointer.getPeer(user_data));
    }

    protected native boolean g_dbus_connection_close_finish(
        @Ptr
        long connection,
        @Ptr
        long res);

    public boolean close_finish(Pointer<Object> res) {
        return this.g_dbus_connection_close_finish(Pointer.pointerTo(this, GDBusConnection.class).getPeer(), Pointer.getPeer(res));
    }

    protected native boolean g_dbus_connection_close_sync(
        @Ptr
        long connection,
        @Ptr
        long cancellable);

    public boolean close_sync(Pointer<GCancellable> cancellable) {
        return this.g_dbus_connection_close_sync(Pointer.pointerTo(this, GDBusConnection.class).getPeer(), Pointer.getPeer(cancellable));
    }

    protected native boolean g_dbus_connection_emit_signal(
        @Ptr
        long connection,
        @Ptr
        long destination_bus_name,
        @Ptr
        long object_path,
        @Ptr
        long interface_name,
        @Ptr
        long signal_name,
        @Ptr
        long parameters);

    public boolean emit_signal(Pointer destination_bus_name, Pointer object_path, Pointer interface_name, Pointer signal_name, Pointer<GVariant> parameters) {
        return this.g_dbus_connection_emit_signal(Pointer.pointerTo(this, GDBusConnection.class).getPeer(), Pointer.getPeer(destination_bus_name), Pointer.getPeer(object_path), Pointer.getPeer(interface_name), Pointer.getPeer(signal_name), Pointer.getPeer(parameters));
    }

    protected native long g_dbus_connection_export_action_group(
        @Ptr
        long connection,
        @Ptr
        long object_path,
        @Ptr
        long action_group);

    public long export_action_group(Pointer object_path, Pointer<Object> action_group) {
        return this.g_dbus_connection_export_action_group(Pointer.pointerTo(this, GDBusConnection.class).getPeer(), Pointer.getPeer(object_path), Pointer.getPeer(action_group));
    }

    protected native long g_dbus_connection_export_menu_model(
        @Ptr
        long connection,
        @Ptr
        long object_path,
        @Ptr
        long menu);

    public long export_menu_model(Pointer object_path, Pointer menu) {
        return this.g_dbus_connection_export_menu_model(Pointer.pointerTo(this, GDBusConnection.class).getPeer(), Pointer.getPeer(object_path), Pointer.getPeer(menu));
    }

    protected native void g_dbus_connection_flush(
        @Ptr
        long connection,
        @Ptr
        long cancellable,
        @Ptr
        long callback,
        @Ptr
        long user_data);

    public void flush(Pointer<GCancellable> cancellable, Pointer callback, Pointer user_data) {
        this.g_dbus_connection_flush(Pointer.pointerTo(this, GDBusConnection.class).getPeer(), Pointer.getPeer(cancellable), Pointer.getPeer(callback), Pointer.getPeer(user_data));
    }

    protected native boolean g_dbus_connection_flush_finish(
        @Ptr
        long connection,
        @Ptr
        long res);

    public boolean flush_finish(Pointer<Object> res) {
        return this.g_dbus_connection_flush_finish(Pointer.pointerTo(this, GDBusConnection.class).getPeer(), Pointer.getPeer(res));
    }

    protected native boolean g_dbus_connection_flush_sync(
        @Ptr
        long connection,
        @Ptr
        long cancellable);

    public boolean flush_sync(Pointer<GCancellable> cancellable) {
        return this.g_dbus_connection_flush_sync(Pointer.pointerTo(this, GDBusConnection.class).getPeer(), Pointer.getPeer(cancellable));
    }

    protected native IntValuedEnum<GDBusCapabilityFlags> g_dbus_connection_get_capabilities(
        @Ptr
        long connection);

    public IntValuedEnum<GDBusCapabilityFlags> get_capabilities() {
        return this.g_dbus_connection_get_capabilities(Pointer.pointerTo(this, GDBusConnection.class).getPeer());
    }

    protected native boolean g_dbus_connection_get_exit_on_close(
        @Ptr
        long connection);

    public boolean get_exit_on_close() {
        return this.g_dbus_connection_get_exit_on_close(Pointer.pointerTo(this, GDBusConnection.class).getPeer());
    }

    @Ptr
    protected native long g_dbus_connection_get_guid(
        @Ptr
        long connection);

    public Pointer get_guid() {
        return Pointer.pointerToAddress(this.g_dbus_connection_get_guid(Pointer.pointerTo(this, GDBusConnection.class).getPeer()));
    }

    protected native long g_dbus_connection_get_last_serial(
        @Ptr
        long connection);

    public long get_last_serial() {
        return this.g_dbus_connection_get_last_serial(Pointer.pointerTo(this, GDBusConnection.class).getPeer());
    }

    @Ptr
    protected native long g_dbus_connection_get_peer_credentials(
        @Ptr
        long connection);

    public Pointer<GCredentials> get_peer_credentials() {
        return Pointer.pointerToAddress(this.g_dbus_connection_get_peer_credentials(Pointer.pointerTo(this, GDBusConnection.class).getPeer()), GCredentials.class);
    }

    @Ptr
    protected native long g_dbus_connection_get_stream(
        @Ptr
        long connection);

    public Pointer get_stream() {
        return Pointer.pointerToAddress(this.g_dbus_connection_get_stream(Pointer.pointerTo(this, GDBusConnection.class).getPeer()));
    }

    @Ptr
    protected native long g_dbus_connection_get_unique_name(
        @Ptr
        long connection);

    public Pointer get_unique_name() {
        return Pointer.pointerToAddress(this.g_dbus_connection_get_unique_name(Pointer.pointerTo(this, GDBusConnection.class).getPeer()));
    }

    protected native boolean g_dbus_connection_is_closed(
        @Ptr
        long connection);

    public boolean is_closed() {
        return this.g_dbus_connection_is_closed(Pointer.pointerTo(this, GDBusConnection.class).getPeer());
    }

    protected native long g_dbus_connection_register_object(
        @Ptr
        long connection,
        @Ptr
        long object_path,
        @Ptr
        long interface_info,
        @Ptr
        long vtable,
        @Ptr
        long user_data,
        @Ptr
        long user_data_free_func);

    public long register_object(Pointer object_path, Pointer interface_info, Pointer vtable, Pointer user_data, Pointer user_data_free_func) {
        return this.g_dbus_connection_register_object(Pointer.pointerTo(this, GDBusConnection.class).getPeer(), Pointer.getPeer(object_path), Pointer.getPeer(interface_info), Pointer.getPeer(vtable), Pointer.getPeer(user_data), Pointer.getPeer(user_data_free_func));
    }

    protected native void g_dbus_connection_remove_filter(
        @Ptr
        long connection, long filter_id);

    public void remove_filter(long filter_id) {
        this.g_dbus_connection_remove_filter(Pointer.pointerTo(this, GDBusConnection.class).getPeer(), filter_id);
    }

    @Ptr
    protected native long g_dbus_connection_send_message_with_reply_finish(
        @Ptr
        long connection,
        @Ptr
        long res);

    public Pointer send_message_with_reply_finish(Pointer<Object> res) {
        return Pointer.pointerToAddress(this.g_dbus_connection_send_message_with_reply_finish(Pointer.pointerTo(this, GDBusConnection.class).getPeer(), Pointer.getPeer(res)));
    }

    protected native void g_dbus_connection_set_exit_on_close(
        @Ptr
        long connection, boolean exit_on_close);

    public void set_exit_on_close(boolean exit_on_close) {
        this.g_dbus_connection_set_exit_on_close(Pointer.pointerTo(this, GDBusConnection.class).getPeer(), exit_on_close);
    }

    protected native void g_dbus_connection_signal_unsubscribe(
        @Ptr
        long connection, long subscription_id);

    public void signal_unsubscribe(long subscription_id) {
        this.g_dbus_connection_signal_unsubscribe(Pointer.pointerTo(this, GDBusConnection.class).getPeer(), subscription_id);
    }

    protected native void g_dbus_connection_start_message_processing(
        @Ptr
        long connection);

    public void start_message_processing() {
        this.g_dbus_connection_start_message_processing(Pointer.pointerTo(this, GDBusConnection.class).getPeer());
    }

    protected native void g_dbus_connection_unexport_action_group(
        @Ptr
        long connection, long export_id);

    public void unexport_action_group(long export_id) {
        this.g_dbus_connection_unexport_action_group(Pointer.pointerTo(this, GDBusConnection.class).getPeer(), export_id);
    }

    protected native void g_dbus_connection_unexport_menu_model(
        @Ptr
        long connection, long export_id);

    public void unexport_menu_model(long export_id) {
        this.g_dbus_connection_unexport_menu_model(Pointer.pointerTo(this, GDBusConnection.class).getPeer(), export_id);
    }

    protected native boolean g_dbus_connection_unregister_object(
        @Ptr
        long connection, long registration_id);

    public boolean unregister_object(long registration_id) {
        return this.g_dbus_connection_unregister_object(Pointer.pointerTo(this, GDBusConnection.class).getPeer(), registration_id);
    }

    protected native boolean g_dbus_connection_unregister_subtree(
        @Ptr
        long connection, long registration_id);

    public boolean unregister_subtree(long registration_id) {
        return this.g_dbus_connection_unregister_subtree(Pointer.pointerTo(this, GDBusConnection.class).getPeer(), registration_id);
    }

    protected native long g_dbus_connection_add_filter(
        @Ptr
        long connection,
        @Ptr
        long filter_function,
        @Ptr
        long user_data,
        @Ptr
        long user_data_free_func);

    public long add_filter(Pointer filter_function, Pointer user_data, Pointer user_data_free_func) {
        return this.g_dbus_connection_add_filter(Pointer.pointerTo(this, GDBusConnection.class).getPeer(), Pointer.getPeer(filter_function), Pointer.getPeer(user_data), Pointer.getPeer(user_data_free_func));
    }

    protected native void g_dbus_connection_send_message_with_reply(
        @Ptr
        long connection,
        @Ptr
        long message, IntValuedEnum<GDBusSendMessageFlags> flags, int timeout_msec,
        @Ptr
        long out_serial,
        @Ptr
        long cancellable,
        @Ptr
        long callback,
        @Ptr
        long user_data);

    public void send_message_with_reply(Pointer<GDBusMessage> message, IntValuedEnum<GDBusSendMessageFlags> flags, int timeout_msec, Pointer<Long> out_serial, Pointer<GCancellable> cancellable, Pointer callback, Pointer user_data) {
        this.g_dbus_connection_send_message_with_reply(Pointer.pointerTo(this, GDBusConnection.class).getPeer(), Pointer.getPeer(message), flags, timeout_msec, Pointer.getPeer(out_serial), Pointer.getPeer(cancellable), Pointer.getPeer(callback), Pointer.getPeer(user_data));
    }

    protected native long g_dbus_connection_register_subtree(
        @Ptr
        long connection,
        @Ptr
        long object_path,
        @Ptr
        long vtable, IntValuedEnum<GDBusSubtreeFlags> flags,
        @Ptr
        long user_data,
        @Ptr
        long user_data_free_func);

    public long register_subtree(Pointer object_path, Pointer<GDBusSubtreeVTable> vtable, IntValuedEnum<GDBusSubtreeFlags> flags, Pointer user_data, Pointer user_data_free_func) {
        return this.g_dbus_connection_register_subtree(Pointer.pointerTo(this, GDBusConnection.class).getPeer(), Pointer.getPeer(object_path), Pointer.getPeer(vtable), flags, Pointer.getPeer(user_data), Pointer.getPeer(user_data_free_func));
    }

    @Ptr
    protected static native long g_dbus_connection_new_sync(
        @Ptr
        long stream,
        @Ptr
        long guid, IntValuedEnum<GDBusConnectionFlags> flags,
        @Ptr
        long observer,
        @Ptr
        long cancellable);

    public static Pointer<GDBusConnection> new_sync(Pointer<GIOStream> stream, Pointer guid, IntValuedEnum<GDBusConnectionFlags> flags, Pointer<GDBusAuthObserver> observer, Pointer<GCancellable> cancellable) {
        return Pointer.pointerToAddress(GDBusConnection.g_dbus_connection_new_sync(Pointer.getPeer(stream), Pointer.getPeer(guid), flags, Pointer.getPeer(observer), Pointer.getPeer(cancellable)), GDBusConnection.class);
    }

    protected static native void g_dbus_connection_new_for_address(
        @Ptr
        long address, IntValuedEnum<GDBusConnectionFlags> flags,
        @Ptr
        long observer,
        @Ptr
        long cancellable,
        @Ptr
        long callback,
        @Ptr
        long user_data);

    public static void new_for_address(Pointer address, IntValuedEnum<GDBusConnectionFlags> flags, Pointer<GDBusAuthObserver> observer, Pointer<GCancellable> cancellable, Pointer callback, Pointer user_data) {
        GDBusConnection.g_dbus_connection_new_for_address(Pointer.getPeer(address), flags, Pointer.getPeer(observer), Pointer.getPeer(cancellable), Pointer.getPeer(callback), Pointer.getPeer(user_data));
    }

    @Ptr
    protected static native long g_dbus_connection_new_for_address_sync(
        @Ptr
        long address, IntValuedEnum<GDBusConnectionFlags> flags,
        @Ptr
        long observer,
        @Ptr
        long cancellable);

    public static Pointer<GDBusConnection> new_for_address_sync(Pointer address, IntValuedEnum<GDBusConnectionFlags> flags, Pointer<GDBusAuthObserver> observer, Pointer<GCancellable> cancellable) {
        return Pointer.pointerToAddress(GDBusConnection.g_dbus_connection_new_for_address_sync(Pointer.getPeer(address), flags, Pointer.getPeer(observer), Pointer.getPeer(cancellable)), GDBusConnection.class);
    }

    protected native long g_dbus_connection_signal_subscribe(
        @Ptr
        long connection,
        @Ptr
        long sender,
        @Ptr
        long interface_name,
        @Ptr
        long member,
        @Ptr
        long object_path,
        @Ptr
        long arg0, IntValuedEnum<GDBusSignalFlags> flags,
        @Ptr
        long callback,
        @Ptr
        long user_data,
        @Ptr
        long user_data_free_func);

    public long signal_subscribe(Pointer sender, Pointer interface_name, Pointer member, Pointer object_path, Pointer arg0, IntValuedEnum<GDBusSignalFlags> flags, Pointer callback, Pointer user_data, Pointer user_data_free_func) {
        return this.g_dbus_connection_signal_subscribe(Pointer.pointerTo(this, GDBusConnection.class).getPeer(), Pointer.getPeer(sender), Pointer.getPeer(interface_name), Pointer.getPeer(member), Pointer.getPeer(object_path), Pointer.getPeer(arg0), flags, Pointer.getPeer(callback), Pointer.getPeer(user_data), Pointer.getPeer(user_data_free_func));
    }

    protected native boolean g_dbus_connection_send_message(
        @Ptr
        long connection,
        @Ptr
        long message, IntValuedEnum<GDBusSendMessageFlags> flags,
        @Ptr
        long out_serial);

    public boolean send_message(Pointer<GDBusMessage> message, IntValuedEnum<GDBusSendMessageFlags> flags, Pointer<Long> out_serial) {
        return this.g_dbus_connection_send_message(Pointer.pointerTo(this, GDBusConnection.class).getPeer(), Pointer.getPeer(message), flags, Pointer.getPeer(out_serial));
    }

    @Ptr
    protected native long g_dbus_connection_send_message_with_reply_sync(
        @Ptr
        long connection,
        @Ptr
        long message, IntValuedEnum<GDBusSendMessageFlags> flags, int timeout_msec,
        @Ptr
        long out_serial,
        @Ptr
        long cancellable);

    public Pointer<GDBusMessage> send_message_with_reply_sync(Pointer<GDBusMessage> message, IntValuedEnum<GDBusSendMessageFlags> flags, int timeout_msec, Pointer<Long> out_serial, Pointer<GCancellable> cancellable) {
        return Pointer.pointerToAddress(this.g_dbus_connection_send_message_with_reply_sync(Pointer.pointerTo(this, GDBusConnection.class).getPeer(), Pointer.getPeer(message), flags, timeout_msec, Pointer.getPeer(out_serial), Pointer.getPeer(cancellable)), GDBusMessage.class);
    }

    protected static native void g_dbus_connection_new(
        @Ptr
        long stream,
        @Ptr
        long guid, IntValuedEnum<GDBusConnectionFlags> flags,
        @Ptr
        long observer,
        @Ptr
        long cancellable,
        @Ptr
        long callback,
        @Ptr
        long user_data);

    public static void gdbusconnection__new(Pointer<GIOStream> stream, Pointer guid, IntValuedEnum<GDBusConnectionFlags> flags, Pointer<GDBusAuthObserver> observer, Pointer<GCancellable> cancellable, Pointer callback, Pointer user_data) {
        GDBusConnection.g_dbus_connection_new(Pointer.getPeer(stream), Pointer.getPeer(guid), flags, Pointer.getPeer(observer), Pointer.getPeer(cancellable), Pointer.getPeer(callback), Pointer.getPeer(user_data));
    }

}
