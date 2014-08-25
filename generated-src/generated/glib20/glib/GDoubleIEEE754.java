
package generated.glib20.glib;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Union;

@Union
@Library("glib-2.0")
public class GDoubleIEEE754
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GDoubleIEEE754() {
        super();
    }

    public GDoubleIEEE754(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public double gdoubleieee754_field_v_double() {
        return this.io.getDoubleField(this, 0);
    }

    @Field(0)
    public GDoubleIEEE754 gdoubleieee754_field_v_double(double gdoubleieee754_field_v_double) {
        this.io.setDoubleField(this, 0, gdoubleieee754_field_v_double);
        return this;
    }

}
