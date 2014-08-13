
package generated.glib20.glib;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GArray
    extends StructObject
{


    public GArray() {
        super();
    }

    public GArray(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer field_data() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GArray field_data(Pointer field_data) {
        this.io.setPointerField(this, 0, field_data);
        return this;
    }

    @Field(1)
    public long field_len() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GArray field_len(long field_len) {
        this.io.setNativeObjectField(this, 1, field_len);
        return this;
    }

    @Ptr
    protected native long g_array_append_vals(
        @Ptr
        long array, Pointer data, long len);

    public Pointer append_vals(Pointer array, Pointer data, long len) {
        return Pointer.pointerToAddress(this.g_array_append_vals(Pointer.getPeer(array), data, len));
    }

    @Ptr
    protected native long g_array_free(
        @Ptr
        long array, boolean free_segment);

    public Pointer free(Pointer array, boolean free_segment) {
        return Pointer.pointerToAddress(this.g_array_free(Pointer.getPeer(array), free_segment));
    }

    protected native long g_array_get_element_size(
        @Ptr
        long array);

    public long get_element_size(Pointer array) {
        return this.g_array_get_element_size(Pointer.getPeer(array));
    }

    @Ptr
    protected native long g_array_insert_vals(
        @Ptr
        long array, long index_, Pointer data, long len);

    public Pointer insert_vals(Pointer array, long index_, Pointer data, long len) {
        return Pointer.pointerToAddress(this.g_array_insert_vals(Pointer.getPeer(array), index_, data, len));
    }

    @Ptr
    protected native long g_array_new(boolean zero_terminated, boolean clear_, long element_size);

    public Pointer _new(boolean zero_terminated, boolean clear_, long element_size) {
        return Pointer.pointerToAddress(this.g_array_new(zero_terminated, clear_, element_size));
    }

    @Ptr
    protected native long g_array_prepend_vals(
        @Ptr
        long array, Pointer data, long len);

    public Pointer prepend_vals(Pointer array, Pointer data, long len) {
        return Pointer.pointerToAddress(this.g_array_prepend_vals(Pointer.getPeer(array), data, len));
    }

    @Ptr
    protected native long g_array_ref(
        @Ptr
        long array);

    public Pointer ref(Pointer array) {
        return Pointer.pointerToAddress(this.g_array_ref(Pointer.getPeer(array)));
    }

    @Ptr
    protected native long g_array_remove_index(
        @Ptr
        long array, long index_);

    public Pointer remove_index(Pointer array, long index_) {
        return Pointer.pointerToAddress(this.g_array_remove_index(Pointer.getPeer(array), index_));
    }

    @Ptr
    protected native long g_array_remove_index_fast(
        @Ptr
        long array, long index_);

    public Pointer remove_index_fast(Pointer array, long index_) {
        return Pointer.pointerToAddress(this.g_array_remove_index_fast(Pointer.getPeer(array), index_));
    }

    @Ptr
    protected native long g_array_remove_range(
        @Ptr
        long array, long index_, long length);

    public Pointer remove_range(Pointer array, long index_, long length) {
        return Pointer.pointerToAddress(this.g_array_remove_range(Pointer.getPeer(array), index_, length));
    }

    @Ptr
    protected native long g_array_set_size(
        @Ptr
        long array, long length);

    public Pointer set_size(Pointer array, long length) {
        return Pointer.pointerToAddress(this.g_array_set_size(Pointer.getPeer(array), length));
    }

    @Ptr
    protected native long g_array_sized_new(boolean zero_terminated, boolean clear_, long element_size, long reserved_size);

    public Pointer sized_new(boolean zero_terminated, boolean clear_, long element_size, long reserved_size) {
        return Pointer.pointerToAddress(this.g_array_sized_new(zero_terminated, clear_, element_size, reserved_size));
    }

    protected native void g_array_unref(
        @Ptr
        long array);

    public void unref(Pointer array) {
        this.g_array_unref(Pointer.getPeer(array));
    }

    protected native void g_array_sort(
        @Ptr
        long array, Object compare_func);

    public void sort(Pointer array, Object compare_func) {
        this.g_array_sort(Pointer.getPeer(array), compare_func);
    }

    protected native void g_array_set_clear_func(
        @Ptr
        long array, Object clear_func);

    public void set_clear_func(Pointer array, Object clear_func) {
        this.g_array_set_clear_func(Pointer.getPeer(array), clear_func);
    }

    protected native void g_array_sort_with_data(
        @Ptr
        long array, Object compare_func, Pointer user_data);

    public void sort_with_data(Pointer array, Object compare_func, Pointer user_data) {
        this.g_array_sort_with_data(Pointer.getPeer(array), compare_func, user_data);
    }

}
