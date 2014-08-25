
package generated.gio20.gio;

import generated.gobject20.gobject.GObjectClass;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GSocketClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GSocketClass() {
        super();
    }

    public GSocketClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GObjectClass gsocketclass_field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GSocketClass gsocketclass_field_parent_class(GObjectClass gsocketclass_field_parent_class) {
        this.io.setNativeObjectField(this, 0, gsocketclass_field_parent_class);
        return this;
    }

}
