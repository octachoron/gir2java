
package generated.gio20.gio;

import generated.gobject20.gobject.GObjectClass;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GNetworkServiceClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GNetworkServiceClass() {
        super();
    }

    public GNetworkServiceClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GObjectClass gnetworkserviceclass_field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GNetworkServiceClass gnetworkserviceclass_field_parent_class(GObjectClass gnetworkserviceclass_field_parent_class) {
        this.io.setNativeObjectField(this, 0, gnetworkserviceclass_field_parent_class);
        return this;
    }

}
