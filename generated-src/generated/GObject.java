
package generated;

import generated.glib20.glib.GSource;
import generated.glib20.glib.GVariant;
import generated.glib20.glib.GVariantType;
import generated.gobject20.gobject.GClosure;
import generated.gobject20.gobject.GEnumClass;
import generated.gobject20.gobject.GEnumValue;
import generated.gobject20.gobject.GFlagsClass;
import generated.gobject20.gobject.GFlagsValue;
import generated.gobject20.gobject.GInterfaceInfo;
import generated.gobject20.gobject.GParamSpec;
import generated.gobject20.gobject.GParamSpecPool;
import generated.gobject20.gobject.GParamSpecTypeInfo;
import generated.gobject20.gobject.GSignalInvocationHint;
import generated.gobject20.gobject.GSignalQuery;
import generated.gobject20.gobject.GTypeClass;
import generated.gobject20.gobject.GTypeFundamentalInfo;
import generated.gobject20.gobject.GTypeInfo;
import generated.gobject20.gobject.GTypeInstance;
import generated.gobject20.gobject.GTypeInterface;
import generated.gobject20.gobject.GTypeQuery;
import generated.gobject20.gobject.GTypeValueTable;
import generated.gobject20.gobject.GValue;
import org.bridj.Pointer;
import org.bridj.ann.Ptr;

public class GObject {


    public native Pointer g_boxed_copy(long boxed_type, Pointer src_boxed);

    public native void g_boxed_free(long boxed_type, Pointer boxed);

    protected native long g_boxed_type_register_static(
        @Ptr
        long name, Object boxed_copy, Object boxed_free);

    public long boxed_type_register_static(Pointer name, Object boxed_copy, Object boxed_free) {
        return this.g_boxed_type_register_static(Pointer.getPeer(name), boxed_copy, boxed_free);
    }

    protected native void g_cclosure_marshal_BOOLEAN__BOXED_BOXED(
        @Ptr
        long closure,
        @Ptr
        long return_value, long n_param_values,
        @Ptr
        long param_values, Pointer invocation_hint, Pointer marshal_data);

    public void cclosure_marshal_BOOLEAN__BOXED_BOXED(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        this.g_cclosure_marshal_BOOLEAN__BOXED_BOXED(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), invocation_hint, marshal_data);
    }

    protected native void g_cclosure_marshal_BOOLEAN__FLAGS(
        @Ptr
        long closure,
        @Ptr
        long return_value, long n_param_values,
        @Ptr
        long param_values, Pointer invocation_hint, Pointer marshal_data);

    public void cclosure_marshal_BOOLEAN__FLAGS(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        this.g_cclosure_marshal_BOOLEAN__FLAGS(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), invocation_hint, marshal_data);
    }

    protected native void g_cclosure_marshal_STRING__OBJECT_POINTER(
        @Ptr
        long closure,
        @Ptr
        long return_value, long n_param_values,
        @Ptr
        long param_values, Pointer invocation_hint, Pointer marshal_data);

    public void cclosure_marshal_STRING__OBJECT_POINTER(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        this.g_cclosure_marshal_STRING__OBJECT_POINTER(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), invocation_hint, marshal_data);
    }

    protected native void g_cclosure_marshal_VOID__BOOLEAN(
        @Ptr
        long closure,
        @Ptr
        long return_value, long n_param_values,
        @Ptr
        long param_values, Pointer invocation_hint, Pointer marshal_data);

    public void cclosure_marshal_VOID__BOOLEAN(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        this.g_cclosure_marshal_VOID__BOOLEAN(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), invocation_hint, marshal_data);
    }

    protected native void g_cclosure_marshal_VOID__BOXED(
        @Ptr
        long closure,
        @Ptr
        long return_value, long n_param_values,
        @Ptr
        long param_values, Pointer invocation_hint, Pointer marshal_data);

    public void cclosure_marshal_VOID__BOXED(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        this.g_cclosure_marshal_VOID__BOXED(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), invocation_hint, marshal_data);
    }

    protected native void g_cclosure_marshal_VOID__CHAR(
        @Ptr
        long closure,
        @Ptr
        long return_value, long n_param_values,
        @Ptr
        long param_values, Pointer invocation_hint, Pointer marshal_data);

    public void cclosure_marshal_VOID__CHAR(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        this.g_cclosure_marshal_VOID__CHAR(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), invocation_hint, marshal_data);
    }

    protected native void g_cclosure_marshal_VOID__DOUBLE(
        @Ptr
        long closure,
        @Ptr
        long return_value, long n_param_values,
        @Ptr
        long param_values, Pointer invocation_hint, Pointer marshal_data);

    public void cclosure_marshal_VOID__DOUBLE(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        this.g_cclosure_marshal_VOID__DOUBLE(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), invocation_hint, marshal_data);
    }

    protected native void g_cclosure_marshal_VOID__ENUM(
        @Ptr
        long closure,
        @Ptr
        long return_value, long n_param_values,
        @Ptr
        long param_values, Pointer invocation_hint, Pointer marshal_data);

    public void cclosure_marshal_VOID__ENUM(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        this.g_cclosure_marshal_VOID__ENUM(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), invocation_hint, marshal_data);
    }

    protected native void g_cclosure_marshal_VOID__FLAGS(
        @Ptr
        long closure,
        @Ptr
        long return_value, long n_param_values,
        @Ptr
        long param_values, Pointer invocation_hint, Pointer marshal_data);

    public void cclosure_marshal_VOID__FLAGS(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        this.g_cclosure_marshal_VOID__FLAGS(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), invocation_hint, marshal_data);
    }

    protected native void g_cclosure_marshal_VOID__FLOAT(
        @Ptr
        long closure,
        @Ptr
        long return_value, long n_param_values,
        @Ptr
        long param_values, Pointer invocation_hint, Pointer marshal_data);

    public void cclosure_marshal_VOID__FLOAT(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        this.g_cclosure_marshal_VOID__FLOAT(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), invocation_hint, marshal_data);
    }

    protected native void g_cclosure_marshal_VOID__INT(
        @Ptr
        long closure,
        @Ptr
        long return_value, long n_param_values,
        @Ptr
        long param_values, Pointer invocation_hint, Pointer marshal_data);

    public void cclosure_marshal_VOID__INT(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        this.g_cclosure_marshal_VOID__INT(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), invocation_hint, marshal_data);
    }

    protected native void g_cclosure_marshal_VOID__LONG(
        @Ptr
        long closure,
        @Ptr
        long return_value, long n_param_values,
        @Ptr
        long param_values, Pointer invocation_hint, Pointer marshal_data);

    public void cclosure_marshal_VOID__LONG(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        this.g_cclosure_marshal_VOID__LONG(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), invocation_hint, marshal_data);
    }

    protected native void g_cclosure_marshal_VOID__OBJECT(
        @Ptr
        long closure,
        @Ptr
        long return_value, long n_param_values,
        @Ptr
        long param_values, Pointer invocation_hint, Pointer marshal_data);

    public void cclosure_marshal_VOID__OBJECT(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        this.g_cclosure_marshal_VOID__OBJECT(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), invocation_hint, marshal_data);
    }

    protected native void g_cclosure_marshal_VOID__PARAM(
        @Ptr
        long closure,
        @Ptr
        long return_value, long n_param_values,
        @Ptr
        long param_values, Pointer invocation_hint, Pointer marshal_data);

    public void cclosure_marshal_VOID__PARAM(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        this.g_cclosure_marshal_VOID__PARAM(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), invocation_hint, marshal_data);
    }

    protected native void g_cclosure_marshal_VOID__POINTER(
        @Ptr
        long closure,
        @Ptr
        long return_value, long n_param_values,
        @Ptr
        long param_values, Pointer invocation_hint, Pointer marshal_data);

    public void cclosure_marshal_VOID__POINTER(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        this.g_cclosure_marshal_VOID__POINTER(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), invocation_hint, marshal_data);
    }

    protected native void g_cclosure_marshal_VOID__STRING(
        @Ptr
        long closure,
        @Ptr
        long return_value, long n_param_values,
        @Ptr
        long param_values, Pointer invocation_hint, Pointer marshal_data);

    public void cclosure_marshal_VOID__STRING(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        this.g_cclosure_marshal_VOID__STRING(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), invocation_hint, marshal_data);
    }

    protected native void g_cclosure_marshal_VOID__UCHAR(
        @Ptr
        long closure,
        @Ptr
        long return_value, long n_param_values,
        @Ptr
        long param_values, Pointer invocation_hint, Pointer marshal_data);

    public void cclosure_marshal_VOID__UCHAR(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        this.g_cclosure_marshal_VOID__UCHAR(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), invocation_hint, marshal_data);
    }

    protected native void g_cclosure_marshal_VOID__UINT(
        @Ptr
        long closure,
        @Ptr
        long return_value, long n_param_values,
        @Ptr
        long param_values, Pointer invocation_hint, Pointer marshal_data);

    public void cclosure_marshal_VOID__UINT(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        this.g_cclosure_marshal_VOID__UINT(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), invocation_hint, marshal_data);
    }

    protected native void g_cclosure_marshal_VOID__UINT_POINTER(
        @Ptr
        long closure,
        @Ptr
        long return_value, long n_param_values,
        @Ptr
        long param_values, Pointer invocation_hint, Pointer marshal_data);

    public void cclosure_marshal_VOID__UINT_POINTER(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        this.g_cclosure_marshal_VOID__UINT_POINTER(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), invocation_hint, marshal_data);
    }

    protected native void g_cclosure_marshal_VOID__ULONG(
        @Ptr
        long closure,
        @Ptr
        long return_value, long n_param_values,
        @Ptr
        long param_values, Pointer invocation_hint, Pointer marshal_data);

    public void cclosure_marshal_VOID__ULONG(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        this.g_cclosure_marshal_VOID__ULONG(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), invocation_hint, marshal_data);
    }

    protected native void g_cclosure_marshal_VOID__VARIANT(
        @Ptr
        long closure,
        @Ptr
        long return_value, long n_param_values,
        @Ptr
        long param_values, Pointer invocation_hint, Pointer marshal_data);

    public void cclosure_marshal_VOID__VARIANT(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        this.g_cclosure_marshal_VOID__VARIANT(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), invocation_hint, marshal_data);
    }

    protected native void g_cclosure_marshal_VOID__VOID(
        @Ptr
        long closure,
        @Ptr
        long return_value, long n_param_values,
        @Ptr
        long param_values, Pointer invocation_hint, Pointer marshal_data);

    public void cclosure_marshal_VOID__VOID(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        this.g_cclosure_marshal_VOID__VOID(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), invocation_hint, marshal_data);
    }

    protected native void g_cclosure_marshal_generic(
        @Ptr
        long closure,
        @Ptr
        long return_gvalue, long n_param_values,
        @Ptr
        long param_values, Pointer invocation_hint, Pointer marshal_data);

    public void cclosure_marshal_generic(Pointer<GClosure> closure, Pointer<GValue> return_gvalue, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        this.g_cclosure_marshal_generic(Pointer.getPeer(closure), Pointer.getPeer(return_gvalue), n_param_values, Pointer.getPeer(param_values), invocation_hint, marshal_data);
    }

    @Ptr
    protected native long g_cclosure_new(Object callback_func, Pointer user_data, Object destroy_data);

    public Pointer<GClosure> cclosure_new(Object callback_func, Pointer user_data, Object destroy_data) {
        return Pointer.pointerToAddress(this.g_cclosure_new(callback_func, user_data, destroy_data), Pointer.class);
    }

    @Ptr
    protected native long g_cclosure_new_object(Object callback_func,
        @Ptr
        long object);

    public Pointer<GClosure> cclosure_new_object(Object callback_func, Pointer<generated.gobject20.gobject.GObject> object) {
        return Pointer.pointerToAddress(this.g_cclosure_new_object(callback_func, Pointer.getPeer(object)), Pointer.class);
    }

    @Ptr
    protected native long g_cclosure_new_object_swap(Object callback_func,
        @Ptr
        long object);

    public Pointer<GClosure> cclosure_new_object_swap(Object callback_func, Pointer<generated.gobject20.gobject.GObject> object) {
        return Pointer.pointerToAddress(this.g_cclosure_new_object_swap(callback_func, Pointer.getPeer(object)), Pointer.class);
    }

    @Ptr
    protected native long g_cclosure_new_swap(Object callback_func, Pointer user_data, Object destroy_data);

    public Pointer<GClosure> cclosure_new_swap(Object callback_func, Pointer user_data, Object destroy_data) {
        return Pointer.pointerToAddress(this.g_cclosure_new_swap(callback_func, user_data, destroy_data), Pointer.class);
    }

    protected native void g_clear_object(
        @Ptr
        long object_ptr);

    public void clear_object(Pointer<Pointer<generated.gobject20.gobject.GObject>> object_ptr) {
        this.g_clear_object(Pointer.getPeer(object_ptr));
    }

    protected native void g_enum_complete_type_info(long g_enum_type,
        @Ptr
        long info,
        @Ptr
        long const_values);

    public void enum_complete_type_info(long g_enum_type, Pointer<GTypeInfo> info, Pointer<GEnumValue> const_values) {
        this.g_enum_complete_type_info(g_enum_type, Pointer.getPeer(info), Pointer.getPeer(const_values));
    }

    @Ptr
    protected native long g_enum_get_value(
        @Ptr
        long enum_class, int value);

    public Pointer<GEnumValue> enum_get_value(Pointer<GEnumClass> enum_class, int value) {
        return Pointer.pointerToAddress(this.g_enum_get_value(Pointer.getPeer(enum_class), value), Pointer.class);
    }

    @Ptr
    protected native long g_enum_get_value_by_name(
        @Ptr
        long enum_class,
        @Ptr
        long name);

    public Pointer<GEnumValue> enum_get_value_by_name(Pointer<GEnumClass> enum_class, Pointer name) {
        return Pointer.pointerToAddress(this.g_enum_get_value_by_name(Pointer.getPeer(enum_class), Pointer.getPeer(name)), Pointer.class);
    }

    @Ptr
    protected native long g_enum_get_value_by_nick(
        @Ptr
        long enum_class,
        @Ptr
        long nick);

    public Pointer<GEnumValue> enum_get_value_by_nick(Pointer<GEnumClass> enum_class, Pointer nick) {
        return Pointer.pointerToAddress(this.g_enum_get_value_by_nick(Pointer.getPeer(enum_class), Pointer.getPeer(nick)), Pointer.class);
    }

    protected native long g_enum_register_static(
        @Ptr
        long name,
        @Ptr
        long const_static_values);

    public long enum_register_static(Pointer name, Pointer<GEnumValue> const_static_values) {
        return this.g_enum_register_static(Pointer.getPeer(name), Pointer.getPeer(const_static_values));
    }

    protected native void g_flags_complete_type_info(long g_flags_type,
        @Ptr
        long info,
        @Ptr
        long const_values);

    public void flags_complete_type_info(long g_flags_type, Pointer<GTypeInfo> info, Pointer<GFlagsValue> const_values) {
        this.g_flags_complete_type_info(g_flags_type, Pointer.getPeer(info), Pointer.getPeer(const_values));
    }

    @Ptr
    protected native long g_flags_get_first_value(
        @Ptr
        long flags_class, long value);

    public Pointer<GFlagsValue> flags_get_first_value(Pointer<GFlagsClass> flags_class, long value) {
        return Pointer.pointerToAddress(this.g_flags_get_first_value(Pointer.getPeer(flags_class), value), Pointer.class);
    }

    @Ptr
    protected native long g_flags_get_value_by_name(
        @Ptr
        long flags_class,
        @Ptr
        long name);

    public Pointer<GFlagsValue> flags_get_value_by_name(Pointer<GFlagsClass> flags_class, Pointer name) {
        return Pointer.pointerToAddress(this.g_flags_get_value_by_name(Pointer.getPeer(flags_class), Pointer.getPeer(name)), Pointer.class);
    }

    @Ptr
    protected native long g_flags_get_value_by_nick(
        @Ptr
        long flags_class,
        @Ptr
        long nick);

    public Pointer<GFlagsValue> flags_get_value_by_nick(Pointer<GFlagsClass> flags_class, Pointer nick) {
        return Pointer.pointerToAddress(this.g_flags_get_value_by_nick(Pointer.getPeer(flags_class), Pointer.getPeer(nick)), Pointer.class);
    }

    protected native long g_flags_register_static(
        @Ptr
        long name,
        @Ptr
        long const_static_values);

    public long flags_register_static(Pointer name, Pointer<GFlagsValue> const_static_values) {
        return this.g_flags_register_static(Pointer.getPeer(name), Pointer.getPeer(const_static_values));
    }

    public native long g_gtype_get_type();

    @Ptr
    protected native long g_param_spec_boolean(
        @Ptr
        long name,
        @Ptr
        long nick,
        @Ptr
        long blurb, boolean default_value, Object flags);

    public Pointer<GParamSpec> param_spec_boolean(Pointer name, Pointer nick, Pointer blurb, boolean default_value, Object flags) {
        return Pointer.pointerToAddress(this.g_param_spec_boolean(Pointer.getPeer(name), Pointer.getPeer(nick), Pointer.getPeer(blurb), default_value, flags), Pointer.class);
    }

    @Ptr
    protected native long g_param_spec_boxed(
        @Ptr
        long name,
        @Ptr
        long nick,
        @Ptr
        long blurb, long boxed_type, Object flags);

    public Pointer<GParamSpec> param_spec_boxed(Pointer name, Pointer nick, Pointer blurb, long boxed_type, Object flags) {
        return Pointer.pointerToAddress(this.g_param_spec_boxed(Pointer.getPeer(name), Pointer.getPeer(nick), Pointer.getPeer(blurb), boxed_type, flags), Pointer.class);
    }

    @Ptr
    protected native long g_param_spec_char(
        @Ptr
        long name,
        @Ptr
        long nick,
        @Ptr
        long blurb, char minimum, char maximum, char default_value, Object flags);

    public Pointer<GParamSpec> param_spec_char(Pointer name, Pointer nick, Pointer blurb, char minimum, char maximum, char default_value, Object flags) {
        return Pointer.pointerToAddress(this.g_param_spec_char(Pointer.getPeer(name), Pointer.getPeer(nick), Pointer.getPeer(blurb), minimum, maximum, default_value, flags), Pointer.class);
    }

    @Ptr
    protected native long g_param_spec_double(
        @Ptr
        long name,
        @Ptr
        long nick,
        @Ptr
        long blurb, double minimum, double maximum, double default_value, Object flags);

    public Pointer<GParamSpec> param_spec_double(Pointer name, Pointer nick, Pointer blurb, double minimum, double maximum, double default_value, Object flags) {
        return Pointer.pointerToAddress(this.g_param_spec_double(Pointer.getPeer(name), Pointer.getPeer(nick), Pointer.getPeer(blurb), minimum, maximum, default_value, flags), Pointer.class);
    }

    @Ptr
    protected native long g_param_spec_enum(
        @Ptr
        long name,
        @Ptr
        long nick,
        @Ptr
        long blurb, long enum_type, int default_value, Object flags);

    public Pointer<GParamSpec> param_spec_enum(Pointer name, Pointer nick, Pointer blurb, long enum_type, int default_value, Object flags) {
        return Pointer.pointerToAddress(this.g_param_spec_enum(Pointer.getPeer(name), Pointer.getPeer(nick), Pointer.getPeer(blurb), enum_type, default_value, flags), Pointer.class);
    }

    @Ptr
    protected native long g_param_spec_flags(
        @Ptr
        long name,
        @Ptr
        long nick,
        @Ptr
        long blurb, long flags_type, long default_value, Object flags);

    public Pointer<GParamSpec> param_spec_flags(Pointer name, Pointer nick, Pointer blurb, long flags_type, long default_value, Object flags) {
        return Pointer.pointerToAddress(this.g_param_spec_flags(Pointer.getPeer(name), Pointer.getPeer(nick), Pointer.getPeer(blurb), flags_type, default_value, flags), Pointer.class);
    }

    @Ptr
    protected native long g_param_spec_float(
        @Ptr
        long name,
        @Ptr
        long nick,
        @Ptr
        long blurb, float minimum, float maximum, float default_value, Object flags);

    public Pointer<GParamSpec> param_spec_float(Pointer name, Pointer nick, Pointer blurb, float minimum, float maximum, float default_value, Object flags) {
        return Pointer.pointerToAddress(this.g_param_spec_float(Pointer.getPeer(name), Pointer.getPeer(nick), Pointer.getPeer(blurb), minimum, maximum, default_value, flags), Pointer.class);
    }

    @Ptr
    protected native long g_param_spec_gtype(
        @Ptr
        long name,
        @Ptr
        long nick,
        @Ptr
        long blurb, long is_a_type, Object flags);

    public Pointer<GParamSpec> param_spec_gtype(Pointer name, Pointer nick, Pointer blurb, long is_a_type, Object flags) {
        return Pointer.pointerToAddress(this.g_param_spec_gtype(Pointer.getPeer(name), Pointer.getPeer(nick), Pointer.getPeer(blurb), is_a_type, flags), Pointer.class);
    }

    @Ptr
    protected native long g_param_spec_int(
        @Ptr
        long name,
        @Ptr
        long nick,
        @Ptr
        long blurb, int minimum, int maximum, int default_value, Object flags);

    public Pointer<GParamSpec> param_spec_int(Pointer name, Pointer nick, Pointer blurb, int minimum, int maximum, int default_value, Object flags) {
        return Pointer.pointerToAddress(this.g_param_spec_int(Pointer.getPeer(name), Pointer.getPeer(nick), Pointer.getPeer(blurb), minimum, maximum, default_value, flags), Pointer.class);
    }

    @Ptr
    protected native long g_param_spec_int64(
        @Ptr
        long name,
        @Ptr
        long nick,
        @Ptr
        long blurb, long minimum, long maximum, long default_value, Object flags);

    public Pointer<GParamSpec> param_spec_int64(Pointer name, Pointer nick, Pointer blurb, long minimum, long maximum, long default_value, Object flags) {
        return Pointer.pointerToAddress(this.g_param_spec_int64(Pointer.getPeer(name), Pointer.getPeer(nick), Pointer.getPeer(blurb), minimum, maximum, default_value, flags), Pointer.class);
    }

    @Ptr
    protected native long g_param_spec_long(
        @Ptr
        long name,
        @Ptr
        long nick,
        @Ptr
        long blurb, long minimum, long maximum, long default_value, Object flags);

    public Pointer<GParamSpec> param_spec_long(Pointer name, Pointer nick, Pointer blurb, long minimum, long maximum, long default_value, Object flags) {
        return Pointer.pointerToAddress(this.g_param_spec_long(Pointer.getPeer(name), Pointer.getPeer(nick), Pointer.getPeer(blurb), minimum, maximum, default_value, flags), Pointer.class);
    }

    @Ptr
    protected native long g_param_spec_object(
        @Ptr
        long name,
        @Ptr
        long nick,
        @Ptr
        long blurb, long object_type, Object flags);

    public Pointer<GParamSpec> param_spec_object(Pointer name, Pointer nick, Pointer blurb, long object_type, Object flags) {
        return Pointer.pointerToAddress(this.g_param_spec_object(Pointer.getPeer(name), Pointer.getPeer(nick), Pointer.getPeer(blurb), object_type, flags), Pointer.class);
    }

    @Ptr
    protected native long g_param_spec_override(
        @Ptr
        long name,
        @Ptr
        long overridden);

    public Pointer<GParamSpec> param_spec_override(Pointer name, Pointer<GParamSpec> overridden) {
        return Pointer.pointerToAddress(this.g_param_spec_override(Pointer.getPeer(name), Pointer.getPeer(overridden)), Pointer.class);
    }

    @Ptr
    protected native long g_param_spec_param(
        @Ptr
        long name,
        @Ptr
        long nick,
        @Ptr
        long blurb, long param_type, Object flags);

    public Pointer<GParamSpec> param_spec_param(Pointer name, Pointer nick, Pointer blurb, long param_type, Object flags) {
        return Pointer.pointerToAddress(this.g_param_spec_param(Pointer.getPeer(name), Pointer.getPeer(nick), Pointer.getPeer(blurb), param_type, flags), Pointer.class);
    }

    @Ptr
    protected native long g_param_spec_pointer(
        @Ptr
        long name,
        @Ptr
        long nick,
        @Ptr
        long blurb, Object flags);

    public Pointer<GParamSpec> param_spec_pointer(Pointer name, Pointer nick, Pointer blurb, Object flags) {
        return Pointer.pointerToAddress(this.g_param_spec_pointer(Pointer.getPeer(name), Pointer.getPeer(nick), Pointer.getPeer(blurb), flags), Pointer.class);
    }

    @Ptr
    protected native long g_param_spec_pool_new(boolean type_prefixing);

    public Pointer<GParamSpecPool> param_spec_pool_new(boolean type_prefixing) {
        return Pointer.pointerToAddress(this.g_param_spec_pool_new(type_prefixing), Pointer.class);
    }

    @Ptr
    protected native long g_param_spec_string(
        @Ptr
        long name,
        @Ptr
        long nick,
        @Ptr
        long blurb,
        @Ptr
        long default_value, Object flags);

    public Pointer<GParamSpec> param_spec_string(Pointer name, Pointer nick, Pointer blurb, Pointer default_value, Object flags) {
        return Pointer.pointerToAddress(this.g_param_spec_string(Pointer.getPeer(name), Pointer.getPeer(nick), Pointer.getPeer(blurb), Pointer.getPeer(default_value), flags), Pointer.class);
    }

    @Ptr
    protected native long g_param_spec_uchar(
        @Ptr
        long name,
        @Ptr
        long nick,
        @Ptr
        long blurb, short minimum, short maximum, short default_value, Object flags);

    public Pointer<GParamSpec> param_spec_uchar(Pointer name, Pointer nick, Pointer blurb, short minimum, short maximum, short default_value, Object flags) {
        return Pointer.pointerToAddress(this.g_param_spec_uchar(Pointer.getPeer(name), Pointer.getPeer(nick), Pointer.getPeer(blurb), minimum, maximum, default_value, flags), Pointer.class);
    }

    @Ptr
    protected native long g_param_spec_uint(
        @Ptr
        long name,
        @Ptr
        long nick,
        @Ptr
        long blurb, long minimum, long maximum, long default_value, Object flags);

    public Pointer<GParamSpec> param_spec_uint(Pointer name, Pointer nick, Pointer blurb, long minimum, long maximum, long default_value, Object flags) {
        return Pointer.pointerToAddress(this.g_param_spec_uint(Pointer.getPeer(name), Pointer.getPeer(nick), Pointer.getPeer(blurb), minimum, maximum, default_value, flags), Pointer.class);
    }

    @Ptr
    protected native long g_param_spec_uint64(
        @Ptr
        long name,
        @Ptr
        long nick,
        @Ptr
        long blurb, long minimum, long maximum, long default_value, Object flags);

    public Pointer<GParamSpec> param_spec_uint64(Pointer name, Pointer nick, Pointer blurb, long minimum, long maximum, long default_value, Object flags) {
        return Pointer.pointerToAddress(this.g_param_spec_uint64(Pointer.getPeer(name), Pointer.getPeer(nick), Pointer.getPeer(blurb), minimum, maximum, default_value, flags), Pointer.class);
    }

    @Ptr
    protected native long g_param_spec_ulong(
        @Ptr
        long name,
        @Ptr
        long nick,
        @Ptr
        long blurb, long minimum, long maximum, long default_value, Object flags);

    public Pointer<GParamSpec> param_spec_ulong(Pointer name, Pointer nick, Pointer blurb, long minimum, long maximum, long default_value, Object flags) {
        return Pointer.pointerToAddress(this.g_param_spec_ulong(Pointer.getPeer(name), Pointer.getPeer(nick), Pointer.getPeer(blurb), minimum, maximum, default_value, flags), Pointer.class);
    }

    @Ptr
    protected native long g_param_spec_unichar(
        @Ptr
        long name,
        @Ptr
        long nick,
        @Ptr
        long blurb, long default_value, Object flags);

    public Pointer<GParamSpec> param_spec_unichar(Pointer name, Pointer nick, Pointer blurb, long default_value, Object flags) {
        return Pointer.pointerToAddress(this.g_param_spec_unichar(Pointer.getPeer(name), Pointer.getPeer(nick), Pointer.getPeer(blurb), default_value, flags), Pointer.class);
    }

    @Ptr
    protected native long g_param_spec_value_array(
        @Ptr
        long name,
        @Ptr
        long nick,
        @Ptr
        long blurb,
        @Ptr
        long element_spec, Object flags);

    public Pointer<GParamSpec> param_spec_value_array(Pointer name, Pointer nick, Pointer blurb, Pointer<GParamSpec> element_spec, Object flags) {
        return Pointer.pointerToAddress(this.g_param_spec_value_array(Pointer.getPeer(name), Pointer.getPeer(nick), Pointer.getPeer(blurb), Pointer.getPeer(element_spec), flags), Pointer.class);
    }

    @Ptr
    protected native long g_param_spec_variant(
        @Ptr
        long name,
        @Ptr
        long nick,
        @Ptr
        long blurb,
        @Ptr
        long type,
        @Ptr
        long default_value, Object flags);

    public Pointer<GParamSpec> param_spec_variant(Pointer name, Pointer nick, Pointer blurb, Pointer<GVariantType> type, Pointer<GVariant> default_value, Object flags) {
        return Pointer.pointerToAddress(this.g_param_spec_variant(Pointer.getPeer(name), Pointer.getPeer(nick), Pointer.getPeer(blurb), Pointer.getPeer(type), Pointer.getPeer(default_value), flags), Pointer.class);
    }

    protected native long g_param_type_register_static(
        @Ptr
        long name,
        @Ptr
        long pspec_info);

    public long param_type_register_static(Pointer name, Pointer<GParamSpecTypeInfo> pspec_info) {
        return this.g_param_type_register_static(Pointer.getPeer(name), Pointer.getPeer(pspec_info));
    }

    protected native boolean g_param_value_convert(
        @Ptr
        long pspec,
        @Ptr
        long src_value,
        @Ptr
        long dest_value, boolean strict_validation);

    public boolean param_value_convert(Pointer<GParamSpec> pspec, Pointer<GValue> src_value, Pointer<GValue> dest_value, boolean strict_validation) {
        return this.g_param_value_convert(Pointer.getPeer(pspec), Pointer.getPeer(src_value), Pointer.getPeer(dest_value), strict_validation);
    }

    protected native boolean g_param_value_defaults(
        @Ptr
        long pspec,
        @Ptr
        long value);

    public boolean param_value_defaults(Pointer<GParamSpec> pspec, Pointer<GValue> value) {
        return this.g_param_value_defaults(Pointer.getPeer(pspec), Pointer.getPeer(value));
    }

    protected native void g_param_value_set_default(
        @Ptr
        long pspec,
        @Ptr
        long value);

    public void param_value_set_default(Pointer<GParamSpec> pspec, Pointer<GValue> value) {
        this.g_param_value_set_default(Pointer.getPeer(pspec), Pointer.getPeer(value));
    }

    protected native boolean g_param_value_validate(
        @Ptr
        long pspec,
        @Ptr
        long value);

    public boolean param_value_validate(Pointer<GParamSpec> pspec, Pointer<GValue> value) {
        return this.g_param_value_validate(Pointer.getPeer(pspec), Pointer.getPeer(value));
    }

    protected native int g_param_values_cmp(
        @Ptr
        long pspec,
        @Ptr
        long value1,
        @Ptr
        long value2);

    public int param_values_cmp(Pointer<GParamSpec> pspec, Pointer<GValue> value1, Pointer<GValue> value2) {
        return this.g_param_values_cmp(Pointer.getPeer(pspec), Pointer.getPeer(value1), Pointer.getPeer(value2));
    }

    protected native long g_pointer_type_register_static(
        @Ptr
        long name);

    public long pointer_type_register_static(Pointer name) {
        return this.g_pointer_type_register_static(Pointer.getPeer(name));
    }

    protected native boolean g_signal_accumulator_first_wins(
        @Ptr
        long ihint,
        @Ptr
        long return_accu,
        @Ptr
        long handler_return, Pointer dummy);

    public boolean signal_accumulator_first_wins(Pointer<GSignalInvocationHint> ihint, Pointer<GValue> return_accu, Pointer<GValue> handler_return, Pointer dummy) {
        return this.g_signal_accumulator_first_wins(Pointer.getPeer(ihint), Pointer.getPeer(return_accu), Pointer.getPeer(handler_return), dummy);
    }

    protected native boolean g_signal_accumulator_true_handled(
        @Ptr
        long ihint,
        @Ptr
        long return_accu,
        @Ptr
        long handler_return, Pointer dummy);

    public boolean signal_accumulator_true_handled(Pointer<GSignalInvocationHint> ihint, Pointer<GValue> return_accu, Pointer<GValue> handler_return, Pointer dummy) {
        return this.g_signal_accumulator_true_handled(Pointer.getPeer(ihint), Pointer.getPeer(return_accu), Pointer.getPeer(handler_return), dummy);
    }

    public native long g_signal_add_emission_hook(long signal_id, Object detail, Object hook_func, Pointer hook_data, Object data_destroy);

    protected native void g_signal_chain_from_overridden(
        @Ptr
        long instance_and_params,
        @Ptr
        long return_value);

    public void signal_chain_from_overridden(GValue instance_and_params, Pointer<GValue> return_value) {
        this.g_signal_chain_from_overridden(Pointer.getPeer(instance_and_params), Pointer.getPeer(return_value));
    }

    public native void g_signal_chain_from_overridden_handler(Pointer instance, Object... varargs);

    protected native long g_signal_connect_closure(generated.gobject20.gobject.GObject instance,
        @Ptr
        long detailed_signal,
        @Ptr
        long closure, boolean after);

    public long signal_connect_closure(generated.gobject20.gobject.GObject instance, Pointer detailed_signal, Pointer<GClosure> closure, boolean after) {
        return this.g_signal_connect_closure(instance, Pointer.getPeer(detailed_signal), Pointer.getPeer(closure), after);
    }

    protected native long g_signal_connect_closure_by_id(generated.gobject20.gobject.GObject instance, long signal_id, Object detail,
        @Ptr
        long closure, boolean after);

    public long signal_connect_closure_by_id(generated.gobject20.gobject.GObject instance, long signal_id, Object detail, Pointer<GClosure> closure, boolean after) {
        return this.g_signal_connect_closure_by_id(instance, signal_id, detail, Pointer.getPeer(closure), after);
    }

    protected native long g_signal_connect_data(generated.gobject20.gobject.GObject instance,
        @Ptr
        long detailed_signal, Object c_handler, Pointer data, Object destroy_data, Object connect_flags);

    public long signal_connect_data(generated.gobject20.gobject.GObject instance, Pointer detailed_signal, Object c_handler, Pointer data, Object destroy_data, Object connect_flags) {
        return this.g_signal_connect_data(instance, Pointer.getPeer(detailed_signal), c_handler, data, destroy_data, connect_flags);
    }

    protected native long g_signal_connect_object(Pointer instance,
        @Ptr
        long detailed_signal, Object c_handler, Pointer gobject, Object connect_flags);

    public long signal_connect_object(Pointer instance, Pointer detailed_signal, Object c_handler, Pointer gobject, Object connect_flags) {
        return this.g_signal_connect_object(instance, Pointer.getPeer(detailed_signal), c_handler, gobject, connect_flags);
    }

    public native void g_signal_emit(generated.gobject20.gobject.GObject instance, long signal_id, Object detail, Object... varargs);

    protected native void g_signal_emit_by_name(generated.gobject20.gobject.GObject instance,
        @Ptr
        long detailed_signal, Object... varargs);

    public void signal_emit_by_name(generated.gobject20.gobject.GObject instance, Pointer detailed_signal, Object... varargs) {
        this.g_signal_emit_by_name(instance, Pointer.getPeer(detailed_signal), varargs);
    }

    protected native void g_signal_emitv(
        @Ptr
        long instance_and_params, long signal_id, Object detail,
        @Ptr
        long return_value);

    public void signal_emitv(GValue instance_and_params, long signal_id, Object detail, Pointer<GValue> return_value) {
        this.g_signal_emitv(Pointer.getPeer(instance_and_params), signal_id, detail, Pointer.getPeer(return_value));
    }

    @Ptr
    protected native long g_signal_get_invocation_hint(generated.gobject20.gobject.GObject instance);

    public Pointer<GSignalInvocationHint> signal_get_invocation_hint(generated.gobject20.gobject.GObject instance) {
        return Pointer.pointerToAddress(this.g_signal_get_invocation_hint(instance), Pointer.class);
    }

    public native void g_signal_handler_block(generated.gobject20.gobject.GObject instance, long handler_id);

    public native void g_signal_handler_disconnect(generated.gobject20.gobject.GObject instance, long handler_id);

    protected native long g_signal_handler_find(generated.gobject20.gobject.GObject instance, Object mask, long signal_id, Object detail,
        @Ptr
        long closure, Pointer func, Pointer data);

    public long signal_handler_find(generated.gobject20.gobject.GObject instance, Object mask, long signal_id, Object detail, Pointer<GClosure> closure, Pointer func, Pointer data) {
        return this.g_signal_handler_find(instance, mask, signal_id, detail, Pointer.getPeer(closure), func, data);
    }

    public native boolean g_signal_handler_is_connected(generated.gobject20.gobject.GObject instance, long handler_id);

    public native void g_signal_handler_unblock(generated.gobject20.gobject.GObject instance, long handler_id);

    protected native long g_signal_handlers_block_matched(generated.gobject20.gobject.GObject instance, Object mask, long signal_id, Object detail,
        @Ptr
        long closure, Pointer func, Pointer data);

    public long signal_handlers_block_matched(generated.gobject20.gobject.GObject instance, Object mask, long signal_id, Object detail, Pointer<GClosure> closure, Pointer func, Pointer data) {
        return this.g_signal_handlers_block_matched(instance, mask, signal_id, detail, Pointer.getPeer(closure), func, data);
    }

    public native void g_signal_handlers_destroy(generated.gobject20.gobject.GObject instance);

    protected native long g_signal_handlers_disconnect_matched(generated.gobject20.gobject.GObject instance, Object mask, long signal_id, Object detail,
        @Ptr
        long closure, Pointer func, Pointer data);

    public long signal_handlers_disconnect_matched(generated.gobject20.gobject.GObject instance, Object mask, long signal_id, Object detail, Pointer<GClosure> closure, Pointer func, Pointer data) {
        return this.g_signal_handlers_disconnect_matched(instance, mask, signal_id, detail, Pointer.getPeer(closure), func, data);
    }

    protected native long g_signal_handlers_unblock_matched(generated.gobject20.gobject.GObject instance, Object mask, long signal_id, Object detail,
        @Ptr
        long closure, Pointer func, Pointer data);

    public long signal_handlers_unblock_matched(generated.gobject20.gobject.GObject instance, Object mask, long signal_id, Object detail, Pointer<GClosure> closure, Pointer func, Pointer data) {
        return this.g_signal_handlers_unblock_matched(instance, mask, signal_id, detail, Pointer.getPeer(closure), func, data);
    }

    public native boolean g_signal_has_handler_pending(generated.gobject20.gobject.GObject instance, long signal_id, Object detail, boolean may_be_blocked);

    @Ptr
    protected native long g_signal_list_ids(long itype,
        @Ptr
        long n_ids);

    public long signal_list_ids(long itype, Pointer<Long> n_ids) {
        return Pointer.pointerToAddress(this.g_signal_list_ids(itype, Pointer.getPeer(n_ids)), Long.class);
    }

    protected native long g_signal_lookup(
        @Ptr
        long name, long itype);

    public long signal_lookup(Pointer name, long itype) {
        return this.g_signal_lookup(Pointer.getPeer(name), itype);
    }

    @Ptr
    protected native long g_signal_name(long signal_id);

    public Pointer signal_name(long signal_id) {
        return Pointer.pointerToAddress(this.g_signal_name(signal_id));
    }

    protected native long g_signal_new(
        @Ptr
        long signal_name, long itype, Object signal_flags, long class_offset, Object accumulator, Pointer accu_data, Object c_marshaller, long return_type, long n_params, Object... varargs);

    public long signal_new(Pointer signal_name, long itype, Object signal_flags, long class_offset, Object accumulator, Pointer accu_data, Object c_marshaller, long return_type, long n_params, Object... varargs) {
        return this.g_signal_new(Pointer.getPeer(signal_name), itype, signal_flags, class_offset, accumulator, accu_data, c_marshaller, return_type, n_params, varargs);
    }

    protected native long g_signal_new_class_handler(
        @Ptr
        long signal_name, long itype, Object signal_flags, Object class_handler, Object accumulator, Pointer accu_data, Object c_marshaller, long return_type, long n_params, Object... varargs);

    public long signal_new_class_handler(Pointer signal_name, long itype, Object signal_flags, Object class_handler, Object accumulator, Pointer accu_data, Object c_marshaller, long return_type, long n_params, Object... varargs) {
        return this.g_signal_new_class_handler(Pointer.getPeer(signal_name), itype, signal_flags, class_handler, accumulator, accu_data, c_marshaller, return_type, n_params, varargs);
    }

    protected native long g_signal_newv(
        @Ptr
        long signal_name, long itype, Object signal_flags,
        @Ptr
        long class_closure, Object accumulator, Pointer accu_data, Object c_marshaller, long return_type, long n_params,
        @Ptr
        long param_types);

    public long signal_newv(Pointer signal_name, long itype, Object signal_flags, Pointer<GClosure> class_closure, Object accumulator, Pointer accu_data, Object c_marshaller, long return_type, long n_params, long param_types) {
        return this.g_signal_newv(Pointer.getPeer(signal_name), itype, signal_flags, Pointer.getPeer(class_closure), accumulator, accu_data, c_marshaller, return_type, n_params, Pointer.getPeer(param_types));
    }

    protected native void g_signal_override_class_closure(long signal_id, long instance_type,
        @Ptr
        long class_closure);

    public void signal_override_class_closure(long signal_id, long instance_type, Pointer<GClosure> class_closure) {
        this.g_signal_override_class_closure(signal_id, instance_type, Pointer.getPeer(class_closure));
    }

    protected native void g_signal_override_class_handler(
        @Ptr
        long signal_name, long instance_type, Object class_handler);

    public void signal_override_class_handler(Pointer signal_name, long instance_type, Object class_handler) {
        this.g_signal_override_class_handler(Pointer.getPeer(signal_name), instance_type, class_handler);
    }

    protected native boolean g_signal_parse_name(
        @Ptr
        long detailed_signal, long itype,
        @Ptr
        long signal_id_p,
        @Ptr
        long detail_p, boolean force_detail_quark);

    public boolean signal_parse_name(Pointer detailed_signal, long itype, Pointer<Long> signal_id_p, Pointer<Object> detail_p, boolean force_detail_quark) {
        return this.g_signal_parse_name(Pointer.getPeer(detailed_signal), itype, Pointer.getPeer(signal_id_p), Pointer.getPeer(detail_p), force_detail_quark);
    }

    protected native void g_signal_query(long signal_id,
        @Ptr
        long query);

    public void signal_query(long signal_id, Pointer<GSignalQuery> query) {
        this.g_signal_query(signal_id, Pointer.getPeer(query));
    }

    public native void g_signal_remove_emission_hook(long signal_id, long hook_id);

    public native void g_signal_set_va_marshaller(long signal_id, long instance_type, Object va_marshaller);

    public native void g_signal_stop_emission(generated.gobject20.gobject.GObject instance, long signal_id, Object detail);

    protected native void g_signal_stop_emission_by_name(generated.gobject20.gobject.GObject instance,
        @Ptr
        long detailed_signal);

    public void signal_stop_emission_by_name(generated.gobject20.gobject.GObject instance, Pointer detailed_signal) {
        this.g_signal_stop_emission_by_name(instance, Pointer.getPeer(detailed_signal));
    }

    @Ptr
    protected native long g_signal_type_cclosure_new(long itype, long struct_offset);

    public Pointer<GClosure> signal_type_cclosure_new(long itype, long struct_offset) {
        return Pointer.pointerToAddress(this.g_signal_type_cclosure_new(itype, struct_offset), Pointer.class);
    }

    protected native void g_source_set_closure(
        @Ptr
        long source,
        @Ptr
        long closure);

    public void source_set_closure(Pointer<GSource> source, Pointer<GClosure> closure) {
        this.g_source_set_closure(Pointer.getPeer(source), Pointer.getPeer(closure));
    }

    protected native void g_source_set_dummy_callback(
        @Ptr
        long source);

    public void source_set_dummy_callback(Pointer<GSource> source) {
        this.g_source_set_dummy_callback(Pointer.getPeer(source));
    }

    @Ptr
    protected native long g_strdup_value_contents(
        @Ptr
        long value);

    public Pointer strdup_value_contents(Pointer<GValue> value) {
        return Pointer.pointerToAddress(this.g_strdup_value_contents(Pointer.getPeer(value)));
    }

    public native void g_type_add_class_cache_func(Pointer cache_data, Object cache_func);

    public native void g_type_add_class_private(long class_type, long private_size);

    public native int g_type_add_instance_private(long class_type, long private_size);

    public native void g_type_add_interface_check(Pointer check_data, Object check_func);

    protected native void g_type_add_interface_dynamic(long instance_type, long interface_type,
        @Ptr
        long plugin);

    public void type_add_interface_dynamic(long instance_type, long interface_type, Pointer<Object> plugin) {
        this.g_type_add_interface_dynamic(instance_type, interface_type, Pointer.getPeer(plugin));
    }

    protected native void g_type_add_interface_static(long instance_type, long interface_type,
        @Ptr
        long info);

    public void type_add_interface_static(long instance_type, long interface_type, Pointer<GInterfaceInfo> info) {
        this.g_type_add_interface_static(instance_type, interface_type, Pointer.getPeer(info));
    }

    @Ptr
    protected native long g_type_check_class_cast(
        @Ptr
        long g_class, long is_a_type);

    public Pointer<GTypeClass> type_check_class_cast(Pointer<GTypeClass> g_class, long is_a_type) {
        return Pointer.pointerToAddress(this.g_type_check_class_cast(Pointer.getPeer(g_class), is_a_type), Pointer.class);
    }

    protected native boolean g_type_check_class_is_a(
        @Ptr
        long g_class, long is_a_type);

    public boolean type_check_class_is_a(Pointer<GTypeClass> g_class, long is_a_type) {
        return this.g_type_check_class_is_a(Pointer.getPeer(g_class), is_a_type);
    }

    protected native boolean g_type_check_instance(
        @Ptr
        long instance);

    public boolean type_check_instance(Pointer<GTypeInstance> instance) {
        return this.g_type_check_instance(Pointer.getPeer(instance));
    }

    @Ptr
    protected native long g_type_check_instance_cast(
        @Ptr
        long instance, long iface_type);

    public Pointer<GTypeInstance> type_check_instance_cast(Pointer<GTypeInstance> instance, long iface_type) {
        return Pointer.pointerToAddress(this.g_type_check_instance_cast(Pointer.getPeer(instance), iface_type), Pointer.class);
    }

    protected native boolean g_type_check_instance_is_a(
        @Ptr
        long instance, long iface_type);

    public boolean type_check_instance_is_a(Pointer<GTypeInstance> instance, long iface_type) {
        return this.g_type_check_instance_is_a(Pointer.getPeer(instance), iface_type);
    }

    public native boolean g_type_check_is_value_type(long type);

    protected native boolean g_type_check_value(
        @Ptr
        long value);

    public boolean type_check_value(Pointer<GValue> value) {
        return this.g_type_check_value(Pointer.getPeer(value));
    }

    protected native boolean g_type_check_value_holds(
        @Ptr
        long value, long type);

    public boolean type_check_value_holds(Pointer<GValue> value, long type) {
        return this.g_type_check_value_holds(Pointer.getPeer(value), type);
    }

    @Ptr
    protected native long g_type_children(long type,
        @Ptr
        long n_children);

    public long type_children(long type, Pointer<Long> n_children) {
        return Pointer.pointerToAddress(this.g_type_children(type, Pointer.getPeer(n_children)), Long.class);
    }

    public native void g_type_class_add_private(Pointer g_class, long private_size);

    protected native void g_type_class_adjust_private_offset(Pointer g_class,
        @Ptr
        long private_size_or_offset);

    public void type_class_adjust_private_offset(Pointer g_class, Pointer<Integer> private_size_or_offset) {
        this.g_type_class_adjust_private_offset(g_class, Pointer.getPeer(private_size_or_offset));
    }

    public native int g_type_class_get_instance_private_offset(Pointer g_class);

    public native GTypeClass g_type_class_peek(long type);

    public native GTypeClass g_type_class_peek_static(long type);

    public native GTypeClass g_type_class_ref(long type);

    @Ptr
    protected native long g_type_create_instance(long type);

    public Pointer<GTypeInstance> type_create_instance(long type) {
        return Pointer.pointerToAddress(this.g_type_create_instance(type), Pointer.class);
    }

    public native GTypeInterface g_type_default_interface_peek(long g_type);

    public native GTypeInterface g_type_default_interface_ref(long g_type);

    public native void g_type_default_interface_unref(GTypeInterface g_iface);

    public native long g_type_depth(long type);

    public native void g_type_ensure(long type);

    protected native void g_type_free_instance(
        @Ptr
        long instance);

    public void type_free_instance(Pointer<GTypeInstance> instance) {
        this.g_type_free_instance(Pointer.getPeer(instance));
    }

    protected native long g_type_from_name(
        @Ptr
        long name);

    public long type_from_name(Pointer name) {
        return this.g_type_from_name(Pointer.getPeer(name));
    }

    public native long g_type_fundamental(long type_id);

    public native long g_type_fundamental_next();

    @Ptr
    protected native long g_type_get_plugin(long type);

    public Pointer<Object> type_get_plugin(long type) {
        return Pointer.pointerToAddress(this.g_type_get_plugin(type), Pointer.class);
    }

    public native Pointer g_type_get_qdata(long type, Object quark);

    public native long g_type_get_type_registration_serial();

    public native void g_type_init();

    public native void g_type_init_with_debug_flags(Object debug_flags);

    public native void g_type_interface_add_prerequisite(long interface_type, long prerequisite_type);

    @Ptr
    protected native long g_type_interface_get_plugin(long instance_type, long interface_type);

    public Pointer<Object> type_interface_get_plugin(long instance_type, long interface_type) {
        return Pointer.pointerToAddress(this.g_type_interface_get_plugin(instance_type, interface_type), Pointer.class);
    }

    public native GTypeInterface g_type_interface_peek(GTypeClass instance_class, long iface_type);

    @Ptr
    protected native long g_type_interface_prerequisites(long interface_type,
        @Ptr
        long n_prerequisites);

    public long type_interface_prerequisites(long interface_type, Pointer<Long> n_prerequisites) {
        return Pointer.pointerToAddress(this.g_type_interface_prerequisites(interface_type, Pointer.getPeer(n_prerequisites)), Long.class);
    }

    @Ptr
    protected native long g_type_interfaces(long type,
        @Ptr
        long n_interfaces);

    public long type_interfaces(long type, Pointer<Long> n_interfaces) {
        return Pointer.pointerToAddress(this.g_type_interfaces(type, Pointer.getPeer(n_interfaces)), Long.class);
    }

    public native boolean g_type_is_a(long type, long is_a_type);

    @Ptr
    protected native long g_type_name(long type);

    public Pointer type_name(long type) {
        return Pointer.pointerToAddress(this.g_type_name(type));
    }

    @Ptr
    protected native long g_type_name_from_class(
        @Ptr
        long g_class);

    public Pointer type_name_from_class(Pointer<GTypeClass> g_class) {
        return Pointer.pointerToAddress(this.g_type_name_from_class(Pointer.getPeer(g_class)));
    }

    @Ptr
    protected native long g_type_name_from_instance(
        @Ptr
        long instance);

    public Pointer type_name_from_instance(Pointer<GTypeInstance> instance) {
        return Pointer.pointerToAddress(this.g_type_name_from_instance(Pointer.getPeer(instance)));
    }

    public native long g_type_next_base(long leaf_type, long root_type);

    public native long g_type_parent(long type);

    public native Object g_type_qname(long type);

    protected native void g_type_query(long type,
        @Ptr
        long query);

    public void type_query(long type, Pointer<GTypeQuery> query) {
        this.g_type_query(type, Pointer.getPeer(query));
    }

    protected native long g_type_register_dynamic(long parent_type,
        @Ptr
        long type_name,
        @Ptr
        long plugin, Object flags);

    public long type_register_dynamic(long parent_type, Pointer type_name, Pointer<Object> plugin, Object flags) {
        return this.g_type_register_dynamic(parent_type, Pointer.getPeer(type_name), Pointer.getPeer(plugin), flags);
    }

    protected native long g_type_register_fundamental(long type_id,
        @Ptr
        long type_name,
        @Ptr
        long info,
        @Ptr
        long finfo, Object flags);

    public long type_register_fundamental(long type_id, Pointer type_name, Pointer<GTypeInfo> info, Pointer<GTypeFundamentalInfo> finfo, Object flags) {
        return this.g_type_register_fundamental(type_id, Pointer.getPeer(type_name), Pointer.getPeer(info), Pointer.getPeer(finfo), flags);
    }

    protected native long g_type_register_static(long parent_type,
        @Ptr
        long type_name,
        @Ptr
        long info, Object flags);

    public long type_register_static(long parent_type, Pointer type_name, Pointer<GTypeInfo> info, Object flags) {
        return this.g_type_register_static(parent_type, Pointer.getPeer(type_name), Pointer.getPeer(info), flags);
    }

    protected native long g_type_register_static_simple(long parent_type,
        @Ptr
        long type_name, long class_size, Object class_init, long instance_size, Object instance_init, Object flags);

    public long type_register_static_simple(long parent_type, Pointer type_name, long class_size, Object class_init, long instance_size, Object instance_init, Object flags) {
        return this.g_type_register_static_simple(parent_type, Pointer.getPeer(type_name), class_size, class_init, instance_size, instance_init, flags);
    }

    public native void g_type_remove_class_cache_func(Pointer cache_data, Object cache_func);

    public native void g_type_remove_interface_check(Pointer check_data, Object check_func);

    public native void g_type_set_qdata(long type, Object quark, Pointer data);

    public native boolean g_type_test_flags(long type, long flags);

    @Ptr
    protected native long g_type_value_table_peek(long type);

    public Pointer<GTypeValueTable> type_value_table_peek(long type) {
        return Pointer.pointerToAddress(this.g_type_value_table_peek(type), Pointer.class);
    }

    public native void g_value_register_transform_func(long src_type, long dest_type, Object transform_func);

    public native boolean g_value_type_compatible(long src_type, long dest_type);

    public native boolean g_value_type_transformable(long src_type, long dest_type);

}
