
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GThreadedSocketServiceClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GThreadedSocketServiceClass() {
        super();
    }

    public GThreadedSocketServiceClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GSocketServiceClass gthreadedsocketserviceclass_field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GThreadedSocketServiceClass gthreadedsocketserviceclass_field_parent_class(GSocketServiceClass gthreadedsocketserviceclass_field_parent_class) {
        this.io.setNativeObjectField(this, 0, gthreadedsocketserviceclass_field_parent_class);
        return this;
    }

}
