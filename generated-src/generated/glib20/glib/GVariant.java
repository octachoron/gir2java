
package generated.glib20.glib;

import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GVariant
    extends StructObject
{


    public GVariant() {
        super();
    }

    public GVariant(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long g_variant_byteswap(
        @Ptr
        long value);

    public Pointer byteswap() {
        return Pointer.pointerToAddress(this.g_variant_byteswap(Pointer.pointerTo(this, GVariant.class)));
    }

    protected native boolean g_variant_check_format_string(
        @Ptr
        long value,
        @Ptr
        long format_string, boolean copy_only);

    public boolean check_format_string(Pointer format_string, boolean copy_only) {
        return this.g_variant_check_format_string(Pointer.pointerTo(this, GVariant.class), Pointer.getPeer(format_string), copy_only);
    }

    @Ptr
    protected native long g_variant_dup_bytestring(
        @Ptr
        long value,
        @Ptr
        long length);

    public short dup_bytestring(Pointer<Long> length) {
        return Pointer.pointerToAddress(this.g_variant_dup_bytestring(Pointer.pointerTo(this, GVariant.class), Pointer.getPeer(length)), Short.class);
    }

    @Ptr
    protected native long g_variant_dup_bytestring_array(
        @Ptr
        long value,
        @Ptr
        long length);

    public Pointer dup_bytestring_array(Pointer<Long> length) {
        return Pointer.pointerToAddress(this.g_variant_dup_bytestring_array(Pointer.pointerTo(this, GVariant.class), Pointer.getPeer(length)));
    }

    @Ptr
    protected native long g_variant_dup_objv(
        @Ptr
        long value,
        @Ptr
        long length);

    public Pointer dup_objv(Pointer<Long> length) {
        return Pointer.pointerToAddress(this.g_variant_dup_objv(Pointer.pointerTo(this, GVariant.class), Pointer.getPeer(length)));
    }

    @Ptr
    protected native long g_variant_dup_string(
        @Ptr
        long value,
        @Ptr
        long length);

    public Pointer dup_string(Pointer<Long> length) {
        return Pointer.pointerToAddress(this.g_variant_dup_string(Pointer.pointerTo(this, GVariant.class), Pointer.getPeer(length)));
    }

    @Ptr
    protected native long g_variant_dup_strv(
        @Ptr
        long value,
        @Ptr
        long length);

    public Pointer dup_strv(Pointer<Long> length) {
        return Pointer.pointerToAddress(this.g_variant_dup_strv(Pointer.pointerTo(this, GVariant.class), Pointer.getPeer(length)));
    }

    protected native void g_variant_get(
        @Ptr
        long value,
        @Ptr
        long format_string, Object... varargs);

    public void get(Pointer format_string, Object... varargs) {
        this.g_variant_get(Pointer.pointerTo(this, GVariant.class), Pointer.getPeer(format_string), varargs);
    }

    protected native boolean g_variant_get_boolean(
        @Ptr
        long value);

    public boolean get_boolean() {
        return this.g_variant_get_boolean(Pointer.pointerTo(this, GVariant.class));
    }

    protected native short g_variant_get_byte(
        @Ptr
        long value);

    public short get_byte() {
        return this.g_variant_get_byte(Pointer.pointerTo(this, GVariant.class));
    }

    @Ptr
    protected native long g_variant_get_bytestring(
        @Ptr
        long value);

    public short get_bytestring() {
        return Pointer.pointerToAddress(this.g_variant_get_bytestring(Pointer.pointerTo(this, GVariant.class)), Short.class);
    }

    @Ptr
    protected native long g_variant_get_bytestring_array(
        @Ptr
        long value,
        @Ptr
        long length);

    public Pointer get_bytestring_array(Pointer<Long> length) {
        return Pointer.pointerToAddress(this.g_variant_get_bytestring_array(Pointer.pointerTo(this, GVariant.class), Pointer.getPeer(length)));
    }

    protected native void g_variant_get_child(
        @Ptr
        long value, long index_,
        @Ptr
        long format_string, Object... varargs);

    public void get_child(long index_, Pointer format_string, Object... varargs) {
        this.g_variant_get_child(Pointer.pointerTo(this, GVariant.class), index_, Pointer.getPeer(format_string), varargs);
    }

    @Ptr
    protected native long g_variant_get_child_value(
        @Ptr
        long value, long index_);

    public Pointer get_child_value(long index_) {
        return Pointer.pointerToAddress(this.g_variant_get_child_value(Pointer.pointerTo(this, GVariant.class), index_));
    }

    protected native Pointer g_variant_get_data(
        @Ptr
        long value);

    public Pointer get_data() {
        return this.g_variant_get_data(Pointer.pointerTo(this, GVariant.class));
    }

    @Ptr
    protected native long g_variant_get_data_as_bytes(
        @Ptr
        long value);

    public Pointer<GBytes> get_data_as_bytes() {
        return Pointer.pointerToAddress(this.g_variant_get_data_as_bytes(Pointer.pointerTo(this, GVariant.class)), Pointer.class);
    }

    protected native double g_variant_get_double(
        @Ptr
        long value);

    public double get_double() {
        return this.g_variant_get_double(Pointer.pointerTo(this, GVariant.class));
    }

    @Ptr
    protected native long g_variant_get_fixed_array(
        @Ptr
        long value,
        @Ptr
        long n_elements, long element_size);

    public Pointer get_fixed_array(Pointer<Long> n_elements, long element_size) {
        return Pointer.pointerToAddress(this.g_variant_get_fixed_array(Pointer.pointerTo(this, GVariant.class), Pointer.getPeer(n_elements), element_size));
    }

    protected native int g_variant_get_handle(
        @Ptr
        long value);

    public int get_handle() {
        return this.g_variant_get_handle(Pointer.pointerTo(this, GVariant.class));
    }

    protected native short g_variant_get_int16(
        @Ptr
        long value);

    public short get_int16() {
        return this.g_variant_get_int16(Pointer.pointerTo(this, GVariant.class));
    }

    protected native int g_variant_get_int32(
        @Ptr
        long value);

    public int get_int32() {
        return this.g_variant_get_int32(Pointer.pointerTo(this, GVariant.class));
    }

    protected native long g_variant_get_int64(
        @Ptr
        long value);

    public long get_int64() {
        return this.g_variant_get_int64(Pointer.pointerTo(this, GVariant.class));
    }

    @Ptr
    protected native long g_variant_get_maybe(
        @Ptr
        long value);

    public Pointer get_maybe() {
        return Pointer.pointerToAddress(this.g_variant_get_maybe(Pointer.pointerTo(this, GVariant.class)));
    }

    @Ptr
    protected native long g_variant_get_normal_form(
        @Ptr
        long value);

    public Pointer get_normal_form() {
        return Pointer.pointerToAddress(this.g_variant_get_normal_form(Pointer.pointerTo(this, GVariant.class)));
    }

    @Ptr
    protected native long g_variant_get_objv(
        @Ptr
        long value,
        @Ptr
        long length);

    public Pointer get_objv(Pointer<Long> length) {
        return Pointer.pointerToAddress(this.g_variant_get_objv(Pointer.pointerTo(this, GVariant.class), Pointer.getPeer(length)));
    }

    protected native long g_variant_get_size(
        @Ptr
        long value);

    public long get_size() {
        return this.g_variant_get_size(Pointer.pointerTo(this, GVariant.class));
    }

    @Ptr
    protected native long g_variant_get_string(
        @Ptr
        long value,
        @Ptr
        long length);

    public Pointer get_string(Pointer<Long> length) {
        return Pointer.pointerToAddress(this.g_variant_get_string(Pointer.pointerTo(this, GVariant.class), Pointer.getPeer(length)));
    }

    @Ptr
    protected native long g_variant_get_strv(
        @Ptr
        long value,
        @Ptr
        long length);

    public Pointer get_strv(Pointer<Long> length) {
        return Pointer.pointerToAddress(this.g_variant_get_strv(Pointer.pointerTo(this, GVariant.class), Pointer.getPeer(length)));
    }

    @Ptr
    protected native long g_variant_get_type(
        @Ptr
        long value);

    public Pointer get_type() {
        return Pointer.pointerToAddress(this.g_variant_get_type(Pointer.pointerTo(this, GVariant.class)));
    }

    @Ptr
    protected native long g_variant_get_type_string(
        @Ptr
        long value);

    public Pointer get_type_string() {
        return Pointer.pointerToAddress(this.g_variant_get_type_string(Pointer.pointerTo(this, GVariant.class)));
    }

    protected native int g_variant_get_uint16(
        @Ptr
        long value);

    public int get_uint16() {
        return this.g_variant_get_uint16(Pointer.pointerTo(this, GVariant.class));
    }

    protected native long g_variant_get_uint32(
        @Ptr
        long value);

    public long get_uint32() {
        return this.g_variant_get_uint32(Pointer.pointerTo(this, GVariant.class));
    }

    protected native long g_variant_get_uint64(
        @Ptr
        long value);

    public long get_uint64() {
        return this.g_variant_get_uint64(Pointer.pointerTo(this, GVariant.class));
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
        this.g_variant_get_va(Pointer.pointerTo(this, GVariant.class), Pointer.getPeer(format_string), Pointer.getPeer(endptr), Pointer.getPeer(app));
    }

    @Ptr
    protected native long g_variant_get_variant(
        @Ptr
        long value);

    public Pointer get_variant() {
        return Pointer.pointerToAddress(this.g_variant_get_variant(Pointer.pointerTo(this, GVariant.class)));
    }

    protected native boolean g_variant_is_container(
        @Ptr
        long value);

    public boolean is_container() {
        return this.g_variant_is_container(Pointer.pointerTo(this, GVariant.class));
    }

    protected native boolean g_variant_is_floating(
        @Ptr
        long value);

    public boolean is_floating() {
        return this.g_variant_is_floating(Pointer.pointerTo(this, GVariant.class));
    }

    protected native boolean g_variant_is_normal_form(
        @Ptr
        long value);

    public boolean is_normal_form() {
        return this.g_variant_is_normal_form(Pointer.pointerTo(this, GVariant.class));
    }

    protected native boolean g_variant_is_of_type(
        @Ptr
        long value,
        @Ptr
        long type);

    public boolean is_of_type(Pointer type) {
        return this.g_variant_is_of_type(Pointer.pointerTo(this, GVariant.class), Pointer.getPeer(type));
    }

    @Ptr
    protected native long g_variant_iter_new(
        @Ptr
        long value);

    public Pointer iter_new() {
        return Pointer.pointerToAddress(this.g_variant_iter_new(Pointer.pointerTo(this, GVariant.class)));
    }

    protected native boolean g_variant_lookup(
        @Ptr
        long dictionary,
        @Ptr
        long key,
        @Ptr
        long format_string, Object... varargs);

    public boolean lookup(Pointer key, Pointer format_string, Object... varargs) {
        return this.g_variant_lookup(Pointer.pointerTo(this, GVariant.class), Pointer.getPeer(key), Pointer.getPeer(format_string), varargs);
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
        return Pointer.pointerToAddress(this.g_variant_lookup_value(Pointer.pointerTo(this, GVariant.class), Pointer.getPeer(key), Pointer.getPeer(expected_type)));
    }

    protected native long g_variant_n_children(
        @Ptr
        long value);

    public long n_children() {
        return this.g_variant_n_children(Pointer.pointerTo(this, GVariant.class));
    }

    @Ptr
    protected native long g_variant_print(
        @Ptr
        long value, boolean type_annotate);

    public Pointer print(boolean type_annotate) {
        return Pointer.pointerToAddress(this.g_variant_print(Pointer.pointerTo(this, GVariant.class), type_annotate));
    }

    @Ptr
    protected native long g_variant_print_string(
        @Ptr
        long value,
        @Ptr
        long string, boolean type_annotate);

    public Pointer<GString> print_string(Pointer<GString> string, boolean type_annotate) {
        return Pointer.pointerToAddress(this.g_variant_print_string(Pointer.pointerTo(this, GVariant.class), Pointer.getPeer(string), type_annotate), Pointer.class);
    }

    @Ptr
    protected native long g_variant_ref(
        @Ptr
        long value);

    public Pointer ref() {
        return Pointer.pointerToAddress(this.g_variant_ref(Pointer.pointerTo(this, GVariant.class)));
    }

    @Ptr
    protected native long g_variant_ref_sink(
        @Ptr
        long value);

    public Pointer ref_sink() {
        return Pointer.pointerToAddress(this.g_variant_ref_sink(Pointer.pointerTo(this, GVariant.class)));
    }

    protected native void g_variant_store(
        @Ptr
        long value, Pointer data);

    public void store(Pointer data) {
        this.g_variant_store(Pointer.pointerTo(this, GVariant.class), data);
    }

    @Ptr
    protected native long g_variant_take_ref(
        @Ptr
        long value);

    public Pointer take_ref() {
        return Pointer.pointerToAddress(this.g_variant_take_ref(Pointer.pointerTo(this, GVariant.class)));
    }

    protected native void g_variant_unref(
        @Ptr
        long value);

    public void unref() {
        this.g_variant_unref(Pointer.pointerTo(this, GVariant.class));
    }

    protected native boolean g_variant_is_object_path(
        @Ptr
        long string);

    public boolean is_object_path(Pointer string) {
        return this.g_variant_is_object_path(Pointer.getPeer(string));
    }

    protected native boolean g_variant_is_signature(
        @Ptr
        long string);

    public boolean is_signature(Pointer string) {
        return this.g_variant_is_signature(Pointer.getPeer(string));
    }

    @Ptr
    protected native long g_variant_parse(
        @Ptr
        long type,
        @Ptr
        long text,
        @Ptr
        long limit,
        @Ptr
        long endptr);

    public Pointer parse(Pointer type, Pointer text, Pointer limit, Pointer endptr) {
        return Pointer.pointerToAddress(this.g_variant_parse(Pointer.getPeer(type), Pointer.getPeer(text), Pointer.getPeer(limit), Pointer.getPeer(endptr)));
    }

    @Ptr
    protected native long g_variant_parse_error_print_context(
        @Ptr
        long error,
        @Ptr
        long source_str);

    public Pointer parse_error_print_context(Pointer<GError> error, Pointer source_str) {
        return Pointer.pointerToAddress(this.g_variant_parse_error_print_context(Pointer.getPeer(error), Pointer.getPeer(source_str)));
    }

    public native Object g_variant_parse_error_quark();

    public native Object g_variant_parser_get_error_quark();

    public native int g_variant_compare(GVariant one, GVariant two);

    public native boolean g_variant_equal(GVariant one, GVariant two);

    protected native IntValuedEnum<GVariantClass> g_variant_classify(
        @Ptr
        long value);

    public IntValuedEnum<GVariantClass> classify() {
        return this.g_variant_classify(Pointer.pointerTo(this, GVariant.class));
    }

    public native long g_variant_hash(GVariant value);

}
