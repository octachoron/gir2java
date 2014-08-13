
package generated.gio20.gio;

import generated.glib20.glib.GBytes;
import generated.gobject20.gobject.GObject;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GInputStream
    extends GObject
{


    public GInputStream() {
        super();
    }

    public GInputStream(Pointer pointer) {
        super(pointer);
    }

    protected native void g_input_stream_clear_pending(
        @Ptr
        long stream);

    public void clear_pending() {
        this.g_input_stream_clear_pending(Pointer.pointerTo(this, GInputStream.class));
    }

    protected native boolean g_input_stream_close(
        @Ptr
        long stream,
        @Ptr
        long cancellable);

    public boolean close(Pointer<GCancellable> cancellable) {
        return this.g_input_stream_close(Pointer.pointerTo(this, GInputStream.class), Pointer.getPeer(cancellable));
    }

    protected native void g_input_stream_close_async(
        @Ptr
        long stream, int io_priority,
        @Ptr
        long cancellable, Object callback, Pointer user_data);

    public void close_async(int io_priority, Pointer<GCancellable> cancellable, Object callback, Pointer user_data) {
        this.g_input_stream_close_async(Pointer.pointerTo(this, GInputStream.class), io_priority, Pointer.getPeer(cancellable), callback, user_data);
    }

    protected native boolean g_input_stream_close_finish(
        @Ptr
        long stream,
        @Ptr
        long result);

    public boolean close_finish(Pointer<Object> result) {
        return this.g_input_stream_close_finish(Pointer.pointerTo(this, GInputStream.class), Pointer.getPeer(result));
    }

    protected native boolean g_input_stream_has_pending(
        @Ptr
        long stream);

    public boolean has_pending() {
        return this.g_input_stream_has_pending(Pointer.pointerTo(this, GInputStream.class));
    }

    protected native boolean g_input_stream_is_closed(
        @Ptr
        long stream);

    public boolean is_closed() {
        return this.g_input_stream_is_closed(Pointer.pointerTo(this, GInputStream.class));
    }

    protected native long g_input_stream_read(
        @Ptr
        long stream,
        @Ptr
        long buffer, long count,
        @Ptr
        long cancellable);

    public long read(short buffer, long count, Pointer<GCancellable> cancellable) {
        return this.g_input_stream_read(Pointer.pointerTo(this, GInputStream.class), Pointer.getPeer(buffer), count, Pointer.getPeer(cancellable));
    }

    protected native boolean g_input_stream_read_all(
        @Ptr
        long stream,
        @Ptr
        long buffer, long count,
        @Ptr
        long bytes_read,
        @Ptr
        long cancellable);

    public boolean read_all(short buffer, long count, Pointer<Long> bytes_read, Pointer<GCancellable> cancellable) {
        return this.g_input_stream_read_all(Pointer.pointerTo(this, GInputStream.class), Pointer.getPeer(buffer), count, Pointer.getPeer(bytes_read), Pointer.getPeer(cancellable));
    }

    protected native void g_input_stream_read_async(
        @Ptr
        long stream,
        @Ptr
        long buffer, long count, int io_priority,
        @Ptr
        long cancellable, Object callback, Pointer user_data);

    public void read_async(short buffer, long count, int io_priority, Pointer<GCancellable> cancellable, Object callback, Pointer user_data) {
        this.g_input_stream_read_async(Pointer.pointerTo(this, GInputStream.class), Pointer.getPeer(buffer), count, io_priority, Pointer.getPeer(cancellable), callback, user_data);
    }

    @Ptr
    protected native long g_input_stream_read_bytes(
        @Ptr
        long stream, long count,
        @Ptr
        long cancellable);

    public Pointer<GBytes> read_bytes(long count, Pointer<GCancellable> cancellable) {
        return Pointer.pointerToAddress(this.g_input_stream_read_bytes(Pointer.pointerTo(this, GInputStream.class), count, Pointer.getPeer(cancellable)), Pointer.class);
    }

    protected native void g_input_stream_read_bytes_async(
        @Ptr
        long stream, long count, int io_priority,
        @Ptr
        long cancellable, Object callback, Pointer user_data);

    public void read_bytes_async(long count, int io_priority, Pointer<GCancellable> cancellable, Object callback, Pointer user_data) {
        this.g_input_stream_read_bytes_async(Pointer.pointerTo(this, GInputStream.class), count, io_priority, Pointer.getPeer(cancellable), callback, user_data);
    }

    @Ptr
    protected native long g_input_stream_read_bytes_finish(
        @Ptr
        long stream,
        @Ptr
        long result);

    public Pointer<GBytes> read_bytes_finish(Pointer<Object> result) {
        return Pointer.pointerToAddress(this.g_input_stream_read_bytes_finish(Pointer.pointerTo(this, GInputStream.class), Pointer.getPeer(result)), Pointer.class);
    }

    protected native long g_input_stream_read_finish(
        @Ptr
        long stream,
        @Ptr
        long result);

    public long read_finish(Pointer<Object> result) {
        return this.g_input_stream_read_finish(Pointer.pointerTo(this, GInputStream.class), Pointer.getPeer(result));
    }

    protected native boolean g_input_stream_set_pending(
        @Ptr
        long stream);

    public boolean set_pending() {
        return this.g_input_stream_set_pending(Pointer.pointerTo(this, GInputStream.class));
    }

    protected native long g_input_stream_skip(
        @Ptr
        long stream, long count,
        @Ptr
        long cancellable);

    public long skip(long count, Pointer<GCancellable> cancellable) {
        return this.g_input_stream_skip(Pointer.pointerTo(this, GInputStream.class), count, Pointer.getPeer(cancellable));
    }

    protected native void g_input_stream_skip_async(
        @Ptr
        long stream, long count, int io_priority,
        @Ptr
        long cancellable, Object callback, Pointer user_data);

    public void skip_async(long count, int io_priority, Pointer<GCancellable> cancellable, Object callback, Pointer user_data) {
        this.g_input_stream_skip_async(Pointer.pointerTo(this, GInputStream.class), count, io_priority, Pointer.getPeer(cancellable), callback, user_data);
    }

    protected native long g_input_stream_skip_finish(
        @Ptr
        long stream,
        @Ptr
        long result);

    public long skip_finish(Pointer<Object> result) {
        return this.g_input_stream_skip_finish(Pointer.pointerTo(this, GInputStream.class), Pointer.getPeer(result));
    }

    @Field(0)
    public GObject field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GInputStream field_parent_instance(GObject field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GInputStream field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

}
