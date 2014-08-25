
package generated.gobject20.gobject;

import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gobject-2.0")
public class GTypeFundamentalInfo
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GTypeFundamentalInfo() {
        super();
    }

    public GTypeFundamentalInfo(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public IntValuedEnum<GTypeFundamentalFlags> gtypefundamentalinfo_field_type_flags() {
        return this.io.getEnumField(this, 0);
    }

    @Field(0)
    public GTypeFundamentalInfo gtypefundamentalinfo_field_type_flags(IntValuedEnum<GTypeFundamentalFlags> gtypefundamentalinfo_field_type_flags) {
        this.io.setEnumField(this, 0, gtypefundamentalinfo_field_type_flags);
        return this;
    }

}
