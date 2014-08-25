
package generated.gio20.gio;

import generated.gobject20.gobject.GObjectClass;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GNetworkAddressClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GNetworkAddressClass() {
        super();
    }

    public GNetworkAddressClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GObjectClass gnetworkaddressclass_field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GNetworkAddressClass gnetworkaddressclass_field_parent_class(GObjectClass gnetworkaddressclass_field_parent_class) {
        this.io.setNativeObjectField(this, 0, gnetworkaddressclass_field_parent_class);
        return this;
    }

}
