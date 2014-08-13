
package generated.gio20.gio;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GUnixSocketAddressClass
    extends StructObject
{


    public GUnixSocketAddressClass() {
        super();
    }

    public GUnixSocketAddressClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GSocketAddressClass field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GUnixSocketAddressClass field_parent_class(GSocketAddressClass field_parent_class) {
        this.io.setNativeObjectField(this, 0, field_parent_class);
        return this;
    }

}
