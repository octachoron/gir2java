
package generated.gio20.gio;

import generated.glib20.glib.GVariant;
import generated.gobject20.gobject.GObject;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GDBusMessage
    extends GObject
{


    static {
        BridJ.register();
    }

    public GDBusMessage() {
        super();
    }

    public GDBusMessage(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_dbus_message_new();

    public static Pointer gdbusmessage__new() {
        return Pointer.pointerToAddress(GDBusMessage.g_dbus_message_new());
    }

    @Ptr
    protected static native long g_dbus_message_new_from_blob(
        @Ptr
        long blob, long blob_len, IntValuedEnum<GDBusCapabilityFlags> capabilities);

    public static Pointer new_from_blob(Pointer<Short> blob, long blob_len, IntValuedEnum<GDBusCapabilityFlags> capabilities) {
        return Pointer.pointerToAddress(GDBusMessage.g_dbus_message_new_from_blob(Pointer.getPeer(blob), blob_len, capabilities));
    }

    @Ptr
    protected static native long g_dbus_message_new_method_call(
        @Ptr
        long name,
        @Ptr
        long path,
        @Ptr
        long interface_,
        @Ptr
        long method);

    public static Pointer new_method_call(Pointer name, Pointer path, Pointer interface_, Pointer method) {
        return Pointer.pointerToAddress(GDBusMessage.g_dbus_message_new_method_call(Pointer.getPeer(name), Pointer.getPeer(path), Pointer.getPeer(interface_), Pointer.getPeer(method)));
    }

    @Ptr
    protected static native long g_dbus_message_new_signal(
        @Ptr
        long path,
        @Ptr
        long interface_,
        @Ptr
        long signal);

    public static Pointer new_signal(Pointer path, Pointer interface_, Pointer signal) {
        return Pointer.pointerToAddress(GDBusMessage.g_dbus_message_new_signal(Pointer.getPeer(path), Pointer.getPeer(interface_), Pointer.getPeer(signal)));
    }

    protected static native long g_dbus_message_bytes_needed(
        @Ptr
        long blob, long blob_len);

    public static long bytes_needed(Pointer<Short> blob, long blob_len) {
        return GDBusMessage.g_dbus_message_bytes_needed(Pointer.getPeer(blob), blob_len);
    }

    @Ptr
    protected native long g_dbus_message_copy(
        @Ptr
        long message);

    public Pointer copy() {
        return Pointer.pointerToAddress(this.g_dbus_message_copy(Pointer.pointerTo(this, GDBusMessage.class).getPeer()));
    }

    @Ptr
    protected native long g_dbus_message_get_arg0(
        @Ptr
        long message);

    public Pointer get_arg0() {
        return Pointer.pointerToAddress(this.g_dbus_message_get_arg0(Pointer.pointerTo(this, GDBusMessage.class).getPeer()));
    }

    @Ptr
    protected native long g_dbus_message_get_body(
        @Ptr
        long message);

    public Pointer<GVariant> get_body() {
        return Pointer.pointerToAddress(this.g_dbus_message_get_body(Pointer.pointerTo(this, GDBusMessage.class).getPeer()), GVariant.class);
    }

    @Ptr
    protected native long g_dbus_message_get_destination(
        @Ptr
        long message);

    public Pointer get_destination() {
        return Pointer.pointerToAddress(this.g_dbus_message_get_destination(Pointer.pointerTo(this, GDBusMessage.class).getPeer()));
    }

    @Ptr
    protected native long g_dbus_message_get_error_name(
        @Ptr
        long message);

    public Pointer get_error_name() {
        return Pointer.pointerToAddress(this.g_dbus_message_get_error_name(Pointer.pointerTo(this, GDBusMessage.class).getPeer()));
    }

    @Ptr
    protected native long g_dbus_message_get_header_fields(
        @Ptr
        long message);

    public Pointer<Short> get_header_fields() {
        return Pointer.pointerToAddress(this.g_dbus_message_get_header_fields(Pointer.pointerTo(this, GDBusMessage.class).getPeer()), Short.class);
    }

    @Ptr
    protected native long g_dbus_message_get_interface(
        @Ptr
        long message);

    public Pointer get_interface() {
        return Pointer.pointerToAddress(this.g_dbus_message_get_interface(Pointer.pointerTo(this, GDBusMessage.class).getPeer()));
    }

    protected native boolean g_dbus_message_get_locked(
        @Ptr
        long message);

    public boolean get_locked() {
        return this.g_dbus_message_get_locked(Pointer.pointerTo(this, GDBusMessage.class).getPeer());
    }

    @Ptr
    protected native long g_dbus_message_get_member(
        @Ptr
        long message);

    public Pointer get_member() {
        return Pointer.pointerToAddress(this.g_dbus_message_get_member(Pointer.pointerTo(this, GDBusMessage.class).getPeer()));
    }

    protected native long g_dbus_message_get_num_unix_fds(
        @Ptr
        long message);

    public long get_num_unix_fds() {
        return this.g_dbus_message_get_num_unix_fds(Pointer.pointerTo(this, GDBusMessage.class).getPeer());
    }

    @Ptr
    protected native long g_dbus_message_get_path(
        @Ptr
        long message);

    public Pointer get_path() {
        return Pointer.pointerToAddress(this.g_dbus_message_get_path(Pointer.pointerTo(this, GDBusMessage.class).getPeer()));
    }

    protected native long g_dbus_message_get_reply_serial(
        @Ptr
        long message);

    public long get_reply_serial() {
        return this.g_dbus_message_get_reply_serial(Pointer.pointerTo(this, GDBusMessage.class).getPeer());
    }

    @Ptr
    protected native long g_dbus_message_get_sender(
        @Ptr
        long message);

    public Pointer get_sender() {
        return Pointer.pointerToAddress(this.g_dbus_message_get_sender(Pointer.pointerTo(this, GDBusMessage.class).getPeer()));
    }

    protected native long g_dbus_message_get_serial(
        @Ptr
        long message);

    public long get_serial() {
        return this.g_dbus_message_get_serial(Pointer.pointerTo(this, GDBusMessage.class).getPeer());
    }

    @Ptr
    protected native long g_dbus_message_get_signature(
        @Ptr
        long message);

    public Pointer get_signature() {
        return Pointer.pointerToAddress(this.g_dbus_message_get_signature(Pointer.pointerTo(this, GDBusMessage.class).getPeer()));
    }

    @Ptr
    protected native long g_dbus_message_get_unix_fd_list(
        @Ptr
        long message);

    public Pointer get_unix_fd_list() {
        return Pointer.pointerToAddress(this.g_dbus_message_get_unix_fd_list(Pointer.pointerTo(this, GDBusMessage.class).getPeer()));
    }

    protected native void g_dbus_message_lock(
        @Ptr
        long message);

    public void lock() {
        this.g_dbus_message_lock(Pointer.pointerTo(this, GDBusMessage.class).getPeer());
    }

    @Ptr
    protected native long g_dbus_message_new_method_error(
        @Ptr
        long method_call_message,
        @Ptr
        long error_name,
        @Ptr
        long error_message_format, Object... varargs);

    public Pointer new_method_error(Pointer error_name, Pointer error_message_format, Object... varargs) {
        return Pointer.pointerToAddress(this.g_dbus_message_new_method_error(Pointer.pointerTo(this, GDBusMessage.class).getPeer(), Pointer.getPeer(error_name), Pointer.getPeer(error_message_format), varargs));
    }

    @Ptr
    protected native long g_dbus_message_new_method_error_literal(
        @Ptr
        long method_call_message,
        @Ptr
        long error_name,
        @Ptr
        long error_message);

    public Pointer new_method_error_literal(Pointer error_name, Pointer error_message) {
        return Pointer.pointerToAddress(this.g_dbus_message_new_method_error_literal(Pointer.pointerTo(this, GDBusMessage.class).getPeer(), Pointer.getPeer(error_name), Pointer.getPeer(error_message)));
    }

    @Ptr
    protected native long g_dbus_message_new_method_reply(
        @Ptr
        long method_call_message);

    public Pointer new_method_reply() {
        return Pointer.pointerToAddress(this.g_dbus_message_new_method_reply(Pointer.pointerTo(this, GDBusMessage.class).getPeer()));
    }

    @Ptr
    protected native long g_dbus_message_print(
        @Ptr
        long message, long indent);

    public Pointer print(long indent) {
        return Pointer.pointerToAddress(this.g_dbus_message_print(Pointer.pointerTo(this, GDBusMessage.class).getPeer(), indent));
    }

    protected native void g_dbus_message_set_body(
        @Ptr
        long message,
        @Ptr
        long body);

    public void set_body(Pointer<GVariant> body) {
        this.g_dbus_message_set_body(Pointer.pointerTo(this, GDBusMessage.class).getPeer(), Pointer.getPeer(body));
    }

    protected native void g_dbus_message_set_destination(
        @Ptr
        long message,
        @Ptr
        long value);

    public void set_destination(Pointer value) {
        this.g_dbus_message_set_destination(Pointer.pointerTo(this, GDBusMessage.class).getPeer(), Pointer.getPeer(value));
    }

    protected native void g_dbus_message_set_error_name(
        @Ptr
        long message,
        @Ptr
        long value);

    public void set_error_name(Pointer value) {
        this.g_dbus_message_set_error_name(Pointer.pointerTo(this, GDBusMessage.class).getPeer(), Pointer.getPeer(value));
    }

    protected native void g_dbus_message_set_interface(
        @Ptr
        long message,
        @Ptr
        long value);

    public void set_interface(Pointer value) {
        this.g_dbus_message_set_interface(Pointer.pointerTo(this, GDBusMessage.class).getPeer(), Pointer.getPeer(value));
    }

    protected native void g_dbus_message_set_member(
        @Ptr
        long message,
        @Ptr
        long value);

    public void set_member(Pointer value) {
        this.g_dbus_message_set_member(Pointer.pointerTo(this, GDBusMessage.class).getPeer(), Pointer.getPeer(value));
    }

    protected native void g_dbus_message_set_num_unix_fds(
        @Ptr
        long message, long value);

    public void set_num_unix_fds(long value) {
        this.g_dbus_message_set_num_unix_fds(Pointer.pointerTo(this, GDBusMessage.class).getPeer(), value);
    }

    protected native void g_dbus_message_set_path(
        @Ptr
        long message,
        @Ptr
        long value);

    public void set_path(Pointer value) {
        this.g_dbus_message_set_path(Pointer.pointerTo(this, GDBusMessage.class).getPeer(), Pointer.getPeer(value));
    }

    protected native void g_dbus_message_set_reply_serial(
        @Ptr
        long message, long value);

    public void set_reply_serial(long value) {
        this.g_dbus_message_set_reply_serial(Pointer.pointerTo(this, GDBusMessage.class).getPeer(), value);
    }

    protected native void g_dbus_message_set_sender(
        @Ptr
        long message,
        @Ptr
        long value);

    public void set_sender(Pointer value) {
        this.g_dbus_message_set_sender(Pointer.pointerTo(this, GDBusMessage.class).getPeer(), Pointer.getPeer(value));
    }

    protected native void g_dbus_message_set_serial(
        @Ptr
        long message, long serial);

    public void set_serial(long serial) {
        this.g_dbus_message_set_serial(Pointer.pointerTo(this, GDBusMessage.class).getPeer(), serial);
    }

    protected native void g_dbus_message_set_signature(
        @Ptr
        long message,
        @Ptr
        long value);

    public void set_signature(Pointer value) {
        this.g_dbus_message_set_signature(Pointer.pointerTo(this, GDBusMessage.class).getPeer(), Pointer.getPeer(value));
    }

    protected native void g_dbus_message_set_unix_fd_list(
        @Ptr
        long message,
        @Ptr
        long fd_list);

    public void set_unix_fd_list(Pointer fd_list) {
        this.g_dbus_message_set_unix_fd_list(Pointer.pointerTo(this, GDBusMessage.class).getPeer(), Pointer.getPeer(fd_list));
    }

    @Ptr
    protected native long g_dbus_message_to_blob(
        @Ptr
        long message,
        @Ptr
        long out_size, IntValuedEnum<GDBusCapabilityFlags> capabilities);

    public Pointer<Short> to_blob(Pointer<Long> out_size, IntValuedEnum<GDBusCapabilityFlags> capabilities) {
        return Pointer.pointerToAddress(this.g_dbus_message_to_blob(Pointer.pointerTo(this, GDBusMessage.class).getPeer(), Pointer.getPeer(out_size), capabilities), Short.class);
    }

    protected native boolean g_dbus_message_to_gerror(
        @Ptr
        long message);

    public boolean to_gerror() {
        return this.g_dbus_message_to_gerror(Pointer.pointerTo(this, GDBusMessage.class).getPeer());
    }

    protected native IntValuedEnum<GDBusMessageFlags> g_dbus_message_get_flags(
        @Ptr
        long message);

    public IntValuedEnum<GDBusMessageFlags> get_flags() {
        return this.g_dbus_message_get_flags(Pointer.pointerTo(this, GDBusMessage.class).getPeer());
    }

    protected native void g_dbus_message_set_message_type(
        @Ptr
        long message, IntValuedEnum<GDBusMessageType> type);

    public void set_message_type(IntValuedEnum<GDBusMessageType> type) {
        this.g_dbus_message_set_message_type(Pointer.pointerTo(this, GDBusMessage.class).getPeer(), type);
    }

    protected native void g_dbus_message_set_flags(
        @Ptr
        long message, IntValuedEnum<GDBusMessageFlags> flags);

    public void set_flags(IntValuedEnum<GDBusMessageFlags> flags) {
        this.g_dbus_message_set_flags(Pointer.pointerTo(this, GDBusMessage.class).getPeer(), flags);
    }

    protected native void g_dbus_message_set_header(
        @Ptr
        long message, IntValuedEnum<GDBusMessageHeaderField> header_field,
        @Ptr
        long value);

    public void set_header(IntValuedEnum<GDBusMessageHeaderField> header_field, Pointer<GVariant> value) {
        this.g_dbus_message_set_header(Pointer.pointerTo(this, GDBusMessage.class).getPeer(), header_field, Pointer.getPeer(value));
    }

    protected native IntValuedEnum<GDBusMessageByteOrder> g_dbus_message_get_byte_order(
        @Ptr
        long message);

    public IntValuedEnum<GDBusMessageByteOrder> get_byte_order() {
        return this.g_dbus_message_get_byte_order(Pointer.pointerTo(this, GDBusMessage.class).getPeer());
    }

    protected native void g_dbus_message_set_byte_order(
        @Ptr
        long message, IntValuedEnum<GDBusMessageByteOrder> byte_order);

    public void set_byte_order(IntValuedEnum<GDBusMessageByteOrder> byte_order) {
        this.g_dbus_message_set_byte_order(Pointer.pointerTo(this, GDBusMessage.class).getPeer(), byte_order);
    }

    protected native IntValuedEnum<GDBusMessageType> g_dbus_message_get_message_type(
        @Ptr
        long message);

    public IntValuedEnum<GDBusMessageType> get_message_type() {
        return this.g_dbus_message_get_message_type(Pointer.pointerTo(this, GDBusMessage.class).getPeer());
    }

    @Ptr
    protected native long g_dbus_message_get_header(
        @Ptr
        long message, IntValuedEnum<GDBusMessageHeaderField> header_field);

    public Pointer<GVariant> get_header(IntValuedEnum<GDBusMessageHeaderField> header_field) {
        return Pointer.pointerToAddress(this.g_dbus_message_get_header(Pointer.pointerTo(this, GDBusMessage.class).getPeer(), header_field), GVariant.class);
    }

}
