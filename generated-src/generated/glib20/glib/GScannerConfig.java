
package generated.glib20.glib;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("glib-2.0")
public class GScannerConfig
    extends StructObject
{


    public GScannerConfig() {
        super();
    }

    public GScannerConfig(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer field_cset_skip_characters() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GScannerConfig field_cset_skip_characters(Pointer field_cset_skip_characters) {
        this.io.setPointerField(this, 0, field_cset_skip_characters);
        return this;
    }

    @Field(1)
    public Pointer field_cset_identifier_first() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GScannerConfig field_cset_identifier_first(Pointer field_cset_identifier_first) {
        this.io.setPointerField(this, 1, field_cset_identifier_first);
        return this;
    }

    @Field(2)
    public Pointer field_cset_identifier_nth() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GScannerConfig field_cset_identifier_nth(Pointer field_cset_identifier_nth) {
        this.io.setPointerField(this, 2, field_cset_identifier_nth);
        return this;
    }

    @Field(3)
    public Pointer field_cpair_comment_single() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public GScannerConfig field_cpair_comment_single(Pointer field_cpair_comment_single) {
        this.io.setPointerField(this, 3, field_cpair_comment_single);
        return this;
    }

    @Field(4)
    public long field_case_sensitive() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    public GScannerConfig field_case_sensitive(long field_case_sensitive) {
        this.io.setNativeObjectField(this, 4, field_case_sensitive);
        return this;
    }

    @Field(5)
    public long field_skip_comment_multi() {
        return this.io.getNativeObjectField(this, 5);
    }

    @Field(5)
    public GScannerConfig field_skip_comment_multi(long field_skip_comment_multi) {
        this.io.setNativeObjectField(this, 5, field_skip_comment_multi);
        return this;
    }

    @Field(6)
    public long field_skip_comment_single() {
        return this.io.getNativeObjectField(this, 6);
    }

    @Field(6)
    public GScannerConfig field_skip_comment_single(long field_skip_comment_single) {
        this.io.setNativeObjectField(this, 6, field_skip_comment_single);
        return this;
    }

    @Field(7)
    public long field_scan_comment_multi() {
        return this.io.getNativeObjectField(this, 7);
    }

    @Field(7)
    public GScannerConfig field_scan_comment_multi(long field_scan_comment_multi) {
        this.io.setNativeObjectField(this, 7, field_scan_comment_multi);
        return this;
    }

    @Field(8)
    public long field_scan_identifier() {
        return this.io.getNativeObjectField(this, 8);
    }

    @Field(8)
    public GScannerConfig field_scan_identifier(long field_scan_identifier) {
        this.io.setNativeObjectField(this, 8, field_scan_identifier);
        return this;
    }

    @Field(9)
    public long field_scan_identifier_1char() {
        return this.io.getNativeObjectField(this, 9);
    }

    @Field(9)
    public GScannerConfig field_scan_identifier_1char(long field_scan_identifier_1char) {
        this.io.setNativeObjectField(this, 9, field_scan_identifier_1char);
        return this;
    }

    @Field(10)
    public long field_scan_identifier_NULL() {
        return this.io.getNativeObjectField(this, 10);
    }

    @Field(10)
    public GScannerConfig field_scan_identifier_NULL(long field_scan_identifier_NULL) {
        this.io.setNativeObjectField(this, 10, field_scan_identifier_NULL);
        return this;
    }

    @Field(11)
    public long field_scan_symbols() {
        return this.io.getNativeObjectField(this, 11);
    }

    @Field(11)
    public GScannerConfig field_scan_symbols(long field_scan_symbols) {
        this.io.setNativeObjectField(this, 11, field_scan_symbols);
        return this;
    }

    @Field(12)
    public long field_scan_binary() {
        return this.io.getNativeObjectField(this, 12);
    }

    @Field(12)
    public GScannerConfig field_scan_binary(long field_scan_binary) {
        this.io.setNativeObjectField(this, 12, field_scan_binary);
        return this;
    }

    @Field(13)
    public long field_scan_octal() {
        return this.io.getNativeObjectField(this, 13);
    }

    @Field(13)
    public GScannerConfig field_scan_octal(long field_scan_octal) {
        this.io.setNativeObjectField(this, 13, field_scan_octal);
        return this;
    }

    @Field(14)
    public long field_scan_float() {
        return this.io.getNativeObjectField(this, 14);
    }

    @Field(14)
    public GScannerConfig field_scan_float(long field_scan_float) {
        this.io.setNativeObjectField(this, 14, field_scan_float);
        return this;
    }

    @Field(15)
    public long field_scan_hex() {
        return this.io.getNativeObjectField(this, 15);
    }

    @Field(15)
    public GScannerConfig field_scan_hex(long field_scan_hex) {
        this.io.setNativeObjectField(this, 15, field_scan_hex);
        return this;
    }

    @Field(16)
    public long field_scan_hex_dollar() {
        return this.io.getNativeObjectField(this, 16);
    }

    @Field(16)
    public GScannerConfig field_scan_hex_dollar(long field_scan_hex_dollar) {
        this.io.setNativeObjectField(this, 16, field_scan_hex_dollar);
        return this;
    }

    @Field(17)
    public long field_scan_string_sq() {
        return this.io.getNativeObjectField(this, 17);
    }

    @Field(17)
    public GScannerConfig field_scan_string_sq(long field_scan_string_sq) {
        this.io.setNativeObjectField(this, 17, field_scan_string_sq);
        return this;
    }

    @Field(18)
    public long field_scan_string_dq() {
        return this.io.getNativeObjectField(this, 18);
    }

    @Field(18)
    public GScannerConfig field_scan_string_dq(long field_scan_string_dq) {
        this.io.setNativeObjectField(this, 18, field_scan_string_dq);
        return this;
    }

    @Field(19)
    public long field_numbers_2_int() {
        return this.io.getNativeObjectField(this, 19);
    }

    @Field(19)
    public GScannerConfig field_numbers_2_int(long field_numbers_2_int) {
        this.io.setNativeObjectField(this, 19, field_numbers_2_int);
        return this;
    }

    @Field(20)
    public long field_int_2_float() {
        return this.io.getNativeObjectField(this, 20);
    }

    @Field(20)
    public GScannerConfig field_int_2_float(long field_int_2_float) {
        this.io.setNativeObjectField(this, 20, field_int_2_float);
        return this;
    }

    @Field(21)
    public long field_identifier_2_string() {
        return this.io.getNativeObjectField(this, 21);
    }

    @Field(21)
    public GScannerConfig field_identifier_2_string(long field_identifier_2_string) {
        this.io.setNativeObjectField(this, 21, field_identifier_2_string);
        return this;
    }

    @Field(22)
    public long field_char_2_token() {
        return this.io.getNativeObjectField(this, 22);
    }

    @Field(22)
    public GScannerConfig field_char_2_token(long field_char_2_token) {
        this.io.setNativeObjectField(this, 22, field_char_2_token);
        return this;
    }

    @Field(23)
    public long field_symbol_2_token() {
        return this.io.getNativeObjectField(this, 23);
    }

    @Field(23)
    public GScannerConfig field_symbol_2_token(long field_symbol_2_token) {
        this.io.setNativeObjectField(this, 23, field_symbol_2_token);
        return this;
    }

    @Field(24)
    public long field_scope_0_fallback() {
        return this.io.getNativeObjectField(this, 24);
    }

    @Field(24)
    public GScannerConfig field_scope_0_fallback(long field_scope_0_fallback) {
        this.io.setNativeObjectField(this, 24, field_scope_0_fallback);
        return this;
    }

    @Field(25)
    public long field_store_int64() {
        return this.io.getNativeObjectField(this, 25);
    }

    @Field(25)
    public GScannerConfig field_store_int64(long field_store_int64) {
        this.io.setNativeObjectField(this, 25, field_store_int64);
        return this;
    }

    @Field(26)
    public long field_padding_dummy() {
        return this.io.getNativeObjectField(this, 26);
    }

    @Field(26)
    public GScannerConfig field_padding_dummy(long field_padding_dummy) {
        this.io.setNativeObjectField(this, 26, field_padding_dummy);
        return this;
    }

}
