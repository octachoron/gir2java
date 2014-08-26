
package generated.glib20.glib;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GArray
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GArray() {
        super();
    }

    public GArray(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer garray_field_data() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GArray garray_field_data(Pointer garray_field_data) {
        this.io.setPointerField(this, 0, garray_field_data);
        return this;
    }

    @Field(1)
    public long garray_field_len() {
        return this.io.getLongField(this, 1);
    }

    @Field(1)
    public GArray garray_field_len(long garray_field_len) {
        this.io.setLongField(this, 1, garray_field_len);
        return this;
    }

    @Ptr
    protected static native long g_array_append_vals(
        @Ptr
        long array,
        @Ptr
        long data, long len);

    public static Pointer append_vals(Pointer array, Pointer data, long len) {
        return Pointer.pointerToAddress(GArray.g_array_append_vals(Pointer.getPeer(array), Pointer.getPeer(data), len));
    }

    @Ptr
    protected static native long g_array_free(
        @Ptr
        long array, boolean free_segment);

    public static Pointer free(Pointer array, boolean free_segment) {
        return Pointer.pointerToAddress(GArray.g_array_free(Pointer.getPeer(array), free_segment));
    }

    protected static native long g_array_get_element_size(
        @Ptr
        long array);

    public static long get_element_size(Pointer array) {
        return GArray.g_array_get_element_size(Pointer.getPeer(array));
    }

    @Ptr
    protected static native long g_array_insert_vals(
        @Ptr
        long array, long index_,
        @Ptr
        long data, long len);

    public static Pointer insert_vals(Pointer array, long index_, Pointer data, long len) {
        return Pointer.pointerToAddress(GArray.g_array_insert_vals(Pointer.getPeer(array), index_, Pointer.getPeer(data), len));
    }

    @Ptr
    protected static native long g_array_new(boolean zero_terminated, boolean clear_, long element_size);

    public static Pointer _new(boolean zero_terminated, boolean clear_, long element_size) {
        return Pointer.pointerToAddress(GArray.g_array_new(zero_terminated, clear_, element_size));
    }

    @Ptr
    protected static native long g_array_prepend_vals(
        @Ptr
        long array,
        @Ptr
        long data, long len);

    public static Pointer prepend_vals(Pointer array, Pointer data, long len) {
        return Pointer.pointerToAddress(GArray.g_array_prepend_vals(Pointer.getPeer(array), Pointer.getPeer(data), len));
    }

    @Ptr
    protected static native long g_array_ref(
        @Ptr
        long array);

    public static Pointer ref(Pointer array) {
        return Pointer.pointerToAddress(GArray.g_array_ref(Pointer.getPeer(array)));
    }

    @Ptr
    protected static native long g_array_remove_index(
        @Ptr
        long array, long index_);

    public static Pointer remove_index(Pointer array, long index_) {
        return Pointer.pointerToAddress(GArray.g_array_remove_index(Pointer.getPeer(array), index_));
    }

    @Ptr
    protected static native long g_array_remove_index_fast(
        @Ptr
        long array, long index_);

    public static Pointer remove_index_fast(Pointer array, long index_) {
        return Pointer.pointerToAddress(GArray.g_array_remove_index_fast(Pointer.getPeer(array), index_));
    }

    @Ptr
    protected static native long g_array_remove_range(
        @Ptr
        long array, long index_, long length);

    public static Pointer remove_range(Pointer array, long index_, long length) {
        return Pointer.pointerToAddress(GArray.g_array_remove_range(Pointer.getPeer(array), index_, length));
    }

    @Ptr
    protected static native long g_array_set_size(
        @Ptr
        long array, long length);

    public static Pointer set_size(Pointer array, long length) {
        return Pointer.pointerToAddress(GArray.g_array_set_size(Pointer.getPeer(array), length));
    }

    @Ptr
    protected static native long g_array_sized_new(boolean zero_terminated, boolean clear_, long element_size, long reserved_size);

    public static Pointer sized_new(boolean zero_terminated, boolean clear_, long element_size, long reserved_size) {
        return Pointer.pointerToAddress(GArray.g_array_sized_new(zero_terminated, clear_, element_size, reserved_size));
    }

    protected static native void g_array_unref(
        @Ptr
        long array);

    public static void unref(Pointer array) {
        GArray.g_array_unref(Pointer.getPeer(array));
    }

    protected static native void g_array_sort(
        @Ptr
        long array,
        @Ptr
        long compare_func);

    public static void sort(Pointer array, Pointer compare_func) {
        GArray.g_array_sort(Pointer.getPeer(array), Pointer.getPeer(compare_func));
    }

    protected static native void g_array_set_clear_func(
        @Ptr
        long array,
        @Ptr
        long clear_func);

    public static void set_clear_func(Pointer array, Pointer clear_func) {
        GArray.g_array_set_clear_func(Pointer.getPeer(array), Pointer.getPeer(clear_func));
    }

    protected static native void g_array_sort_with_data(
        @Ptr
        long array,
        @Ptr
        long compare_func,
        @Ptr
        long user_data);

    public static void sort_with_data(Pointer array, Pointer compare_func, Pointer user_data) {
        GArray.g_array_sort_with_data(Pointer.getPeer(array), Pointer.getPeer(compare_func), Pointer.getPeer(user_data));
    }

}
