
package generated.glib20.glib;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GByteArray
    extends StructObject
{


    public GByteArray() {
        super();
    }

    public GByteArray(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer<Short> field_data() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GByteArray field_data(Pointer<Short> field_data) {
        this.io.setPointerField(this, 0, field_data);
        return this;
    }

    @Field(1)
    public long field_len() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GByteArray field_len(long field_len) {
        this.io.setNativeObjectField(this, 1, field_len);
        return this;
    }

    @Ptr
    protected native long g_byte_array_append(
        @Ptr
        long array,
        @Ptr
        long data, long len);

    public short append(short array, Pointer<Short> data, long len) {
        return Pointer.pointerToAddress(this.g_byte_array_append(Pointer.getPeer(array), Pointer.getPeer(data), len), Short.class);
    }

    @Ptr
    protected native long g_byte_array_free(
        @Ptr
        long array, boolean free_segment);

    public Pointer<Short> free(short array, boolean free_segment) {
        return Pointer.pointerToAddress(this.g_byte_array_free(Pointer.getPeer(array), free_segment), Pointer.class);
    }

    @Ptr
    protected native long g_byte_array_free_to_bytes(
        @Ptr
        long array);

    public Pointer free_to_bytes(short array) {
        return Pointer.pointerToAddress(this.g_byte_array_free_to_bytes(Pointer.getPeer(array)));
    }

    @Ptr
    protected native long g_byte_array_new();

    public short _new() {
        return Pointer.pointerToAddress(this.g_byte_array_new(), Short.class);
    }

    @Ptr
    protected native long g_byte_array_new_take(
        @Ptr
        long data, long len);

    public short new_take(short data, long len) {
        return Pointer.pointerToAddress(this.g_byte_array_new_take(Pointer.getPeer(data), len), Short.class);
    }

    @Ptr
    protected native long g_byte_array_prepend(
        @Ptr
        long array,
        @Ptr
        long data, long len);

    public short prepend(short array, Pointer<Short> data, long len) {
        return Pointer.pointerToAddress(this.g_byte_array_prepend(Pointer.getPeer(array), Pointer.getPeer(data), len), Short.class);
    }

    @Ptr
    protected native long g_byte_array_ref(
        @Ptr
        long array);

    public short ref(short array) {
        return Pointer.pointerToAddress(this.g_byte_array_ref(Pointer.getPeer(array)), Short.class);
    }

    @Ptr
    protected native long g_byte_array_remove_index(
        @Ptr
        long array, long index_);

    public short remove_index(short array, long index_) {
        return Pointer.pointerToAddress(this.g_byte_array_remove_index(Pointer.getPeer(array), index_), Short.class);
    }

    @Ptr
    protected native long g_byte_array_remove_index_fast(
        @Ptr
        long array, long index_);

    public short remove_index_fast(short array, long index_) {
        return Pointer.pointerToAddress(this.g_byte_array_remove_index_fast(Pointer.getPeer(array), index_), Short.class);
    }

    @Ptr
    protected native long g_byte_array_remove_range(
        @Ptr
        long array, long index_, long length);

    public short remove_range(short array, long index_, long length) {
        return Pointer.pointerToAddress(this.g_byte_array_remove_range(Pointer.getPeer(array), index_, length), Short.class);
    }

    @Ptr
    protected native long g_byte_array_set_size(
        @Ptr
        long array, long length);

    public short set_size(short array, long length) {
        return Pointer.pointerToAddress(this.g_byte_array_set_size(Pointer.getPeer(array), length), Short.class);
    }

    @Ptr
    protected native long g_byte_array_sized_new(long reserved_size);

    public short sized_new(long reserved_size) {
        return Pointer.pointerToAddress(this.g_byte_array_sized_new(reserved_size), Short.class);
    }

    protected native void g_byte_array_unref(
        @Ptr
        long array);

    public void unref(short array) {
        this.g_byte_array_unref(Pointer.getPeer(array));
    }

    protected native void g_byte_array_sort(
        @Ptr
        long array, Object compare_func);

    public void sort(short array, Object compare_func) {
        this.g_byte_array_sort(Pointer.getPeer(array), compare_func);
    }

    protected native void g_byte_array_sort_with_data(
        @Ptr
        long array, Object compare_func, Pointer user_data);

    public void sort_with_data(short array, Object compare_func, Pointer user_data) {
        this.g_byte_array_sort_with_data(Pointer.getPeer(array), compare_func, user_data);
    }

}
