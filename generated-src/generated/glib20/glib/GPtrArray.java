
package generated.glib20.glib;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GPtrArray
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GPtrArray() {
        super();
    }

    public GPtrArray(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer gptrarray_field_pdata() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GPtrArray gptrarray_field_pdata(Pointer gptrarray_field_pdata) {
        this.io.setPointerField(this, 0, gptrarray_field_pdata);
        return this;
    }

    @Field(1)
    public long gptrarray_field_len() {
        return this.io.getLongField(this, 1);
    }

    @Field(1)
    public GPtrArray gptrarray_field_len(long gptrarray_field_len) {
        this.io.setLongField(this, 1, gptrarray_field_len);
        return this;
    }

    protected static native void g_ptr_array_add(
        @Ptr
        long array,
        @Ptr
        long data);

    public static void add(Pointer array, Pointer data) {
        GPtrArray.g_ptr_array_add(Pointer.getPeer(array), Pointer.getPeer(data));
    }

    protected static native void g_ptr_array_foreach(
        @Ptr
        long array,
        @Ptr
        long func,
        @Ptr
        long user_data);

    public static void foreach(Pointer array, Pointer func, Pointer user_data) {
        GPtrArray.g_ptr_array_foreach(Pointer.getPeer(array), Pointer.getPeer(func), Pointer.getPeer(user_data));
    }

    @Ptr
    protected static native long g_ptr_array_free(
        @Ptr
        long array, boolean free_seg);

    public static Pointer free(Pointer array, boolean free_seg) {
        return Pointer.pointerToAddress(GPtrArray.g_ptr_array_free(Pointer.getPeer(array), free_seg));
    }

    protected static native void g_ptr_array_insert(
        @Ptr
        long array, int index_,
        @Ptr
        long data);

    public static void insert(Pointer array, int index_, Pointer data) {
        GPtrArray.g_ptr_array_insert(Pointer.getPeer(array), index_, Pointer.getPeer(data));
    }

    @Ptr
    protected static native long g_ptr_array_new();

    public static Pointer _new() {
        return Pointer.pointerToAddress(GPtrArray.g_ptr_array_new());
    }

    @Ptr
    protected static native long g_ptr_array_new_full(long reserved_size,
        @Ptr
        long element_free_func);

    public static Pointer new_full(long reserved_size, Pointer element_free_func) {
        return Pointer.pointerToAddress(GPtrArray.g_ptr_array_new_full(reserved_size, Pointer.getPeer(element_free_func)));
    }

    @Ptr
    protected static native long g_ptr_array_new_with_free_func(
        @Ptr
        long element_free_func);

    public static Pointer new_with_free_func(Pointer element_free_func) {
        return Pointer.pointerToAddress(GPtrArray.g_ptr_array_new_with_free_func(Pointer.getPeer(element_free_func)));
    }

    @Ptr
    protected static native long g_ptr_array_ref(
        @Ptr
        long array);

    public static Pointer ref(Pointer array) {
        return Pointer.pointerToAddress(GPtrArray.g_ptr_array_ref(Pointer.getPeer(array)));
    }

    protected static native boolean g_ptr_array_remove(
        @Ptr
        long array,
        @Ptr
        long data);

    public static boolean remove(Pointer array, Pointer data) {
        return GPtrArray.g_ptr_array_remove(Pointer.getPeer(array), Pointer.getPeer(data));
    }

    protected static native boolean g_ptr_array_remove_fast(
        @Ptr
        long array,
        @Ptr
        long data);

    public static boolean remove_fast(Pointer array, Pointer data) {
        return GPtrArray.g_ptr_array_remove_fast(Pointer.getPeer(array), Pointer.getPeer(data));
    }

    @Ptr
    protected static native long g_ptr_array_remove_index(
        @Ptr
        long array, long index_);

    public static Pointer remove_index(Pointer array, long index_) {
        return Pointer.pointerToAddress(GPtrArray.g_ptr_array_remove_index(Pointer.getPeer(array), index_));
    }

    @Ptr
    protected static native long g_ptr_array_remove_index_fast(
        @Ptr
        long array, long index_);

    public static Pointer remove_index_fast(Pointer array, long index_) {
        return Pointer.pointerToAddress(GPtrArray.g_ptr_array_remove_index_fast(Pointer.getPeer(array), index_));
    }

    @Ptr
    protected static native long g_ptr_array_remove_range(
        @Ptr
        long array, long index_, long length);

    public static Pointer remove_range(Pointer array, long index_, long length) {
        return Pointer.pointerToAddress(GPtrArray.g_ptr_array_remove_range(Pointer.getPeer(array), index_, length));
    }

    protected static native void g_ptr_array_set_free_func(
        @Ptr
        long array,
        @Ptr
        long element_free_func);

    public static void set_free_func(Pointer array, Pointer element_free_func) {
        GPtrArray.g_ptr_array_set_free_func(Pointer.getPeer(array), Pointer.getPeer(element_free_func));
    }

    protected static native void g_ptr_array_set_size(
        @Ptr
        long array, int length);

    public static void set_size(Pointer array, int length) {
        GPtrArray.g_ptr_array_set_size(Pointer.getPeer(array), length);
    }

    @Ptr
    protected static native long g_ptr_array_sized_new(long reserved_size);

    public static Pointer sized_new(long reserved_size) {
        return Pointer.pointerToAddress(GPtrArray.g_ptr_array_sized_new(reserved_size));
    }

    protected static native void g_ptr_array_sort(
        @Ptr
        long array,
        @Ptr
        long compare_func);

    public static void sort(Pointer array, Pointer compare_func) {
        GPtrArray.g_ptr_array_sort(Pointer.getPeer(array), Pointer.getPeer(compare_func));
    }

    protected static native void g_ptr_array_sort_with_data(
        @Ptr
        long array,
        @Ptr
        long compare_func,
        @Ptr
        long user_data);

    public static void sort_with_data(Pointer array, Pointer compare_func, Pointer user_data) {
        GPtrArray.g_ptr_array_sort_with_data(Pointer.getPeer(array), Pointer.getPeer(compare_func), Pointer.getPeer(user_data));
    }

    protected static native void g_ptr_array_unref(
        @Ptr
        long array);

    public static void unref(Pointer array) {
        GPtrArray.g_ptr_array_unref(Pointer.getPeer(array));
    }

}
