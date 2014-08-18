
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GUnixFDMessageClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GUnixFDMessageClass() {
        super();
    }

    public GUnixFDMessageClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GSocketControlMessageClass field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GUnixFDMessageClass field_parent_class(GSocketControlMessageClass field_parent_class) {
        this.io.setNativeObjectField(this, 0, field_parent_class);
        return this;
    }

}
