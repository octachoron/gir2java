
package generated.gobject20.gobject;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gobject-2.0")
public class GParameter
    extends StructObject
{


    public GParameter() {
        super();
    }

    public GParameter(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer field_name() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GParameter field_name(Pointer field_name) {
        this.io.setPointerField(this, 0, field_name);
        return this;
    }

    @Field(1)
    public GValue field_value() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GParameter field_value(GValue field_value) {
        this.io.setNativeObjectField(this, 1, field_value);
        return this;
    }

}
