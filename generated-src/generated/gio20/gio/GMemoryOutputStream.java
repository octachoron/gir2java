
package generated.gio20.gio;

import generated.glib20.glib.GBytes;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GMemoryOutputStream
    extends GOutputStream
{


    static {
        BridJ.register();
    }

    public GMemoryOutputStream() {
        super();
    }

    public GMemoryOutputStream(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_memory_output_stream_new_resizable();

    public static Pointer new_resizable() {
        return Pointer.pointerToAddress(GMemoryOutputStream.g_memory_output_stream_new_resizable());
    }

    @Ptr
    protected native long g_memory_output_stream_get_data(
        @Ptr
        long ostream);

    public Pointer get_data() {
        return Pointer.pointerToAddress(this.g_memory_output_stream_get_data(Pointer.pointerTo(this, GMemoryOutputStream.class).getPeer()));
    }

    protected native long g_memory_output_stream_get_data_size(
        @Ptr
        long ostream);

    public long get_data_size() {
        return this.g_memory_output_stream_get_data_size(Pointer.pointerTo(this, GMemoryOutputStream.class).getPeer());
    }

    protected native long g_memory_output_stream_get_size(
        @Ptr
        long ostream);

    public long get_size() {
        return this.g_memory_output_stream_get_size(Pointer.pointerTo(this, GMemoryOutputStream.class).getPeer());
    }

    @Ptr
    protected native long g_memory_output_stream_steal_as_bytes(
        @Ptr
        long ostream);

    public Pointer<GBytes> steal_as_bytes() {
        return Pointer.pointerToAddress(this.g_memory_output_stream_steal_as_bytes(Pointer.pointerTo(this, GMemoryOutputStream.class).getPeer()), GBytes.class);
    }

    @Ptr
    protected native long g_memory_output_stream_steal_data(
        @Ptr
        long ostream);

    public Pointer steal_data() {
        return Pointer.pointerToAddress(this.g_memory_output_stream_steal_data(Pointer.pointerTo(this, GMemoryOutputStream.class).getPeer()));
    }

    @Field(0)
    public GOutputStream gmemoryoutputstream_field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GMemoryOutputStream gmemoryoutputstream_field_parent_instance(GOutputStream gmemoryoutputstream_field_parent_instance) {
        this.io.setNativeObjectField(this, 0, gmemoryoutputstream_field_parent_instance);
        return this;
    }

    @Ptr
    protected static native long g_memory_output_stream_new(
        @Ptr
        long data, long size,
        @Ptr
        long realloc_function,
        @Ptr
        long destroy_function);

    public static Pointer<GOutputStream> gmemoryoutputstream__new(Pointer data, long size, Pointer realloc_function, Pointer destroy_function) {
        return Pointer.pointerToAddress(GMemoryOutputStream.g_memory_output_stream_new(Pointer.getPeer(data), size, Pointer.getPeer(realloc_function), Pointer.getPeer(destroy_function)), GOutputStream.class);
    }

    @Field(1)
    private Pointer<GMemoryOutputStreamPrivate> gmemoryoutputstream_field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GMemoryOutputStream gmemoryoutputstream_field_priv(Pointer<GMemoryOutputStreamPrivate> gmemoryoutputstream_field_priv) {
        this.io.setPointerField(this, 1, gmemoryoutputstream_field_priv);
        return this;
    }

}
