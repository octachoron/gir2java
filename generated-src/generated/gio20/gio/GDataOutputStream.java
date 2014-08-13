
package generated.gio20.gio;

import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GDataOutputStream
    extends StructObject
{


    public GDataOutputStream() {
        super();
    }

    public GDataOutputStream(Pointer pointer) {
        super(pointer);
    }

    protected native boolean g_data_output_stream_put_byte(
        @Ptr
        long stream, short data,
        @Ptr
        long cancellable);

    public boolean put_byte(short data, Pointer<GCancellable> cancellable) {
        return this.g_data_output_stream_put_byte(Pointer.pointerTo(this, GDataOutputStream.class), data, Pointer.getPeer(cancellable));
    }

    protected native boolean g_data_output_stream_put_int16(
        @Ptr
        long stream, short data,
        @Ptr
        long cancellable);

    public boolean put_int16(short data, Pointer<GCancellable> cancellable) {
        return this.g_data_output_stream_put_int16(Pointer.pointerTo(this, GDataOutputStream.class), data, Pointer.getPeer(cancellable));
    }

    protected native boolean g_data_output_stream_put_int32(
        @Ptr
        long stream, int data,
        @Ptr
        long cancellable);

    public boolean put_int32(int data, Pointer<GCancellable> cancellable) {
        return this.g_data_output_stream_put_int32(Pointer.pointerTo(this, GDataOutputStream.class), data, Pointer.getPeer(cancellable));
    }

    protected native boolean g_data_output_stream_put_int64(
        @Ptr
        long stream, long data,
        @Ptr
        long cancellable);

    public boolean put_int64(long data, Pointer<GCancellable> cancellable) {
        return this.g_data_output_stream_put_int64(Pointer.pointerTo(this, GDataOutputStream.class), data, Pointer.getPeer(cancellable));
    }

    protected native boolean g_data_output_stream_put_string(
        @Ptr
        long stream,
        @Ptr
        long str,
        @Ptr
        long cancellable);

    public boolean put_string(Pointer str, Pointer<GCancellable> cancellable) {
        return this.g_data_output_stream_put_string(Pointer.pointerTo(this, GDataOutputStream.class), Pointer.getPeer(str), Pointer.getPeer(cancellable));
    }

    protected native boolean g_data_output_stream_put_uint16(
        @Ptr
        long stream, int data,
        @Ptr
        long cancellable);

    public boolean put_uint16(int data, Pointer<GCancellable> cancellable) {
        return this.g_data_output_stream_put_uint16(Pointer.pointerTo(this, GDataOutputStream.class), data, Pointer.getPeer(cancellable));
    }

    protected native boolean g_data_output_stream_put_uint32(
        @Ptr
        long stream, long data,
        @Ptr
        long cancellable);

    public boolean put_uint32(long data, Pointer<GCancellable> cancellable) {
        return this.g_data_output_stream_put_uint32(Pointer.pointerTo(this, GDataOutputStream.class), data, Pointer.getPeer(cancellable));
    }

    protected native boolean g_data_output_stream_put_uint64(
        @Ptr
        long stream, long data,
        @Ptr
        long cancellable);

    public boolean put_uint64(long data, Pointer<GCancellable> cancellable) {
        return this.g_data_output_stream_put_uint64(Pointer.pointerTo(this, GDataOutputStream.class), data, Pointer.getPeer(cancellable));
    }

    protected native IntValuedEnum<GDataStreamByteOrder> g_data_output_stream_get_byte_order(
        @Ptr
        long stream);

    public IntValuedEnum<GDataStreamByteOrder> get_byte_order() {
        return this.g_data_output_stream_get_byte_order(Pointer.pointerTo(this, GDataOutputStream.class));
    }

    @Field(0)
    public Pointer<GDataOutputStreamPrivate> field_priv() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GDataOutputStream field_priv(Pointer<GDataOutputStreamPrivate> field_priv) {
        this.io.setPointerField(this, 0, field_priv);
        return this;
    }

    protected native void g_data_output_stream_set_byte_order(
        @Ptr
        long stream, IntValuedEnum<GDataStreamByteOrder> order);

    public void set_byte_order(IntValuedEnum<GDataStreamByteOrder> order) {
        this.g_data_output_stream_set_byte_order(Pointer.pointerTo(this, GDataOutputStream.class), order);
    }

    @Field(1)
    public GFilterOutputStream field_parent_instance() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GDataOutputStream field_parent_instance(GFilterOutputStream field_parent_instance) {
        this.io.setNativeObjectField(this, 1, field_parent_instance);
        return this;
    }

}
