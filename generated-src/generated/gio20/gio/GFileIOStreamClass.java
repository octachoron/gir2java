
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GFileIOStreamClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GFileIOStreamClass() {
        super();
    }

    public GFileIOStreamClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GIOStreamClass gfileiostreamclass_field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GFileIOStreamClass gfileiostreamclass_field_parent_class(GIOStreamClass gfileiostreamclass_field_parent_class) {
        this.io.setNativeObjectField(this, 0, gfileiostreamclass_field_parent_class);
        return this;
    }

}
