
package generated.glib20.glib;

import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GRegex
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GRegex() {
        super();
    }

    public GRegex(Pointer pointer) {
        super(pointer);
    }

    protected native int g_regex_get_capture_count(
        @Ptr
        long regex);

    public int get_capture_count() {
        return this.g_regex_get_capture_count(Pointer.pointerTo(this, GRegex.class).getPeer());
    }

    protected native boolean g_regex_get_has_cr_or_lf(
        @Ptr
        long regex);

    public boolean get_has_cr_or_lf() {
        return this.g_regex_get_has_cr_or_lf(Pointer.pointerTo(this, GRegex.class).getPeer());
    }

    protected native int g_regex_get_max_backref(
        @Ptr
        long regex);

    public int get_max_backref() {
        return this.g_regex_get_max_backref(Pointer.pointerTo(this, GRegex.class).getPeer());
    }

    protected native int g_regex_get_max_lookbehind(
        @Ptr
        long regex);

    public int get_max_lookbehind() {
        return this.g_regex_get_max_lookbehind(Pointer.pointerTo(this, GRegex.class).getPeer());
    }

    @Ptr
    protected native long g_regex_get_pattern(
        @Ptr
        long regex);

    public Pointer get_pattern() {
        return Pointer.pointerToAddress(this.g_regex_get_pattern(Pointer.pointerTo(this, GRegex.class).getPeer()));
    }

    protected native int g_regex_get_string_number(
        @Ptr
        long regex,
        @Ptr
        long name);

    public int get_string_number(Pointer name) {
        return this.g_regex_get_string_number(Pointer.pointerTo(this, GRegex.class).getPeer(), Pointer.getPeer(name));
    }

    @Ptr
    protected native long g_regex_ref(
        @Ptr
        long regex);

    public Pointer ref() {
        return Pointer.pointerToAddress(this.g_regex_ref(Pointer.pointerTo(this, GRegex.class).getPeer()));
    }

    protected native void g_regex_unref(
        @Ptr
        long regex);

    public void unref() {
        this.g_regex_unref(Pointer.pointerTo(this, GRegex.class).getPeer());
    }

    protected static native boolean g_regex_check_replacement(
        @Ptr
        long replacement,
        @Ptr
        long has_references);

    public static boolean check_replacement(Pointer replacement, Pointer<Boolean> has_references) {
        return GRegex.g_regex_check_replacement(Pointer.getPeer(replacement), Pointer.getPeer(has_references));
    }

    public static native long g_regex_error_quark();

    @Ptr
    protected static native long g_regex_escape_nul(
        @Ptr
        long string, int length);

    public static Pointer escape_nul(Pointer string, int length) {
        return Pointer.pointerToAddress(GRegex.g_regex_escape_nul(Pointer.getPeer(string), length));
    }

    @Ptr
    protected static native long g_regex_escape_string(
        @Ptr
        long string, int length);

    public static Pointer escape_string(Pointer string, int length) {
        return Pointer.pointerToAddress(GRegex.g_regex_escape_string(Pointer.getPeer(string), length));
    }

    protected native boolean g_regex_match_all(
        @Ptr
        long regex,
        @Ptr
        long string, IntValuedEnum<GRegexMatchFlags> match_options,
        @Ptr
        long match_info);

    public boolean match_all(Pointer string, IntValuedEnum<GRegexMatchFlags> match_options, Pointer<Pointer<GMatchInfo>> match_info) {
        return this.g_regex_match_all(Pointer.pointerTo(this, GRegex.class).getPeer(), Pointer.getPeer(string), match_options, Pointer.getPeer(match_info));
    }

    @Ptr
    protected static native long g_regex_split_simple(
        @Ptr
        long pattern,
        @Ptr
        long string, IntValuedEnum<GRegexCompileFlags> compile_options, IntValuedEnum<GRegexMatchFlags> match_options);

    public static Pointer split_simple(Pointer pattern, Pointer string, IntValuedEnum<GRegexCompileFlags> compile_options, IntValuedEnum<GRegexMatchFlags> match_options) {
        return Pointer.pointerToAddress(GRegex.g_regex_split_simple(Pointer.getPeer(pattern), Pointer.getPeer(string), compile_options, match_options));
    }

    @Ptr
    protected native long g_regex_replace_literal(
        @Ptr
        long regex,
        @Ptr
        long string, long string_len, int start_position,
        @Ptr
        long replacement, IntValuedEnum<GRegexMatchFlags> match_options);

    public Pointer replace_literal(Pointer string, long string_len, int start_position, Pointer replacement, IntValuedEnum<GRegexMatchFlags> match_options) {
        return Pointer.pointerToAddress(this.g_regex_replace_literal(Pointer.pointerTo(this, GRegex.class).getPeer(), Pointer.getPeer(string), string_len, start_position, Pointer.getPeer(replacement), match_options));
    }

    protected native IntValuedEnum<GRegexMatchFlags> g_regex_get_match_flags(
        @Ptr
        long regex);

    public IntValuedEnum<GRegexMatchFlags> get_match_flags() {
        return this.g_regex_get_match_flags(Pointer.pointerTo(this, GRegex.class).getPeer());
    }

    protected native IntValuedEnum<GRegexCompileFlags> g_regex_get_compile_flags(
        @Ptr
        long regex);

    public IntValuedEnum<GRegexCompileFlags> get_compile_flags() {
        return this.g_regex_get_compile_flags(Pointer.pointerTo(this, GRegex.class).getPeer());
    }

    protected native boolean g_regex_match_full(
        @Ptr
        long regex,
        @Ptr
        long string, long string_len, int start_position, IntValuedEnum<GRegexMatchFlags> match_options,
        @Ptr
        long match_info);

    public boolean match_full(Pointer string, long string_len, int start_position, IntValuedEnum<GRegexMatchFlags> match_options, Pointer<Pointer<GMatchInfo>> match_info) {
        return this.g_regex_match_full(Pointer.pointerTo(this, GRegex.class).getPeer(), Pointer.getPeer(string), string_len, start_position, match_options, Pointer.getPeer(match_info));
    }

    protected native boolean g_regex_match(
        @Ptr
        long regex,
        @Ptr
        long string, IntValuedEnum<GRegexMatchFlags> match_options,
        @Ptr
        long match_info);

    public boolean match(Pointer string, IntValuedEnum<GRegexMatchFlags> match_options, Pointer<Pointer<GMatchInfo>> match_info) {
        return this.g_regex_match(Pointer.pointerTo(this, GRegex.class).getPeer(), Pointer.getPeer(string), match_options, Pointer.getPeer(match_info));
    }

    protected native boolean g_regex_match_all_full(
        @Ptr
        long regex,
        @Ptr
        long string, long string_len, int start_position, IntValuedEnum<GRegexMatchFlags> match_options,
        @Ptr
        long match_info);

    public boolean match_all_full(Pointer string, long string_len, int start_position, IntValuedEnum<GRegexMatchFlags> match_options, Pointer<Pointer<GMatchInfo>> match_info) {
        return this.g_regex_match_all_full(Pointer.pointerTo(this, GRegex.class).getPeer(), Pointer.getPeer(string), string_len, start_position, match_options, Pointer.getPeer(match_info));
    }

    protected static native boolean g_regex_match_simple(
        @Ptr
        long pattern,
        @Ptr
        long string, IntValuedEnum<GRegexCompileFlags> compile_options, IntValuedEnum<GRegexMatchFlags> match_options);

    public static boolean match_simple(Pointer pattern, Pointer string, IntValuedEnum<GRegexCompileFlags> compile_options, IntValuedEnum<GRegexMatchFlags> match_options) {
        return GRegex.g_regex_match_simple(Pointer.getPeer(pattern), Pointer.getPeer(string), compile_options, match_options);
    }

    @Ptr
    protected static native long g_regex_new(
        @Ptr
        long pattern, IntValuedEnum<GRegexCompileFlags> compile_options, IntValuedEnum<GRegexMatchFlags> match_options);

    public static Pointer<GRegex> _new(Pointer pattern, IntValuedEnum<GRegexCompileFlags> compile_options, IntValuedEnum<GRegexMatchFlags> match_options) {
        return Pointer.pointerToAddress(GRegex.g_regex_new(Pointer.getPeer(pattern), compile_options, match_options), GRegex.class);
    }

    @Ptr
    protected native long g_regex_replace_eval(
        @Ptr
        long regex,
        @Ptr
        long string, long string_len, int start_position, IntValuedEnum<GRegexMatchFlags> match_options,
        @Ptr
        long eval,
        @Ptr
        long user_data);

    public Pointer replace_eval(Pointer string, long string_len, int start_position, IntValuedEnum<GRegexMatchFlags> match_options, Pointer eval, Pointer user_data) {
        return Pointer.pointerToAddress(this.g_regex_replace_eval(Pointer.pointerTo(this, GRegex.class).getPeer(), Pointer.getPeer(string), string_len, start_position, match_options, Pointer.getPeer(eval), Pointer.getPeer(user_data)));
    }

    @Ptr
    protected native long g_regex_split_full(
        @Ptr
        long regex,
        @Ptr
        long string, long string_len, int start_position, IntValuedEnum<GRegexMatchFlags> match_options, int max_tokens);

    public Pointer split_full(Pointer string, long string_len, int start_position, IntValuedEnum<GRegexMatchFlags> match_options, int max_tokens) {
        return Pointer.pointerToAddress(this.g_regex_split_full(Pointer.pointerTo(this, GRegex.class).getPeer(), Pointer.getPeer(string), string_len, start_position, match_options, max_tokens));
    }

    @Ptr
    protected native long g_regex_replace(
        @Ptr
        long regex,
        @Ptr
        long string, long string_len, int start_position,
        @Ptr
        long replacement, IntValuedEnum<GRegexMatchFlags> match_options);

    public Pointer replace(Pointer string, long string_len, int start_position, Pointer replacement, IntValuedEnum<GRegexMatchFlags> match_options) {
        return Pointer.pointerToAddress(this.g_regex_replace(Pointer.pointerTo(this, GRegex.class).getPeer(), Pointer.getPeer(string), string_len, start_position, Pointer.getPeer(replacement), match_options));
    }

    @Ptr
    protected native long g_regex_split(
        @Ptr
        long regex,
        @Ptr
        long string, IntValuedEnum<GRegexMatchFlags> match_options);

    public Pointer split(Pointer string, IntValuedEnum<GRegexMatchFlags> match_options) {
        return Pointer.pointerToAddress(this.g_regex_split(Pointer.pointerTo(this, GRegex.class).getPeer(), Pointer.getPeer(string), match_options));
    }

}
