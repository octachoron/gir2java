
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GDataInputStream
    extends GBufferedInputStream
{


    static {
        BridJ.register();
    }

    public GDataInputStream() {
        super();
    }

    public GDataInputStream(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_data_input_stream_new(
        @Ptr
        long base_stream);

    public static Pointer gdatainputstream__new(Pointer base_stream) {
        return Pointer.pointerToAddress(GDataInputStream.g_data_input_stream_new(Pointer.getPeer(base_stream)));
    }

    protected native short g_data_input_stream_read_byte(
        @Ptr
        long stream,
        @Ptr
        long cancellable);

    public short gdatainputstream_read_byte(Pointer<GCancellable> cancellable) {
        return this.g_data_input_stream_read_byte(Pointer.pointerTo(this, GDataInputStream.class).getPeer(), Pointer.getPeer(cancellable));
    }

    protected native short g_data_input_stream_read_int16(
        @Ptr
        long stream,
        @Ptr
        long cancellable);

    public short read_int16(Pointer<GCancellable> cancellable) {
        return this.g_data_input_stream_read_int16(Pointer.pointerTo(this, GDataInputStream.class).getPeer(), Pointer.getPeer(cancellable));
    }

    protected native int g_data_input_stream_read_int32(
        @Ptr
        long stream,
        @Ptr
        long cancellable);

    public int read_int32(Pointer<GCancellable> cancellable) {
        return this.g_data_input_stream_read_int32(Pointer.pointerTo(this, GDataInputStream.class).getPeer(), Pointer.getPeer(cancellable));
    }

    protected native long g_data_input_stream_read_int64(
        @Ptr
        long stream,
        @Ptr
        long cancellable);

    public long read_int64(Pointer<GCancellable> cancellable) {
        return this.g_data_input_stream_read_int64(Pointer.pointerTo(this, GDataInputStream.class).getPeer(), Pointer.getPeer(cancellable));
    }

    @Ptr
    protected native long g_data_input_stream_read_line(
        @Ptr
        long stream,
        @Ptr
        long length,
        @Ptr
        long cancellable);

    public Pointer<Short> read_line(Pointer<Long> length, Pointer<GCancellable> cancellable) {
        return Pointer.pointerToAddress(this.g_data_input_stream_read_line(Pointer.pointerTo(this, GDataInputStream.class).getPeer(), Pointer.getPeer(length), Pointer.getPeer(cancellable)), Short.class);
    }

    protected native void g_data_input_stream_read_line_async(
        @Ptr
        long stream, int io_priority,
        @Ptr
        long cancellable,
        @Ptr
        long callback,
        @Ptr
        long user_data);

    public void read_line_async(int io_priority, Pointer<GCancellable> cancellable, Pointer callback, Pointer user_data) {
        this.g_data_input_stream_read_line_async(Pointer.pointerTo(this, GDataInputStream.class).getPeer(), io_priority, Pointer.getPeer(cancellable), Pointer.getPeer(callback), Pointer.getPeer(user_data));
    }

    @Ptr
    protected native long g_data_input_stream_read_line_finish(
        @Ptr
        long stream,
        @Ptr
        long result,
        @Ptr
        long length);

    public Pointer<Short> read_line_finish(Pointer<Object> result, Pointer<Long> length) {
        return Pointer.pointerToAddress(this.g_data_input_stream_read_line_finish(Pointer.pointerTo(this, GDataInputStream.class).getPeer(), Pointer.getPeer(result), Pointer.getPeer(length)), Short.class);
    }

    @Ptr
    protected native long g_data_input_stream_read_line_finish_utf8(
        @Ptr
        long stream,
        @Ptr
        long result,
        @Ptr
        long length);

    public Pointer read_line_finish_utf8(Pointer<Object> result, Pointer<Long> length) {
        return Pointer.pointerToAddress(this.g_data_input_stream_read_line_finish_utf8(Pointer.pointerTo(this, GDataInputStream.class).getPeer(), Pointer.getPeer(result), Pointer.getPeer(length)));
    }

    @Ptr
    protected native long g_data_input_stream_read_line_utf8(
        @Ptr
        long stream,
        @Ptr
        long length,
        @Ptr
        long cancellable);

    public Pointer read_line_utf8(Pointer<Long> length, Pointer<GCancellable> cancellable) {
        return Pointer.pointerToAddress(this.g_data_input_stream_read_line_utf8(Pointer.pointerTo(this, GDataInputStream.class).getPeer(), Pointer.getPeer(length), Pointer.getPeer(cancellable)));
    }

    protected native int g_data_input_stream_read_uint16(
        @Ptr
        long stream,
        @Ptr
        long cancellable);

    public int read_uint16(Pointer<GCancellable> cancellable) {
        return this.g_data_input_stream_read_uint16(Pointer.pointerTo(this, GDataInputStream.class).getPeer(), Pointer.getPeer(cancellable));
    }

    protected native long g_data_input_stream_read_uint32(
        @Ptr
        long stream,
        @Ptr
        long cancellable);

    public long read_uint32(Pointer<GCancellable> cancellable) {
        return this.g_data_input_stream_read_uint32(Pointer.pointerTo(this, GDataInputStream.class).getPeer(), Pointer.getPeer(cancellable));
    }

    protected native long g_data_input_stream_read_uint64(
        @Ptr
        long stream,
        @Ptr
        long cancellable);

    public long read_uint64(Pointer<GCancellable> cancellable) {
        return this.g_data_input_stream_read_uint64(Pointer.pointerTo(this, GDataInputStream.class).getPeer(), Pointer.getPeer(cancellable));
    }

    @Ptr
    protected native long g_data_input_stream_read_until(
        @Ptr
        long stream,
        @Ptr
        long stop_chars,
        @Ptr
        long length,
        @Ptr
        long cancellable);

    public Pointer read_until(Pointer stop_chars, Pointer<Long> length, Pointer<GCancellable> cancellable) {
        return Pointer.pointerToAddress(this.g_data_input_stream_read_until(Pointer.pointerTo(this, GDataInputStream.class).getPeer(), Pointer.getPeer(stop_chars), Pointer.getPeer(length), Pointer.getPeer(cancellable)));
    }

    protected native void g_data_input_stream_read_until_async(
        @Ptr
        long stream,
        @Ptr
        long stop_chars, int io_priority,
        @Ptr
        long cancellable,
        @Ptr
        long callback,
        @Ptr
        long user_data);

    public void read_until_async(Pointer stop_chars, int io_priority, Pointer<GCancellable> cancellable, Pointer callback, Pointer user_data) {
        this.g_data_input_stream_read_until_async(Pointer.pointerTo(this, GDataInputStream.class).getPeer(), Pointer.getPeer(stop_chars), io_priority, Pointer.getPeer(cancellable), Pointer.getPeer(callback), Pointer.getPeer(user_data));
    }

    @Ptr
    protected native long g_data_input_stream_read_until_finish(
        @Ptr
        long stream,
        @Ptr
        long result,
        @Ptr
        long length);

    public Pointer read_until_finish(Pointer<Object> result, Pointer<Long> length) {
        return Pointer.pointerToAddress(this.g_data_input_stream_read_until_finish(Pointer.pointerTo(this, GDataInputStream.class).getPeer(), Pointer.getPeer(result), Pointer.getPeer(length)));
    }

    @Ptr
    protected native long g_data_input_stream_read_upto(
        @Ptr
        long stream,
        @Ptr
        long stop_chars, long stop_chars_len,
        @Ptr
        long length,
        @Ptr
        long cancellable);

    public Pointer read_upto(Pointer stop_chars, long stop_chars_len, Pointer<Long> length, Pointer<GCancellable> cancellable) {
        return Pointer.pointerToAddress(this.g_data_input_stream_read_upto(Pointer.pointerTo(this, GDataInputStream.class).getPeer(), Pointer.getPeer(stop_chars), stop_chars_len, Pointer.getPeer(length), Pointer.getPeer(cancellable)));
    }

    protected native void g_data_input_stream_read_upto_async(
        @Ptr
        long stream,
        @Ptr
        long stop_chars, long stop_chars_len, int io_priority,
        @Ptr
        long cancellable,
        @Ptr
        long callback,
        @Ptr
        long user_data);

    public void read_upto_async(Pointer stop_chars, long stop_chars_len, int io_priority, Pointer<GCancellable> cancellable, Pointer callback, Pointer user_data) {
        this.g_data_input_stream_read_upto_async(Pointer.pointerTo(this, GDataInputStream.class).getPeer(), Pointer.getPeer(stop_chars), stop_chars_len, io_priority, Pointer.getPeer(cancellable), Pointer.getPeer(callback), Pointer.getPeer(user_data));
    }

    @Ptr
    protected native long g_data_input_stream_read_upto_finish(
        @Ptr
        long stream,
        @Ptr
        long result,
        @Ptr
        long length);

    public Pointer read_upto_finish(Pointer<Object> result, Pointer<Long> length) {
        return Pointer.pointerToAddress(this.g_data_input_stream_read_upto_finish(Pointer.pointerTo(this, GDataInputStream.class).getPeer(), Pointer.getPeer(result), Pointer.getPeer(length)));
    }

    @Field(0)
    public GBufferedInputStream gdatainputstream_field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GDataInputStream gdatainputstream_field_parent_instance(GBufferedInputStream gdatainputstream_field_parent_instance) {
        this.io.setNativeObjectField(this, 0, gdatainputstream_field_parent_instance);
        return this;
    }

    @Field(1)
    private Pointer gdatainputstream_field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GDataInputStream gdatainputstream_field_priv(Pointer gdatainputstream_field_priv) {
        this.io.setPointerField(this, 1, gdatainputstream_field_priv);
        return this;
    }

    protected native void g_data_input_stream_set_byte_order(
        @Ptr
        long stream, IntValuedEnum<GDataStreamByteOrder> order);

    public void set_byte_order(IntValuedEnum<GDataStreamByteOrder> order) {
        this.g_data_input_stream_set_byte_order(Pointer.pointerTo(this, GDataInputStream.class).getPeer(), order);
    }

    protected native void g_data_input_stream_set_newline_type(
        @Ptr
        long stream, IntValuedEnum<GDataStreamNewlineType> type);

    public void set_newline_type(IntValuedEnum<GDataStreamNewlineType> type) {
        this.g_data_input_stream_set_newline_type(Pointer.pointerTo(this, GDataInputStream.class).getPeer(), type);
    }

    protected native IntValuedEnum<GDataStreamNewlineType> g_data_input_stream_get_newline_type(
        @Ptr
        long stream);

    public IntValuedEnum<GDataStreamNewlineType> get_newline_type() {
        return this.g_data_input_stream_get_newline_type(Pointer.pointerTo(this, GDataInputStream.class).getPeer());
    }

    protected native IntValuedEnum<GDataStreamByteOrder> g_data_input_stream_get_byte_order(
        @Ptr
        long stream);

    public IntValuedEnum<GDataStreamByteOrder> get_byte_order() {
        return this.g_data_input_stream_get_byte_order(Pointer.pointerTo(this, GDataInputStream.class).getPeer());
    }

}
