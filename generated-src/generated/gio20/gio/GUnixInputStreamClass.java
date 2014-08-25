
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GUnixInputStreamClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GUnixInputStreamClass() {
        super();
    }

    public GUnixInputStreamClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GInputStreamClass gunixinputstreamclass_field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GUnixInputStreamClass gunixinputstreamclass_field_parent_class(GInputStreamClass gunixinputstreamclass_field_parent_class) {
        this.io.setNativeObjectField(this, 0, gunixinputstreamclass_field_parent_class);
        return this;
    }

}
