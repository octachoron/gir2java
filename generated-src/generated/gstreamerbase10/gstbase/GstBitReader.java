
package generated.gstreamerbase10.gstbase;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-base-1.0")
public class GstBitReader
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstBitReader() {
        super();
    }

    public GstBitReader(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer<Short> gstbitreader_field_data() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GstBitReader gstbitreader_field_data(Pointer<Short> gstbitreader_field_data) {
        this.io.setPointerField(this, 0, gstbitreader_field_data);
        return this;
    }

    @Field(1)
    public long gstbitreader_field_size() {
        return this.io.getLongField(this, 1);
    }

    @Field(1)
    public GstBitReader gstbitreader_field_size(long gstbitreader_field_size) {
        this.io.setLongField(this, 1, gstbitreader_field_size);
        return this;
    }

    @Field(2)
    public long gstbitreader_field_byte() {
        return this.io.getLongField(this, 2);
    }

    @Field(2)
    public GstBitReader gstbitreader_field_byte(long gstbitreader_field_byte) {
        this.io.setLongField(this, 2, gstbitreader_field_byte);
        return this;
    }

    @Field(3)
    public long gstbitreader_field_bit() {
        return this.io.getLongField(this, 3);
    }

    @Field(3)
    public GstBitReader gstbitreader_field_bit(long gstbitreader_field_bit) {
        this.io.setLongField(this, 3, gstbitreader_field_bit);
        return this;
    }

    @Field(4)
    private Pointer gstbitreader_field__gst_reserved() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    private GstBitReader gstbitreader_field__gst_reserved(Pointer gstbitreader_field__gst_reserved) {
        this.io.setPointerField(this, 4, gstbitreader_field__gst_reserved);
        return this;
    }

    protected native void gst_bit_reader_free(
        @Ptr
        long reader);

    public void free() {
        this.gst_bit_reader_free(Pointer.pointerTo(this, GstBitReader.class).getPeer());
    }

    protected native boolean gst_bit_reader_get_bits_uint16(
        @Ptr
        long reader,
        @Ptr
        long val, long nbits);

    public boolean get_bits_uint16(Pointer<Integer> val, long nbits) {
        return this.gst_bit_reader_get_bits_uint16(Pointer.pointerTo(this, GstBitReader.class).getPeer(), Pointer.getPeer(val), nbits);
    }

    protected native boolean gst_bit_reader_get_bits_uint32(
        @Ptr
        long reader,
        @Ptr
        long val, long nbits);

    public boolean get_bits_uint32(Pointer<Long> val, long nbits) {
        return this.gst_bit_reader_get_bits_uint32(Pointer.pointerTo(this, GstBitReader.class).getPeer(), Pointer.getPeer(val), nbits);
    }

    protected native boolean gst_bit_reader_get_bits_uint64(
        @Ptr
        long reader,
        @Ptr
        long val, long nbits);

    public boolean get_bits_uint64(Pointer<Long> val, long nbits) {
        return this.gst_bit_reader_get_bits_uint64(Pointer.pointerTo(this, GstBitReader.class).getPeer(), Pointer.getPeer(val), nbits);
    }

    protected native boolean gst_bit_reader_get_bits_uint8(
        @Ptr
        long reader,
        @Ptr
        long val, long nbits);

    public boolean get_bits_uint8(Pointer<Short> val, long nbits) {
        return this.gst_bit_reader_get_bits_uint8(Pointer.pointerTo(this, GstBitReader.class).getPeer(), Pointer.getPeer(val), nbits);
    }

    protected native long gst_bit_reader_get_pos(
        @Ptr
        long reader);

    public long get_pos() {
        return this.gst_bit_reader_get_pos(Pointer.pointerTo(this, GstBitReader.class).getPeer());
    }

    protected native long gst_bit_reader_get_remaining(
        @Ptr
        long reader);

    public long get_remaining() {
        return this.gst_bit_reader_get_remaining(Pointer.pointerTo(this, GstBitReader.class).getPeer());
    }

    protected native long gst_bit_reader_get_size(
        @Ptr
        long reader);

    public long get_size() {
        return this.gst_bit_reader_get_size(Pointer.pointerTo(this, GstBitReader.class).getPeer());
    }

    protected native void gst_bit_reader_init(
        @Ptr
        long reader,
        @Ptr
        long data, long size);

    public void init(Pointer<Short> data, long size) {
        this.gst_bit_reader_init(Pointer.pointerTo(this, GstBitReader.class).getPeer(), Pointer.getPeer(data), size);
    }

    protected native boolean gst_bit_reader_peek_bits_uint16(
        @Ptr
        long reader,
        @Ptr
        long val, long nbits);

    public boolean peek_bits_uint16(Pointer<Integer> val, long nbits) {
        return this.gst_bit_reader_peek_bits_uint16(Pointer.pointerTo(this, GstBitReader.class).getPeer(), Pointer.getPeer(val), nbits);
    }

    protected native boolean gst_bit_reader_peek_bits_uint32(
        @Ptr
        long reader,
        @Ptr
        long val, long nbits);

    public boolean peek_bits_uint32(Pointer<Long> val, long nbits) {
        return this.gst_bit_reader_peek_bits_uint32(Pointer.pointerTo(this, GstBitReader.class).getPeer(), Pointer.getPeer(val), nbits);
    }

    protected native boolean gst_bit_reader_peek_bits_uint64(
        @Ptr
        long reader,
        @Ptr
        long val, long nbits);

    public boolean peek_bits_uint64(Pointer<Long> val, long nbits) {
        return this.gst_bit_reader_peek_bits_uint64(Pointer.pointerTo(this, GstBitReader.class).getPeer(), Pointer.getPeer(val), nbits);
    }

    protected native boolean gst_bit_reader_peek_bits_uint8(
        @Ptr
        long reader,
        @Ptr
        long val, long nbits);

    public boolean peek_bits_uint8(Pointer<Short> val, long nbits) {
        return this.gst_bit_reader_peek_bits_uint8(Pointer.pointerTo(this, GstBitReader.class).getPeer(), Pointer.getPeer(val), nbits);
    }

    protected native boolean gst_bit_reader_set_pos(
        @Ptr
        long reader, long pos);

    public boolean set_pos(long pos) {
        return this.gst_bit_reader_set_pos(Pointer.pointerTo(this, GstBitReader.class).getPeer(), pos);
    }

    protected native boolean gst_bit_reader_skip(
        @Ptr
        long reader, long nbits);

    public boolean skip(long nbits) {
        return this.gst_bit_reader_skip(Pointer.pointerTo(this, GstBitReader.class).getPeer(), nbits);
    }

    protected native boolean gst_bit_reader_skip_to_byte(
        @Ptr
        long reader);

    public boolean skip_to_byte() {
        return this.gst_bit_reader_skip_to_byte(Pointer.pointerTo(this, GstBitReader.class).getPeer());
    }

    @Ptr
    protected static native long gst_bit_reader_new(
        @Ptr
        long data, long size);

    public static Pointer _new(Pointer<Short> data, long size) {
        return Pointer.pointerToAddress(GstBitReader.gst_bit_reader_new(Pointer.getPeer(data), size));
    }

}
