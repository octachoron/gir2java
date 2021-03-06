
package generated.gio20.gio;

import generated.gobject20.gobject.GObjectClass;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GUnixFDListClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GUnixFDListClass() {
        super();
    }

    public GUnixFDListClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GObjectClass gunixfdlistclass_field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GUnixFDListClass gunixfdlistclass_field_parent_class(GObjectClass gunixfdlistclass_field_parent_class) {
        this.io.setNativeObjectField(this, 0, gunixfdlistclass_field_parent_class);
        return this;
    }

}
