
package generated.glib20.glib;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GByteArray
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GByteArray() {
        super();
    }

    public GByteArray(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer<Short> gbytearray_field_data() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GByteArray gbytearray_field_data(Pointer<Short> gbytearray_field_data) {
        this.io.setPointerField(this, 0, gbytearray_field_data);
        return this;
    }

    @Field(1)
    public long gbytearray_field_len() {
        return this.io.getLongField(this, 1);
    }

    @Field(1)
    public GByteArray gbytearray_field_len(long gbytearray_field_len) {
        this.io.setLongField(this, 1, gbytearray_field_len);
        return this;
    }

    @Ptr
    protected static native long g_byte_array_append(
        @Ptr
        long array,
        @Ptr
        long data, long len);

    public static Pointer<Short> append(Pointer<Short> array, Pointer<Short> data, long len) {
        return Pointer.pointerToAddress(GByteArray.g_byte_array_append(Pointer.getPeer(array), Pointer.getPeer(data), len), Short.class);
    }

    @Ptr
    protected static native long g_byte_array_free(
        @Ptr
        long array, boolean free_segment);

    public static Pointer<Short> free(Pointer<Short> array, boolean free_segment) {
        return Pointer.pointerToAddress(GByteArray.g_byte_array_free(Pointer.getPeer(array), free_segment), Short.class);
    }

    @Ptr
    protected static native long g_byte_array_free_to_bytes(
        @Ptr
        long array);

    public static Pointer free_to_bytes(Pointer<Short> array) {
        return Pointer.pointerToAddress(GByteArray.g_byte_array_free_to_bytes(Pointer.getPeer(array)));
    }

    @Ptr
    protected static native long g_byte_array_new();

    public static Pointer<Short> _new() {
        return Pointer.pointerToAddress(GByteArray.g_byte_array_new(), Short.class);
    }

    @Ptr
    protected static native long g_byte_array_new_take(
        @Ptr
        long data, long len);

    public static Pointer<Short> new_take(Pointer<Short> data, long len) {
        return Pointer.pointerToAddress(GByteArray.g_byte_array_new_take(Pointer.getPeer(data), len), Short.class);
    }

    @Ptr
    protected static native long g_byte_array_prepend(
        @Ptr
        long array,
        @Ptr
        long data, long len);

    public static Pointer<Short> prepend(Pointer<Short> array, Pointer<Short> data, long len) {
        return Pointer.pointerToAddress(GByteArray.g_byte_array_prepend(Pointer.getPeer(array), Pointer.getPeer(data), len), Short.class);
    }

    @Ptr
    protected static native long g_byte_array_ref(
        @Ptr
        long array);

    public static Pointer<Short> ref(Pointer<Short> array) {
        return Pointer.pointerToAddress(GByteArray.g_byte_array_ref(Pointer.getPeer(array)), Short.class);
    }

    @Ptr
    protected static native long g_byte_array_remove_index(
        @Ptr
        long array, long index_);

    public static Pointer<Short> remove_index(Pointer<Short> array, long index_) {
        return Pointer.pointerToAddress(GByteArray.g_byte_array_remove_index(Pointer.getPeer(array), index_), Short.class);
    }

    @Ptr
    protected static native long g_byte_array_remove_index_fast(
        @Ptr
        long array, long index_);

    public static Pointer<Short> remove_index_fast(Pointer<Short> array, long index_) {
        return Pointer.pointerToAddress(GByteArray.g_byte_array_remove_index_fast(Pointer.getPeer(array), index_), Short.class);
    }

    @Ptr
    protected static native long g_byte_array_remove_range(
        @Ptr
        long array, long index_, long length);

    public static Pointer<Short> remove_range(Pointer<Short> array, long index_, long length) {
        return Pointer.pointerToAddress(GByteArray.g_byte_array_remove_range(Pointer.getPeer(array), index_, length), Short.class);
    }

    @Ptr
    protected static native long g_byte_array_set_size(
        @Ptr
        long array, long length);

    public static Pointer<Short> set_size(Pointer<Short> array, long length) {
        return Pointer.pointerToAddress(GByteArray.g_byte_array_set_size(Pointer.getPeer(array), length), Short.class);
    }

    @Ptr
    protected static native long g_byte_array_sized_new(long reserved_size);

    public static Pointer<Short> sized_new(long reserved_size) {
        return Pointer.pointerToAddress(GByteArray.g_byte_array_sized_new(reserved_size), Short.class);
    }

    protected static native void g_byte_array_unref(
        @Ptr
        long array);

    public static void unref(Pointer<Short> array) {
        GByteArray.g_byte_array_unref(Pointer.getPeer(array));
    }

    protected static native void g_byte_array_sort(
        @Ptr
        long array,
        @Ptr
        long compare_func);

    public static void sort(Pointer<Short> array, Pointer compare_func) {
        GByteArray.g_byte_array_sort(Pointer.getPeer(array), Pointer.getPeer(compare_func));
    }

    protected static native void g_byte_array_sort_with_data(
        @Ptr
        long array,
        @Ptr
        long compare_func,
        @Ptr
        long user_data);

    public static void sort_with_data(Pointer<Short> array, Pointer compare_func, Pointer user_data) {
        GByteArray.g_byte_array_sort_with_data(Pointer.getPeer(array), Pointer.getPeer(compare_func), Pointer.getPeer(user_data));
    }

}
