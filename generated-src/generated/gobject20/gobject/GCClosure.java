
package generated.gobject20.gobject;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gobject-2.0")
public class GCClosure
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GCClosure() {
        super();
    }

    public GCClosure(Pointer pointer) {
        super(pointer);
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

    public static void marshal_VOID__ENUM(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        GCClosure.g_cclosure_marshal_VOID__ENUM(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), Pointer.getPeer(invocation_hint), Pointer.getPeer(marshal_data));
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

    public static void marshal_VOID__CHAR(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        GCClosure.g_cclosure_marshal_VOID__CHAR(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), Pointer.getPeer(invocation_hint), Pointer.getPeer(marshal_data));
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

    public static void marshal_BOOLEAN__BOXED_BOXED(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        GCClosure.g_cclosure_marshal_BOOLEAN__BOXED_BOXED(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), Pointer.getPeer(invocation_hint), Pointer.getPeer(marshal_data));
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

    public static void marshal_VOID__PARAM(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        GCClosure.g_cclosure_marshal_VOID__PARAM(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), Pointer.getPeer(invocation_hint), Pointer.getPeer(marshal_data));
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

    public static void marshal_VOID__LONG(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        GCClosure.g_cclosure_marshal_VOID__LONG(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), Pointer.getPeer(invocation_hint), Pointer.getPeer(marshal_data));
    }

    @Ptr
    protected static native long g_cclosure_new_object(
        @Ptr
        long callback_func,
        @Ptr
        long object);

    public static Pointer<GClosure> new_object(Pointer callback_func, Pointer<GObject> object) {
        return Pointer.pointerToAddress(GCClosure.g_cclosure_new_object(Pointer.getPeer(callback_func), Pointer.getPeer(object)), GClosure.class);
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

    public static void marshal_VOID__VARIANT(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        GCClosure.g_cclosure_marshal_VOID__VARIANT(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), Pointer.getPeer(invocation_hint), Pointer.getPeer(marshal_data));
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

    public static void marshal_VOID__BOXED(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        GCClosure.g_cclosure_marshal_VOID__BOXED(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), Pointer.getPeer(invocation_hint), Pointer.getPeer(marshal_data));
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

    public static void marshal_VOID__FLOAT(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        GCClosure.g_cclosure_marshal_VOID__FLOAT(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), Pointer.getPeer(invocation_hint), Pointer.getPeer(marshal_data));
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

    public static void marshal_VOID__FLAGS(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        GCClosure.g_cclosure_marshal_VOID__FLAGS(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), Pointer.getPeer(invocation_hint), Pointer.getPeer(marshal_data));
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

    public static void marshal_VOID__UINT(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        GCClosure.g_cclosure_marshal_VOID__UINT(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), Pointer.getPeer(invocation_hint), Pointer.getPeer(marshal_data));
    }

    @Ptr
    protected static native long g_cclosure_new(
        @Ptr
        long callback_func,
        @Ptr
        long user_data,
        @Ptr
        long destroy_data);

    public static Pointer<GClosure> _new(Pointer callback_func, Pointer user_data, Pointer destroy_data) {
        return Pointer.pointerToAddress(GCClosure.g_cclosure_new(Pointer.getPeer(callback_func), Pointer.getPeer(user_data), Pointer.getPeer(destroy_data)), GClosure.class);
    }

    @Ptr
    protected static native long g_cclosure_new_object_swap(
        @Ptr
        long callback_func,
        @Ptr
        long object);

    public static Pointer<GClosure> new_object_swap(Pointer callback_func, Pointer<GObject> object) {
        return Pointer.pointerToAddress(GCClosure.g_cclosure_new_object_swap(Pointer.getPeer(callback_func), Pointer.getPeer(object)), GClosure.class);
    }

    @Field(0)
    public GClosure field_closure() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GCClosure field_closure(GClosure field_closure) {
        this.io.setNativeObjectField(this, 0, field_closure);
        return this;
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

    public static void marshal_generic(Pointer<GClosure> closure, Pointer<GValue> return_gvalue, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        GCClosure.g_cclosure_marshal_generic(Pointer.getPeer(closure), Pointer.getPeer(return_gvalue), n_param_values, Pointer.getPeer(param_values), Pointer.getPeer(invocation_hint), Pointer.getPeer(marshal_data));
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

    public static void marshal_VOID__ULONG(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        GCClosure.g_cclosure_marshal_VOID__ULONG(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), Pointer.getPeer(invocation_hint), Pointer.getPeer(marshal_data));
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

    public static void marshal_VOID__UCHAR(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        GCClosure.g_cclosure_marshal_VOID__UCHAR(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), Pointer.getPeer(invocation_hint), Pointer.getPeer(marshal_data));
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

    public static void marshal_VOID__BOOLEAN(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        GCClosure.g_cclosure_marshal_VOID__BOOLEAN(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), Pointer.getPeer(invocation_hint), Pointer.getPeer(marshal_data));
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

    public static void marshal_VOID__UINT_POINTER(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        GCClosure.g_cclosure_marshal_VOID__UINT_POINTER(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), Pointer.getPeer(invocation_hint), Pointer.getPeer(marshal_data));
    }

    @Field(1)
    public Pointer field_callback() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GCClosure field_callback(Pointer field_callback) {
        this.io.setPointerField(this, 1, field_callback);
        return this;
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

    public static void marshal_VOID__POINTER(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        GCClosure.g_cclosure_marshal_VOID__POINTER(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), Pointer.getPeer(invocation_hint), Pointer.getPeer(marshal_data));
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

    public static void marshal_STRING__OBJECT_POINTER(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        GCClosure.g_cclosure_marshal_STRING__OBJECT_POINTER(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), Pointer.getPeer(invocation_hint), Pointer.getPeer(marshal_data));
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

    public static void marshal_BOOLEAN__FLAGS(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        GCClosure.g_cclosure_marshal_BOOLEAN__FLAGS(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), Pointer.getPeer(invocation_hint), Pointer.getPeer(marshal_data));
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

    public static void marshal_VOID__DOUBLE(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        GCClosure.g_cclosure_marshal_VOID__DOUBLE(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), Pointer.getPeer(invocation_hint), Pointer.getPeer(marshal_data));
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

    public static void marshal_VOID__STRING(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        GCClosure.g_cclosure_marshal_VOID__STRING(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), Pointer.getPeer(invocation_hint), Pointer.getPeer(marshal_data));
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

    public static void marshal_VOID__VOID(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        GCClosure.g_cclosure_marshal_VOID__VOID(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), Pointer.getPeer(invocation_hint), Pointer.getPeer(marshal_data));
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

    public static void marshal_VOID__INT(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        GCClosure.g_cclosure_marshal_VOID__INT(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), Pointer.getPeer(invocation_hint), Pointer.getPeer(marshal_data));
    }

    @Ptr
    protected static native long g_cclosure_new_swap(
        @Ptr
        long callback_func,
        @Ptr
        long user_data,
        @Ptr
        long destroy_data);

    public static Pointer<GClosure> new_swap(Pointer callback_func, Pointer user_data, Pointer destroy_data) {
        return Pointer.pointerToAddress(GCClosure.g_cclosure_new_swap(Pointer.getPeer(callback_func), Pointer.getPeer(user_data), Pointer.getPeer(destroy_data)), GClosure.class);
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

    public static void marshal_VOID__OBJECT(Pointer<GClosure> closure, Pointer<GValue> return_value, long n_param_values, Pointer<GValue> param_values, Pointer invocation_hint, Pointer marshal_data) {
        GCClosure.g_cclosure_marshal_VOID__OBJECT(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), Pointer.getPeer(invocation_hint), Pointer.getPeer(marshal_data));
    }

}
