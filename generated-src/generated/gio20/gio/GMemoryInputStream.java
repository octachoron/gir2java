
package generated.gio20.gio;

import generated.glib20.glib.GBytes;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GMemoryInputStream
    extends GInputStream
{


    static {
        BridJ.register();
    }

    public GMemoryInputStream() {
        super();
    }

    public GMemoryInputStream(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_memory_input_stream_new();

    public static Pointer<GInputStream> gmemoryinputstream__new() {
        return Pointer.pointerToAddress(GMemoryInputStream.g_memory_input_stream_new(), GInputStream.class);
    }

    @Ptr
    protected static native long g_memory_input_stream_new_from_bytes(
        @Ptr
        long bytes);

    public static Pointer<GInputStream> new_from_bytes(Pointer<GBytes> bytes) {
        return Pointer.pointerToAddress(GMemoryInputStream.g_memory_input_stream_new_from_bytes(Pointer.getPeer(bytes)), GInputStream.class);
    }

    @Ptr
    protected static native long g_memory_input_stream_new_from_data(
        @Ptr
        long data, long len,
        @Ptr
        long destroy);

    public static Pointer<GInputStream> new_from_data(Pointer<Short> data, long len, Pointer destroy) {
        return Pointer.pointerToAddress(GMemoryInputStream.g_memory_input_stream_new_from_data(Pointer.getPeer(data), len, Pointer.getPeer(destroy)), GInputStream.class);
    }

    protected native void g_memory_input_stream_add_bytes(
        @Ptr
        long stream,
        @Ptr
        long bytes);

    public void add_bytes(Pointer<GBytes> bytes) {
        this.g_memory_input_stream_add_bytes(Pointer.pointerTo(this, GMemoryInputStream.class).getPeer(), Pointer.getPeer(bytes));
    }

    protected native void g_memory_input_stream_add_data(
        @Ptr
        long stream,
        @Ptr
        long data, long len,
        @Ptr
        long destroy);

    public void add_data(Pointer<Short> data, long len, Pointer destroy) {
        this.g_memory_input_stream_add_data(Pointer.pointerTo(this, GMemoryInputStream.class).getPeer(), Pointer.getPeer(data), len, Pointer.getPeer(destroy));
    }

    @Field(0)
    public GInputStream gmemoryinputstream_field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GMemoryInputStream gmemoryinputstream_field_parent_instance(GInputStream gmemoryinputstream_field_parent_instance) {
        this.io.setNativeObjectField(this, 0, gmemoryinputstream_field_parent_instance);
        return this;
    }

    @Field(1)
    private Pointer gmemoryinputstream_field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GMemoryInputStream gmemoryinputstream_field_priv(Pointer gmemoryinputstream_field_priv) {
        this.io.setPointerField(this, 1, gmemoryinputstream_field_priv);
        return this;
    }

}
