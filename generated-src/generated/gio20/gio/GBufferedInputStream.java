
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GBufferedInputStream
    extends GFilterInputStream
{


    static {
        BridJ.register();
    }

    public GBufferedInputStream() {
        super();
    }

    public GBufferedInputStream(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_buffered_input_stream_new(
        @Ptr
        long base_stream);

    public static Pointer<GInputStream> gbufferedinputstream__new(Pointer<GInputStream> base_stream) {
        return Pointer.pointerToAddress(GBufferedInputStream.g_buffered_input_stream_new(Pointer.getPeer(base_stream)), GInputStream.class);
    }

    @Ptr
    protected static native long g_buffered_input_stream_new_sized(
        @Ptr
        long base_stream, long size);

    public static Pointer<GInputStream> new_sized(Pointer<GInputStream> base_stream, long size) {
        return Pointer.pointerToAddress(GBufferedInputStream.g_buffered_input_stream_new_sized(Pointer.getPeer(base_stream), size), GInputStream.class);
    }

    protected native long g_buffered_input_stream_fill(
        @Ptr
        long stream, long count,
        @Ptr
        long cancellable);

    public long fill(long count, Pointer<GCancellable> cancellable) {
        return this.g_buffered_input_stream_fill(Pointer.pointerTo(this, GBufferedInputStream.class).getPeer(), count, Pointer.getPeer(cancellable));
    }

    protected native void g_buffered_input_stream_fill_async(
        @Ptr
        long stream, long count, int io_priority,
        @Ptr
        long cancellable,
        @Ptr
        long callback,
        @Ptr
        long user_data);

    public void fill_async(long count, int io_priority, Pointer<GCancellable> cancellable, Pointer callback, Pointer user_data) {
        this.g_buffered_input_stream_fill_async(Pointer.pointerTo(this, GBufferedInputStream.class).getPeer(), count, io_priority, Pointer.getPeer(cancellable), Pointer.getPeer(callback), Pointer.getPeer(user_data));
    }

    protected native long g_buffered_input_stream_fill_finish(
        @Ptr
        long stream,
        @Ptr
        long result);

    public long fill_finish(Pointer<Object> result) {
        return this.g_buffered_input_stream_fill_finish(Pointer.pointerTo(this, GBufferedInputStream.class).getPeer(), Pointer.getPeer(result));
    }

    protected native long g_buffered_input_stream_get_available(
        @Ptr
        long stream);

    public long get_available() {
        return this.g_buffered_input_stream_get_available(Pointer.pointerTo(this, GBufferedInputStream.class).getPeer());
    }

    protected native long g_buffered_input_stream_get_buffer_size(
        @Ptr
        long stream);

    public long get_buffer_size() {
        return this.g_buffered_input_stream_get_buffer_size(Pointer.pointerTo(this, GBufferedInputStream.class).getPeer());
    }

    protected native long g_buffered_input_stream_peek(
        @Ptr
        long stream,
        @Ptr
        long buffer, long offset, long count);

    public long peek(Pointer<Short> buffer, long offset, long count) {
        return this.g_buffered_input_stream_peek(Pointer.pointerTo(this, GBufferedInputStream.class).getPeer(), Pointer.getPeer(buffer), offset, count);
    }

    @Ptr
    protected native long g_buffered_input_stream_peek_buffer(
        @Ptr
        long stream,
        @Ptr
        long count);

    public Pointer<Short> peek_buffer(Pointer<Long> count) {
        return Pointer.pointerToAddress(this.g_buffered_input_stream_peek_buffer(Pointer.pointerTo(this, GBufferedInputStream.class).getPeer(), Pointer.getPeer(count)), Short.class);
    }

    protected native int g_buffered_input_stream_read_byte(
        @Ptr
        long stream,
        @Ptr
        long cancellable);

    public int read_byte(Pointer<GCancellable> cancellable) {
        return this.g_buffered_input_stream_read_byte(Pointer.pointerTo(this, GBufferedInputStream.class).getPeer(), Pointer.getPeer(cancellable));
    }

    protected native void g_buffered_input_stream_set_buffer_size(
        @Ptr
        long stream, long size);

    public void set_buffer_size(long size) {
        this.g_buffered_input_stream_set_buffer_size(Pointer.pointerTo(this, GBufferedInputStream.class).getPeer(), size);
    }

    @Field(0)
    public GFilterInputStream gbufferedinputstream_field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GBufferedInputStream gbufferedinputstream_field_parent_instance(GFilterInputStream gbufferedinputstream_field_parent_instance) {
        this.io.setNativeObjectField(this, 0, gbufferedinputstream_field_parent_instance);
        return this;
    }

    @Field(1)
    private Pointer<GBufferedInputStreamPrivate> gbufferedinputstream_field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GBufferedInputStream gbufferedinputstream_field_priv(Pointer<GBufferedInputStreamPrivate> gbufferedinputstream_field_priv) {
        this.io.setPointerField(this, 1, gbufferedinputstream_field_priv);
        return this;
    }

}
