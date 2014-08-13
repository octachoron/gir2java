
package generated.gobject20.gobject;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gobject-2.0")
public class GTypeFundamentalInfo
    extends StructObject
{


    public GTypeFundamentalInfo() {
        super();
    }

    public GTypeFundamentalInfo(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Object field_type_flags() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GTypeFundamentalInfo field_type_flags(Object field_type_flags) {
        this.io.setNativeObjectField(this, 0, field_type_flags);
        return this;
    }

}
