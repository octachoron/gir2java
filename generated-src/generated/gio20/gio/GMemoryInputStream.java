
package generated.gio20.gio;

import generated.glib20.glib.GBytes;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GMemoryInputStream
    extends GInputStream
{


    public GMemoryInputStream() {
        super();
    }

    public GMemoryInputStream(Pointer pointer) {
        super(pointer);
    }

    protected native void g_memory_input_stream_add_bytes(
        @Ptr
        long stream,
        @Ptr
        long bytes);

    public void add_bytes(Pointer<GBytes> bytes) {
        this.g_memory_input_stream_add_bytes(Pointer.pointerTo(this, GMemoryInputStream.class), Pointer.getPeer(bytes));
    }

    protected native void g_memory_input_stream_add_data(
        @Ptr
        long stream,
        @Ptr
        long data, long len, Object destroy);

    public void add_data(short data, long len, Object destroy) {
        this.g_memory_input_stream_add_data(Pointer.pointerTo(this, GMemoryInputStream.class), Pointer.getPeer(data), len, destroy);
    }

    @Field(0)
    public GInputStream field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GMemoryInputStream field_parent_instance(GInputStream field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GMemoryInputStream field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

}
