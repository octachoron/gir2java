
package generated.gstreamerbase10.gstbase;

import generated.gstreamer10.gst.GstBuffer;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-base-1.0")
public class GstByteWriter
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstByteWriter() {
        super();
    }

    public GstByteWriter(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GstByteReader gstbytewriter_field_parent() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstByteWriter gstbytewriter_field_parent(GstByteReader gstbytewriter_field_parent) {
        this.io.setNativeObjectField(this, 0, gstbytewriter_field_parent);
        return this;
    }

    @Field(1)
    public long gstbytewriter_field_alloc_size() {
        return this.io.getLongField(this, 1);
    }

    @Field(1)
    public GstByteWriter gstbytewriter_field_alloc_size(long gstbytewriter_field_alloc_size) {
        this.io.setLongField(this, 1, gstbytewriter_field_alloc_size);
        return this;
    }

    @Field(2)
    public boolean gstbytewriter_field_fixed() {
        return this.io.getBooleanField(this, 2);
    }

    @Field(2)
    public GstByteWriter gstbytewriter_field_fixed(boolean gstbytewriter_field_fixed) {
        this.io.setBooleanField(this, 2, gstbytewriter_field_fixed);
        return this;
    }

    @Field(3)
    public boolean gstbytewriter_field_owned() {
        return this.io.getBooleanField(this, 3);
    }

    @Field(3)
    public GstByteWriter gstbytewriter_field_owned(boolean gstbytewriter_field_owned) {
        this.io.setBooleanField(this, 3, gstbytewriter_field_owned);
        return this;
    }

    @Field(4)
    private Pointer gstbytewriter_field__gst_reserved() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    private GstByteWriter gstbytewriter_field__gst_reserved(Pointer gstbytewriter_field__gst_reserved) {
        this.io.setPointerField(this, 4, gstbytewriter_field__gst_reserved);
        return this;
    }

    protected native boolean gst_byte_writer_ensure_free_space(
        @Ptr
        long writer, long size);

    public boolean ensure_free_space(long size) {
        return this.gst_byte_writer_ensure_free_space(Pointer.pointerTo(this, GstByteWriter.class).getPeer(), size);
    }

    protected native boolean gst_byte_writer_fill(
        @Ptr
        long writer, short value, long size);

    public boolean fill(short value, long size) {
        return this.gst_byte_writer_fill(Pointer.pointerTo(this, GstByteWriter.class).getPeer(), value, size);
    }

    protected native void gst_byte_writer_free(
        @Ptr
        long writer);

    public void free() {
        this.gst_byte_writer_free(Pointer.pointerTo(this, GstByteWriter.class).getPeer());
    }

    @Ptr
    protected native long gst_byte_writer_free_and_get_buffer(
        @Ptr
        long writer);

    public Pointer<GstBuffer> free_and_get_buffer() {
        return Pointer.pointerToAddress(this.gst_byte_writer_free_and_get_buffer(Pointer.pointerTo(this, GstByteWriter.class).getPeer()), GstBuffer.class);
    }

    @Ptr
    protected native long gst_byte_writer_free_and_get_data(
        @Ptr
        long writer);

    public Pointer<Short> free_and_get_data() {
        return Pointer.pointerToAddress(this.gst_byte_writer_free_and_get_data(Pointer.pointerTo(this, GstByteWriter.class).getPeer()), Short.class);
    }

    protected native long gst_byte_writer_get_remaining(
        @Ptr
        long writer);

    public long get_remaining() {
        return this.gst_byte_writer_get_remaining(Pointer.pointerTo(this, GstByteWriter.class).getPeer());
    }

    protected native void gst_byte_writer_init(
        @Ptr
        long writer);

    public void init() {
        this.gst_byte_writer_init(Pointer.pointerTo(this, GstByteWriter.class).getPeer());
    }

    protected native void gst_byte_writer_init_with_data(
        @Ptr
        long writer,
        @Ptr
        long data, long size, boolean initialized);

    public void init_with_data(Pointer<Short> data, long size, boolean initialized) {
        this.gst_byte_writer_init_with_data(Pointer.pointerTo(this, GstByteWriter.class).getPeer(), Pointer.getPeer(data), size, initialized);
    }

    protected native void gst_byte_writer_init_with_size(
        @Ptr
        long writer, long size, boolean fixed);

    public void init_with_size(long size, boolean fixed) {
        this.gst_byte_writer_init_with_size(Pointer.pointerTo(this, GstByteWriter.class).getPeer(), size, fixed);
    }

    protected native boolean gst_byte_writer_put_buffer(
        @Ptr
        long writer,
        @Ptr
        long buffer, long offset, long size);

    public boolean put_buffer(Pointer<GstBuffer> buffer, long offset, long size) {
        return this.gst_byte_writer_put_buffer(Pointer.pointerTo(this, GstByteWriter.class).getPeer(), Pointer.getPeer(buffer), offset, size);
    }

    protected native boolean gst_byte_writer_put_data(
        @Ptr
        long writer,
        @Ptr
        long data, long size);

    public boolean put_data(Pointer<Short> data, long size) {
        return this.gst_byte_writer_put_data(Pointer.pointerTo(this, GstByteWriter.class).getPeer(), Pointer.getPeer(data), size);
    }

    protected native boolean gst_byte_writer_put_float32_be(
        @Ptr
        long writer, float val);

    public boolean put_float32_be(float val) {
        return this.gst_byte_writer_put_float32_be(Pointer.pointerTo(this, GstByteWriter.class).getPeer(), val);
    }

    protected native boolean gst_byte_writer_put_float32_le(
        @Ptr
        long writer, float val);

    public boolean put_float32_le(float val) {
        return this.gst_byte_writer_put_float32_le(Pointer.pointerTo(this, GstByteWriter.class).getPeer(), val);
    }

    protected native boolean gst_byte_writer_put_float64_be(
        @Ptr
        long writer, double val);

    public boolean put_float64_be(double val) {
        return this.gst_byte_writer_put_float64_be(Pointer.pointerTo(this, GstByteWriter.class).getPeer(), val);
    }

    protected native boolean gst_byte_writer_put_float64_le(
        @Ptr
        long writer, double val);

    public boolean put_float64_le(double val) {
        return this.gst_byte_writer_put_float64_le(Pointer.pointerTo(this, GstByteWriter.class).getPeer(), val);
    }

    protected native boolean gst_byte_writer_put_int16_be(
        @Ptr
        long writer, short val);

    public boolean put_int16_be(short val) {
        return this.gst_byte_writer_put_int16_be(Pointer.pointerTo(this, GstByteWriter.class).getPeer(), val);
    }

    protected native boolean gst_byte_writer_put_int16_le(
        @Ptr
        long writer, short val);

    public boolean put_int16_le(short val) {
        return this.gst_byte_writer_put_int16_le(Pointer.pointerTo(this, GstByteWriter.class).getPeer(), val);
    }

    protected native boolean gst_byte_writer_put_int24_be(
        @Ptr
        long writer, int val);

    public boolean put_int24_be(int val) {
        return this.gst_byte_writer_put_int24_be(Pointer.pointerTo(this, GstByteWriter.class).getPeer(), val);
    }

    protected native boolean gst_byte_writer_put_int24_le(
        @Ptr
        long writer, int val);

    public boolean put_int24_le(int val) {
        return this.gst_byte_writer_put_int24_le(Pointer.pointerTo(this, GstByteWriter.class).getPeer(), val);
    }

    protected native boolean gst_byte_writer_put_int32_be(
        @Ptr
        long writer, int val);

    public boolean put_int32_be(int val) {
        return this.gst_byte_writer_put_int32_be(Pointer.pointerTo(this, GstByteWriter.class).getPeer(), val);
    }

    protected native boolean gst_byte_writer_put_int32_le(
        @Ptr
        long writer, int val);

    public boolean put_int32_le(int val) {
        return this.gst_byte_writer_put_int32_le(Pointer.pointerTo(this, GstByteWriter.class).getPeer(), val);
    }

    protected native boolean gst_byte_writer_put_int64_be(
        @Ptr
        long writer, long val);

    public boolean put_int64_be(long val) {
        return this.gst_byte_writer_put_int64_be(Pointer.pointerTo(this, GstByteWriter.class).getPeer(), val);
    }

    protected native boolean gst_byte_writer_put_int64_le(
        @Ptr
        long writer, long val);

    public boolean put_int64_le(long val) {
        return this.gst_byte_writer_put_int64_le(Pointer.pointerTo(this, GstByteWriter.class).getPeer(), val);
    }

    protected native boolean gst_byte_writer_put_int8(
        @Ptr
        long writer, char val);

    public boolean put_int8(char val) {
        return this.gst_byte_writer_put_int8(Pointer.pointerTo(this, GstByteWriter.class).getPeer(), val);
    }

    protected native boolean gst_byte_writer_put_string_utf16(
        @Ptr
        long writer,
        @Ptr
        long data);

    public boolean put_string_utf16(Pointer<Integer> data) {
        return this.gst_byte_writer_put_string_utf16(Pointer.pointerTo(this, GstByteWriter.class).getPeer(), Pointer.getPeer(data));
    }

    protected native boolean gst_byte_writer_put_string_utf32(
        @Ptr
        long writer,
        @Ptr
        long data);

    public boolean put_string_utf32(Pointer<Long> data) {
        return this.gst_byte_writer_put_string_utf32(Pointer.pointerTo(this, GstByteWriter.class).getPeer(), Pointer.getPeer(data));
    }

    protected native boolean gst_byte_writer_put_string_utf8(
        @Ptr
        long writer,
        @Ptr
        long data);

    public boolean put_string_utf8(Pointer data) {
        return this.gst_byte_writer_put_string_utf8(Pointer.pointerTo(this, GstByteWriter.class).getPeer(), Pointer.getPeer(data));
    }

    protected native boolean gst_byte_writer_put_uint16_be(
        @Ptr
        long writer, int val);

    public boolean put_uint16_be(int val) {
        return this.gst_byte_writer_put_uint16_be(Pointer.pointerTo(this, GstByteWriter.class).getPeer(), val);
    }

    protected native boolean gst_byte_writer_put_uint16_le(
        @Ptr
        long writer, int val);

    public boolean put_uint16_le(int val) {
        return this.gst_byte_writer_put_uint16_le(Pointer.pointerTo(this, GstByteWriter.class).getPeer(), val);
    }

    protected native boolean gst_byte_writer_put_uint24_be(
        @Ptr
        long writer, long val);

    public boolean put_uint24_be(long val) {
        return this.gst_byte_writer_put_uint24_be(Pointer.pointerTo(this, GstByteWriter.class).getPeer(), val);
    }

    protected native boolean gst_byte_writer_put_uint24_le(
        @Ptr
        long writer, long val);

    public boolean put_uint24_le(long val) {
        return this.gst_byte_writer_put_uint24_le(Pointer.pointerTo(this, GstByteWriter.class).getPeer(), val);
    }

    protected native boolean gst_byte_writer_put_uint32_be(
        @Ptr
        long writer, long val);

    public boolean put_uint32_be(long val) {
        return this.gst_byte_writer_put_uint32_be(Pointer.pointerTo(this, GstByteWriter.class).getPeer(), val);
    }

    protected native boolean gst_byte_writer_put_uint32_le(
        @Ptr
        long writer, long val);

    public boolean put_uint32_le(long val) {
        return this.gst_byte_writer_put_uint32_le(Pointer.pointerTo(this, GstByteWriter.class).getPeer(), val);
    }

    protected native boolean gst_byte_writer_put_uint64_be(
        @Ptr
        long writer, long val);

    public boolean put_uint64_be(long val) {
        return this.gst_byte_writer_put_uint64_be(Pointer.pointerTo(this, GstByteWriter.class).getPeer(), val);
    }

    protected native boolean gst_byte_writer_put_uint64_le(
        @Ptr
        long writer, long val);

    public boolean put_uint64_le(long val) {
        return this.gst_byte_writer_put_uint64_le(Pointer.pointerTo(this, GstByteWriter.class).getPeer(), val);
    }

    protected native boolean gst_byte_writer_put_uint8(
        @Ptr
        long writer, short val);

    public boolean put_uint8(short val) {
        return this.gst_byte_writer_put_uint8(Pointer.pointerTo(this, GstByteWriter.class).getPeer(), val);
    }

    protected native void gst_byte_writer_reset(
        @Ptr
        long writer);

    public void reset() {
        this.gst_byte_writer_reset(Pointer.pointerTo(this, GstByteWriter.class).getPeer());
    }

    @Ptr
    protected native long gst_byte_writer_reset_and_get_buffer(
        @Ptr
        long writer);

    public Pointer<GstBuffer> reset_and_get_buffer() {
        return Pointer.pointerToAddress(this.gst_byte_writer_reset_and_get_buffer(Pointer.pointerTo(this, GstByteWriter.class).getPeer()), GstBuffer.class);
    }

    @Ptr
    protected native long gst_byte_writer_reset_and_get_data(
        @Ptr
        long writer);

    public Pointer<Short> reset_and_get_data() {
        return Pointer.pointerToAddress(this.gst_byte_writer_reset_and_get_data(Pointer.pointerTo(this, GstByteWriter.class).getPeer()), Short.class);
    }

    @Ptr
    protected static native long gst_byte_writer_new();

    public static Pointer _new() {
        return Pointer.pointerToAddress(GstByteWriter.gst_byte_writer_new());
    }

    @Ptr
    protected static native long gst_byte_writer_new_with_data(
        @Ptr
        long data, long size, boolean initialized);

    public static Pointer new_with_data(Pointer<Short> data, long size, boolean initialized) {
        return Pointer.pointerToAddress(GstByteWriter.gst_byte_writer_new_with_data(Pointer.getPeer(data), size, initialized));
    }

    @Ptr
    protected static native long gst_byte_writer_new_with_size(long size, boolean fixed);

    public static Pointer new_with_size(long size, boolean fixed) {
        return Pointer.pointerToAddress(GstByteWriter.gst_byte_writer_new_with_size(size, fixed));
    }

}
