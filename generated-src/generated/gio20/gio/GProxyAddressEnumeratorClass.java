
package generated.gio20.gio;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GProxyAddressEnumeratorClass
    extends StructObject
{


    public GProxyAddressEnumeratorClass() {
        super();
    }

    public GProxyAddressEnumeratorClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GSocketAddressEnumeratorClass field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GProxyAddressEnumeratorClass field_parent_class(GSocketAddressEnumeratorClass field_parent_class) {
        this.io.setNativeObjectField(this, 0, field_parent_class);
        return this;
    }

}
