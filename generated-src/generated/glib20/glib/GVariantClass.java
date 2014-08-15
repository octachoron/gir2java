
package generated.glib20.glib;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GVariantClass
    implements IntValuedEnum<GVariantClass>
{

    _VARIANT_CLASS_BOOLEAN(98L),
    _VARIANT_CLASS_BYTE(121L),
    _VARIANT_CLASS_INT16(110L),
    _VARIANT_CLASS_UINT16(113L),
    _VARIANT_CLASS_INT32(105L),
    _VARIANT_CLASS_UINT32(117L),
    _VARIANT_CLASS_INT64(120L),
    _VARIANT_CLASS_UINT64(116L),
    _VARIANT_CLASS_HANDLE(104L),
    _VARIANT_CLASS_DOUBLE(100L),
    _VARIANT_CLASS_STRING(115L),
    _VARIANT_CLASS_OBJECT_PATH(111L),
    _VARIANT_CLASS_SIGNATURE(103L),
    _VARIANT_CLASS_VARIANT(118L),
    _VARIANT_CLASS_MAYBE(109L),
    _VARIANT_CLASS_ARRAY(97L),
    _VARIANT_CLASS_TUPLE(40L),
    _VARIANT_CLASS_DICT_ENTRY(123L);
    public final long value;

    GVariantClass(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GVariantClass> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GVariantClass> fromValue(int value) {
        return FlagSet.fromValue(value, GVariantClass.values());
    }

}
