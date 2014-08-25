
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GFileOutputStreamClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GFileOutputStreamClass() {
        super();
    }

    public GFileOutputStreamClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GOutputStreamClass gfileoutputstreamclass_field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GFileOutputStreamClass gfileoutputstreamclass_field_parent_class(GOutputStreamClass gfileoutputstreamclass_field_parent_class) {
        this.io.setNativeObjectField(this, 0, gfileoutputstreamclass_field_parent_class);
        return this;
    }

}
