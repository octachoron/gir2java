
package generated.glib20.glib;

import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
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
    public Pointer gscanner_field_user_data() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GScanner gscanner_field_user_data(Pointer gscanner_field_user_data) {
        this.io.setPointerField(this, 0, gscanner_field_user_data);
        return this;
    }

    @Field(1)
    public long gscanner_field_max_parse_errors() {
        return this.io.getLongField(this, 1);
    }

    @Field(1)
    public GScanner gscanner_field_max_parse_errors(long gscanner_field_max_parse_errors) {
        this.io.setLongField(this, 1, gscanner_field_max_parse_errors);
        return this;
    }

    @Field(2)
    public long gscanner_field_parse_errors() {
        return this.io.getLongField(this, 2);
    }

    @Field(2)
    public GScanner gscanner_field_parse_errors(long gscanner_field_parse_errors) {
        this.io.setLongField(this, 2, gscanner_field_parse_errors);
        return this;
    }

    @Field(3)
    public Pointer gscanner_field_input_name() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public GScanner gscanner_field_input_name(Pointer gscanner_field_input_name) {
        this.io.setPointerField(this, 3, gscanner_field_input_name);
        return this;
    }

    @Field(4)
    public Pointer<GData> gscanner_field_qdata() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public GScanner gscanner_field_qdata(Pointer<GData> gscanner_field_qdata) {
        this.io.setPointerField(this, 4, gscanner_field_qdata);
        return this;
    }

    @Field(5)
    public Pointer gscanner_field_config() {
        return this.io.getPointerField(this, 5);
    }

    @Field(5)
    public GScanner gscanner_field_config(Pointer gscanner_field_config) {
        this.io.setPointerField(this, 5, gscanner_field_config);
        return this;
    }

    @Field(6)
    public Pointer gscanner_field_msg_handler() {
        return this.io.getPointerField(this, 6);
    }

    @Field(6)
    public GScanner gscanner_field_msg_handler(Pointer gscanner_field_msg_handler) {
        this.io.setPointerField(this, 6, gscanner_field_msg_handler);
        return this;
    }

    protected native long g_scanner_set_scope(
        @Ptr
        long scanner, long scope_id);

    public long set_scope(long scope_id) {
        return this.g_scanner_set_scope(Pointer.pointerTo(this, GScanner.class).getPeer(), scope_id);
    }

    @Field(7)
    private Pointer gscanner_field_buffer() {
        return this.io.getPointerField(this, 7);
    }

    @Field(7)
    private GScanner gscanner_field_buffer(Pointer gscanner_field_buffer) {
        this.io.setPointerField(this, 7, gscanner_field_buffer);
        return this;
    }

    @Field(8)
    public long gscanner_field_next_position() {
        return this.io.getLongField(this, 8);
    }

    @Field(8)
    public GScanner gscanner_field_next_position(long gscanner_field_next_position) {
        this.io.setLongField(this, 8, gscanner_field_next_position);
        return this;
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

    @Field(9)
    public long gscanner_field_position() {
        return this.io.getLongField(this, 9);
    }

    @Field(9)
    public GScanner gscanner_field_position(long gscanner_field_position) {
        this.io.setLongField(this, 9, gscanner_field_position);
        return this;
    }

    protected native void g_scanner_sync_file_offset(
        @Ptr
        long scanner);

    public void sync_file_offset() {
        this.g_scanner_sync_file_offset(Pointer.pointerTo(this, GScanner.class).getPeer());
    }

    @Ptr
    protected static native long g_scanner_new(
        @Ptr
        long config_templ);

    public static Pointer<GScanner> _new(Pointer<GScannerConfig> config_templ) {
        return Pointer.pointerToAddress(GScanner.g_scanner_new(Pointer.getPeer(config_templ)), GScanner.class);
    }

    protected native void g_scanner_scope_remove_symbol(
        @Ptr
        long scanner, long scope_id,
        @Ptr
        long symbol);

    public void scope_remove_symbol(long scope_id, Pointer symbol) {
        this.g_scanner_scope_remove_symbol(Pointer.pointerTo(this, GScanner.class).getPeer(), scope_id, Pointer.getPeer(symbol));
    }

    @Field(10)
    private int gscanner_field_input_fd() {
        return this.io.getIntField(this, 10);
    }

    @Field(10)
    private GScanner gscanner_field_input_fd(int gscanner_field_input_fd) {
        this.io.setIntField(this, 10, gscanner_field_input_fd);
        return this;
    }

    @Field(11)
    public IntValuedEnum<GTokenType> gscanner_field_next_token() {
        return this.io.getEnumField(this, 11);
    }

    @Field(11)
    public GScanner gscanner_field_next_token(IntValuedEnum<GTokenType> gscanner_field_next_token) {
        this.io.setEnumField(this, 11, gscanner_field_next_token);
        return this;
    }

    protected native boolean g_scanner_eof(
        @Ptr
        long scanner);

    public boolean eof() {
        return this.g_scanner_eof(Pointer.pointerTo(this, GScanner.class).getPeer());
    }

    @Field(12)
    private Pointer<GHashTable> gscanner_field_symbol_table() {
        return this.io.getPointerField(this, 12);
    }

    @Field(12)
    private GScanner gscanner_field_symbol_table(Pointer<GHashTable> gscanner_field_symbol_table) {
        this.io.setPointerField(this, 12, gscanner_field_symbol_table);
        return this;
    }

    protected native long g_scanner_cur_line(
        @Ptr
        long scanner);

    public long cur_line() {
        return this.g_scanner_cur_line(Pointer.pointerTo(this, GScanner.class).getPeer());
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

    protected native IntValuedEnum<GTokenType> g_scanner_peek_next_token(
        @Ptr
        long scanner);

    public IntValuedEnum<GTokenType> peek_next_token() {
        return this.g_scanner_peek_next_token(Pointer.pointerTo(this, GScanner.class).getPeer());
    }

    protected native long g_scanner_cur_position(
        @Ptr
        long scanner);

    public long cur_position() {
        return this.g_scanner_cur_position(Pointer.pointerTo(this, GScanner.class).getPeer());
    }

    protected native void g_scanner_destroy(
        @Ptr
        long scanner);

    public void destroy() {
        this.g_scanner_destroy(Pointer.pointerTo(this, GScanner.class).getPeer());
    }

    @Field(13)
    private Pointer gscanner_field_text() {
        return this.io.getPointerField(this, 13);
    }

    @Field(13)
    private GScanner gscanner_field_text(Pointer gscanner_field_text) {
        this.io.setPointerField(this, 13, gscanner_field_text);
        return this;
    }

    @Field(14)
    public long gscanner_field_line() {
        return this.io.getLongField(this, 14);
    }

    @Field(14)
    public GScanner gscanner_field_line(long gscanner_field_line) {
        this.io.setLongField(this, 14, gscanner_field_line);
        return this;
    }

    @Field(15)
    public GTokenValue gscanner_field_next_value() {
        return this.io.getNativeObjectField(this, 15);
    }

    @Field(15)
    public GScanner gscanner_field_next_value(GTokenValue gscanner_field_next_value) {
        this.io.setNativeObjectField(this, 15, gscanner_field_next_value);
        return this;
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

    @Field(16)
    public IntValuedEnum<GTokenType> gscanner_field_token() {
        return this.io.getEnumField(this, 16);
    }

    @Field(16)
    public GScanner gscanner_field_token(IntValuedEnum<GTokenType> gscanner_field_token) {
        this.io.setEnumField(this, 16, gscanner_field_token);
        return this;
    }

    @Field(17)
    public long gscanner_field_next_line() {
        return this.io.getLongField(this, 17);
    }

    @Field(17)
    public GScanner gscanner_field_next_line(long gscanner_field_next_line) {
        this.io.setLongField(this, 17, gscanner_field_next_line);
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

    protected native IntValuedEnum<GTokenType> g_scanner_get_next_token(
        @Ptr
        long scanner);

    public IntValuedEnum<GTokenType> get_next_token() {
        return this.g_scanner_get_next_token(Pointer.pointerTo(this, GScanner.class).getPeer());
    }

    protected native void g_scanner_warn(
        @Ptr
        long scanner,
        @Ptr
        long format, Object... varargs);

    public void warn(Pointer format, Object... varargs) {
        this.g_scanner_warn(Pointer.pointerTo(this, GScanner.class).getPeer(), Pointer.getPeer(format), varargs);
    }

    @Field(18)
    public GTokenValue gscanner_field_value() {
        return this.io.getNativeObjectField(this, 18);
    }

    @Field(18)
    public GScanner gscanner_field_value(GTokenValue gscanner_field_value) {
        this.io.setNativeObjectField(this, 18, gscanner_field_value);
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

    @Field(19)
    private long gscanner_field_scope_id() {
        return this.io.getLongField(this, 19);
    }

    @Field(19)
    private GScanner gscanner_field_scope_id(long gscanner_field_scope_id) {
        this.io.setLongField(this, 19, gscanner_field_scope_id);
        return this;
    }

    @Field(20)
    private Pointer gscanner_field_text_end() {
        return this.io.getPointerField(this, 20);
    }

    @Field(20)
    private GScanner gscanner_field_text_end(Pointer gscanner_field_text_end) {
        this.io.setPointerField(this, 20, gscanner_field_text_end);
        return this;
    }

    protected native void g_scanner_input_file(
        @Ptr
        long scanner, int input_fd);

    public void input_file(int input_fd) {
        this.g_scanner_input_file(Pointer.pointerTo(this, GScanner.class).getPeer(), input_fd);
    }

    protected native void g_scanner_error(
        @Ptr
        long scanner,
        @Ptr
        long format, Object... varargs);

    public void error(Pointer format, Object... varargs) {
        this.g_scanner_error(Pointer.pointerTo(this, GScanner.class).getPeer(), Pointer.getPeer(format), varargs);
    }

}
