
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GSocketServiceClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GSocketServiceClass() {
        super();
    }

    public GSocketServiceClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GSocketListenerClass gsocketserviceclass_field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GSocketServiceClass gsocketserviceclass_field_parent_class(GSocketListenerClass gsocketserviceclass_field_parent_class) {
        this.io.setNativeObjectField(this, 0, gsocketserviceclass_field_parent_class);
        return this;
    }

}
