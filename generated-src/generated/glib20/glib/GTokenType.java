
package generated.glib20.glib;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GTokenType
    implements IntValuedEnum<GTokenType>
{

    _TOKEN_TYPE_EOF(0L),
    _TOKEN_TYPE_LEFT_PAREN(40L),
    _TOKEN_TYPE_RIGHT_PAREN(41L),
    _TOKEN_TYPE_LEFT_CURLY(123L),
    _TOKEN_TYPE_RIGHT_CURLY(125L),
    _TOKEN_TYPE_LEFT_BRACE(91L),
    _TOKEN_TYPE_RIGHT_BRACE(93L),
    _TOKEN_TYPE_EQUAL_SIGN(61L),
    _TOKEN_TYPE_COMMA(44L),
    _TOKEN_TYPE_NONE(256L),
    _TOKEN_TYPE_ERROR(257L),
    _TOKEN_TYPE_CHAR(258L),
    _TOKEN_TYPE_BINARY(259L),
    _TOKEN_TYPE_OCTAL(260L),
    _TOKEN_TYPE_INT(261L),
    _TOKEN_TYPE_HEX(262L),
    _TOKEN_TYPE_FLOAT(263L),
    _TOKEN_TYPE_STRING(264L),
    _TOKEN_TYPE_SYMBOL(265L),
    _TOKEN_TYPE_IDENTIFIER(266L),
    _TOKEN_TYPE_IDENTIFIER_NULL(267L),
    _TOKEN_TYPE_COMMENT_SINGLE(268L),
    _TOKEN_TYPE_COMMENT_MULTI(269L);
    public final long value;

    GTokenType(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GTokenType> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GTokenType> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
