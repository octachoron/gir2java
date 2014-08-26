
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GFileIOStream
    extends GIOStream
{


    static {
        BridJ.register();
    }

    public GFileIOStream() {
        super();
    }

    public GFileIOStream(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long g_file_io_stream_get_etag(
        @Ptr
        long stream);

    public Pointer get_etag() {
        return Pointer.pointerToAddress(this.g_file_io_stream_get_etag(Pointer.pointerTo(this, GFileIOStream.class).getPeer()));
    }

    @Ptr
    protected native long g_file_io_stream_query_info(
        @Ptr
        long stream,
        @Ptr
        long attributes,
        @Ptr
        long cancellable);

    public Pointer query_info(Pointer attributes, Pointer<GCancellable> cancellable) {
        return Pointer.pointerToAddress(this.g_file_io_stream_query_info(Pointer.pointerTo(this, GFileIOStream.class).getPeer(), Pointer.getPeer(attributes), Pointer.getPeer(cancellable)));
    }

    protected native void g_file_io_stream_query_info_async(
        @Ptr
        long stream,
        @Ptr
        long attributes, int io_priority,
        @Ptr
        long cancellable,
        @Ptr
        long callback,
        @Ptr
        long user_data);

    public void query_info_async(Pointer attributes, int io_priority, Pointer<GCancellable> cancellable, Pointer callback, Pointer user_data) {
        this.g_file_io_stream_query_info_async(Pointer.pointerTo(this, GFileIOStream.class).getPeer(), Pointer.getPeer(attributes), io_priority, Pointer.getPeer(cancellable), Pointer.getPeer(callback), Pointer.getPeer(user_data));
    }

    @Ptr
    protected native long g_file_io_stream_query_info_finish(
        @Ptr
        long stream,
        @Ptr
        long result);

    public Pointer query_info_finish(Pointer<Object> result) {
        return Pointer.pointerToAddress(this.g_file_io_stream_query_info_finish(Pointer.pointerTo(this, GFileIOStream.class).getPeer(), Pointer.getPeer(result)));
    }

    @Field(0)
    private Pointer<GFileIOStreamPrivate> gfileiostream_field_priv() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    private GFileIOStream gfileiostream_field_priv(Pointer<GFileIOStreamPrivate> gfileiostream_field_priv) {
        this.io.setPointerField(this, 0, gfileiostream_field_priv);
        return this;
    }

    @Field(1)
    public GIOStream gfileiostream_field_parent_instance() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GFileIOStream gfileiostream_field_parent_instance(GIOStream gfileiostream_field_parent_instance) {
        this.io.setNativeObjectField(this, 1, gfileiostream_field_parent_instance);
        return this;
    }

}
