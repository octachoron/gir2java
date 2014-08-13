
package generated.gobject20.gobject;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gobject-2.0")
public class GValueArray
    extends StructObject
{


    public GValueArray() {
        super();
    }

    public GValueArray(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public long field_n_values() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GValueArray field_n_values(long field_n_values) {
        this.io.setNativeObjectField(this, 0, field_n_values);
        return this;
    }

    @Field(1)
    public Pointer<GValue> field_values() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GValueArray field_values(Pointer<GValue> field_values) {
        this.io.setPointerField(this, 1, field_values);
        return this;
    }

    @Field(2)
    public long field_n_prealloced() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GValueArray field_n_prealloced(long field_n_prealloced) {
        this.io.setNativeObjectField(this, 2, field_n_prealloced);
        return this;
    }

    @Ptr
    protected native long g_value_array_append(
        @Ptr
        long value_array,
        @Ptr
        long value);

    public Pointer append(Pointer<GValue> value) {
        return Pointer.pointerToAddress(this.g_value_array_append(Pointer.pointerTo(this, GValueArray.class), Pointer.getPeer(value)));
    }

    @Ptr
    protected native long g_value_array_copy(
        @Ptr
        long value_array);

    public Pointer copy() {
        return Pointer.pointerToAddress(this.g_value_array_copy(Pointer.pointerTo(this, GValueArray.class)));
    }

    protected native void g_value_array_free(
        @Ptr
        long value_array);

    public void free() {
        this.g_value_array_free(Pointer.pointerTo(this, GValueArray.class));
    }

    @Ptr
    protected native long g_value_array_get_nth(
        @Ptr
        long value_array, long index_);

    public Pointer<GValue> get_nth(long index_) {
        return Pointer.pointerToAddress(this.g_value_array_get_nth(Pointer.pointerTo(this, GValueArray.class), index_), Pointer.class);
    }

    @Ptr
    protected native long g_value_array_insert(
        @Ptr
        long value_array, long index_,
        @Ptr
        long value);

    public Pointer insert(long index_, Pointer<GValue> value) {
        return Pointer.pointerToAddress(this.g_value_array_insert(Pointer.pointerTo(this, GValueArray.class), index_, Pointer.getPeer(value)));
    }

    @Ptr
    protected native long g_value_array_prepend(
        @Ptr
        long value_array,
        @Ptr
        long value);

    public Pointer prepend(Pointer<GValue> value) {
        return Pointer.pointerToAddress(this.g_value_array_prepend(Pointer.pointerTo(this, GValueArray.class), Pointer.getPeer(value)));
    }

    @Ptr
    protected native long g_value_array_remove(
        @Ptr
        long value_array, long index_);

    public Pointer remove(long index_) {
        return Pointer.pointerToAddress(this.g_value_array_remove(Pointer.pointerTo(this, GValueArray.class), index_));
    }

    @Ptr
    protected native long g_value_array_sort(
        @Ptr
        long value_array, Object compare_func);

    public Pointer sort(Object compare_func) {
        return Pointer.pointerToAddress(this.g_value_array_sort(Pointer.pointerTo(this, GValueArray.class), compare_func));
    }

    @Ptr
    protected native long g_value_array_sort_with_data(
        @Ptr
        long value_array, Object compare_func, Pointer user_data);

    public Pointer sort_with_data(Object compare_func, Pointer user_data) {
        return Pointer.pointerToAddress(this.g_value_array_sort_with_data(Pointer.pointerTo(this, GValueArray.class), compare_func, user_data));
    }

}
