
package generated.glib20.glib;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GRegexCompileFlags
    implements IntValuedEnum<GRegexCompileFlags>
{

    _REGEX_COMPILE_FLAGS_CASELESS(1L),
    _REGEX_COMPILE_FLAGS_MULTILINE(2L),
    _REGEX_COMPILE_FLAGS_DOTALL(4L),
    _REGEX_COMPILE_FLAGS_EXTENDED(8L),
    _REGEX_COMPILE_FLAGS_ANCHORED(16L),
    _REGEX_COMPILE_FLAGS_DOLLAR_ENDONLY(32L),
    _REGEX_COMPILE_FLAGS_UNGREEDY(512L),
    _REGEX_COMPILE_FLAGS_RAW(2048L),
    _REGEX_COMPILE_FLAGS_NO_AUTO_CAPTURE(4096L),
    _REGEX_COMPILE_FLAGS_OPTIMIZE(8192L),
    _REGEX_COMPILE_FLAGS_FIRSTLINE(262144L),
    _REGEX_COMPILE_FLAGS_DUPNAMES(524288L),
    _REGEX_COMPILE_FLAGS_NEWLINE_CR(1048576L),
    _REGEX_COMPILE_FLAGS_NEWLINE_LF(2097152L),
    _REGEX_COMPILE_FLAGS_NEWLINE_CRLF(3145728L),
    _REGEX_COMPILE_FLAGS_NEWLINE_ANYCRLF(5242880L),
    _REGEX_COMPILE_FLAGS_BSR_ANYCRLF(8388608L),
    _REGEX_COMPILE_FLAGS_JAVASCRIPT_COMPAT(33554432L);
    public final long value;

    GRegexCompileFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GRegexCompileFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GRegexCompileFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GRegexCompileFlags.values());
    }

}
