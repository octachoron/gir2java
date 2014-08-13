
package generated.gio20.gio;

import generated.glib20.glib.GBytes;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GMemoryOutputStream
    extends StructObject
{


    public GMemoryOutputStream() {
        super();
    }

    public GMemoryOutputStream(Pointer pointer) {
        super(pointer);
    }

    protected native Pointer g_memory_output_stream_get_data(
        @Ptr
        long ostream);

    public Pointer get_data() {
        return this.g_memory_output_stream_get_data(Pointer.pointerTo(this, GMemoryOutputStream.class));
    }

    protected native long g_memory_output_stream_get_data_size(
        @Ptr
        long ostream);

    public long get_data_size() {
        return this.g_memory_output_stream_get_data_size(Pointer.pointerTo(this, GMemoryOutputStream.class));
    }

    protected native long g_memory_output_stream_get_size(
        @Ptr
        long ostream);

    public long get_size() {
        return this.g_memory_output_stream_get_size(Pointer.pointerTo(this, GMemoryOutputStream.class));
    }

    @Ptr
    protected native long g_memory_output_stream_steal_as_bytes(
        @Ptr
        long ostream);

    public Pointer<GBytes> steal_as_bytes() {
        return Pointer.pointerToAddress(this.g_memory_output_stream_steal_as_bytes(Pointer.pointerTo(this, GMemoryOutputStream.class)), Pointer.class);
    }

    protected native Pointer g_memory_output_stream_steal_data(
        @Ptr
        long ostream);

    public Pointer steal_data() {
        return this.g_memory_output_stream_steal_data(Pointer.pointerTo(this, GMemoryOutputStream.class));
    }

    @Field(0)
    public Pointer<GMemoryOutputStreamPrivate> field_priv() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GMemoryOutputStream field_priv(Pointer<GMemoryOutputStreamPrivate> field_priv) {
        this.io.setPointerField(this, 0, field_priv);
        return this;
    }

    @Field(1)
    public GOutputStream field_parent_instance() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GMemoryOutputStream field_parent_instance(GOutputStream field_parent_instance) {
        this.io.setNativeObjectField(this, 1, field_parent_instance);
        return this;
    }

}
