
package generated.glib20.glib;

import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GVariant
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GVariant() {
        super();
    }

    public GVariant(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_variant_new(
        @Ptr
        long format_string, Object... varargs);

    public static Pointer _new(Pointer format_string, Object... varargs) {
        return Pointer.pointerToAddress(GVariant.g_variant_new(Pointer.getPeer(format_string), varargs));
    }

    @Ptr
    protected static native long g_variant_new_array(
        @Ptr
        long child_type,
        @Ptr
        long children, long n_children);

    public static Pointer new_array(Pointer child_type, Pointer children, long n_children) {
        return Pointer.pointerToAddress(GVariant.g_variant_new_array(Pointer.getPeer(child_type), Pointer.getPeer(children), n_children));
    }

    @Ptr
    protected static native long g_variant_new_boolean(boolean value);

    public static Pointer new_boolean(boolean value) {
        return Pointer.pointerToAddress(GVariant.g_variant_new_boolean(value));
    }

    @Ptr
    protected static native long g_variant_new_byte(short value);

    public static Pointer new_byte(short value) {
        return Pointer.pointerToAddress(GVariant.g_variant_new_byte(value));
    }

    @Ptr
    protected static native long g_variant_new_bytestring(
        @Ptr
        long string);

    public static Pointer new_bytestring(Pointer<Short> string) {
        return Pointer.pointerToAddress(GVariant.g_variant_new_bytestring(Pointer.getPeer(string)));
    }

    @Ptr
    protected static native long g_variant_new_bytestring_array(
        @Ptr
        long strv, long length);

    public static Pointer new_bytestring_array(Pointer strv, long length) {
        return Pointer.pointerToAddress(GVariant.g_variant_new_bytestring_array(Pointer.getPeer(strv), length));
    }

    @Ptr
    protected static native long g_variant_new_dict_entry(
        @Ptr
        long key,
        @Ptr
        long value);

    public static Pointer new_dict_entry(Pointer key, Pointer value) {
        return Pointer.pointerToAddress(GVariant.g_variant_new_dict_entry(Pointer.getPeer(key), Pointer.getPeer(value)));
    }

    @Ptr
    protected static native long g_variant_new_double(double value);

    public static Pointer new_double(double value) {
        return Pointer.pointerToAddress(GVariant.g_variant_new_double(value));
    }

    @Ptr
    protected static native long g_variant_new_fixed_array(
        @Ptr
        long element_type,
        @Ptr
        long elements, long n_elements, long element_size);

    public static Pointer new_fixed_array(Pointer element_type, Pointer elements, long n_elements, long element_size) {
        return Pointer.pointerToAddress(GVariant.g_variant_new_fixed_array(Pointer.getPeer(element_type), Pointer.getPeer(elements), n_elements, element_size));
    }

    @Ptr
    protected static native long g_variant_new_from_bytes(
        @Ptr
        long type,
        @Ptr
        long bytes, boolean trusted);

    public static Pointer new_from_bytes(Pointer type, Pointer<GBytes> bytes, boolean trusted) {
        return Pointer.pointerToAddress(GVariant.g_variant_new_from_bytes(Pointer.getPeer(type), Pointer.getPeer(bytes), trusted));
    }

    @Ptr
    protected static native long g_variant_new_from_data(
        @Ptr
        long type, short data, long size, boolean trusted,
        @Ptr
        long notify,
        @Ptr
        long user_data);

    public static Pointer new_from_data(Pointer type, short data, long size, boolean trusted, Pointer notify, Pointer user_data) {
        return Pointer.pointerToAddress(GVariant.g_variant_new_from_data(Pointer.getPeer(type), data, size, trusted, Pointer.getPeer(notify), Pointer.getPeer(user_data)));
    }

    @Ptr
    protected static native long g_variant_new_handle(int value);

    public static Pointer new_handle(int value) {
        return Pointer.pointerToAddress(GVariant.g_variant_new_handle(value));
    }

    @Ptr
    protected static native long g_variant_new_int16(short value);

    public static Pointer new_int16(short value) {
        return Pointer.pointerToAddress(GVariant.g_variant_new_int16(value));
    }

    @Ptr
    protected static native long g_variant_new_int32(int value);

    public static Pointer new_int32(int value) {
        return Pointer.pointerToAddress(GVariant.g_variant_new_int32(value));
    }

    @Ptr
    protected static native long g_variant_new_int64(long value);

    public static Pointer new_int64(long value) {
        return Pointer.pointerToAddress(GVariant.g_variant_new_int64(value));
    }

    @Ptr
    protected static native long g_variant_new_maybe(
        @Ptr
        long child_type,
        @Ptr
        long child);

    public static Pointer new_maybe(Pointer child_type, Pointer child) {
        return Pointer.pointerToAddress(GVariant.g_variant_new_maybe(Pointer.getPeer(child_type), Pointer.getPeer(child)));
    }

    @Ptr
    protected static native long g_variant_new_object_path(
        @Ptr
        long object_path);

    public static Pointer new_object_path(Pointer object_path) {
        return Pointer.pointerToAddress(GVariant.g_variant_new_object_path(Pointer.getPeer(object_path)));
    }

    @Ptr
    protected static native long g_variant_new_objv(
        @Ptr
        long strv, long length);

    public static Pointer new_objv(Pointer strv, long length) {
        return Pointer.pointerToAddress(GVariant.g_variant_new_objv(Pointer.getPeer(strv), length));
    }

    @Ptr
    protected static native long g_variant_new_parsed(
        @Ptr
        long format, Object... varargs);

    public static Pointer new_parsed(Pointer format, Object... varargs) {
        return Pointer.pointerToAddress(GVariant.g_variant_new_parsed(Pointer.getPeer(format), varargs));
    }

    @Ptr
    protected static native long g_variant_new_parsed_va(
        @Ptr
        long format,
        @Ptr
        long app);

    public static Pointer new_parsed_va(Pointer format, Pointer app) {
        return Pointer.pointerToAddress(GVariant.g_variant_new_parsed_va(Pointer.getPeer(format), Pointer.getPeer(app)));
    }

    @Ptr
    protected static native long g_variant_new_printf(
        @Ptr
        long format_string, Object... varargs);

    public static Pointer new_printf(Pointer format_string, Object... varargs) {
        return Pointer.pointerToAddress(GVariant.g_variant_new_printf(Pointer.getPeer(format_string), varargs));
    }

    @Ptr
    protected static native long g_variant_new_signature(
        @Ptr
        long signature);

    public static Pointer new_signature(Pointer signature) {
        return Pointer.pointerToAddress(GVariant.g_variant_new_signature(Pointer.getPeer(signature)));
    }

    @Ptr
    protected static native long g_variant_new_string(
        @Ptr
        long string);

    public static Pointer new_string(Pointer string) {
        return Pointer.pointerToAddress(GVariant.g_variant_new_string(Pointer.getPeer(string)));
    }

    @Ptr
    protected static native long g_variant_new_strv(
        @Ptr
        long strv, long length);

    public static Pointer new_strv(Pointer strv, long length) {
        return Pointer.pointerToAddress(GVariant.g_variant_new_strv(Pointer.getPeer(strv), length));
    }

    @Ptr
    protected static native long g_variant_new_take_string(
        @Ptr
        long string);

    public static Pointer new_take_string(Pointer string) {
        return Pointer.pointerToAddress(GVariant.g_variant_new_take_string(Pointer.getPeer(string)));
    }

    @Ptr
    protected static native long g_variant_new_tuple(
        @Ptr
        long children, long n_children);

    public static Pointer new_tuple(Pointer children, long n_children) {
        return Pointer.pointerToAddress(GVariant.g_variant_new_tuple(Pointer.getPeer(children), n_children));
    }

    @Ptr
    protected static native long g_variant_new_uint16(int value);

    public static Pointer new_uint16(int value) {
        return Pointer.pointerToAddress(GVariant.g_variant_new_uint16(value));
    }

    @Ptr
    protected static native long g_variant_new_uint32(long value);

    public static Pointer new_uint32(long value) {
        return Pointer.pointerToAddress(GVariant.g_variant_new_uint32(value));
    }

    @Ptr
    protected static native long g_variant_new_uint64(long value);

    public static Pointer new_uint64(long value) {
        return Pointer.pointerToAddress(GVariant.g_variant_new_uint64(value));
    }

    @Ptr
    protected static native long g_variant_new_va(
        @Ptr
        long format_string,
        @Ptr
        long endptr,
        @Ptr
        long app);

    public static Pointer new_va(Pointer format_string, Pointer endptr, Pointer app) {
        return Pointer.pointerToAddress(GVariant.g_variant_new_va(Pointer.getPeer(format_string), Pointer.getPeer(endptr), Pointer.getPeer(app)));
    }

    @Ptr
    protected static native long g_variant_new_variant(
        @Ptr
        long value);

    public static Pointer new_variant(Pointer value) {
        return Pointer.pointerToAddress(GVariant.g_variant_new_variant(Pointer.getPeer(value)));
    }

    @Ptr
    protected native long g_variant_byteswap(
        @Ptr
        long value);

    public Pointer byteswap() {
        return Pointer.pointerToAddress(this.g_variant_byteswap(Pointer.pointerTo(this, GVariant.class).getPeer()));
    }

    protected native boolean g_variant_check_format_string(
        @Ptr
        long value,
        @Ptr
        long format_string, boolean copy_only);

    public boolean check_format_string(Pointer format_string, boolean copy_only) {
        return this.g_variant_check_format_string(Pointer.pointerTo(this, GVariant.class).getPeer(), Pointer.getPeer(format_string), copy_only);
    }

    @Ptr
    protected native long g_variant_dup_bytestring(
        @Ptr
        long value,
        @Ptr
        long length);

    public Pointer<Short> dup_bytestring(Pointer<Long> length) {
        return Pointer.pointerToAddress(this.g_variant_dup_bytestring(Pointer.pointerTo(this, GVariant.class).getPeer(), Pointer.getPeer(length)), Short.class);
    }

    @Ptr
    protected native long g_variant_dup_bytestring_array(
        @Ptr
        long value,
        @Ptr
        long length);

    public Pointer dup_bytestring_array(Pointer<Long> length) {
        return Pointer.pointerToAddress(this.g_variant_dup_bytestring_array(Pointer.pointerTo(this, GVariant.class).getPeer(), Pointer.getPeer(length)));
    }

    @Ptr
    protected native long g_variant_dup_objv(
        @Ptr
        long value,
        @Ptr
        long length);

    public Pointer dup_objv(Pointer<Long> length) {
        return Pointer.pointerToAddress(this.g_variant_dup_objv(Pointer.pointerTo(this, GVariant.class).getPeer(), Pointer.getPeer(length)));
    }

    @Ptr
    protected native long g_variant_dup_string(
        @Ptr
        long value,
        @Ptr
        long length);

    public Pointer dup_string(Pointer<Long> length) {
        return Pointer.pointerToAddress(this.g_variant_dup_string(Pointer.pointerTo(this, GVariant.class).getPeer(), Pointer.getPeer(length)));
    }

    @Ptr
    protected native long g_variant_dup_strv(
        @Ptr
        long value,
        @Ptr
        long length);

    public Pointer dup_strv(Pointer<Long> length) {
        return Pointer.pointerToAddress(this.g_variant_dup_strv(Pointer.pointerTo(this, GVariant.class).getPeer(), Pointer.getPeer(length)));
    }

    protected native void g_variant_get(
        @Ptr
        long value,
        @Ptr
        long format_string, Object... varargs);

    public void get(Pointer format_string, Object... varargs) {
        this.g_variant_get(Pointer.pointerTo(this, GVariant.class).getPeer(), Pointer.getPeer(format_string), varargs);
    }

    protected native boolean g_variant_get_boolean(
        @Ptr
        long value);

    public boolean get_boolean() {
        return this.g_variant_get_boolean(Pointer.pointerTo(this, GVariant.class).getPeer());
    }

    protected native short g_variant_get_byte(
        @Ptr
        long value);

    public short get_byte() {
        return this.g_variant_get_byte(Pointer.pointerTo(this, GVariant.class).getPeer());
    }

    @Ptr
    protected native long g_variant_get_bytestring(
        @Ptr
        long value);

    public Pointer<Short> get_bytestring() {
        return Pointer.pointerToAddress(this.g_variant_get_bytestring(Pointer.pointerTo(this, GVariant.class).getPeer()), Short.class);
    }

    @Ptr
    protected native long g_variant_get_bytestring_array(
        @Ptr
        long value,
        @Ptr
        long length);

    public Pointer get_bytestring_array(Pointer<Long> length) {
        return Pointer.pointerToAddress(this.g_variant_get_bytestring_array(Pointer.pointerTo(this, GVariant.class).getPeer(), Pointer.getPeer(length)));
    }

    protected native void g_variant_get_child(
        @Ptr
        long value, long index_,
        @Ptr
        long format_string, Object... varargs);

    public void get_child(long index_, Pointer format_string, Object... varargs) {
        this.g_variant_get_child(Pointer.pointerTo(this, GVariant.class).getPeer(), index_, Pointer.getPeer(format_string), varargs);
    }

    @Ptr
    protected native long g_variant_get_child_value(
        @Ptr
        long value, long index_);

    public Pointer get_child_value(long index_) {
        return Pointer.pointerToAddress(this.g_variant_get_child_value(Pointer.pointerTo(this, GVariant.class).getPeer(), index_));
    }

    @Ptr
    protected native long g_variant_get_data(
        @Ptr
        long value);

    public Pointer get_data() {
        return Pointer.pointerToAddress(this.g_variant_get_data(Pointer.pointerTo(this, GVariant.class).getPeer()));
    }

    @Ptr
    protected native long g_variant_get_data_as_bytes(
        @Ptr
        long value);

    public Pointer<GBytes> get_data_as_bytes() {
        return Pointer.pointerToAddress(this.g_variant_get_data_as_bytes(Pointer.pointerTo(this, GVariant.class).getPeer()), GBytes.class);
    }

    protected native double g_variant_get_double(
        @Ptr
        long value);

    public double get_double() {
        return this.g_variant_get_double(Pointer.pointerTo(this, GVariant.class).getPeer());
    }

    @Ptr
    protected native long g_variant_get_fixed_array(
        @Ptr
        long value,
        @Ptr
        long n_elements, long element_size);

    public Pointer get_fixed_array(Pointer<Long> n_elements, long element_size) {
        return Pointer.pointerToAddress(this.g_variant_get_fixed_array(Pointer.pointerTo(this, GVariant.class).getPeer(), Pointer.getPeer(n_elements), element_size));
    }

    protected native int g_variant_get_handle(
        @Ptr
        long value);

    public int get_handle() {
        return this.g_variant_get_handle(Pointer.pointerTo(this, GVariant.class).getPeer());
    }

    protected native short g_variant_get_int16(
        @Ptr
        long value);

    public short get_int16() {
        return this.g_variant_get_int16(Pointer.pointerTo(this, GVariant.class).getPeer());
    }

    protected native int g_variant_get_int32(
        @Ptr
        long value);

    public int get_int32() {
        return this.g_variant_get_int32(Pointer.pointerTo(this, GVariant.class).getPeer());
    }

    protected native long g_variant_get_int64(
        @Ptr
        long value);

    public long get_int64() {
        return this.g_variant_get_int64(Pointer.pointerTo(this, GVariant.class).getPeer());
    }

    @Ptr
    protected native long g_variant_get_maybe(
        @Ptr
        long value);

    public Pointer get_maybe() {
        return Pointer.pointerToAddress(this.g_variant_get_maybe(Pointer.pointerTo(this, GVariant.class).getPeer()));
    }

    @Ptr
    protected native long g_variant_get_normal_form(
        @Ptr
        long value);

    public Pointer get_normal_form() {
        return Pointer.pointerToAddress(this.g_variant_get_normal_form(Pointer.pointerTo(this, GVariant.class).getPeer()));
    }

    @Ptr
    protected native long g_variant_get_objv(
        @Ptr
        long value,
        @Ptr
        long length);

    public Pointer get_objv(Pointer<Long> length) {
        return Pointer.pointerToAddress(this.g_variant_get_objv(Pointer.pointerTo(this, GVariant.class).getPeer(), Pointer.getPeer(length)));
    }

    protected native long g_variant_get_size(
        @Ptr
        long value);

    public long get_size() {
        return this.g_variant_get_size(Pointer.pointerTo(this, GVariant.class).getPeer());
    }

    @Ptr
    protected native long g_variant_get_string(
        @Ptr
        long value,
        @Ptr
        long length);

    public Pointer get_string(Pointer<Long> length) {
        return Pointer.pointerToAddress(this.g_variant_get_string(Pointer.pointerTo(this, GVariant.class).getPeer(), Pointer.getPeer(length)));
    }

    @Ptr
    protected native long g_variant_get_strv(
        @Ptr
        long value,
        @Ptr
        long length);

    public Pointer get_strv(Pointer<Long> length) {
        return Pointer.pointerToAddress(this.g_variant_get_strv(Pointer.pointerTo(this, GVariant.class).getPeer(), Pointer.getPeer(length)));
    }

    @Ptr
    protected native long g_variant_get_type(
        @Ptr
        long value);

    public Pointer get_type() {
        return Pointer.pointerToAddress(this.g_variant_get_type(Pointer.pointerTo(this, GVariant.class).getPeer()));
    }

    @Ptr
    protected native long g_variant_get_type_string(
        @Ptr
        long value);

    public Pointer get_type_string() {
        return Pointer.pointerToAddress(this.g_variant_get_type_string(Pointer.pointerTo(this, GVariant.class).getPeer()));
    }

    protected native int g_variant_get_uint16(
        @Ptr
        long value);

    public int get_uint16() {
        return this.g_variant_get_uint16(Pointer.pointerTo(this, GVariant.class).getPeer());
    }

    protected native long g_variant_get_uint32(
        @Ptr
        long value);

    public long get_uint32() {
        return this.g_variant_get_uint32(Pointer.pointerTo(this, GVariant.class).getPeer());
    }

    protected native long g_variant_get_uint64(
        @Ptr
        long value);

    public long get_uint64() {
        return this.g_variant_get_uint64(Pointer.pointerTo(this, GVariant.class).getPeer());
    }

    protected native void g_variant_get_va(
        @Ptr
        long value,
        @Ptr
        long format_string,
        @Ptr
        long endptr,
        @Ptr
        long app);

    public void get_va(Pointer format_string, Pointer endptr, Pointer app) {
        this.g_variant_get_va(Pointer.pointerTo(this, GVariant.class).getPeer(), Pointer.getPeer(format_string), Pointer.getPeer(endptr), Pointer.getPeer(app));
    }

    @Ptr
    protected native long g_variant_get_variant(
        @Ptr
        long value);

    public Pointer get_variant() {
        return Pointer.pointerToAddress(this.g_variant_get_variant(Pointer.pointerTo(this, GVariant.class).getPeer()));
    }

    protected native boolean g_variant_is_container(
        @Ptr
        long value);

    public boolean is_container() {
        return this.g_variant_is_container(Pointer.pointerTo(this, GVariant.class).getPeer());
    }

    protected native boolean g_variant_is_floating(
        @Ptr
        long value);

    public boolean is_floating() {
        return this.g_variant_is_floating(Pointer.pointerTo(this, GVariant.class).getPeer());
    }

    protected native boolean g_variant_is_normal_form(
        @Ptr
        long value);

    public boolean is_normal_form() {
        return this.g_variant_is_normal_form(Pointer.pointerTo(this, GVariant.class).getPeer());
    }

    protected native boolean g_variant_is_of_type(
        @Ptr
        long value,
        @Ptr
        long type);

    public boolean is_of_type(Pointer type) {
        return this.g_variant_is_of_type(Pointer.pointerTo(this, GVariant.class).getPeer(), Pointer.getPeer(type));
    }

    @Ptr
    protected native long g_variant_iter_new(
        @Ptr
        long value);

    public Pointer iter_new() {
        return Pointer.pointerToAddress(this.g_variant_iter_new(Pointer.pointerTo(this, GVariant.class).getPeer()));
    }

    protected native boolean g_variant_lookup(
        @Ptr
        long dictionary,
        @Ptr
        long key,
        @Ptr
        long format_string, Object... varargs);

    public boolean lookup(Pointer key, Pointer format_string, Object... varargs) {
        return this.g_variant_lookup(Pointer.pointerTo(this, GVariant.class).getPeer(), Pointer.getPeer(key), Pointer.getPeer(format_string), varargs);
    }

    @Ptr
    protected native long g_variant_lookup_value(
        @Ptr
        long dictionary,
        @Ptr
        long key,
        @Ptr
        long expected_type);

    public Pointer lookup_value(Pointer key, Pointer expected_type) {
        return Pointer.pointerToAddress(this.g_variant_lookup_value(Pointer.pointerTo(this, GVariant.class).getPeer(), Pointer.getPeer(key), Pointer.getPeer(expected_type)));
    }

    protected native long g_variant_n_children(
        @Ptr
        long value);

    public long n_children() {
        return this.g_variant_n_children(Pointer.pointerTo(this, GVariant.class).getPeer());
    }

    @Ptr
    protected native long g_variant_print(
        @Ptr
        long value, boolean type_annotate);

    public Pointer print(boolean type_annotate) {
        return Pointer.pointerToAddress(this.g_variant_print(Pointer.pointerTo(this, GVariant.class).getPeer(), type_annotate));
    }

    @Ptr
    protected native long g_variant_print_string(
        @Ptr
        long value,
        @Ptr
        long string, boolean type_annotate);

    public Pointer<GString> print_string(Pointer<GString> string, boolean type_annotate) {
        return Pointer.pointerToAddress(this.g_variant_print_string(Pointer.pointerTo(this, GVariant.class).getPeer(), Pointer.getPeer(string), type_annotate), GString.class);
    }

    @Ptr
    protected native long g_variant_ref(
        @Ptr
        long value);

    public Pointer ref() {
        return Pointer.pointerToAddress(this.g_variant_ref(Pointer.pointerTo(this, GVariant.class).getPeer()));
    }

    @Ptr
    protected native long g_variant_ref_sink(
        @Ptr
        long value);

    public Pointer ref_sink() {
        return Pointer.pointerToAddress(this.g_variant_ref_sink(Pointer.pointerTo(this, GVariant.class).getPeer()));
    }

    protected native void g_variant_store(
        @Ptr
        long value,
        @Ptr
        long data);

    public void store(Pointer data) {
        this.g_variant_store(Pointer.pointerTo(this, GVariant.class).getPeer(), Pointer.getPeer(data));
    }

    @Ptr
    protected native long g_variant_take_ref(
        @Ptr
        long value);

    public Pointer take_ref() {
        return Pointer.pointerToAddress(this.g_variant_take_ref(Pointer.pointerTo(this, GVariant.class).getPeer()));
    }

    protected native void g_variant_unref(
        @Ptr
        long value);

    public void unref() {
        this.g_variant_unref(Pointer.pointerTo(this, GVariant.class).getPeer());
    }

    protected static native boolean g_variant_is_object_path(
        @Ptr
        long string);

    public static boolean is_object_path(Pointer string) {
        return GVariant.g_variant_is_object_path(Pointer.getPeer(string));
    }

    protected static native boolean g_variant_is_signature(
        @Ptr
        long string);

    public static boolean is_signature(Pointer string) {
        return GVariant.g_variant_is_signature(Pointer.getPeer(string));
    }

    @Ptr
    protected static native long g_variant_parse(
        @Ptr
        long type,
        @Ptr
        long text,
        @Ptr
        long limit,
        @Ptr
        long endptr);

    public static Pointer parse(Pointer type, Pointer text, Pointer limit, Pointer endptr) {
        return Pointer.pointerToAddress(GVariant.g_variant_parse(Pointer.getPeer(type), Pointer.getPeer(text), Pointer.getPeer(limit), Pointer.getPeer(endptr)));
    }

    @Ptr
    protected static native long g_variant_parse_error_print_context(
        @Ptr
        long error,
        @Ptr
        long source_str);

    public static Pointer parse_error_print_context(Pointer<GError> error, Pointer source_str) {
        return Pointer.pointerToAddress(GVariant.g_variant_parse_error_print_context(Pointer.getPeer(error), Pointer.getPeer(source_str)));
    }

    public static native long g_variant_parse_error_quark();

    public static native long g_variant_parser_get_error_quark();

    protected native IntValuedEnum<GVariantClass> g_variant_classify(
        @Ptr
        long value);

    public IntValuedEnum<GVariantClass> classify() {
        return this.g_variant_classify(Pointer.pointerTo(this, GVariant.class).getPeer());
    }

}
