
package generated.glib20.glib;

import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.NativeObject;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GScanner
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GScanner() {
        super();
    }

    public GScanner(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer field_user_data() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GScanner field_user_data(Pointer field_user_data) {
        this.io.setPointerField(this, 0, field_user_data);
        return this;
    }

    @Field(1)
    public long field_max_parse_errors() {
        return this.io.getLongField(this, 1);
    }

    @Field(1)
    public GScanner field_max_parse_errors(long field_max_parse_errors) {
        this.io.setLongField(this, 1, field_max_parse_errors);
        return this;
    }

    @Field(2)
    public long field_parse_errors() {
        return this.io.getLongField(this, 2);
    }

    @Field(2)
    public GScanner field_parse_errors(long field_parse_errors) {
        this.io.setLongField(this, 2, field_parse_errors);
        return this;
    }

    @Field(3)
    public Pointer field_input_name() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public GScanner field_input_name(Pointer field_input_name) {
        this.io.setPointerField(this, 3, field_input_name);
        return this;
    }

    @Field(4)
    public Pointer<GData> field_qdata() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public GScanner field_qdata(Pointer<GData> field_qdata) {
        this.io.setPointerField(this, 4, field_qdata);
        return this;
    }

    @Field(5)
    public Pointer field_config() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    public GScanner field_config(Pointer field_config) {
        this.io.setPointerField(this, 5, field_config);
        return this;
    }

    @Field(6)
    public Pointer field_text_end() {
        return this.io.getPointerField(this, 6);
    }

    @Field(6)
    public GScanner field_text_end(Pointer field_text_end) {
        this.io.setPointerField(this, 6, field_text_end);
        return this;
    }

    protected native void g_scanner_warn(
        @Ptr
        long scanner,
        @Ptr
        long format, Object... varargs);

    public void warn(Pointer format, Object... varargs) {
        this.g_scanner_warn(Pointer.pointerTo(this, GScanner.class).getPeer(), Pointer.getPeer(format), varargs);
    }

    protected native void g_scanner_scope_foreach_symbol(
        @Ptr
        long scanner, long scope_id,
        @Ptr
        long func,
        @Ptr
        long user_data);

    public void scope_foreach_symbol(long scope_id, Pointer func, Pointer user_data) {
        this.g_scanner_scope_foreach_symbol(Pointer.pointerTo(this, GScanner.class).getPeer(), scope_id, Pointer.getPeer(func), Pointer.getPeer(user_data));
    }

    @Field(7)
    public int field_input_fd() {
        return this.io.getIntField(this, 7);
    }

    @Field(7)
    public GScanner field_input_fd(int field_input_fd) {
        this.io.setIntField(this, 7, field_input_fd);
        return this;
    }

    @Field(8)
    public IntValuedEnum<GTokenType> field_next_token() {
        return this.io.getEnumField(this, 8);
    }

    @Field(8)
    public GScanner field_next_token(IntValuedEnum<GTokenType> field_next_token) {
        this.io.setEnumField(this, 8, field_next_token);
        return this;
    }

    protected native void g_scanner_input_text(
        @Ptr
        long scanner,
        @Ptr
        long text, long text_len);

    public void input_text(Pointer text, long text_len) {
        this.g_scanner_input_text(Pointer.pointerTo(this, GScanner.class).getPeer(), Pointer.getPeer(text), text_len);
    }

    protected native void g_scanner_scope_remove_symbol(
        @Ptr
        long scanner, long scope_id,
        @Ptr
        long symbol);

    public void scope_remove_symbol(long scope_id, Pointer symbol) {
        this.g_scanner_scope_remove_symbol(Pointer.pointerTo(this, GScanner.class).getPeer(), scope_id, Pointer.getPeer(symbol));
    }

    @Field(9)
    public Pointer field_msg_handler() {
        return this.io.getPointerField(this, 9);
    }

    @Field(9)
    public GScanner field_msg_handler(Pointer field_msg_handler) {
        this.io.setPointerField(this, 9, field_msg_handler);
        return this;
    }

    @Field(10)
    public IntValuedEnum<GTokenType> field_token() {
        return this.io.getEnumField(this, 10);
    }

    @Field(10)
    public GScanner field_token(IntValuedEnum<GTokenType> field_token) {
        this.io.setEnumField(this, 10, field_token);
        return this;
    }

    @Ptr
    protected native long g_scanner_scope_lookup_symbol(
        @Ptr
        long scanner, long scope_id,
        @Ptr
        long symbol);

    public Pointer scope_lookup_symbol(long scope_id, Pointer symbol) {
        return Pointer.pointerToAddress(this.g_scanner_scope_lookup_symbol(Pointer.pointerTo(this, GScanner.class).getPeer(), scope_id, Pointer.getPeer(symbol)));
    }

    protected native void g_scanner_sync_file_offset(
        @Ptr
        long scanner);

    public void sync_file_offset() {
        this.g_scanner_sync_file_offset(Pointer.pointerTo(this, GScanner.class).getPeer());
    }

    protected native void g_scanner_scope_add_symbol(
        @Ptr
        long scanner, long scope_id,
        @Ptr
        long symbol,
        @Ptr
        long value);

    public void scope_add_symbol(long scope_id, Pointer symbol, Pointer value) {
        this.g_scanner_scope_add_symbol(Pointer.pointerTo(this, GScanner.class).getPeer(), scope_id, Pointer.getPeer(symbol), Pointer.getPeer(value));
    }

    @Field(11)
    public long field_next_line() {
        return this.io.getLongField(this, 11);
    }

    @Field(11)
    public GScanner field_next_line(long field_next_line) {
        this.io.setLongField(this, 11, field_next_line);
        return this;
    }

    @Field(12)
    public NativeObject field_value() {
        return this.io.getNativeObjectField(this, 12);
    }

    @Field(12)
    public GScanner field_value(NativeObject field_value) {
        this.io.setNativeObjectField(this, 12, field_value);
        return this;
    }

    protected native void g_scanner_unexp_token(
        @Ptr
        long scanner, IntValuedEnum<GTokenType> expected_token,
        @Ptr
        long identifier_spec,
        @Ptr
        long symbol_spec,
        @Ptr
        long symbol_name,
        @Ptr
        long message, int is_error);

    public void unexp_token(IntValuedEnum<GTokenType> expected_token, Pointer identifier_spec, Pointer symbol_spec, Pointer symbol_name, Pointer message, int is_error) {
        this.g_scanner_unexp_token(Pointer.pointerTo(this, GScanner.class).getPeer(), expected_token, Pointer.getPeer(identifier_spec), Pointer.getPeer(symbol_spec), Pointer.getPeer(symbol_name), Pointer.getPeer(message), is_error);
    }

    protected native IntValuedEnum<GTokenType> g_scanner_cur_token(
        @Ptr
        long scanner);

    public IntValuedEnum<GTokenType> cur_token() {
        return this.g_scanner_cur_token(Pointer.pointerTo(this, GScanner.class).getPeer());
    }

    @Field(13)
    public NativeObject field_next_value() {
        return this.io.getNativeObjectField(this, 13);
    }

    @Field(13)
    public GScanner field_next_value(NativeObject field_next_value) {
        this.io.setNativeObjectField(this, 13, field_next_value);
        return this;
    }

    @Field(14)
    public Pointer field_buffer() {
        return this.io.getPointerField(this, 14);
    }

    @Field(14)
    public GScanner field_buffer(Pointer field_buffer) {
        this.io.setPointerField(this, 14, field_buffer);
        return this;
    }

    protected native IntValuedEnum<GTokenType> g_scanner_get_next_token(
        @Ptr
        long scanner);

    public IntValuedEnum<GTokenType> get_next_token() {
        return this.g_scanner_get_next_token(Pointer.pointerTo(this, GScanner.class).getPeer());
    }

    protected native void g_scanner_input_file(
        @Ptr
        long scanner, int input_fd);

    public void input_file(int input_fd) {
        this.g_scanner_input_file(Pointer.pointerTo(this, GScanner.class).getPeer(), input_fd);
    }

    @Field(15)
    public long field_scope_id() {
        return this.io.getLongField(this, 15);
    }

    @Field(15)
    public GScanner field_scope_id(long field_scope_id) {
        this.io.setLongField(this, 15, field_scope_id);
        return this;
    }

    @Ptr
    protected static native long g_scanner_new(
        @Ptr
        long config_templ);

    public static Pointer<GScanner> _new(Pointer<GScannerConfig> config_templ) {
        return Pointer.pointerToAddress(GScanner.g_scanner_new(Pointer.getPeer(config_templ)), GScanner.class);
    }

    protected native long g_scanner_cur_position(
        @Ptr
        long scanner);

    public long cur_position() {
        return this.g_scanner_cur_position(Pointer.pointerTo(this, GScanner.class).getPeer());
    }

    protected native long g_scanner_cur_line(
        @Ptr
        long scanner);

    public long cur_line() {
        return this.g_scanner_cur_line(Pointer.pointerTo(this, GScanner.class).getPeer());
    }

    @Field(16)
    public long field_next_position() {
        return this.io.getLongField(this, 16);
    }

    @Field(16)
    public GScanner field_next_position(long field_next_position) {
        this.io.setLongField(this, 16, field_next_position);
        return this;
    }

    @Field(17)
    public long field_line() {
        return this.io.getLongField(this, 17);
    }

    @Field(17)
    public GScanner field_line(long field_line) {
        this.io.setLongField(this, 17, field_line);
        return this;
    }

    @Ptr
    protected native long g_scanner_lookup_symbol(
        @Ptr
        long scanner,
        @Ptr
        long symbol);

    public Pointer lookup_symbol(Pointer symbol) {
        return Pointer.pointerToAddress(this.g_scanner_lookup_symbol(Pointer.pointerTo(this, GScanner.class).getPeer(), Pointer.getPeer(symbol)));
    }

    @Field(18)
    public long field_position() {
        return this.io.getLongField(this, 18);
    }

    @Field(18)
    public GScanner field_position(long field_position) {
        this.io.setLongField(this, 18, field_position);
        return this;
    }

    protected native void g_scanner_error(
        @Ptr
        long scanner,
        @Ptr
        long format, Object... varargs);

    public void error(Pointer format, Object... varargs) {
        this.g_scanner_error(Pointer.pointerTo(this, GScanner.class).getPeer(), Pointer.getPeer(format), varargs);
    }

    protected native void g_scanner_destroy(
        @Ptr
        long scanner);

    public void destroy() {
        this.g_scanner_destroy(Pointer.pointerTo(this, GScanner.class).getPeer());
    }

    protected native long g_scanner_set_scope(
        @Ptr
        long scanner, long scope_id);

    public long set_scope(long scope_id) {
        return this.g_scanner_set_scope(Pointer.pointerTo(this, GScanner.class).getPeer(), scope_id);
    }

    protected native IntValuedEnum<GTokenType> g_scanner_peek_next_token(
        @Ptr
        long scanner);

    public IntValuedEnum<GTokenType> peek_next_token() {
        return this.g_scanner_peek_next_token(Pointer.pointerTo(this, GScanner.class).getPeer());
    }

    @Field(19)
    public Pointer field_text() {
        return this.io.getPointerField(this, 19);
    }

    @Field(19)
    public GScanner field_text(Pointer field_text) {
        this.io.setPointerField(this, 19, field_text);
        return this;
    }

    @Field(20)
    public Pointer<GHashTable> field_symbol_table() {
        return this.io.getPointerField(this, 20);
    }

    @Field(20)
    public GScanner field_symbol_table(Pointer<GHashTable> field_symbol_table) {
        this.io.setPointerField(this, 20, field_symbol_table);
        return this;
    }

    protected native boolean g_scanner_eof(
        @Ptr
        long scanner);

    public boolean eof() {
        return this.g_scanner_eof(Pointer.pointerTo(this, GScanner.class).getPeer());
    }

}
