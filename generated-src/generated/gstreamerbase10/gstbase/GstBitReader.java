
package generated.gstreamerbase10.gstbase;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-base-1.0")
public class GstBitReader
    extends StructObject
{


    public GstBitReader() {
        super();
    }

    public GstBitReader(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public short field_data() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GstBitReader field_data(short field_data) {
        this.io.setPointerField(this, 0, field_data);
        return this;
    }

    @Field(1)
    public long field_size() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GstBitReader field_size(long field_size) {
        this.io.setNativeObjectField(this, 1, field_size);
        return this;
    }

    @Field(2)
    public long field_byte() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GstBitReader field_byte(long field_byte) {
        this.io.setNativeObjectField(this, 2, field_byte);
        return this;
    }

    @Field(3)
    public long field_bit() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GstBitReader field_bit(long field_bit) {
        this.io.setNativeObjectField(this, 3, field_bit);
        return this;
    }

    @Field(4)
    public Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public GstBitReader field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 4, field__gst_reserved);
        return this;
    }

    protected native void gst_bit_reader_free(
        @Ptr
        long reader);

    public void free() {
        this.gst_bit_reader_free(Pointer.pointerTo(this, GstBitReader.class));
    }

    protected native boolean gst_bit_reader_get_bits_uint16(
        @Ptr
        long reader,
        @Ptr
        long val, long nbits);

    public boolean get_bits_uint16(Pointer<Integer> val, long nbits) {
        return this.gst_bit_reader_get_bits_uint16(Pointer.pointerTo(this, GstBitReader.class), Pointer.getPeer(val), nbits);
    }

    protected native boolean gst_bit_reader_get_bits_uint32(
        @Ptr
        long reader,
        @Ptr
        long val, long nbits);

    public boolean get_bits_uint32(Pointer<Long> val, long nbits) {
        return this.gst_bit_reader_get_bits_uint32(Pointer.pointerTo(this, GstBitReader.class), Pointer.getPeer(val), nbits);
    }

    protected native boolean gst_bit_reader_get_bits_uint64(
        @Ptr
        long reader,
        @Ptr
        long val, long nbits);

    public boolean get_bits_uint64(Pointer<Long> val, long nbits) {
        return this.gst_bit_reader_get_bits_uint64(Pointer.pointerTo(this, GstBitReader.class), Pointer.getPeer(val), nbits);
    }

    protected native boolean gst_bit_reader_get_bits_uint8(
        @Ptr
        long reader,
        @Ptr
        long val, long nbits);

    public boolean get_bits_uint8(Pointer<Short> val, long nbits) {
        return this.gst_bit_reader_get_bits_uint8(Pointer.pointerTo(this, GstBitReader.class), Pointer.getPeer(val), nbits);
    }

    protected native long gst_bit_reader_get_pos(
        @Ptr
        long reader);

    public long get_pos() {
        return this.gst_bit_reader_get_pos(Pointer.pointerTo(this, GstBitReader.class));
    }

    protected native long gst_bit_reader_get_remaining(
        @Ptr
        long reader);

    public long get_remaining() {
        return this.gst_bit_reader_get_remaining(Pointer.pointerTo(this, GstBitReader.class));
    }

    protected native long gst_bit_reader_get_size(
        @Ptr
        long reader);

    public long get_size() {
        return this.gst_bit_reader_get_size(Pointer.pointerTo(this, GstBitReader.class));
    }

    protected native void gst_bit_reader_init(
        @Ptr
        long reader,
        @Ptr
        long data, long size);

    public void init(short data, long size) {
        this.gst_bit_reader_init(Pointer.pointerTo(this, GstBitReader.class), Pointer.getPeer(data), size);
    }

    protected native boolean gst_bit_reader_peek_bits_uint16(
        @Ptr
        long reader,
        @Ptr
        long val, long nbits);

    public boolean peek_bits_uint16(Pointer<Integer> val, long nbits) {
        return this.gst_bit_reader_peek_bits_uint16(Pointer.pointerTo(this, GstBitReader.class), Pointer.getPeer(val), nbits);
    }

    protected native boolean gst_bit_reader_peek_bits_uint32(
        @Ptr
        long reader,
        @Ptr
        long val, long nbits);

    public boolean peek_bits_uint32(Pointer<Long> val, long nbits) {
        return this.gst_bit_reader_peek_bits_uint32(Pointer.pointerTo(this, GstBitReader.class), Pointer.getPeer(val), nbits);
    }

    protected native boolean gst_bit_reader_peek_bits_uint64(
        @Ptr
        long reader,
        @Ptr
        long val, long nbits);

    public boolean peek_bits_uint64(Pointer<Long> val, long nbits) {
        return this.gst_bit_reader_peek_bits_uint64(Pointer.pointerTo(this, GstBitReader.class), Pointer.getPeer(val), nbits);
    }

    protected native boolean gst_bit_reader_peek_bits_uint8(
        @Ptr
        long reader,
        @Ptr
        long val, long nbits);

    public boolean peek_bits_uint8(Pointer<Short> val, long nbits) {
        return this.gst_bit_reader_peek_bits_uint8(Pointer.pointerTo(this, GstBitReader.class), Pointer.getPeer(val), nbits);
    }

    protected native boolean gst_bit_reader_set_pos(
        @Ptr
        long reader, long pos);

    public boolean set_pos(long pos) {
        return this.gst_bit_reader_set_pos(Pointer.pointerTo(this, GstBitReader.class), pos);
    }

    protected native boolean gst_bit_reader_skip(
        @Ptr
        long reader, long nbits);

    public boolean skip(long nbits) {
        return this.gst_bit_reader_skip(Pointer.pointerTo(this, GstBitReader.class), nbits);
    }

    protected native boolean gst_bit_reader_skip_to_byte(
        @Ptr
        long reader);

    public boolean skip_to_byte() {
        return this.gst_bit_reader_skip_to_byte(Pointer.pointerTo(this, GstBitReader.class));
    }

    @Ptr
    protected native long gst_bit_reader_new(
        @Ptr
        long data, long size);

    public Pointer _new(short data, long size) {
        return Pointer.pointerToAddress(this.gst_bit_reader_new(Pointer.getPeer(data), size));
    }

}
