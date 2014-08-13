
package generated.gio20.gio;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GFileIOStream
    extends StructObject
{


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
        return Pointer.pointerToAddress(this.g_file_io_stream_get_etag(Pointer.pointerTo(this, GFileIOStream.class)));
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
        return Pointer.pointerToAddress(this.g_file_io_stream_query_info(Pointer.pointerTo(this, GFileIOStream.class), Pointer.getPeer(attributes), Pointer.getPeer(cancellable)));
    }

    protected native void g_file_io_stream_query_info_async(
        @Ptr
        long stream,
        @Ptr
        long attributes, int io_priority,
        @Ptr
        long cancellable, Object callback, Pointer user_data);

    public void query_info_async(Pointer attributes, int io_priority, Pointer<GCancellable> cancellable, Object callback, Pointer user_data) {
        this.g_file_io_stream_query_info_async(Pointer.pointerTo(this, GFileIOStream.class), Pointer.getPeer(attributes), io_priority, Pointer.getPeer(cancellable), callback, user_data);
    }

    @Ptr
    protected native long g_file_io_stream_query_info_finish(
        @Ptr
        long stream,
        @Ptr
        long result);

    public Pointer query_info_finish(Pointer<Object> result) {
        return Pointer.pointerToAddress(this.g_file_io_stream_query_info_finish(Pointer.pointerTo(this, GFileIOStream.class), Pointer.getPeer(result)));
    }

    @Field(0)
    public GIOStream field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GFileIOStream field_parent_instance(GIOStream field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer<GFileIOStreamPrivate> field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GFileIOStream field_priv(Pointer<GFileIOStreamPrivate> field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

}
