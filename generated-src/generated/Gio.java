
package generated;

import generated.gio20.gio.GAppLaunchContext;
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
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Ptr;

public class Gio {


    protected native boolean g_action_name_is_valid(
        @Ptr
        long action_name);

    public boolean action_name_is_valid(Pointer action_name) {
        return this.g_action_name_is_valid(Pointer.getPeer(action_name));
    }

    protected native boolean g_action_parse_detailed_name(
        @Ptr
        long detailed_name,
        @Ptr
        long action_name,
        @Ptr
        long target_value);

    public boolean action_parse_detailed_name(Pointer detailed_name, Pointer action_name, Pointer<Pointer<GVariant>> target_value) {
        return this.g_action_parse_detailed_name(Pointer.getPeer(detailed_name), Pointer.getPeer(action_name), Pointer.getPeer(target_value));
    }

    @Ptr
    protected native long g_action_print_detailed_name(
        @Ptr
        long action_name,
        @Ptr
        long target_value);

    public Pointer action_print_detailed_name(Pointer action_name, Pointer<GVariant> target_value) {
        return Pointer.pointerToAddress(this.g_action_print_detailed_name(Pointer.getPeer(action_name), Pointer.getPeer(target_value)));
    }

    @Ptr
    protected native long g_app_info_create_from_commandline(
        @Ptr
        long commandline,
        @Ptr
        long application_name, Object flags);

    public Pointer<Object> app_info_create_from_commandline(Pointer commandline, Pointer application_name, Object flags) {
        return Pointer.pointerToAddress(this.g_app_info_create_from_commandline(Pointer.getPeer(commandline), Pointer.getPeer(application_name), flags), Pointer.class);
    }

    @Ptr
    protected native long g_app_info_get_all();

    public Pointer<GList> app_info_get_all() {
        return Pointer.pointerToAddress(this.g_app_info_get_all(), Pointer.class);
    }

    @Ptr
    protected native long g_app_info_get_all_for_type(
        @Ptr
        long content_type);

    public Pointer<GList> app_info_get_all_for_type(Pointer content_type) {
        return Pointer.pointerToAddress(this.g_app_info_get_all_for_type(Pointer.getPeer(content_type)), Pointer.class);
    }

    @Ptr
    protected native long g_app_info_get_default_for_type(
        @Ptr
        long content_type, boolean must_support_uris);

    public Pointer<Object> app_info_get_default_for_type(Pointer content_type, boolean must_support_uris) {
        return Pointer.pointerToAddress(this.g_app_info_get_default_for_type(Pointer.getPeer(content_type), must_support_uris), Pointer.class);
    }

    @Ptr
    protected native long g_app_info_get_default_for_uri_scheme(
        @Ptr
        long uri_scheme);

    public Pointer<Object> app_info_get_default_for_uri_scheme(Pointer uri_scheme) {
        return Pointer.pointerToAddress(this.g_app_info_get_default_for_uri_scheme(Pointer.getPeer(uri_scheme)), Pointer.class);
    }

    @Ptr
    protected native long g_app_info_get_fallback_for_type(
        @Ptr
        long content_type);

    public Pointer<GList> app_info_get_fallback_for_type(Pointer content_type) {
        return Pointer.pointerToAddress(this.g_app_info_get_fallback_for_type(Pointer.getPeer(content_type)), Pointer.class);
    }

    @Ptr
    protected native long g_app_info_get_recommended_for_type(
        @Ptr
        long content_type);

    public Pointer<GList> app_info_get_recommended_for_type(Pointer content_type) {
        return Pointer.pointerToAddress(this.g_app_info_get_recommended_for_type(Pointer.getPeer(content_type)), Pointer.class);
    }

    protected native boolean g_app_info_launch_default_for_uri(
        @Ptr
        long uri,
        @Ptr
        long launch_context);

    public boolean app_info_launch_default_for_uri(Pointer uri, Pointer<GAppLaunchContext> launch_context) {
        return this.g_app_info_launch_default_for_uri(Pointer.getPeer(uri), Pointer.getPeer(launch_context));
    }

    protected native void g_app_info_reset_type_associations(
        @Ptr
        long content_type);

    public void app_info_reset_type_associations(Pointer content_type) {
        this.g_app_info_reset_type_associations(Pointer.getPeer(content_type));
    }

    protected native void g_async_initable_newv_async(long object_type, long n_parameters,
        @Ptr
        long parameters, int io_priority,
        @Ptr
        long cancellable, Object callback, Pointer user_data);

    public void async_initable_newv_async(long object_type, long n_parameters, Pointer<GParameter> parameters, int io_priority, Pointer<GCancellable> cancellable, Object callback, Pointer user_data) {
        this.g_async_initable_newv_async(object_type, n_parameters, Pointer.getPeer(parameters), io_priority, Pointer.getPeer(cancellable), callback, user_data);
    }

    protected native void g_bus_get(IntValuedEnum<GBusType> bus_type,
        @Ptr
        long cancellable, Object callback, Pointer user_data);

    public void bus_get(IntValuedEnum<GBusType> bus_type, Pointer<GCancellable> cancellable, Object callback, Pointer user_data) {
        this.g_bus_get(bus_type, Pointer.getPeer(cancellable), callback, user_data);
    }

    @Ptr
    protected native long g_bus_get_finish(
        @Ptr
        long res);

    public Pointer<GDBusConnection> bus_get_finish(Pointer<Object> res) {
        return Pointer.pointerToAddress(this.g_bus_get_finish(Pointer.getPeer(res)), Pointer.class);
    }

    @Ptr
    protected native long g_bus_get_sync(IntValuedEnum<GBusType> bus_type,
        @Ptr
        long cancellable);

    public Pointer<GDBusConnection> bus_get_sync(IntValuedEnum<GBusType> bus_type, Pointer<GCancellable> cancellable) {
        return Pointer.pointerToAddress(this.g_bus_get_sync(bus_type, Pointer.getPeer(cancellable)), Pointer.class);
    }

    protected native long g_bus_own_name(IntValuedEnum<GBusType> bus_type,
        @Ptr
        long name, Object flags, Object bus_acquired_handler, Object name_acquired_handler, Object name_lost_handler, Pointer user_data, Object user_data_free_func);

    public long bus_own_name(IntValuedEnum<GBusType> bus_type, Pointer name, Object flags, Object bus_acquired_handler, Object name_acquired_handler, Object name_lost_handler, Pointer user_data, Object user_data_free_func) {
        return this.g_bus_own_name(bus_type, Pointer.getPeer(name), flags, bus_acquired_handler, name_acquired_handler, name_lost_handler, user_data, user_data_free_func);
    }

    protected native long g_bus_own_name_on_connection(
        @Ptr
        long connection,
        @Ptr
        long name, Object flags, Object name_acquired_handler, Object name_lost_handler, Pointer user_data, Object user_data_free_func);

    public long bus_own_name_on_connection(Pointer<GDBusConnection> connection, Pointer name, Object flags, Object name_acquired_handler, Object name_lost_handler, Pointer user_data, Object user_data_free_func) {
        return this.g_bus_own_name_on_connection(Pointer.getPeer(connection), Pointer.getPeer(name), flags, name_acquired_handler, name_lost_handler, user_data, user_data_free_func);
    }

    protected native long g_bus_own_name_on_connection_with_closures(
        @Ptr
        long connection,
        @Ptr
        long name, Object flags,
        @Ptr
        long name_acquired_closure,
        @Ptr
        long name_lost_closure);

    public long bus_own_name_on_connection_with_closures(Pointer<GDBusConnection> connection, Pointer name, Object flags, Pointer<GClosure> name_acquired_closure, Pointer<GClosure> name_lost_closure) {
        return this.g_bus_own_name_on_connection_with_closures(Pointer.getPeer(connection), Pointer.getPeer(name), flags, Pointer.getPeer(name_acquired_closure), Pointer.getPeer(name_lost_closure));
    }

    protected native long g_bus_own_name_with_closures(IntValuedEnum<GBusType> bus_type,
        @Ptr
        long name, Object flags,
        @Ptr
        long bus_acquired_closure,
        @Ptr
        long name_acquired_closure,
        @Ptr
        long name_lost_closure);

    public long bus_own_name_with_closures(IntValuedEnum<GBusType> bus_type, Pointer name, Object flags, Pointer<GClosure> bus_acquired_closure, Pointer<GClosure> name_acquired_closure, Pointer<GClosure> name_lost_closure) {
        return this.g_bus_own_name_with_closures(bus_type, Pointer.getPeer(name), flags, Pointer.getPeer(bus_acquired_closure), Pointer.getPeer(name_acquired_closure), Pointer.getPeer(name_lost_closure));
    }

    public native void g_bus_unown_name(long owner_id);

    public native void g_bus_unwatch_name(long watcher_id);

    protected native long g_bus_watch_name(IntValuedEnum<GBusType> bus_type,
        @Ptr
        long name, Object flags, Object name_appeared_handler, Object name_vanished_handler, Pointer user_data, Object user_data_free_func);

    public long bus_watch_name(IntValuedEnum<GBusType> bus_type, Pointer name, Object flags, Object name_appeared_handler, Object name_vanished_handler, Pointer user_data, Object user_data_free_func) {
        return this.g_bus_watch_name(bus_type, Pointer.getPeer(name), flags, name_appeared_handler, name_vanished_handler, user_data, user_data_free_func);
    }

    protected native long g_bus_watch_name_on_connection(
        @Ptr
        long connection,
        @Ptr
        long name, Object flags, Object name_appeared_handler, Object name_vanished_handler, Pointer user_data, Object user_data_free_func);

    public long bus_watch_name_on_connection(Pointer<GDBusConnection> connection, Pointer name, Object flags, Object name_appeared_handler, Object name_vanished_handler, Pointer user_data, Object user_data_free_func) {
        return this.g_bus_watch_name_on_connection(Pointer.getPeer(connection), Pointer.getPeer(name), flags, name_appeared_handler, name_vanished_handler, user_data, user_data_free_func);
    }

    protected native long g_bus_watch_name_on_connection_with_closures(
        @Ptr
        long connection,
        @Ptr
        long name, Object flags,
        @Ptr
        long name_appeared_closure,
        @Ptr
        long name_vanished_closure);

    public long bus_watch_name_on_connection_with_closures(Pointer<GDBusConnection> connection, Pointer name, Object flags, Pointer<GClosure> name_appeared_closure, Pointer<GClosure> name_vanished_closure) {
        return this.g_bus_watch_name_on_connection_with_closures(Pointer.getPeer(connection), Pointer.getPeer(name), flags, Pointer.getPeer(name_appeared_closure), Pointer.getPeer(name_vanished_closure));
    }

    protected native long g_bus_watch_name_with_closures(IntValuedEnum<GBusType> bus_type,
        @Ptr
        long name, Object flags,
        @Ptr
        long name_appeared_closure,
        @Ptr
        long name_vanished_closure);

    public long bus_watch_name_with_closures(IntValuedEnum<GBusType> bus_type, Pointer name, Object flags, Pointer<GClosure> name_appeared_closure, Pointer<GClosure> name_vanished_closure) {
        return this.g_bus_watch_name_with_closures(bus_type, Pointer.getPeer(name), flags, Pointer.getPeer(name_appeared_closure), Pointer.getPeer(name_vanished_closure));
    }

    protected native boolean g_content_type_can_be_executable(
        @Ptr
        long type);

    public boolean content_type_can_be_executable(Pointer type) {
        return this.g_content_type_can_be_executable(Pointer.getPeer(type));
    }

    protected native boolean g_content_type_equals(
        @Ptr
        long type1,
        @Ptr
        long type2);

    public boolean content_type_equals(Pointer type1, Pointer type2) {
        return this.g_content_type_equals(Pointer.getPeer(type1), Pointer.getPeer(type2));
    }

    @Ptr
    protected native long g_content_type_from_mime_type(
        @Ptr
        long mime_type);

    public Pointer content_type_from_mime_type(Pointer mime_type) {
        return Pointer.pointerToAddress(this.g_content_type_from_mime_type(Pointer.getPeer(mime_type)));
    }

    @Ptr
    protected native long g_content_type_get_description(
        @Ptr
        long type);

    public Pointer content_type_get_description(Pointer type) {
        return Pointer.pointerToAddress(this.g_content_type_get_description(Pointer.getPeer(type)));
    }

    @Ptr
    protected native long g_content_type_get_generic_icon_name(
        @Ptr
        long type);

    public Pointer content_type_get_generic_icon_name(Pointer type) {
        return Pointer.pointerToAddress(this.g_content_type_get_generic_icon_name(Pointer.getPeer(type)));
    }

    @Ptr
    protected native long g_content_type_get_icon(
        @Ptr
        long type);

    public Pointer<Object> content_type_get_icon(Pointer type) {
        return Pointer.pointerToAddress(this.g_content_type_get_icon(Pointer.getPeer(type)), Pointer.class);
    }

    @Ptr
    protected native long g_content_type_get_mime_type(
        @Ptr
        long type);

    public Pointer content_type_get_mime_type(Pointer type) {
        return Pointer.pointerToAddress(this.g_content_type_get_mime_type(Pointer.getPeer(type)));
    }

    @Ptr
    protected native long g_content_type_get_symbolic_icon(
        @Ptr
        long type);

    public Pointer<Object> content_type_get_symbolic_icon(Pointer type) {
        return Pointer.pointerToAddress(this.g_content_type_get_symbolic_icon(Pointer.getPeer(type)), Pointer.class);
    }

    @Ptr
    protected native long g_content_type_guess(
        @Ptr
        long filename,
        @Ptr
        long data, long data_size,
        @Ptr
        long result_uncertain);

    public Pointer content_type_guess(Pointer filename, short data, long data_size, Pointer<Boolean> result_uncertain) {
        return Pointer.pointerToAddress(this.g_content_type_guess(Pointer.getPeer(filename), Pointer.getPeer(data), data_size, Pointer.getPeer(result_uncertain)));
    }

    @Ptr
    protected native long g_content_type_guess_for_tree(
        @Ptr
        long root);

    public Pointer content_type_guess_for_tree(Pointer<Object> root) {
        return Pointer.pointerToAddress(this.g_content_type_guess_for_tree(Pointer.getPeer(root)));
    }

    protected native boolean g_content_type_is_a(
        @Ptr
        long type,
        @Ptr
        long supertype);

    public boolean content_type_is_a(Pointer type, Pointer supertype) {
        return this.g_content_type_is_a(Pointer.getPeer(type), Pointer.getPeer(supertype));
    }

    protected native boolean g_content_type_is_unknown(
        @Ptr
        long type);

    public boolean content_type_is_unknown(Pointer type) {
        return this.g_content_type_is_unknown(Pointer.getPeer(type));
    }

    @Ptr
    protected native long g_content_types_get_registered();

    public Pointer<GList> content_types_get_registered() {
        return Pointer.pointerToAddress(this.g_content_types_get_registered(), Pointer.class);
    }

    @Ptr
    protected native long g_dbus_address_escape_value(
        @Ptr
        long string);

    public Pointer dbus_address_escape_value(Pointer string) {
        return Pointer.pointerToAddress(this.g_dbus_address_escape_value(Pointer.getPeer(string)));
    }

    @Ptr
    protected native long g_dbus_address_get_for_bus_sync(IntValuedEnum<GBusType> bus_type,
        @Ptr
        long cancellable);

    public Pointer dbus_address_get_for_bus_sync(IntValuedEnum<GBusType> bus_type, Pointer<GCancellable> cancellable) {
        return Pointer.pointerToAddress(this.g_dbus_address_get_for_bus_sync(bus_type, Pointer.getPeer(cancellable)));
    }

    protected native void g_dbus_address_get_stream(
        @Ptr
        long address,
        @Ptr
        long cancellable, Object callback, Pointer user_data);

    public void dbus_address_get_stream(Pointer address, Pointer<GCancellable> cancellable, Object callback, Pointer user_data) {
        this.g_dbus_address_get_stream(Pointer.getPeer(address), Pointer.getPeer(cancellable), callback, user_data);
    }

    @Ptr
    protected native long g_dbus_address_get_stream_finish(
        @Ptr
        long res,
        @Ptr
        long out_guid);

    public Pointer<GIOStream> dbus_address_get_stream_finish(Pointer<Object> res, Pointer out_guid) {
        return Pointer.pointerToAddress(this.g_dbus_address_get_stream_finish(Pointer.getPeer(res), Pointer.getPeer(out_guid)), Pointer.class);
    }

    @Ptr
    protected native long g_dbus_address_get_stream_sync(
        @Ptr
        long address,
        @Ptr
        long out_guid,
        @Ptr
        long cancellable);

    public Pointer<GIOStream> dbus_address_get_stream_sync(Pointer address, Pointer out_guid, Pointer<GCancellable> cancellable) {
        return Pointer.pointerToAddress(this.g_dbus_address_get_stream_sync(Pointer.getPeer(address), Pointer.getPeer(out_guid), Pointer.getPeer(cancellable)), Pointer.class);
    }

    @Ptr
    protected native long g_dbus_annotation_info_lookup(
        @Ptr
        long annotations,
        @Ptr
        long name);

    public Pointer dbus_annotation_info_lookup(Pointer<GDBusAnnotationInfo> annotations, Pointer name) {
        return Pointer.pointerToAddress(this.g_dbus_annotation_info_lookup(Pointer.getPeer(annotations), Pointer.getPeer(name)));
    }

    @Ptr
    protected native long g_dbus_error_encode_gerror(
        @Ptr
        long error);

    public Pointer dbus_error_encode_gerror(Pointer<GError> error) {
        return Pointer.pointerToAddress(this.g_dbus_error_encode_gerror(Pointer.getPeer(error)));
    }

    @Ptr
    protected native long g_dbus_error_get_remote_error(
        @Ptr
        long error);

    public Pointer dbus_error_get_remote_error(Pointer<GError> error) {
        return Pointer.pointerToAddress(this.g_dbus_error_get_remote_error(Pointer.getPeer(error)));
    }

    protected native boolean g_dbus_error_is_remote_error(
        @Ptr
        long error);

    public boolean dbus_error_is_remote_error(Pointer<GError> error) {
        return this.g_dbus_error_is_remote_error(Pointer.getPeer(error));
    }

    @Ptr
    protected native long g_dbus_error_new_for_dbus_error(
        @Ptr
        long dbus_error_name,
        @Ptr
        long dbus_error_message);

    public Pointer<GError> dbus_error_new_for_dbus_error(Pointer dbus_error_name, Pointer dbus_error_message) {
        return Pointer.pointerToAddress(this.g_dbus_error_new_for_dbus_error(Pointer.getPeer(dbus_error_name), Pointer.getPeer(dbus_error_message)), Pointer.class);
    }

    public native Object g_dbus_error_quark();

    protected native boolean g_dbus_error_register_error(Object error_domain, int error_code,
        @Ptr
        long dbus_error_name);

    public boolean dbus_error_register_error(Object error_domain, int error_code, Pointer dbus_error_name) {
        return this.g_dbus_error_register_error(error_domain, error_code, Pointer.getPeer(dbus_error_name));
    }

    protected native void g_dbus_error_register_error_domain(
        @Ptr
        long error_domain_quark_name,
        @Ptr
        long quark_volatile,
        @Ptr
        long entries, long num_entries);

    public void dbus_error_register_error_domain(Pointer error_domain_quark_name, Pointer<Long> quark_volatile, Pointer<GDBusErrorEntry> entries, long num_entries) {
        this.g_dbus_error_register_error_domain(Pointer.getPeer(error_domain_quark_name), Pointer.getPeer(quark_volatile), Pointer.getPeer(entries), num_entries);
    }

    protected native boolean g_dbus_error_strip_remote_error(
        @Ptr
        long error);

    public boolean dbus_error_strip_remote_error(Pointer<GError> error) {
        return this.g_dbus_error_strip_remote_error(Pointer.getPeer(error));
    }

    protected native boolean g_dbus_error_unregister_error(Object error_domain, int error_code,
        @Ptr
        long dbus_error_name);

    public boolean dbus_error_unregister_error(Object error_domain, int error_code, Pointer dbus_error_name) {
        return this.g_dbus_error_unregister_error(error_domain, error_code, Pointer.getPeer(dbus_error_name));
    }

    @Ptr
    protected native long g_dbus_generate_guid();

    public Pointer dbus_generate_guid() {
        return Pointer.pointerToAddress(this.g_dbus_generate_guid());
    }

    @Ptr
    protected native long g_dbus_gvalue_to_gvariant(
        @Ptr
        long gvalue,
        @Ptr
        long type);

    public Pointer<GVariant> dbus_gvalue_to_gvariant(Pointer<GValue> gvalue, Pointer<GVariantType> type) {
        return Pointer.pointerToAddress(this.g_dbus_gvalue_to_gvariant(Pointer.getPeer(gvalue), Pointer.getPeer(type)), Pointer.class);
    }

    protected native void g_dbus_gvariant_to_gvalue(
        @Ptr
        long value,
        @Ptr
        long out_gvalue);

    public void dbus_gvariant_to_gvalue(Pointer<GVariant> value, Pointer<GValue> out_gvalue) {
        this.g_dbus_gvariant_to_gvalue(Pointer.getPeer(value), Pointer.getPeer(out_gvalue));
    }

    protected native boolean g_dbus_is_address(
        @Ptr
        long string);

    public boolean dbus_is_address(Pointer string) {
        return this.g_dbus_is_address(Pointer.getPeer(string));
    }

    protected native boolean g_dbus_is_guid(
        @Ptr
        long string);

    public boolean dbus_is_guid(Pointer string) {
        return this.g_dbus_is_guid(Pointer.getPeer(string));
    }

    protected native boolean g_dbus_is_interface_name(
        @Ptr
        long string);

    public boolean dbus_is_interface_name(Pointer string) {
        return this.g_dbus_is_interface_name(Pointer.getPeer(string));
    }

    protected native boolean g_dbus_is_member_name(
        @Ptr
        long string);

    public boolean dbus_is_member_name(Pointer string) {
        return this.g_dbus_is_member_name(Pointer.getPeer(string));
    }

    protected native boolean g_dbus_is_name(
        @Ptr
        long string);

    public boolean dbus_is_name(Pointer string) {
        return this.g_dbus_is_name(Pointer.getPeer(string));
    }

    protected native boolean g_dbus_is_supported_address(
        @Ptr
        long string);

    public boolean dbus_is_supported_address(Pointer string) {
        return this.g_dbus_is_supported_address(Pointer.getPeer(string));
    }

    protected native boolean g_dbus_is_unique_name(
        @Ptr
        long string);

    public boolean dbus_is_unique_name(Pointer string) {
        return this.g_dbus_is_unique_name(Pointer.getPeer(string));
    }

    @Ptr
    protected native long g_file_new_for_commandline_arg(
        @Ptr
        long arg);

    public Pointer<Object> file_new_for_commandline_arg(Pointer arg) {
        return Pointer.pointerToAddress(this.g_file_new_for_commandline_arg(Pointer.getPeer(arg)), Pointer.class);
    }

    @Ptr
    protected native long g_file_new_for_commandline_arg_and_cwd(
        @Ptr
        long arg,
        @Ptr
        long cwd);

    public Pointer<Object> file_new_for_commandline_arg_and_cwd(Pointer arg, Pointer cwd) {
        return Pointer.pointerToAddress(this.g_file_new_for_commandline_arg_and_cwd(Pointer.getPeer(arg), Pointer.getPeer(cwd)), Pointer.class);
    }

    @Ptr
    protected native long g_file_new_for_path(
        @Ptr
        long path);

    public Pointer<Object> file_new_for_path(Pointer path) {
        return Pointer.pointerToAddress(this.g_file_new_for_path(Pointer.getPeer(path)), Pointer.class);
    }

    @Ptr
    protected native long g_file_new_for_uri(
        @Ptr
        long uri);

    public Pointer<Object> file_new_for_uri(Pointer uri) {
        return Pointer.pointerToAddress(this.g_file_new_for_uri(Pointer.getPeer(uri)), Pointer.class);
    }

    @Ptr
    protected native long g_file_new_tmp(
        @Ptr
        long tmpl,
        @Ptr
        long iostream);

    public Pointer<Object> file_new_tmp(Pointer tmpl, Pointer<Pointer<GFileIOStream>> iostream) {
        return Pointer.pointerToAddress(this.g_file_new_tmp(Pointer.getPeer(tmpl), Pointer.getPeer(iostream)), Pointer.class);
    }

    @Ptr
    protected native long g_file_parse_name(
        @Ptr
        long parse_name);

    public Pointer<Object> file_parse_name(Pointer parse_name) {
        return Pointer.pointerToAddress(this.g_file_parse_name(Pointer.getPeer(parse_name)), Pointer.class);
    }

    @Ptr
    protected native long g_icon_deserialize(
        @Ptr
        long value);

    public Pointer<Object> icon_deserialize(Pointer<GVariant> value) {
        return Pointer.pointerToAddress(this.g_icon_deserialize(Pointer.getPeer(value)), Pointer.class);
    }

    public native long g_icon_hash(Pointer icon);

    @Ptr
    protected native long g_icon_new_for_string(
        @Ptr
        long str);

    public Pointer<Object> icon_new_for_string(Pointer str) {
        return Pointer.pointerToAddress(this.g_icon_new_for_string(Pointer.getPeer(str)), Pointer.class);
    }

    protected native GObject g_initable_newv(long object_type, long n_parameters,
        @Ptr
        long parameters,
        @Ptr
        long cancellable);

    public GObject initable_newv(long object_type, long n_parameters, GParameter parameters, Pointer<GCancellable> cancellable) {
        return this.g_initable_newv(object_type, n_parameters, Pointer.getPeer(parameters), Pointer.getPeer(cancellable));
    }

    public native IntValuedEnum<GIOErrorEnum> g_io_error_from_errno(int err_no);

    public native Object g_io_error_quark();

    @Ptr
    protected native long g_io_extension_point_implement(
        @Ptr
        long extension_point_name, long type,
        @Ptr
        long extension_name, int priority);

    public Pointer<GIOExtension> io_extension_point_implement(Pointer extension_point_name, long type, Pointer extension_name, int priority) {
        return Pointer.pointerToAddress(this.g_io_extension_point_implement(Pointer.getPeer(extension_point_name), type, Pointer.getPeer(extension_name), priority), Pointer.class);
    }

    @Ptr
    protected native long g_io_extension_point_lookup(
        @Ptr
        long name);

    public Pointer<GIOExtensionPoint> io_extension_point_lookup(Pointer name) {
        return Pointer.pointerToAddress(this.g_io_extension_point_lookup(Pointer.getPeer(name)), Pointer.class);
    }

    @Ptr
    protected native long g_io_extension_point_register(
        @Ptr
        long name);

    public Pointer<GIOExtensionPoint> io_extension_point_register(Pointer name) {
        return Pointer.pointerToAddress(this.g_io_extension_point_register(Pointer.getPeer(name)), Pointer.class);
    }

    @Ptr
    protected native long g_io_modules_load_all_in_directory(
        @Ptr
        long dirname);

    public Pointer<GList> io_modules_load_all_in_directory(Pointer dirname) {
        return Pointer.pointerToAddress(this.g_io_modules_load_all_in_directory(Pointer.getPeer(dirname)), Pointer.class);
    }

    @Ptr
    protected native long g_io_modules_load_all_in_directory_with_scope(
        @Ptr
        long dirname,
        @Ptr
        long scope);

    public Pointer<GList> io_modules_load_all_in_directory_with_scope(Pointer dirname, Pointer<GIOModuleScope> scope) {
        return Pointer.pointerToAddress(this.g_io_modules_load_all_in_directory_with_scope(Pointer.getPeer(dirname), Pointer.getPeer(scope)), Pointer.class);
    }

    protected native void g_io_modules_scan_all_in_directory(
        @Ptr
        long dirname);

    public void io_modules_scan_all_in_directory(Pointer dirname) {
        this.g_io_modules_scan_all_in_directory(Pointer.getPeer(dirname));
    }

    protected native void g_io_modules_scan_all_in_directory_with_scope(
        @Ptr
        long dirname,
        @Ptr
        long scope);

    public void io_modules_scan_all_in_directory_with_scope(Pointer dirname, Pointer<GIOModuleScope> scope) {
        this.g_io_modules_scan_all_in_directory_with_scope(Pointer.getPeer(dirname), Pointer.getPeer(scope));
    }

    public native void g_io_scheduler_cancel_all_jobs();

    protected native void g_io_scheduler_push_job(Object job_func, Pointer user_data, Object notify, int io_priority,
        @Ptr
        long cancellable);

    public void io_scheduler_push_job(Object job_func, Pointer user_data, Object notify, int io_priority, Pointer<GCancellable> cancellable) {
        this.g_io_scheduler_push_job(job_func, user_data, notify, io_priority, Pointer.getPeer(cancellable));
    }

    @Ptr
    protected native long g_network_monitor_get_default();

    public Pointer<Object> network_monitor_get_default() {
        return Pointer.pointerToAddress(this.g_network_monitor_get_default(), Pointer.class);
    }

    public native void g_networking_init();

    @Ptr
    protected native long g_pollable_source_new(
        @Ptr
        long pollable_stream);

    public Pointer<GSource> pollable_source_new(Pointer<GObject> pollable_stream) {
        return Pointer.pointerToAddress(this.g_pollable_source_new(Pointer.getPeer(pollable_stream)), Pointer.class);
    }

    @Ptr
    protected native long g_pollable_source_new_full(GObject pollable_stream,
        @Ptr
        long child_source,
        @Ptr
        long cancellable);

    public Pointer<GSource> pollable_source_new_full(GObject pollable_stream, Pointer<GSource> child_source, Pointer<GCancellable> cancellable) {
        return Pointer.pointerToAddress(this.g_pollable_source_new_full(pollable_stream, Pointer.getPeer(child_source), Pointer.getPeer(cancellable)), Pointer.class);
    }

    protected native long g_pollable_stream_read(
        @Ptr
        long stream, Pointer buffer, long count, boolean blocking,
        @Ptr
        long cancellable);

    public long pollable_stream_read(Pointer<GInputStream> stream, Pointer buffer, long count, boolean blocking, Pointer<GCancellable> cancellable) {
        return this.g_pollable_stream_read(Pointer.getPeer(stream), buffer, count, blocking, Pointer.getPeer(cancellable));
    }

    protected native long g_pollable_stream_write(
        @Ptr
        long stream,
        @Ptr
        long buffer, long count, boolean blocking,
        @Ptr
        long cancellable);

    public long pollable_stream_write(Pointer<GOutputStream> stream, short buffer, long count, boolean blocking, Pointer<GCancellable> cancellable) {
        return this.g_pollable_stream_write(Pointer.getPeer(stream), Pointer.getPeer(buffer), count, blocking, Pointer.getPeer(cancellable));
    }

    protected native boolean g_pollable_stream_write_all(
        @Ptr
        long stream,
        @Ptr
        long buffer, long count, boolean blocking,
        @Ptr
        long bytes_written,
        @Ptr
        long cancellable);

    public boolean pollable_stream_write_all(Pointer<GOutputStream> stream, short buffer, long count, boolean blocking, Pointer<Long> bytes_written, Pointer<GCancellable> cancellable) {
        return this.g_pollable_stream_write_all(Pointer.getPeer(stream), Pointer.getPeer(buffer), count, blocking, Pointer.getPeer(bytes_written), Pointer.getPeer(cancellable));
    }

    @Ptr
    protected native long g_proxy_get_default_for_protocol(
        @Ptr
        long protocol);

    public Pointer<Object> proxy_get_default_for_protocol(Pointer protocol) {
        return Pointer.pointerToAddress(this.g_proxy_get_default_for_protocol(Pointer.getPeer(protocol)), Pointer.class);
    }

    @Ptr
    protected native long g_proxy_resolver_get_default();

    public Pointer<Object> proxy_resolver_get_default() {
        return Pointer.pointerToAddress(this.g_proxy_resolver_get_default(), Pointer.class);
    }

    public native Object g_resolver_error_quark();

    public native Object g_resource_error_quark();

    @Ptr
    protected native long g_resource_load(
        @Ptr
        long filename);

    public Pointer<GResource> resource_load(Pointer filename) {
        return Pointer.pointerToAddress(this.g_resource_load(Pointer.getPeer(filename)), Pointer.class);
    }

    @Ptr
    protected native long g_resources_enumerate_children(
        @Ptr
        long path, Object lookup_flags);

    public Pointer resources_enumerate_children(Pointer path, Object lookup_flags) {
        return Pointer.pointerToAddress(this.g_resources_enumerate_children(Pointer.getPeer(path), lookup_flags));
    }

    protected native boolean g_resources_get_info(
        @Ptr
        long path, Object lookup_flags,
        @Ptr
        long size,
        @Ptr
        long flags);

    public boolean resources_get_info(Pointer path, Object lookup_flags, Pointer<Long> size, Pointer<Long> flags) {
        return this.g_resources_get_info(Pointer.getPeer(path), lookup_flags, Pointer.getPeer(size), Pointer.getPeer(flags));
    }

    @Ptr
    protected native long g_resources_lookup_data(
        @Ptr
        long path, Object lookup_flags);

    public Pointer<GBytes> resources_lookup_data(Pointer path, Object lookup_flags) {
        return Pointer.pointerToAddress(this.g_resources_lookup_data(Pointer.getPeer(path), lookup_flags), Pointer.class);
    }

    @Ptr
    protected native long g_resources_open_stream(
        @Ptr
        long path, Object lookup_flags);

    public Pointer<GInputStream> resources_open_stream(Pointer path, Object lookup_flags) {
        return Pointer.pointerToAddress(this.g_resources_open_stream(Pointer.getPeer(path), lookup_flags), Pointer.class);
    }

    protected native void g_resources_register(
        @Ptr
        long resource);

    public void resources_register(Pointer<GResource> resource) {
        this.g_resources_register(Pointer.getPeer(resource));
    }

    protected native void g_resources_unregister(
        @Ptr
        long resource);

    public void resources_unregister(Pointer<GResource> resource) {
        this.g_resources_unregister(Pointer.getPeer(resource));
    }

    @Ptr
    protected native long g_settings_schema_source_get_default();

    public Pointer<GSettingsSchemaSource> settings_schema_source_get_default() {
        return Pointer.pointerToAddress(this.g_settings_schema_source_get_default(), Pointer.class);
    }

    protected native void g_simple_async_report_error_in_idle(
        @Ptr
        long object, Object callback, Pointer user_data, Object domain, int code,
        @Ptr
        long format, Object... varargs);

    public void simple_async_report_error_in_idle(Pointer<GObject> object, Object callback, Pointer user_data, Object domain, int code, Pointer format, Object... varargs) {
        this.g_simple_async_report_error_in_idle(Pointer.getPeer(object), callback, user_data, domain, code, Pointer.getPeer(format), varargs);
    }

    protected native void g_simple_async_report_gerror_in_idle(
        @Ptr
        long object, Object callback, Pointer user_data,
        @Ptr
        long error);

    public void simple_async_report_gerror_in_idle(Pointer<GObject> object, Object callback, Pointer user_data, Pointer<GError> error) {
        this.g_simple_async_report_gerror_in_idle(Pointer.getPeer(object), callback, user_data, Pointer.getPeer(error));
    }

    protected native void g_simple_async_report_take_gerror_in_idle(
        @Ptr
        long object, Object callback, Pointer user_data,
        @Ptr
        long error);

    public void simple_async_report_take_gerror_in_idle(Pointer<GObject> object, Object callback, Pointer user_data, Pointer<GError> error) {
        this.g_simple_async_report_take_gerror_in_idle(Pointer.getPeer(object), callback, user_data, Pointer.getPeer(error));
    }

    @Ptr
    protected native long g_srv_target_list_sort(
        @Ptr
        long targets);

    public Pointer<GList> srv_target_list_sort(Pointer<GList> targets) {
        return Pointer.pointerToAddress(this.g_srv_target_list_sort(Pointer.getPeer(targets)), Pointer.class);
    }

    @Ptr
    protected native long g_tls_backend_get_default();

    public Pointer<Object> tls_backend_get_default() {
        return Pointer.pointerToAddress(this.g_tls_backend_get_default(), Pointer.class);
    }

    @Ptr
    protected native long g_tls_client_connection_new(
        @Ptr
        long base_io_stream,
        @Ptr
        long server_identity);

    public Pointer<Object> tls_client_connection_new(Pointer<GIOStream> base_io_stream, Pointer<Object> server_identity) {
        return Pointer.pointerToAddress(this.g_tls_client_connection_new(Pointer.getPeer(base_io_stream), Pointer.getPeer(server_identity)), Pointer.class);
    }

    public native Object g_tls_error_quark();

    @Ptr
    protected native long g_tls_file_database_new(
        @Ptr
        long anchors);

    public Pointer<Object> tls_file_database_new(Pointer anchors) {
        return Pointer.pointerToAddress(this.g_tls_file_database_new(Pointer.getPeer(anchors)), Pointer.class);
    }

    @Ptr
    protected native long g_tls_server_connection_new(
        @Ptr
        long base_io_stream,
        @Ptr
        long certificate);

    public Pointer<Object> tls_server_connection_new(Pointer<GIOStream> base_io_stream, Pointer<GTlsCertificate> certificate) {
        return Pointer.pointerToAddress(this.g_tls_server_connection_new(Pointer.getPeer(base_io_stream), Pointer.getPeer(certificate)), Pointer.class);
    }

    protected native boolean g_unix_is_mount_path_system_internal(
        @Ptr
        long mount_path);

    public boolean unix_is_mount_path_system_internal(Pointer mount_path) {
        return this.g_unix_is_mount_path_system_internal(Pointer.getPeer(mount_path));
    }

    @Ptr
    protected native long g_unix_mount_at(
        @Ptr
        long mount_path,
        @Ptr
        long time_read);

    public Pointer<GUnixMountEntry> unix_mount_at(Pointer mount_path, Pointer<Long> time_read) {
        return Pointer.pointerToAddress(this.g_unix_mount_at(Pointer.getPeer(mount_path), Pointer.getPeer(time_read)), Pointer.class);
    }

    protected native int g_unix_mount_compare(
        @Ptr
        long mount1,
        @Ptr
        long mount2);

    public int unix_mount_compare(Pointer<GUnixMountEntry> mount1, Pointer<GUnixMountEntry> mount2) {
        return this.g_unix_mount_compare(Pointer.getPeer(mount1), Pointer.getPeer(mount2));
    }

    protected native void g_unix_mount_free(
        @Ptr
        long mount_entry);

    public void unix_mount_free(Pointer<GUnixMountEntry> mount_entry) {
        this.g_unix_mount_free(Pointer.getPeer(mount_entry));
    }

    @Ptr
    protected native long g_unix_mount_get_device_path(
        @Ptr
        long mount_entry);

    public Pointer unix_mount_get_device_path(Pointer<GUnixMountEntry> mount_entry) {
        return Pointer.pointerToAddress(this.g_unix_mount_get_device_path(Pointer.getPeer(mount_entry)));
    }

    @Ptr
    protected native long g_unix_mount_get_fs_type(
        @Ptr
        long mount_entry);

    public Pointer unix_mount_get_fs_type(Pointer<GUnixMountEntry> mount_entry) {
        return Pointer.pointerToAddress(this.g_unix_mount_get_fs_type(Pointer.getPeer(mount_entry)));
    }

    @Ptr
    protected native long g_unix_mount_get_mount_path(
        @Ptr
        long mount_entry);

    public Pointer unix_mount_get_mount_path(Pointer<GUnixMountEntry> mount_entry) {
        return Pointer.pointerToAddress(this.g_unix_mount_get_mount_path(Pointer.getPeer(mount_entry)));
    }

    protected native boolean g_unix_mount_guess_can_eject(
        @Ptr
        long mount_entry);

    public boolean unix_mount_guess_can_eject(Pointer<GUnixMountEntry> mount_entry) {
        return this.g_unix_mount_guess_can_eject(Pointer.getPeer(mount_entry));
    }

    @Ptr
    protected native long g_unix_mount_guess_icon(
        @Ptr
        long mount_entry);

    public Pointer<Object> unix_mount_guess_icon(Pointer<GUnixMountEntry> mount_entry) {
        return Pointer.pointerToAddress(this.g_unix_mount_guess_icon(Pointer.getPeer(mount_entry)), Pointer.class);
    }

    @Ptr
    protected native long g_unix_mount_guess_name(
        @Ptr
        long mount_entry);

    public Pointer unix_mount_guess_name(Pointer<GUnixMountEntry> mount_entry) {
        return Pointer.pointerToAddress(this.g_unix_mount_guess_name(Pointer.getPeer(mount_entry)));
    }

    protected native boolean g_unix_mount_guess_should_display(
        @Ptr
        long mount_entry);

    public boolean unix_mount_guess_should_display(Pointer<GUnixMountEntry> mount_entry) {
        return this.g_unix_mount_guess_should_display(Pointer.getPeer(mount_entry));
    }

    @Ptr
    protected native long g_unix_mount_guess_symbolic_icon(
        @Ptr
        long mount_entry);

    public Pointer<Object> unix_mount_guess_symbolic_icon(Pointer<GUnixMountEntry> mount_entry) {
        return Pointer.pointerToAddress(this.g_unix_mount_guess_symbolic_icon(Pointer.getPeer(mount_entry)), Pointer.class);
    }

    protected native boolean g_unix_mount_is_readonly(
        @Ptr
        long mount_entry);

    public boolean unix_mount_is_readonly(Pointer<GUnixMountEntry> mount_entry) {
        return this.g_unix_mount_is_readonly(Pointer.getPeer(mount_entry));
    }

    protected native boolean g_unix_mount_is_system_internal(
        @Ptr
        long mount_entry);

    public boolean unix_mount_is_system_internal(Pointer<GUnixMountEntry> mount_entry) {
        return this.g_unix_mount_is_system_internal(Pointer.getPeer(mount_entry));
    }

    public native boolean g_unix_mount_points_changed_since(long time);

    @Ptr
    protected native long g_unix_mount_points_get(
        @Ptr
        long time_read);

    public Pointer<GList> unix_mount_points_get(Pointer<Long> time_read) {
        return Pointer.pointerToAddress(this.g_unix_mount_points_get(Pointer.getPeer(time_read)), Pointer.class);
    }

    public native boolean g_unix_mounts_changed_since(long time);

    @Ptr
    protected native long g_unix_mounts_get(
        @Ptr
        long time_read);

    public Pointer<GList> unix_mounts_get(Pointer<Long> time_read) {
        return Pointer.pointerToAddress(this.g_unix_mounts_get(Pointer.getPeer(time_read)), Pointer.class);
    }

}
