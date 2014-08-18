
package generated.glib20.glib;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GVariantType
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GVariantType() {
        super();
    }

    public GVariantType(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_variant_type_new(
        @Ptr
        long type_string);

    public static Pointer _new(Pointer type_string) {
        return Pointer.pointerToAddress(GVariantType.g_variant_type_new(Pointer.getPeer(type_string)));
    }

    @Ptr
    protected static native long g_variant_type_new_array(
        @Ptr
        long element);

    public static Pointer new_array(Pointer element) {
        return Pointer.pointerToAddress(GVariantType.g_variant_type_new_array(Pointer.getPeer(element)));
    }

    @Ptr
    protected static native long g_variant_type_new_dict_entry(
        @Ptr
        long key,
        @Ptr
        long value);

    public static Pointer new_dict_entry(Pointer key, Pointer value) {
        return Pointer.pointerToAddress(GVariantType.g_variant_type_new_dict_entry(Pointer.getPeer(key), Pointer.getPeer(value)));
    }

    @Ptr
    protected static native long g_variant_type_new_maybe(
        @Ptr
        long element);

    public static Pointer new_maybe(Pointer element) {
        return Pointer.pointerToAddress(GVariantType.g_variant_type_new_maybe(Pointer.getPeer(element)));
    }

    @Ptr
    protected static native long g_variant_type_new_tuple(
        @Ptr
        long items, int length);

    public static Pointer new_tuple(Pointer items, int length) {
        return Pointer.pointerToAddress(GVariantType.g_variant_type_new_tuple(Pointer.getPeer(items), length));
    }

    @Ptr
    protected native long g_variant_type_copy(
        @Ptr
        long type);

    public Pointer copy() {
        return Pointer.pointerToAddress(this.g_variant_type_copy(Pointer.pointerTo(this, GVariantType.class).getPeer()));
    }

    @Ptr
    protected native long g_variant_type_dup_string(
        @Ptr
        long type);

    public Pointer dup_string() {
        return Pointer.pointerToAddress(this.g_variant_type_dup_string(Pointer.pointerTo(this, GVariantType.class).getPeer()));
    }

    @Ptr
    protected native long g_variant_type_element(
        @Ptr
        long type);

    public Pointer element() {
        return Pointer.pointerToAddress(this.g_variant_type_element(Pointer.pointerTo(this, GVariantType.class).getPeer()));
    }

    @Ptr
    protected native long g_variant_type_first(
        @Ptr
        long type);

    public Pointer first() {
        return Pointer.pointerToAddress(this.g_variant_type_first(Pointer.pointerTo(this, GVariantType.class).getPeer()));
    }

    protected native void g_variant_type_free(
        @Ptr
        long type);

    public void free() {
        this.g_variant_type_free(Pointer.pointerTo(this, GVariantType.class).getPeer());
    }

    protected native long g_variant_type_get_string_length(
        @Ptr
        long type);

    public long get_string_length() {
        return this.g_variant_type_get_string_length(Pointer.pointerTo(this, GVariantType.class).getPeer());
    }

    protected native boolean g_variant_type_is_array(
        @Ptr
        long type);

    public boolean is_array() {
        return this.g_variant_type_is_array(Pointer.pointerTo(this, GVariantType.class).getPeer());
    }

    protected native boolean g_variant_type_is_basic(
        @Ptr
        long type);

    public boolean is_basic() {
        return this.g_variant_type_is_basic(Pointer.pointerTo(this, GVariantType.class).getPeer());
    }

    protected native boolean g_variant_type_is_container(
        @Ptr
        long type);

    public boolean is_container() {
        return this.g_variant_type_is_container(Pointer.pointerTo(this, GVariantType.class).getPeer());
    }

    protected native boolean g_variant_type_is_definite(
        @Ptr
        long type);

    public boolean is_definite() {
        return this.g_variant_type_is_definite(Pointer.pointerTo(this, GVariantType.class).getPeer());
    }

    protected native boolean g_variant_type_is_dict_entry(
        @Ptr
        long type);

    public boolean is_dict_entry() {
        return this.g_variant_type_is_dict_entry(Pointer.pointerTo(this, GVariantType.class).getPeer());
    }

    protected native boolean g_variant_type_is_maybe(
        @Ptr
        long type);

    public boolean is_maybe() {
        return this.g_variant_type_is_maybe(Pointer.pointerTo(this, GVariantType.class).getPeer());
    }

    protected native boolean g_variant_type_is_subtype_of(
        @Ptr
        long type,
        @Ptr
        long supertype);

    public boolean is_subtype_of(Pointer supertype) {
        return this.g_variant_type_is_subtype_of(Pointer.pointerTo(this, GVariantType.class).getPeer(), Pointer.getPeer(supertype));
    }

    protected native boolean g_variant_type_is_tuple(
        @Ptr
        long type);

    public boolean is_tuple() {
        return this.g_variant_type_is_tuple(Pointer.pointerTo(this, GVariantType.class).getPeer());
    }

    protected native boolean g_variant_type_is_variant(
        @Ptr
        long type);

    public boolean is_variant() {
        return this.g_variant_type_is_variant(Pointer.pointerTo(this, GVariantType.class).getPeer());
    }

    @Ptr
    protected native long g_variant_type_key(
        @Ptr
        long type);

    public Pointer key() {
        return Pointer.pointerToAddress(this.g_variant_type_key(Pointer.pointerTo(this, GVariantType.class).getPeer()));
    }

    protected native long g_variant_type_n_items(
        @Ptr
        long type);

    public long n_items() {
        return this.g_variant_type_n_items(Pointer.pointerTo(this, GVariantType.class).getPeer());
    }

    @Ptr
    protected native long g_variant_type_next(
        @Ptr
        long type);

    public Pointer next() {
        return Pointer.pointerToAddress(this.g_variant_type_next(Pointer.pointerTo(this, GVariantType.class).getPeer()));
    }

    @Ptr
    protected native long g_variant_type_peek_string(
        @Ptr
        long type);

    public Pointer peek_string() {
        return Pointer.pointerToAddress(this.g_variant_type_peek_string(Pointer.pointerTo(this, GVariantType.class).getPeer()));
    }

    @Ptr
    protected native long g_variant_type_value(
        @Ptr
        long type);

    public Pointer value() {
        return Pointer.pointerToAddress(this.g_variant_type_value(Pointer.pointerTo(this, GVariantType.class).getPeer()));
    }

    @Ptr
    protected static native long g_variant_type_checked_(
        @Ptr
        long arg0);

    public static Pointer checked_(Pointer arg0) {
        return Pointer.pointerToAddress(GVariantType.g_variant_type_checked_(Pointer.getPeer(arg0)));
    }

    protected static native boolean g_variant_type_string_is_valid(
        @Ptr
        long type_string);

    public static boolean string_is_valid(Pointer type_string) {
        return GVariantType.g_variant_type_string_is_valid(Pointer.getPeer(type_string));
    }

    protected static native boolean g_variant_type_string_scan(
        @Ptr
        long string,
        @Ptr
        long limit,
        @Ptr
        long endptr);

    public static boolean string_scan(Pointer string, Pointer limit, Pointer endptr) {
        return GVariantType.g_variant_type_string_scan(Pointer.getPeer(string), Pointer.getPeer(limit), Pointer.getPeer(endptr));
    }

}
