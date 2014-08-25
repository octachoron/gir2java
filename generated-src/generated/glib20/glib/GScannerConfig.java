
package generated.glib20.glib;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("glib-2.0")
public class GScannerConfig
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GScannerConfig() {
        super();
    }

    public GScannerConfig(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer gscannerconfig_field_cset_skip_characters() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GScannerConfig gscannerconfig_field_cset_skip_characters(Pointer gscannerconfig_field_cset_skip_characters) {
        this.io.setPointerField(this, 0, gscannerconfig_field_cset_skip_characters);
        return this;
    }

    @Field(1)
    public Pointer gscannerconfig_field_cset_identifier_first() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GScannerConfig gscannerconfig_field_cset_identifier_first(Pointer gscannerconfig_field_cset_identifier_first) {
        this.io.setPointerField(this, 1, gscannerconfig_field_cset_identifier_first);
        return this;
    }

    @Field(2)
    public Pointer gscannerconfig_field_cset_identifier_nth() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GScannerConfig gscannerconfig_field_cset_identifier_nth(Pointer gscannerconfig_field_cset_identifier_nth) {
        this.io.setPointerField(this, 2, gscannerconfig_field_cset_identifier_nth);
        return this;
    }

    @Field(3)
    public Pointer gscannerconfig_field_cpair_comment_single() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public GScannerConfig gscannerconfig_field_cpair_comment_single(Pointer gscannerconfig_field_cpair_comment_single) {
        this.io.setPointerField(this, 3, gscannerconfig_field_cpair_comment_single);
        return this;
    }

    @Field(4)
    public long gscannerconfig_field_case_sensitive() {
        return this.io.getLongField(this, 4);
    }

    @Field(4)
    public GScannerConfig gscannerconfig_field_case_sensitive(long gscannerconfig_field_case_sensitive) {
        this.io.setLongField(this, 4, gscannerconfig_field_case_sensitive);
        return this;
    }

    @Field(5)
    public long gscannerconfig_field_skip_comment_multi() {
        return this.io.getLongField(this, 5);
    }

    @Field(5)
    public GScannerConfig gscannerconfig_field_skip_comment_multi(long gscannerconfig_field_skip_comment_multi) {
        this.io.setLongField(this, 5, gscannerconfig_field_skip_comment_multi);
        return this;
    }

    @Field(6)
    public long gscannerconfig_field_skip_comment_single() {
        return this.io.getLongField(this, 6);
    }

    @Field(6)
    public GScannerConfig gscannerconfig_field_skip_comment_single(long gscannerconfig_field_skip_comment_single) {
        this.io.setLongField(this, 6, gscannerconfig_field_skip_comment_single);
        return this;
    }

    @Field(7)
    public long gscannerconfig_field_scan_comment_multi() {
        return this.io.getLongField(this, 7);
    }

    @Field(7)
    public GScannerConfig gscannerconfig_field_scan_comment_multi(long gscannerconfig_field_scan_comment_multi) {
        this.io.setLongField(this, 7, gscannerconfig_field_scan_comment_multi);
        return this;
    }

    @Field(8)
    public long gscannerconfig_field_scan_identifier() {
        return this.io.getLongField(this, 8);
    }

    @Field(8)
    public GScannerConfig gscannerconfig_field_scan_identifier(long gscannerconfig_field_scan_identifier) {
        this.io.setLongField(this, 8, gscannerconfig_field_scan_identifier);
        return this;
    }

    @Field(9)
    public long gscannerconfig_field_scan_identifier_1char() {
        return this.io.getLongField(this, 9);
    }

    @Field(9)
    public GScannerConfig gscannerconfig_field_scan_identifier_1char(long gscannerconfig_field_scan_identifier_1char) {
        this.io.setLongField(this, 9, gscannerconfig_field_scan_identifier_1char);
        return this;
    }

    @Field(10)
    public long gscannerconfig_field_scan_identifier_NULL() {
        return this.io.getLongField(this, 10);
    }

    @Field(10)
    public GScannerConfig gscannerconfig_field_scan_identifier_NULL(long gscannerconfig_field_scan_identifier_NULL) {
        this.io.setLongField(this, 10, gscannerconfig_field_scan_identifier_NULL);
        return this;
    }

    @Field(11)
    public long gscannerconfig_field_scan_symbols() {
        return this.io.getLongField(this, 11);
    }

    @Field(11)
    public GScannerConfig gscannerconfig_field_scan_symbols(long gscannerconfig_field_scan_symbols) {
        this.io.setLongField(this, 11, gscannerconfig_field_scan_symbols);
        return this;
    }

    @Field(12)
    public long gscannerconfig_field_scan_binary() {
        return this.io.getLongField(this, 12);
    }

    @Field(12)
    public GScannerConfig gscannerconfig_field_scan_binary(long gscannerconfig_field_scan_binary) {
        this.io.setLongField(this, 12, gscannerconfig_field_scan_binary);
        return this;
    }

    @Field(13)
    public long gscannerconfig_field_scan_octal() {
        return this.io.getLongField(this, 13);
    }

    @Field(13)
    public GScannerConfig gscannerconfig_field_scan_octal(long gscannerconfig_field_scan_octal) {
        this.io.setLongField(this, 13, gscannerconfig_field_scan_octal);
        return this;
    }

    @Field(14)
    public long gscannerconfig_field_scan_float() {
        return this.io.getLongField(this, 14);
    }

    @Field(14)
    public GScannerConfig gscannerconfig_field_scan_float(long gscannerconfig_field_scan_float) {
        this.io.setLongField(this, 14, gscannerconfig_field_scan_float);
        return this;
    }

    @Field(15)
    public long gscannerconfig_field_scan_hex() {
        return this.io.getLongField(this, 15);
    }

    @Field(15)
    public GScannerConfig gscannerconfig_field_scan_hex(long gscannerconfig_field_scan_hex) {
        this.io.setLongField(this, 15, gscannerconfig_field_scan_hex);
        return this;
    }

    @Field(16)
    public long gscannerconfig_field_scan_hex_dollar() {
        return this.io.getLongField(this, 16);
    }

    @Field(16)
    public GScannerConfig gscannerconfig_field_scan_hex_dollar(long gscannerconfig_field_scan_hex_dollar) {
        this.io.setLongField(this, 16, gscannerconfig_field_scan_hex_dollar);
        return this;
    }

    @Field(17)
    public long gscannerconfig_field_scan_string_sq() {
        return this.io.getLongField(this, 17);
    }

    @Field(17)
    public GScannerConfig gscannerconfig_field_scan_string_sq(long gscannerconfig_field_scan_string_sq) {
        this.io.setLongField(this, 17, gscannerconfig_field_scan_string_sq);
        return this;
    }

    @Field(18)
    public long gscannerconfig_field_scan_string_dq() {
        return this.io.getLongField(this, 18);
    }

    @Field(18)
    public GScannerConfig gscannerconfig_field_scan_string_dq(long gscannerconfig_field_scan_string_dq) {
        this.io.setLongField(this, 18, gscannerconfig_field_scan_string_dq);
        return this;
    }

    @Field(19)
    public long gscannerconfig_field_numbers_2_int() {
        return this.io.getLongField(this, 19);
    }

    @Field(19)
    public GScannerConfig gscannerconfig_field_numbers_2_int(long gscannerconfig_field_numbers_2_int) {
        this.io.setLongField(this, 19, gscannerconfig_field_numbers_2_int);
        return this;
    }

    @Field(20)
    public long gscannerconfig_field_int_2_float() {
        return this.io.getLongField(this, 20);
    }

    @Field(20)
    public GScannerConfig gscannerconfig_field_int_2_float(long gscannerconfig_field_int_2_float) {
        this.io.setLongField(this, 20, gscannerconfig_field_int_2_float);
        return this;
    }

    @Field(21)
    public long gscannerconfig_field_identifier_2_string() {
        return this.io.getLongField(this, 21);
    }

    @Field(21)
    public GScannerConfig gscannerconfig_field_identifier_2_string(long gscannerconfig_field_identifier_2_string) {
        this.io.setLongField(this, 21, gscannerconfig_field_identifier_2_string);
        return this;
    }

    @Field(22)
    public long gscannerconfig_field_char_2_token() {
        return this.io.getLongField(this, 22);
    }

    @Field(22)
    public GScannerConfig gscannerconfig_field_char_2_token(long gscannerconfig_field_char_2_token) {
        this.io.setLongField(this, 22, gscannerconfig_field_char_2_token);
        return this;
    }

    @Field(23)
    public long gscannerconfig_field_symbol_2_token() {
        return this.io.getLongField(this, 23);
    }

    @Field(23)
    public GScannerConfig gscannerconfig_field_symbol_2_token(long gscannerconfig_field_symbol_2_token) {
        this.io.setLongField(this, 23, gscannerconfig_field_symbol_2_token);
        return this;
    }

    @Field(24)
    public long gscannerconfig_field_scope_0_fallback() {
        return this.io.getLongField(this, 24);
    }

    @Field(24)
    public GScannerConfig gscannerconfig_field_scope_0_fallback(long gscannerconfig_field_scope_0_fallback) {
        this.io.setLongField(this, 24, gscannerconfig_field_scope_0_fallback);
        return this;
    }

    @Field(25)
    public long gscannerconfig_field_store_int64() {
        return this.io.getLongField(this, 25);
    }

    @Field(25)
    public GScannerConfig gscannerconfig_field_store_int64(long gscannerconfig_field_store_int64) {
        this.io.setLongField(this, 25, gscannerconfig_field_store_int64);
        return this;
    }

    @Field(26)
    private long gscannerconfig_field_padding_dummy() {
        return this.io.getLongField(this, 26);
    }

    @Field(26)
    private GScannerConfig gscannerconfig_field_padding_dummy(long gscannerconfig_field_padding_dummy) {
        this.io.setLongField(this, 26, gscannerconfig_field_padding_dummy);
        return this;
    }

}
