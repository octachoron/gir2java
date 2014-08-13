
package generated.glib20.glib;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GVariantParseError
    implements IntValuedEnum<GVariantParseError>
{

    _VARIANT_PARSE_ERROR_FAILED(0L),
    _VARIANT_PARSE_ERROR_BASIC_TYPE_EXPECTED(1L),
    _VARIANT_PARSE_ERROR_CANNOT_INFER_TYPE(2L),
    _VARIANT_PARSE_ERROR_DEFINITE_TYPE_EXPECTED(3L),
    _VARIANT_PARSE_ERROR_INPUT_NOT_AT_END(4L),
    _VARIANT_PARSE_ERROR_INVALID_CHARACTER(5L),
    _VARIANT_PARSE_ERROR_INVALID_FORMAT_STRING(6L),
    _VARIANT_PARSE_ERROR_INVALID_OBJECT_PATH(7L),
    _VARIANT_PARSE_ERROR_INVALID_SIGNATURE(8L),
    _VARIANT_PARSE_ERROR_INVALID_TYPE_STRING(9L),
    _VARIANT_PARSE_ERROR_NO_COMMON_TYPE(10L),
    _VARIANT_PARSE_ERROR_NUMBER_OUT_OF_RANGE(11L),
    _VARIANT_PARSE_ERROR_NUMBER_TOO_BIG(12L),
    _VARIANT_PARSE_ERROR_TYPE_ERROR(13L),
    _VARIANT_PARSE_ERROR_UNEXPECTED_TOKEN(14L),
    _VARIANT_PARSE_ERROR_UNKNOWN_KEYWORD(15L),
    _VARIANT_PARSE_ERROR_UNTERMINATED_STRING_CONSTANT(16L),
    _VARIANT_PARSE_ERROR_VALUE_EXPECTED(17L);
    public final long value;

    GVariantParseError(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GVariantParseError> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GVariantParseError> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
