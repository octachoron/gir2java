
package generated.gio20.gio;

import java.util.Collections;
import java.util.Iterator;
import generated.glib20.glib.GError;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Ptr;

public enum GDBusError implements IntValuedEnum<GDBusError>
{

    D_BUS_ERROR_FAILED(0L),
    D_BUS_ERROR_NO_MEMORY(1L),
    D_BUS_ERROR_SERVICE_UNKNOWN(2L),
    D_BUS_ERROR_NAME_HAS_NO_OWNER(3L),
    D_BUS_ERROR_NO_REPLY(4L),
    D_BUS_ERROR_IO_ERROR(5L),
    D_BUS_ERROR_BAD_ADDRESS(6L),
    D_BUS_ERROR_NOT_SUPPORTED(7L),
    D_BUS_ERROR_LIMITS_EXCEEDED(8L),
    D_BUS_ERROR_ACCESS_DENIED(9L),
    D_BUS_ERROR_AUTH_FAILED(10L),
    D_BUS_ERROR_NO_SERVER(11L),
    D_BUS_ERROR_TIMEOUT(12L),
    D_BUS_ERROR_NO_NETWORK(13L),
    D_BUS_ERROR_ADDRESS_IN_USE(14L),
    D_BUS_ERROR_DISCONNECTED(15L),
    D_BUS_ERROR_INVALID_ARGS(16L),
    D_BUS_ERROR_FILE_NOT_FOUND(17L),
    D_BUS_ERROR_FILE_EXISTS(18L),
    D_BUS_ERROR_UNKNOWN_METHOD(19L),
    D_BUS_ERROR_TIMED_OUT(20L),
    D_BUS_ERROR_MATCH_RULE_NOT_FOUND(21L),
    D_BUS_ERROR_MATCH_RULE_INVALID(22L),
    D_BUS_ERROR_SPAWN_EXEC_FAILED(23L),
    D_BUS_ERROR_SPAWN_FORK_FAILED(24L),
    D_BUS_ERROR_SPAWN_CHILD_EXITED(25L),
    D_BUS_ERROR_SPAWN_CHILD_SIGNALED(26L),
    D_BUS_ERROR_SPAWN_FAILED(27L),
    D_BUS_ERROR_SPAWN_SETUP_FAILED(28L),
    D_BUS_ERROR_SPAWN_CONFIG_INVALID(29L),
    D_BUS_ERROR_SPAWN_SERVICE_INVALID(30L),
    D_BUS_ERROR_SPAWN_SERVICE_NOT_FOUND(31L),
    D_BUS_ERROR_SPAWN_PERMISSIONS_INVALID(32L),
    D_BUS_ERROR_SPAWN_FILE_INVALID(33L),
    D_BUS_ERROR_SPAWN_NO_MEMORY(34L),
    D_BUS_ERROR_UNIX_PROCESS_ID_UNKNOWN(35L),
    D_BUS_ERROR_INVALID_SIGNATURE(36L),
    D_BUS_ERROR_INVALID_FILE_CONTENT(37L),
    D_BUS_ERROR_SELINUX_SECURITY_CONTEXT_UNKNOWN(38L),
    D_BUS_ERROR_ADT_AUDIT_DATA_UNKNOWN(39L),
    D_BUS_ERROR_OBJECT_PATH_IN_USE(40L);
    public final long value;

    GDBusError(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GDBusError> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GDBusError> fromValue(int value) {
        return FlagSet.fromValue(value, GDBusError.values());
    }

    @Ptr
    protected static native long g_dbus_error_encode_gerror(
        @Ptr
        long error);

    public static Pointer encode_gerror(Pointer<GError> error) {
        return Pointer.pointerToAddress(GDBusError.g_dbus_error_encode_gerror(Pointer.getPeer(error)));
    }

    @Ptr
    protected static native long g_dbus_error_get_remote_error(
        @Ptr
        long error);

    public static Pointer get_remote_error(Pointer<GError> error) {
        return Pointer.pointerToAddress(GDBusError.g_dbus_error_get_remote_error(Pointer.getPeer(error)));
    }

    protected static native boolean g_dbus_error_is_remote_error(
        @Ptr
        long error);

    public static boolean is_remote_error(Pointer<GError> error) {
        return GDBusError.g_dbus_error_is_remote_error(Pointer.getPeer(error));
    }

    @Ptr
    protected static native long g_dbus_error_new_for_dbus_error(
        @Ptr
        long dbus_error_name,
        @Ptr
        long dbus_error_message);

    public static Pointer<GError> new_for_dbus_error(Pointer dbus_error_name, Pointer dbus_error_message) {
        return Pointer.pointerToAddress(GDBusError.g_dbus_error_new_for_dbus_error(Pointer.getPeer(dbus_error_name), Pointer.getPeer(dbus_error_message)), GError.class);
    }

    public static native long g_dbus_error_quark();

    protected static native boolean g_dbus_error_register_error(long error_domain, int error_code,
        @Ptr
        long dbus_error_name);

    public static boolean register_error(long error_domain, int error_code, Pointer dbus_error_name) {
        return GDBusError.g_dbus_error_register_error(error_domain, error_code, Pointer.getPeer(dbus_error_name));
    }

    protected static native void g_dbus_error_register_error_domain(
        @Ptr
        long error_domain_quark_name,
        @Ptr
        long quark_volatile,
        @Ptr
        long entries, long num_entries);

    public static void register_error_domain(Pointer error_domain_quark_name, Pointer<Long> quark_volatile, Pointer entries, long num_entries) {
        GDBusError.g_dbus_error_register_error_domain(Pointer.getPeer(error_domain_quark_name), Pointer.getPeer(quark_volatile), Pointer.getPeer(entries), num_entries);
    }

    protected static native void g_dbus_error_set_dbus_error(
        @Ptr
        long error,
        @Ptr
        long dbus_error_name,
        @Ptr
        long dbus_error_message,
        @Ptr
        long format, Object... varargs);

    public static void set_dbus_error(Pointer<Pointer<GError>> error, Pointer dbus_error_name, Pointer dbus_error_message, Pointer format, Object... varargs) {
        GDBusError.g_dbus_error_set_dbus_error(Pointer.getPeer(error), Pointer.getPeer(dbus_error_name), Pointer.getPeer(dbus_error_message), Pointer.getPeer(format), varargs);
    }

    protected static native boolean g_dbus_error_strip_remote_error(
        @Ptr
        long error);

    public static boolean strip_remote_error(Pointer<GError> error) {
        return GDBusError.g_dbus_error_strip_remote_error(Pointer.getPeer(error));
    }

    protected static native boolean g_dbus_error_unregister_error(long error_domain, int error_code,
        @Ptr
        long dbus_error_name);

    public static boolean unregister_error(long error_domain, int error_code, Pointer dbus_error_name) {
        return GDBusError.g_dbus_error_unregister_error(error_domain, error_code, Pointer.getPeer(dbus_error_name));
    }

}
