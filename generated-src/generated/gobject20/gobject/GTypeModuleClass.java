
package generated.gobject20.gobject;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gobject-2.0")
public class GTypeModuleClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GTypeModuleClass() {
        super();
    }

    public GTypeModuleClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GObjectClass field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GTypeModuleClass field_parent_class(GObjectClass field_parent_class) {
        this.io.setNativeObjectField(this, 0, field_parent_class);
        return this;
    }

}
