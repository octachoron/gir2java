
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GUnixConnectionClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GUnixConnectionClass() {
        super();
    }

    public GUnixConnectionClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GSocketConnectionClass gunixconnectionclass_field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GUnixConnectionClass gunixconnectionclass_field_parent_class(GSocketConnectionClass gunixconnectionclass_field_parent_class) {
        this.io.setNativeObjectField(this, 0, gunixconnectionclass_field_parent_class);
        return this;
    }

}
