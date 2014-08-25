
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GUnixSocketAddressClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GUnixSocketAddressClass() {
        super();
    }

    public GUnixSocketAddressClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GSocketAddressClass gunixsocketaddressclass_field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GUnixSocketAddressClass gunixsocketaddressclass_field_parent_class(GSocketAddressClass gunixsocketaddressclass_field_parent_class) {
        this.io.setNativeObjectField(this, 0, gunixsocketaddressclass_field_parent_class);
        return this;
    }

}
