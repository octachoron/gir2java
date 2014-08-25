
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GUnixCredentialsMessageClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GUnixCredentialsMessageClass() {
        super();
    }

    public GUnixCredentialsMessageClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GSocketControlMessageClass gunixcredentialsmessageclass_field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GUnixCredentialsMessageClass gunixcredentialsmessageclass_field_parent_class(GSocketControlMessageClass gunixcredentialsmessageclass_field_parent_class) {
        this.io.setNativeObjectField(this, 0, gunixcredentialsmessageclass_field_parent_class);
        return this;
    }

}
