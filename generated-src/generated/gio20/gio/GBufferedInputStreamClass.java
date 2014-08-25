
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GBufferedInputStreamClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GBufferedInputStreamClass() {
        super();
    }

    public GBufferedInputStreamClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GFilterInputStreamClass gbufferedinputstreamclass_field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GBufferedInputStreamClass gbufferedinputstreamclass_field_parent_class(GFilterInputStreamClass gbufferedinputstreamclass_field_parent_class) {
        this.io.setNativeObjectField(this, 0, gbufferedinputstreamclass_field_parent_class);
        return this;
    }

}
