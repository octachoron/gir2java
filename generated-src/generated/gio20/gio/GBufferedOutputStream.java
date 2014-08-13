
package generated.gio20.gio;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GBufferedOutputStream
    extends StructObject
{


    public GBufferedOutputStream() {
        super();
    }

    public GBufferedOutputStream(Pointer pointer) {
        super(pointer);
    }

    protected native boolean g_buffered_output_stream_get_auto_grow(
        @Ptr
        long stream);

    public boolean get_auto_grow() {
        return this.g_buffered_output_stream_get_auto_grow(Pointer.pointerTo(this, GBufferedOutputStream.class));
    }

    protected native long g_buffered_output_stream_get_buffer_size(
        @Ptr
        long stream);

    public long get_buffer_size() {
        return this.g_buffered_output_stream_get_buffer_size(Pointer.pointerTo(this, GBufferedOutputStream.class));
    }

    protected native void g_buffered_output_stream_set_auto_grow(
        @Ptr
        long stream, boolean auto_grow);

    public void set_auto_grow(boolean auto_grow) {
        this.g_buffered_output_stream_set_auto_grow(Pointer.pointerTo(this, GBufferedOutputStream.class), auto_grow);
    }

    protected native void g_buffered_output_stream_set_buffer_size(
        @Ptr
        long stream, long size);

    public void set_buffer_size(long size) {
        this.g_buffered_output_stream_set_buffer_size(Pointer.pointerTo(this, GBufferedOutputStream.class), size);
    }

    @Field(0)
    public GFilterOutputStream field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GBufferedOutputStream field_parent_instance(GFilterOutputStream field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer<GBufferedOutputStreamPrivate> field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GBufferedOutputStream field_priv(Pointer<GBufferedOutputStreamPrivate> field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

}
