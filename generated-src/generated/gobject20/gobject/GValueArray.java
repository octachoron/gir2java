
package generated.gobject20.gobject;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gobject-2.0")
public class GValueArray
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GValueArray() {
        super();
    }

    public GValueArray(Pointer pointer) {
        super(pointer);
    }

    protected native void g_value_array_free(
        @Ptr
        long value_array);

    public void free() {
        this.g_value_array_free(Pointer.pointerTo(this, GValueArray.class).getPeer());
    }

    @Ptr
    protected native long g_value_array_remove(
        @Ptr
        long value_array, long index_);

    public Pointer<GValueArray> remove(long index_) {
        return Pointer.pointerToAddress(this.g_value_array_remove(Pointer.pointerTo(this, GValueArray.class).getPeer(), index_), GValueArray.class);
    }

    @Ptr
    protected native long g_value_array_prepend(
        @Ptr
        long value_array,
        @Ptr
        long value);

    public Pointer<GValueArray> prepend(Pointer<GValue> value) {
        return Pointer.pointerToAddress(this.g_value_array_prepend(Pointer.pointerTo(this, GValueArray.class).getPeer(), Pointer.getPeer(value)), GValueArray.class);
    }

    @Ptr
    protected native long g_value_array_get_nth(
        @Ptr
        long value_array, long index_);

    public Pointer<GValue> get_nth(long index_) {
        return Pointer.pointerToAddress(this.g_value_array_get_nth(Pointer.pointerTo(this, GValueArray.class).getPeer(), index_), GValue.class);
    }

    @Ptr
    protected native long g_value_array_sort(
        @Ptr
        long value_array,
        @Ptr
        long compare_func);

    public Pointer<GValueArray> sort(Pointer compare_func) {
        return Pointer.pointerToAddress(this.g_value_array_sort(Pointer.pointerTo(this, GValueArray.class).getPeer(), Pointer.getPeer(compare_func)), GValueArray.class);
    }

    @Field(0)
    public Pointer<GValue> field_values() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GValueArray field_values(Pointer<GValue> field_values) {
        this.io.setPointerField(this, 0, field_values);
        return this;
    }

    @Ptr
    protected native long g_value_array_copy(
        @Ptr
        long value_array);

    public Pointer<GValueArray> copy() {
        return Pointer.pointerToAddress(this.g_value_array_copy(Pointer.pointerTo(this, GValueArray.class).getPeer()), GValueArray.class);
    }

    @Ptr
    protected native long g_value_array_append(
        @Ptr
        long value_array,
        @Ptr
        long value);

    public Pointer<GValueArray> append(Pointer<GValue> value) {
        return Pointer.pointerToAddress(this.g_value_array_append(Pointer.pointerTo(this, GValueArray.class).getPeer(), Pointer.getPeer(value)), GValueArray.class);
    }

    @Ptr
    protected native long g_value_array_insert(
        @Ptr
        long value_array, long index_,
        @Ptr
        long value);

    public Pointer<GValueArray> insert(long index_, Pointer<GValue> value) {
        return Pointer.pointerToAddress(this.g_value_array_insert(Pointer.pointerTo(this, GValueArray.class).getPeer(), index_, Pointer.getPeer(value)), GValueArray.class);
    }

    @Ptr
    protected native long g_value_array_sort_with_data(
        @Ptr
        long value_array,
        @Ptr
        long compare_func,
        @Ptr
        long user_data);

    public Pointer<GValueArray> sort_with_data(Pointer compare_func, Pointer user_data) {
        return Pointer.pointerToAddress(this.g_value_array_sort_with_data(Pointer.pointerTo(this, GValueArray.class).getPeer(), Pointer.getPeer(compare_func), Pointer.getPeer(user_data)), GValueArray.class);
    }

    @Field(1)
    public long field_n_values() {
        return this.io.getLongField(this, 1);
    }

    @Field(1)
    public GValueArray field_n_values(long field_n_values) {
        this.io.setLongField(this, 1, field_n_values);
        return this;
    }

    @Field(2)
    public long field_n_prealloced() {
        return this.io.getLongField(this, 2);
    }

    @Field(2)
    public GValueArray field_n_prealloced(long field_n_prealloced) {
        this.io.setLongField(this, 2, field_n_prealloced);
        return this;
    }

}
