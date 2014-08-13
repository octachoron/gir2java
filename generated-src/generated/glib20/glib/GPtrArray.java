
package generated.glib20.glib;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GPtrArray
    extends StructObject
{


    public GPtrArray() {
        super();
    }

    public GPtrArray(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer field_pdata() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GPtrArray field_pdata(Pointer field_pdata) {
        this.io.setNativeObjectField(this, 0, field_pdata);
        return this;
    }

    @Field(1)
    public long field_len() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GPtrArray field_len(long field_len) {
        this.io.setNativeObjectField(this, 1, field_len);
        return this;
    }

    protected native void g_ptr_array_add(
        @Ptr
        long array, Pointer data);

    public void add(Pointer array, Pointer data) {
        this.g_ptr_array_add(Pointer.getPeer(array), data);
    }

    protected native void g_ptr_array_foreach(
        @Ptr
        long array, Object func, Pointer user_data);

    public void foreach(Pointer array, Object func, Pointer user_data) {
        this.g_ptr_array_foreach(Pointer.getPeer(array), func, user_data);
    }

    protected native Pointer g_ptr_array_free(
        @Ptr
        long array, boolean free_seg);

    public Pointer free(Pointer array, boolean free_seg) {
        return this.g_ptr_array_free(Pointer.getPeer(array), free_seg);
    }

    protected native void g_ptr_array_insert(
        @Ptr
        long array, int index_, Pointer data);

    public void insert(Pointer array, int index_, Pointer data) {
        this.g_ptr_array_insert(Pointer.getPeer(array), index_, data);
    }

    @Ptr
    protected native long g_ptr_array_new();

    public Pointer _new() {
        return Pointer.pointerToAddress(this.g_ptr_array_new());
    }

    @Ptr
    protected native long g_ptr_array_new_full(long reserved_size, Object element_free_func);

    public Pointer new_full(long reserved_size, Object element_free_func) {
        return Pointer.pointerToAddress(this.g_ptr_array_new_full(reserved_size, element_free_func));
    }

    @Ptr
    protected native long g_ptr_array_new_with_free_func(Object element_free_func);

    public Pointer new_with_free_func(Object element_free_func) {
        return Pointer.pointerToAddress(this.g_ptr_array_new_with_free_func(element_free_func));
    }

    @Ptr
    protected native long g_ptr_array_ref(
        @Ptr
        long array);

    public Pointer ref(Pointer array) {
        return Pointer.pointerToAddress(this.g_ptr_array_ref(Pointer.getPeer(array)));
    }

    protected native boolean g_ptr_array_remove(
        @Ptr
        long array, Pointer data);

    public boolean remove(Pointer array, Pointer data) {
        return this.g_ptr_array_remove(Pointer.getPeer(array), data);
    }

    protected native boolean g_ptr_array_remove_fast(
        @Ptr
        long array, Pointer data);

    public boolean remove_fast(Pointer array, Pointer data) {
        return this.g_ptr_array_remove_fast(Pointer.getPeer(array), data);
    }

    protected native Pointer g_ptr_array_remove_index(
        @Ptr
        long array, long index_);

    public Pointer remove_index(Pointer array, long index_) {
        return this.g_ptr_array_remove_index(Pointer.getPeer(array), index_);
    }

    protected native Pointer g_ptr_array_remove_index_fast(
        @Ptr
        long array, long index_);

    public Pointer remove_index_fast(Pointer array, long index_) {
        return this.g_ptr_array_remove_index_fast(Pointer.getPeer(array), index_);
    }

    @Ptr
    protected native long g_ptr_array_remove_range(
        @Ptr
        long array, long index_, long length);

    public Pointer remove_range(Pointer array, long index_, long length) {
        return Pointer.pointerToAddress(this.g_ptr_array_remove_range(Pointer.getPeer(array), index_, length));
    }

    protected native void g_ptr_array_set_free_func(
        @Ptr
        long array, Object element_free_func);

    public void set_free_func(Pointer array, Object element_free_func) {
        this.g_ptr_array_set_free_func(Pointer.getPeer(array), element_free_func);
    }

    protected native void g_ptr_array_set_size(
        @Ptr
        long array, int length);

    public void set_size(Pointer array, int length) {
        this.g_ptr_array_set_size(Pointer.getPeer(array), length);
    }

    @Ptr
    protected native long g_ptr_array_sized_new(long reserved_size);

    public Pointer sized_new(long reserved_size) {
        return Pointer.pointerToAddress(this.g_ptr_array_sized_new(reserved_size));
    }

    protected native void g_ptr_array_sort(
        @Ptr
        long array, Object compare_func);

    public void sort(Pointer array, Object compare_func) {
        this.g_ptr_array_sort(Pointer.getPeer(array), compare_func);
    }

    protected native void g_ptr_array_sort_with_data(
        @Ptr
        long array, Object compare_func, Pointer user_data);

    public void sort_with_data(Pointer array, Object compare_func, Pointer user_data) {
        this.g_ptr_array_sort_with_data(Pointer.getPeer(array), compare_func, user_data);
    }

    protected native void g_ptr_array_unref(
        @Ptr
        long array);

    public void unref(Pointer array) {
        this.g_ptr_array_unref(Pointer.getPeer(array));
    }

}
