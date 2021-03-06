
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GDataInputStreamClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GDataInputStreamClass() {
        super();
    }

    public GDataInputStreamClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GBufferedInputStreamClass gdatainputstreamclass_field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GDataInputStreamClass gdatainputstreamclass_field_parent_class(GBufferedInputStreamClass gdatainputstreamclass_field_parent_class) {
        this.io.setNativeObjectField(this, 0, gdatainputstreamclass_field_parent_class);
        return this;
    }

}
