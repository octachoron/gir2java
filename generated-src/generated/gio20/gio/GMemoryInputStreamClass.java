
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GMemoryInputStreamClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GMemoryInputStreamClass() {
        super();
    }

    public GMemoryInputStreamClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GInputStreamClass field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GMemoryInputStreamClass field_parent_class(GInputStreamClass field_parent_class) {
        this.io.setNativeObjectField(this, 0, field_parent_class);
        return this;
    }

}
