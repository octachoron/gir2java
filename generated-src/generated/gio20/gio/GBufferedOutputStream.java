
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GBufferedOutputStream
    extends GFilterOutputStream
{


    static {
        BridJ.register();
    }

    public GBufferedOutputStream() {
        super();
    }

    public GBufferedOutputStream(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_buffered_output_stream_new(
        @Ptr
        long base_stream);

    public static Pointer<GOutputStream> gbufferedoutputstream__new(Pointer<GOutputStream> base_stream) {
        return Pointer.pointerToAddress(GBufferedOutputStream.g_buffered_output_stream_new(Pointer.getPeer(base_stream)), GOutputStream.class);
    }

    @Ptr
    protected static native long g_buffered_output_stream_new_sized(
        @Ptr
        long base_stream, long size);

    public static Pointer<GOutputStream> new_sized(Pointer<GOutputStream> base_stream, long size) {
        return Pointer.pointerToAddress(GBufferedOutputStream.g_buffered_output_stream_new_sized(Pointer.getPeer(base_stream), size), GOutputStream.class);
    }

    protected native boolean g_buffered_output_stream_get_auto_grow(
        @Ptr
        long stream);

    public boolean get_auto_grow() {
        return this.g_buffered_output_stream_get_auto_grow(Pointer.pointerTo(this, GBufferedOutputStream.class).getPeer());
    }

    protected native long g_buffered_output_stream_get_buffer_size(
        @Ptr
        long stream);

    public long get_buffer_size() {
        return this.g_buffered_output_stream_get_buffer_size(Pointer.pointerTo(this, GBufferedOutputStream.class).getPeer());
    }

    protected native void g_buffered_output_stream_set_auto_grow(
        @Ptr
        long stream, boolean auto_grow);

    public void set_auto_grow(boolean auto_grow) {
        this.g_buffered_output_stream_set_auto_grow(Pointer.pointerTo(this, GBufferedOutputStream.class).getPeer(), auto_grow);
    }

    protected native void g_buffered_output_stream_set_buffer_size(
        @Ptr
        long stream, long size);

    public void set_buffer_size(long size) {
        this.g_buffered_output_stream_set_buffer_size(Pointer.pointerTo(this, GBufferedOutputStream.class).getPeer(), size);
    }

    @Field(0)
    public GFilterOutputStream gbufferedoutputstream_field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GBufferedOutputStream gbufferedoutputstream_field_parent_instance(GFilterOutputStream gbufferedoutputstream_field_parent_instance) {
        this.io.setNativeObjectField(this, 0, gbufferedoutputstream_field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer<GBufferedOutputStreamPrivate> gbufferedoutputstream_field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GBufferedOutputStream gbufferedoutputstream_field_priv(Pointer<GBufferedOutputStreamPrivate> gbufferedoutputstream_field_priv) {
        this.io.setPointerField(this, 1, gbufferedoutputstream_field_priv);
        return this;
    }

}
