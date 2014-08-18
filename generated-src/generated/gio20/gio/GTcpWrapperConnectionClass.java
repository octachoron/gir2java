
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GTcpWrapperConnectionClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GTcpWrapperConnectionClass() {
        super();
    }

    public GTcpWrapperConnectionClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GTcpConnectionClass field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GTcpWrapperConnectionClass field_parent_class(GTcpConnectionClass field_parent_class) {
        this.io.setNativeObjectField(this, 0, field_parent_class);
        return this;
    }

}
