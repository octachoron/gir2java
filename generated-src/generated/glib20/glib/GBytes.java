
package generated.glib20.glib;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GBytes
    extends StructObject
{


    public GBytes() {
        super();
    }

    public GBytes(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long g_bytes_get_data(
        @Ptr
        long bytes,
        @Ptr
        long size);

    public short get_data(Pointer<Long> size) {
        return Pointer.pointerToAddress(this.g_bytes_get_data(Pointer.pointerTo(this, GBytes.class), Pointer.getPeer(size)), Short.class);
    }

    protected native long g_bytes_get_size(
        @Ptr
        long bytes);

    public long get_size() {
        return this.g_bytes_get_size(Pointer.pointerTo(this, GBytes.class));
    }

    @Ptr
    protected native long g_bytes_new_from_bytes(
        @Ptr
        long bytes, long offset, long length);

    public Pointer new_from_bytes(long offset, long length) {
        return Pointer.pointerToAddress(this.g_bytes_new_from_bytes(Pointer.pointerTo(this, GBytes.class), offset, length));
    }

    @Ptr
    protected native long g_bytes_ref(
        @Ptr
        long bytes);

    public Pointer ref() {
        return Pointer.pointerToAddress(this.g_bytes_ref(Pointer.pointerTo(this, GBytes.class)));
    }

    protected native void g_bytes_unref(
        @Ptr
        long bytes);

    public void unref() {
        this.g_bytes_unref(Pointer.pointerTo(this, GBytes.class));
    }

    @Ptr
    protected native long g_bytes_unref_to_array(
        @Ptr
        long bytes);

    public short unref_to_array() {
        return Pointer.pointerToAddress(this.g_bytes_unref_to_array(Pointer.pointerTo(this, GBytes.class)), Short.class);
    }

    protected native Pointer g_bytes_unref_to_data(
        @Ptr
        long bytes,
        @Ptr
        long size);

    public Pointer unref_to_data(Pointer<Long> size) {
        return this.g_bytes_unref_to_data(Pointer.pointerTo(this, GBytes.class), Pointer.getPeer(size));
    }

    public native int g_bytes_compare(GBytes bytes1, GBytes bytes2);

    public native boolean g_bytes_equal(GBytes bytes1, GBytes bytes2);

    public native long g_bytes_hash(GBytes bytes);

}
