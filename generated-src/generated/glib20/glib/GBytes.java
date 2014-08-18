
package generated.glib20.glib;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GBytes
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GBytes() {
        super();
    }

    public GBytes(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_bytes_new(short data, long size);

    public static Pointer _new(short data, long size) {
        return Pointer.pointerToAddress(GBytes.g_bytes_new(data, size));
    }

    @Ptr
    protected static native long g_bytes_new_static(short data, long size);

    public static Pointer new_static(short data, long size) {
        return Pointer.pointerToAddress(GBytes.g_bytes_new_static(data, size));
    }

    @Ptr
    protected static native long g_bytes_new_take(short data, long size);

    public static Pointer new_take(short data, long size) {
        return Pointer.pointerToAddress(GBytes.g_bytes_new_take(data, size));
    }

    protected native short g_bytes_get_data(
        @Ptr
        long bytes,
        @Ptr
        long size);

    public short get_data(Pointer<Long> size) {
        return this.g_bytes_get_data(Pointer.pointerTo(this, GBytes.class).getPeer(), Pointer.getPeer(size));
    }

    protected native long g_bytes_get_size(
        @Ptr
        long bytes);

    public long get_size() {
        return this.g_bytes_get_size(Pointer.pointerTo(this, GBytes.class).getPeer());
    }

    @Ptr
    protected native long g_bytes_new_from_bytes(
        @Ptr
        long bytes, long offset, long length);

    public Pointer new_from_bytes(long offset, long length) {
        return Pointer.pointerToAddress(this.g_bytes_new_from_bytes(Pointer.pointerTo(this, GBytes.class).getPeer(), offset, length));
    }

    @Ptr
    protected native long g_bytes_ref(
        @Ptr
        long bytes);

    public Pointer ref() {
        return Pointer.pointerToAddress(this.g_bytes_ref(Pointer.pointerTo(this, GBytes.class).getPeer()));
    }

    protected native void g_bytes_unref(
        @Ptr
        long bytes);

    public void unref() {
        this.g_bytes_unref(Pointer.pointerTo(this, GBytes.class).getPeer());
    }

    @Ptr
    protected native long g_bytes_unref_to_array(
        @Ptr
        long bytes);

    public Pointer<Short> unref_to_array() {
        return Pointer.pointerToAddress(this.g_bytes_unref_to_array(Pointer.pointerTo(this, GBytes.class).getPeer()), Short.class);
    }

    @Ptr
    protected native long g_bytes_unref_to_data(
        @Ptr
        long bytes,
        @Ptr
        long size);

    public Pointer unref_to_data(Pointer<Long> size) {
        return Pointer.pointerToAddress(this.g_bytes_unref_to_data(Pointer.pointerTo(this, GBytes.class).getPeer(), Pointer.getPeer(size)));
    }

    @Ptr
    protected static native long g_bytes_new_with_free_func(
        @Ptr
        long data, long size,
        @Ptr
        long free_func,
        @Ptr
        long user_data);

    public static Pointer<GBytes> new_with_free_func(Pointer data, long size, Pointer free_func, Pointer user_data) {
        return Pointer.pointerToAddress(GBytes.g_bytes_new_with_free_func(Pointer.getPeer(data), size, Pointer.getPeer(free_func), Pointer.getPeer(user_data)), GBytes.class);
    }

}
