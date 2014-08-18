
package generated;

import generated.glib20.glib.GSource;
import generated.glib20.glib.GVariant;
import generated.glib20.glib.GVariantType;
import generated.gobject20.gobject.GClosure;
import generated.gobject20.gobject.GConnectFlags;
import generated.gobject20.gobject.GEnumClass;
import generated.gobject20.gobject.GEnumValue;
import generated.gobject20.gobject.GFlagsClass;
import generated.gobject20.gobject.GFlagsValue;
import generated.gobject20.gobject.GInterfaceInfo;
import generated.gobject20.gobject.GParamFlags;
import generated.gobject20.gobject.GParamSpec;
import generated.gobject20.gobject.GParamSpecPool;
import generated.gobject20.gobject.GParamSpecTypeInfo;
import generated.gobject20.gobject.GSignalInvocationHint;
import generated.gobject20.gobject.GSignalQuery;
import generated.gobject20.gobject.GTypeClass;
import generated.gobject20.gobject.GTypeDebugFlags;
import generated.gobject20.gobject.GTypeFlags;
import generated.gobject20.gobject.GTypeFundamentalInfo;
import generated.gobject20.gobject.GTypeInfo;
import generated.gobject20.gobject.GTypeInstance;
import generated.gobject20.gobject.GTypeQuery;
import generated.gobject20.gobject.GTypeValueTable;
import generated.gobject20.gobject.GValue;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gobject-2.0")
public class GObject {


    static {
        BridJ.register();
    }

    @Ptr
    protected static native long g_signal_name(long signal_id);

    public static Pointer signal_name(long signal_id) {
        return Pointer.pointerToAddress(GObject.g_signal_name(signal_id));
    }

    protected static native void g_cclosure_marshal_VOID__STRING(
        @Ptr
        long closure,
        @Ptr
        long return_value, long n_param_values,
        @Ptr
        long param_values,
        @Ptr
        long invocation_hint,
        @Ptr
        long marshal_data);

    public static void cclosure_marshal_VOID__STRING(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        GObject.g_cclosure_marshal_VOID__STRING(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), Pointer.getPeer(invocation_hint), Pointer.getPeer(marshal_data));
    }

    @Ptr
    protected static native long g_param_spec_uint64(
        @Ptr
        long name,
        @Ptr
        long nick,
        @Ptr
        long blurb, long minimum, long maximum, long default_value, IntValuedEnum<GParamFlags> flags);

    public static Pointer<GParamSpec> param_spec_uint64(Pointer name, Pointer nick, Pointer blurb, long minimum, long maximum, long default_value, IntValuedEnum<GParamFlags> flags) {
        return Pointer.pointerToAddress(GObject.g_param_spec_uint64(Pointer.getPeer(name), Pointer.getPeer(nick), Pointer.getPeer(blurb), minimum, maximum, default_value, flags), GParamSpec.class);
    }

    protected static native void g_cclosure_marshal_VOID__UINT_POINTER(
        @Ptr
        long closure,
        @Ptr
        long return_value, long n_param_values,
        @Ptr
        long param_values,
        @Ptr
        long invocation_hint,
        @Ptr
        long marshal_data);

    public static void cclosure_marshal_VOID__UINT_POINTER(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        GObject.g_cclosure_marshal_VOID__UINT_POINTER(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), Pointer.getPeer(invocation_hint), Pointer.getPeer(marshal_data));
    }

    @Ptr
    protected static native long g_param_spec_float(
        @Ptr
        long name,
        @Ptr
        long nick,
        @Ptr
        long blurb, float minimum, float maximum, float default_value, IntValuedEnum<GParamFlags> flags);

    public static Pointer<GParamSpec> param_spec_float(Pointer name, Pointer nick, Pointer blurb, float minimum, float maximum, float default_value, IntValuedEnum<GParamFlags> flags) {
        return Pointer.pointerToAddress(GObject.g_param_spec_float(Pointer.getPeer(name), Pointer.getPeer(nick), Pointer.getPeer(blurb), minimum, maximum, default_value, flags), GParamSpec.class);
    }

    protected static native void g_cclosure_marshal_STRING__OBJECT_POINTER(
        @Ptr
        long closure,
        @Ptr
        long return_value, long n_param_values,
        @Ptr
        long param_values,
        @Ptr
        long invocation_hint,
        @Ptr
        long marshal_data);

    public static void cclosure_marshal_STRING__OBJECT_POINTER(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        GObject.g_cclosure_marshal_STRING__OBJECT_POINTER(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), Pointer.getPeer(invocation_hint), Pointer.getPeer(marshal_data));
    }

    protected static native boolean g_signal_accumulator_first_wins(
        @Ptr
        long ihint,
        @Ptr
        long return_accu,
        @Ptr
        long handler_return,
        @Ptr
        long dummy);

    public static boolean signal_accumulator_first_wins(Pointer<GSignalInvocationHint> ihint, Pointer<GValue> return_accu, Pointer<GValue> handler_return, Pointer dummy) {
        return GObject.g_signal_accumulator_first_wins(Pointer.getPeer(ihint), Pointer.getPeer(return_accu), Pointer.getPeer(handler_return), Pointer.getPeer(dummy));
    }

    public static native long g_gtype_get_type();

    @Ptr
    protected static native long g_type_name_from_instance(
        @Ptr
        long instance);

    public static Pointer type_name_from_instance(Pointer<GTypeInstance> instance) {
        return Pointer.pointerToAddress(GObject.g_type_name_from_instance(Pointer.getPeer(instance)));
    }

    protected static native long g_type_register_static(long parent_type,
        @Ptr
        long type_name,
        @Ptr
        long info, IntValuedEnum<GTypeFlags> flags);

    public static long type_register_static(long parent_type, Pointer type_name, Pointer<GTypeInfo> info, IntValuedEnum<GTypeFlags> flags) {
        return GObject.g_type_register_static(parent_type, Pointer.getPeer(type_name), Pointer.getPeer(info), flags);
    }

    protected static native void g_cclosure_marshal_VOID__UINT(
        @Ptr
        long closure,
        @Ptr
        long return_value, long n_param_values,
        @Ptr
        long param_values,
        @Ptr
        long invocation_hint,
        @Ptr
        long marshal_data);

    public static void cclosure_marshal_VOID__UINT(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        GObject.g_cclosure_marshal_VOID__UINT(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), Pointer.getPeer(invocation_hint), Pointer.getPeer(marshal_data));
    }

    protected static native void g_type_add_interface_dynamic(long instance_type, long interface_type,
        @Ptr
        long plugin);

    public static void type_add_interface_dynamic(long instance_type, long interface_type, Pointer<Object> plugin) {
        GObject.g_type_add_interface_dynamic(instance_type, interface_type, Pointer.getPeer(plugin));
    }

    public static native long g_type_next_base(long leaf_type, long root_type);

    @Ptr
    protected static native long g_cclosure_new_object(
        @Ptr
        long callback_func,
        @Ptr
        long object);

    public static Pointer<GClosure> cclosure_new_object(Pointer callback_func, Pointer<generated.gobject20.gobject.GObject> object) {
        return Pointer.pointerToAddress(GObject.g_cclosure_new_object(Pointer.getPeer(callback_func), Pointer.getPeer(object)), GClosure.class);
    }

    @Ptr
    protected static native long g_param_spec_pointer(
        @Ptr
        long name,
        @Ptr
        long nick,
        @Ptr
        long blurb, IntValuedEnum<GParamFlags> flags);

    public static Pointer<GParamSpec> param_spec_pointer(Pointer name, Pointer nick, Pointer blurb, IntValuedEnum<GParamFlags> flags) {
        return Pointer.pointerToAddress(GObject.g_param_spec_pointer(Pointer.getPeer(name), Pointer.getPeer(nick), Pointer.getPeer(blurb), flags), GParamSpec.class);
    }

    @Ptr
    protected static native long g_type_get_qdata(long type, long quark);

    public static Pointer type_get_qdata(long type, long quark) {
        return Pointer.pointerToAddress(GObject.g_type_get_qdata(type, quark));
    }

    @Ptr
    protected static native long g_param_spec_uchar(
        @Ptr
        long name,
        @Ptr
        long nick,
        @Ptr
        long blurb, short minimum, short maximum, short default_value, IntValuedEnum<GParamFlags> flags);

    public static Pointer<GParamSpec> param_spec_uchar(Pointer name, Pointer nick, Pointer blurb, short minimum, short maximum, short default_value, IntValuedEnum<GParamFlags> flags) {
        return Pointer.pointerToAddress(GObject.g_param_spec_uchar(Pointer.getPeer(name), Pointer.getPeer(nick), Pointer.getPeer(blurb), minimum, maximum, default_value, flags), GParamSpec.class);
    }

    public static native long g_type_qname(long type);

    public static native int g_type_add_instance_private(long class_type, long private_size);

    @Ptr
    protected static native long g_cclosure_new_swap(
        @Ptr
        long callback_func,
        @Ptr
        long user_data,
        @Ptr
        long destroy_data);

    public static Pointer<GClosure> cclosure_new_swap(Pointer callback_func, Pointer user_data, Pointer destroy_data) {
        return Pointer.pointerToAddress(GObject.g_cclosure_new_swap(Pointer.getPeer(callback_func), Pointer.getPeer(user_data), Pointer.getPeer(destroy_data)), GClosure.class);
    }

    protected static native void g_signal_chain_from_overridden(
        @Ptr
        long instance_and_params,
        @Ptr
        long return_value);

    public static void signal_chain_from_overridden(Pointer<GValue> instance_and_params, Pointer<GValue> return_value) {
        GObject.g_signal_chain_from_overridden(Pointer.getPeer(instance_and_params), Pointer.getPeer(return_value));
    }

    @Ptr
    protected static native long g_param_spec_object(
        @Ptr
        long name,
        @Ptr
        long nick,
        @Ptr
        long blurb, long object_type, IntValuedEnum<GParamFlags> flags);

    public static Pointer<GParamSpec> param_spec_object(Pointer name, Pointer nick, Pointer blurb, long object_type, IntValuedEnum<GParamFlags> flags) {
        return Pointer.pointerToAddress(GObject.g_param_spec_object(Pointer.getPeer(name), Pointer.getPeer(nick), Pointer.getPeer(blurb), object_type, flags), GParamSpec.class);
    }

    protected static native void g_cclosure_marshal_VOID__ENUM(
        @Ptr
        long closure,
        @Ptr
        long return_value, long n_param_values,
        @Ptr
        long param_values,
        @Ptr
        long invocation_hint,
        @Ptr
        long marshal_data);

    public static void cclosure_marshal_VOID__ENUM(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        GObject.g_cclosure_marshal_VOID__ENUM(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), Pointer.getPeer(invocation_hint), Pointer.getPeer(marshal_data));
    }

    protected static native void g_type_class_adjust_private_offset(
        @Ptr
        long g_class,
        @Ptr
        long private_size_or_offset);

    public static void type_class_adjust_private_offset(Pointer g_class, Pointer<Integer> private_size_or_offset) {
        GObject.g_type_class_adjust_private_offset(Pointer.getPeer(g_class), Pointer.getPeer(private_size_or_offset));
    }

    protected static native long g_signal_connect_object(
        @Ptr
        long instance,
        @Ptr
        long detailed_signal,
        @Ptr
        long c_handler,
        @Ptr
        long gobject, IntValuedEnum<GConnectFlags> connect_flags);

    public static long signal_connect_object(Pointer instance, Pointer detailed_signal, Pointer c_handler, Pointer gobject, IntValuedEnum<GConnectFlags> connect_flags) {
        return GObject.g_signal_connect_object(Pointer.getPeer(instance), Pointer.getPeer(detailed_signal), Pointer.getPeer(c_handler), Pointer.getPeer(gobject), connect_flags);
    }

    @Ptr
    protected static native long g_type_check_class_cast(
        @Ptr
        long g_class, long is_a_type);

    public static Pointer<GTypeClass> type_check_class_cast(Pointer<GTypeClass> g_class, long is_a_type) {
        return Pointer.pointerToAddress(GObject.g_type_check_class_cast(Pointer.getPeer(g_class), is_a_type), GTypeClass.class);
    }

    protected static native void g_cclosure_marshal_VOID__BOXED(
        @Ptr
        long closure,
        @Ptr
        long return_value, long n_param_values,
        @Ptr
        long param_values,
        @Ptr
        long invocation_hint,
        @Ptr
        long marshal_data);

    public static void cclosure_marshal_VOID__BOXED(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        GObject.g_cclosure_marshal_VOID__BOXED(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), Pointer.getPeer(invocation_hint), Pointer.getPeer(marshal_data));
    }

    @Ptr
    protected static native long g_flags_get_value_by_name(
        @Ptr
        long flags_class,
        @Ptr
        long name);

    public static Pointer<GFlagsValue> flags_get_value_by_name(Pointer<GFlagsClass> flags_class, Pointer name) {
        return Pointer.pointerToAddress(GObject.g_flags_get_value_by_name(Pointer.getPeer(flags_class), Pointer.getPeer(name)), GFlagsValue.class);
    }

    protected static native int g_param_values_cmp(
        @Ptr
        long pspec,
        @Ptr
        long value1,
        @Ptr
        long value2);

    public static int param_values_cmp(Pointer<GParamSpec> pspec, Pointer<GValue> value1, Pointer<GValue> value2) {
        return GObject.g_param_values_cmp(Pointer.getPeer(pspec), Pointer.getPeer(value1), Pointer.getPeer(value2));
    }

    protected static native long g_flags_register_static(
        @Ptr
        long name,
        @Ptr
        long const_static_values);

    public static long flags_register_static(Pointer name, Pointer<GFlagsValue> const_static_values) {
        return GObject.g_flags_register_static(Pointer.getPeer(name), Pointer.getPeer(const_static_values));
    }

    @Ptr
    protected static native long g_param_spec_uint(
        @Ptr
        long name,
        @Ptr
        long nick,
        @Ptr
        long blurb, long minimum, long maximum, long default_value, IntValuedEnum<GParamFlags> flags);

    public static Pointer<GParamSpec> param_spec_uint(Pointer name, Pointer nick, Pointer blurb, long minimum, long maximum, long default_value, IntValuedEnum<GParamFlags> flags) {
        return Pointer.pointerToAddress(GObject.g_param_spec_uint(Pointer.getPeer(name), Pointer.getPeer(nick), Pointer.getPeer(blurb), minimum, maximum, default_value, flags), GParamSpec.class);
    }

    public static native long g_type_fundamental(long type_id);

    protected static native void g_param_value_set_default(
        @Ptr
        long pspec,
        @Ptr
        long value);

    public static void param_value_set_default(Pointer<GParamSpec> pspec, Pointer<GValue> value) {
        GObject.g_param_value_set_default(Pointer.getPeer(pspec), Pointer.getPeer(value));
    }

    public static native boolean g_type_check_is_value_type(long type);

    @Ptr
    protected static native long g_type_check_instance_cast(
        @Ptr
        long instance, long iface_type);

    public static Pointer<GTypeInstance> type_check_instance_cast(Pointer<GTypeInstance> instance, long iface_type) {
        return Pointer.pointerToAddress(GObject.g_type_check_instance_cast(Pointer.getPeer(instance), iface_type), GTypeInstance.class);
    }

    @Ptr
    protected static native long g_type_interfaces(long type,
        @Ptr
        long n_interfaces);

    public static Pointer<Long> type_interfaces(long type, Pointer<Long> n_interfaces) {
        return Pointer.pointerToAddress(GObject.g_type_interfaces(type, Pointer.getPeer(n_interfaces)), Long.class);
    }

    public static native void g_type_interface_add_prerequisite(long interface_type, long prerequisite_type);

    public static native boolean g_type_test_flags(long type, long flags);

    protected static native void g_type_add_interface_check(
        @Ptr
        long check_data,
        @Ptr
        long check_func);

    public static void type_add_interface_check(Pointer check_data, Pointer check_func) {
        GObject.g_type_add_interface_check(Pointer.getPeer(check_data), Pointer.getPeer(check_func));
    }

    protected static native long g_type_from_name(
        @Ptr
        long name);

    public static long type_from_name(Pointer name) {
        return GObject.g_type_from_name(Pointer.getPeer(name));
    }

    @Ptr
    protected static native long g_param_spec_variant(
        @Ptr
        long name,
        @Ptr
        long nick,
        @Ptr
        long blurb,
        @Ptr
        long type,
        @Ptr
        long default_value, IntValuedEnum<GParamFlags> flags);

    public static Pointer<GParamSpec> param_spec_variant(Pointer name, Pointer nick, Pointer blurb, Pointer<GVariantType> type, Pointer<GVariant> default_value, IntValuedEnum<GParamFlags> flags) {
        return Pointer.pointerToAddress(GObject.g_param_spec_variant(Pointer.getPeer(name), Pointer.getPeer(nick), Pointer.getPeer(blurb), Pointer.getPeer(type), Pointer.getPeer(default_value), flags), GParamSpec.class);
    }

    @Ptr
    protected static native long g_flags_get_first_value(
        @Ptr
        long flags_class, long value);

    public static Pointer<GFlagsValue> flags_get_first_value(Pointer<GFlagsClass> flags_class, long value) {
        return Pointer.pointerToAddress(GObject.g_flags_get_first_value(Pointer.getPeer(flags_class), value), GFlagsValue.class);
    }

    @Ptr
    protected static native long g_param_spec_string(
        @Ptr
        long name,
        @Ptr
        long nick,
        @Ptr
        long blurb,
        @Ptr
        long default_value, IntValuedEnum<GParamFlags> flags);

    public static Pointer<GParamSpec> param_spec_string(Pointer name, Pointer nick, Pointer blurb, Pointer default_value, IntValuedEnum<GParamFlags> flags) {
        return Pointer.pointerToAddress(GObject.g_param_spec_string(Pointer.getPeer(name), Pointer.getPeer(nick), Pointer.getPeer(blurb), Pointer.getPeer(default_value), flags), GParamSpec.class);
    }

    protected static native void g_cclosure_marshal_VOID__OBJECT(
        @Ptr
        long closure,
        @Ptr
        long return_value, long n_param_values,
        @Ptr
        long param_values,
        @Ptr
        long invocation_hint,
        @Ptr
        long marshal_data);

    public static void cclosure_marshal_VOID__OBJECT(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        GObject.g_cclosure_marshal_VOID__OBJECT(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), Pointer.getPeer(invocation_hint), Pointer.getPeer(marshal_data));
    }

    protected static native void g_cclosure_marshal_VOID__UCHAR(
        @Ptr
        long closure,
        @Ptr
        long return_value, long n_param_values,
        @Ptr
        long param_values,
        @Ptr
        long invocation_hint,
        @Ptr
        long marshal_data);

    public static void cclosure_marshal_VOID__UCHAR(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        GObject.g_cclosure_marshal_VOID__UCHAR(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), Pointer.getPeer(invocation_hint), Pointer.getPeer(marshal_data));
    }

    @Ptr
    protected static native long g_boxed_copy(long boxed_type,
        @Ptr
        long src_boxed);

    public static Pointer boxed_copy(long boxed_type, Pointer src_boxed) {
        return Pointer.pointerToAddress(GObject.g_boxed_copy(boxed_type, Pointer.getPeer(src_boxed)));
    }

    @Ptr
    protected static native long g_param_spec_value_array(
        @Ptr
        long name,
        @Ptr
        long nick,
        @Ptr
        long blurb,
        @Ptr
        long element_spec, IntValuedEnum<GParamFlags> flags);

    public static Pointer<GParamSpec> param_spec_value_array(Pointer name, Pointer nick, Pointer blurb, Pointer<GParamSpec> element_spec, IntValuedEnum<GParamFlags> flags) {
        return Pointer.pointerToAddress(GObject.g_param_spec_value_array(Pointer.getPeer(name), Pointer.getPeer(nick), Pointer.getPeer(blurb), Pointer.getPeer(element_spec), flags), GParamSpec.class);
    }

    protected static native void g_cclosure_marshal_VOID__CHAR(
        @Ptr
        long closure,
        @Ptr
        long return_value, long n_param_values,
        @Ptr
        long param_values,
        @Ptr
        long invocation_hint,
        @Ptr
        long marshal_data);

    public static void cclosure_marshal_VOID__CHAR(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        GObject.g_cclosure_marshal_VOID__CHAR(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), Pointer.getPeer(invocation_hint), Pointer.getPeer(marshal_data));
    }

    protected static native void g_cclosure_marshal_VOID__BOOLEAN(
        @Ptr
        long closure,
        @Ptr
        long return_value, long n_param_values,
        @Ptr
        long param_values,
        @Ptr
        long invocation_hint,
        @Ptr
        long marshal_data);

    public static void cclosure_marshal_VOID__BOOLEAN(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        GObject.g_cclosure_marshal_VOID__BOOLEAN(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), Pointer.getPeer(invocation_hint), Pointer.getPeer(marshal_data));
    }

    @Ptr
    protected static native long g_signal_type_cclosure_new(long itype, long struct_offset);

    public static Pointer<GClosure> signal_type_cclosure_new(long itype, long struct_offset) {
        return Pointer.pointerToAddress(GObject.g_signal_type_cclosure_new(itype, struct_offset), GClosure.class);
    }

    public static native boolean g_value_type_compatible(long src_type, long dest_type);

    protected static native void g_type_class_add_private(
        @Ptr
        long g_class, long private_size);

    public static void type_class_add_private(Pointer g_class, long private_size) {
        GObject.g_type_class_add_private(Pointer.getPeer(g_class), private_size);
    }

    protected static native long g_pointer_type_register_static(
        @Ptr
        long name);

    public static long pointer_type_register_static(Pointer name) {
        return GObject.g_pointer_type_register_static(Pointer.getPeer(name));
    }

    @Ptr
    protected static native long g_param_spec_boolean(
        @Ptr
        long name,
        @Ptr
        long nick,
        @Ptr
        long blurb, boolean default_value, IntValuedEnum<GParamFlags> flags);

    public static Pointer<GParamSpec> param_spec_boolean(Pointer name, Pointer nick, Pointer blurb, boolean default_value, IntValuedEnum<GParamFlags> flags) {
        return Pointer.pointerToAddress(GObject.g_param_spec_boolean(Pointer.getPeer(name), Pointer.getPeer(nick), Pointer.getPeer(blurb), default_value, flags), GParamSpec.class);
    }

    @Ptr
    protected static native long g_type_name(long type);

    public static Pointer type_name(long type) {
        return Pointer.pointerToAddress(GObject.g_type_name(type));
    }

    @Ptr
    protected static native long g_type_get_plugin(long type);

    public static Pointer<Object> type_get_plugin(long type) {
        return Pointer.pointerToAddress(GObject.g_type_get_plugin(type), Object.class);
    }

    protected static native long g_param_type_register_static(
        @Ptr
        long name,
        @Ptr
        long pspec_info);

    public static long param_type_register_static(Pointer name, Pointer<GParamSpecTypeInfo> pspec_info) {
        return GObject.g_param_type_register_static(Pointer.getPeer(name), Pointer.getPeer(pspec_info));
    }

    protected static native void g_signal_query(long signal_id,
        @Ptr
        long query);

    public static void signal_query(long signal_id, Pointer<GSignalQuery> query) {
        GObject.g_signal_query(signal_id, Pointer.getPeer(query));
    }

    public static native void g_type_add_class_private(long class_type, long private_size);

    protected static native void g_signal_emitv(
        @Ptr
        long instance_and_params, long signal_id, long detail,
        @Ptr
        long return_value);

    public static void signal_emitv(Pointer<GValue> instance_and_params, long signal_id, long detail, Pointer<GValue> return_value) {
        GObject.g_signal_emitv(Pointer.getPeer(instance_and_params), signal_id, detail, Pointer.getPeer(return_value));
    }

    protected static native void g_type_remove_class_cache_func(
        @Ptr
        long cache_data,
        @Ptr
        long cache_func);

    public static void type_remove_class_cache_func(Pointer cache_data, Pointer cache_func) {
        GObject.g_type_remove_class_cache_func(Pointer.getPeer(cache_data), Pointer.getPeer(cache_func));
    }

    protected static native void g_cclosure_marshal_VOID__FLAGS(
        @Ptr
        long closure,
        @Ptr
        long return_value, long n_param_values,
        @Ptr
        long param_values,
        @Ptr
        long invocation_hint,
        @Ptr
        long marshal_data);

    public static void cclosure_marshal_VOID__FLAGS(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        GObject.g_cclosure_marshal_VOID__FLAGS(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), Pointer.getPeer(invocation_hint), Pointer.getPeer(marshal_data));
    }

    protected static native void g_cclosure_marshal_VOID__FLOAT(
        @Ptr
        long closure,
        @Ptr
        long return_value, long n_param_values,
        @Ptr
        long param_values,
        @Ptr
        long invocation_hint,
        @Ptr
        long marshal_data);

    public static void cclosure_marshal_VOID__FLOAT(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        GObject.g_cclosure_marshal_VOID__FLOAT(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), Pointer.getPeer(invocation_hint), Pointer.getPeer(marshal_data));
    }

    public static native long g_type_depth(long type);

    protected static native void g_type_set_qdata(long type, long quark,
        @Ptr
        long data);

    public static void type_set_qdata(long type, long quark, Pointer data) {
        GObject.g_type_set_qdata(type, quark, Pointer.getPeer(data));
    }

    protected static native void g_cclosure_marshal_VOID__PARAM(
        @Ptr
        long closure,
        @Ptr
        long return_value, long n_param_values,
        @Ptr
        long param_values,
        @Ptr
        long invocation_hint,
        @Ptr
        long marshal_data);

    public static void cclosure_marshal_VOID__PARAM(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        GObject.g_cclosure_marshal_VOID__PARAM(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), Pointer.getPeer(invocation_hint), Pointer.getPeer(marshal_data));
    }

    protected static native void g_type_free_instance(
        @Ptr
        long instance);

    public static void type_free_instance(Pointer<GTypeInstance> instance) {
        GObject.g_type_free_instance(Pointer.getPeer(instance));
    }

    protected static native boolean g_type_check_value_holds(
        @Ptr
        long value, long type);

    public static boolean type_check_value_holds(Pointer<GValue> value, long type) {
        return GObject.g_type_check_value_holds(Pointer.getPeer(value), type);
    }

    @Ptr
    protected static native long g_param_spec_param(
        @Ptr
        long name,
        @Ptr
        long nick,
        @Ptr
        long blurb, long param_type, IntValuedEnum<GParamFlags> flags);

    public static Pointer<GParamSpec> param_spec_param(Pointer name, Pointer nick, Pointer blurb, long param_type, IntValuedEnum<GParamFlags> flags) {
        return Pointer.pointerToAddress(GObject.g_param_spec_param(Pointer.getPeer(name), Pointer.getPeer(nick), Pointer.getPeer(blurb), param_type, flags), GParamSpec.class);
    }

    protected static native void g_flags_complete_type_info(long g_flags_type,
        @Ptr
        long info,
        @Ptr
        long const_values);

    public static void flags_complete_type_info(long g_flags_type, Pointer<GTypeInfo> info, Pointer<GFlagsValue> const_values) {
        GObject.g_flags_complete_type_info(g_flags_type, Pointer.getPeer(info), Pointer.getPeer(const_values));
    }

    protected static native boolean g_param_value_convert(
        @Ptr
        long pspec,
        @Ptr
        long src_value,
        @Ptr
        long dest_value, boolean strict_validation);

    public static boolean param_value_convert(Pointer<GParamSpec> pspec, Pointer<GValue> src_value, Pointer<GValue> dest_value, boolean strict_validation) {
        return GObject.g_param_value_convert(Pointer.getPeer(pspec), Pointer.getPeer(src_value), Pointer.getPeer(dest_value), strict_validation);
    }

    protected static native void g_source_set_dummy_callback(
        @Ptr
        long source);

    public static void source_set_dummy_callback(Pointer<GSource> source) {
        GObject.g_source_set_dummy_callback(Pointer.getPeer(source));
    }

    @Ptr
    protected static native long g_param_spec_flags(
        @Ptr
        long name,
        @Ptr
        long nick,
        @Ptr
        long blurb, long flags_type, long default_value, IntValuedEnum<GParamFlags> flags);

    public static Pointer<GParamSpec> param_spec_flags(Pointer name, Pointer nick, Pointer blurb, long flags_type, long default_value, IntValuedEnum<GParamFlags> flags) {
        return Pointer.pointerToAddress(GObject.g_param_spec_flags(Pointer.getPeer(name), Pointer.getPeer(nick), Pointer.getPeer(blurb), flags_type, default_value, flags), GParamSpec.class);
    }

    protected static native boolean g_type_check_class_is_a(
        @Ptr
        long g_class, long is_a_type);

    public static boolean type_check_class_is_a(Pointer<GTypeClass> g_class, long is_a_type) {
        return GObject.g_type_check_class_is_a(Pointer.getPeer(g_class), is_a_type);
    }

    @Ptr
    protected static native long g_flags_get_value_by_nick(
        @Ptr
        long flags_class,
        @Ptr
        long nick);

    public static Pointer<GFlagsValue> flags_get_value_by_nick(Pointer<GFlagsClass> flags_class, Pointer nick) {
        return Pointer.pointerToAddress(GObject.g_flags_get_value_by_nick(Pointer.getPeer(flags_class), Pointer.getPeer(nick)), GFlagsValue.class);
    }

    @Ptr
    protected static native long g_type_value_table_peek(long type);

    public static Pointer<GTypeValueTable> type_value_table_peek(long type) {
        return Pointer.pointerToAddress(GObject.g_type_value_table_peek(type), GTypeValueTable.class);
    }

    @Ptr
    protected static native long g_param_spec_int(
        @Ptr
        long name,
        @Ptr
        long nick,
        @Ptr
        long blurb, int minimum, int maximum, int default_value, IntValuedEnum<GParamFlags> flags);

    public static Pointer<GParamSpec> param_spec_int(Pointer name, Pointer nick, Pointer blurb, int minimum, int maximum, int default_value, IntValuedEnum<GParamFlags> flags) {
        return Pointer.pointerToAddress(GObject.g_param_spec_int(Pointer.getPeer(name), Pointer.getPeer(nick), Pointer.getPeer(blurb), minimum, maximum, default_value, flags), GParamSpec.class);
    }

    protected static native long g_signal_add_emission_hook(long signal_id, long detail,
        @Ptr
        long hook_func,
        @Ptr
        long hook_data,
        @Ptr
        long data_destroy);

    public static long signal_add_emission_hook(long signal_id, long detail, Pointer hook_func, Pointer hook_data, Pointer data_destroy) {
        return GObject.g_signal_add_emission_hook(signal_id, detail, Pointer.getPeer(hook_func), Pointer.getPeer(hook_data), Pointer.getPeer(data_destroy));
    }

    @Ptr
    protected static native long g_param_spec_pool_new(boolean type_prefixing);

    public static Pointer<GParamSpecPool> param_spec_pool_new(boolean type_prefixing) {
        return Pointer.pointerToAddress(GObject.g_param_spec_pool_new(type_prefixing), GParamSpecPool.class);
    }

    protected static native void g_cclosure_marshal_BOOLEAN__FLAGS(
        @Ptr
        long closure,
        @Ptr
        long return_value, long n_param_values,
        @Ptr
        long param_values,
        @Ptr
        long invocation_hint,
        @Ptr
        long marshal_data);

    public static void cclosure_marshal_BOOLEAN__FLAGS(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        GObject.g_cclosure_marshal_BOOLEAN__FLAGS(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), Pointer.getPeer(invocation_hint), Pointer.getPeer(marshal_data));
    }

    protected static native void g_cclosure_marshal_VOID__ULONG(
        @Ptr
        long closure,
        @Ptr
        long return_value, long n_param_values,
        @Ptr
        long param_values,
        @Ptr
        long invocation_hint,
        @Ptr
        long marshal_data);

    public static void cclosure_marshal_VOID__ULONG(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        GObject.g_cclosure_marshal_VOID__ULONG(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), Pointer.getPeer(invocation_hint), Pointer.getPeer(marshal_data));
    }

    @Ptr
    protected static native long g_strdup_value_contents(
        @Ptr
        long value);

    public static Pointer strdup_value_contents(Pointer<GValue> value) {
        return Pointer.pointerToAddress(GObject.g_strdup_value_contents(Pointer.getPeer(value)));
    }

    @Ptr
    protected static native long g_signal_list_ids(long itype,
        @Ptr
        long n_ids);

    public static Pointer<Long> signal_list_ids(long itype, Pointer<Long> n_ids) {
        return Pointer.pointerToAddress(GObject.g_signal_list_ids(itype, Pointer.getPeer(n_ids)), Long.class);
    }

    protected static native void g_type_add_class_cache_func(
        @Ptr
        long cache_data,
        @Ptr
        long cache_func);

    public static void type_add_class_cache_func(Pointer cache_data, Pointer cache_func) {
        GObject.g_type_add_class_cache_func(Pointer.getPeer(cache_data), Pointer.getPeer(cache_func));
    }

    @Ptr
    protected static native long g_param_spec_long(
        @Ptr
        long name,
        @Ptr
        long nick,
        @Ptr
        long blurb, long minimum, long maximum, long default_value, IntValuedEnum<GParamFlags> flags);

    public static Pointer<GParamSpec> param_spec_long(Pointer name, Pointer nick, Pointer blurb, long minimum, long maximum, long default_value, IntValuedEnum<GParamFlags> flags) {
        return Pointer.pointerToAddress(GObject.g_param_spec_long(Pointer.getPeer(name), Pointer.getPeer(nick), Pointer.getPeer(blurb), minimum, maximum, default_value, flags), GParamSpec.class);
    }

    protected static native long g_boxed_type_register_static(
        @Ptr
        long name,
        @Ptr
        long boxed_copy,
        @Ptr
        long boxed_free);

    public static long boxed_type_register_static(Pointer name, Pointer boxed_copy, Pointer boxed_free) {
        return GObject.g_boxed_type_register_static(Pointer.getPeer(name), Pointer.getPeer(boxed_copy), Pointer.getPeer(boxed_free));
    }

    protected static native void g_cclosure_marshal_BOOLEAN__BOXED_BOXED(
        @Ptr
        long closure,
        @Ptr
        long return_value, long n_param_values,
        @Ptr
        long param_values,
        @Ptr
        long invocation_hint,
        @Ptr
        long marshal_data);

    public static void cclosure_marshal_BOOLEAN__BOXED_BOXED(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        GObject.g_cclosure_marshal_BOOLEAN__BOXED_BOXED(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), Pointer.getPeer(invocation_hint), Pointer.getPeer(marshal_data));
    }

    protected static native void g_cclosure_marshal_generic(
        @Ptr
        long closure,
        @Ptr
        long return_gvalue, long n_param_values,
        @Ptr
        long param_values,
        @Ptr
        long invocation_hint,
        @Ptr
        long marshal_data);

    public static void cclosure_marshal_generic(Pointer<GClosure> closure, Pointer<GValue> return_gvalue, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        GObject.g_cclosure_marshal_generic(Pointer.getPeer(closure), Pointer.getPeer(return_gvalue), n_param_values, Pointer.getPeer(param_values), Pointer.getPeer(invocation_hint), Pointer.getPeer(marshal_data));
    }

    protected static native boolean g_param_value_validate(
        @Ptr
        long pspec,
        @Ptr
        long value);

    public static boolean param_value_validate(Pointer<GParamSpec> pspec, Pointer<GValue> value) {
        return GObject.g_param_value_validate(Pointer.getPeer(pspec), Pointer.getPeer(value));
    }

    public static native void g_signal_remove_emission_hook(long signal_id, long hook_id);

    protected static native int g_type_class_get_instance_private_offset(
        @Ptr
        long g_class);

    public static int type_class_get_instance_private_offset(Pointer g_class) {
        return GObject.g_type_class_get_instance_private_offset(Pointer.getPeer(g_class));
    }

    protected static native void g_source_set_closure(
        @Ptr
        long source,
        @Ptr
        long closure);

    public static void source_set_closure(Pointer<GSource> source, Pointer<GClosure> closure) {
        GObject.g_source_set_closure(Pointer.getPeer(source), Pointer.getPeer(closure));
    }

    protected static native long g_type_register_fundamental(long type_id,
        @Ptr
        long type_name,
        @Ptr
        long info,
        @Ptr
        long finfo, IntValuedEnum<GTypeFlags> flags);

    public static long type_register_fundamental(long type_id, Pointer type_name, Pointer<GTypeInfo> info, Pointer<GTypeFundamentalInfo> finfo, IntValuedEnum<GTypeFlags> flags) {
        return GObject.g_type_register_fundamental(type_id, Pointer.getPeer(type_name), Pointer.getPeer(info), Pointer.getPeer(finfo), flags);
    }

    public static native void g_type_ensure(long type);

    public static native void g_type_init_with_debug_flags(IntValuedEnum<GTypeDebugFlags> debug_flags);

    @Ptr
    protected static native long g_param_spec_gtype(
        @Ptr
        long name,
        @Ptr
        long nick,
        @Ptr
        long blurb, long is_a_type, IntValuedEnum<GParamFlags> flags);

    public static Pointer<GParamSpec> param_spec_gtype(Pointer name, Pointer nick, Pointer blurb, long is_a_type, IntValuedEnum<GParamFlags> flags) {
        return Pointer.pointerToAddress(GObject.g_param_spec_gtype(Pointer.getPeer(name), Pointer.getPeer(nick), Pointer.getPeer(blurb), is_a_type, flags), GParamSpec.class);
    }

    protected static native boolean g_signal_parse_name(
        @Ptr
        long detailed_signal, long itype,
        @Ptr
        long signal_id_p,
        @Ptr
        long detail_p, boolean force_detail_quark);

    public static boolean signal_parse_name(Pointer detailed_signal, long itype, Pointer<Long> signal_id_p, Pointer<Long> detail_p, boolean force_detail_quark) {
        return GObject.g_signal_parse_name(Pointer.getPeer(detailed_signal), itype, Pointer.getPeer(signal_id_p), Pointer.getPeer(detail_p), force_detail_quark);
    }

    public static native void g_type_init();

    @Ptr
    protected static native long g_param_spec_ulong(
        @Ptr
        long name,
        @Ptr
        long nick,
        @Ptr
        long blurb, long minimum, long maximum, long default_value, IntValuedEnum<GParamFlags> flags);

    public static Pointer<GParamSpec> param_spec_ulong(Pointer name, Pointer nick, Pointer blurb, long minimum, long maximum, long default_value, IntValuedEnum<GParamFlags> flags) {
        return Pointer.pointerToAddress(GObject.g_param_spec_ulong(Pointer.getPeer(name), Pointer.getPeer(nick), Pointer.getPeer(blurb), minimum, maximum, default_value, flags), GParamSpec.class);
    }

    @Ptr
    protected static native long g_param_spec_override(
        @Ptr
        long name,
        @Ptr
        long overridden);

    public static Pointer<GParamSpec> param_spec_override(Pointer name, Pointer<GParamSpec> overridden) {
        return Pointer.pointerToAddress(GObject.g_param_spec_override(Pointer.getPeer(name), Pointer.getPeer(overridden)), GParamSpec.class);
    }

    protected static native void g_signal_override_class_handler(
        @Ptr
        long signal_name, long instance_type,
        @Ptr
        long class_handler);

    public static void signal_override_class_handler(Pointer signal_name, long instance_type, Pointer class_handler) {
        GObject.g_signal_override_class_handler(Pointer.getPeer(signal_name), instance_type, Pointer.getPeer(class_handler));
    }

    @Ptr
    protected static native long g_cclosure_new_object_swap(
        @Ptr
        long callback_func,
        @Ptr
        long object);

    public static Pointer<GClosure> cclosure_new_object_swap(Pointer callback_func, Pointer<generated.gobject20.gobject.GObject> object) {
        return Pointer.pointerToAddress(GObject.g_cclosure_new_object_swap(Pointer.getPeer(callback_func), Pointer.getPeer(object)), GClosure.class);
    }

    protected static native void g_cclosure_marshal_VOID__INT(
        @Ptr
        long closure,
        @Ptr
        long return_value, long n_param_values,
        @Ptr
        long param_values,
        @Ptr
        long invocation_hint,
        @Ptr
        long marshal_data);

    public static void cclosure_marshal_VOID__INT(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        GObject.g_cclosure_marshal_VOID__INT(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), Pointer.getPeer(invocation_hint), Pointer.getPeer(marshal_data));
    }

    @Ptr
    protected static native long g_enum_get_value_by_nick(
        @Ptr
        long enum_class,
        @Ptr
        long nick);

    public static Pointer<GEnumValue> enum_get_value_by_nick(Pointer<GEnumClass> enum_class, Pointer nick) {
        return Pointer.pointerToAddress(GObject.g_enum_get_value_by_nick(Pointer.getPeer(enum_class), Pointer.getPeer(nick)), GEnumValue.class);
    }

    protected static native void g_type_add_interface_static(long instance_type, long interface_type,
        @Ptr
        long info);

    public static void type_add_interface_static(long instance_type, long interface_type, Pointer<GInterfaceInfo> info) {
        GObject.g_type_add_interface_static(instance_type, interface_type, Pointer.getPeer(info));
    }

    protected static native void g_cclosure_marshal_VOID__DOUBLE(
        @Ptr
        long closure,
        @Ptr
        long return_value, long n_param_values,
        @Ptr
        long param_values,
        @Ptr
        long invocation_hint,
        @Ptr
        long marshal_data);

    public static void cclosure_marshal_VOID__DOUBLE(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        GObject.g_cclosure_marshal_VOID__DOUBLE(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), Pointer.getPeer(invocation_hint), Pointer.getPeer(marshal_data));
    }

    protected static native long g_type_register_static_simple(long parent_type,
        @Ptr
        long type_name, long class_size,
        @Ptr
        long class_init, long instance_size,
        @Ptr
        long instance_init, IntValuedEnum<GTypeFlags> flags);

    public static long type_register_static_simple(long parent_type, Pointer type_name, long class_size, Pointer class_init, long instance_size, Pointer instance_init, IntValuedEnum<GTypeFlags> flags) {
        return GObject.g_type_register_static_simple(parent_type, Pointer.getPeer(type_name), class_size, Pointer.getPeer(class_init), instance_size, Pointer.getPeer(instance_init), flags);
    }

    public static native long g_type_get_type_registration_serial();

    @Ptr
    protected static native long g_cclosure_new(
        @Ptr
        long callback_func,
        @Ptr
        long user_data,
        @Ptr
        long destroy_data);

    public static Pointer<GClosure> cclosure_new(Pointer callback_func, Pointer user_data, Pointer destroy_data) {
        return Pointer.pointerToAddress(GObject.g_cclosure_new(Pointer.getPeer(callback_func), Pointer.getPeer(user_data), Pointer.getPeer(destroy_data)), GClosure.class);
    }

    protected static native void g_type_remove_interface_check(
        @Ptr
        long check_data,
        @Ptr
        long check_func);

    public static void type_remove_interface_check(Pointer check_data, Pointer check_func) {
        GObject.g_type_remove_interface_check(Pointer.getPeer(check_data), Pointer.getPeer(check_func));
    }

    @Ptr
    protected static native long g_type_interface_get_plugin(long instance_type, long interface_type);

    public static Pointer<Object> type_interface_get_plugin(long instance_type, long interface_type) {
        return Pointer.pointerToAddress(GObject.g_type_interface_get_plugin(instance_type, interface_type), Object.class);
    }

    public static native boolean g_type_is_a(long type, long is_a_type);

    protected static native void g_clear_object(
        @Ptr
        long object_ptr);

    public static void clear_object(Pointer<Pointer<generated.gobject20.gobject.GObject>> object_ptr) {
        GObject.g_clear_object(Pointer.getPeer(object_ptr));
    }

    @Ptr
    protected static native long g_enum_get_value(
        @Ptr
        long enum_class, int value);

    public static Pointer<GEnumValue> enum_get_value(Pointer<GEnumClass> enum_class, int value) {
        return Pointer.pointerToAddress(GObject.g_enum_get_value(Pointer.getPeer(enum_class), value), GEnumValue.class);
    }

    @Ptr
    protected static native long g_param_spec_enum(
        @Ptr
        long name,
        @Ptr
        long nick,
        @Ptr
        long blurb, long enum_type, int default_value, IntValuedEnum<GParamFlags> flags);

    public static Pointer<GParamSpec> param_spec_enum(Pointer name, Pointer nick, Pointer blurb, long enum_type, int default_value, IntValuedEnum<GParamFlags> flags) {
        return Pointer.pointerToAddress(GObject.g_param_spec_enum(Pointer.getPeer(name), Pointer.getPeer(nick), Pointer.getPeer(blurb), enum_type, default_value, flags), GParamSpec.class);
    }

    protected static native void g_signal_override_class_closure(long signal_id, long instance_type,
        @Ptr
        long class_closure);

    public static void signal_override_class_closure(long signal_id, long instance_type, Pointer<GClosure> class_closure) {
        GObject.g_signal_override_class_closure(signal_id, instance_type, Pointer.getPeer(class_closure));
    }

    protected static native boolean g_type_check_instance_is_a(
        @Ptr
        long instance, long iface_type);

    public static boolean type_check_instance_is_a(Pointer<GTypeInstance> instance, long iface_type) {
        return GObject.g_type_check_instance_is_a(Pointer.getPeer(instance), iface_type);
    }

    protected static native void g_cclosure_marshal_VOID__POINTER(
        @Ptr
        long closure,
        @Ptr
        long return_value, long n_param_values,
        @Ptr
        long param_values,
        @Ptr
        long invocation_hint,
        @Ptr
        long marshal_data);

    public static void cclosure_marshal_VOID__POINTER(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        GObject.g_cclosure_marshal_VOID__POINTER(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), Pointer.getPeer(invocation_hint), Pointer.getPeer(marshal_data));
    }

    @Ptr
    protected static native long g_type_interface_prerequisites(long interface_type,
        @Ptr
        long n_prerequisites);

    public static Pointer<Long> type_interface_prerequisites(long interface_type, Pointer<Long> n_prerequisites) {
        return Pointer.pointerToAddress(GObject.g_type_interface_prerequisites(interface_type, Pointer.getPeer(n_prerequisites)), Long.class);
    }

    @Ptr
    protected static native long g_param_spec_char(
        @Ptr
        long name,
        @Ptr
        long nick,
        @Ptr
        long blurb, char minimum, char maximum, char default_value, IntValuedEnum<GParamFlags> flags);

    public static Pointer<GParamSpec> param_spec_char(Pointer name, Pointer nick, Pointer blurb, char minimum, char maximum, char default_value, IntValuedEnum<GParamFlags> flags) {
        return Pointer.pointerToAddress(GObject.g_param_spec_char(Pointer.getPeer(name), Pointer.getPeer(nick), Pointer.getPeer(blurb), minimum, maximum, default_value, flags), GParamSpec.class);
    }

    @Ptr
    protected static native long g_type_name_from_class(
        @Ptr
        long g_class);

    public static Pointer type_name_from_class(Pointer<GTypeClass> g_class) {
        return Pointer.pointerToAddress(GObject.g_type_name_from_class(Pointer.getPeer(g_class)));
    }

    @Ptr
    protected static native long g_param_spec_double(
        @Ptr
        long name,
        @Ptr
        long nick,
        @Ptr
        long blurb, double minimum, double maximum, double default_value, IntValuedEnum<GParamFlags> flags);

    public static Pointer<GParamSpec> param_spec_double(Pointer name, Pointer nick, Pointer blurb, double minimum, double maximum, double default_value, IntValuedEnum<GParamFlags> flags) {
        return Pointer.pointerToAddress(GObject.g_param_spec_double(Pointer.getPeer(name), Pointer.getPeer(nick), Pointer.getPeer(blurb), minimum, maximum, default_value, flags), GParamSpec.class);
    }

    protected static native boolean g_type_check_instance(
        @Ptr
        long instance);

    public static boolean type_check_instance(Pointer<GTypeInstance> instance) {
        return GObject.g_type_check_instance(Pointer.getPeer(instance));
    }

    protected static native void g_signal_chain_from_overridden_handler(
        @Ptr
        long instance, Object... varargs);

    public static void signal_chain_from_overridden_handler(Pointer instance, Object... varargs) {
        GObject.g_signal_chain_from_overridden_handler(Pointer.getPeer(instance), varargs);
    }

    protected static native long g_signal_lookup(
        @Ptr
        long name, long itype);

    public static long signal_lookup(Pointer name, long itype) {
        return GObject.g_signal_lookup(Pointer.getPeer(name), itype);
    }

    @Ptr
    protected static native long g_param_spec_unichar(
        @Ptr
        long name,
        @Ptr
        long nick,
        @Ptr
        long blurb, long default_value, IntValuedEnum<GParamFlags> flags);

    public static Pointer<GParamSpec> param_spec_unichar(Pointer name, Pointer nick, Pointer blurb, long default_value, IntValuedEnum<GParamFlags> flags) {
        return Pointer.pointerToAddress(GObject.g_param_spec_unichar(Pointer.getPeer(name), Pointer.getPeer(nick), Pointer.getPeer(blurb), default_value, flags), GParamSpec.class);
    }

    protected static native void g_cclosure_marshal_VOID__VARIANT(
        @Ptr
        long closure,
        @Ptr
        long return_value, long n_param_values,
        @Ptr
        long param_values,
        @Ptr
        long invocation_hint,
        @Ptr
        long marshal_data);

    public static void cclosure_marshal_VOID__VARIANT(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        GObject.g_cclosure_marshal_VOID__VARIANT(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), Pointer.getPeer(invocation_hint), Pointer.getPeer(marshal_data));
    }

    protected static native void g_type_query(long type,
        @Ptr
        long query);

    public static void type_query(long type, Pointer<GTypeQuery> query) {
        GObject.g_type_query(type, Pointer.getPeer(query));
    }

    protected static native void g_cclosure_marshal_VOID__VOID(
        @Ptr
        long closure,
        @Ptr
        long return_value, long n_param_values,
        @Ptr
        long param_values,
        @Ptr
        long invocation_hint,
        @Ptr
        long marshal_data);

    public static void cclosure_marshal_VOID__VOID(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        GObject.g_cclosure_marshal_VOID__VOID(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), Pointer.getPeer(invocation_hint), Pointer.getPeer(marshal_data));
    }

    public static native boolean g_value_type_transformable(long src_type, long dest_type);

    @Ptr
    protected static native long g_type_create_instance(long type);

    public static Pointer<GTypeInstance> type_create_instance(long type) {
        return Pointer.pointerToAddress(GObject.g_type_create_instance(type), GTypeInstance.class);
    }

    protected static native boolean g_param_value_defaults(
        @Ptr
        long pspec,
        @Ptr
        long value);

    public static boolean param_value_defaults(Pointer<GParamSpec> pspec, Pointer<GValue> value) {
        return GObject.g_param_value_defaults(Pointer.getPeer(pspec), Pointer.getPeer(value));
    }

    protected static native void g_boxed_free(long boxed_type,
        @Ptr
        long boxed);

    public static void boxed_free(long boxed_type, Pointer boxed) {
        GObject.g_boxed_free(boxed_type, Pointer.getPeer(boxed));
    }

    protected static native void g_cclosure_marshal_VOID__LONG(
        @Ptr
        long closure,
        @Ptr
        long return_value, long n_param_values,
        @Ptr
        long param_values,
        @Ptr
        long invocation_hint,
        @Ptr
        long marshal_data);

    public static void cclosure_marshal_VOID__LONG(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        GObject.g_cclosure_marshal_VOID__LONG(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), Pointer.getPeer(invocation_hint), Pointer.getPeer(marshal_data));
    }

    protected static native long g_enum_register_static(
        @Ptr
        long name,
        @Ptr
        long const_static_values);

    public static long enum_register_static(Pointer name, Pointer<GEnumValue> const_static_values) {
        return GObject.g_enum_register_static(Pointer.getPeer(name), Pointer.getPeer(const_static_values));
    }

    @Ptr
    protected static native long g_param_spec_int64(
        @Ptr
        long name,
        @Ptr
        long nick,
        @Ptr
        long blurb, long minimum, long maximum, long default_value, IntValuedEnum<GParamFlags> flags);

    public static Pointer<GParamSpec> param_spec_int64(Pointer name, Pointer nick, Pointer blurb, long minimum, long maximum, long default_value, IntValuedEnum<GParamFlags> flags) {
        return Pointer.pointerToAddress(GObject.g_param_spec_int64(Pointer.getPeer(name), Pointer.getPeer(nick), Pointer.getPeer(blurb), minimum, maximum, default_value, flags), GParamSpec.class);
    }

    public static native long g_type_parent(long type);

    public static native long g_type_fundamental_next();

    @Ptr
    protected static native long g_param_spec_boxed(
        @Ptr
        long name,
        @Ptr
        long nick,
        @Ptr
        long blurb, long boxed_type, IntValuedEnum<GParamFlags> flags);

    public static Pointer<GParamSpec> param_spec_boxed(Pointer name, Pointer nick, Pointer blurb, long boxed_type, IntValuedEnum<GParamFlags> flags) {
        return Pointer.pointerToAddress(GObject.g_param_spec_boxed(Pointer.getPeer(name), Pointer.getPeer(nick), Pointer.getPeer(blurb), boxed_type, flags), GParamSpec.class);
    }

    @Ptr
    protected static native long g_enum_get_value_by_name(
        @Ptr
        long enum_class,
        @Ptr
        long name);

    public static Pointer<GEnumValue> enum_get_value_by_name(Pointer<GEnumClass> enum_class, Pointer name) {
        return Pointer.pointerToAddress(GObject.g_enum_get_value_by_name(Pointer.getPeer(enum_class), Pointer.getPeer(name)), GEnumValue.class);
    }

    protected static native boolean g_signal_accumulator_true_handled(
        @Ptr
        long ihint,
        @Ptr
        long return_accu,
        @Ptr
        long handler_return,
        @Ptr
        long dummy);

    public static boolean signal_accumulator_true_handled(Pointer<GSignalInvocationHint> ihint, Pointer<GValue> return_accu, Pointer<GValue> handler_return, Pointer dummy) {
        return GObject.g_signal_accumulator_true_handled(Pointer.getPeer(ihint), Pointer.getPeer(return_accu), Pointer.getPeer(handler_return), Pointer.getPeer(dummy));
    }

    protected static native void g_value_register_transform_func(long src_type, long dest_type,
        @Ptr
        long transform_func);

    public static void value_register_transform_func(long src_type, long dest_type, Pointer transform_func) {
        GObject.g_value_register_transform_func(src_type, dest_type, Pointer.getPeer(transform_func));
    }

    protected static native void g_enum_complete_type_info(long g_enum_type,
        @Ptr
        long info,
        @Ptr
        long const_values);

    public static void enum_complete_type_info(long g_enum_type, Pointer<GTypeInfo> info, Pointer<GEnumValue> const_values) {
        GObject.g_enum_complete_type_info(g_enum_type, Pointer.getPeer(info), Pointer.getPeer(const_values));
    }

    protected static native boolean g_type_check_value(
        @Ptr
        long value);

    public static boolean type_check_value(Pointer<GValue> value) {
        return GObject.g_type_check_value(Pointer.getPeer(value));
    }

    @Ptr
    protected static native long g_type_children(long type,
        @Ptr
        long n_children);

    public static Pointer<Long> type_children(long type, Pointer<Long> n_children) {
        return Pointer.pointerToAddress(GObject.g_type_children(type, Pointer.getPeer(n_children)), Long.class);
    }

    protected static native long g_type_register_dynamic(long parent_type,
        @Ptr
        long type_name,
        @Ptr
        long plugin, IntValuedEnum<GTypeFlags> flags);

    public static long type_register_dynamic(long parent_type, Pointer type_name, Pointer<Object> plugin, IntValuedEnum<GTypeFlags> flags) {
        return GObject.g_type_register_dynamic(parent_type, Pointer.getPeer(type_name), Pointer.getPeer(plugin), flags);
    }

}
