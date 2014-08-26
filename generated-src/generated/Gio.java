
package generated;

import generated.gio20.gio.GAppInfoCreateFlags;
import generated.gio20.gio.GAppLaunchContext;
import generated.gio20.gio.GBusNameOwnerFlags;
import generated.gio20.gio.GBusNameWatcherFlags;
import generated.gio20.gio.GBusType;
import generated.gio20.gio.GCancellable;
import generated.gio20.gio.GDBusAnnotationInfo;
import generated.gio20.gio.GDBusConnection;
import generated.gio20.gio.GDBusErrorEntry;
import generated.gio20.gio.GFileIOStream;
import generated.gio20.gio.GIOErrorEnum;
import generated.gio20.gio.GIOExtension;
import generated.gio20.gio.GIOExtensionPoint;
import generated.gio20.gio.GIOModuleScope;
import generated.gio20.gio.GIOStream;
import generated.gio20.gio.GInputStream;
import generated.gio20.gio.GOutputStream;
import generated.gio20.gio.GResource;
import generated.gio20.gio.GResourceLookupFlags;
import generated.gio20.gio.GSettingsSchemaSource;
import generated.gio20.gio.GTlsCertificate;
import generated.gio20.gio.GUnixMountEntry;
import generated.glib20.glib.GBytes;
import generated.glib20.glib.GError;
import generated.glib20.glib.GList;
import generated.glib20.glib.GSource;
import generated.glib20.glib.GVariant;
import generated.glib20.glib.GVariantType;
import generated.gobject20.gobject.GClosure;
import generated.gobject20.gobject.GObject;
import generated.gobject20.gobject.GParameter;
import generated.gobject20.gobject.GValue;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class Gio {


    static {
        BridJ.register();
    }

    protected static native boolean g_action_name_is_valid(
        @Ptr
        long action_name);

    public static boolean action_name_is_valid(Pointer action_name) {
        return Gio.g_action_name_is_valid(Pointer.getPeer(action_name));
    }

    protected static native boolean g_action_parse_detailed_name(
        @Ptr
        long detailed_name,
        @Ptr
        long action_name,
        @Ptr
        long target_value);

    public static boolean action_parse_detailed_name(Pointer detailed_name, Pointer action_name, Pointer<Pointer<GVariant>> target_value) {
        return Gio.g_action_parse_detailed_name(Pointer.getPeer(detailed_name), Pointer.getPeer(action_name), Pointer.getPeer(target_value));
    }

    @Ptr
    protected static native long g_action_print_detailed_name(
        @Ptr
        long action_name,
        @Ptr
        long target_value);

    public static Pointer action_print_detailed_name(Pointer action_name, Pointer<GVariant> target_value) {
        return Pointer.pointerToAddress(Gio.g_action_print_detailed_name(Pointer.getPeer(action_name), Pointer.getPeer(target_value)));
    }

    @Ptr
    protected static native long g_app_info_create_from_commandline(
        @Ptr
        long commandline,
        @Ptr
        long application_name, IntValuedEnum<GAppInfoCreateFlags> flags);

    public static Pointer<Object> app_info_create_from_commandline(Pointer commandline, Pointer application_name, IntValuedEnum<GAppInfoCreateFlags> flags) {
        return Pointer.pointerToAddress(Gio.g_app_info_create_from_commandline(Pointer.getPeer(commandline), Pointer.getPeer(application_name), flags), Object.class);
    }

    @Ptr
    protected static native long g_app_info_get_all();

    public static Pointer<GList> app_info_get_all() {
        return Pointer.pointerToAddress(Gio.g_app_info_get_all(), GList.class);
    }

    @Ptr
    protected static native long g_app_info_get_all_for_type(
        @Ptr
        long content_type);

    public static Pointer<GList> app_info_get_all_for_type(Pointer content_type) {
        return Pointer.pointerToAddress(Gio.g_app_info_get_all_for_type(Pointer.getPeer(content_type)), GList.class);
    }

    @Ptr
    protected static native long g_app_info_get_default_for_type(
        @Ptr
        long content_type, boolean must_support_uris);

    public static Pointer<Object> app_info_get_default_for_type(Pointer content_type, boolean must_support_uris) {
        return Pointer.pointerToAddress(Gio.g_app_info_get_default_for_type(Pointer.getPeer(content_type), must_support_uris), Object.class);
    }

    @Ptr
    protected static native long g_app_info_get_default_for_uri_scheme(
        @Ptr
        long uri_scheme);

    public static Pointer<Object> app_info_get_default_for_uri_scheme(Pointer uri_scheme) {
        return Pointer.pointerToAddress(Gio.g_app_info_get_default_for_uri_scheme(Pointer.getPeer(uri_scheme)), Object.class);
    }

    @Ptr
    protected static native long g_app_info_get_fallback_for_type(
        @Ptr
        long content_type);

    public static Pointer<GList> app_info_get_fallback_for_type(Pointer content_type) {
        return Pointer.pointerToAddress(Gio.g_app_info_get_fallback_for_type(Pointer.getPeer(content_type)), GList.class);
    }

    @Ptr
    protected static native long g_app_info_get_recommended_for_type(
        @Ptr
        long content_type);

    public static Pointer<GList> app_info_get_recommended_for_type(Pointer content_type) {
        return Pointer.pointerToAddress(Gio.g_app_info_get_recommended_for_type(Pointer.getPeer(content_type)), GList.class);
    }

    protected static native boolean g_app_info_launch_default_for_uri(
        @Ptr
        long uri,
        @Ptr
        long launch_context);

    public static boolean app_info_launch_default_for_uri(Pointer uri, Pointer<GAppLaunchContext> launch_context) {
        return Gio.g_app_info_launch_default_for_uri(Pointer.getPeer(uri), Pointer.getPeer(launch_context));
    }

    protected static native void g_app_info_reset_type_associations(
        @Ptr
        long content_type);

    public static void app_info_reset_type_associations(Pointer content_type) {
        Gio.g_app_info_reset_type_associations(Pointer.getPeer(content_type));
    }

    protected static native void g_async_initable_newv_async(long object_type, long n_parameters,
        @Ptr
        long parameters, int io_priority,
        @Ptr
        long cancellable,
        @Ptr
        long callback,
        @Ptr
        long user_data);

    public static void async_initable_newv_async(long object_type, long n_parameters, Pointer<GParameter> parameters, int io_priority, Pointer<GCancellable> cancellable, Pointer callback, Pointer user_data) {
        Gio.g_async_initable_newv_async(object_type, n_parameters, Pointer.getPeer(parameters), io_priority, Pointer.getPeer(cancellable), Pointer.getPeer(callback), Pointer.getPeer(user_data));
    }

    protected static native void g_bus_get(IntValuedEnum<GBusType> bus_type,
        @Ptr
        long cancellable,
        @Ptr
        long callback,
        @Ptr
        long user_data);

    public static void bus_get(IntValuedEnum<GBusType> bus_type, Pointer<GCancellable> cancellable, Pointer callback, Pointer user_data) {
        Gio.g_bus_get(bus_type, Pointer.getPeer(cancellable), Pointer.getPeer(callback), Pointer.getPeer(user_data));
    }

    @Ptr
    protected static native long g_bus_get_finish(
        @Ptr
        long res);

    public static Pointer<GDBusConnection> bus_get_finish(Pointer<Object> res) {
        return Pointer.pointerToAddress(Gio.g_bus_get_finish(Pointer.getPeer(res)), GDBusConnection.class);
    }

    @Ptr
    protected static native long g_bus_get_sync(IntValuedEnum<GBusType> bus_type,
        @Ptr
        long cancellable);

    public static Pointer<GDBusConnection> bus_get_sync(IntValuedEnum<GBusType> bus_type, Pointer<GCancellable> cancellable) {
        return Pointer.pointerToAddress(Gio.g_bus_get_sync(bus_type, Pointer.getPeer(cancellable)), GDBusConnection.class);
    }

    protected static native long g_bus_own_name(IntValuedEnum<GBusType> bus_type,
        @Ptr
        long name, IntValuedEnum<GBusNameOwnerFlags> flags,
        @Ptr
        long bus_acquired_handler,
        @Ptr
        long name_acquired_handler,
        @Ptr
        long name_lost_handler,
        @Ptr
        long user_data,
        @Ptr
        long user_data_free_func);

    public static long bus_own_name(IntValuedEnum<GBusType> bus_type, Pointer name, IntValuedEnum<GBusNameOwnerFlags> flags, Pointer bus_acquired_handler, Pointer name_acquired_handler, Pointer name_lost_handler, Pointer user_data, Pointer user_data_free_func) {
        return Gio.g_bus_own_name(bus_type, Pointer.getPeer(name), flags, Pointer.getPeer(bus_acquired_handler), Pointer.getPeer(name_acquired_handler), Pointer.getPeer(name_lost_handler), Pointer.getPeer(user_data), Pointer.getPeer(user_data_free_func));
    }

    protected static native long g_bus_own_name_on_connection(
        @Ptr
        long connection,
        @Ptr
        long name, IntValuedEnum<GBusNameOwnerFlags> flags,
        @Ptr
        long name_acquired_handler,
        @Ptr
        long name_lost_handler,
        @Ptr
        long user_data,
        @Ptr
        long user_data_free_func);

    public static long bus_own_name_on_connection(Pointer<GDBusConnection> connection, Pointer name, IntValuedEnum<GBusNameOwnerFlags> flags, Pointer name_acquired_handler, Pointer name_lost_handler, Pointer user_data, Pointer user_data_free_func) {
        return Gio.g_bus_own_name_on_connection(Pointer.getPeer(connection), Pointer.getPeer(name), flags, Pointer.getPeer(name_acquired_handler), Pointer.getPeer(name_lost_handler), Pointer.getPeer(user_data), Pointer.getPeer(user_data_free_func));
    }

    protected static native long g_bus_own_name_on_connection_with_closures(
        @Ptr
        long connection,
        @Ptr
        long name, IntValuedEnum<GBusNameOwnerFlags> flags,
        @Ptr
        long name_acquired_closure,
        @Ptr
        long name_lost_closure);

    public static long bus_own_name_on_connection_with_closures(Pointer<GDBusConnection> connection, Pointer name, IntValuedEnum<GBusNameOwnerFlags> flags, Pointer<GClosure> name_acquired_closure, Pointer<GClosure> name_lost_closure) {
        return Gio.g_bus_own_name_on_connection_with_closures(Pointer.getPeer(connection), Pointer.getPeer(name), flags, Pointer.getPeer(name_acquired_closure), Pointer.getPeer(name_lost_closure));
    }

    protected static native long g_bus_own_name_with_closures(IntValuedEnum<GBusType> bus_type,
        @Ptr
        long name, IntValuedEnum<GBusNameOwnerFlags> flags,
        @Ptr
        long bus_acquired_closure,
        @Ptr
        long name_acquired_closure,
        @Ptr
        long name_lost_closure);

    public static long bus_own_name_with_closures(IntValuedEnum<GBusType> bus_type, Pointer name, IntValuedEnum<GBusNameOwnerFlags> flags, Pointer<GClosure> bus_acquired_closure, Pointer<GClosure> name_acquired_closure, Pointer<GClosure> name_lost_closure) {
        return Gio.g_bus_own_name_with_closures(bus_type, Pointer.getPeer(name), flags, Pointer.getPeer(bus_acquired_closure), Pointer.getPeer(name_acquired_closure), Pointer.getPeer(name_lost_closure));
    }

    public static native void g_bus_unown_name(long owner_id);

    public static native void g_bus_unwatch_name(long watcher_id);

    protected static native long g_bus_watch_name(IntValuedEnum<GBusType> bus_type,
        @Ptr
        long name, IntValuedEnum<GBusNameWatcherFlags> flags,
        @Ptr
        long name_appeared_handler,
        @Ptr
        long name_vanished_handler,
        @Ptr
        long user_data,
        @Ptr
        long user_data_free_func);

    public static long bus_watch_name(IntValuedEnum<GBusType> bus_type, Pointer name, IntValuedEnum<GBusNameWatcherFlags> flags, Pointer name_appeared_handler, Pointer name_vanished_handler, Pointer user_data, Pointer user_data_free_func) {
        return Gio.g_bus_watch_name(bus_type, Pointer.getPeer(name), flags, Pointer.getPeer(name_appeared_handler), Pointer.getPeer(name_vanished_handler), Pointer.getPeer(user_data), Pointer.getPeer(user_data_free_func));
    }

    protected static native long g_bus_watch_name_on_connection(
        @Ptr
        long connection,
        @Ptr
        long name, IntValuedEnum<GBusNameWatcherFlags> flags,
        @Ptr
        long name_appeared_handler,
        @Ptr
        long name_vanished_handler,
        @Ptr
        long user_data,
        @Ptr
        long user_data_free_func);

    public static long bus_watch_name_on_connection(Pointer<GDBusConnection> connection, Pointer name, IntValuedEnum<GBusNameWatcherFlags> flags, Pointer name_appeared_handler, Pointer name_vanished_handler, Pointer user_data, Pointer user_data_free_func) {
        return Gio.g_bus_watch_name_on_connection(Pointer.getPeer(connection), Pointer.getPeer(name), flags, Pointer.getPeer(name_appeared_handler), Pointer.getPeer(name_vanished_handler), Pointer.getPeer(user_data), Pointer.getPeer(user_data_free_func));
    }

    protected static native long g_bus_watch_name_on_connection_with_closures(
        @Ptr
        long connection,
        @Ptr
        long name, IntValuedEnum<GBusNameWatcherFlags> flags,
        @Ptr
        long name_appeared_closure,
        @Ptr
        long name_vanished_closure);

    public static long bus_watch_name_on_connection_with_closures(Pointer<GDBusConnection> connection, Pointer name, IntValuedEnum<GBusNameWatcherFlags> flags, Pointer<GClosure> name_appeared_closure, Pointer<GClosure> name_vanished_closure) {
        return Gio.g_bus_watch_name_on_connection_with_closures(Pointer.getPeer(connection), Pointer.getPeer(name), flags, Pointer.getPeer(name_appeared_closure), Pointer.getPeer(name_vanished_closure));
    }

    protected static native long g_bus_watch_name_with_closures(IntValuedEnum<GBusType> bus_type,
        @Ptr
        long name, IntValuedEnum<GBusNameWatcherFlags> flags,
        @Ptr
        long name_appeared_closure,
        @Ptr
        long name_vanished_closure);

    public static long bus_watch_name_with_closures(IntValuedEnum<GBusType> bus_type, Pointer name, IntValuedEnum<GBusNameWatcherFlags> flags, Pointer<GClosure> name_appeared_closure, Pointer<GClosure> name_vanished_closure) {
        return Gio.g_bus_watch_name_with_closures(bus_type, Pointer.getPeer(name), flags, Pointer.getPeer(name_appeared_closure), Pointer.getPeer(name_vanished_closure));
    }

    protected static native boolean g_content_type_can_be_executable(
        @Ptr
        long type);

    public static boolean content_type_can_be_executable(Pointer type) {
        return Gio.g_content_type_can_be_executable(Pointer.getPeer(type));
    }

    protected static native boolean g_content_type_equals(
        @Ptr
        long type1,
        @Ptr
        long type2);

    public static boolean content_type_equals(Pointer type1, Pointer type2) {
        return Gio.g_content_type_equals(Pointer.getPeer(type1), Pointer.getPeer(type2));
    }

    @Ptr
    protected static native long g_content_type_from_mime_type(
        @Ptr
        long mime_type);

    public static Pointer content_type_from_mime_type(Pointer mime_type) {
        return Pointer.pointerToAddress(Gio.g_content_type_from_mime_type(Pointer.getPeer(mime_type)));
    }

    @Ptr
    protected static native long g_content_type_get_description(
        @Ptr
        long type);

    public static Pointer content_type_get_description(Pointer type) {
        return Pointer.pointerToAddress(Gio.g_content_type_get_description(Pointer.getPeer(type)));
    }

    @Ptr
    protected static native long g_content_type_get_generic_icon_name(
        @Ptr
        long type);

    public static Pointer content_type_get_generic_icon_name(Pointer type) {
        return Pointer.pointerToAddress(Gio.g_content_type_get_generic_icon_name(Pointer.getPeer(type)));
    }

    @Ptr
    protected static native long g_content_type_get_icon(
        @Ptr
        long type);

    public static Pointer<Object> content_type_get_icon(Pointer type) {
        return Pointer.pointerToAddress(Gio.g_content_type_get_icon(Pointer.getPeer(type)), Object.class);
    }

    @Ptr
    protected static native long g_content_type_get_mime_type(
        @Ptr
        long type);

    public static Pointer content_type_get_mime_type(Pointer type) {
        return Pointer.pointerToAddress(Gio.g_content_type_get_mime_type(Pointer.getPeer(type)));
    }

    @Ptr
    protected static native long g_content_type_get_symbolic_icon(
        @Ptr
        long type);

    public static Pointer<Object> content_type_get_symbolic_icon(Pointer type) {
        return Pointer.pointerToAddress(Gio.g_content_type_get_symbolic_icon(Pointer.getPeer(type)), Object.class);
    }

    @Ptr
    protected static native long g_content_type_guess(
        @Ptr
        long filename,
        @Ptr
        long data, long data_size,
        @Ptr
        long result_uncertain);

    public static Pointer content_type_guess(Pointer filename, Pointer<Short> data, long data_size, Pointer<Boolean> result_uncertain) {
        return Pointer.pointerToAddress(Gio.g_content_type_guess(Pointer.getPeer(filename), Pointer.getPeer(data), data_size, Pointer.getPeer(result_uncertain)));
    }

    @Ptr
    protected static native long g_content_type_guess_for_tree(
        @Ptr
        long root);

    public static Pointer content_type_guess_for_tree(Pointer<Object> root) {
        return Pointer.pointerToAddress(Gio.g_content_type_guess_for_tree(Pointer.getPeer(root)));
    }

    protected static native boolean g_content_type_is_a(
        @Ptr
        long type,
        @Ptr
        long supertype);

    public static boolean content_type_is_a(Pointer type, Pointer supertype) {
        return Gio.g_content_type_is_a(Pointer.getPeer(type), Pointer.getPeer(supertype));
    }

    protected static native boolean g_content_type_is_unknown(
        @Ptr
        long type);

    public static boolean content_type_is_unknown(Pointer type) {
        return Gio.g_content_type_is_unknown(Pointer.getPeer(type));
    }

    @Ptr
    protected static native long g_content_types_get_registered();

    public static Pointer<GList> content_types_get_registered() {
        return Pointer.pointerToAddress(Gio.g_content_types_get_registered(), GList.class);
    }

    @Ptr
    protected static native long g_dbus_address_escape_value(
        @Ptr
        long string);

    public static Pointer dbus_address_escape_value(Pointer string) {
        return Pointer.pointerToAddress(Gio.g_dbus_address_escape_value(Pointer.getPeer(string)));
    }

    @Ptr
    protected static native long g_dbus_address_get_for_bus_sync(IntValuedEnum<GBusType> bus_type,
        @Ptr
        long cancellable);

    public static Pointer dbus_address_get_for_bus_sync(IntValuedEnum<GBusType> bus_type, Pointer<GCancellable> cancellable) {
        return Pointer.pointerToAddress(Gio.g_dbus_address_get_for_bus_sync(bus_type, Pointer.getPeer(cancellable)));
    }

    protected static native void g_dbus_address_get_stream(
        @Ptr
        long address,
        @Ptr
        long cancellable,
        @Ptr
        long callback,
        @Ptr
        long user_data);

    public static void dbus_address_get_stream(Pointer address, Pointer<GCancellable> cancellable, Pointer callback, Pointer user_data) {
        Gio.g_dbus_address_get_stream(Pointer.getPeer(address), Pointer.getPeer(cancellable), Pointer.getPeer(callback), Pointer.getPeer(user_data));
    }

    @Ptr
    protected static native long g_dbus_address_get_stream_finish(
        @Ptr
        long res,
        @Ptr
        long out_guid);

    public static Pointer<GIOStream> dbus_address_get_stream_finish(Pointer<Object> res, Pointer out_guid) {
        return Pointer.pointerToAddress(Gio.g_dbus_address_get_stream_finish(Pointer.getPeer(res), Pointer.getPeer(out_guid)), GIOStream.class);
    }

    @Ptr
    protected static native long g_dbus_address_get_stream_sync(
        @Ptr
        long address,
        @Ptr
        long out_guid,
        @Ptr
        long cancellable);

    public static Pointer<GIOStream> dbus_address_get_stream_sync(Pointer address, Pointer out_guid, Pointer<GCancellable> cancellable) {
        return Pointer.pointerToAddress(Gio.g_dbus_address_get_stream_sync(Pointer.getPeer(address), Pointer.getPeer(out_guid), Pointer.getPeer(cancellable)), GIOStream.class);
    }

    @Ptr
    protected static native long g_dbus_annotation_info_lookup(
        @Ptr
        long annotations,
        @Ptr
        long name);

    public static Pointer dbus_annotation_info_lookup(Pointer<Pointer<GDBusAnnotationInfo>> annotations, Pointer name) {
        return Pointer.pointerToAddress(Gio.g_dbus_annotation_info_lookup(Pointer.getPeer(annotations), Pointer.getPeer(name)));
    }

    @Ptr
    protected static native long g_dbus_error_encode_gerror(
        @Ptr
        long error);

    public static Pointer dbus_error_encode_gerror(Pointer<GError> error) {
        return Pointer.pointerToAddress(Gio.g_dbus_error_encode_gerror(Pointer.getPeer(error)));
    }

    @Ptr
    protected static native long g_dbus_error_get_remote_error(
        @Ptr
        long error);

    public static Pointer dbus_error_get_remote_error(Pointer<GError> error) {
        return Pointer.pointerToAddress(Gio.g_dbus_error_get_remote_error(Pointer.getPeer(error)));
    }

    protected static native boolean g_dbus_error_is_remote_error(
        @Ptr
        long error);

    public static boolean dbus_error_is_remote_error(Pointer<GError> error) {
        return Gio.g_dbus_error_is_remote_error(Pointer.getPeer(error));
    }

    @Ptr
    protected static native long g_dbus_error_new_for_dbus_error(
        @Ptr
        long dbus_error_name,
        @Ptr
        long dbus_error_message);

    public static Pointer<GError> dbus_error_new_for_dbus_error(Pointer dbus_error_name, Pointer dbus_error_message) {
        return Pointer.pointerToAddress(Gio.g_dbus_error_new_for_dbus_error(Pointer.getPeer(dbus_error_name), Pointer.getPeer(dbus_error_message)), GError.class);
    }

    public static native long g_dbus_error_quark();

    protected static native boolean g_dbus_error_register_error(long error_domain, int error_code,
        @Ptr
        long dbus_error_name);

    public static boolean dbus_error_register_error(long error_domain, int error_code, Pointer dbus_error_name) {
        return Gio.g_dbus_error_register_error(error_domain, error_code, Pointer.getPeer(dbus_error_name));
    }

    protected static native void g_dbus_error_register_error_domain(
        @Ptr
        long error_domain_quark_name,
        @Ptr
        long quark_volatile,
        @Ptr
        long entries, long num_entries);

    public static void dbus_error_register_error_domain(Pointer error_domain_quark_name, Pointer<Long> quark_volatile, Pointer<GDBusErrorEntry> entries, long num_entries) {
        Gio.g_dbus_error_register_error_domain(Pointer.getPeer(error_domain_quark_name), Pointer.getPeer(quark_volatile), Pointer.getPeer(entries), num_entries);
    }

    protected static native boolean g_dbus_error_strip_remote_error(
        @Ptr
        long error);

    public static boolean dbus_error_strip_remote_error(Pointer<GError> error) {
        return Gio.g_dbus_error_strip_remote_error(Pointer.getPeer(error));
    }

    protected static native boolean g_dbus_error_unregister_error(long error_domain, int error_code,
        @Ptr
        long dbus_error_name);

    public static boolean dbus_error_unregister_error(long error_domain, int error_code, Pointer dbus_error_name) {
        return Gio.g_dbus_error_unregister_error(error_domain, error_code, Pointer.getPeer(dbus_error_name));
    }

    @Ptr
    protected static native long g_dbus_generate_guid();

    public static Pointer dbus_generate_guid() {
        return Pointer.pointerToAddress(Gio.g_dbus_generate_guid());
    }

    @Ptr
    protected static native long g_dbus_gvalue_to_gvariant(
        @Ptr
        long gvalue,
        @Ptr
        long type);

    public static Pointer<GVariant> dbus_gvalue_to_gvariant(Pointer<GValue> gvalue, Pointer<GVariantType> type) {
        return Pointer.pointerToAddress(Gio.g_dbus_gvalue_to_gvariant(Pointer.getPeer(gvalue), Pointer.getPeer(type)), GVariant.class);
    }

    protected static native void g_dbus_gvariant_to_gvalue(
        @Ptr
        long value,
        @Ptr
        long out_gvalue);

    public static void dbus_gvariant_to_gvalue(Pointer<GVariant> value, Pointer<GValue> out_gvalue) {
        Gio.g_dbus_gvariant_to_gvalue(Pointer.getPeer(value), Pointer.getPeer(out_gvalue));
    }

    protected static native boolean g_dbus_is_address(
        @Ptr
        long string);

    public static boolean dbus_is_address(Pointer string) {
        return Gio.g_dbus_is_address(Pointer.getPeer(string));
    }

    protected static native boolean g_dbus_is_guid(
        @Ptr
        long string);

    public static boolean dbus_is_guid(Pointer string) {
        return Gio.g_dbus_is_guid(Pointer.getPeer(string));
    }

    protected static native boolean g_dbus_is_interface_name(
        @Ptr
        long string);

    public static boolean dbus_is_interface_name(Pointer string) {
        return Gio.g_dbus_is_interface_name(Pointer.getPeer(string));
    }

    protected static native boolean g_dbus_is_member_name(
        @Ptr
        long string);

    public static boolean dbus_is_member_name(Pointer string) {
        return Gio.g_dbus_is_member_name(Pointer.getPeer(string));
    }

    protected static native boolean g_dbus_is_name(
        @Ptr
        long string);

    public static boolean dbus_is_name(Pointer string) {
        return Gio.g_dbus_is_name(Pointer.getPeer(string));
    }

    protected static native boolean g_dbus_is_supported_address(
        @Ptr
        long string);

    public static boolean dbus_is_supported_address(Pointer string) {
        return Gio.g_dbus_is_supported_address(Pointer.getPeer(string));
    }

    protected static native boolean g_dbus_is_unique_name(
        @Ptr
        long string);

    public static boolean dbus_is_unique_name(Pointer string) {
        return Gio.g_dbus_is_unique_name(Pointer.getPeer(string));
    }

    @Ptr
    protected static native long g_file_new_for_commandline_arg(
        @Ptr
        long arg);

    public static Pointer<Object> file_new_for_commandline_arg(Pointer arg) {
        return Pointer.pointerToAddress(Gio.g_file_new_for_commandline_arg(Pointer.getPeer(arg)), Object.class);
    }

    @Ptr
    protected static native long g_file_new_for_commandline_arg_and_cwd(
        @Ptr
        long arg,
        @Ptr
        long cwd);

    public static Pointer<Object> file_new_for_commandline_arg_and_cwd(Pointer arg, Pointer cwd) {
        return Pointer.pointerToAddress(Gio.g_file_new_for_commandline_arg_and_cwd(Pointer.getPeer(arg), Pointer.getPeer(cwd)), Object.class);
    }

    @Ptr
    protected static native long g_file_new_for_path(
        @Ptr
        long path);

    public static Pointer<Object> file_new_for_path(Pointer path) {
        return Pointer.pointerToAddress(Gio.g_file_new_for_path(Pointer.getPeer(path)), Object.class);
    }

    @Ptr
    protected static native long g_file_new_for_uri(
        @Ptr
        long uri);

    public static Pointer<Object> file_new_for_uri(Pointer uri) {
        return Pointer.pointerToAddress(Gio.g_file_new_for_uri(Pointer.getPeer(uri)), Object.class);
    }

    @Ptr
    protected static native long g_file_new_tmp(
        @Ptr
        long tmpl,
        @Ptr
        long iostream);

    public static Pointer<Object> file_new_tmp(Pointer tmpl, Pointer<Pointer<GFileIOStream>> iostream) {
        return Pointer.pointerToAddress(Gio.g_file_new_tmp(Pointer.getPeer(tmpl), Pointer.getPeer(iostream)), Object.class);
    }

    @Ptr
    protected static native long g_file_parse_name(
        @Ptr
        long parse_name);

    public static Pointer<Object> file_parse_name(Pointer parse_name) {
        return Pointer.pointerToAddress(Gio.g_file_parse_name(Pointer.getPeer(parse_name)), Object.class);
    }

    @Ptr
    protected static native long g_icon_deserialize(
        @Ptr
        long value);

    public static Pointer<Object> icon_deserialize(Pointer<GVariant> value) {
        return Pointer.pointerToAddress(Gio.g_icon_deserialize(Pointer.getPeer(value)), Object.class);
    }

    protected static native long g_icon_hash(
        @Ptr
        long icon);

    public static long icon_hash(Pointer icon) {
        return Gio.g_icon_hash(Pointer.getPeer(icon));
    }

    @Ptr
    protected static native long g_icon_new_for_string(
        @Ptr
        long str);

    public static Pointer<Object> icon_new_for_string(Pointer str) {
        return Pointer.pointerToAddress(Gio.g_icon_new_for_string(Pointer.getPeer(str)), Object.class);
    }

    @Ptr
    protected static native long g_initable_newv(long object_type, long n_parameters,
        @Ptr
        long parameters,
        @Ptr
        long cancellable);

    public static Pointer<GObject> initable_newv(long object_type, long n_parameters, Pointer<GParameter> parameters, Pointer<GCancellable> cancellable) {
        return Pointer.pointerToAddress(Gio.g_initable_newv(object_type, n_parameters, Pointer.getPeer(parameters), Pointer.getPeer(cancellable)), GObject.class);
    }

    public static native IntValuedEnum<GIOErrorEnum> g_io_error_from_errno(int err_no);

    public static native long g_io_error_quark();

    @Ptr
    protected static native long g_io_extension_point_implement(
        @Ptr
        long extension_point_name, long type,
        @Ptr
        long extension_name, int priority);

    public static Pointer<GIOExtension> io_extension_point_implement(Pointer extension_point_name, long type, Pointer extension_name, int priority) {
        return Pointer.pointerToAddress(Gio.g_io_extension_point_implement(Pointer.getPeer(extension_point_name), type, Pointer.getPeer(extension_name), priority), GIOExtension.class);
    }

    @Ptr
    protected static native long g_io_extension_point_lookup(
        @Ptr
        long name);

    public static Pointer<GIOExtensionPoint> io_extension_point_lookup(Pointer name) {
        return Pointer.pointerToAddress(Gio.g_io_extension_point_lookup(Pointer.getPeer(name)), GIOExtensionPoint.class);
    }

    @Ptr
    protected static native long g_io_extension_point_register(
        @Ptr
        long name);

    public static Pointer<GIOExtensionPoint> io_extension_point_register(Pointer name) {
        return Pointer.pointerToAddress(Gio.g_io_extension_point_register(Pointer.getPeer(name)), GIOExtensionPoint.class);
    }

    @Ptr
    protected static native long g_io_modules_load_all_in_directory(
        @Ptr
        long dirname);

    public static Pointer<GList> io_modules_load_all_in_directory(Pointer dirname) {
        return Pointer.pointerToAddress(Gio.g_io_modules_load_all_in_directory(Pointer.getPeer(dirname)), GList.class);
    }

    @Ptr
    protected static native long g_io_modules_load_all_in_directory_with_scope(
        @Ptr
        long dirname,
        @Ptr
        long scope);

    public static Pointer<GList> io_modules_load_all_in_directory_with_scope(Pointer dirname, Pointer<GIOModuleScope> scope) {
        return Pointer.pointerToAddress(Gio.g_io_modules_load_all_in_directory_with_scope(Pointer.getPeer(dirname), Pointer.getPeer(scope)), GList.class);
    }

    protected static native void g_io_modules_scan_all_in_directory(
        @Ptr
        long dirname);

    public static void io_modules_scan_all_in_directory(Pointer dirname) {
        Gio.g_io_modules_scan_all_in_directory(Pointer.getPeer(dirname));
    }

    protected static native void g_io_modules_scan_all_in_directory_with_scope(
        @Ptr
        long dirname,
        @Ptr
        long scope);

    public static void io_modules_scan_all_in_directory_with_scope(Pointer dirname, Pointer<GIOModuleScope> scope) {
        Gio.g_io_modules_scan_all_in_directory_with_scope(Pointer.getPeer(dirname), Pointer.getPeer(scope));
    }

    public static native void g_io_scheduler_cancel_all_jobs();

    protected static native void g_io_scheduler_push_job(
        @Ptr
        long job_func,
        @Ptr
        long user_data,
        @Ptr
        long notify, int io_priority,
        @Ptr
        long cancellable);

    public static void io_scheduler_push_job(Pointer job_func, Pointer user_data, Pointer notify, int io_priority, Pointer<GCancellable> cancellable) {
        Gio.g_io_scheduler_push_job(Pointer.getPeer(job_func), Pointer.getPeer(user_data), Pointer.getPeer(notify), io_priority, Pointer.getPeer(cancellable));
    }

    @Ptr
    protected static native long g_network_monitor_get_default();

    public static Pointer<Object> network_monitor_get_default() {
        return Pointer.pointerToAddress(Gio.g_network_monitor_get_default(), Object.class);
    }

    public static native void g_networking_init();

    @Ptr
    protected static native long g_pollable_source_new(
        @Ptr
        long pollable_stream);

    public static Pointer<GSource> pollable_source_new(Pointer<GObject> pollable_stream) {
        return Pointer.pointerToAddress(Gio.g_pollable_source_new(Pointer.getPeer(pollable_stream)), GSource.class);
    }

    @Ptr
    protected static native long g_pollable_source_new_full(
        @Ptr
        long pollable_stream,
        @Ptr
        long child_source,
        @Ptr
        long cancellable);

    public static Pointer<GSource> pollable_source_new_full(Pointer<GObject> pollable_stream, Pointer<GSource> child_source, Pointer<GCancellable> cancellable) {
        return Pointer.pointerToAddress(Gio.g_pollable_source_new_full(Pointer.getPeer(pollable_stream), Pointer.getPeer(child_source), Pointer.getPeer(cancellable)), GSource.class);
    }

    protected static native long g_pollable_stream_read(
        @Ptr
        long stream,
        @Ptr
        long buffer, long count, boolean blocking,
        @Ptr
        long cancellable);

    public static long pollable_stream_read(Pointer<GInputStream> stream, Pointer buffer, long count, boolean blocking, Pointer<GCancellable> cancellable) {
        return Gio.g_pollable_stream_read(Pointer.getPeer(stream), Pointer.getPeer(buffer), count, blocking, Pointer.getPeer(cancellable));
    }

    protected static native long g_pollable_stream_write(
        @Ptr
        long stream,
        @Ptr
        long buffer, long count, boolean blocking,
        @Ptr
        long cancellable);

    public static long pollable_stream_write(Pointer<GOutputStream> stream, Pointer<Short> buffer, long count, boolean blocking, Pointer<GCancellable> cancellable) {
        return Gio.g_pollable_stream_write(Pointer.getPeer(stream), Pointer.getPeer(buffer), count, blocking, Pointer.getPeer(cancellable));
    }

    protected static native boolean g_pollable_stream_write_all(
        @Ptr
        long stream,
        @Ptr
        long buffer, long count, boolean blocking,
        @Ptr
        long bytes_written,
        @Ptr
        long cancellable);

    public static boolean pollable_stream_write_all(Pointer<GOutputStream> stream, Pointer<Short> buffer, long count, boolean blocking, Pointer<Long> bytes_written, Pointer<GCancellable> cancellable) {
        return Gio.g_pollable_stream_write_all(Pointer.getPeer(stream), Pointer.getPeer(buffer), count, blocking, Pointer.getPeer(bytes_written), Pointer.getPeer(cancellable));
    }

    @Ptr
    protected static native long g_proxy_get_default_for_protocol(
        @Ptr
        long protocol);

    public static Pointer<Object> proxy_get_default_for_protocol(Pointer protocol) {
        return Pointer.pointerToAddress(Gio.g_proxy_get_default_for_protocol(Pointer.getPeer(protocol)), Object.class);
    }

    @Ptr
    protected static native long g_proxy_resolver_get_default();

    public static Pointer<Object> proxy_resolver_get_default() {
        return Pointer.pointerToAddress(Gio.g_proxy_resolver_get_default(), Object.class);
    }

    public static native long g_resolver_error_quark();

    public static native long g_resource_error_quark();

    @Ptr
    protected static native long g_resource_load(
        @Ptr
        long filename);

    public static Pointer<GResource> resource_load(Pointer filename) {
        return Pointer.pointerToAddress(Gio.g_resource_load(Pointer.getPeer(filename)), GResource.class);
    }

    @Ptr
    protected static native long g_resources_enumerate_children(
        @Ptr
        long path, IntValuedEnum<GResourceLookupFlags> lookup_flags);

    public static Pointer resources_enumerate_children(Pointer path, IntValuedEnum<GResourceLookupFlags> lookup_flags) {
        return Pointer.pointerToAddress(Gio.g_resources_enumerate_children(Pointer.getPeer(path), lookup_flags));
    }

    protected static native boolean g_resources_get_info(
        @Ptr
        long path, IntValuedEnum<GResourceLookupFlags> lookup_flags,
        @Ptr
        long size,
        @Ptr
        long flags);

    public static boolean resources_get_info(Pointer path, IntValuedEnum<GResourceLookupFlags> lookup_flags, Pointer<Long> size, Pointer<Long> flags) {
        return Gio.g_resources_get_info(Pointer.getPeer(path), lookup_flags, Pointer.getPeer(size), Pointer.getPeer(flags));
    }

    @Ptr
    protected static native long g_resources_lookup_data(
        @Ptr
        long path, IntValuedEnum<GResourceLookupFlags> lookup_flags);

    public static Pointer<GBytes> resources_lookup_data(Pointer path, IntValuedEnum<GResourceLookupFlags> lookup_flags) {
        return Pointer.pointerToAddress(Gio.g_resources_lookup_data(Pointer.getPeer(path), lookup_flags), GBytes.class);
    }

    @Ptr
    protected static native long g_resources_open_stream(
        @Ptr
        long path, IntValuedEnum<GResourceLookupFlags> lookup_flags);

    public static Pointer<GInputStream> resources_open_stream(Pointer path, IntValuedEnum<GResourceLookupFlags> lookup_flags) {
        return Pointer.pointerToAddress(Gio.g_resources_open_stream(Pointer.getPeer(path), lookup_flags), GInputStream.class);
    }

    protected static native void g_resources_register(
        @Ptr
        long resource);

    public static void resources_register(Pointer<GResource> resource) {
        Gio.g_resources_register(Pointer.getPeer(resource));
    }

    protected static native void g_resources_unregister(
        @Ptr
        long resource);

    public static void resources_unregister(Pointer<GResource> resource) {
        Gio.g_resources_unregister(Pointer.getPeer(resource));
    }

    @Ptr
    protected static native long g_settings_schema_source_get_default();

    public static Pointer<GSettingsSchemaSource> settings_schema_source_get_default() {
        return Pointer.pointerToAddress(Gio.g_settings_schema_source_get_default(), GSettingsSchemaSource.class);
    }

    protected static native void g_simple_async_report_error_in_idle(
        @Ptr
        long object,
        @Ptr
        long callback,
        @Ptr
        long user_data, long domain, int code,
        @Ptr
        long format, Object... varargs);

    public static void simple_async_report_error_in_idle(Pointer<GObject> object, Pointer callback, Pointer user_data, long domain, int code, Pointer format, Object... varargs) {
        Gio.g_simple_async_report_error_in_idle(Pointer.getPeer(object), Pointer.getPeer(callback), Pointer.getPeer(user_data), domain, code, Pointer.getPeer(format), varargs);
    }

    protected static native void g_simple_async_report_gerror_in_idle(
        @Ptr
        long object,
        @Ptr
        long callback,
        @Ptr
        long user_data,
        @Ptr
        long error);

    public static void simple_async_report_gerror_in_idle(Pointer<GObject> object, Pointer callback, Pointer user_data, Pointer<GError> error) {
        Gio.g_simple_async_report_gerror_in_idle(Pointer.getPeer(object), Pointer.getPeer(callback), Pointer.getPeer(user_data), Pointer.getPeer(error));
    }

    protected static native void g_simple_async_report_take_gerror_in_idle(
        @Ptr
        long object,
        @Ptr
        long callback,
        @Ptr
        long user_data,
        @Ptr
        long error);

    public static void simple_async_report_take_gerror_in_idle(Pointer<GObject> object, Pointer callback, Pointer user_data, Pointer<GError> error) {
        Gio.g_simple_async_report_take_gerror_in_idle(Pointer.getPeer(object), Pointer.getPeer(callback), Pointer.getPeer(user_data), Pointer.getPeer(error));
    }

    @Ptr
    protected static native long g_srv_target_list_sort(
        @Ptr
        long targets);

    public static Pointer<GList> srv_target_list_sort(Pointer<GList> targets) {
        return Pointer.pointerToAddress(Gio.g_srv_target_list_sort(Pointer.getPeer(targets)), GList.class);
    }

    @Ptr
    protected static native long g_tls_backend_get_default();

    public static Pointer<Object> tls_backend_get_default() {
        return Pointer.pointerToAddress(Gio.g_tls_backend_get_default(), Object.class);
    }

    @Ptr
    protected static native long g_tls_client_connection_new(
        @Ptr
        long base_io_stream,
        @Ptr
        long server_identity);

    public static Pointer<Object> tls_client_connection_new(Pointer<GIOStream> base_io_stream, Pointer<Object> server_identity) {
        return Pointer.pointerToAddress(Gio.g_tls_client_connection_new(Pointer.getPeer(base_io_stream), Pointer.getPeer(server_identity)), Object.class);
    }

    public static native long g_tls_error_quark();

    @Ptr
    protected static native long g_tls_file_database_new(
        @Ptr
        long anchors);

    public static Pointer<Object> tls_file_database_new(Pointer anchors) {
        return Pointer.pointerToAddress(Gio.g_tls_file_database_new(Pointer.getPeer(anchors)), Object.class);
    }

    @Ptr
    protected static native long g_tls_server_connection_new(
        @Ptr
        long base_io_stream,
        @Ptr
        long certificate);

    public static Pointer<Object> tls_server_connection_new(Pointer<GIOStream> base_io_stream, Pointer<GTlsCertificate> certificate) {
        return Pointer.pointerToAddress(Gio.g_tls_server_connection_new(Pointer.getPeer(base_io_stream), Pointer.getPeer(certificate)), Object.class);
    }

    protected static native boolean g_unix_is_mount_path_system_internal(
        @Ptr
        long mount_path);

    public static boolean unix_is_mount_path_system_internal(Pointer mount_path) {
        return Gio.g_unix_is_mount_path_system_internal(Pointer.getPeer(mount_path));
    }

    @Ptr
    protected static native long g_unix_mount_at(
        @Ptr
        long mount_path,
        @Ptr
        long time_read);

    public static Pointer<GUnixMountEntry> unix_mount_at(Pointer mount_path, Pointer<Long> time_read) {
        return Pointer.pointerToAddress(Gio.g_unix_mount_at(Pointer.getPeer(mount_path), Pointer.getPeer(time_read)), GUnixMountEntry.class);
    }

    protected static native int g_unix_mount_compare(
        @Ptr
        long mount1,
        @Ptr
        long mount2);

    public static int unix_mount_compare(Pointer<GUnixMountEntry> mount1, Pointer<GUnixMountEntry> mount2) {
        return Gio.g_unix_mount_compare(Pointer.getPeer(mount1), Pointer.getPeer(mount2));
    }

    protected static native void g_unix_mount_free(
        @Ptr
        long mount_entry);

    public static void unix_mount_free(Pointer<GUnixMountEntry> mount_entry) {
        Gio.g_unix_mount_free(Pointer.getPeer(mount_entry));
    }

    @Ptr
    protected static native long g_unix_mount_get_device_path(
        @Ptr
        long mount_entry);

    public static Pointer unix_mount_get_device_path(Pointer<GUnixMountEntry> mount_entry) {
        return Pointer.pointerToAddress(Gio.g_unix_mount_get_device_path(Pointer.getPeer(mount_entry)));
    }

    @Ptr
    protected static native long g_unix_mount_get_fs_type(
        @Ptr
        long mount_entry);

    public static Pointer unix_mount_get_fs_type(Pointer<GUnixMountEntry> mount_entry) {
        return Pointer.pointerToAddress(Gio.g_unix_mount_get_fs_type(Pointer.getPeer(mount_entry)));
    }

    @Ptr
    protected static native long g_unix_mount_get_mount_path(
        @Ptr
        long mount_entry);

    public static Pointer unix_mount_get_mount_path(Pointer<GUnixMountEntry> mount_entry) {
        return Pointer.pointerToAddress(Gio.g_unix_mount_get_mount_path(Pointer.getPeer(mount_entry)));
    }

    protected static native boolean g_unix_mount_guess_can_eject(
        @Ptr
        long mount_entry);

    public static boolean unix_mount_guess_can_eject(Pointer<GUnixMountEntry> mount_entry) {
        return Gio.g_unix_mount_guess_can_eject(Pointer.getPeer(mount_entry));
    }

    @Ptr
    protected static native long g_unix_mount_guess_icon(
        @Ptr
        long mount_entry);

    public static Pointer<Object> unix_mount_guess_icon(Pointer<GUnixMountEntry> mount_entry) {
        return Pointer.pointerToAddress(Gio.g_unix_mount_guess_icon(Pointer.getPeer(mount_entry)), Object.class);
    }

    @Ptr
    protected static native long g_unix_mount_guess_name(
        @Ptr
        long mount_entry);

    public static Pointer unix_mount_guess_name(Pointer<GUnixMountEntry> mount_entry) {
        return Pointer.pointerToAddress(Gio.g_unix_mount_guess_name(Pointer.getPeer(mount_entry)));
    }

    protected static native boolean g_unix_mount_guess_should_display(
        @Ptr
        long mount_entry);

    public static boolean unix_mount_guess_should_display(Pointer<GUnixMountEntry> mount_entry) {
        return Gio.g_unix_mount_guess_should_display(Pointer.getPeer(mount_entry));
    }

    @Ptr
    protected static native long g_unix_mount_guess_symbolic_icon(
        @Ptr
        long mount_entry);

    public static Pointer<Object> unix_mount_guess_symbolic_icon(Pointer<GUnixMountEntry> mount_entry) {
        return Pointer.pointerToAddress(Gio.g_unix_mount_guess_symbolic_icon(Pointer.getPeer(mount_entry)), Object.class);
    }

    protected static native boolean g_unix_mount_is_readonly(
        @Ptr
        long mount_entry);

    public static boolean unix_mount_is_readonly(Pointer<GUnixMountEntry> mount_entry) {
        return Gio.g_unix_mount_is_readonly(Pointer.getPeer(mount_entry));
    }

    protected static native boolean g_unix_mount_is_system_internal(
        @Ptr
        long mount_entry);

    public static boolean unix_mount_is_system_internal(Pointer<GUnixMountEntry> mount_entry) {
        return Gio.g_unix_mount_is_system_internal(Pointer.getPeer(mount_entry));
    }

    public static native boolean g_unix_mount_points_changed_since(long time);

    @Ptr
    protected static native long g_unix_mount_points_get(
        @Ptr
        long time_read);

    public static Pointer<GList> unix_mount_points_get(Pointer<Long> time_read) {
        return Pointer.pointerToAddress(Gio.g_unix_mount_points_get(Pointer.getPeer(time_read)), GList.class);
    }

    public static native boolean g_unix_mounts_changed_since(long time);

    @Ptr
    protected static native long g_unix_mounts_get(
        @Ptr
        long time_read);

    public static Pointer<GList> unix_mounts_get(Pointer<Long> time_read) {
        return Pointer.pointerToAddress(Gio.g_unix_mounts_get(Pointer.getPeer(time_read)), GList.class);
    }

}
