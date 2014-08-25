
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GTcpConnectionClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GTcpConnectionClass() {
        super();
    }

    public GTcpConnectionClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GSocketConnectionClass gtcpconnectionclass_field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GTcpConnectionClass gtcpconnectionclass_field_parent_class(GSocketConnectionClass gtcpconnectionclass_field_parent_class) {
        this.io.setNativeObjectField(this, 0, gtcpconnectionclass_field_parent_class);
        return this;
    }

}
