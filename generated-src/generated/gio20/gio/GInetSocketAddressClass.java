
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GInetSocketAddressClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GInetSocketAddressClass() {
        super();
    }

    public GInetSocketAddressClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GSocketAddressClass ginetsocketaddressclass_field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GInetSocketAddressClass ginetsocketaddressclass_field_parent_class(GSocketAddressClass ginetsocketaddressclass_field_parent_class) {
        this.io.setNativeObjectField(this, 0, ginetsocketaddressclass_field_parent_class);
        return this;
    }

}
