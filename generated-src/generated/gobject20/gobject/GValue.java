
package generated.gobject20.gobject;

import generated.glib20.glib.GVariant;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gobject-2.0")
public class GValue
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GValue() {
        super();
    }

    public GValue(Pointer pointer) {
        super(pointer);
    }

    protected native void g_value_set_uchar(
        @Ptr
        long value, short v_uchar);

    public void set_uchar(short v_uchar) {
        this.g_value_set_uchar(Pointer.pointerTo(this, GValue.class).getPeer(), v_uchar);
    }

    @Field(0)
    private long gvalue_field_g_type() {
        return this.io.getLongField(this, 0);
    }

    @Field(0)
    private GValue gvalue_field_g_type(long gvalue_field_g_type) {
        this.io.setLongField(this, 0, gvalue_field_g_type);
        return this;
    }

    protected native long g_value_get_int64(
        @Ptr
        long value);

    public long get_int64() {
        return this.g_value_get_int64(Pointer.pointerTo(this, GValue.class).getPeer());
    }

    @Ptr
    protected native long g_value_get_variant(
        @Ptr
        long value);

    public Pointer<GVariant> get_variant() {
        return Pointer.pointerToAddress(this.g_value_get_variant(Pointer.pointerTo(this, GValue.class).getPeer()), GVariant.class);
    }

    @Ptr
    protected native long g_value_dup_string(
        @Ptr
        long value);

    public Pointer dup_string() {
        return Pointer.pointerToAddress(this.g_value_dup_string(Pointer.pointerTo(this, GValue.class).getPeer()));
    }

    @Ptr
    protected native long g_value_get_pointer(
        @Ptr
        long value);

    public Pointer get_pointer() {
        return Pointer.pointerToAddress(this.g_value_get_pointer(Pointer.pointerTo(this, GValue.class).getPeer()));
    }

    protected native void g_value_set_pointer(
        @Ptr
        long value,
        @Ptr
        long v_pointer);

    public void set_pointer(Pointer v_pointer) {
        this.g_value_set_pointer(Pointer.pointerTo(this, GValue.class).getPeer(), Pointer.getPeer(v_pointer));
    }

    @Ptr
    protected native long g_value_peek_pointer(
        @Ptr
        long value);

    public Pointer peek_pointer() {
        return Pointer.pointerToAddress(this.g_value_peek_pointer(Pointer.pointerTo(this, GValue.class).getPeer()));
    }

    protected native int g_value_get_int(
        @Ptr
        long value);

    public int get_int() {
        return this.g_value_get_int(Pointer.pointerTo(this, GValue.class).getPeer());
    }

    protected native void g_value_set_int(
        @Ptr
        long value, int v_int);

    public void set_int(int v_int) {
        this.g_value_set_int(Pointer.pointerTo(this, GValue.class).getPeer(), v_int);
    }

    protected native void g_value_set_string_take_ownership(
        @Ptr
        long value,
        @Ptr
        long v_string);

    public void set_string_take_ownership(Pointer v_string) {
        this.g_value_set_string_take_ownership(Pointer.pointerTo(this, GValue.class).getPeer(), Pointer.getPeer(v_string));
    }

    protected native void g_value_take_string(
        @Ptr
        long value,
        @Ptr
        long v_string);

    public void take_string(Pointer v_string) {
        this.g_value_take_string(Pointer.pointerTo(this, GValue.class).getPeer(), Pointer.getPeer(v_string));
    }

    protected native void g_value_set_double(
        @Ptr
        long value, double v_double);

    public void set_double(double v_double) {
        this.g_value_set_double(Pointer.pointerTo(this, GValue.class).getPeer(), v_double);
    }

    protected native long g_value_get_gtype(
        @Ptr
        long value);

    public long get_gtype() {
        return this.g_value_get_gtype(Pointer.pointerTo(this, GValue.class).getPeer());
    }

    protected static native void g_value_register_transform_func(long src_type, long dest_type,
        @Ptr
        long transform_func);

    public static void register_transform_func(long src_type, long dest_type, Pointer transform_func) {
        GValue.g_value_register_transform_func(src_type, dest_type, Pointer.getPeer(transform_func));
    }

    protected native void g_value_set_object(
        @Ptr
        long value,
        @Ptr
        long v_object);

    public void set_object(Pointer<GObject> v_object) {
        this.g_value_set_object(Pointer.pointerTo(this, GValue.class).getPeer(), Pointer.getPeer(v_object));
    }

    protected native void g_value_unset(
        @Ptr
        long value);

    public void unset() {
        this.g_value_unset(Pointer.pointerTo(this, GValue.class).getPeer());
    }

    protected native void g_value_copy(
        @Ptr
        long src_value,
        @Ptr
        long dest_value);

    public void copy(Pointer<GValue> dest_value) {
        this.g_value_copy(Pointer.pointerTo(this, GValue.class).getPeer(), Pointer.getPeer(dest_value));
    }

    protected native void g_value_set_static_boxed(
        @Ptr
        long value,
        @Ptr
        long v_boxed);

    public void set_static_boxed(Pointer v_boxed) {
        this.g_value_set_static_boxed(Pointer.pointerTo(this, GValue.class).getPeer(), Pointer.getPeer(v_boxed));
    }

    @Field(1)
    public Pointer<G_Value__data__union> gvalue_field_data() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GValue gvalue_field_data(Pointer<G_Value__data__union> gvalue_field_data) {
        this.io.setPointerField(this, 1, gvalue_field_data);
        return this;
    }

    protected native void g_value_set_enum(
        @Ptr
        long value, int v_enum);

    public void set_enum(int v_enum) {
        this.g_value_set_enum(Pointer.pointerTo(this, GValue.class).getPeer(), v_enum);
    }

    protected native long g_value_get_uint64(
        @Ptr
        long value);

    public long get_uint64() {
        return this.g_value_get_uint64(Pointer.pointerTo(this, GValue.class).getPeer());
    }

    @Ptr
    protected native long g_value_dup_boxed(
        @Ptr
        long value);

    public Pointer dup_boxed() {
        return Pointer.pointerToAddress(this.g_value_dup_boxed(Pointer.pointerTo(this, GValue.class).getPeer()));
    }

    protected native void g_value_set_param_take_ownership(
        @Ptr
        long value,
        @Ptr
        long param);

    public void set_param_take_ownership(Pointer<GParamSpec> param) {
        this.g_value_set_param_take_ownership(Pointer.pointerTo(this, GValue.class).getPeer(), Pointer.getPeer(param));
    }

    protected native void g_value_set_gtype(
        @Ptr
        long value, long v_gtype);

    public void set_gtype(long v_gtype) {
        this.g_value_set_gtype(Pointer.pointerTo(this, GValue.class).getPeer(), v_gtype);
    }

    protected native long g_value_get_uint(
        @Ptr
        long value);

    public long get_uint() {
        return this.g_value_get_uint(Pointer.pointerTo(this, GValue.class).getPeer());
    }

    protected native void g_value_set_flags(
        @Ptr
        long value, long v_flags);

    public void set_flags(long v_flags) {
        this.g_value_set_flags(Pointer.pointerTo(this, GValue.class).getPeer(), v_flags);
    }

    protected native void g_value_set_uint64(
        @Ptr
        long value, long v_uint64);

    public void set_uint64(long v_uint64) {
        this.g_value_set_uint64(Pointer.pointerTo(this, GValue.class).getPeer(), v_uint64);
    }

    protected native long g_value_get_long(
        @Ptr
        long value);

    public long get_long() {
        return this.g_value_get_long(Pointer.pointerTo(this, GValue.class).getPeer());
    }

    protected native void g_value_take_variant(
        @Ptr
        long value,
        @Ptr
        long variant);

    public void take_variant(Pointer<GVariant> variant) {
        this.g_value_take_variant(Pointer.pointerTo(this, GValue.class).getPeer(), Pointer.getPeer(variant));
    }

    public static native boolean g_value_type_compatible(long src_type, long dest_type);

    protected native boolean g_value_get_boolean(
        @Ptr
        long value);

    public boolean get_boolean() {
        return this.g_value_get_boolean(Pointer.pointerTo(this, GValue.class).getPeer());
    }

    protected native void g_value_set_boxed_take_ownership(
        @Ptr
        long value,
        @Ptr
        long v_boxed);

    public void set_boxed_take_ownership(Pointer v_boxed) {
        this.g_value_set_boxed_take_ownership(Pointer.pointerTo(this, GValue.class).getPeer(), Pointer.getPeer(v_boxed));
    }

    protected native void g_value_set_char(
        @Ptr
        long value, char v_char);

    public void set_char(char v_char) {
        this.g_value_set_char(Pointer.pointerTo(this, GValue.class).getPeer(), v_char);
    }

    protected native void g_value_set_int64(
        @Ptr
        long value, long v_int64);

    public void set_int64(long v_int64) {
        this.g_value_set_int64(Pointer.pointerTo(this, GValue.class).getPeer(), v_int64);
    }

    protected native void g_value_set_variant(
        @Ptr
        long value,
        @Ptr
        long variant);

    public void set_variant(Pointer<GVariant> variant) {
        this.g_value_set_variant(Pointer.pointerTo(this, GValue.class).getPeer(), Pointer.getPeer(variant));
    }

    protected native long g_value_get_ulong(
        @Ptr
        long value);

    public long get_ulong() {
        return this.g_value_get_ulong(Pointer.pointerTo(this, GValue.class).getPeer());
    }

    protected native long g_value_get_flags(
        @Ptr
        long value);

    public long get_flags() {
        return this.g_value_get_flags(Pointer.pointerTo(this, GValue.class).getPeer());
    }

    protected native void g_value_take_param(
        @Ptr
        long value,
        @Ptr
        long param);

    public void take_param(Pointer<GParamSpec> param) {
        this.g_value_take_param(Pointer.pointerTo(this, GValue.class).getPeer(), Pointer.getPeer(param));
    }

    protected native void g_value_take_object(
        @Ptr
        long value,
        @Ptr
        long v_object);

    public void take_object(Pointer v_object) {
        this.g_value_take_object(Pointer.pointerTo(this, GValue.class).getPeer(), Pointer.getPeer(v_object));
    }

    protected native void g_value_set_static_string(
        @Ptr
        long value,
        @Ptr
        long v_string);

    public void set_static_string(Pointer v_string) {
        this.g_value_set_static_string(Pointer.pointerTo(this, GValue.class).getPeer(), Pointer.getPeer(v_string));
    }

    protected native int g_value_get_enum(
        @Ptr
        long value);

    public int get_enum() {
        return this.g_value_get_enum(Pointer.pointerTo(this, GValue.class).getPeer());
    }

    protected native void g_value_set_schar(
        @Ptr
        long value, char v_char);

    public void set_schar(char v_char) {
        this.g_value_set_schar(Pointer.pointerTo(this, GValue.class).getPeer(), v_char);
    }

    protected native void g_value_set_long(
        @Ptr
        long value, long v_long);

    public void set_long(long v_long) {
        this.g_value_set_long(Pointer.pointerTo(this, GValue.class).getPeer(), v_long);
    }

    @Ptr
    protected native long g_value_dup_variant(
        @Ptr
        long value);

    public Pointer<GVariant> dup_variant() {
        return Pointer.pointerToAddress(this.g_value_dup_variant(Pointer.pointerTo(this, GValue.class).getPeer()), GVariant.class);
    }

    protected native void g_value_set_boxed(
        @Ptr
        long value,
        @Ptr
        long v_boxed);

    public void set_boxed(Pointer v_boxed) {
        this.g_value_set_boxed(Pointer.pointerTo(this, GValue.class).getPeer(), Pointer.getPeer(v_boxed));
    }

    protected native boolean g_value_transform(
        @Ptr
        long src_value,
        @Ptr
        long dest_value);

    public boolean transform(Pointer<GValue> dest_value) {
        return this.g_value_transform(Pointer.pointerTo(this, GValue.class).getPeer(), Pointer.getPeer(dest_value));
    }

    protected native void g_value_set_boolean(
        @Ptr
        long value, boolean v_boolean);

    public void set_boolean(boolean v_boolean) {
        this.g_value_set_boolean(Pointer.pointerTo(this, GValue.class).getPeer(), v_boolean);
    }

    @Ptr
    protected native long g_value_reset(
        @Ptr
        long value);

    public Pointer<GValue> reset() {
        return Pointer.pointerToAddress(this.g_value_reset(Pointer.pointerTo(this, GValue.class).getPeer()), GValue.class);
    }

    protected native boolean g_value_fits_pointer(
        @Ptr
        long value);

    public boolean fits_pointer() {
        return this.g_value_fits_pointer(Pointer.pointerTo(this, GValue.class).getPeer());
    }

    protected native void g_value_set_float(
        @Ptr
        long value, float v_float);

    public void set_float(float v_float) {
        this.g_value_set_float(Pointer.pointerTo(this, GValue.class).getPeer(), v_float);
    }

    @Ptr
    protected native long g_value_get_param(
        @Ptr
        long value);

    public Pointer<GParamSpec> get_param() {
        return Pointer.pointerToAddress(this.g_value_get_param(Pointer.pointerTo(this, GValue.class).getPeer()), GParamSpec.class);
    }

    protected native void g_value_set_object_take_ownership(
        @Ptr
        long value,
        @Ptr
        long v_object);

    public void set_object_take_ownership(Pointer v_object) {
        this.g_value_set_object_take_ownership(Pointer.pointerTo(this, GValue.class).getPeer(), Pointer.getPeer(v_object));
    }

    @Ptr
    protected native long g_value_get_string(
        @Ptr
        long value);

    public Pointer get_string() {
        return Pointer.pointerToAddress(this.g_value_get_string(Pointer.pointerTo(this, GValue.class).getPeer()));
    }

    @Ptr
    protected native long g_value_dup_param(
        @Ptr
        long value);

    public Pointer<GParamSpec> dup_param() {
        return Pointer.pointerToAddress(this.g_value_dup_param(Pointer.pointerTo(this, GValue.class).getPeer()), GParamSpec.class);
    }

    @Ptr
    protected native long g_value_dup_object(
        @Ptr
        long value);

    public Pointer<GObject> dup_object() {
        return Pointer.pointerToAddress(this.g_value_dup_object(Pointer.pointerTo(this, GValue.class).getPeer()), GObject.class);
    }

    protected native double g_value_get_double(
        @Ptr
        long value);

    public double get_double() {
        return this.g_value_get_double(Pointer.pointerTo(this, GValue.class).getPeer());
    }

    protected native float g_value_get_float(
        @Ptr
        long value);

    public float get_float() {
        return this.g_value_get_float(Pointer.pointerTo(this, GValue.class).getPeer());
    }

    protected native char g_value_get_schar(
        @Ptr
        long value);

    public char get_schar() {
        return this.g_value_get_schar(Pointer.pointerTo(this, GValue.class).getPeer());
    }

    protected native void g_value_set_param(
        @Ptr
        long value,
        @Ptr
        long param);

    public void set_param(Pointer<GParamSpec> param) {
        this.g_value_set_param(Pointer.pointerTo(this, GValue.class).getPeer(), Pointer.getPeer(param));
    }

    protected native short g_value_get_uchar(
        @Ptr
        long value);

    public short get_uchar() {
        return this.g_value_get_uchar(Pointer.pointerTo(this, GValue.class).getPeer());
    }

    protected native void g_value_set_instance(
        @Ptr
        long value,
        @Ptr
        long instance);

    public void set_instance(Pointer instance) {
        this.g_value_set_instance(Pointer.pointerTo(this, GValue.class).getPeer(), Pointer.getPeer(instance));
    }

    protected native char g_value_get_char(
        @Ptr
        long value);

    public char get_char() {
        return this.g_value_get_char(Pointer.pointerTo(this, GValue.class).getPeer());
    }

    public static native boolean g_value_type_transformable(long src_type, long dest_type);

    @Ptr
    protected native long g_value_get_object(
        @Ptr
        long value);

    public Pointer<GObject> get_object() {
        return Pointer.pointerToAddress(this.g_value_get_object(Pointer.pointerTo(this, GValue.class).getPeer()), GObject.class);
    }

    @Ptr
    protected native long g_value_init(
        @Ptr
        long value, long g_type);

    public Pointer<GValue> init(long g_type) {
        return Pointer.pointerToAddress(this.g_value_init(Pointer.pointerTo(this, GValue.class).getPeer(), g_type), GValue.class);
    }

    protected native void g_value_set_string(
        @Ptr
        long value,
        @Ptr
        long v_string);

    public void set_string(Pointer v_string) {
        this.g_value_set_string(Pointer.pointerTo(this, GValue.class).getPeer(), Pointer.getPeer(v_string));
    }

    protected native void g_value_set_uint(
        @Ptr
        long value, long v_uint);

    public void set_uint(long v_uint) {
        this.g_value_set_uint(Pointer.pointerTo(this, GValue.class).getPeer(), v_uint);
    }

    protected native void g_value_set_ulong(
        @Ptr
        long value, long v_ulong);

    public void set_ulong(long v_ulong) {
        this.g_value_set_ulong(Pointer.pointerTo(this, GValue.class).getPeer(), v_ulong);
    }

    @Ptr
    protected native long g_value_get_boxed(
        @Ptr
        long value);

    public Pointer get_boxed() {
        return Pointer.pointerToAddress(this.g_value_get_boxed(Pointer.pointerTo(this, GValue.class).getPeer()));
    }

    protected native void g_value_take_boxed(
        @Ptr
        long value,
        @Ptr
        long v_boxed);

    public void take_boxed(Pointer v_boxed) {
        this.g_value_take_boxed(Pointer.pointerTo(this, GValue.class).getPeer(), Pointer.getPeer(v_boxed));
    }

}
