
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GDataOutputStreamClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GDataOutputStreamClass() {
        super();
    }

    public GDataOutputStreamClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GFilterOutputStreamClass field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GDataOutputStreamClass field_parent_class(GFilterOutputStreamClass field_parent_class) {
        this.io.setNativeObjectField(this, 0, field_parent_class);
        return this;
    }

}
