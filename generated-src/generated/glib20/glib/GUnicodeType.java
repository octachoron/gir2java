
package generated.glib20.glib;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GUnicodeType
    implements IntValuedEnum<GUnicodeType>
{

    _UNICODE_TYPE_CONTROL(0L),
    _UNICODE_TYPE_FORMAT(1L),
    _UNICODE_TYPE_UNASSIGNED(2L),
    _UNICODE_TYPE_PRIVATE_USE(3L),
    _UNICODE_TYPE_SURROGATE(4L),
    _UNICODE_TYPE_LOWERCASE_LETTER(5L),
    _UNICODE_TYPE_MODIFIER_LETTER(6L),
    _UNICODE_TYPE_OTHER_LETTER(7L),
    _UNICODE_TYPE_TITLECASE_LETTER(8L),
    _UNICODE_TYPE_UPPERCASE_LETTER(9L),
    _UNICODE_TYPE_SPACING_MARK(10L),
    _UNICODE_TYPE_ENCLOSING_MARK(11L),
    _UNICODE_TYPE_NON_SPACING_MARK(12L),
    _UNICODE_TYPE_DECIMAL_NUMBER(13L),
    _UNICODE_TYPE_LETTER_NUMBER(14L),
    _UNICODE_TYPE_OTHER_NUMBER(15L),
    _UNICODE_TYPE_CONNECT_PUNCTUATION(16L),
    _UNICODE_TYPE_DASH_PUNCTUATION(17L),
    _UNICODE_TYPE_CLOSE_PUNCTUATION(18L),
    _UNICODE_TYPE_FINAL_PUNCTUATION(19L),
    _UNICODE_TYPE_INITIAL_PUNCTUATION(20L),
    _UNICODE_TYPE_OTHER_PUNCTUATION(21L),
    _UNICODE_TYPE_OPEN_PUNCTUATION(22L),
    _UNICODE_TYPE_CURRENCY_SYMBOL(23L),
    _UNICODE_TYPE_MODIFIER_SYMBOL(24L),
    _UNICODE_TYPE_MATH_SYMBOL(25L),
    _UNICODE_TYPE_OTHER_SYMBOL(26L),
    _UNICODE_TYPE_LINE_SEPARATOR(27L),
    _UNICODE_TYPE_PARAGRAPH_SEPARATOR(28L),
    _UNICODE_TYPE_SPACE_SEPARATOR(29L);
    public final long value;

    GUnicodeType(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GUnicodeType> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GUnicodeType> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
