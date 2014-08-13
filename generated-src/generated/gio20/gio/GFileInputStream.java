
package generated.gio20.gio;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GFileInputStream
    extends StructObject
{


    public GFileInputStream() {
        super();
    }

    public GFileInputStream(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected native long g_file_input_stream_query_info(
        @Ptr
        long stream,
        @Ptr
        long attributes,
        @Ptr
        long cancellable);

    public Pointer<GFileInfo> query_info(Pointer attributes, Pointer<GCancellable> cancellable) {
        return Pointer.pointerToAddress(this.g_file_input_stream_query_info(Pointer.pointerTo(this, GFileInputStream.class), Pointer.getPeer(attributes), Pointer.getPeer(cancellable)), Pointer.class);
    }

    protected native void g_file_input_stream_query_info_async(
        @Ptr
        long stream,
        @Ptr
        long attributes, int io_priority,
        @Ptr
        long cancellable, Object callback, Pointer user_data);

    public void query_info_async(Pointer attributes, int io_priority, Pointer<GCancellable> cancellable, Object callback, Pointer user_data) {
        this.g_file_input_stream_query_info_async(Pointer.pointerTo(this, GFileInputStream.class), Pointer.getPeer(attributes), io_priority, Pointer.getPeer(cancellable), callback, user_data);
    }

    @Ptr
    protected native long g_file_input_stream_query_info_finish(
        @Ptr
        long stream,
        @Ptr
        long result);

    public Pointer<GFileInfo> query_info_finish(Pointer<Object> result) {
        return Pointer.pointerToAddress(this.g_file_input_stream_query_info_finish(Pointer.pointerTo(this, GFileInputStream.class), Pointer.getPeer(result)), Pointer.class);
    }

    @Field(0)
    public Pointer<GFileInputStreamPrivate> field_priv() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GFileInputStream field_priv(Pointer<GFileInputStreamPrivate> field_priv) {
        this.io.setPointerField(this, 0, field_priv);
        return this;
    }

    @Field(1)
    public GInputStream field_parent_instance() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GFileInputStream field_parent_instance(GInputStream field_parent_instance) {
        this.io.setNativeObjectField(this, 1, field_parent_instance);
        return this;
    }

}
