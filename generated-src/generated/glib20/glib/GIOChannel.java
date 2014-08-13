
package generated.glib20.glib;

import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GIOChannel
    extends StructObject
{


    public GIOChannel() {
        super();
    }

    public GIOChannel(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public int field_ref_count() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GIOChannel field_ref_count(int field_ref_count) {
        this.io.setNativeObjectField(this, 0, field_ref_count);
        return this;
    }

    @Field(1)
    public Pointer field_funcs() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GIOChannel field_funcs(Pointer field_funcs) {
        this.io.setPointerField(this, 1, field_funcs);
        return this;
    }

    @Field(2)
    public Pointer field_encoding() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GIOChannel field_encoding(Pointer field_encoding) {
        this.io.setPointerField(this, 2, field_encoding);
        return this;
    }

    @Field(3)
    public GIConv field_read_cd() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GIOChannel field_read_cd(GIConv field_read_cd) {
        this.io.setNativeObjectField(this, 3, field_read_cd);
        return this;
    }

    @Field(4)
    public GIConv field_write_cd() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    public GIOChannel field_write_cd(GIConv field_write_cd) {
        this.io.setNativeObjectField(this, 4, field_write_cd);
        return this;
    }

    @Field(5)
    public Pointer field_line_term() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    public GIOChannel field_line_term(Pointer field_line_term) {
        this.io.setPointerField(this, 5, field_line_term);
        return this;
    }

    @Field(6)
    public long field_line_term_len() {
        return this.io.getNativeObjectField(this, 6);
    }

    @Field(6)
    public GIOChannel field_line_term_len(long field_line_term_len) {
        this.io.setNativeObjectField(this, 6, field_line_term_len);
        return this;
    }

    @Field(7)
    public long field_buf_size() {
        return this.io.getNativeObjectField(this, 7);
    }

    @Field(7)
    public GIOChannel field_buf_size(long field_buf_size) {
        this.io.setNativeObjectField(this, 7, field_buf_size);
        return this;
    }

    @Field(8)
    public Pointer field_read_buf() {
        return this.io.getPointerField(this, 8);
    }

    @Field(8)
    public GIOChannel field_read_buf(Pointer field_read_buf) {
        this.io.setPointerField(this, 8, field_read_buf);
        return this;
    }

    @Field(9)
    public Pointer field_encoded_read_buf() {
        return this.io.getPointerField(this, 9);
    }

    @Field(9)
    public GIOChannel field_encoded_read_buf(Pointer field_encoded_read_buf) {
        this.io.setPointerField(this, 9, field_encoded_read_buf);
        return this;
    }

    @Field(10)
    public Pointer field_write_buf() {
        return this.io.getPointerField(this, 10);
    }

    @Field(10)
    public GIOChannel field_write_buf(Pointer field_write_buf) {
        this.io.setPointerField(this, 10, field_write_buf);
        return this;
    }

    @Field(11)
    public char field_partial_write_buf() {
        return this.io.getPointerField(this, 11);
    }

    @Field(11)
    public GIOChannel field_partial_write_buf(char field_partial_write_buf) {
        this.io.setPointerField(this, 11, field_partial_write_buf);
        return this;
    }

    @Field(12)
    public long field_use_buffer() {
        return this.io.getNativeObjectField(this, 12);
    }

    @Field(12)
    public GIOChannel field_use_buffer(long field_use_buffer) {
        this.io.setNativeObjectField(this, 12, field_use_buffer);
        return this;
    }

    @Field(13)
    public long field_do_encode() {
        return this.io.getNativeObjectField(this, 13);
    }

    @Field(13)
    public GIOChannel field_do_encode(long field_do_encode) {
        this.io.setNativeObjectField(this, 13, field_do_encode);
        return this;
    }

    @Field(14)
    public long field_close_on_unref() {
        return this.io.getNativeObjectField(this, 14);
    }

    @Field(14)
    public GIOChannel field_close_on_unref(long field_close_on_unref) {
        this.io.setNativeObjectField(this, 14, field_close_on_unref);
        return this;
    }

    @Field(15)
    public long field_is_readable() {
        return this.io.getNativeObjectField(this, 15);
    }

    @Field(15)
    public GIOChannel field_is_readable(long field_is_readable) {
        this.io.setNativeObjectField(this, 15, field_is_readable);
        return this;
    }

    @Field(16)
    public long field_is_writeable() {
        return this.io.getNativeObjectField(this, 16);
    }

    @Field(16)
    public GIOChannel field_is_writeable(long field_is_writeable) {
        this.io.setNativeObjectField(this, 16, field_is_writeable);
        return this;
    }

    @Field(17)
    public long field_is_seekable() {
        return this.io.getNativeObjectField(this, 17);
    }

    @Field(17)
    public GIOChannel field_is_seekable(long field_is_seekable) {
        this.io.setNativeObjectField(this, 17, field_is_seekable);
        return this;
    }

    @Field(18)
    public Pointer field_reserved1() {
        return this.io.getNativeObjectField(this, 18);
    }

    @Field(18)
    public GIOChannel field_reserved1(Pointer field_reserved1) {
        this.io.setNativeObjectField(this, 18, field_reserved1);
        return this;
    }

    @Field(19)
    public Pointer field_reserved2() {
        return this.io.getNativeObjectField(this, 19);
    }

    @Field(19)
    public GIOChannel field_reserved2(Pointer field_reserved2) {
        this.io.setNativeObjectField(this, 19, field_reserved2);
        return this;
    }

    protected native void g_io_channel_close(
        @Ptr
        long channel);

    public void close() {
        this.g_io_channel_close(Pointer.pointerTo(this, GIOChannel.class));
    }

    protected native long g_io_channel_get_buffer_size(
        @Ptr
        long channel);

    public long get_buffer_size() {
        return this.g_io_channel_get_buffer_size(Pointer.pointerTo(this, GIOChannel.class));
    }

    protected native boolean g_io_channel_get_buffered(
        @Ptr
        long channel);

    public boolean get_buffered() {
        return this.g_io_channel_get_buffered(Pointer.pointerTo(this, GIOChannel.class));
    }

    protected native boolean g_io_channel_get_close_on_unref(
        @Ptr
        long channel);

    public boolean get_close_on_unref() {
        return this.g_io_channel_get_close_on_unref(Pointer.pointerTo(this, GIOChannel.class));
    }

    @Ptr
    protected native long g_io_channel_get_encoding(
        @Ptr
        long channel);

    public Pointer get_encoding() {
        return Pointer.pointerToAddress(this.g_io_channel_get_encoding(Pointer.pointerTo(this, GIOChannel.class)));
    }

    @Ptr
    protected native long g_io_channel_get_line_term(
        @Ptr
        long channel,
        @Ptr
        long length);

    public Pointer get_line_term(Pointer<Integer> length) {
        return Pointer.pointerToAddress(this.g_io_channel_get_line_term(Pointer.pointerTo(this, GIOChannel.class), Pointer.getPeer(length)));
    }

    protected native void g_io_channel_init(
        @Ptr
        long channel);

    public void init() {
        this.g_io_channel_init(Pointer.pointerTo(this, GIOChannel.class));
    }

    @Ptr
    protected native long g_io_channel_ref(
        @Ptr
        long channel);

    public Pointer ref() {
        return Pointer.pointerToAddress(this.g_io_channel_ref(Pointer.pointerTo(this, GIOChannel.class)));
    }

    protected native void g_io_channel_set_buffer_size(
        @Ptr
        long channel, long size);

    public void set_buffer_size(long size) {
        this.g_io_channel_set_buffer_size(Pointer.pointerTo(this, GIOChannel.class), size);
    }

    protected native void g_io_channel_set_buffered(
        @Ptr
        long channel, boolean buffered);

    public void set_buffered(boolean buffered) {
        this.g_io_channel_set_buffered(Pointer.pointerTo(this, GIOChannel.class), buffered);
    }

    protected native void g_io_channel_set_close_on_unref(
        @Ptr
        long channel, boolean do_close);

    public void set_close_on_unref(boolean do_close) {
        this.g_io_channel_set_close_on_unref(Pointer.pointerTo(this, GIOChannel.class), do_close);
    }

    protected native void g_io_channel_set_line_term(
        @Ptr
        long channel,
        @Ptr
        long line_term, int length);

    public void set_line_term(Pointer line_term, int length) {
        this.g_io_channel_set_line_term(Pointer.pointerTo(this, GIOChannel.class), Pointer.getPeer(line_term), length);
    }

    protected native int g_io_channel_unix_get_fd(
        @Ptr
        long channel);

    public int unix_get_fd() {
        return this.g_io_channel_unix_get_fd(Pointer.pointerTo(this, GIOChannel.class));
    }

    protected native void g_io_channel_unref(
        @Ptr
        long channel);

    public void unref() {
        this.g_io_channel_unref(Pointer.pointerTo(this, GIOChannel.class));
    }

    public native Object g_io_channel_error_quark();

    protected native IntValuedEnum<GIOError> g_io_channel_read(
        @Ptr
        long channel,
        @Ptr
        long buf, long count,
        @Ptr
        long bytes_read);

    public IntValuedEnum<GIOError> read(Pointer buf, long count, Pointer<Long> bytes_read) {
        return this.g_io_channel_read(Pointer.pointerTo(this, GIOChannel.class), Pointer.getPeer(buf), count, Pointer.getPeer(bytes_read));
    }

    protected native Object g_io_channel_get_buffer_condition(
        @Ptr
        long channel);

    public Object get_buffer_condition() {
        return this.g_io_channel_get_buffer_condition(Pointer.pointerTo(this, GIOChannel.class));
    }

    protected native IntValuedEnum<GIOStatus> g_io_channel_read_line(
        @Ptr
        long channel,
        @Ptr
        long str_return,
        @Ptr
        long length,
        @Ptr
        long terminator_pos);

    public IntValuedEnum<GIOStatus> read_line(Pointer str_return, Pointer<Long> length, Pointer<Long> terminator_pos) {
        return this.g_io_channel_read_line(Pointer.pointerTo(this, GIOChannel.class), Pointer.getPeer(str_return), Pointer.getPeer(length), Pointer.getPeer(terminator_pos));
    }

    protected native IntValuedEnum<GIOError> g_io_channel_seek(
        @Ptr
        long channel, long offset, IntValuedEnum<GSeekType> type);

    public IntValuedEnum<GIOError> seek(long offset, IntValuedEnum<GSeekType> type) {
        return this.g_io_channel_seek(Pointer.pointerTo(this, GIOChannel.class), offset, type);
    }

    protected native IntValuedEnum<GIOStatus> g_io_channel_read_to_end(
        @Ptr
        long channel,
        @Ptr
        long str_return,
        @Ptr
        long length);

    public IntValuedEnum<GIOStatus> read_to_end(short str_return, Pointer<Long> length) {
        return this.g_io_channel_read_to_end(Pointer.pointerTo(this, GIOChannel.class), Pointer.getPeer(str_return), Pointer.getPeer(length));
    }

    protected native IntValuedEnum<GIOStatus> g_io_channel_set_flags(
        @Ptr
        long channel, Object flags);

    public IntValuedEnum<GIOStatus> set_flags(Object flags) {
        return this.g_io_channel_set_flags(Pointer.pointerTo(this, GIOChannel.class), flags);
    }

    protected native IntValuedEnum<GIOStatus> g_io_channel_write_chars(
        @Ptr
        long channel,
        @Ptr
        long buf, long count,
        @Ptr
        long bytes_written);

    public IntValuedEnum<GIOStatus> write_chars(short buf, long count, Pointer<Long> bytes_written) {
        return this.g_io_channel_write_chars(Pointer.pointerTo(this, GIOChannel.class), Pointer.getPeer(buf), count, Pointer.getPeer(bytes_written));
    }

    protected native IntValuedEnum<GIOStatus> g_io_channel_read_chars(
        @Ptr
        long channel,
        @Ptr
        long buf, long count,
        @Ptr
        long bytes_read);

    public IntValuedEnum<GIOStatus> read_chars(short buf, long count, Pointer<Long> bytes_read) {
        return this.g_io_channel_read_chars(Pointer.pointerTo(this, GIOChannel.class), Pointer.getPeer(buf), count, Pointer.getPeer(bytes_read));
    }

    protected native IntValuedEnum<GIOStatus> g_io_channel_flush(
        @Ptr
        long channel);

    public IntValuedEnum<GIOStatus> flush() {
        return this.g_io_channel_flush(Pointer.pointerTo(this, GIOChannel.class));
    }

    protected native IntValuedEnum<GIOStatus> g_io_channel_set_encoding(
        @Ptr
        long channel,
        @Ptr
        long encoding);

    public IntValuedEnum<GIOStatus> set_encoding(Pointer encoding) {
        return this.g_io_channel_set_encoding(Pointer.pointerTo(this, GIOChannel.class), Pointer.getPeer(encoding));
    }

    protected native IntValuedEnum<GIOStatus> g_io_channel_write_unichar(
        @Ptr
        long channel, long thechar);

    public IntValuedEnum<GIOStatus> write_unichar(long thechar) {
        return this.g_io_channel_write_unichar(Pointer.pointerTo(this, GIOChannel.class), thechar);
    }

    protected native IntValuedEnum<GIOStatus> g_io_channel_seek_position(
        @Ptr
        long channel, long offset, IntValuedEnum<GSeekType> type);

    public IntValuedEnum<GIOStatus> seek_position(long offset, IntValuedEnum<GSeekType> type) {
        return this.g_io_channel_seek_position(Pointer.pointerTo(this, GIOChannel.class), offset, type);
    }

    protected native IntValuedEnum<GIOStatus> g_io_channel_shutdown(
        @Ptr
        long channel, boolean flush);

    public IntValuedEnum<GIOStatus> shutdown(boolean flush) {
        return this.g_io_channel_shutdown(Pointer.pointerTo(this, GIOChannel.class), flush);
    }

    public native IntValuedEnum<GIOChannelError> g_io_channel_error_from_errno(int en);

    protected native Object g_io_channel_get_flags(
        @Ptr
        long channel);

    public Object get_flags() {
        return this.g_io_channel_get_flags(Pointer.pointerTo(this, GIOChannel.class));
    }

    protected native IntValuedEnum<GIOStatus> g_io_channel_read_unichar(
        @Ptr
        long channel,
        @Ptr
        long thechar);

    public IntValuedEnum<GIOStatus> read_unichar(Pointer<Long> thechar) {
        return this.g_io_channel_read_unichar(Pointer.pointerTo(this, GIOChannel.class), Pointer.getPeer(thechar));
    }

    protected native IntValuedEnum<GIOStatus> g_io_channel_read_line_string(
        @Ptr
        long channel,
        @Ptr
        long buffer,
        @Ptr
        long terminator_pos);

    public IntValuedEnum<GIOStatus> read_line_string(Pointer<GString> buffer, Pointer<Long> terminator_pos) {
        return this.g_io_channel_read_line_string(Pointer.pointerTo(this, GIOChannel.class), Pointer.getPeer(buffer), Pointer.getPeer(terminator_pos));
    }

    protected native IntValuedEnum<GIOError> g_io_channel_write(
        @Ptr
        long channel,
        @Ptr
        long buf, long count,
        @Ptr
        long bytes_written);

    public IntValuedEnum<GIOError> write(Pointer buf, long count, Pointer<Long> bytes_written) {
        return this.g_io_channel_write(Pointer.pointerTo(this, GIOChannel.class), Pointer.getPeer(buf), count, Pointer.getPeer(bytes_written));
    }

}
