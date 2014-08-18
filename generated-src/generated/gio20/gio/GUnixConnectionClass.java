
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
    public GSocketConnectionClass field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GUnixConnectionClass field_parent_class(GSocketConnectionClass field_parent_class) {
        this.io.setNativeObjectField(this, 0, field_parent_class);
        return this;
    }

}
