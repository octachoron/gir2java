
package generated.gio20.gio;

import generated.glib20.glib.GBytes;
import generated.glib20.glib.GError;
import generated.gobject20.gobject.GObject;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GOutputStream
    extends GObject
{


    static {
        BridJ.register();
    }

    public GOutputStream() {
        super();
    }

    public GOutputStream(Pointer pointer) {
        super(pointer);
    }

    protected native void g_output_stream_clear_pending(
        @Ptr
        long stream);

    public void clear_pending() {
        this.g_output_stream_clear_pending(Pointer.pointerTo(this, GOutputStream.class).getPeer());
    }

    protected native boolean g_output_stream_close(
        @Ptr
        long stream,
        @Ptr
        long cancellable);

    public boolean close(Pointer<GCancellable> cancellable) {
        return this.g_output_stream_close(Pointer.pointerTo(this, GOutputStream.class).getPeer(), Pointer.getPeer(cancellable));
    }

    protected native void g_output_stream_close_async(
        @Ptr
        long stream, int io_priority,
        @Ptr
        long cancellable,
        @Ptr
        long callback,
        @Ptr
        long user_data);

    public void close_async(int io_priority, Pointer<GCancellable> cancellable, Pointer callback, Pointer user_data) {
        this.g_output_stream_close_async(Pointer.pointerTo(this, GOutputStream.class).getPeer(), io_priority, Pointer.getPeer(cancellable), Pointer.getPeer(callback), Pointer.getPeer(user_data));
    }

    protected native boolean g_output_stream_close_finish(
        @Ptr
        long stream,
        @Ptr
        long result);

    public boolean close_finish(Pointer<Object> result) {
        return this.g_output_stream_close_finish(Pointer.pointerTo(this, GOutputStream.class).getPeer(), Pointer.getPeer(result));
    }

    protected native boolean g_output_stream_flush(
        @Ptr
        long stream,
        @Ptr
        long cancellable);

    public boolean flush(Pointer<GCancellable> cancellable) {
        return this.g_output_stream_flush(Pointer.pointerTo(this, GOutputStream.class).getPeer(), Pointer.getPeer(cancellable));
    }

    protected native void g_output_stream_flush_async(
        @Ptr
        long stream, int io_priority,
        @Ptr
        long cancellable,
        @Ptr
        long callback,
        @Ptr
        long user_data);

    public void flush_async(int io_priority, Pointer<GCancellable> cancellable, Pointer callback, Pointer user_data) {
        this.g_output_stream_flush_async(Pointer.pointerTo(this, GOutputStream.class).getPeer(), io_priority, Pointer.getPeer(cancellable), Pointer.getPeer(callback), Pointer.getPeer(user_data));
    }

    protected native boolean g_output_stream_flush_finish(
        @Ptr
        long stream,
        @Ptr
        long result);

    public boolean flush_finish(Pointer<Object> result) {
        return this.g_output_stream_flush_finish(Pointer.pointerTo(this, GOutputStream.class).getPeer(), Pointer.getPeer(result));
    }

    protected native boolean g_output_stream_has_pending(
        @Ptr
        long stream);

    public boolean has_pending() {
        return this.g_output_stream_has_pending(Pointer.pointerTo(this, GOutputStream.class).getPeer());
    }

    protected native boolean g_output_stream_is_closed(
        @Ptr
        long stream);

    public boolean is_closed() {
        return this.g_output_stream_is_closed(Pointer.pointerTo(this, GOutputStream.class).getPeer());
    }

    protected native boolean g_output_stream_is_closing(
        @Ptr
        long stream);

    public boolean is_closing() {
        return this.g_output_stream_is_closing(Pointer.pointerTo(this, GOutputStream.class).getPeer());
    }

    protected native boolean g_output_stream_printf(
        @Ptr
        long stream,
        @Ptr
        long bytes_written,
        @Ptr
        long cancellable,
        @Ptr
        long error,
        @Ptr
        long format, Object... varargs);

    public boolean printf(Pointer<Long> bytes_written, Pointer<GCancellable> cancellable, Pointer<Pointer<GError>> error, Pointer format, Object... varargs) {
        return this.g_output_stream_printf(Pointer.pointerTo(this, GOutputStream.class).getPeer(), Pointer.getPeer(bytes_written), Pointer.getPeer(cancellable), Pointer.getPeer(error), Pointer.getPeer(format), varargs);
    }

    protected native boolean g_output_stream_set_pending(
        @Ptr
        long stream);

    public boolean set_pending() {
        return this.g_output_stream_set_pending(Pointer.pointerTo(this, GOutputStream.class).getPeer());
    }

    protected native long g_output_stream_splice_finish(
        @Ptr
        long stream,
        @Ptr
        long result);

    public long splice_finish(Pointer<Object> result) {
        return this.g_output_stream_splice_finish(Pointer.pointerTo(this, GOutputStream.class).getPeer(), Pointer.getPeer(result));
    }

    protected native long g_output_stream_write(
        @Ptr
        long stream,
        @Ptr
        long buffer, long count,
        @Ptr
        long cancellable);

    public long write(Pointer<Short> buffer, long count, Pointer<GCancellable> cancellable) {
        return this.g_output_stream_write(Pointer.pointerTo(this, GOutputStream.class).getPeer(), Pointer.getPeer(buffer), count, Pointer.getPeer(cancellable));
    }

    protected native boolean g_output_stream_write_all(
        @Ptr
        long stream,
        @Ptr
        long buffer, long count,
        @Ptr
        long bytes_written,
        @Ptr
        long cancellable);

    public boolean write_all(Pointer<Short> buffer, long count, Pointer<Long> bytes_written, Pointer<GCancellable> cancellable) {
        return this.g_output_stream_write_all(Pointer.pointerTo(this, GOutputStream.class).getPeer(), Pointer.getPeer(buffer), count, Pointer.getPeer(bytes_written), Pointer.getPeer(cancellable));
    }

    protected native void g_output_stream_write_async(
        @Ptr
        long stream,
        @Ptr
        long buffer, long count, int io_priority,
        @Ptr
        long cancellable,
        @Ptr
        long callback,
        @Ptr
        long user_data);

    public void write_async(Pointer<Short> buffer, long count, int io_priority, Pointer<GCancellable> cancellable, Pointer callback, Pointer user_data) {
        this.g_output_stream_write_async(Pointer.pointerTo(this, GOutputStream.class).getPeer(), Pointer.getPeer(buffer), count, io_priority, Pointer.getPeer(cancellable), Pointer.getPeer(callback), Pointer.getPeer(user_data));
    }

    protected native long g_output_stream_write_bytes(
        @Ptr
        long stream,
        @Ptr
        long bytes,
        @Ptr
        long cancellable);

    public long write_bytes(Pointer<GBytes> bytes, Pointer<GCancellable> cancellable) {
        return this.g_output_stream_write_bytes(Pointer.pointerTo(this, GOutputStream.class).getPeer(), Pointer.getPeer(bytes), Pointer.getPeer(cancellable));
    }

    protected native void g_output_stream_write_bytes_async(
        @Ptr
        long stream,
        @Ptr
        long bytes, int io_priority,
        @Ptr
        long cancellable,
        @Ptr
        long callback,
        @Ptr
        long user_data);

    public void write_bytes_async(Pointer<GBytes> bytes, int io_priority, Pointer<GCancellable> cancellable, Pointer callback, Pointer user_data) {
        this.g_output_stream_write_bytes_async(Pointer.pointerTo(this, GOutputStream.class).getPeer(), Pointer.getPeer(bytes), io_priority, Pointer.getPeer(cancellable), Pointer.getPeer(callback), Pointer.getPeer(user_data));
    }

    protected native long g_output_stream_write_bytes_finish(
        @Ptr
        long stream,
        @Ptr
        long result);

    public long write_bytes_finish(Pointer<Object> result) {
        return this.g_output_stream_write_bytes_finish(Pointer.pointerTo(this, GOutputStream.class).getPeer(), Pointer.getPeer(result));
    }

    protected native long g_output_stream_write_finish(
        @Ptr
        long stream,
        @Ptr
        long result);

    public long write_finish(Pointer<Object> result) {
        return this.g_output_stream_write_finish(Pointer.pointerTo(this, GOutputStream.class).getPeer(), Pointer.getPeer(result));
    }

    @Field(0)
    public GObject field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GOutputStream field_parent_instance(GObject field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    private Pointer field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GOutputStream field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

    protected native long g_output_stream_splice(
        @Ptr
        long stream,
        @Ptr
        long source, IntValuedEnum<GOutputStreamSpliceFlags> flags,
        @Ptr
        long cancellable);

    public long splice(Pointer<GInputStream> source, IntValuedEnum<GOutputStreamSpliceFlags> flags, Pointer<GCancellable> cancellable) {
        return this.g_output_stream_splice(Pointer.pointerTo(this, GOutputStream.class).getPeer(), Pointer.getPeer(source), flags, Pointer.getPeer(cancellable));
    }

    protected native void g_output_stream_splice_async(
        @Ptr
        long stream,
        @Ptr
        long source, IntValuedEnum<GOutputStreamSpliceFlags> flags, int io_priority,
        @Ptr
        long cancellable,
        @Ptr
        long callback,
        @Ptr
        long user_data);

    public void splice_async(Pointer<GInputStream> source, IntValuedEnum<GOutputStreamSpliceFlags> flags, int io_priority, Pointer<GCancellable> cancellable, Pointer callback, Pointer user_data) {
        this.g_output_stream_splice_async(Pointer.pointerTo(this, GOutputStream.class).getPeer(), Pointer.getPeer(source), flags, io_priority, Pointer.getPeer(cancellable), Pointer.getPeer(callback), Pointer.getPeer(user_data));
    }

}
