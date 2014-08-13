
package generated.gio20.gio;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GBufferedInputStream
    extends StructObject
{


    public GBufferedInputStream() {
        super();
    }

    public GBufferedInputStream(Pointer pointer) {
        super(pointer);
    }

    protected native long g_buffered_input_stream_fill(
        @Ptr
        long stream, long count,
        @Ptr
        long cancellable);

    public long fill(long count, Pointer cancellable) {
        return this.g_buffered_input_stream_fill(Pointer.pointerTo(this, GBufferedInputStream.class), count, Pointer.getPeer(cancellable));
    }

    protected native void g_buffered_input_stream_fill_async(
        @Ptr
        long stream, long count, int io_priority,
        @Ptr
        long cancellable, Object callback, Pointer user_data);

    public void fill_async(long count, int io_priority, Pointer cancellable, Object callback, Pointer user_data) {
        this.g_buffered_input_stream_fill_async(Pointer.pointerTo(this, GBufferedInputStream.class), count, io_priority, Pointer.getPeer(cancellable), callback, user_data);
    }

    protected native long g_buffered_input_stream_fill_finish(
        @Ptr
        long stream,
        @Ptr
        long result);

    public long fill_finish(Pointer<Object> result) {
        return this.g_buffered_input_stream_fill_finish(Pointer.pointerTo(this, GBufferedInputStream.class), Pointer.getPeer(result));
    }

    protected native long g_buffered_input_stream_get_available(
        @Ptr
        long stream);

    public long get_available() {
        return this.g_buffered_input_stream_get_available(Pointer.pointerTo(this, GBufferedInputStream.class));
    }

    protected native long g_buffered_input_stream_get_buffer_size(
        @Ptr
        long stream);

    public long get_buffer_size() {
        return this.g_buffered_input_stream_get_buffer_size(Pointer.pointerTo(this, GBufferedInputStream.class));
    }

    protected native long g_buffered_input_stream_peek(
        @Ptr
        long stream,
        @Ptr
        long buffer, long offset, long count);

    public long peek(short buffer, long offset, long count) {
        return this.g_buffered_input_stream_peek(Pointer.pointerTo(this, GBufferedInputStream.class), Pointer.getPeer(buffer), offset, count);
    }

    @Ptr
    protected native long g_buffered_input_stream_peek_buffer(
        @Ptr
        long stream,
        @Ptr
        long count);

    public short peek_buffer(Pointer<Long> count) {
        return Pointer.pointerToAddress(this.g_buffered_input_stream_peek_buffer(Pointer.pointerTo(this, GBufferedInputStream.class), Pointer.getPeer(count)), Short.class);
    }

    protected native int g_buffered_input_stream_read_byte(
        @Ptr
        long stream,
        @Ptr
        long cancellable);

    public int read_byte(Pointer cancellable) {
        return this.g_buffered_input_stream_read_byte(Pointer.pointerTo(this, GBufferedInputStream.class), Pointer.getPeer(cancellable));
    }

    protected native void g_buffered_input_stream_set_buffer_size(
        @Ptr
        long stream, long size);

    public void set_buffer_size(long size) {
        this.g_buffered_input_stream_set_buffer_size(Pointer.pointerTo(this, GBufferedInputStream.class), size);
    }

    @Field(0)
    public Pointer<GBufferedInputStreamPrivate> field_priv() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GBufferedInputStream field_priv(Pointer<GBufferedInputStreamPrivate> field_priv) {
        this.io.setPointerField(this, 0, field_priv);
        return this;
    }

    @Field(1)
    public GFilterInputStream field_parent_instance() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GBufferedInputStream field_parent_instance(GFilterInputStream field_parent_instance) {
        this.io.setNativeObjectField(this, 1, field_parent_instance);
        return this;
    }

}
