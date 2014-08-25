
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GProxyAddressEnumeratorClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GProxyAddressEnumeratorClass() {
        super();
    }

    public GProxyAddressEnumeratorClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GSocketAddressEnumeratorClass gproxyaddressenumeratorclass_field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GProxyAddressEnumeratorClass gproxyaddressenumeratorclass_field_parent_class(GSocketAddressEnumeratorClass gproxyaddressenumeratorclass_field_parent_class) {
        this.io.setNativeObjectField(this, 0, gproxyaddressenumeratorclass_field_parent_class);
        return this;
    }

}
