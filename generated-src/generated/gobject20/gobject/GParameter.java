
package generated.gobject20.gobject;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gobject-2.0")
public class GParameter
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GParameter() {
        super();
    }

    public GParameter(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer gparameter_field_name() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GParameter gparameter_field_name(Pointer gparameter_field_name) {
        this.io.setPointerField(this, 0, gparameter_field_name);
        return this;
    }

    @Field(1)
    public GValue gparameter_field_value() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GParameter gparameter_field_value(GValue gparameter_field_value) {
        this.io.setNativeObjectField(this, 1, gparameter_field_value);
        return this;
    }

}
