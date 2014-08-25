
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GFileInputStreamClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GFileInputStreamClass() {
        super();
    }

    public GFileInputStreamClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GInputStreamClass gfileinputstreamclass_field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GFileInputStreamClass gfileinputstreamclass_field_parent_class(GInputStreamClass gfileinputstreamclass_field_parent_class) {
        this.io.setNativeObjectField(this, 0, gfileinputstreamclass_field_parent_class);
        return this;
    }

}
