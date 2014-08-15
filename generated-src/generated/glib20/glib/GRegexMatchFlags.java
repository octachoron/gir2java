
package generated.glib20.glib;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GRegexMatchFlags
    implements IntValuedEnum<GRegexMatchFlags>
{

    _REGEX_MATCH_FLAGS_ANCHORED(16L),
    _REGEX_MATCH_FLAGS_NOTBOL(128L),
    _REGEX_MATCH_FLAGS_NOTEOL(256L),
    _REGEX_MATCH_FLAGS_NOTEMPTY(1024L),
    _REGEX_MATCH_FLAGS_PARTIAL(32768L),
    _REGEX_MATCH_FLAGS_NEWLINE_CR(1048576L),
    _REGEX_MATCH_FLAGS_NEWLINE_LF(2097152L),
    _REGEX_MATCH_FLAGS_NEWLINE_CRLF(3145728L),
    _REGEX_MATCH_FLAGS_NEWLINE_ANY(4194304L),
    _REGEX_MATCH_FLAGS_NEWLINE_ANYCRLF(5242880L),
    _REGEX_MATCH_FLAGS_BSR_ANYCRLF(8388608L),
    _REGEX_MATCH_FLAGS_BSR_ANY(16777216L),
    _REGEX_MATCH_FLAGS_PARTIAL_SOFT(32768L),
    _REGEX_MATCH_FLAGS_PARTIAL_HARD(134217728L),
    _REGEX_MATCH_FLAGS_NOTEMPTY_ATSTART(268435456L);
    public final long value;

    GRegexMatchFlags(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GRegexMatchFlags> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GRegexMatchFlags> fromValue(int value) {
        return FlagSet.fromValue(value, GRegexMatchFlags.values());
    }

}
