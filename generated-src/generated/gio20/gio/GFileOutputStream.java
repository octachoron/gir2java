
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GFileOutputStream
    extends GOutputStream
{


    static {
        BridJ.register();
    }

    public GFileOutputStream() {
        super();
    }

    public GFileOutputStream(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long g_file_output_stream_get_etag(
        @Ptr
        long stream);

    public Pointer get_etag() {
        return Pointer.pointerToAddress(this.g_file_output_stream_get_etag(Pointer.pointerTo(this, GFileOutputStream.class).getPeer()));
    }

    @Ptr
    protected native long g_file_output_stream_query_info(
        @Ptr
        long stream,
        @Ptr
        long attributes,
        @Ptr
        long cancellable);

    public Pointer<GFileInfo> query_info(Pointer attributes, Pointer<GCancellable> cancellable) {
        return Pointer.pointerToAddress(this.g_file_output_stream_query_info(Pointer.pointerTo(this, GFileOutputStream.class).getPeer(), Pointer.getPeer(attributes), Pointer.getPeer(cancellable)), GFileInfo.class);
    }

    protected native void g_file_output_stream_query_info_async(
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
        this.g_file_output_stream_query_info_async(Pointer.pointerTo(this, GFileOutputStream.class).getPeer(), Pointer.getPeer(attributes), io_priority, Pointer.getPeer(cancellable), Pointer.getPeer(callback), Pointer.getPeer(user_data));
    }

    @Ptr
    protected native long g_file_output_stream_query_info_finish(
        @Ptr
        long stream,
        @Ptr
        long result);

    public Pointer<GFileInfo> query_info_finish(Pointer<Object> result) {
        return Pointer.pointerToAddress(this.g_file_output_stream_query_info_finish(Pointer.pointerTo(this, GFileOutputStream.class).getPeer(), Pointer.getPeer(result)), GFileInfo.class);
    }

    @Field(0)
    public GOutputStream gfileoutputstream_field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GFileOutputStream gfileoutputstream_field_parent_instance(GOutputStream gfileoutputstream_field_parent_instance) {
        this.io.setNativeObjectField(this, 0, gfileoutputstream_field_parent_instance);
        return this;
    }

    @Field(1)
    private Pointer<GFileOutputStreamPrivate> gfileoutputstream_field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GFileOutputStream gfileoutputstream_field_priv(Pointer<GFileOutputStreamPrivate> gfileoutputstream_field_priv) {
        this.io.setPointerField(this, 1, gfileoutputstream_field_priv);
        return this;
    }

}
