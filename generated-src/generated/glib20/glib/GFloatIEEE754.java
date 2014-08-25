
package generated.glib20.glib;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Union;

@Union
@Library("glib-2.0")
public class GFloatIEEE754
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GFloatIEEE754() {
        super();
    }

    public GFloatIEEE754(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public float gfloatieee754_field_v_float() {
        return this.io.getFloatField(this, 0);
    }

    @Field(0)
    public GFloatIEEE754 gfloatieee754_field_v_float(float gfloatieee754_field_v_float) {
        this.io.setFloatField(this, 0, gfloatieee754_field_v_float);
        return this;
    }

}
