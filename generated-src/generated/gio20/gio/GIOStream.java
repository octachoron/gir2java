
package generated.gio20.gio;

import generated.gobject20.gobject.GObject;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GIOStream
    extends GObject
{


    static {
        BridJ.register();
    }

    public GIOStream() {
        super();
    }

    public GIOStream(Pointer pointer) {
        super(pointer);
    }

    protected static native boolean g_io_stream_splice_finish(
        @Ptr
        long result);

    public static boolean splice_finish(Pointer<Object> result) {
        return GIOStream.g_io_stream_splice_finish(Pointer.getPeer(result));
    }

    protected native void g_io_stream_clear_pending(
        @Ptr
        long stream);

    public void clear_pending() {
        this.g_io_stream_clear_pending(Pointer.pointerTo(this, GIOStream.class).getPeer());
    }

    protected native boolean g_io_stream_close(
        @Ptr
        long stream,
        @Ptr
        long cancellable);

    public boolean close(Pointer<GCancellable> cancellable) {
        return this.g_io_stream_close(Pointer.pointerTo(this, GIOStream.class).getPeer(), Pointer.getPeer(cancellable));
    }

    protected native void g_io_stream_close_async(
        @Ptr
        long stream, int io_priority,
        @Ptr
        long cancellable,
        @Ptr
        long callback,
        @Ptr
        long user_data);

    public void close_async(int io_priority, Pointer<GCancellable> cancellable, Pointer callback, Pointer user_data) {
        this.g_io_stream_close_async(Pointer.pointerTo(this, GIOStream.class).getPeer(), io_priority, Pointer.getPeer(cancellable), Pointer.getPeer(callback), Pointer.getPeer(user_data));
    }

    protected native boolean g_io_stream_close_finish(
        @Ptr
        long stream,
        @Ptr
        long result);

    public boolean close_finish(Pointer<Object> result) {
        return this.g_io_stream_close_finish(Pointer.pointerTo(this, GIOStream.class).getPeer(), Pointer.getPeer(result));
    }

    @Ptr
    protected native long g_io_stream_get_input_stream(
        @Ptr
        long stream);

    public Pointer get_input_stream() {
        return Pointer.pointerToAddress(this.g_io_stream_get_input_stream(Pointer.pointerTo(this, GIOStream.class).getPeer()));
    }

    @Ptr
    protected native long g_io_stream_get_output_stream(
        @Ptr
        long stream);

    public Pointer get_output_stream() {
        return Pointer.pointerToAddress(this.g_io_stream_get_output_stream(Pointer.pointerTo(this, GIOStream.class).getPeer()));
    }

    protected native boolean g_io_stream_has_pending(
        @Ptr
        long stream);

    public boolean has_pending() {
        return this.g_io_stream_has_pending(Pointer.pointerTo(this, GIOStream.class).getPeer());
    }

    protected native boolean g_io_stream_is_closed(
        @Ptr
        long stream);

    public boolean is_closed() {
        return this.g_io_stream_is_closed(Pointer.pointerTo(this, GIOStream.class).getPeer());
    }

    protected native boolean g_io_stream_set_pending(
        @Ptr
        long stream);

    public boolean set_pending() {
        return this.g_io_stream_set_pending(Pointer.pointerTo(this, GIOStream.class).getPeer());
    }

    @Field(0)
    public GObject field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GIOStream field_parent_instance(GObject field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    private Pointer field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GIOStream field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

    protected native void g_io_stream_splice_async(
        @Ptr
        long stream1,
        @Ptr
        long stream2, IntValuedEnum<GIOStreamSpliceFlags> flags, int io_priority,
        @Ptr
        long cancellable,
        @Ptr
        long callback,
        @Ptr
        long user_data);

    public void splice_async(Pointer<GIOStream> stream2, IntValuedEnum<GIOStreamSpliceFlags> flags, int io_priority, Pointer<GCancellable> cancellable, Pointer callback, Pointer user_data) {
        this.g_io_stream_splice_async(Pointer.pointerTo(this, GIOStream.class).getPeer(), Pointer.getPeer(stream2), flags, io_priority, Pointer.getPeer(cancellable), Pointer.getPeer(callback), Pointer.getPeer(user_data));
    }

}
