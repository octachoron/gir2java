
package generated.gio20.gio;

import generated.gobject20.gobject.GTypeInterface;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GDBusObjectIface
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GDBusObjectIface() {
        super();
    }

    public GDBusObjectIface(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GTypeInterface gdbusobjectiface_field_parent_iface() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GDBusObjectIface gdbusobjectiface_field_parent_iface(GTypeInterface gdbusobjectiface_field_parent_iface) {
        this.io.setNativeObjectField(this, 0, gdbusobjectiface_field_parent_iface);
        return this;
    }

}
