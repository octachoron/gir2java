
package generated.gstreamerbase10.gstbase;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-base-1.0")
public class GstByteReader
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstByteReader() {
        super();
    }

    public GstByteReader(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer<Short> field_data() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GstByteReader field_data(Pointer<Short> field_data) {
        this.io.setPointerField(this, 0, field_data);
        return this;
    }

    @Field(1)
    public long field_size() {
        return this.io.getLongField(this, 1);
    }

    @Field(1)
    public GstByteReader field_size(long field_size) {
        this.io.setLongField(this, 1, field_size);
        return this;
    }

    @Field(2)
    public long field_byte() {
        return this.io.getLongField(this, 2);
    }

    @Field(2)
    public GstByteReader field_byte(long field_byte) {
        this.io.setLongField(this, 2, field_byte);
        return this;
    }

    @Field(3)
    private Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    private GstByteReader field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 3, field__gst_reserved);
        return this;
    }

    protected native boolean gst_byte_reader_dup_data(
        @Ptr
        long reader, long size,
        @Ptr
        long val);

    public boolean dup_data(long size, Pointer<Pointer<Short>> val) {
        return this.gst_byte_reader_dup_data(Pointer.pointerTo(this, GstByteReader.class).getPeer(), size, Pointer.getPeer(val));
    }

    protected native boolean gst_byte_reader_dup_string_utf16(
        @Ptr
        long reader,
        @Ptr
        long str);

    public boolean dup_string_utf16(Pointer<Pointer<Integer>> str) {
        return this.gst_byte_reader_dup_string_utf16(Pointer.pointerTo(this, GstByteReader.class).getPeer(), Pointer.getPeer(str));
    }

    protected native boolean gst_byte_reader_dup_string_utf32(
        @Ptr
        long reader,
        @Ptr
        long str);

    public boolean dup_string_utf32(Pointer<Pointer<Long>> str) {
        return this.gst_byte_reader_dup_string_utf32(Pointer.pointerTo(this, GstByteReader.class).getPeer(), Pointer.getPeer(str));
    }

    protected native boolean gst_byte_reader_dup_string_utf8(
        @Ptr
        long reader,
        @Ptr
        long str);

    public boolean dup_string_utf8(Pointer str) {
        return this.gst_byte_reader_dup_string_utf8(Pointer.pointerTo(this, GstByteReader.class).getPeer(), Pointer.getPeer(str));
    }

    protected native void gst_byte_reader_free(
        @Ptr
        long reader);

    public void free() {
        this.gst_byte_reader_free(Pointer.pointerTo(this, GstByteReader.class).getPeer());
    }

    protected native boolean gst_byte_reader_get_data(
        @Ptr
        long reader, long size,
        @Ptr
        long val);

    public boolean get_data(long size, Pointer<Pointer<Short>> val) {
        return this.gst_byte_reader_get_data(Pointer.pointerTo(this, GstByteReader.class).getPeer(), size, Pointer.getPeer(val));
    }

    protected native boolean gst_byte_reader_get_float32_be(
        @Ptr
        long reader,
        @Ptr
        long val);

    public boolean get_float32_be(Pointer<Float> val) {
        return this.gst_byte_reader_get_float32_be(Pointer.pointerTo(this, GstByteReader.class).getPeer(), Pointer.getPeer(val));
    }

    protected native boolean gst_byte_reader_get_float32_le(
        @Ptr
        long reader,
        @Ptr
        long val);

    public boolean get_float32_le(Pointer<Float> val) {
        return this.gst_byte_reader_get_float32_le(Pointer.pointerTo(this, GstByteReader.class).getPeer(), Pointer.getPeer(val));
    }

    protected native boolean gst_byte_reader_get_float64_be(
        @Ptr
        long reader,
        @Ptr
        long val);

    public boolean get_float64_be(Pointer<Double> val) {
        return this.gst_byte_reader_get_float64_be(Pointer.pointerTo(this, GstByteReader.class).getPeer(), Pointer.getPeer(val));
    }

    protected native boolean gst_byte_reader_get_float64_le(
        @Ptr
        long reader,
        @Ptr
        long val);

    public boolean get_float64_le(Pointer<Double> val) {
        return this.gst_byte_reader_get_float64_le(Pointer.pointerTo(this, GstByteReader.class).getPeer(), Pointer.getPeer(val));
    }

    protected native boolean gst_byte_reader_get_int16_be(
        @Ptr
        long reader,
        @Ptr
        long val);

    public boolean get_int16_be(Pointer<Short> val) {
        return this.gst_byte_reader_get_int16_be(Pointer.pointerTo(this, GstByteReader.class).getPeer(), Pointer.getPeer(val));
    }

    protected native boolean gst_byte_reader_get_int16_le(
        @Ptr
        long reader,
        @Ptr
        long val);

    public boolean get_int16_le(Pointer<Short> val) {
        return this.gst_byte_reader_get_int16_le(Pointer.pointerTo(this, GstByteReader.class).getPeer(), Pointer.getPeer(val));
    }

    protected native boolean gst_byte_reader_get_int24_be(
        @Ptr
        long reader,
        @Ptr
        long val);

    public boolean get_int24_be(Pointer<Integer> val) {
        return this.gst_byte_reader_get_int24_be(Pointer.pointerTo(this, GstByteReader.class).getPeer(), Pointer.getPeer(val));
    }

    protected native boolean gst_byte_reader_get_int24_le(
        @Ptr
        long reader,
        @Ptr
        long val);

    public boolean get_int24_le(Pointer<Integer> val) {
        return this.gst_byte_reader_get_int24_le(Pointer.pointerTo(this, GstByteReader.class).getPeer(), Pointer.getPeer(val));
    }

    protected native boolean gst_byte_reader_get_int32_be(
        @Ptr
        long reader,
        @Ptr
        long val);

    public boolean get_int32_be(Pointer<Integer> val) {
        return this.gst_byte_reader_get_int32_be(Pointer.pointerTo(this, GstByteReader.class).getPeer(), Pointer.getPeer(val));
    }

    protected native boolean gst_byte_reader_get_int32_le(
        @Ptr
        long reader,
        @Ptr
        long val);

    public boolean get_int32_le(Pointer<Integer> val) {
        return this.gst_byte_reader_get_int32_le(Pointer.pointerTo(this, GstByteReader.class).getPeer(), Pointer.getPeer(val));
    }

    protected native boolean gst_byte_reader_get_int64_be(
        @Ptr
        long reader,
        @Ptr
        long val);

    public boolean get_int64_be(Pointer<Long> val) {
        return this.gst_byte_reader_get_int64_be(Pointer.pointerTo(this, GstByteReader.class).getPeer(), Pointer.getPeer(val));
    }

    protected native boolean gst_byte_reader_get_int64_le(
        @Ptr
        long reader,
        @Ptr
        long val);

    public boolean get_int64_le(Pointer<Long> val) {
        return this.gst_byte_reader_get_int64_le(Pointer.pointerTo(this, GstByteReader.class).getPeer(), Pointer.getPeer(val));
    }

    protected native boolean gst_byte_reader_get_int8(
        @Ptr
        long reader,
        @Ptr
        long val);

    public boolean get_int8(Pointer<Character> val) {
        return this.gst_byte_reader_get_int8(Pointer.pointerTo(this, GstByteReader.class).getPeer(), Pointer.getPeer(val));
    }

    protected native long gst_byte_reader_get_pos(
        @Ptr
        long reader);

    public long get_pos() {
        return this.gst_byte_reader_get_pos(Pointer.pointerTo(this, GstByteReader.class).getPeer());
    }

    protected native long gst_byte_reader_get_remaining(
        @Ptr
        long reader);

    public long get_remaining() {
        return this.gst_byte_reader_get_remaining(Pointer.pointerTo(this, GstByteReader.class).getPeer());
    }

    protected native long gst_byte_reader_get_size(
        @Ptr
        long reader);

    public long get_size() {
        return this.gst_byte_reader_get_size(Pointer.pointerTo(this, GstByteReader.class).getPeer());
    }

    protected native boolean gst_byte_reader_get_string_utf8(
        @Ptr
        long reader,
        @Ptr
        long str);

    public boolean get_string_utf8(Pointer str) {
        return this.gst_byte_reader_get_string_utf8(Pointer.pointerTo(this, GstByteReader.class).getPeer(), Pointer.getPeer(str));
    }

    protected native boolean gst_byte_reader_get_uint16_be(
        @Ptr
        long reader,
        @Ptr
        long val);

    public boolean get_uint16_be(Pointer<Integer> val) {
        return this.gst_byte_reader_get_uint16_be(Pointer.pointerTo(this, GstByteReader.class).getPeer(), Pointer.getPeer(val));
    }

    protected native boolean gst_byte_reader_get_uint16_le(
        @Ptr
        long reader,
        @Ptr
        long val);

    public boolean get_uint16_le(Pointer<Integer> val) {
        return this.gst_byte_reader_get_uint16_le(Pointer.pointerTo(this, GstByteReader.class).getPeer(), Pointer.getPeer(val));
    }

    protected native boolean gst_byte_reader_get_uint24_be(
        @Ptr
        long reader,
        @Ptr
        long val);

    public boolean get_uint24_be(Pointer<Long> val) {
        return this.gst_byte_reader_get_uint24_be(Pointer.pointerTo(this, GstByteReader.class).getPeer(), Pointer.getPeer(val));
    }

    protected native boolean gst_byte_reader_get_uint24_le(
        @Ptr
        long reader,
        @Ptr
        long val);

    public boolean get_uint24_le(Pointer<Long> val) {
        return this.gst_byte_reader_get_uint24_le(Pointer.pointerTo(this, GstByteReader.class).getPeer(), Pointer.getPeer(val));
    }

    protected native boolean gst_byte_reader_get_uint32_be(
        @Ptr
        long reader,
        @Ptr
        long val);

    public boolean get_uint32_be(Pointer<Long> val) {
        return this.gst_byte_reader_get_uint32_be(Pointer.pointerTo(this, GstByteReader.class).getPeer(), Pointer.getPeer(val));
    }

    protected native boolean gst_byte_reader_get_uint32_le(
        @Ptr
        long reader,
        @Ptr
        long val);

    public boolean get_uint32_le(Pointer<Long> val) {
        return this.gst_byte_reader_get_uint32_le(Pointer.pointerTo(this, GstByteReader.class).getPeer(), Pointer.getPeer(val));
    }

    protected native boolean gst_byte_reader_get_uint64_be(
        @Ptr
        long reader,
        @Ptr
        long val);

    public boolean get_uint64_be(Pointer<Long> val) {
        return this.gst_byte_reader_get_uint64_be(Pointer.pointerTo(this, GstByteReader.class).getPeer(), Pointer.getPeer(val));
    }

    protected native boolean gst_byte_reader_get_uint64_le(
        @Ptr
        long reader,
        @Ptr
        long val);

    public boolean get_uint64_le(Pointer<Long> val) {
        return this.gst_byte_reader_get_uint64_le(Pointer.pointerTo(this, GstByteReader.class).getPeer(), Pointer.getPeer(val));
    }

    protected native boolean gst_byte_reader_get_uint8(
        @Ptr
        long reader,
        @Ptr
        long val);

    public boolean get_uint8(Pointer<Short> val) {
        return this.gst_byte_reader_get_uint8(Pointer.pointerTo(this, GstByteReader.class).getPeer(), Pointer.getPeer(val));
    }

    protected native void gst_byte_reader_init(
        @Ptr
        long reader,
        @Ptr
        long data, long size);

    public void init(Pointer<Short> data, long size) {
        this.gst_byte_reader_init(Pointer.pointerTo(this, GstByteReader.class).getPeer(), Pointer.getPeer(data), size);
    }

    protected native long gst_byte_reader_masked_scan_uint32(
        @Ptr
        long reader, long mask, long pattern, long offset, long size);

    public long masked_scan_uint32(long mask, long pattern, long offset, long size) {
        return this.gst_byte_reader_masked_scan_uint32(Pointer.pointerTo(this, GstByteReader.class).getPeer(), mask, pattern, offset, size);
    }

    protected native boolean gst_byte_reader_peek_data(
        @Ptr
        long reader, long size,
        @Ptr
        long val);

    public boolean peek_data(long size, Pointer<Pointer<Short>> val) {
        return this.gst_byte_reader_peek_data(Pointer.pointerTo(this, GstByteReader.class).getPeer(), size, Pointer.getPeer(val));
    }

    protected native boolean gst_byte_reader_peek_float32_be(
        @Ptr
        long reader,
        @Ptr
        long val);

    public boolean peek_float32_be(Pointer<Float> val) {
        return this.gst_byte_reader_peek_float32_be(Pointer.pointerTo(this, GstByteReader.class).getPeer(), Pointer.getPeer(val));
    }

    protected native boolean gst_byte_reader_peek_float32_le(
        @Ptr
        long reader,
        @Ptr
        long val);

    public boolean peek_float32_le(Pointer<Float> val) {
        return this.gst_byte_reader_peek_float32_le(Pointer.pointerTo(this, GstByteReader.class).getPeer(), Pointer.getPeer(val));
    }

    protected native boolean gst_byte_reader_peek_float64_be(
        @Ptr
        long reader,
        @Ptr
        long val);

    public boolean peek_float64_be(Pointer<Double> val) {
        return this.gst_byte_reader_peek_float64_be(Pointer.pointerTo(this, GstByteReader.class).getPeer(), Pointer.getPeer(val));
    }

    protected native boolean gst_byte_reader_peek_float64_le(
        @Ptr
        long reader,
        @Ptr
        long val);

    public boolean peek_float64_le(Pointer<Double> val) {
        return this.gst_byte_reader_peek_float64_le(Pointer.pointerTo(this, GstByteReader.class).getPeer(), Pointer.getPeer(val));
    }

    protected native boolean gst_byte_reader_peek_int16_be(
        @Ptr
        long reader,
        @Ptr
        long val);

    public boolean peek_int16_be(Pointer<Short> val) {
        return this.gst_byte_reader_peek_int16_be(Pointer.pointerTo(this, GstByteReader.class).getPeer(), Pointer.getPeer(val));
    }

    protected native boolean gst_byte_reader_peek_int16_le(
        @Ptr
        long reader,
        @Ptr
        long val);

    public boolean peek_int16_le(Pointer<Short> val) {
        return this.gst_byte_reader_peek_int16_le(Pointer.pointerTo(this, GstByteReader.class).getPeer(), Pointer.getPeer(val));
    }

    protected native boolean gst_byte_reader_peek_int24_be(
        @Ptr
        long reader,
        @Ptr
        long val);

    public boolean peek_int24_be(Pointer<Integer> val) {
        return this.gst_byte_reader_peek_int24_be(Pointer.pointerTo(this, GstByteReader.class).getPeer(), Pointer.getPeer(val));
    }

    protected native boolean gst_byte_reader_peek_int24_le(
        @Ptr
        long reader,
        @Ptr
        long val);

    public boolean peek_int24_le(Pointer<Integer> val) {
        return this.gst_byte_reader_peek_int24_le(Pointer.pointerTo(this, GstByteReader.class).getPeer(), Pointer.getPeer(val));
    }

    protected native boolean gst_byte_reader_peek_int32_be(
        @Ptr
        long reader,
        @Ptr
        long val);

    public boolean peek_int32_be(Pointer<Integer> val) {
        return this.gst_byte_reader_peek_int32_be(Pointer.pointerTo(this, GstByteReader.class).getPeer(), Pointer.getPeer(val));
    }

    protected native boolean gst_byte_reader_peek_int32_le(
        @Ptr
        long reader,
        @Ptr
        long val);

    public boolean peek_int32_le(Pointer<Integer> val) {
        return this.gst_byte_reader_peek_int32_le(Pointer.pointerTo(this, GstByteReader.class).getPeer(), Pointer.getPeer(val));
    }

    protected native boolean gst_byte_reader_peek_int64_be(
        @Ptr
        long reader,
        @Ptr
        long val);

    public boolean peek_int64_be(Pointer<Long> val) {
        return this.gst_byte_reader_peek_int64_be(Pointer.pointerTo(this, GstByteReader.class).getPeer(), Pointer.getPeer(val));
    }

    protected native boolean gst_byte_reader_peek_int64_le(
        @Ptr
        long reader,
        @Ptr
        long val);

    public boolean peek_int64_le(Pointer<Long> val) {
        return this.gst_byte_reader_peek_int64_le(Pointer.pointerTo(this, GstByteReader.class).getPeer(), Pointer.getPeer(val));
    }

    protected native boolean gst_byte_reader_peek_int8(
        @Ptr
        long reader,
        @Ptr
        long val);

    public boolean peek_int8(Pointer<Character> val) {
        return this.gst_byte_reader_peek_int8(Pointer.pointerTo(this, GstByteReader.class).getPeer(), Pointer.getPeer(val));
    }

    protected native boolean gst_byte_reader_peek_string_utf8(
        @Ptr
        long reader,
        @Ptr
        long str);

    public boolean peek_string_utf8(Pointer str) {
        return this.gst_byte_reader_peek_string_utf8(Pointer.pointerTo(this, GstByteReader.class).getPeer(), Pointer.getPeer(str));
    }

    protected native boolean gst_byte_reader_peek_uint16_be(
        @Ptr
        long reader,
        @Ptr
        long val);

    public boolean peek_uint16_be(Pointer<Integer> val) {
        return this.gst_byte_reader_peek_uint16_be(Pointer.pointerTo(this, GstByteReader.class).getPeer(), Pointer.getPeer(val));
    }

    protected native boolean gst_byte_reader_peek_uint16_le(
        @Ptr
        long reader,
        @Ptr
        long val);

    public boolean peek_uint16_le(Pointer<Integer> val) {
        return this.gst_byte_reader_peek_uint16_le(Pointer.pointerTo(this, GstByteReader.class).getPeer(), Pointer.getPeer(val));
    }

    protected native boolean gst_byte_reader_peek_uint24_be(
        @Ptr
        long reader,
        @Ptr
        long val);

    public boolean peek_uint24_be(Pointer<Long> val) {
        return this.gst_byte_reader_peek_uint24_be(Pointer.pointerTo(this, GstByteReader.class).getPeer(), Pointer.getPeer(val));
    }

    protected native boolean gst_byte_reader_peek_uint24_le(
        @Ptr
        long reader,
        @Ptr
        long val);

    public boolean peek_uint24_le(Pointer<Long> val) {
        return this.gst_byte_reader_peek_uint24_le(Pointer.pointerTo(this, GstByteReader.class).getPeer(), Pointer.getPeer(val));
    }

    protected native boolean gst_byte_reader_peek_uint32_be(
        @Ptr
        long reader,
        @Ptr
        long val);

    public boolean peek_uint32_be(Pointer<Long> val) {
        return this.gst_byte_reader_peek_uint32_be(Pointer.pointerTo(this, GstByteReader.class).getPeer(), Pointer.getPeer(val));
    }

    protected native boolean gst_byte_reader_peek_uint32_le(
        @Ptr
        long reader,
        @Ptr
        long val);

    public boolean peek_uint32_le(Pointer<Long> val) {
        return this.gst_byte_reader_peek_uint32_le(Pointer.pointerTo(this, GstByteReader.class).getPeer(), Pointer.getPeer(val));
    }

    protected native boolean gst_byte_reader_peek_uint64_be(
        @Ptr
        long reader,
        @Ptr
        long val);

    public boolean peek_uint64_be(Pointer<Long> val) {
        return this.gst_byte_reader_peek_uint64_be(Pointer.pointerTo(this, GstByteReader.class).getPeer(), Pointer.getPeer(val));
    }

    protected native boolean gst_byte_reader_peek_uint64_le(
        @Ptr
        long reader,
        @Ptr
        long val);

    public boolean peek_uint64_le(Pointer<Long> val) {
        return this.gst_byte_reader_peek_uint64_le(Pointer.pointerTo(this, GstByteReader.class).getPeer(), Pointer.getPeer(val));
    }

    protected native boolean gst_byte_reader_peek_uint8(
        @Ptr
        long reader,
        @Ptr
        long val);

    public boolean peek_uint8(Pointer<Short> val) {
        return this.gst_byte_reader_peek_uint8(Pointer.pointerTo(this, GstByteReader.class).getPeer(), Pointer.getPeer(val));
    }

    protected native boolean gst_byte_reader_set_pos(
        @Ptr
        long reader, long pos);

    public boolean set_pos(long pos) {
        return this.gst_byte_reader_set_pos(Pointer.pointerTo(this, GstByteReader.class).getPeer(), pos);
    }

    protected native boolean gst_byte_reader_skip(
        @Ptr
        long reader, long nbytes);

    public boolean skip(long nbytes) {
        return this.gst_byte_reader_skip(Pointer.pointerTo(this, GstByteReader.class).getPeer(), nbytes);
    }

    protected native boolean gst_byte_reader_skip_string_utf16(
        @Ptr
        long reader);

    public boolean skip_string_utf16() {
        return this.gst_byte_reader_skip_string_utf16(Pointer.pointerTo(this, GstByteReader.class).getPeer());
    }

    protected native boolean gst_byte_reader_skip_string_utf32(
        @Ptr
        long reader);

    public boolean skip_string_utf32() {
        return this.gst_byte_reader_skip_string_utf32(Pointer.pointerTo(this, GstByteReader.class).getPeer());
    }

    protected native boolean gst_byte_reader_skip_string_utf8(
        @Ptr
        long reader);

    public boolean skip_string_utf8() {
        return this.gst_byte_reader_skip_string_utf8(Pointer.pointerTo(this, GstByteReader.class).getPeer());
    }

    @Ptr
    protected static native long gst_byte_reader_new(
        @Ptr
        long data, long size);

    public static Pointer _new(Pointer<Short> data, long size) {
        return Pointer.pointerToAddress(GstByteReader.gst_byte_reader_new(Pointer.getPeer(data), size));
    }

}
